package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import p000.O90;

/* renamed from: com.yandex.varioqub.config.impl.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3862b {
    /* renamed from: a */
    public static int m17391a() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public static String m17392b() {
        Context context = AbstractC3864d.f25611a;
        if (context != null) {
            return Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0).getLanguage() : context.getResources().getConfiguration().locale.getLanguage();
        }
        O90.m5977o("appContext");
        throw null;
    }

    /* renamed from: c */
    public static PackageInfo m17393c() {
        Context context = AbstractC3864d.f25611a;
        if (context != null) {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        O90.m5977o("appContext");
        throw null;
    }

    /* renamed from: d */
    public static String m17394d() {
        PackageInfo packageInfoM17393c = m17393c();
        return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfoM17393c.getLongVersionCode()) : String.valueOf(packageInfoM17393c.versionCode);
    }
}
