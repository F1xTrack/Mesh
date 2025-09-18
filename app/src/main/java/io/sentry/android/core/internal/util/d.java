package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class d {
    public final long a;
    public final b b;
    public final AtomicInteger c;
    public final int d;
    public final AtomicLong e;

    public d(long j, int i) {
        b bVar = b.a;
        this.c = new AtomicInteger(0);
        this.e = new AtomicLong(0L);
        this.b = bVar;
        this.a = j;
        this.d = i <= 0 ? 1 : i;
    }

    public final boolean a() {
        this.b.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.e;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.c;
        if (j == 0 || atomicLong.get() + this.a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.d) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
