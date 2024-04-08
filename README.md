# WechatQrcode <a href=""><img src="https://img.shields.io/badge/Build-pass-brightgreen"/></a> [![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/MALTF/APK-Parser/blob/main/LICENSE)
WeChatQrCode transplant to android platform.
仅编译版本 'arm64-v8a' 其他请参考[OpenCV-WeChatQRCode移植到Android平台](https://blog.csdn.net/SportHappy/article/details/116745415)自行编译

微信二维码识别引擎移植到Android平台

[OpenCV-WeChatQRCode移植到Android平台](https://blog.csdn.net/SportHappy/article/details/116745415)

<p align="left">
  <img src="/Screenshot/Screenshot_20230823_150115_com.malt.wechat_qrcode.jpg" width="45%"><img src="/Screenshot/Screenshot_20230823_154024_com.malt.wechat_qrcode.jpg" width="45%">
</p>

[OpenCV 4.9.0_lite](https://github.com/MALTF/WechatQrcode/tree/master/opencv4.9.0_lite)[OpenCV4.9.0 版本变化](https://github.com/opencv/opencv/wiki/ChangeLog#version490)

* Android:
    * New Android Archive Package (AAR) distrubuted with Maven Central
    * Finally removed API for OpenCV manager. OpenCVLoader.initLocal() should be used to initialize OpenCV.
    * New Android samples: QR code detector, video IO sample. DNN and Face Detector samples refresh.
    * Switch to Gradle 7.6.3, modern Android tools.

Quick Start
+ opencv4.8.0
    + ~~OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION, this, mLoaderCallback);~~

+ opencv4.9.0_lite
```java
OpenCVLoader.initLocal();
```

[OpenCV 4.8.0](https://github.com/MALTF/WechatQrcode/tree/master/opencv4.8.0)

Quick Start
+ opencv4.8.0
```java
OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION, this, mLoaderCallback);
```

[APK下载](https://github.com/MALTF/WechatQrcode/releases)

<p align="left">
  <img src="https://github.com/malxt/ObtainSignature/blob/master/WechatQrcode_mini.gif" width="40%">
</p>

[使用WechatQrcode二维码示例APK下载地址](https://github.com/malxt/ObtainSignature/releases)

## License
<a href="LICENSE"><img src="https://img.shields.io/github/license/fstudio/clangbuilder.svg"></a>
<a href="https://996.icu"><img src="https://img.shields.io/badge/link-996.icu-red.svg"></a>

本项目遵循[MIT license](https://github.com/MALTF/APK-Parser/blob/main/LICENSE)，方便交流与学习。如果您发现本项目有侵犯您的知识产权，请与我取得联系，我会及时修改或删除。
