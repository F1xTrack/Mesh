package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.C6075p1;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.performance.f */
/* loaded from: classes2.dex */
public final class C5906f implements Comparable {

    /* renamed from: a */
    public String f33832a;

    /* renamed from: b */
    public long f33833b;

    /* renamed from: c */
    public long f33834c;

    /* renamed from: d */
    public long f33835d;

    /* renamed from: a */
    public final long m21609a() {
        if (!m21611c()) {
            return 0L;
        }
        return (m21612d() ? this.f33835d - this.f33834c : 0L) + this.f33833b;
    }

    /* renamed from: b */
    public final C6075p1 m21610b() {
        if (m21611c()) {
            return new C6075p1(this.f33833b * 1000000);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m21611c() {
        return this.f33834c != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f33833b, ((C5906f) obj).f33833b);
    }

    /* renamed from: d */
    public final boolean m21612d() {
        return this.f33835d != 0;
    }

    /* renamed from: e */
    public final void m21613e(long j) {
        this.f33834c = j;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f33834c;
        this.f33833b = System.currentTimeMillis() - jUptimeMillis;
        System.nanoTime();
        TimeUnit.MILLISECONDS.toNanos(jUptimeMillis);
    }

    /* renamed from: f */
    public final void m21614f() {
        this.f33835d = SystemClock.uptimeMillis();
    }
}
