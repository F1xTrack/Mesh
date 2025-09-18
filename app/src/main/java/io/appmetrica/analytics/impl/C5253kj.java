package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.kj */
/* loaded from: classes2.dex */
public final class C5253kj {

    /* renamed from: a */
    public volatile long f32080a;

    /* renamed from: b */
    public C5398qe f32081b;

    /* renamed from: c */
    public TimeProvider f32082c;

    /* renamed from: c */
    public static C5253kj m20652c() {
        return AbstractC5228jj.f31988a;
    }

    /* renamed from: a */
    public final synchronized long m20653a() {
        return (System.currentTimeMillis() / 1000) + this.f32080a;
    }

    /* renamed from: b */
    public final synchronized void m20656b() {
        this.f32081b.m20968c(false);
        this.f32081b.m20875b();
    }

    /* renamed from: d */
    public final synchronized long m20657d() {
        return this.f32080a;
    }

    /* renamed from: e */
    public final synchronized void m20658e() {
        m20655a(C5244ka.f32038C.m20638w(), new SystemTimeProvider());
    }

    /* renamed from: f */
    public final synchronized boolean m20659f() {
        return this.f32081b.m20962a(true);
    }

    /* renamed from: a */
    public final synchronized void m20654a(long j, Long l) {
        try {
            this.f32080a = (j - this.f32082c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.f32081b.m20962a(true)) {
                if (l != null) {
                    long jAbs = Math.abs(j - this.f32082c.currentTimeMillis());
                    C5398qe c5398qe = this.f32081b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c5398qe.m20968c(z);
                } else {
                    this.f32081b.m20968c(false);
                }
            }
            this.f32081b.m20969d(this.f32080a);
            this.f32081b.m20875b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final void m20655a(C5398qe c5398qe, TimeProvider timeProvider) {
        this.f32081b = c5398qe;
        this.f32080a = c5398qe.m20959a(0);
        this.f32082c = timeProvider;
    }
}
