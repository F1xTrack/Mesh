package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.my.tracker.obfuscated.u */
/* loaded from: classes2.dex */
public abstract class AbstractC2372u {
    /* renamed from: a */
    public static PackageInfo m13512a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            AbstractC2391y2.m13572b("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m13513b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
