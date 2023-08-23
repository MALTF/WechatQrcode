//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.aruco;

import java.util.ArrayList;
import java.util.List;
import org.opencv.aruco.EstimateParameters;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.objdetect.Board;
import org.opencv.objdetect.CharucoBoard;
import org.opencv.objdetect.DetectorParameters;
import org.opencv.objdetect.Dictionary;
import org.opencv.utils.Converters;

// C++: class Aruco

public class Aruco {

    // C++: enum PatternPositionType (cv.aruco.PatternPositionType)
    public static final int
            ARUCO_CCW_CENTER = 0,
            ARUCO_CW_TOP_LEFT_CORNER = 1;


    //
    // C++:  void cv::aruco::detectMarkers(Mat image, Ptr_Dictionary dictionary, vector_Mat& corners, Mat& ids, Ptr_DetectorParameters parameters = makePtr<DetectorParameters>(), vector_Mat& rejectedImgPoints = vector_Mat())
    //

    /**
     * detect markers
     * @deprecated Use class ArucoDetector::detectMarkers
     * @param image automatically generated
     * @param dictionary automatically generated
     * @param corners automatically generated
     * @param ids automatically generated
     * @param parameters automatically generated
     * @param rejectedImgPoints automatically generated
     */
    @Deprecated
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids, DetectorParameters parameters, List<Mat> rejectedImgPoints) {
        Mat corners_mat = new Mat();
        Mat rejectedImgPoints_mat = new Mat();
        detectMarkers_0(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj, parameters.getNativeObjAddr(), rejectedImgPoints_mat.nativeObj);
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedImgPoints_mat, rejectedImgPoints);
        rejectedImgPoints_mat.release();
    }

    /**
     * detect markers
     * @deprecated Use class ArucoDetector::detectMarkers
     * @param image automatically generated
     * @param dictionary automatically generated
     * @param corners automatically generated
     * @param ids automatically generated
     * @param parameters automatically generated
     */
    @Deprecated
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids, DetectorParameters parameters) {
        Mat corners_mat = new Mat();
        detectMarkers_1(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj, parameters.getNativeObjAddr());
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
    }

    /**
     * detect markers
     * @deprecated Use class ArucoDetector::detectMarkers
     * @param image automatically generated
     * @param dictionary automatically generated
     * @param corners automatically generated
     * @param ids automatically generated
     */
    @Deprecated
    public static void detectMarkers(Mat image, Dictionary dictionary, List<Mat> corners, Mat ids) {
        Mat corners_mat = new Mat();
        detectMarkers_2(image.nativeObj, dictionary.getNativeObjAddr(), corners_mat.nativeObj, ids.nativeObj);
        Converters.Mat_to_vector_Mat(corners_mat, corners);
        corners_mat.release();
    }


    //
    // C++:  void cv::aruco::refineDetectedMarkers(Mat image, Ptr_Board board, vector_Mat& detectedCorners, Mat& detectedIds, vector_Mat& rejectedCorners, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), float minRepDistance = 10.f, float errorCorrectionRate = 3.f, bool checkAllOrders = true, Mat& recoveredIdxs = Mat(), Ptr_DetectorParameters parameters = makePtr<DetectorParameters>())
    //

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param minRepDistance automatically generated
     * @param errorCorrectionRate automatically generated
     * @param checkAllOrders automatically generated
     * @param recoveredIdxs automatically generated
     * @param parameters automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, Mat recoveredIdxs, DetectorParameters parameters) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_0(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate, checkAllOrders, recoveredIdxs.nativeObj, parameters.getNativeObjAddr());
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param minRepDistance automatically generated
     * @param errorCorrectionRate automatically generated
     * @param checkAllOrders automatically generated
     * @param recoveredIdxs automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, Mat recoveredIdxs) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_1(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate, checkAllOrders, recoveredIdxs.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param minRepDistance automatically generated
     * @param errorCorrectionRate automatically generated
     * @param checkAllOrders automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_2(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate, checkAllOrders);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param minRepDistance automatically generated
     * @param errorCorrectionRate automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance, float errorCorrectionRate) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_3(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance, errorCorrectionRate);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param minRepDistance automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs, float minRepDistance) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_4(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minRepDistance);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix, Mat distCoeffs) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_5(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     * @param cameraMatrix automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners, Mat cameraMatrix) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_6(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj, cameraMatrix.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }

    /**
     * refine detected markers
     * @deprecated Use class ArucoDetector::refineDetectedMarkers
     * @param image automatically generated
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param rejectedCorners automatically generated
     */
    @Deprecated
    public static void refineDetectedMarkers(Mat image, Board board, List<Mat> detectedCorners, Mat detectedIds, List<Mat> rejectedCorners) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        Mat rejectedCorners_mat = Converters.vector_Mat_to_Mat(rejectedCorners);
        refineDetectedMarkers_7(image.nativeObj, board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, rejectedCorners_mat.nativeObj);
        Converters.Mat_to_vector_Mat(detectedCorners_mat, detectedCorners);
        detectedCorners_mat.release();
        Converters.Mat_to_vector_Mat(rejectedCorners_mat, rejectedCorners);
        rejectedCorners_mat.release();
    }


    //
    // C++:  void cv::aruco::drawPlanarBoard(Ptr_Board board, Size outSize, Mat& img, int marginSize, int borderBits)
    //

    /**
     * draw planar board
     * @deprecated Use Board::generateImage
     * @param board automatically generated
     * @param outSize automatically generated
     * @param img automatically generated
     * @param marginSize automatically generated
     * @param borderBits automatically generated
     */
    @Deprecated
    public static void drawPlanarBoard(Board board, Size outSize, Mat img, int marginSize, int borderBits) {
        drawPlanarBoard_0(board.getNativeObjAddr(), outSize.width, outSize.height, img.nativeObj, marginSize, borderBits);
    }


    //
    // C++:  void cv::aruco::getBoardObjectAndImagePoints(Ptr_Board board, vector_Mat detectedCorners, Mat detectedIds, Mat& objPoints, Mat& imgPoints)
    //

    /**
     * get board object and image points
     * @deprecated Use Board::matchImagePoints
     * @param board automatically generated
     * @param detectedCorners automatically generated
     * @param detectedIds automatically generated
     * @param objPoints automatically generated
     * @param imgPoints automatically generated
     */
    @Deprecated
    public static void getBoardObjectAndImagePoints(Board board, List<Mat> detectedCorners, Mat detectedIds, Mat objPoints, Mat imgPoints) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        getBoardObjectAndImagePoints_0(board.getNativeObjAddr(), detectedCorners_mat.nativeObj, detectedIds.nativeObj, objPoints.nativeObj, imgPoints.nativeObj);
    }


    //
    // C++:  int cv::aruco::estimatePoseBoard(vector_Mat corners, Mat ids, Ptr_Board board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    //

    /**
     * @deprecated Use cv::solvePnP
     * @param corners automatically generated
     * @param ids automatically generated
     * @param board automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvec automatically generated
     * @param tvec automatically generated
     * @param useExtrinsicGuess automatically generated
     * @return automatically generated
     */
    @Deprecated
    public static int estimatePoseBoard(List<Mat> corners, Mat ids, Board board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        return estimatePoseBoard_0(corners_mat.nativeObj, ids.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * @deprecated Use cv::solvePnP
     * @param corners automatically generated
     * @param ids automatically generated
     * @param board automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvec automatically generated
     * @param tvec automatically generated
     * @return automatically generated
     */
    @Deprecated
    public static int estimatePoseBoard(List<Mat> corners, Mat ids, Board board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        return estimatePoseBoard_1(corners_mat.nativeObj, ids.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  bool cv::aruco::estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, Ptr_CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    //

    /**
     * Pose estimation for a ChArUco board given some of their corners
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     * @param board layout of ChArUco board.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec Output vector (e.g. cv::Mat) corresponding to the rotation vector of the board
     * (see cv::Rodrigues).
     * @param tvec Output vector (e.g. cv::Mat) corresponding to the translation vector of the board.
     * @param useExtrinsicGuess defines whether initial guess for \b rvec and \b tvec will be used or not.
     *
     * This function estimates a Charuco board pose from some detected corners.
     * The function checks if the input corners are enough and valid to perform pose estimation.
     * If pose estimation is valid, returns true, else returns false.
     * SEE: use cv::drawFrameAxes to get world coordinate system axis for object points
     * @return automatically generated
     */
    public static boolean estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        return estimatePoseCharucoBoard_0(charucoCorners.nativeObj, charucoIds.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Pose estimation for a ChArUco board given some of their corners
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     * @param board layout of ChArUco board.
     * @param cameraMatrix input 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvec Output vector (e.g. cv::Mat) corresponding to the rotation vector of the board
     * (see cv::Rodrigues).
     * @param tvec Output vector (e.g. cv::Mat) corresponding to the translation vector of the board.
     *
     * This function estimates a Charuco board pose from some detected corners.
     * The function checks if the input corners are enough and valid to perform pose estimation.
     * If pose estimation is valid, returns true, else returns false.
     * SEE: use cv::drawFrameAxes to get world coordinate system axis for object points
     * @return automatically generated
     */
    public static boolean estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        return estimatePoseCharucoBoard_1(charucoCorners.nativeObj, charucoIds.nativeObj, board.getNativeObjAddr(), cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  void cv::aruco::estimatePoseSingleMarkers(vector_Mat corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat& rvecs, Mat& tvecs, Mat& objPoints = Mat(), Ptr_EstimateParameters estimateParameters = makePtr<EstimateParameters>())
    //

    /**
     * @deprecated Use cv::solvePnP
     * @param corners automatically generated
     * @param markerLength automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param objPoints automatically generated
     * @param estimateParameters automatically generated
     */
    @Deprecated
    public static void estimatePoseSingleMarkers(List<Mat> corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat rvecs, Mat tvecs, Mat objPoints, EstimateParameters estimateParameters) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        estimatePoseSingleMarkers_0(corners_mat.nativeObj, markerLength, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs.nativeObj, tvecs.nativeObj, objPoints.nativeObj, estimateParameters.getNativeObjAddr());
    }

    /**
     * @deprecated Use cv::solvePnP
     * @param corners automatically generated
     * @param markerLength automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param objPoints automatically generated
     */
    @Deprecated
    public static void estimatePoseSingleMarkers(List<Mat> corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat rvecs, Mat tvecs, Mat objPoints) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        estimatePoseSingleMarkers_1(corners_mat.nativeObj, markerLength, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs.nativeObj, tvecs.nativeObj, objPoints.nativeObj);
    }

    /**
     * @deprecated Use cv::solvePnP
     * @param corners automatically generated
     * @param markerLength automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     */
    @Deprecated
    public static void estimatePoseSingleMarkers(List<Mat> corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat rvecs, Mat tvecs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        estimatePoseSingleMarkers_2(corners_mat.nativeObj, markerLength, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs.nativeObj, tvecs.nativeObj);
    }


    //
    // C++:  bool cv::aruco::testCharucoCornersCollinear(Ptr_CharucoBoard board, Mat charucoIds)
    //

    /**
     * @deprecated Use CharucoBoard::checkCharucoCornersCollinear
     * @param board automatically generated
     * @param charucoIds automatically generated
     * @return automatically generated
     */
    @Deprecated
    public static boolean testCharucoCornersCollinear(CharucoBoard board, Mat charucoIds) {
        return testCharucoCornersCollinear_0(board.getNativeObjAddr(), charucoIds.nativeObj);
    }


    //
    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * Calibrate a camera using aruco markers
     *
     * @param corners vector of detected marker corners in all frames.
     * The corners should have the same format returned by detectMarkers (see #detectMarkers).
     * @param ids list of identifiers for each marker in corners
     * @param counter number of markers in each frame so that corners and ids can be split
     * @param board Marker Board layout
     * @param imageSize Size of the image used only to initialize the intrinsic camera matrix.
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     * @param criteria Termination criteria for the iterative optimization algorithm.
     *
     * This function calibrates a camera using an Aruco Board. The function receives a list of
     * detected markers from several views of the Board. The process is similar to the chessboard
     * calibration in calibrateCamera(). The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraArucoExtended(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags, TermCriteria criteria) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraArucoExtended_0(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using aruco markers
     *
     * @param corners vector of detected marker corners in all frames.
     * The corners should have the same format returned by detectMarkers (see #detectMarkers).
     * @param ids list of identifiers for each marker in corners
     * @param counter number of markers in each frame so that corners and ids can be split
     * @param board Marker Board layout
     * @param imageSize Size of the image used only to initialize the intrinsic camera matrix.
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     *
     * This function calibrates a camera using an Aruco Board. The function receives a list of
     * detected markers from several views of the Board. The process is similar to the chessboard
     * calibration in calibrateCamera(). The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraArucoExtended(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraArucoExtended_1(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using aruco markers
     *
     * @param corners vector of detected marker corners in all frames.
     * The corners should have the same format returned by detectMarkers (see #detectMarkers).
     * @param ids list of identifiers for each marker in corners
     * @param counter number of markers in each frame so that corners and ids can be split
     * @param board Marker Board layout
     * @param imageSize Size of the image used only to initialize the intrinsic camera matrix.
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     *
     * This function calibrates a camera using an Aruco Board. The function receives a list of
     * detected markers from several views of the Board. The process is similar to the chessboard
     * calibration in calibrateCamera(). The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraArucoExtended(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraArucoExtended_2(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }


    //
    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     *
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @param criteria automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_0(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     *
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_1(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     *
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_2(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     *
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        Mat rvecs_mat = new Mat();
        double retVal = calibrateCameraAruco_3(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        return retVal;
    }

    /**
     *
     * It's the same function as #calibrateCameraAruco but without calibration error estimation.
     * @param corners automatically generated
     * @param ids automatically generated
     * @param counter automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraAruco(List<Mat> corners, Mat ids, Mat counter, Board board, Size imageSize, Mat cameraMatrix, Mat distCoeffs) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        return calibrateCameraAruco_4(corners_mat.nativeObj, ids.nativeObj, counter.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }


    //
    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria( TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * Calibrate a camera using Charuco corners
     *
     * @param charucoCorners vector of detected charuco corners per frame
     * @param charucoIds list of identifiers for each corner in charucoCorners per frame
     * @param board Marker Board layout
     * @param imageSize input image size
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     * @param criteria Termination criteria for the iterative optimization algorithm.
     *
     * This function calibrates a camera using a set of corners of a  Charuco Board. The function
     * receives a list of detected corners and its identifiers from several views of the Board.
     * The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraCharucoExtended(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags, TermCriteria criteria) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharucoExtended_0(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using Charuco corners
     *
     * @param charucoCorners vector of detected charuco corners per frame
     * @param charucoIds list of identifiers for each corner in charucoCorners per frame
     * @param board Marker Board layout
     * @param imageSize input image size
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     * @param flags flags Different flags  for the calibration process (see #calibrateCamera for details).
     *
     * This function calibrates a camera using a set of corners of a  Charuco Board. The function
     * receives a list of detected corners and its identifiers from several views of the Board.
     * The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraCharucoExtended(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors, int flags) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharucoExtended_1(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Calibrate a camera using Charuco corners
     *
     * @param charucoCorners vector of detected charuco corners per frame
     * @param charucoIds list of identifiers for each corner in charucoCorners per frame
     * @param board Marker Board layout
     * @param imageSize input image size
     * @param cameraMatrix Output 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) . If CV\_CALIB\_USE\_INTRINSIC\_GUESS
     * and/or CV_CALIB_FIX_ASPECT_RATIO are specified, some or all of fx, fy, cx, cy must be
     * initialized before calling the function.
     * @param distCoeffs Output vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param rvecs Output vector of rotation vectors (see Rodrigues ) estimated for each board view
     * (e.g. std::vector&lt;cv::Mat&gt;&gt;). That is, each k-th rotation vector together with the corresponding
     * k-th translation vector (see the next output parameter description) brings the board pattern
     * from the model coordinate space (in which object points are specified) to the world coordinate
     * space, that is, a real position of the board pattern in the k-th pattern view (k=0.. *M* -1).
     * @param tvecs Output vector of translation vectors estimated for each pattern view.
     * @param stdDeviationsIntrinsics Output vector of standard deviations estimated for intrinsic parameters.
     * Order of deviations values:
     * \((f_x, f_y, c_x, c_y, k_1, k_2, p_1, p_2, k_3, k_4, k_5, k_6 , s_1, s_2, s_3,
     * s_4, \tau_x, \tau_y)\) If one of parameters is not estimated, it's deviation is equals to zero.
     * @param stdDeviationsExtrinsics Output vector of standard deviations estimated for extrinsic parameters.
     * Order of deviations values: \((R_1, T_1, \dotsc , R_M, T_M)\) where M is number of pattern views,
     * \(R_i, T_i\) are concatenated 1x3 vectors.
     * @param perViewErrors Output vector of average re-projection errors estimated for each pattern view.
     *
     * This function calibrates a camera using a set of corners of a  Charuco Board. The function
     * receives a list of detected corners and its identifiers from several views of the Board.
     * The function returns the final re-projection error.
     * @return automatically generated
     */
    public static double calibrateCameraCharucoExtended(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, Mat stdDeviationsIntrinsics, Mat stdDeviationsExtrinsics, Mat perViewErrors) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharucoExtended_2(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, stdDeviationsIntrinsics.nativeObj, stdDeviationsExtrinsics.nativeObj, perViewErrors.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }


    //
    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    //

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @param criteria automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags, TermCriteria criteria) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_0(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @param flags automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_1(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @param tvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_2(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @param rvecs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        Mat rvecs_mat = new Mat();
        double retVal = calibrateCameraCharuco_3(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        return retVal;
    }

    /**
     * It's the same function as #calibrateCameraCharuco but without calibration error estimation.
     * @param charucoCorners automatically generated
     * @param charucoIds automatically generated
     * @param board automatically generated
     * @param imageSize automatically generated
     * @param cameraMatrix automatically generated
     * @param distCoeffs automatically generated
     * @return automatically generated
     */
    public static double calibrateCameraCharuco(List<Mat> charucoCorners, List<Mat> charucoIds, CharucoBoard board, Size imageSize, Mat cameraMatrix, Mat distCoeffs) {
        Mat charucoCorners_mat = Converters.vector_Mat_to_Mat(charucoCorners);
        Mat charucoIds_mat = Converters.vector_Mat_to_Mat(charucoIds);
        return calibrateCameraCharuco_4(charucoCorners_mat.nativeObj, charucoIds_mat.nativeObj, board.getNativeObjAddr(), imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }


    //
    // C++:  int cv::aruco::interpolateCornersCharuco(vector_Mat markerCorners, Mat markerIds, Mat image, Ptr_CharucoBoard board, Mat& charucoCorners, Mat& charucoIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), int minMarkers = 2)
    //

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * @param cameraMatrix optional 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     * @param minMarkers number of adjacent markers that must be detected to return a charuco corner
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     *
     * @deprecated Use CharucoDetector::detectBoard
     * @return automatically generated
     */
    @Deprecated
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds, Mat cameraMatrix, Mat distCoeffs, int minMarkers) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_0(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, minMarkers);
    }

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * @param cameraMatrix optional 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * @param distCoeffs optional vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     *
     * @deprecated Use CharucoDetector::detectBoard
     * @return automatically generated
     */
    @Deprecated
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds, Mat cameraMatrix, Mat distCoeffs) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_1(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * @param cameraMatrix optional 3x3 floating-point camera matrix
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     *
     * @deprecated Use CharucoDetector::detectBoard
     * @return automatically generated
     */
    @Deprecated
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds, Mat cameraMatrix) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_2(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj, cameraMatrix.nativeObj);
    }

    /**
     * Interpolate position of ChArUco board corners
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param markerIds list of identifiers for each marker in corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param board layout of ChArUco board.
     * @param charucoCorners interpolated chessboard corners
     * @param charucoIds interpolated chessboard corners identifiers
     * \(A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\)
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6],[s_1, s_2, s_3, s_4]])\) of 4, 5, 8 or 12 elements
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers. If camera parameters are provided,
     * the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is
     * also returned in charucoIds.
     * The function returns the number of interpolated corners.
     *
     * @deprecated Use CharucoDetector::detectBoard
     * @return automatically generated
     */
    @Deprecated
    public static int interpolateCornersCharuco(List<Mat> markerCorners, Mat markerIds, Mat image, CharucoBoard board, Mat charucoCorners, Mat charucoIds) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        return interpolateCornersCharuco_3(markerCorners_mat.nativeObj, markerIds.nativeObj, image.nativeObj, board.getNativeObjAddr(), charucoCorners.nativeObj, charucoIds.nativeObj);
    }


    //
    // C++:  void cv::aruco::detectCharucoDiamond(Mat image, vector_Mat markerCorners, Mat markerIds, float squareMarkerLengthRate, vector_Mat& diamondCorners, Mat& diamondIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), Ptr_Dictionary dictionary = makePtr<Dictionary> (getPredefinedDictionary(PredefinedDictionaryType::DICT_4X4_50)))
    //

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     * @param cameraMatrix Optional camera calibration matrix.
     * @param distCoeffs Optional camera distortion coefficients.
     * @param dictionary dictionary of markers indicating the type of markers.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection, but less accurate.
     *
     * @deprecated Use CharucoDetector::detectDiamonds
     */
    @Deprecated
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds, Mat cameraMatrix, Mat distCoeffs, Dictionary dictionary) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_0(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, dictionary.getNativeObjAddr());
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     * @param cameraMatrix Optional camera calibration matrix.
     * @param distCoeffs Optional camera distortion coefficients.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection, but less accurate.
     *
     * @deprecated Use CharucoDetector::detectDiamonds
     */
    @Deprecated
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds, Mat cameraMatrix, Mat distCoeffs) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_1(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     * @param cameraMatrix Optional camera calibration matrix.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection, but less accurate.
     *
     * @deprecated Use CharucoDetector::detectDiamonds
     */
    @Deprecated
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds, Mat cameraMatrix) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_2(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj, cameraMatrix.nativeObj);
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }

    /**
     * Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * @param markerIds list of marker ids in markerCorners.
     * @param squareMarkerLengthRate rate between square and marker length:
     * squareMarkerLengthRate = squareLength/markerLength. The real units are not necessary.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection, but less accurate.
     *
     * @deprecated Use CharucoDetector::detectDiamonds
     */
    @Deprecated
    public static void detectCharucoDiamond(Mat image, List<Mat> markerCorners, Mat markerIds, float squareMarkerLengthRate, List<Mat> diamondCorners, Mat diamondIds) {
        Mat markerCorners_mat = Converters.vector_Mat_to_Mat(markerCorners);
        Mat diamondCorners_mat = new Mat();
        detectCharucoDiamond_3(image.nativeObj, markerCorners_mat.nativeObj, markerIds.nativeObj, squareMarkerLengthRate, diamondCorners_mat.nativeObj, diamondIds.nativeObj);
        Converters.Mat_to_vector_Mat(diamondCorners_mat, diamondCorners);
        diamondCorners_mat.release();
    }


    //
    // C++:  void cv::aruco::drawCharucoDiamond(Ptr_Dictionary dictionary, Vec4i ids, int squareLength, int markerLength, Mat& img, int marginSize = 0, int borderBits = 1)
    //

    // Unknown type 'Vec4i' (I), skipping the function




    // C++:  void cv::aruco::detectMarkers(Mat image, Ptr_Dictionary dictionary, vector_Mat& corners, Mat& ids, Ptr_DetectorParameters parameters = makePtr<DetectorParameters>(), vector_Mat& rejectedImgPoints = vector_Mat())
    private static native void detectMarkers_0(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, long parameters_nativeObj, long rejectedImgPoints_mat_nativeObj);
    private static native void detectMarkers_1(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, long parameters_nativeObj);
    private static native void detectMarkers_2(long image_nativeObj, long dictionary_nativeObj, long corners_mat_nativeObj, long ids_nativeObj);

    // C++:  void cv::aruco::refineDetectedMarkers(Mat image, Ptr_Board board, vector_Mat& detectedCorners, Mat& detectedIds, vector_Mat& rejectedCorners, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), float minRepDistance = 10.f, float errorCorrectionRate = 3.f, bool checkAllOrders = true, Mat& recoveredIdxs = Mat(), Ptr_DetectorParameters parameters = makePtr<DetectorParameters>())
    private static native void refineDetectedMarkers_0(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, long recoveredIdxs_nativeObj, long parameters_nativeObj);
    private static native void refineDetectedMarkers_1(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders, long recoveredIdxs_nativeObj);
    private static native void refineDetectedMarkers_2(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate, boolean checkAllOrders);
    private static native void refineDetectedMarkers_3(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance, float errorCorrectionRate);
    private static native void refineDetectedMarkers_4(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, float minRepDistance);
    private static native void refineDetectedMarkers_5(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);
    private static native void refineDetectedMarkers_6(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj, long cameraMatrix_nativeObj);
    private static native void refineDetectedMarkers_7(long image_nativeObj, long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long rejectedCorners_mat_nativeObj);

    // C++:  void cv::aruco::drawPlanarBoard(Ptr_Board board, Size outSize, Mat& img, int marginSize, int borderBits)
    private static native void drawPlanarBoard_0(long board_nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize, int borderBits);

    // C++:  void cv::aruco::getBoardObjectAndImagePoints(Ptr_Board board, vector_Mat detectedCorners, Mat detectedIds, Mat& objPoints, Mat& imgPoints)
    private static native void getBoardObjectAndImagePoints_0(long board_nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long objPoints_nativeObj, long imgPoints_nativeObj);

    // C++:  int cv::aruco::estimatePoseBoard(vector_Mat corners, Mat ids, Ptr_Board board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    private static native int estimatePoseBoard_0(long corners_mat_nativeObj, long ids_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native int estimatePoseBoard_1(long corners_mat_nativeObj, long ids_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  bool cv::aruco::estimatePoseCharucoBoard(Mat charucoCorners, Mat charucoIds, Ptr_CharucoBoard board, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    private static native boolean estimatePoseCharucoBoard_0(long charucoCorners_nativeObj, long charucoIds_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native boolean estimatePoseCharucoBoard_1(long charucoCorners_nativeObj, long charucoIds_nativeObj, long board_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  void cv::aruco::estimatePoseSingleMarkers(vector_Mat corners, float markerLength, Mat cameraMatrix, Mat distCoeffs, Mat& rvecs, Mat& tvecs, Mat& objPoints = Mat(), Ptr_EstimateParameters estimateParameters = makePtr<EstimateParameters>())
    private static native void estimatePoseSingleMarkers_0(long corners_mat_nativeObj, float markerLength, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_nativeObj, long tvecs_nativeObj, long objPoints_nativeObj, long estimateParameters_nativeObj);
    private static native void estimatePoseSingleMarkers_1(long corners_mat_nativeObj, float markerLength, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_nativeObj, long tvecs_nativeObj, long objPoints_nativeObj);
    private static native void estimatePoseSingleMarkers_2(long corners_mat_nativeObj, float markerLength, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_nativeObj, long tvecs_nativeObj);

    // C++:  bool cv::aruco::testCharucoCornersCollinear(Ptr_CharucoBoard board, Mat charucoIds)
    private static native boolean testCharucoCornersCollinear_0(long board_nativeObj, long charucoIds_nativeObj);

    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraArucoExtended_0(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraArucoExtended_1(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags);
    private static native double calibrateCameraArucoExtended_2(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj);

    // C++:  double cv::aruco::calibrateCameraAruco(vector_Mat corners, Mat ids, Mat counter, Ptr_Board board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraAruco_0(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraAruco_1(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags);
    private static native double calibrateCameraAruco_2(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj);
    private static native double calibrateCameraAruco_3(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj);
    private static native double calibrateCameraAruco_4(long corners_mat_nativeObj, long ids_nativeObj, long counter_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, Mat& stdDeviationsIntrinsics, Mat& stdDeviationsExtrinsics, Mat& perViewErrors, int flags = 0, TermCriteria criteria = TermCriteria( TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraCharucoExtended_0(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraCharucoExtended_1(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj, int flags);
    private static native double calibrateCameraCharucoExtended_2(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, long stdDeviationsIntrinsics_nativeObj, long stdDeviationsExtrinsics_nativeObj, long perViewErrors_nativeObj);

    // C++:  double cv::aruco::calibrateCameraCharuco(vector_Mat charucoCorners, vector_Mat charucoIds, Ptr_CharucoBoard board, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs = vector_Mat(), vector_Mat& tvecs = vector_Mat(), int flags = 0, TermCriteria criteria = TermCriteria(TermCriteria::COUNT + TermCriteria::EPS, 30, DBL_EPSILON))
    private static native double calibrateCameraCharuco_0(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double calibrateCameraCharuco_1(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags);
    private static native double calibrateCameraCharuco_2(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj);
    private static native double calibrateCameraCharuco_3(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj);
    private static native double calibrateCameraCharuco_4(long charucoCorners_mat_nativeObj, long charucoIds_mat_nativeObj, long board_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  int cv::aruco::interpolateCornersCharuco(vector_Mat markerCorners, Mat markerIds, Mat image, Ptr_CharucoBoard board, Mat& charucoCorners, Mat& charucoIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), int minMarkers = 2)
    private static native int interpolateCornersCharuco_0(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, int minMarkers);
    private static native int interpolateCornersCharuco_1(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);
    private static native int interpolateCornersCharuco_2(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, long cameraMatrix_nativeObj);
    private static native int interpolateCornersCharuco_3(long markerCorners_mat_nativeObj, long markerIds_nativeObj, long image_nativeObj, long board_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj);

    // C++:  void cv::aruco::detectCharucoDiamond(Mat image, vector_Mat markerCorners, Mat markerIds, float squareMarkerLengthRate, vector_Mat& diamondCorners, Mat& diamondIds, Mat cameraMatrix = Mat(), Mat distCoeffs = Mat(), Ptr_Dictionary dictionary = makePtr<Dictionary> (getPredefinedDictionary(PredefinedDictionaryType::DICT_4X4_50)))
    private static native void detectCharucoDiamond_0(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long dictionary_nativeObj);
    private static native void detectCharucoDiamond_1(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);
    private static native void detectCharucoDiamond_2(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, long cameraMatrix_nativeObj);
    private static native void detectCharucoDiamond_3(long image_nativeObj, long markerCorners_mat_nativeObj, long markerIds_nativeObj, float squareMarkerLengthRate, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj);

}
