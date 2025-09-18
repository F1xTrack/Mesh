package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class Utils {
    private static final String TAG = "Utils";

    public static long getCurrentTime(boolean z) {
        return z ? SystemClock.elapsedRealtime() : System.currentTimeMillis();
    }

    public static boolean is64Bit(Context context) {
        if (context == null) {
            Logger.m11682e(TAG, "Null context, please check it.");
            return false;
        }
        if (context.getApplicationContext() != null) {
            context.getApplicationContext();
        }
        return Process.is64Bit();
    }
}
