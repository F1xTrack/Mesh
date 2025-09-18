package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8847bO1 {

    /* renamed from: a */
    public static N01 f17003a;

    /* renamed from: a */
    public static C6994v9 m10452a() throws InterruptedException {
        C6994v9 c6994v9 = C6994v9.f44215l;
        O90.m5965c(c6994v9);
        C6994v9 c6994v92 = c6994v9.f44217f;
        if (c6994v92 == null) {
            long jNanoTime = System.nanoTime();
            C6994v9.f44212i.await(C6994v9.f44213j, TimeUnit.MILLISECONDS);
            C6994v9 c6994v93 = C6994v9.f44215l;
            O90.m5965c(c6994v93);
            if (c6994v93.f44217f != null || System.nanoTime() - jNanoTime < C6994v9.f44214k) {
                return null;
            }
            return C6994v9.f44215l;
        }
        long jNanoTime2 = c6994v92.f44218g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C6994v9.f44212i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C6994v9 c6994v94 = C6994v9.f44215l;
        O90.m5965c(c6994v94);
        c6994v94.f44217f = c6994v92.f44217f;
        c6994v92.f44217f = null;
        return c6994v92;
    }
}
