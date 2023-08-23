//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.LATCH;

// C++: class LATCH
/**
 * latch Class for computing the LATCH descriptor.
 * If you find this code useful, please add a reference to the following paper in your work:
 * Gil Levi and Tal Hassner, "LATCH: Learned Arrangements of Three Patch Codes", arXiv preprint arXiv:1501.03719, 15 Jan. 2015
 *
 * LATCH is a binary descriptor based on learned comparisons of triplets of image patches.
 *
 * bytes is the size of the descriptor - can be 64, 32, 16, 8, 4, 2 or 1
 * rotationInvariance - whether or not the descriptor should compansate for orientation changes.
 * half_ssd_size - the size of half of the mini-patches size. For example, if we would like to compare triplets of patches of size 7x7x
 *     then the half_ssd_size should be (7-1)/2 = 3.
 * sigma - sigma value for GaussianBlur smoothing of the source image. Source image will be used without smoothing in case sigma value is 0.
 *
 * Note: the descriptor can be coupled with any keypoint extractor. The only demand is that if you use set rotationInvariance = True then
 *     you will have to use an extractor which estimates the patch orientation (in degrees). Examples for such extractors are ORB and SIFT.
 *
 * Note: a complete example can be found under /samples/cpp/tutorial_code/xfeatures2D/latch_match.cpp
 */
public class LATCH extends Feature2D {

    protected LATCH(long addr) { super(addr); }

    // internal usage only
    public static LATCH __fromPtr__(long addr) { return new LATCH(addr); }

    //
    // C++: static Ptr_LATCH cv::xfeatures2d::LATCH::create(int bytes = 32, bool rotationInvariance = true, int half_ssd_size = 3, double sigma = 2.0)
    //

    public static LATCH create(int bytes, boolean rotationInvariance, int half_ssd_size, double sigma) {
        return LATCH.__fromPtr__(create_0(bytes, rotationInvariance, half_ssd_size, sigma));
    }

    public static LATCH create(int bytes, boolean rotationInvariance, int half_ssd_size) {
        return LATCH.__fromPtr__(create_1(bytes, rotationInvariance, half_ssd_size));
    }

    public static LATCH create(int bytes, boolean rotationInvariance) {
        return LATCH.__fromPtr__(create_2(bytes, rotationInvariance));
    }

    public static LATCH create(int bytes) {
        return LATCH.__fromPtr__(create_3(bytes));
    }

    public static LATCH create() {
        return LATCH.__fromPtr__(create_4());
    }


    //
    // C++:  void cv::xfeatures2d::LATCH::setBytes(int bytes)
    //

    public void setBytes(int bytes) {
        setBytes_0(nativeObj, bytes);
    }


    //
    // C++:  int cv::xfeatures2d::LATCH::getBytes()
    //

    public int getBytes() {
        return getBytes_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::LATCH::setRotationInvariance(bool rotationInvariance)
    //

    public void setRotationInvariance(boolean rotationInvariance) {
        setRotationInvariance_0(nativeObj, rotationInvariance);
    }


    //
    // C++:  bool cv::xfeatures2d::LATCH::getRotationInvariance()
    //

    public boolean getRotationInvariance() {
        return getRotationInvariance_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::LATCH::setHalfSSDsize(int half_ssd_size)
    //

    public void setHalfSSDsize(int half_ssd_size) {
        setHalfSSDsize_0(nativeObj, half_ssd_size);
    }


    //
    // C++:  int cv::xfeatures2d::LATCH::getHalfSSDsize()
    //

    public int getHalfSSDsize() {
        return getHalfSSDsize_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::LATCH::setSigma(double sigma)
    //

    public void setSigma(double sigma) {
        setSigma_0(nativeObj, sigma);
    }


    //
    // C++:  double cv::xfeatures2d::LATCH::getSigma()
    //

    public double getSigma() {
        return getSigma_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::LATCH::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_LATCH cv::xfeatures2d::LATCH::create(int bytes = 32, bool rotationInvariance = true, int half_ssd_size = 3, double sigma = 2.0)
    private static native long create_0(int bytes, boolean rotationInvariance, int half_ssd_size, double sigma);
    private static native long create_1(int bytes, boolean rotationInvariance, int half_ssd_size);
    private static native long create_2(int bytes, boolean rotationInvariance);
    private static native long create_3(int bytes);
    private static native long create_4();

    // C++:  void cv::xfeatures2d::LATCH::setBytes(int bytes)
    private static native void setBytes_0(long nativeObj, int bytes);

    // C++:  int cv::xfeatures2d::LATCH::getBytes()
    private static native int getBytes_0(long nativeObj);

    // C++:  void cv::xfeatures2d::LATCH::setRotationInvariance(bool rotationInvariance)
    private static native void setRotationInvariance_0(long nativeObj, boolean rotationInvariance);

    // C++:  bool cv::xfeatures2d::LATCH::getRotationInvariance()
    private static native boolean getRotationInvariance_0(long nativeObj);

    // C++:  void cv::xfeatures2d::LATCH::setHalfSSDsize(int half_ssd_size)
    private static native void setHalfSSDsize_0(long nativeObj, int half_ssd_size);

    // C++:  int cv::xfeatures2d::LATCH::getHalfSSDsize()
    private static native int getHalfSSDsize_0(long nativeObj);

    // C++:  void cv::xfeatures2d::LATCH::setSigma(double sigma)
    private static native void setSigma_0(long nativeObj, double sigma);

    // C++:  double cv::xfeatures2d::LATCH::getSigma()
    private static native double getSigma_0(long nativeObj);

    // C++:  String cv::xfeatures2d::LATCH::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
