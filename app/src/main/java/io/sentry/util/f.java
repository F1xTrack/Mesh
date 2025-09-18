package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class f implements Serializable {
    public static final AtomicLong b = new AtomicLong(8682522807148012L);
    public final AtomicLong a;

    public f() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = b;
            j = atomicLong.get();
            j2 = 1181783497276652981L * j;
        } while (!atomicLong.compareAndSet(j, j2));
        this.a = new AtomicLong(((System.nanoTime() ^ j2) ^ 25214903917L) & 281474976710655L);
    }

    public final int a(int i) {
        long j;
        long j2;
        AtomicLong atomicLong = this.a;
        do {
            j = atomicLong.get();
            j2 = ((25214903917L * j) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j2));
        return (int) (j2 >>> (48 - i));
    }

    public final double b() {
        return ((a(26) << 27) + a(27)) * 1.1102230246251565E-16d;
    }
}
