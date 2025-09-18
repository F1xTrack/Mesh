package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.huawei.hms.base.log.C2047a;
import com.huawei.hms.base.log.C2048b;

/* loaded from: classes2.dex */
public class HMSLog {

    /* renamed from: a */
    private static final C2048b f19569a = new C2048b();

    /* renamed from: a */
    private static String m12616a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    /* renamed from: d */
    public static void m12617d(String str, String str2) {
        f19569a.m11545a(3, str, str2);
    }

    /* renamed from: e */
    public static void m12620e(String str, String str2) {
        f19569a.m11545a(6, str, str2);
    }

    /* renamed from: i */
    public static void m12622i(String str, String str2) {
        f19569a.m11545a(4, str, str2);
    }

    public static void init(Context context, int i, String str) {
        C2048b c2048b = f19569a;
        c2048b.m11546a(context, i, str);
        c2048b.m11548a(str, "============================================================================\n====== " + m12616a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f19569a.m11549a(6);
    }

    public static boolean isInfoEnable() {
        return f19569a.m11549a(4);
    }

    public static boolean isWarnEnable() {
        return f19569a.m11549a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z) throws IllegalArgumentException {
        if (hMSExtLogger == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        C2047a c2047a = new C2047a(hMSExtLogger);
        if (z) {
            f19569a.m11547a(c2047a);
        } else {
            f19569a.m11544a().mo11540a(c2047a);
        }
    }

    /* renamed from: w */
    public static void m12623w(String str, String str2) {
        f19569a.m11545a(5, str, str2);
    }

    /* renamed from: e */
    public static void m12621e(String str, String str2, Throwable th) {
        f19569a.m11550b(6, str, str2, th);
    }

    /* renamed from: e */
    public static void m12618e(String str, long j, String str2) {
        f19569a.m11545a(6, str, "[" + j + "] " + str2);
    }

    /* renamed from: e */
    public static void m12619e(String str, long j, String str2, Throwable th) {
        f19569a.m11550b(6, str, "[" + j + "] " + str2, th);
    }
}
