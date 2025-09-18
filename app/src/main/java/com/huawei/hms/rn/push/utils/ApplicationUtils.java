package com.huawei.hms.rn.push.utils;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public class ApplicationUtils {
    private ApplicationUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isApplicationInForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pkgList.length < 1) {
                return false;
            }
            if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }
}
