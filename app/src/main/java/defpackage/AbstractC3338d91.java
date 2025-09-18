package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: d91 */
/* loaded from: classes2.dex */
public abstract class AbstractC3338d91 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final C1538Tm0 f;

    static {
        String property;
        int i = Z71.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = KT1.b(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = Z71.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = KT1.c(i2, 1, 0, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = KT1.c(2097150, 0, 2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(KT1.b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = C1538Tm0.e;
    }
}
