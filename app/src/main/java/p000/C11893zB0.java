package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: zB0 */
/* loaded from: classes2.dex */
public final class C11893zB0 extends AbstractC1008Q0 {
    @Override // p000.AbstractC9225eJ0
    /* renamed from: e */
    public final long mo17529e(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // p000.AbstractC9225eJ0
    /* renamed from: f */
    public final long mo17530f(long j) {
        return ThreadLocalRandom.current().nextLong(0L, j);
    }

    @Override // p000.AbstractC1008Q0
    /* renamed from: g */
    public final Random mo6526g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        O90.m5967e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
