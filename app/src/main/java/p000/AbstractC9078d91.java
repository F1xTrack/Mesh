package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: d91 */
/* loaded from: classes2.dex */
public abstract class AbstractC9078d91 {

    /* renamed from: a */
    public static final String f25843a;

    /* renamed from: b */
    public static final long f25844b;

    /* renamed from: c */
    public static final int f25845c;

    /* renamed from: d */
    public static final int f25846d;

    /* renamed from: e */
    public static final long f25847e;

    /* renamed from: f */
    public static final C8326Tm0 f25848f;

    static {
        String property;
        int i = Z71.f14753a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f25843a = property;
        f25844b = KT1.m4650b(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = Z71.f14753a;
        if (i2 < 2) {
            i2 = 2;
        }
        f25845c = KT1.m4651c(i2, 1, 0, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f25846d = KT1.m4651c(2097150, 0, 2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f25847e = TimeUnit.SECONDS.toNanos(KT1.m4650b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f25848f = C8326Tm0.f11508e;
    }
}
