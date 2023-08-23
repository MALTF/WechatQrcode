//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.phase_unwrapping;



// C++: class Params
/**
 * Parameters of phaseUnwrapping constructor.
 *
 * width Phase map width.
 * height Phase map height.
 * histThresh Bins in the histogram are not of equal size. Default value is 3*pi*pi. The one before "histThresh" value are smaller.
 * nbrOfSmallBins Number of bins between 0 and "histThresh". Default value is 10.
 * nbrOfLargeBins Number of bins between "histThresh" and 32*pi*pi (highest edge reliability value). Default value is 5.
 */
public class HistogramPhaseUnwrapping_Params {

    protected final long nativeObj;
    protected HistogramPhaseUnwrapping_Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static HistogramPhaseUnwrapping_Params __fromPtr__(long addr) { return new HistogramPhaseUnwrapping_Params(addr); }

    //
    // C++:   cv::phase_unwrapping::HistogramPhaseUnwrapping::Params::Params()
    //

    public HistogramPhaseUnwrapping_Params() {
        nativeObj = HistogramPhaseUnwrapping_Params_0();
    }


    //
    // C++: int HistogramPhaseUnwrapping_Params::width
    //

    public int get_width() {
        return get_width_0(nativeObj);
    }


    //
    // C++: void HistogramPhaseUnwrapping_Params::width
    //

    public void set_width(int width) {
        set_width_0(nativeObj, width);
    }


    //
    // C++: int HistogramPhaseUnwrapping_Params::height
    //

    public int get_height() {
        return get_height_0(nativeObj);
    }


    //
    // C++: void HistogramPhaseUnwrapping_Params::height
    //

    public void set_height(int height) {
        set_height_0(nativeObj, height);
    }


    //
    // C++: float HistogramPhaseUnwrapping_Params::histThresh
    //

    public float get_histThresh() {
        return get_histThresh_0(nativeObj);
    }


    //
    // C++: void HistogramPhaseUnwrapping_Params::histThresh
    //

    public void set_histThresh(float histThresh) {
        set_histThresh_0(nativeObj, histThresh);
    }


    //
    // C++: int HistogramPhaseUnwrapping_Params::nbrOfSmallBins
    //

    public int get_nbrOfSmallBins() {
        return get_nbrOfSmallBins_0(nativeObj);
    }


    //
    // C++: void HistogramPhaseUnwrapping_Params::nbrOfSmallBins
    //

    public void set_nbrOfSmallBins(int nbrOfSmallBins) {
        set_nbrOfSmallBins_0(nativeObj, nbrOfSmallBins);
    }


    //
    // C++: int HistogramPhaseUnwrapping_Params::nbrOfLargeBins
    //

    public int get_nbrOfLargeBins() {
        return get_nbrOfLargeBins_0(nativeObj);
    }


    //
    // C++: void HistogramPhaseUnwrapping_Params::nbrOfLargeBins
    //

    public void set_nbrOfLargeBins(int nbrOfLargeBins) {
        set_nbrOfLargeBins_0(nativeObj, nbrOfLargeBins);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::phase_unwrapping::HistogramPhaseUnwrapping::Params::Params()
    private static native long HistogramPhaseUnwrapping_Params_0();

    // C++: int HistogramPhaseUnwrapping_Params::width
    private static native int get_width_0(long nativeObj);

    // C++: void HistogramPhaseUnwrapping_Params::width
    private static native void set_width_0(long nativeObj, int width);

    // C++: int HistogramPhaseUnwrapping_Params::height
    private static native int get_height_0(long nativeObj);

    // C++: void HistogramPhaseUnwrapping_Params::height
    private static native void set_height_0(long nativeObj, int height);

    // C++: float HistogramPhaseUnwrapping_Params::histThresh
    private static native float get_histThresh_0(long nativeObj);

    // C++: void HistogramPhaseUnwrapping_Params::histThresh
    private static native void set_histThresh_0(long nativeObj, float histThresh);

    // C++: int HistogramPhaseUnwrapping_Params::nbrOfSmallBins
    private static native int get_nbrOfSmallBins_0(long nativeObj);

    // C++: void HistogramPhaseUnwrapping_Params::nbrOfSmallBins
    private static native void set_nbrOfSmallBins_0(long nativeObj, int nbrOfSmallBins);

    // C++: int HistogramPhaseUnwrapping_Params::nbrOfLargeBins
    private static native int get_nbrOfLargeBins_0(long nativeObj);

    // C++: void HistogramPhaseUnwrapping_Params::nbrOfLargeBins
    private static native void set_nbrOfLargeBins_0(long nativeObj, int nbrOfLargeBins);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
