//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.StarDetector;

// C++: class StarDetector
/**
 * The class implements the keypoint detector introduced by CITE: Agrawal08, synonym of StarDetector. :
 */
public class StarDetector extends Feature2D {

    protected StarDetector(long addr) { super(addr); }

    // internal usage only
    public static StarDetector __fromPtr__(long addr) { return new StarDetector(addr); }

    //
    // C++: static Ptr_StarDetector cv::xfeatures2d::StarDetector::create(int maxSize = 45, int responseThreshold = 30, int lineThresholdProjected = 10, int lineThresholdBinarized = 8, int suppressNonmaxSize = 5)
    //

    public static StarDetector create(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized, int suppressNonmaxSize) {
        return StarDetector.__fromPtr__(create_0(maxSize, responseThreshold, lineThresholdProjected, lineThresholdBinarized, suppressNonmaxSize));
    }

    public static StarDetector create(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized) {
        return StarDetector.__fromPtr__(create_1(maxSize, responseThreshold, lineThresholdProjected, lineThresholdBinarized));
    }

    public static StarDetector create(int maxSize, int responseThreshold, int lineThresholdProjected) {
        return StarDetector.__fromPtr__(create_2(maxSize, responseThreshold, lineThresholdProjected));
    }

    public static StarDetector create(int maxSize, int responseThreshold) {
        return StarDetector.__fromPtr__(create_3(maxSize, responseThreshold));
    }

    public static StarDetector create(int maxSize) {
        return StarDetector.__fromPtr__(create_4(maxSize));
    }

    public static StarDetector create() {
        return StarDetector.__fromPtr__(create_5());
    }


    //
    // C++:  void cv::xfeatures2d::StarDetector::setMaxSize(int _maxSize)
    //

    public void setMaxSize(int _maxSize) {
        setMaxSize_0(nativeObj, _maxSize);
    }


    //
    // C++:  int cv::xfeatures2d::StarDetector::getMaxSize()
    //

    public int getMaxSize() {
        return getMaxSize_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::StarDetector::setResponseThreshold(int _responseThreshold)
    //

    public void setResponseThreshold(int _responseThreshold) {
        setResponseThreshold_0(nativeObj, _responseThreshold);
    }


    //
    // C++:  int cv::xfeatures2d::StarDetector::getResponseThreshold()
    //

    public int getResponseThreshold() {
        return getResponseThreshold_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::StarDetector::setLineThresholdProjected(int _lineThresholdProjected)
    //

    public void setLineThresholdProjected(int _lineThresholdProjected) {
        setLineThresholdProjected_0(nativeObj, _lineThresholdProjected);
    }


    //
    // C++:  int cv::xfeatures2d::StarDetector::getLineThresholdProjected()
    //

    public int getLineThresholdProjected() {
        return getLineThresholdProjected_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::StarDetector::setLineThresholdBinarized(int _lineThresholdBinarized)
    //

    public void setLineThresholdBinarized(int _lineThresholdBinarized) {
        setLineThresholdBinarized_0(nativeObj, _lineThresholdBinarized);
    }


    //
    // C++:  int cv::xfeatures2d::StarDetector::getLineThresholdBinarized()
    //

    public int getLineThresholdBinarized() {
        return getLineThresholdBinarized_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::StarDetector::setSuppressNonmaxSize(int _suppressNonmaxSize)
    //

    public void setSuppressNonmaxSize(int _suppressNonmaxSize) {
        setSuppressNonmaxSize_0(nativeObj, _suppressNonmaxSize);
    }


    //
    // C++:  int cv::xfeatures2d::StarDetector::getSuppressNonmaxSize()
    //

    public int getSuppressNonmaxSize() {
        return getSuppressNonmaxSize_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::StarDetector::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_StarDetector cv::xfeatures2d::StarDetector::create(int maxSize = 45, int responseThreshold = 30, int lineThresholdProjected = 10, int lineThresholdBinarized = 8, int suppressNonmaxSize = 5)
    private static native long create_0(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized, int suppressNonmaxSize);
    private static native long create_1(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized);
    private static native long create_2(int maxSize, int responseThreshold, int lineThresholdProjected);
    private static native long create_3(int maxSize, int responseThreshold);
    private static native long create_4(int maxSize);
    private static native long create_5();

    // C++:  void cv::xfeatures2d::StarDetector::setMaxSize(int _maxSize)
    private static native void setMaxSize_0(long nativeObj, int _maxSize);

    // C++:  int cv::xfeatures2d::StarDetector::getMaxSize()
    private static native int getMaxSize_0(long nativeObj);

    // C++:  void cv::xfeatures2d::StarDetector::setResponseThreshold(int _responseThreshold)
    private static native void setResponseThreshold_0(long nativeObj, int _responseThreshold);

    // C++:  int cv::xfeatures2d::StarDetector::getResponseThreshold()
    private static native int getResponseThreshold_0(long nativeObj);

    // C++:  void cv::xfeatures2d::StarDetector::setLineThresholdProjected(int _lineThresholdProjected)
    private static native void setLineThresholdProjected_0(long nativeObj, int _lineThresholdProjected);

    // C++:  int cv::xfeatures2d::StarDetector::getLineThresholdProjected()
    private static native int getLineThresholdProjected_0(long nativeObj);

    // C++:  void cv::xfeatures2d::StarDetector::setLineThresholdBinarized(int _lineThresholdBinarized)
    private static native void setLineThresholdBinarized_0(long nativeObj, int _lineThresholdBinarized);

    // C++:  int cv::xfeatures2d::StarDetector::getLineThresholdBinarized()
    private static native int getLineThresholdBinarized_0(long nativeObj);

    // C++:  void cv::xfeatures2d::StarDetector::setSuppressNonmaxSize(int _suppressNonmaxSize)
    private static native void setSuppressNonmaxSize_0(long nativeObj, int _suppressNonmaxSize);

    // C++:  int cv::xfeatures2d::StarDetector::getSuppressNonmaxSize()
    private static native int getSuppressNonmaxSize_0(long nativeObj);

    // C++:  String cv::xfeatures2d::StarDetector::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
