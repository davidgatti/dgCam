dgCam
=============

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

What can you find here
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

# The End

If you enjoyed this project, please consider giving it a 🌟. And check out my [GitHub account](https://github.com/davidgatti), where you'll find additional resources you might find useful or interesting.

## Sponsor 🎊

This project is brought to you by 0x4447 LLC, a software company specializing in building custom solutions on top of AWS. Follow this link to learn more: https://0x4447.com. Alternatively, send an email to [hello@0x4447.email](mailto:hello@0x4447.email?Subject=Hello%20From%20Repo&Body=Hi%2C%0A%0AMy%20name%20is%20NAME%2C%20and%20I%27d%20like%20to%20get%20in%20touch%20with%20someone%20at%200x4447.%0A%0AI%27d%20like%20to%20discuss%20the%20following%20topics%3A%0A%0A-%20LIST_OF_TOPICS_TO_DISCUSS%0A%0ASome%20useful%20information%3A%0A%0A-%20My%20full%20name%20is%3A%20FIRST_NAME%20LAST_NAME%0A-%20My%20time%20zone%20is%3A%20TIME_ZONE%0A-%20My%20working%20hours%20are%20from%3A%20TIME%20till%20TIME%0A-%20My%20company%20name%20is%3A%20COMPANY%20NAME%0A-%20My%20company%20website%20is%3A%20https%3A%2F%2F%0A%0ABest%20regards.).
