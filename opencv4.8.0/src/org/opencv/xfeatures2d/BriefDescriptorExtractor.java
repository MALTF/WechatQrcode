//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.BriefDescriptorExtractor;

// C++: class BriefDescriptorExtractor
/**
 * Class for computing BRIEF descriptors described in CITE: calon2010 .
 *
 * bytes legth of the descriptor in bytes, valid values are: 16, 32 (default) or 64 .
 * use_orientation sample patterns using keypoints orientation, disabled by default.
 */
public class BriefDescriptorExtractor extends Feature2D {

    protected BriefDescriptorExtractor(long addr) { super(addr); }

    // internal usage only
    public static BriefDescriptorExtractor __fromPtr__(long addr) { return new BriefDescriptorExtractor(addr); }

    //
    // C++: static Ptr_BriefDescriptorExtractor cv::xfeatures2d::BriefDescriptorExtractor::create(int bytes = 32, bool use_orientation = false)
    //

    public static BriefDescriptorExtractor create(int bytes, boolean use_orientation) {
        return BriefDescriptorExtractor.__fromPtr__(create_0(bytes, use_orientation));
    }

    public static BriefDescriptorExtractor create(int bytes) {
        return BriefDescriptorExtractor.__fromPtr__(create_1(bytes));
    }

    public static BriefDescriptorExtractor create() {
        return BriefDescriptorExtractor.__fromPtr__(create_2());
    }


    //
    // C++:  void cv::xfeatures2d::BriefDescriptorExtractor::setDescriptorSize(int bytes)
    //

    public void setDescriptorSize(int bytes) {
        setDescriptorSize_0(nativeObj, bytes);
    }


    //
    // C++:  int cv::xfeatures2d::BriefDescriptorExtractor::getDescriptorSize()
    //

    public int getDescriptorSize() {
        return getDescriptorSize_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::BriefDescriptorExtractor::setUseOrientation(bool use_orientation)
    //

    public void setUseOrientation(boolean use_orientation) {
        setUseOrientation_0(nativeObj, use_orientation);
    }


    //
    // C++:  bool cv::xfeatures2d::BriefDescriptorExtractor::getUseOrientation()
    //

    public boolean getUseOrientation() {
        return getUseOrientation_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::BriefDescriptorExtractor::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BriefDescriptorExtractor cv::xfeatures2d::BriefDescriptorExtractor::create(int bytes = 32, bool use_orientation = false)
    private static native long create_0(int bytes, boolean use_orientation);
    private static native long create_1(int bytes);
    private static native long create_2();

    // C++:  void cv::xfeatures2d::BriefDescriptorExtractor::setDescriptorSize(int bytes)
    private static native void setDescriptorSize_0(long nativeObj, int bytes);

    // C++:  int cv::xfeatures2d::BriefDescriptorExtractor::getDescriptorSize()
    private static native int getDescriptorSize_0(long nativeObj);

    // C++:  void cv::xfeatures2d::BriefDescriptorExtractor::setUseOrientation(bool use_orientation)
    private static native void setUseOrientation_0(long nativeObj, boolean use_orientation);

    // C++:  bool cv::xfeatures2d::BriefDescriptorExtractor::getUseOrientation()
    private static native boolean getUseOrientation_0(long nativeObj);

    // C++:  String cv::xfeatures2d::BriefDescriptorExtractor::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
