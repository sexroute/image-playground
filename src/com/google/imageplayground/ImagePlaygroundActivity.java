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

package com.google.imageplayground;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.imageplayground.codegen.DexImageScript;
import com.google.imageplayground.util.ARManager;
import com.google.imageplayground.util.AndroidUtils;
import com.google.imageplayground.util.CameraUtils;
import com.google.imageplayground.util.ShutterButton;
import com.google.imageplayground.util.ShutterButton.OnShutterButtonListener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;

public class ImagePlaygroundActivity extends Activity implements Camera.PreviewCallback, OnShutterButtonListener {
	ARManager arManager;
	
	SurfaceView cameraView;
	ResultView resultView;
	EditText scriptField;
	CheckBox cameraCheckbox;
	ShutterButton shutterButton;
	
	View fullScreenControls;
	ResultView fullScreenResultView;
	int displayWidth;
	int displayHeight;
	
	String userScript;
	
	Handler handler = new Handler();
	
    static DateFormat FILENAME_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    static String BASE_PICTURE_DIR = Environment.getExternalStorageDirectory() + File.separator + "ImagePlayground";
    
    static String thumbnailDirectory() {
    	return BASE_PICTURE_DIR + File.separator + "thumbnails";
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        cameraView = (SurfaceView)findViewById(R.id.cameraView);
        resultView = (ResultView)findViewById(R.id.resultView);
        cameraCheckbox = (CheckBox)findViewById(R.id.cameraCheckbox);
        scriptField = (EditText)findViewById(R.id.scriptText);
        scriptField.addTextChangedListener(new SyntaxHighlighterTextWatcher(scriptField, new SyntaxHighlighter()));
        
        fullScreenControls = findViewById(R.id.fullScreenControls);
        fullScreenResultView = (ResultView)findViewById(R.id.fullScreenResultView);
        
        shutterButton = (ShutterButton)findViewById(R.id.shutterButton);
        shutterButton.setOnShutterButtonListener(this);
        
        int switchCameraVisibility = CameraUtils.numberOfCameras() > 1 ? View.VISIBLE : View.GONE;
        findViewById(R.id.switchCameraButton).setVisibility(switchCameraVisibility);
        findViewById(R.id.fullScreenSwitchCameraButton).setVisibility(switchCameraVisibility);
        
        WindowManager wm = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        displayWidth = display.getWidth();
        displayHeight = display.getHeight();

        arManager = ARManager.createAndSetupCameraView(this, cameraView, this);
        arManager.setPreferredPreviewSize(displayWidth/2, displayHeight/2);
        arManager.setNumberOfPreviewCallbackBuffers(1);
        
        updateFromPreferences();
    }
    
    @Override
    public void onPause() {
    	arManager.stopCamera();
    	super.onPause();
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	if (cameraCheckbox.isChecked()) {
    	    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            if (prefs.getBoolean(SCRIPT_UNTESTED_PREF, false)) {
                // the script may have hung last time, so don't automatically start it running
                cameraCheckbox.setChecked(false);
            }
            else {
                arManager.startCameraIfVisible();
            }
    	}
    }
    
    void updateFromPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        this.userScript = prefs.getString("script", "return gray(y)");
        scriptField.setText(this.userScript);
    }
    
    void saveScript(String script) {
    	SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
    	editor.putString("script", script);
    	editor.commit();
    }
    
    void updateScriptUntestedPref(boolean value) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        editor.putBoolean(SCRIPT_UNTESTED_PREF, value);
        editor.commit();
    }
    
    public void onClick_updateScript(View view) {
    	userScript = scriptField.getText().toString();
    }
    
    public void onClick_cameraCheckboxChanged(View view) {
    	if (cameraCheckbox.isChecked()) {
    		arManager.startCamera();
    	}
    	else {
    		arManager.stopCamera();
    	}
    }
    
    public void onClick_gotoAbout(View view) {
    	AboutActivity.startIntent(this);
    }
    
    public void onClick_switchCamera(View view) {
    	arManager.switchToNextCamera();
    }
    
    public void onClick_gotoGallery(View view) {
        Intent intent = LibraryActivity.intentWithImageDirectory(this, BASE_PICTURE_DIR, thumbnailDirectory());
        startActivity(intent);
    }
    
    void takePicture() {
        try {
            String datestr = FILENAME_DATE_FORMAT.format(new Date());
            String dir = BASE_PICTURE_DIR + File.separator + datestr;
            (new File(dir)).mkdirs();
            if (!((new File(dir)).isDirectory())) {
                return;
            }
            String pngPath = savePicture(dir, datestr);
            
            if (pngPath!=null) {
            	ViewImageActivity.startActivityWithImageURI(this, Uri.fromFile(new File(pngPath)), "image/png");
            }
        }
        catch(IOException ex) {
            Log.e("ImagePlayground", "Error saving picture", ex);
        }
    }

    String savePicture(String dir, String imageName) throws IOException {
        Bitmap bitmap = fullScreenResultView.getBitmap();
        if (bitmap!=null) {
        	return saveBitmap(bitmap, dir, imageName);
        }
        return null;
    }
    
    String saveBitmap(Bitmap bitmap, String dir, String imageName) throws IOException {
        String outputFilePath;
        FileOutputStream output = null;
        try {
            outputFilePath = dir + File.separator + imageName + ".png";
            output = new FileOutputStream(outputFilePath);
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, output);
            output.close();
        }
        finally {
            if (output!=null) output.close();
        }
        return outputFilePath;
    }

    
    public void onClick_goFullScreen(View view) {
        fullScreenControls.setVisibility(View.VISIBLE);
        fullScreenResultView.updateBitmap(resultView.getBitmap());
        resultView.updateBitmap(null);
        if (!cameraCheckbox.isChecked()) {
            cameraCheckbox.setChecked(true);
            arManager.startCameraIfVisible();
        }
        AndroidUtils.setSystemUiLowProfile(cameraView);

        arManager.setPreferredPreviewSize(displayWidth, displayHeight);
        arManager.stopCamera();
        arManager.startCamera();
    }
    
    public void onClick_exitFullScreen(View view) {
        fullScreenControls.setVisibility(View.GONE);
        resultView.updateBitmap(fullScreenResultView.getBitmap());
        fullScreenResultView.updateBitmap(null);
        AndroidUtils.setSystemUiVisible(cameraView);

        arManager.setPreferredPreviewSize(displayWidth/2, displayHeight/2);
        arManager.stopCamera();
        arManager.startCamera();
    }

    boolean isFullScreen() {
    	return fullScreenControls.getVisibility()==View.VISIBLE;
    }
    
    boolean isTextEditorExpanded() {
        // this doesn't work, how to tell if text editor is fullscreen?
        return scriptField.getWidth() > displayWidth*3/4;
    }
    
    DexImageScript dexScript = null;
    String lastUserScript = "";
    // To protect against infinite loops, set a flag when the script changes, and unset it only if the script
    // successfully produces several frames in a certain time limit. On startup, if the flag is set, the script
    // will not start running automatically. This won't prevent infinite loops from hanging, but it will allow
    // the user to force quit and relaunch without immediately it hanging again.
    long newScriptStartTime;
    int newScriptFrames;
    static final int REQUIRED_NEW_SCRIPT_FRAMES = 10;
    static final long NEW_SCRIPT_DEADLINE = 5000;
    static final String SCRIPT_UNTESTED_PREF = "scriptUntested";

	@Override
	public void onPreviewFrame(byte[] data, Camera camera) {
		Camera.Size size = camera.getParameters().getPreviewSize();
		try {
		    if (!isTextEditorExpanded()) {
	            String userScript = scriptField.getText().toString();
	            if (userScript!=null && (!userScript.equals(lastUserScript))) {
	                // new script: mark untested and record current time
	                updateScriptUntestedPref(true);
	                newScriptStartTime = System.currentTimeMillis();
	                newScriptFrames = 0;
	                
	                lastUserScript = userScript;
	                saveScript(userScript);
	                dexScript = DexImageScript.createScript(this, userScript);
	            }
	            Bitmap bitmap = null;
	            if (dexScript != null) {
	                bitmap = dexScript.getBitmapForImageData(data, size.width, size.height);
	                if (bitmap!=null) {
	                    // clear untested flag if script has successfully generated enough bitmaps
	                    ++newScriptFrames;
	                    if (newScriptFrames==REQUIRED_NEW_SCRIPT_FRAMES && 
	                            System.currentTimeMillis()-newScriptStartTime<=NEW_SCRIPT_DEADLINE) {
	                        updateScriptUntestedPref(false);
	                    }
	                }
	            }
	            (isFullScreen() ? fullScreenResultView : resultView).updateBitmap(bitmap);
		    }
		}
		catch(Exception ex) {
			Log.e("ImageLab", "Error processing image", ex);
		}
		finally {
			CameraUtils.addPreviewCallbackBuffer(camera, data);
		}
	}

	@Override
	public void onShutterButtonFocus(boolean pressed) {
		shutterButton.setImageResource(pressed ? R.drawable.btn_camera_shutter_pressed_holo : 
			                                     R.drawable.btn_camera_shutter_holo);
	}

	@Override
	public void onShutterButtonClick() {
		takePicture();
	}
	
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	// take picture when pushing hardware camera button or trackball center
		if ((keyCode==KeyEvent.KEYCODE_CAMERA || keyCode==KeyEvent.KEYCODE_DPAD_CENTER) && event.getRepeatCount()==0) {
			if (isFullScreen()) {
				handler.post(new Runnable() {
					public void run() {
						takePicture();
					}
				});
				return true;
			}
		}
		if (keyCode==KeyEvent.KEYCODE_BACK) {
			// exit fullscreen mode, otherwise handle normally
			if (isFullScreen()) {
				onClick_exitFullScreen(null);
				return true;
			}
		}
    	return super.onKeyDown(keyCode, event);
    }
    
    class SyntaxHighlighterTextWatcher implements TextWatcher {
        SyntaxHighlighter highlighter;
        EditText editText;
        
        public SyntaxHighlighterTextWatcher(EditText editText, SyntaxHighlighter highlighter) {
            this.editText = editText;
            this.highlighter = highlighter;
        }
        
        @Override
        public void afterTextChanged(Editable s) {
            this.highlighter.applySyntaxHighlighting(editText.getText());
        }

        @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
        
    }
}
