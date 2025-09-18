package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.O90;

/* renamed from: com.yandex.varioqub.config.impl.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3268b {
    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static String b() {
        Context context = AbstractC3270d.a;
        if (context != null) {
            return Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0).getLanguage() : context.getResources().getConfiguration().locale.getLanguage();
        }
        O90.o("appContext");
        throw null;
    }

    public static PackageInfo c() {
        Context context = AbstractC3270d.a;
        if (context != null) {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        O90.o("appContext");
        throw null;
    }

    public static String d() {
        PackageInfo packageInfoC = c();
        return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfoC.getLongVersionCode()) : String.valueOf(packageInfoC.versionCode);
    }
}
