package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3040r2 {
    private static final L0 a = new L0();
    private static final String[] b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static int a() {
        return (b() || c()) ? 1 : 0;
    }

    public static boolean b() {
        try {
            return (U2.a(21) ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        for (String str : b) {
            try {
            } catch (Throwable unused) {
            }
            if (U2.a(31) ? false : new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
