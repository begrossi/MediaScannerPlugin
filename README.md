# MediaScannerPlugin
Cordova/Phonegap plugin to call MediaScannerPlugin

MediaScanner should be called to add a downloaded image to Android Gallery.

Installation
------------

### For Cordova 3.0.x:

To add this plugin just type: `cordova plugin add https://github.com/begrossi/MediaScannerPlugin.git` or
`cordova plugin add cordova-plugin-mediascanner` (using npmjs [repository](https://www.npmjs.com/package/cordova-plugin-mediascanner)).


Usage:
------

Call the `cordova.plugins.MediaScannerPlugin(fileUri, successCallback, errorCallback)` method after download.


References:
-----------
* http://stackoverflow.com/questions/19447557/phonegap-how-to-trigger-media-scanner-after-creating-file
* http://droidyue.com/blog/2014/01/19/scan-media-files-in-android/
* http://developer.android.com/reference/android/content/Intent.html#setData(android.net.Uri)


License
-------

The MIT License

Copyright (c) 2015 Bruno E. Grossi (http://brunogrossi.com.br)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
