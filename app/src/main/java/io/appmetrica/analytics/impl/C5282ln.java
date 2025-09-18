package io.appmetrica.analytics.impl;

import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.ln */
/* loaded from: classes2.dex */
public final class C5282ln {
    /* renamed from: a */
    public static boolean m20694a(String str) {
        UUID uuidFromString;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuidFromString = UUID.fromString(m20695b(str));
        } catch (Throwable unused) {
            uuidFromString = null;
        }
        return uuidFromString != null;
    }

    /* renamed from: b */
    public static String m20695b(String str) {
        return str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20, 32);
    }
}
