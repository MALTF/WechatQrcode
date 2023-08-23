//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.HarrisLaplaceFeatureDetector;

// C++: class HarrisLaplaceFeatureDetector
/**
 * Class implementing the Harris-Laplace feature detector as described in CITE: Mikolajczyk2004.
 */
public class HarrisLaplaceFeatureDetector extends Feature2D {

    protected HarrisLaplaceFeatureDetector(long addr) { super(addr); }

    // internal usage only
    public static HarrisLaplaceFeatureDetector __fromPtr__(long addr) { return new HarrisLaplaceFeatureDetector(addr); }

    //
    // C++: static Ptr_HarrisLaplaceFeatureDetector cv::xfeatures2d::HarrisLaplaceFeatureDetector::create(int numOctaves = 6, float corn_thresh = 0.01f, float DOG_thresh = 0.01f, int maxCorners = 5000, int num_layers = 4)
    //

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @param maxCorners the maximum number of corners to consider
     * @param num_layers the number of intermediate scales per octave
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners, int num_layers) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_0(numOctaves, corn_thresh, DOG_thresh, maxCorners, num_layers));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @param maxCorners the maximum number of corners to consider
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_1(numOctaves, corn_thresh, DOG_thresh, maxCorners));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_2(numOctaves, corn_thresh, DOG_thresh));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_3(numOctaves, corn_thresh));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_4(numOctaves));
    }

    /**
     * Creates a new implementation instance.
     *
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create() {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_5());
    }


    //
    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setNumOctaves(int numOctaves_)
    //

    public void setNumOctaves(int numOctaves_) {
        setNumOctaves_0(nativeObj, numOctaves_);
    }


    //
    // C++:  int cv::xfeatures2d::HarrisLaplaceFeatureDetector::getNumOctaves()
    //

    public int getNumOctaves() {
        return getNumOctaves_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setCornThresh(float corn_thresh_)
    //

    public void setCornThresh(float corn_thresh_) {
        setCornThresh_0(nativeObj, corn_thresh_);
    }


    //
    // C++:  float cv::xfeatures2d::HarrisLaplaceFeatureDetector::getCornThresh()
    //

    public float getCornThresh() {
        return getCornThresh_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setDOGThresh(float DOG_thresh_)
    //

    public void setDOGThresh(float DOG_thresh_) {
        setDOGThresh_0(nativeObj, DOG_thresh_);
    }


    //
    // C++:  float cv::xfeatures2d::HarrisLaplaceFeatureDetector::getDOGThresh()
    //

    public float getDOGThresh() {
        return getDOGThresh_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setMaxCorners(int maxCorners_)
    //

    public void setMaxCorners(int maxCorners_) {
        setMaxCorners_0(nativeObj, maxCorners_);
    }


    //
    // C++:  int cv::xfeatures2d::HarrisLaplaceFeatureDetector::getMaxCorners()
    //

    public int getMaxCorners() {
        return getMaxCorners_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setNumLayers(int num_layers_)
    //

    public void setNumLayers(int num_layers_) {
        setNumLayers_0(nativeObj, num_layers_);
    }


    //
    // C++:  int cv::xfeatures2d::HarrisLaplaceFeatureDetector::getNumLayers()
    //

    public int getNumLayers() {
        return getNumLayers_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::HarrisLaplaceFeatureDetector::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_HarrisLaplaceFeatureDetector cv::xfeatures2d::HarrisLaplaceFeatureDetector::create(int numOctaves = 6, float corn_thresh = 0.01f, float DOG_thresh = 0.01f, int maxCorners = 5000, int num_layers = 4)
    private static native long create_0(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners, int num_layers);
    private static native long create_1(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners);
    private static native long create_2(int numOctaves, float corn_thresh, float DOG_thresh);
    private static native long create_3(int numOctaves, float corn_thresh);
    private static native long create_4(int numOctaves);
    private static native long create_5();

    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setNumOctaves(int numOctaves_)
    private static native void setNumOctaves_0(long nativeObj, int numOctaves_);

    // C++:  int cv::xfeatures2d::HarrisLaplaceFeatureDetector::getNumOctaves()
    private static native int getNumOctaves_0(long nativeObj);

    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setCornThresh(float corn_thresh_)
    private static native void setCornThresh_0(long nativeObj, float corn_thresh_);

    // C++:  float cv::xfeatures2d::HarrisLaplaceFeatureDetector::getCornThresh()
    private static native float getCornThresh_0(long nativeObj);

    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setDOGThresh(float DOG_thresh_)
    private static native void setDOGThresh_0(long nativeObj, float DOG_thresh_);

    // C++:  float cv::xfeatures2d::HarrisLaplaceFeatureDetector::getDOGThresh()
    private static native float getDOGThresh_0(long nativeObj);

    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setMaxCorners(int maxCorners_)
    private static native void setMaxCorners_0(long nativeObj, int maxCorners_);

    // C++:  int cv::xfeatures2d::HarrisLaplaceFeatureDetector::getMaxCorners()
    private static native int getMaxCorners_0(long nativeObj);

    // C++:  void cv::xfeatures2d::HarrisLaplaceFeatureDetector::setNumLayers(int num_layers_)
    private static native void setNumLayers_0(long nativeObj, int num_layers_);

    // C++:  int cv::xfeatures2d::HarrisLaplaceFeatureDetector::getNumLayers()
    private static native int getNumLayers_0(long nativeObj);

    // C++:  String cv::xfeatures2d::HarrisLaplaceFeatureDetector::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
