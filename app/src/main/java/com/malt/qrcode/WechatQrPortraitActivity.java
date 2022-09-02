package com.malt.qrcode;

import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.TextView;

import org.opencv.android.CameraActivity;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.BarcodeDetector;
import org.opencv.wechat_qrcode.WeChatQRCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author by maliang on 2021/5/13 13:21
 * #First Created Time:
 * #包名：com.malt.qrcode
 * class description:微信二维码识别
 */
public class WechatQrPortraitActivity extends CameraActivity implements CvCameraViewListener2 {
    private static final String TAG = WechatQrPortraitActivity.class.getSimpleName();

    private CameraBridgeViewBase mOpenCvCameraView;

    private final List<Mat> points = new ArrayList<>();
    private final Scalar scalar = new Scalar(255, 255, 0, 0);
    private final Point center = new Point();

    private Mat dstRgb = null;
    private Mat dstGray = null;
    private Mat m = null;
    private Size size = null;

    protected WeChatQRCode weChatQRCode = null;
    protected BarcodeDetector barcodeDetector = null;

    private TextView resultTextView;
    // OpenCV4.8.0 启用
//    private final BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
//        @Override
//        public void onManagerConnected(int status) {
//            if (status == LoaderCallbackInterface.SUCCESS) {
//                Log.i(TAG, "OpenCV loaded successfully");
//                mOpenCvCameraView.enableView();
//            } else {
//                super.onManagerConnected(status);
//            }
//        }
//    };

    public WechatQrPortraitActivity() {
        Log.i(TAG, "Instantiated new " + this.getClass());
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "called onCreate");
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.wechat_qr_portrait);

        resultTextView = findViewById(R.id.result_code_tv);

        mOpenCvCameraView = findViewById(R.id.tutorial1_activity_java_surface_view);
        mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
        mOpenCvCameraView.setCvCameraViewListener(this);
        // OpenCV4.9.0 启用
        mOpenCvCameraView.enableView();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mOpenCvCameraView != null) {
            mOpenCvCameraView.disableView();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        // OpenCV4.8.0 启用
//        if (!OpenCVLoader.initDebug()) {
//            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
//            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION, this, mLoaderCallback);
//        } else {
//            Log.d(TAG, "OpenCV library found inside package. Using it!");
//            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
//        }
        OpenCVLoader.initLocal();

        weChatQRCode = WechatQr.init(this);
        barcodeDetector = new BarcodeDetector();
    }

    @Override
    protected List<? extends CameraBridgeViewBase> getCameraViewList() {
        return Collections.singletonList(mOpenCvCameraView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mOpenCvCameraView != null) {
            mOpenCvCameraView.disableView();
        }
    }

    @Override
    public void onCameraViewStarted(int width, int height) {
    }

    @Override
    public void onCameraViewStopped() {
    }

    @Override
    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {
        points.clear();
        if (null != dstGray) {
            dstGray.release();
        }
        if (null != dstRgb) {
            dstRgb.release();
        }
        // 原彩图
        Mat rgba = inputFrame.rgba();
        // 原灰度图
        Mat grayMat = inputFrame.gray();

        center.x = rgba.cols() >> 1;
        center.y = rgba.rows() >> 1;

        if (null == dstRgb) {
            m = Imgproc.getRotationMatrix2D(center, 270, 1);
            // 如果只处理彩图，就只需要创建和处理dstRgb，如果只需要处理灰度图，就只需要创建和处理dstGray
            // 接受旋转后的彩色图
            dstRgb = new Mat(rgba.cols(), rgba.rows(), rgba.type());
            // 接受旋转后的灰度图
            dstGray = new Mat(rgba.cols(), rgba.rows(), rgba.type());
            size = new Size(rgba.cols(), rgba.rows());
        }

        // 如果只处理彩图，就只需要创建和处理dstRgb，如果只需要处理灰度图，就只需要创建和处理dstGray
        // 旋转原彩图
        Imgproc.warpAffine(rgba, dstRgb, m, size);
        // 旋转灰度图
        Imgproc.warpAffine(grayMat, dstGray, m, size);
        // 灰度图帧率更高 // 原彩帧率低一些
        StringBuilder sb = new StringBuilder();
        Mat pointsMat = new Mat();
        List<String> decoded_info = new ArrayList<>();
        List<Mat> straight_code = new ArrayList<>();
        boolean decodeMulti = barcodeDetector.detectAndDecodeMulti(dstRgb, decoded_info, pointsMat, straight_code);
        if (decodeMulti && decoded_info.size() > 0) {
            for (int index = 0; index < decoded_info.size(); index++) {
                String barCode = decoded_info.get(index);
                sb.append("barCode[").append(index).append("]").append(barCode).append("\r\n");
                if (straight_code.size() > index) {
                    pointsMat = straight_code.get(index);
                }
                if (pointsMat != null) {
                    int depth = pointsMat.depth();
                    int npoints = pointsMat.checkVector(2);
                    Log.d(TAG, "depth:" + depth + " npoints:" + npoints);
                    if (npoints >= 0 && (depth == CvType.CV_32F || depth == CvType.CV_32S)) {
                        Rect rect = Imgproc.boundingRect(pointsMat);
                        Imgproc.rectangle(dstRgb, rect, scalar, 5);
                        Imgproc.putText(dstRgb, barCode, rect.tl(), 0, 1, scalar);
                    }
                }
            }
        }
        List<String> results = weChatQRCode.detectAndDecode(dstRgb, points);
        if (null != results && results.size() > 0) {
            Log.e(TAG, "识别的结果数量：" + results.size());
            for (int i = 0, isize = results.size(); i < isize; i++) {
                String qrCode = results.get(i);
                sb.append("qrCode[").append(i).append("]").append(qrCode).append("\r\n");
                Rect rect = Imgproc.boundingRect(points.get(i));
                Imgproc.rectangle(dstRgb, rect, scalar, 5);
                Imgproc.putText(dstRgb, qrCode, rect.tl(), 0, 1, scalar);
            }
        }
        resultTextView.post(new Runnable() {
            @Override
            public void run() {
                resultTextView.setText(sb.toString());
            }
        });
        // 返回原彩图旋转后的图
        return dstRgb;
    }
}
