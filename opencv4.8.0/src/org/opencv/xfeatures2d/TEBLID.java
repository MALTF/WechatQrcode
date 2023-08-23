//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.TEBLID;

// C++: class TEBLID
/**
 * Class implementing TEBLID (Triplet-based Efficient Binary Local Image Descriptor),
 * described in CITE: Suarez2021TEBLID.
 *
 * TEBLID stands for Triplet-based Efficient Binary Local Image Descriptor, although originally it was called BAD
 * \cite Suarez2021TEBLID. It is an improvement over BEBLID \cite Suarez2020BEBLID, that uses triplet loss,
 * hard negative mining, and anchor swap to improve the image matching results.
 * It is able to describe keypoints from any detector just by changing the scale_factor parameter.
 * TEBLID is as efficient as ORB, BEBLID or BRISK, but the triplet-based training objective selected more
 * discriminative features that explain the accuracy gain. It is also more compact than BEBLID,
 * when running the [AKAZE example](https://github.com/opencv/opencv/blob/4.x/samples/cpp/tutorial_code/features2D/AKAZE_match.cpp)
 * with 10000 keypoints detected by ORB, BEBLID obtains 561 inliers (75%) with 512 bits, whereas
 * TEBLID obtains 621 (75.2%) with 256 bits. ORB obtains only 493 inliers (63%).
 *
 * If you find this code useful, please add a reference to the following paper:
 * &lt;BLOCKQUOTE&gt; Iago Suárez, José M. Buenaposada, and Luis Baumela.
 * Revisiting Binary Local Image Description for Resource Limited Devices.
 * IEEE Robotics and Automation Letters, vol. 6, no. 4, pp. 8317-8324, Oct. 2021. &lt;/BLOCKQUOTE&gt;
 *
 * The descriptor was trained in Liberty split of the UBC datasets \cite winder2007learning .
 */
public class TEBLID extends Feature2D {

    protected TEBLID(long addr) { super(addr); }

    // internal usage only
    public static TEBLID __fromPtr__(long addr) { return new TEBLID(addr); }

    // C++: enum TeblidSize (cv.xfeatures2d.TEBLID.TeblidSize)
    public static final int
            SIZE_256_BITS = 102,
            SIZE_512_BITS = 103;


    //
    // C++: static Ptr_TEBLID cv::xfeatures2d::TEBLID::create(float scale_factor, int n_bits = TEBLID::SIZE_256_BITS)
    //

    /**
     * Creates the TEBLID descriptor.
     *     @param scale_factor Adjust the sampling window around detected keypoints:
     * <ul>
     *   <li>
     *      &lt;b&gt; 1.00f &lt;/b&gt; should be the scale for ORB keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.75f &lt;/b&gt; should be the scale for SIFT detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.25f &lt;/b&gt; is default and fits for KAZE, SURF detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 5.00f &lt;/b&gt; should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints
     *   </li>
     * </ul>
     *     @param n_bits Determine the number of bits in the descriptor. Should be either
     *      TEBLID::SIZE_256_BITS or TEBLID::SIZE_512_BITS.
     * @return automatically generated
     */
    public static TEBLID create(float scale_factor, int n_bits) {
        return TEBLID.__fromPtr__(create_0(scale_factor, n_bits));
    }

    /**
     * Creates the TEBLID descriptor.
     *     @param scale_factor Adjust the sampling window around detected keypoints:
     * <ul>
     *   <li>
     *      &lt;b&gt; 1.00f &lt;/b&gt; should be the scale for ORB keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.75f &lt;/b&gt; should be the scale for SIFT detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.25f &lt;/b&gt; is default and fits for KAZE, SURF detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 5.00f &lt;/b&gt; should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints
     *   </li>
     * </ul>
     *      TEBLID::SIZE_256_BITS or TEBLID::SIZE_512_BITS.
     * @return automatically generated
     */
    public static TEBLID create(float scale_factor) {
        return TEBLID.__fromPtr__(create_1(scale_factor));
    }


    //
    // C++:  String cv::xfeatures2d::TEBLID::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TEBLID cv::xfeatures2d::TEBLID::create(float scale_factor, int n_bits = TEBLID::SIZE_256_BITS)
    private static native long create_0(float scale_factor, int n_bits);
    private static native long create_1(float scale_factor);

    // C++:  String cv::xfeatures2d::TEBLID::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
