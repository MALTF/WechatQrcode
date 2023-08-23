//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.core.Mat;
import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.DAISY;

// C++: class DAISY
/**
 * Class implementing DAISY descriptor, described in CITE: Tola10
 *
 * radius radius of the descriptor at the initial scale
 * q_radius amount of radial range division quantity
 * q_theta amount of angular range division quantity
 * q_hist amount of gradient orientations range division quantity
 * norm choose descriptors normalization type, where
 * DAISY::NRM_NONE will not do any normalization (default),
 * DAISY::NRM_PARTIAL mean that histograms are normalized independently for L2 norm equal to 1.0,
 * DAISY::NRM_FULL mean that descriptors are normalized for L2 norm equal to 1.0,
 * DAISY::NRM_SIFT mean that descriptors are normalized for L2 norm equal to 1.0 but no individual one is bigger than 0.154 as in SIFT
 * H optional 3x3 homography matrix used to warp the grid of daisy but sampling keypoints remains unwarped on image
 * interpolation switch to disable interpolation for speed improvement at minor quality loss
 * use_orientation sample patterns using keypoints orientation, disabled by default.
 */
public class DAISY extends Feature2D {

    protected DAISY(long addr) { super(addr); }

    // internal usage only
    public static DAISY __fromPtr__(long addr) { return new DAISY(addr); }

    // C++: enum NormalizationType (cv.xfeatures2d.DAISY.NormalizationType)
    public static final int
            NRM_NONE = 100,
            NRM_PARTIAL = 101,
            NRM_FULL = 102,
            NRM_SIFT = 103;


    //
    // C++: static Ptr_DAISY cv::xfeatures2d::DAISY::create(float radius = 15, int q_radius = 3, int q_theta = 8, int q_hist = 8, DAISY_NormalizationType norm = DAISY::NRM_NONE, Mat H = Mat(), bool interpolation = true, bool use_orientation = false)
    //

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H, boolean interpolation, boolean use_orientation) {
        return DAISY.__fromPtr__(create_0(radius, q_radius, q_theta, q_hist, H.nativeObj, interpolation, use_orientation));
    }

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H, boolean interpolation) {
        return DAISY.__fromPtr__(create_1(radius, q_radius, q_theta, q_hist, H.nativeObj, interpolation));
    }

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H) {
        return DAISY.__fromPtr__(create_2(radius, q_radius, q_theta, q_hist, H.nativeObj));
    }

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist) {
        return DAISY.__fromPtr__(create_3(radius, q_radius, q_theta, q_hist));
    }

    public static DAISY create(float radius, int q_radius, int q_theta) {
        return DAISY.__fromPtr__(create_5(radius, q_radius, q_theta));
    }

    public static DAISY create(float radius, int q_radius) {
        return DAISY.__fromPtr__(create_6(radius, q_radius));
    }

    public static DAISY create(float radius) {
        return DAISY.__fromPtr__(create_7(radius));
    }

    public static DAISY create() {
        return DAISY.__fromPtr__(create_8());
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setRadius(float radius)
    //

    public void setRadius(float radius) {
        setRadius_0(nativeObj, radius);
    }


    //
    // C++:  float cv::xfeatures2d::DAISY::getRadius()
    //

    public float getRadius() {
        return getRadius_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setQRadius(int q_radius)
    //

    public void setQRadius(int q_radius) {
        setQRadius_0(nativeObj, q_radius);
    }


    //
    // C++:  int cv::xfeatures2d::DAISY::getQRadius()
    //

    public int getQRadius() {
        return getQRadius_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setQTheta(int q_theta)
    //

    public void setQTheta(int q_theta) {
        setQTheta_0(nativeObj, q_theta);
    }


    //
    // C++:  int cv::xfeatures2d::DAISY::getQTheta()
    //

    public int getQTheta() {
        return getQTheta_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setQHist(int q_hist)
    //

    public void setQHist(int q_hist) {
        setQHist_0(nativeObj, q_hist);
    }


    //
    // C++:  int cv::xfeatures2d::DAISY::getQHist()
    //

    public int getQHist() {
        return getQHist_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setNorm(int norm)
    //

    public void setNorm(int norm) {
        setNorm_0(nativeObj, norm);
    }


    //
    // C++:  int cv::xfeatures2d::DAISY::getNorm()
    //

    public int getNorm() {
        return getNorm_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setH(Mat H)
    //

    public void setH(Mat H) {
        setH_0(nativeObj, H.nativeObj);
    }


    //
    // C++:  Mat cv::xfeatures2d::DAISY::getH()
    //

    public Mat getH() {
        return new Mat(getH_0(nativeObj));
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setInterpolation(bool interpolation)
    //

    public void setInterpolation(boolean interpolation) {
        setInterpolation_0(nativeObj, interpolation);
    }


    //
    // C++:  bool cv::xfeatures2d::DAISY::getInterpolation()
    //

    public boolean getInterpolation() {
        return getInterpolation_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::DAISY::setUseOrientation(bool use_orientation)
    //

    public void setUseOrientation(boolean use_orientation) {
        setUseOrientation_0(nativeObj, use_orientation);
    }


    //
    // C++:  bool cv::xfeatures2d::DAISY::getUseOrientation()
    //

    public boolean getUseOrientation() {
        return getUseOrientation_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::DAISY::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DAISY cv::xfeatures2d::DAISY::create(float radius = 15, int q_radius = 3, int q_theta = 8, int q_hist = 8, DAISY_NormalizationType norm = DAISY::NRM_NONE, Mat H = Mat(), bool interpolation = true, bool use_orientation = false)
    private static native long create_0(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj, boolean interpolation, boolean use_orientation);
    private static native long create_1(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj, boolean interpolation);
    private static native long create_2(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj);
    private static native long create_3(float radius, int q_radius, int q_theta, int q_hist);
    private static native long create_5(float radius, int q_radius, int q_theta);
    private static native long create_6(float radius, int q_radius);
    private static native long create_7(float radius);
    private static native long create_8();

    // C++:  void cv::xfeatures2d::DAISY::setRadius(float radius)
    private static native void setRadius_0(long nativeObj, float radius);

    // C++:  float cv::xfeatures2d::DAISY::getRadius()
    private static native float getRadius_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setQRadius(int q_radius)
    private static native void setQRadius_0(long nativeObj, int q_radius);

    // C++:  int cv::xfeatures2d::DAISY::getQRadius()
    private static native int getQRadius_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setQTheta(int q_theta)
    private static native void setQTheta_0(long nativeObj, int q_theta);

    // C++:  int cv::xfeatures2d::DAISY::getQTheta()
    private static native int getQTheta_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setQHist(int q_hist)
    private static native void setQHist_0(long nativeObj, int q_hist);

    // C++:  int cv::xfeatures2d::DAISY::getQHist()
    private static native int getQHist_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setNorm(int norm)
    private static native void setNorm_0(long nativeObj, int norm);

    // C++:  int cv::xfeatures2d::DAISY::getNorm()
    private static native int getNorm_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setH(Mat H)
    private static native void setH_0(long nativeObj, long H_nativeObj);

    // C++:  Mat cv::xfeatures2d::DAISY::getH()
    private static native long getH_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setInterpolation(bool interpolation)
    private static native void setInterpolation_0(long nativeObj, boolean interpolation);

    // C++:  bool cv::xfeatures2d::DAISY::getInterpolation()
    private static native boolean getInterpolation_0(long nativeObj);

    // C++:  void cv::xfeatures2d::DAISY::setUseOrientation(bool use_orientation)
    private static native void setUseOrientation_0(long nativeObj, boolean use_orientation);

    // C++:  bool cv::xfeatures2d::DAISY::getUseOrientation()
    private static native boolean getUseOrientation_0(long nativeObj);

    // C++:  String cv::xfeatures2d::DAISY::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
