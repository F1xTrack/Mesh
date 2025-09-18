package com.yandex.metrica.impl.p022ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.r2 */
/* loaded from: classes2.dex */
public final class C3560r2 {

    /* renamed from: a */
    private static final C2742L0 f24572a = new C2742L0();

    /* renamed from: b */
    private static final String[] f24573b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    /* renamed from: a */
    public static int m16645a() {
        return (m16646b() || m16647c()) ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m16646b() {
        try {
            return (C2968U2.m15243a(21) ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m16647c() {
        for (String str : f24573b) {
            try {
            } catch (Throwable unused) {
            }
            if (C2968U2.m15243a(31) ? false : new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
