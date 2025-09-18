package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2317bO1 {
    public static N01 a;

    public static C7548v9 a() throws InterruptedException {
        C7548v9 c7548v9 = C7548v9.l;
        O90.c(c7548v9);
        C7548v9 c7548v92 = c7548v9.f;
        if (c7548v92 == null) {
            long jNanoTime = System.nanoTime();
            C7548v9.i.await(C7548v9.j, TimeUnit.MILLISECONDS);
            C7548v9 c7548v93 = C7548v9.l;
            O90.c(c7548v93);
            if (c7548v93.f != null || System.nanoTime() - jNanoTime < C7548v9.k) {
                return null;
            }
            return C7548v9.l;
        }
        long jNanoTime2 = c7548v92.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C7548v9.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C7548v9 c7548v94 = C7548v9.l;
        O90.c(c7548v94);
        c7548v94.f = c7548v92.f;
        c7548v92.f = null;
        return c7548v92;
    }
}
