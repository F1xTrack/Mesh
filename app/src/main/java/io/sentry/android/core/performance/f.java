package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.C5154p1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f implements Comparable {
    public String a;
    public long b;
    public long c;
    public long d;

    public final long a() {
        if (!c()) {
            return 0L;
        }
        return (d() ? this.d - this.c : 0L) + this.b;
    }

    public final C5154p1 b() {
        if (c()) {
            return new C5154p1(this.b * 1000000);
        }
        return null;
    }

    public final boolean c() {
        return this.c != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((f) obj).b);
    }

    public final boolean d() {
        return this.d != 0;
    }

    public final void e(long j) {
        this.c = j;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.c;
        this.b = System.currentTimeMillis() - jUptimeMillis;
        System.nanoTime();
        TimeUnit.MILLISECONDS.toNanos(jUptimeMillis);
    }

    public final void f() {
        this.d = SystemClock.uptimeMillis();
    }
}
