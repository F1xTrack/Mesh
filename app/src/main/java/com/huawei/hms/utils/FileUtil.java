package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a */
    private static boolean f19605a = false;

    /* renamed from: b */
    private static ScheduledExecutorService f19606b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: com.huawei.hms.utils.FileUtil$a */
    public class RunnableC2278a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ File f19607a;

        /* renamed from: b */
        final /* synthetic */ long f19608b;

        /* renamed from: c */
        final /* synthetic */ String f19609c;

        public RunnableC2278a(File file, long j, String str) {
            this.f19607a = file;
            this.f19608b = j;
            this.f19609c = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th;
            File file = this.f19607a;
            if (file == null) {
                HMSLog.m12620e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.m12620e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    long length = this.f19607a.length();
                    if (length > this.f19608b) {
                        String canonicalPath = this.f19607a.getCanonicalPath();
                        if (!this.f19607a.delete()) {
                            HMSLog.m12620e("FileUtil", "last file delete failed.");
                        }
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.f19607a, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException e) {
                            e = e;
                            randomAccessFile2 = randomAccessFile;
                            HMSLog.m12621e("FileUtil", "writeFile exception:", e);
                            IOUtils.closeQuietly(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile2.writeBytes(this.f19609c + System.getProperty("line.separator"));
                } catch (IOException e2) {
                    e = e2;
                }
                IOUtils.closeQuietly(randomAccessFile2);
            } catch (Throwable th3) {
                randomAccessFile = null;
                th = th3;
            }
        }
    }

    public static boolean verifyHash(String str, File file) throws Throwable {
        byte[] bArrDigest = SHA256.digest(file);
        return bArrDigest != null && HEX.encodeHexString(bArrDigest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j) {
        f19606b.execute(new RunnableC2278a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f19605a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.m12620e("FileUtil", "file delete failed.");
                }
                f19605a = true;
            }
            writeFile(file2, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
