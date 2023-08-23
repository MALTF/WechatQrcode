//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

// C++: class FastLineDetector
/**
 * Class implementing the FLD (Fast Line Detector) algorithm described
 * in CITE: Lee14 .
 */
public class FastLineDetector extends Algorithm {

    protected FastLineDetector(long addr) { super(addr); }

    // internal usage only
    public static FastLineDetector __fromPtr__(long addr) { return new FastLineDetector(addr); }

    //
    // C++:  void cv::ximgproc::FastLineDetector::detect(Mat image, Mat& lines)
    //

    /**
     * Finds lines in the input image.
     *       This is the output of the default parameters of the algorithm on the above
     *       shown image.
     *
     *       ![image](pics/corridor_fld.jpg)
     *
     *       @param image A grayscale (CV_8UC1) input image. If only a roi needs to be
     *       selected, use: `fld_ptr-&gt;detect(image(roi), lines, ...);
     *       lines += Scalar(roi.x, roi.y, roi.x, roi.y);`
     *       @param lines A vector of Vec4f elements specifying the beginning
     *       and ending point of a line.  Where Vec4f is (x1, y1, x2, y2), point
     *       1 is the start, point 2 - end. Returned lines are directed so that the
     *       brighter side is on their left.
     */
    public void detect(Mat image, Mat lines) {
        detect_0(nativeObj, image.nativeObj, lines.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::FastLineDetector::drawSegments(Mat& image, Mat lines, bool draw_arrow = false, Scalar linecolor = Scalar(0, 0, 255), int linethickness = 1)
    //

    /**
     * Draws the line segments on a given image.
     *       @param image The image, where the lines will be drawn. Should be bigger
     *       or equal to the image, where the lines were found.
     *       @param lines A vector of the lines that needed to be drawn.
     *       @param draw_arrow If true, arrow heads will be drawn.
     *       @param linecolor Line color.
     *       @param linethickness Line thickness.
     */
    public void drawSegments(Mat image, Mat lines, boolean draw_arrow, Scalar linecolor, int linethickness) {
        drawSegments_0(nativeObj, image.nativeObj, lines.nativeObj, draw_arrow, linecolor.val[0], linecolor.val[1], linecolor.val[2], linecolor.val[3], linethickness);
    }

    /**
     * Draws the line segments on a given image.
     *       @param image The image, where the lines will be drawn. Should be bigger
     *       or equal to the image, where the lines were found.
     *       @param lines A vector of the lines that needed to be drawn.
     *       @param draw_arrow If true, arrow heads will be drawn.
     *       @param linecolor Line color.
     */
    public void drawSegments(Mat image, Mat lines, boolean draw_arrow, Scalar linecolor) {
        drawSegments_1(nativeObj, image.nativeObj, lines.nativeObj, draw_arrow, linecolor.val[0], linecolor.val[1], linecolor.val[2], linecolor.val[3]);
    }

    /**
     * Draws the line segments on a given image.
     *       @param image The image, where the lines will be drawn. Should be bigger
     *       or equal to the image, where the lines were found.
     *       @param lines A vector of the lines that needed to be drawn.
     *       @param draw_arrow If true, arrow heads will be drawn.
     */
    public void drawSegments(Mat image, Mat lines, boolean draw_arrow) {
        drawSegments_2(nativeObj, image.nativeObj, lines.nativeObj, draw_arrow);
    }

    /**
     * Draws the line segments on a given image.
     *       @param image The image, where the lines will be drawn. Should be bigger
     *       or equal to the image, where the lines were found.
     *       @param lines A vector of the lines that needed to be drawn.
     */
    public void drawSegments(Mat image, Mat lines) {
        drawSegments_3(nativeObj, image.nativeObj, lines.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::FastLineDetector::detect(Mat image, Mat& lines)
    private static native void detect_0(long nativeObj, long image_nativeObj, long lines_nativeObj);

    // C++:  void cv::ximgproc::FastLineDetector::drawSegments(Mat& image, Mat lines, bool draw_arrow = false, Scalar linecolor = Scalar(0, 0, 255), int linethickness = 1)
    private static native void drawSegments_0(long nativeObj, long image_nativeObj, long lines_nativeObj, boolean draw_arrow, double linecolor_val0, double linecolor_val1, double linecolor_val2, double linecolor_val3, int linethickness);
    private static native void drawSegments_1(long nativeObj, long image_nativeObj, long lines_nativeObj, boolean draw_arrow, double linecolor_val0, double linecolor_val1, double linecolor_val2, double linecolor_val3);
    private static native void drawSegments_2(long nativeObj, long image_nativeObj, long lines_nativeObj, boolean draw_arrow);
    private static native void drawSegments_3(long nativeObj, long image_nativeObj, long lines_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
