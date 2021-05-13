//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.legacy_Tracker;
import org.opencv.tracking.legacy_TrackerMOSSE;

// C++: class TrackerMOSSE
/**
 * the MOSSE (Minimum Output Sum of Squared %Error) tracker
 *
 * The implementation is based on CITE: MOSSE Visual Object Tracking using Adaptive Correlation Filters
 * <b>Note:</b> this tracker works with grayscale images, if passed bgr ones, they will get converted internally.
 */
public class legacy_TrackerMOSSE extends legacy_Tracker {

    protected legacy_TrackerMOSSE(long addr) { super(addr); }

    // internal usage only
    public static legacy_TrackerMOSSE __fromPtr__(long addr) { return new legacy_TrackerMOSSE(addr); }

    //
    // C++: static Ptr_legacy_TrackerMOSSE cv::legacy::TrackerMOSSE::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static legacy_TrackerMOSSE create() {
        return legacy_TrackerMOSSE.__fromPtr__(create_0());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_legacy_TrackerMOSSE cv::legacy::TrackerMOSSE::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
