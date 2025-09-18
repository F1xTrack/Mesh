package com.huawei.hms.opendevice;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p000.AbstractC0852NX;

/* renamed from: com.huawei.hms.opendevice.e */
/* loaded from: classes.dex */
public abstract class AbstractC2201e {

    /* renamed from: a */
    private static String f19331a;

    /* renamed from: a */
    private static String m12339a() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return "";
                        }
                        String strTrim = line.trim();
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                        return strTrim;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.m12620e("CommFun", "get current app processes IOException!");
            return "";
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("get current app processes exception!"), "CommFun");
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m12342b() {
        int i = HwBuildEx.VERSION.EMUI_SDK_INT;
        HMSLog.m12617d("CommFun", "Emui Api Level:" + i);
        return i > 0;
    }

    /* renamed from: c */
    public static String m12343c(Context context) {
        String parent;
        if (Build.VERSION.SDK_INT >= 24) {
            parent = context.createDeviceProtectedStorageContext().getDataDir() + "";
        } else {
            parent = context.getFilesDir().getParent();
        }
        if (TextUtils.isEmpty(parent)) {
            HMSLog.m12620e("CommFun", "get storage root path of the current user failed.");
        }
        return parent;
    }

    /* renamed from: d */
    public static long m12344d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.m12620e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    /* renamed from: e */
    public static boolean m12345e(Context context) {
        return m12342b() && HwBuildEx.VERSION.EMUI_SDK_INT < 21 && m12344d(context) < 110001400;
    }

    /* renamed from: b */
    private static String m12341b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "";
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName != null) {
                    HMSLog.m12622i("CommFun", "info.pid -> " + runningAppProcessInfo.pid + ", info.processName -> " + runningAppProcessInfo.processName);
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        }
        HMSLog.m12623w("CommFun", "get running app processes null!");
        return "";
    }

    /* renamed from: a */
    public static String m12340a(Context context) throws IOException {
        if (!TextUtils.isEmpty(f19331a)) {
            return f19331a;
        }
        String strM12341b = m12341b(context);
        f19331a = strM12341b;
        if (!TextUtils.isEmpty(strM12341b)) {
            return f19331a;
        }
        String strM12339a = m12339a();
        f19331a = strM12339a;
        return strM12339a;
    }
}
