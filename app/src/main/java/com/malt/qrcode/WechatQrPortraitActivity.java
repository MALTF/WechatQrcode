package com.malt.qrcode;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.CheckBox;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraActivity;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
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
    private boolean mIsJavaCamera = true;
    private MenuItem mItemSwitchCamera = null;
    private CheckBox checkBoxCrop;

    private List<Mat> points = new ArrayList<>();
    private Scalar scalar = new Scalar(255, 255, 0, 0);
    private Point center = new Point();

    private Mat dstRgb = null;
    private Mat dstGray = null;
    private Mat m = null;
    private Size size = null;

    protected WeChatQRCode weChatQRCode = null;

    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
        @Override
        public void onManagerConnected(int status) {
            if (status == LoaderCallbackInterface.SUCCESS) {
                Log.i(TAG, "OpenCV loaded successfully");
                mOpenCvCameraView.enableView();
            } else {
                super.onManagerConnected(status);
            }
        }
    };

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
        checkBoxCrop = findViewById(R.id.checkboxCrop);

        mOpenCvCameraView = (CameraBridgeViewBase) findViewById(R.id.tutorial1_activity_java_surface_view);
        mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
        mOpenCvCameraView.setCvCameraViewListener(this);
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
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_0_0, this, mLoaderCallback);
        } else {
            Log.d(TAG, "OpenCV library found inside package. Using it!");
            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
        }
        weChatQRCode = WechatQr.init(this);
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
        if (checkBoxCrop.isChecked()) {
            int finalWidth = 200;
            // 这个值不要设置得太大，否则出边界了
            int squreWidth = Math.min(finalWidth, dstRgb.width());
            Mat centerMat = centerRectDraw2Cop(dstRgb, squreWidth);
            // 灰度图帧率更高
            List<String> results = weChatQRCode.detectAndDecode(centerMat, points);
            centerRectDraw(dstRgb, squreWidth);
            centerMat.release();
            // 原彩帧率低一些
            if (null != results && results.size() > 0) {
                //裁剪后位置要加上偏移
                int delTaX = (dstRgb.width() - squreWidth) / 2;
                int delTaY = (dstRgb.height() - squreWidth) / 2;
                Log.e(TAG, "识别的结果数量：" + results.size());
                for (int i = 0, isize = results.size(); i < isize; i++) {
                    Rect rect = Imgproc.boundingRect(points.get(i));
                    rect.x = rect.x + delTaX;
                    rect.y = rect.y + delTaY;
                    Imgproc.rectangle(dstRgb, rect, scalar, 5);
                    Imgproc.putText(dstRgb, results.get(i), rect.tl(), 0, 1, scalar);
                }
            }
        } else {
            // 灰度图帧率更高
            List<String> results = weChatQRCode.detectAndDecode(dstRgb, points);
            // 原彩帧率低一些
            if (null != results && results.size() > 0) {
                Log.e(TAG, "识别的结果数量：" + results.size());
                for (int i = 0, isize = results.size(); i < isize; i++) {
                    Rect rect = Imgproc.boundingRect(points.get(i));
                    Imgproc.rectangle(dstRgb, rect, scalar, 5);
                    Imgproc.putText(dstRgb, results.get(i), rect.tl(), 0, 1, scalar);
                }
            }

        }
        // 返回原彩图旋转后的图
        return dstRgb;
    }

    /**
     * 指定正常形大小
     *
     * @param mat Mat
     * @param min min
     */
    protected void centerRectDraw(Mat mat, int min) {
        Scalar scalar = new Scalar(0xff, 0x88, 0x88, 0x88);
        int width = mat.width();
        int height = mat.height();

        Rect rect = new Rect();
        rect.x = width / 2 - min / 2;
        rect.y = height / 2 - min / 2;
        rect.width = min;
        rect.height = min;
        Imgproc.rectangle(mat, rect, scalar);
    }

    /**
     * 指定正常形大小
     *
     * @param mat Mat
     * @param min min
     */
    public static Mat centerRectDraw2Cop(Mat mat, int min) {
        int width = mat.width();
        int height = mat.height();

        Rect rect = new Rect();
        rect.x = width / 2 - min / 2;
        rect.y = height / 2 - min / 2;
        rect.width = min;
        rect.height = min;
        return new Mat(mat, rect);
    }
}
