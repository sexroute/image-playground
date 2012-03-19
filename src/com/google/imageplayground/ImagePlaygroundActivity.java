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
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
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
        
        fullScreenControls = findViewById(R.id.fullScreenControls);
        fullScreenResultView = (ResultView)findViewById(R.id.fullScreenResultView);
        
        shutterButton = (ShutterButton)findViewById(R.id.shutterButton);
        shutterButton.setOnShutterButtonListener(this);
        
        int switchCameraVisibility = CameraUtils.numberOfCameras() > 1 ? View.VISIBLE : View.GONE;
        findViewById(R.id.switchCameraButton).setVisibility(switchCameraVisibility);
        findViewById(R.id.fullScreenSwitchCameraButton).setVisibility(switchCameraVisibility);

        arManager = ARManager.createAndSetupCameraView(this, cameraView, this);
        arManager.setPreferredPreviewSize(640, 360);
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
    		arManager.startCameraIfVisible();
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

    	/*
    	arManager.setPreferredPreviewSize(1280, 720);
    	arManager.stopCamera();
    	arManager.startCamera();
    	*/
    }
    
    public void onClick_exitFullScreen(View view) {
    	fullScreenControls.setVisibility(View.GONE);
    	resultView.updateBitmap(fullScreenResultView.getBitmap());
    	fullScreenResultView.updateBitmap(null);
    	/*
    	arManager.setPreferredPreviewSize(640, 480);
    	arManager.stopCamera();
    	arManager.startCamera();
    	*/
    }

    boolean isFullScreen() {
    	return fullScreenControls.getVisibility()==View.VISIBLE;
    }
    
    DexImageScript dexScript = null;
    String lastUserScript = "";

	@Override
	public void onPreviewFrame(byte[] data, Camera camera) {
		Camera.Size size = camera.getParameters().getPreviewSize();
		try {
			String userScript = scriptField.getText().toString();
			if (userScript!=null && (!userScript.equals(lastUserScript))) {
				lastUserScript = userScript;
				saveScript(userScript);
				dexScript = DexImageScript.createScript(this, userScript);
			}
			Bitmap bitmap = null;
			if (dexScript != null) {
				bitmap = dexScript.getBitmapForImageData(data, size.width, size.height);
			}
			(isFullScreen() ? fullScreenResultView : resultView).updateBitmap(bitmap);
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
}