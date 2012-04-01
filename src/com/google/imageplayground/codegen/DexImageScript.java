/* 
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.imageplayground.codegen;

import java.io.File;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import com.google.dexmaker.Code;
import com.google.dexmaker.DexMaker;
import com.google.dexmaker.Local;
import com.google.dexmaker.MethodId;
import com.google.dexmaker.TypeId;
import com.google.imageplayground.util.CameraUtils;

public class DexImageScript {
    
    static enum ScriptType {
        GRAYSCALE(TypeId.INT, "getOutputColorForGrayscaleInput", Arrays.asList("y", "row", "col", "width", "height")),
        COLOR(TypeId.INT, "getOutputColorForColorInput", Arrays.asList("y", "r", "g", "b", "row", "col", "width", "height")),
        MANUAL(TypeId.VOID, "createOutputBitmap", Arrays.asList("width", "height"));
        
        public final TypeId returnType;
        public final String methodName;
        public final List<String> arguments;
        
        private ScriptType(TypeId returnType, String methodName, List<String> arguments) {
            this.returnType = returnType;
            this.methodName = methodName;
            this.arguments = arguments;
        }
    }

    ScriptType scriptType;
	Random random = new Random();
	
	ScriptType getScriptType() {
	    return scriptType;
	}
	void setScriptType(ScriptType value) {
	    scriptType = value;
	}
	
	// one of the following three methods will get created from the user-entered script
	public int getOutputColorForGrayscaleInput(int y, int row, int col, int width, int height) {
		return 0;
	}
	
	public int getOutputColorForColorInput(int y, int r, int g, int b, int row, int col, int width, int height) {
		return 0;
	}
	
	public void createOutputBitmap(int width, int height) {
	    
	}
	
	static String CLASS_NAME = "com/google/imageplayground/codegen/Gen1";
	
	static TypeId generateClass(DexMaker dexMaker) {
		TypeId<?> imageScript = TypeId.get("L" + CLASS_NAME + ";");
		dexMaker.declare(imageScript, "ImageScript.generated", Modifier.PUBLIC, TypeId.get(DexImageScript.class));
		// empty constructor
		MethodId constructor = imageScript.getConstructor();
		Code constructorCode = dexMaker.declare(constructor, Modifier.PUBLIC);
		Local thisRef = constructorCode.getThis(imageScript);
		MethodId parentConstructor = TypeId.get(DexImageScript.class).getConstructor();
		constructorCode.invokeDirect(parentConstructor, null, thisRef);
		constructorCode.returnVoid();
		
		return imageScript;
	}
	
	static DexImageScript loadGeneratedClass(Context context, DexMaker dexMaker) throws Exception {
		File outputDir = context.getCacheDir();
		// TODO: clean up temporary dex files
		ClassLoader loader = dexMaker.generateAndLoad(DexImageScript.class.getClassLoader(), outputDir);
		Class<?> imageScriptClass = loader.loadClass(CLASS_NAME);
		return (DexImageScript)imageScriptClass.newInstance();
	}

	public static DexImageScript createScript(Context context, String userScript) {
		try {
			DexMaker dexMaker = new DexMaker();
			// build list of instructions to see what variables are referenced
			userScript = userScript.trim() + "\n";
			DexCodeGenerator.InstructionContext instContext = DexCodeGenerator.createInstructionList(userScript);
			
			ScriptType scriptType = null;
			// if no return statement, use createOutputImage method
			boolean hasReturn = false;
			for(DexCodeGenerator.Instruction inst : instContext.instructions) {
			    if (inst instanceof DexCodeGenerator.ReturnInstruction) {
			        hasReturn = true;
			        break;
			    }
			}
			if (hasReturn) {
	            // use color arguments if user's code requires color-specific args
			    scriptType = ScriptType.GRAYSCALE;
	            for(String localName : instContext.locals) {
	                if (ScriptType.COLOR.arguments.contains(localName)) {
	                    scriptType = ScriptType.COLOR;
	                    break;
	                }
	            }
			}
			else {
			    scriptType = ScriptType.MANUAL;
			    // HACK: void method needs a returnVoid instruction
			    instContext.instructions.add(new DexCodeGenerator.ReturnVoidInstruction());
			}
			TypeId[] parameterTypes = new TypeId[scriptType.arguments.size()];
			Arrays.fill(parameterTypes, TypeId.INT);
			
			TypeId<?> imageScriptType = generateClass(dexMaker);
			MethodId generatedMethod = imageScriptType.getMethod(scriptType.returnType, scriptType.methodName, parameterTypes);
			Code code = dexMaker.declare(generatedMethod,  Modifier.PUBLIC);
			
			Map<String, Local> localMap = new HashMap<String, Local>();
			for(int i=0; i<scriptType.arguments.size(); i++) {
				localMap.put(scriptType.arguments.get(i), code.getParameter(i, TypeId.INT));
			}
			
			DexCodeGenerator.generateMethodCode(code, localMap, imageScriptType, instContext);
			
			DexImageScript script = loadGeneratedClass(context, dexMaker);
			script.setScriptType(scriptType);
			return script;
		}
		catch(Throwable ex) {
			Log.e("DexImageScript", "Failed to create", ex);
			return null;
		}
	}

	Bitmap outputBitmap = null;
	int[] outputPixelBuffer;
	
	byte[] imageData;
	int imageWidth;
	int imageHeight;
	
	List<Worker> workers;
	ExecutorService workerExecutor;
	
	void createBuffers(int width, int height) {
		if (outputPixelBuffer==null || outputPixelBuffer.length!=width*height) {
			outputPixelBuffer = new int[width*height];
		}
		if (outputBitmap==null || outputBitmap.getWidth()!=width || outputBitmap.getHeight()!=height) {
			outputBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		}
	}
	
	public Bitmap getBitmapForImageData(byte[] imageData, int width, int height) {
		createBuffers(width, height);
		
		// semi-hack: copy data to instance variables so script_ methods below can access them
		this.imageData = imageData;
		this.imageWidth = width;
		this.imageHeight = height;
		
		if (this.getScriptType()==ScriptType.MANUAL) {
		    Arrays.fill(outputPixelBuffer, 255<<24); // solid black
		    createOutputBitmap(width, height);
		}
		else {
	        // create workers if needed and run them
	        if (workers==null) {
	            workers = new ArrayList<Worker>();
	            int numThreads = Runtime.getRuntime().availableProcessors();
	            for(int i=0; i<numThreads; i++) {
	                workers.add(new Worker());
	            }
	            workerExecutor = Executors.newFixedThreadPool(workers.size());
	        }
	        int nworkers = workers.size();
	        for(int i=0; i<workers.size(); i++) {
	            workers.get(i).setRowRange(i*height/nworkers, (i+1)*height/nworkers);
	        }
	        try {
	            workerExecutor.invokeAll((Collection)workers);
	        }
	        catch(InterruptedException ignored) {}
		}

		this.imageData = null;
		outputBitmap.setPixels(outputPixelBuffer, 0, imageWidth, 0, 0, imageWidth, imageHeight);
		return outputBitmap;
	}
	
	// worker objects which run in separate threads each computing a subset of the output rows
    class Worker implements Callable<Long> {
        int rowStart;
        int rowEnd;
        
        public void setRowRange(int start, int end) {
            rowStart = start;
            rowEnd = end;
        }
        
        public Long call() {
            // interface wants us to return something, might as well collect timing data
            long t1 = System.nanoTime();
            computePixels(rowStart, rowEnd);
            return System.nanoTime() - t1;
        }
    }
	    
	void computePixels(int rowStart, int rowEnd) {
        if (this.getScriptType()==ScriptType.COLOR) {
            int[] rgb = new int[3];
            int yindex = rowStart * imageWidth;
            int uvstart = imageWidth * imageHeight;
            for(int row=rowStart; row<rowEnd; row++) {
                // VU pixels only for every other row and column
                int uvbase = uvstart + (row/2) * imageWidth;
                for(int col=0; col<imageWidth; col++) {
                    // one VU pair of values for every two pixels, round to 2 and take it and the next byte
                    int uvindex = uvbase + (col & ~1);
                    CameraUtils.yuvToRgb(imageData[yindex], imageData[uvindex+1], imageData[uvindex], rgb);
                    outputPixelBuffer[yindex] = getOutputColorForColorInput(0xff & imageData[yindex], 
                            rgb[0], rgb[1], rgb[2], row, col, imageWidth, imageHeight);
                    yindex++;
                }
            }
        }
        else {
            int index = rowStart * imageWidth;
            for(int row=rowStart; row<rowEnd; row++) {
                for(int col=0; col<imageWidth; col++) {
                    outputPixelBuffer[index] = getOutputColorForGrayscaleInput(0xff & imageData[index], row, col, 
                            imageWidth, imageHeight);
                    index++;
                }
            }
        }
	}
	
	// Methods beginning with script_ can be called from scripts. All arguments and return values must be int.
	public int script_max(int val1, int val2) {
		return (val1 > val2) ? val1 : val2;
	}
	
	public int script_min(int val1, int val2) {
		return (val1 < val2) ? val1 : val2;
	}
	
	public int script_clamp(int val, int min, int max) {
		if (val < min) return min;
		if (val > max) return max;
		return val;
	}
	
	public int script_abs(int val) {
		return (val>=0) ? val : -val;
	}
	
	public int script_ifeq(int val, int cmp, int trueval, int falseval) {
		return (val==cmp) ? trueval : falseval;
	}
	
	public int script_ifgt(int val, int cmp, int trueval, int falseval) {
		return (val>cmp) ? trueval : falseval;
	}

	public int script_getbright(int row, int col) {
		// if out of range, use nearest edge
		if (row<0) row = 0;
		if (row>=imageHeight) row = imageHeight-1;
		if (col<0) col = 0;
		if (col>=imageWidth) col = imageWidth-1;
		return 0xff & imageData[row*imageWidth + col];
	}
	
    public int script_getcolor(int row, int col) {
        // if out of range, use nearest edge
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        byte y = imageData[row*imageWidth + col];
        int uvindex = imageWidth*imageHeight + (row/2)*imageWidth + (col & ~1);
        return CameraUtils.colorFromYuv(y, imageData[uvindex+1], imageData[uvindex]);
    }
    
    public int script_getred(int row, int col) {
        // if out of range, use nearest edge
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        byte y = imageData[row*imageWidth + col];
        int uvindex = imageWidth*imageHeight + (row/2)*imageWidth + (col & ~1);
        return CameraUtils.redFromYuv(y, imageData[uvindex+1], imageData[uvindex]);
    }
    
    public int script_getgreen(int row, int col) {
        // if out of range, use nearest edge
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        byte y = imageData[row*imageWidth + col];
        int uvindex = imageWidth*imageHeight + (row/2)*imageWidth + (col & ~1);
        return CameraUtils.greenFromYuv(y, imageData[uvindex+1], imageData[uvindex]);
    }
    
    public int script_getblue(int row, int col) {
        // if out of range, use nearest edge
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        byte y = imageData[row*imageWidth + col];
        int uvindex = imageWidth*imageHeight + (row/2)*(imageHeight/2) + (col & ~1);
        return CameraUtils.blueFromYuv(y, imageData[uvindex+1], imageData[uvindex]);
    }
    
	public int script_random(int rmax) {
		return random.nextInt(rmax);
	}
	
	public int script_gray(int gray) {
		if (gray<0) gray = 0;
		if (gray>255) gray = 255;
		return 0xff000000 | (gray << 16) | (gray << 8) | gray;
	}
	
	public int script_rgb(int r, int g, int b) {
		if (r<0) r = 0;
		if (r>255) r = 255;
		if (g<0) g = 0;
		if (g>255) g = 255;
		if (b<0) b = 0;
		if (b>255) b = 255;
		return 0xff000000 | (r << 16) | (g << 8) | b;
	}
	
	// these methods are used by manual user scripts to set individual pixels and perform drawing operations
    public int script_setrgb(int row, int col, int r, int g, int b) {
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        outputPixelBuffer[row*imageWidth + col] = 0xff000000 | (r << 16) | (g << 8) | b;
        return 0;
    }
    
    public int script_setgray(int row, int col, int gray) {
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        outputPixelBuffer[row*imageWidth + col] = 0xff000000 | (gray << 16) | (gray << 8) | gray;
        return 0;
    }
    
    public int script_setcolor(int row, int col, int color) {
        if (row<0) row = 0;
        if (row>=imageHeight) row = imageHeight-1;
        if (col<0) col = 0;
        if (col>=imageWidth) col = imageWidth-1;
        
        outputPixelBuffer[row*imageWidth + col] = color;
        return 0;
    }
}
