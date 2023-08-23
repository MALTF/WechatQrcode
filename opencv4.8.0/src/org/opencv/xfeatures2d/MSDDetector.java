//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.MSDDetector;

// C++: class MSDDetector
/**
 * Class implementing the MSD (*Maximal Self-Dissimilarity*) keypoint detector, described in CITE: Tombari14.
 *
 * The algorithm implements a novel interest point detector stemming from the intuition that image patches
 * which are highly dissimilar over a relatively large extent of their surroundings hold the property of
 * being repeatable and distinctive. This concept of "contextual self-dissimilarity" reverses the key
 * paradigm of recent successful techniques such as the Local Self-Similarity descriptor and the Non-Local
 * Means filter, which build upon the presence of similar - rather than dissimilar - patches. Moreover,
 * it extends to contextual information the local self-dissimilarity notion embedded in established
 * detectors of corner-like interest points, thereby achieving enhanced repeatability, distinctiveness and
 * localization accuracy.
 */
public class MSDDetector extends Feature2D {

    protected MSDDetector(long addr) { super(addr); }

    // internal usage only
    public static MSDDetector __fromPtr__(long addr) { return new MSDDetector(addr); }

    //
    // C++: static Ptr_MSDDetector cv::xfeatures2d::MSDDetector::create(int m_patch_radius = 3, int m_search_area_radius = 5, int m_nms_radius = 5, int m_nms_scale_radius = 0, float m_th_saliency = 250.0f, int m_kNN = 4, float m_scale_factor = 1.25f, int m_n_scales = -1, bool m_compute_orientation = false)
    //

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN, float m_scale_factor, int m_n_scales, boolean m_compute_orientation) {
        return MSDDetector.__fromPtr__(create_0(m_patch_radius, m_search_area_radius, m_nms_radius, m_nms_scale_radius, m_th_saliency, m_kNN, m_scale_factor, m_n_scales, m_compute_orientation));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN, float m_scale_factor, int m_n_scales) {
        return MSDDetector.__fromPtr__(create_1(m_patch_radius, m_search_area_radius, m_nms_radius, m_nms_scale_radius, m_th_saliency, m_kNN, m_scale_factor, m_n_scales));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN, float m_scale_factor) {
        return MSDDetector.__fromPtr__(create_2(m_patch_radius, m_search_area_radius, m_nms_radius, m_nms_scale_radius, m_th_saliency, m_kNN, m_scale_factor));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN) {
        return MSDDetector.__fromPtr__(create_3(m_patch_radius, m_search_area_radius, m_nms_radius, m_nms_scale_radius, m_th_saliency, m_kNN));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency) {
        return MSDDetector.__fromPtr__(create_4(m_patch_radius, m_search_area_radius, m_nms_radius, m_nms_scale_radius, m_th_saliency));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius) {
        return MSDDetector.__fromPtr__(create_5(m_patch_radius, m_search_area_radius, m_nms_radius, m_nms_scale_radius));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius, int m_nms_radius) {
        return MSDDetector.__fromPtr__(create_6(m_patch_radius, m_search_area_radius, m_nms_radius));
    }

    public static MSDDetector create(int m_patch_radius, int m_search_area_radius) {
        return MSDDetector.__fromPtr__(create_7(m_patch_radius, m_search_area_radius));
    }

    public static MSDDetector create(int m_patch_radius) {
        return MSDDetector.__fromPtr__(create_8(m_patch_radius));
    }

    public static MSDDetector create() {
        return MSDDetector.__fromPtr__(create_9());
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setPatchRadius(int patch_radius)
    //

    public void setPatchRadius(int patch_radius) {
        setPatchRadius_0(nativeObj, patch_radius);
    }


    //
    // C++:  int cv::xfeatures2d::MSDDetector::getPatchRadius()
    //

    public int getPatchRadius() {
        return getPatchRadius_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setSearchAreaRadius(int use_orientation)
    //

    public void setSearchAreaRadius(int use_orientation) {
        setSearchAreaRadius_0(nativeObj, use_orientation);
    }


    //
    // C++:  int cv::xfeatures2d::MSDDetector::getSearchAreaRadius()
    //

    public int getSearchAreaRadius() {
        return getSearchAreaRadius_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setNmsRadius(int nms_radius)
    //

    public void setNmsRadius(int nms_radius) {
        setNmsRadius_0(nativeObj, nms_radius);
    }


    //
    // C++:  int cv::xfeatures2d::MSDDetector::getNmsRadius()
    //

    public int getNmsRadius() {
        return getNmsRadius_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setNmsScaleRadius(int nms_scale_radius)
    //

    public void setNmsScaleRadius(int nms_scale_radius) {
        setNmsScaleRadius_0(nativeObj, nms_scale_radius);
    }


    //
    // C++:  int cv::xfeatures2d::MSDDetector::getNmsScaleRadius()
    //

    public int getNmsScaleRadius() {
        return getNmsScaleRadius_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setThSaliency(float th_saliency)
    //

    public void setThSaliency(float th_saliency) {
        setThSaliency_0(nativeObj, th_saliency);
    }


    //
    // C++:  float cv::xfeatures2d::MSDDetector::getThSaliency()
    //

    public float getThSaliency() {
        return getThSaliency_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setKNN(int kNN)
    //

    public void setKNN(int kNN) {
        setKNN_0(nativeObj, kNN);
    }


    //
    // C++:  int cv::xfeatures2d::MSDDetector::getKNN()
    //

    public int getKNN() {
        return getKNN_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setScaleFactor(float scale_factor)
    //

    public void setScaleFactor(float scale_factor) {
        setScaleFactor_0(nativeObj, scale_factor);
    }


    //
    // C++:  float cv::xfeatures2d::MSDDetector::getScaleFactor()
    //

    public float getScaleFactor() {
        return getScaleFactor_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setNScales(int use_orientation)
    //

    public void setNScales(int use_orientation) {
        setNScales_0(nativeObj, use_orientation);
    }


    //
    // C++:  int cv::xfeatures2d::MSDDetector::getNScales()
    //

    public int getNScales() {
        return getNScales_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::MSDDetector::setComputeOrientation(bool compute_orientation)
    //

    public void setComputeOrientation(boolean compute_orientation) {
        setComputeOrientation_0(nativeObj, compute_orientation);
    }


    //
    // C++:  bool cv::xfeatures2d::MSDDetector::getComputeOrientation()
    //

    public boolean getComputeOrientation() {
        return getComputeOrientation_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::MSDDetector::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_MSDDetector cv::xfeatures2d::MSDDetector::create(int m_patch_radius = 3, int m_search_area_radius = 5, int m_nms_radius = 5, int m_nms_scale_radius = 0, float m_th_saliency = 250.0f, int m_kNN = 4, float m_scale_factor = 1.25f, int m_n_scales = -1, bool m_compute_orientation = false)
    private static native long create_0(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN, float m_scale_factor, int m_n_scales, boolean m_compute_orientation);
    private static native long create_1(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN, float m_scale_factor, int m_n_scales);
    private static native long create_2(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN, float m_scale_factor);
    private static native long create_3(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency, int m_kNN);
    private static native long create_4(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius, float m_th_saliency);
    private static native long create_5(int m_patch_radius, int m_search_area_radius, int m_nms_radius, int m_nms_scale_radius);
    private static native long create_6(int m_patch_radius, int m_search_area_radius, int m_nms_radius);
    private static native long create_7(int m_patch_radius, int m_search_area_radius);
    private static native long create_8(int m_patch_radius);
    private static native long create_9();

    // C++:  void cv::xfeatures2d::MSDDetector::setPatchRadius(int patch_radius)
    private static native void setPatchRadius_0(long nativeObj, int patch_radius);

    // C++:  int cv::xfeatures2d::MSDDetector::getPatchRadius()
    private static native int getPatchRadius_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setSearchAreaRadius(int use_orientation)
    private static native void setSearchAreaRadius_0(long nativeObj, int use_orientation);

    // C++:  int cv::xfeatures2d::MSDDetector::getSearchAreaRadius()
    private static native int getSearchAreaRadius_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setNmsRadius(int nms_radius)
    private static native void setNmsRadius_0(long nativeObj, int nms_radius);

    // C++:  int cv::xfeatures2d::MSDDetector::getNmsRadius()
    private static native int getNmsRadius_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setNmsScaleRadius(int nms_scale_radius)
    private static native void setNmsScaleRadius_0(long nativeObj, int nms_scale_radius);

    // C++:  int cv::xfeatures2d::MSDDetector::getNmsScaleRadius()
    private static native int getNmsScaleRadius_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setThSaliency(float th_saliency)
    private static native void setThSaliency_0(long nativeObj, float th_saliency);

    // C++:  float cv::xfeatures2d::MSDDetector::getThSaliency()
    private static native float getThSaliency_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setKNN(int kNN)
    private static native void setKNN_0(long nativeObj, int kNN);

    // C++:  int cv::xfeatures2d::MSDDetector::getKNN()
    private static native int getKNN_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setScaleFactor(float scale_factor)
    private static native void setScaleFactor_0(long nativeObj, float scale_factor);

    // C++:  float cv::xfeatures2d::MSDDetector::getScaleFactor()
    private static native float getScaleFactor_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setNScales(int use_orientation)
    private static native void setNScales_0(long nativeObj, int use_orientation);

    // C++:  int cv::xfeatures2d::MSDDetector::getNScales()
    private static native int getNScales_0(long nativeObj);

    // C++:  void cv::xfeatures2d::MSDDetector::setComputeOrientation(bool compute_orientation)
    private static native void setComputeOrientation_0(long nativeObj, boolean compute_orientation);

    // C++:  bool cv::xfeatures2d::MSDDetector::getComputeOrientation()
    private static native boolean getComputeOrientation_0(long nativeObj);

    // C++:  String cv::xfeatures2d::MSDDetector::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
