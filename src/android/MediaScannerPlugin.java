package br.com.brunogrossi.MediaScannerPlugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/*
The MIT License (MIT)

Copyright (c) 2014

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */


/**
 * MediaScannerPlugin.java
 *
 * @author Bruno E. Grossi <bruno@grossi.com.br>
 */
public class MediaScannerPlugin extends CordovaPlugin {
    private static final String TAG = "MediaScannerPlugin";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (action.equals("scanFile")) {
                String fileUri = args.optString(0);
                if(fileUri!=null && !fileUri.equals("")) {
                    Uri contentUri = Uri.parse(fileUri);
                    
                    Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                    mediaScanIntent.setData(contentUri);
                    this.cordova.getActivity().sendBroadcast(mediaScanIntent);
                    
                    callbackContext.success();
        
                    return true;
                } else {
                    Log.w(TAG, "No action param provided: "+action);
                    callbackContext.error("No action param provided: "+action);
                    return false;
                }
            } else {
                Log.w(TAG, "Wrong action was provided: "+action);
                return false;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            callbackContext.error(e.getMessage());
            return false;
        }
    }
}