dgCam
=============
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/davidgatti/dgCam?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

dgCam is a small custom camera app for Android that i had to do for one of the application that we develop at work. We needed more control over the generated photos. Sadly since Android is so fragmented and there is no standards in anything, we could not rely on the built in camera apps. Every manufacture of Android devices have a different approach to the camera and the worst part is: there is no guarantee that if you send your custom settings to the camera - the software will take them in consideration.

For example:

1. Samsung device could care less about the resolution that we wanted - it always took the photos at the higher resolution.
1. HTC devices would crop the photos. So if your device says that you have a a camera with a 5Mpx sensor, in reality the camera will produce a 4,4Mpx photo.

This is why i created the custom camera app. While developing i had to reinvent the wheal many times for different stuff since Google dose not provide basic functionality that Apple dose in its iOS. A good example is the accelerometer. In both system you can get the raw data, but Apple gives you something more. You can get the orientation of the device if this is all what you need. 
Dowload the dgCam from the Android Market
-----------------------------------------

If you would like to see how this app looks and works, you can dowload it from
the Android Market at this URL:
https://market.android.com/details?id=pl.gatti.dgcam

What can you find hear
--------------

1. How to create a custom camera.
1. How to apply custom settings.
1. How to add Exif data to a photo.
1. How to calculate the orientation of the device based on Earth gravity.
1. How to rotate a image on a buton based on the orientation of the device.
1. How to create a layout where you can put elements on top of each other.

Many thx to:
-------

- [Janusz Bossy](https://github.com/YANOUSHek), for helping me out when i was stuck in something! You are osom! :)

Contribution
------------

- Fork project
- Add features
- Add better comments
- Write a better README file - sorry, english is not my main language.

License
-------

Copyright © 2011 Dawid Gatti.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

