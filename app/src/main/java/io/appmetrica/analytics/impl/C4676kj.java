package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4676kj {
    public volatile long a;
    public C4815qe b;
    public TimeProvider c;

    public static C4676kj c() {
        return AbstractC4652jj.a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.a;
    }

    public final synchronized void b() {
        this.b.c(false);
        this.b.b();
    }

    public final synchronized long d() {
        return this.a;
    }

    public final synchronized void e() {
        a(C4667ka.C.w(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.b.a(true);
    }

    public final synchronized void a(long j, Long l) {
        try {
            this.a = (j - this.c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.b.a(true)) {
                if (l != null) {
                    long jAbs = Math.abs(j - this.c.currentTimeMillis());
                    C4815qe c4815qe = this.b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c4815qe.c(z);
                } else {
                    this.b.c(false);
                }
            }
            this.b.d(this.a);
            this.b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C4815qe c4815qe, TimeProvider timeProvider) {
        this.b = c4815qe;
        this.a = c4815qe.a(0);
        this.c = timeProvider;
    }
}
