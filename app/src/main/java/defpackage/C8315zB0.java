package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: zB0 */
/* loaded from: classes2.dex */
public final class C8315zB0 extends Q0 {
    @Override // defpackage.AbstractC3557eJ0
    public final long e(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // defpackage.AbstractC3557eJ0
    public final long f(long j) {
        return ThreadLocalRandom.current().nextLong(0L, j);
    }

    @Override // defpackage.Q0
    public final Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        O90.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
