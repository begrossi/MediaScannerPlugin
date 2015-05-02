# MediaScannerPlugin
Cordova/Phonegap plugin to call MediaScannerPlugin

MediaScanner should be called to add a downloaded image to Android Gallery.

Installation
------------

### For Cordova 3.0.x:

1. To add this plugin just type: `cordova plugin add https://github.com/begrossi/MediaScannerPlugin.git` or `phonegap local plugin add https://github.com/begrossi/MediaScannerPlugin.git`
2. To remove this plugin type: `cordova plugin remove br.com.brunogrossi.MediaScannerPlugin` or `phonegap local plugin remove br.com.brunogrossi.MediaScannerPlugin`


Usage:
------

Call the `cordova.plugins.MediaScannerPlugin(fileUri, successCallback, errorCallback)` method.


References:
-----------
* http://stackoverflow.com/questions/19447557/phonegap-how-to-trigger-media-scanner-after-creating-file
* http://droidyue.com/blog/2014/01/19/scan-media-files-in-android/
* http://developer.android.com/reference/android/content/Intent.html#setData(android.net.Uri)
