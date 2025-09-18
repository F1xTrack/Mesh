package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.sentry.android.core.internal.util.d */
/* loaded from: classes2.dex */
public final class C5884d {

    /* renamed from: a */
    public final long f33754a;

    /* renamed from: b */
    public final C5882b f33755b;

    /* renamed from: c */
    public final AtomicInteger f33756c;

    /* renamed from: d */
    public final int f33757d;

    /* renamed from: e */
    public final AtomicLong f33758e;

    public C5884d(long j, int i) {
        C5882b c5882b = C5882b.f33750a;
        this.f33756c = new AtomicInteger(0);
        this.f33758e = new AtomicLong(0L);
        this.f33755b = c5882b;
        this.f33754a = j;
        this.f33757d = i <= 0 ? 1 : i;
    }

    /* renamed from: a */
    public final boolean m21583a() {
        this.f33755b.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.f33758e;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.f33756c;
        if (j == 0 || atomicLong.get() + this.f33754a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f33757d) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
