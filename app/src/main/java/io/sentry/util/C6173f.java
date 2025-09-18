package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.sentry.util.f */
/* loaded from: classes2.dex */
public final class C6173f implements Serializable {

    /* renamed from: b */
    public static final AtomicLong f34664b = new AtomicLong(8682522807148012L);

    /* renamed from: a */
    public final AtomicLong f34665a;

    public C6173f() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = f34664b;
            j = atomicLong.get();
            j2 = 1181783497276652981L * j;
        } while (!atomicLong.compareAndSet(j, j2));
        this.f34665a = new AtomicLong(((System.nanoTime() ^ j2) ^ 25214903917L) & 281474976710655L);
    }

    /* renamed from: a */
    public final int m21881a(int i) {
        long j;
        long j2;
        AtomicLong atomicLong = this.f34665a;
        do {
            j = atomicLong.get();
            j2 = ((25214903917L * j) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j2));
        return (int) (j2 >>> (48 - i));
    }

    /* renamed from: b */
    public final double m21882b() {
        return ((m21881a(26) << 27) + m21881a(27)) * 1.1102230246251565E-16d;
    }
}
