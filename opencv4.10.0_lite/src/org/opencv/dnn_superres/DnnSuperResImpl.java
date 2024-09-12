//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.dnn_superres;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.dnn_superres.DnnSuperResImpl;
import org.opencv.utils.Converters;

// C++: class DnnSuperResImpl
/**
 * A class to upscale images via convolutional neural networks.
 * The following four models are implemented:
 *
 * <ul>
 *   <li>
 *  edsr
 *   </li>
 *   <li>
 *  espcn
 *   </li>
 *   <li>
 *  fsrcnn
 *   </li>
 *   <li>
 *  lapsrn
 *   </li>
 * </ul>
 */
public class DnnSuperResImpl {

    protected final long nativeObj;
    protected DnnSuperResImpl(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static DnnSuperResImpl __fromPtr__(long addr) { return new DnnSuperResImpl(addr); }

    //
    // C++: static Ptr_DnnSuperResImpl cv::dnn_superres::DnnSuperResImpl::create()
    //

    /**
     * Empty constructor for python
     * @return automatically generated
     */
    public static DnnSuperResImpl create() {
        return DnnSuperResImpl.__fromPtr__(create_0());
    }


    //
    // C++:  void cv::dnn_superres::DnnSuperResImpl::readModel(String path)
    //

    /**
     * Read the model from the given path
     *     @param path Path to the model file.
     */
    public void readModel(String path) {
        readModel_0(nativeObj, path);
    }


    //
    // C++:  void cv::dnn_superres::DnnSuperResImpl::setModel(String algo, int scale)
    //

    /**
     * Set desired model
     *     @param algo String containing one of the desired models:
     * <ul>
     *   <li>
     *          __edsr__
     *   </li>
     *   <li>
     *          __espcn__
     *   </li>
     *   <li>
     *          __fsrcnn__
     *   </li>
     *   <li>
     *          __lapsrn__
     *   </li>
     * </ul>
     *     @param scale Integer specifying the upscale factor
     */
    public void setModel(String algo, int scale) {
        setModel_0(nativeObj, algo, scale);
    }


    //
    // C++:  void cv::dnn_superres::DnnSuperResImpl::setPreferableBackend(int backendId)
    //

    /**
     * Set computation backend
     * @param backendId automatically generated
     */
    public void setPreferableBackend(int backendId) {
        setPreferableBackend_0(nativeObj, backendId);
    }


    //
    // C++:  void cv::dnn_superres::DnnSuperResImpl::setPreferableTarget(int targetId)
    //

    /**
     * Set computation target
     * @param targetId automatically generated
     */
    public void setPreferableTarget(int targetId) {
        setPreferableTarget_0(nativeObj, targetId);
    }


    //
    // C++:  void cv::dnn_superres::DnnSuperResImpl::upsample(Mat img, Mat& result)
    //

    /**
     * Upsample via neural network
     *     @param img Image to upscale
     *     @param result Destination upscaled image
     */
    public void upsample(Mat img, Mat result) {
        upsample_0(nativeObj, img.nativeObj, result.nativeObj);
    }


    //
    // C++:  void cv::dnn_superres::DnnSuperResImpl::upsampleMultioutput(Mat img, vector_Mat imgs_new, vector_int scale_factors, vector_String node_names)
    //

    /**
     * Upsample via neural network of multiple outputs
     *     @param img Image to upscale
     *     @param imgs_new Destination upscaled images
     *     @param scale_factors Scaling factors of the output nodes
     *     @param node_names Names of the output nodes in the neural network
     */
    public void upsampleMultioutput(Mat img, List<Mat> imgs_new, MatOfInt scale_factors, List<String> node_names) {
        Mat imgs_new_mat = Converters.vector_Mat_to_Mat(imgs_new);
        Mat scale_factors_mat = scale_factors;
        upsampleMultioutput_0(nativeObj, img.nativeObj, imgs_new_mat.nativeObj, scale_factors_mat.nativeObj, node_names);
    }


    //
    // C++:  int cv::dnn_superres::DnnSuperResImpl::getScale()
    //

    /**
     * Returns the scale factor of the model:
     *     @return Current scale factor.
     */
    public int getScale() {
        return getScale_0(nativeObj);
    }


    //
    // C++:  String cv::dnn_superres::DnnSuperResImpl::getAlgorithm()
    //

    /**
     * Returns the scale factor of the model:
     *     @return Current algorithm.
     */
    public String getAlgorithm() {
        return getAlgorithm_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DnnSuperResImpl cv::dnn_superres::DnnSuperResImpl::create()
    private static native long create_0();

    // C++:  void cv::dnn_superres::DnnSuperResImpl::readModel(String path)
    private static native void readModel_0(long nativeObj, String path);

    // C++:  void cv::dnn_superres::DnnSuperResImpl::setModel(String algo, int scale)
    private static native void setModel_0(long nativeObj, String algo, int scale);

    // C++:  void cv::dnn_superres::DnnSuperResImpl::setPreferableBackend(int backendId)
    private static native void setPreferableBackend_0(long nativeObj, int backendId);

    // C++:  void cv::dnn_superres::DnnSuperResImpl::setPreferableTarget(int targetId)
    private static native void setPreferableTarget_0(long nativeObj, int targetId);

    // C++:  void cv::dnn_superres::DnnSuperResImpl::upsample(Mat img, Mat& result)
    private static native void upsample_0(long nativeObj, long img_nativeObj, long result_nativeObj);

    // C++:  void cv::dnn_superres::DnnSuperResImpl::upsampleMultioutput(Mat img, vector_Mat imgs_new, vector_int scale_factors, vector_String node_names)
    private static native void upsampleMultioutput_0(long nativeObj, long img_nativeObj, long imgs_new_mat_nativeObj, long scale_factors_mat_nativeObj, List<String> node_names);

    // C++:  int cv::dnn_superres::DnnSuperResImpl::getScale()
    private static native int getScale_0(long nativeObj);

    // C++:  String cv::dnn_superres::DnnSuperResImpl::getAlgorithm()
    private static native String getAlgorithm_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
