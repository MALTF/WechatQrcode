package com.malt.qrcode;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import org.opencv.wechat_qrcode.WeChatQRCode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author by maliang on 2021/5/13 13:23
 * #First Created Time:
 * #包名：com.malt.qrcode
 * class description:初始化WeChatQRCode
 */
public class WechatQr {
    public static WeChatQRCode init(Context context) {
        String rootInSdk = (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)
                ? Environment.getExternalStorageDirectory().getAbsolutePath() : Environment.getRootDirectory().getAbsolutePath()) + "/";
        String zipFile = "qr_module.zip";

        String dst = rootInSdk + zipFile;
        copyAssetsOne(context, zipFile, dst);

        unZip(new File(dst), rootInSdk);
        String modeDirInSdCard = rootInSdk + "qr_module/";

        return new WeChatQRCode(modeDirInSdCard + "detect_prototxt",
                modeDirInSdCard + "detect_caffemodel",
                modeDirInSdCard + "sr_prototxt",
                modeDirInSdCard + "sr_caffemodel");
    }


    /**
     * 解压文件
     *
     * @param srcFile     源文件
     * @param destDirPath 路径
     * @throws RuntimeException e
     */
    public static void unZip(File srcFile, String destDirPath) throws RuntimeException {
        long start = System.currentTimeMillis();
        // 判断源文件是否存在
        if (!srcFile.exists()) {
            throw new RuntimeException(srcFile.getPath() + "所指文件不存在");
        }
        // 开始解压
        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile(srcFile);
            Enumeration<?> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                System.out.println("解压" + entry.getName());
                if (entry.isDirectory()) {
                    String dirPath = destDirPath + "/" + entry.getName();
                    File dir = new File(dirPath);
                    dir.mkdirs();
                } else {
                    // 如果是文件，就先创建一个文件，然后用io流把内容copy过去
                    File targetFile = new File(destDirPath + "/" + entry.getName());
                    // 保证这个文件的父文件夹必须要存在
                    if (!targetFile.getParentFile().exists()) {
                        targetFile.getParentFile().mkdirs();
                    }
                    targetFile.createNewFile();
                    // 将压缩文件内容写入到这个文件中
                    InputStream is = zipFile.getInputStream(entry);
                    FileOutputStream fos = new FileOutputStream(targetFile);
                    int len;
                    byte[] buf = new byte[1024];
                    while ((len = is.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }
                    // 关流顺序，先打开的后关闭
                    fos.close();
                    is.close();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("解压完成，耗时：" + (end - start) + " ms");
        } catch (Exception e) {
            throw new RuntimeException("unzip error from ZipUtils", e);
        } finally {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }

    /**
     * 复制asset文件到指定目录
     *
     * @param oldPath asset下的路径
     * @param newPath SD卡下保存路径
     */
    public static void copyAssetsOne(Context context, String oldPath, String newPath) {
        try {
            InputStream is = context.getAssets().open(oldPath);
            FileOutputStream fos = new FileOutputStream(new File(newPath));
            byte[] buffer = new byte[1024];
            int byteCount = 0;
            // 循环从输入流读取
            while ((byteCount = is.read(buffer)) != -1) {
                // 将读取的输入流写入到输出流
                fos.write(buffer, 0, byteCount);
            }
            // 刷新缓冲区
            fos.flush();
            is.close();
            fos.close();
            Log.e("copyAssetsOne", "success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
