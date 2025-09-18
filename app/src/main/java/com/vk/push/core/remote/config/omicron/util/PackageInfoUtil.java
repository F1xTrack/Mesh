package com.vk.push.core.remote.config.omicron.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public class PackageInfoUtil {
    public static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getVersionCode(Context context) {
        return getPackageInfo(context).versionCode;
    }
}
