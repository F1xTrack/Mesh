package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.yandex.metrica.impl.ob.Wn */
/* loaded from: classes2.dex */
public class C3039Wn {
    /* renamed from: a */
    public ApplicationInfo m15403a(Context context, String str, int i) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public PackageInfo m15405b(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean m15404a(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
