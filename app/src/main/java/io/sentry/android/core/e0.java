package io.sentry.android.core;

import io.sentry.AbstractC5083a1;
import io.sentry.C5164q1;
import io.sentry.C5183x0;
import io.sentry.C5186y0;
import java.util.Date;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e0 implements io.sentry.N, io.sentry.android.core.internal.util.l {
    public static final long h = TimeUnit.SECONDS.toNanos(1);
    public static final C5164q1 i = new C5164q1(new Date(0), 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.m c;
    public volatile String d;
    public final Object b = new Object();
    public final TreeSet e = new TreeSet(new c0(0));
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public e0(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.m mVar) {
        this.c = mVar;
        this.a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long h(AbstractC5083a1 abstractC5083a1) {
        if (abstractC5083a1 instanceof C5164q1) {
            return abstractC5083a1.b(i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC5083a1.d());
    }

    @Override // io.sentry.android.core.internal.util.l
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (h / f);
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new d0(j, j2, j3, j4, z, z2, j5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(io.sentry.T r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.e0.d(io.sentry.T):void");
    }

    public final void e() {
        synchronized (this.b) {
            try {
                if (this.d != null) {
                    this.c.a(this.d);
                    this.d = null;
                }
                this.f.clear();
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(io.sentry.T t) throws Throwable {
        if (!this.a || (t instanceof C5183x0) || (t instanceof C5186y0)) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.e.contains(t)) {
                    d(t);
                    synchronized (this.b) {
                        try {
                            if (this.e.isEmpty()) {
                                e();
                            } else {
                                this.f.headSet((ConcurrentSkipListSet) new d0(h(((io.sentry.T) this.e.first()).q()))).clear();
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void g(io.sentry.T t) {
        String str;
        if (!this.a || (t instanceof C5183x0) || (t instanceof C5186y0)) {
            return;
        }
        synchronized (this.b) {
            try {
                this.e.add(t);
                if (this.d == null) {
                    io.sentry.android.core.internal.util.m mVar = this.c;
                    if (mVar.g) {
                        String string = UUID.randomUUID().toString();
                        mVar.f.put(string, this);
                        mVar.c();
                        str = string;
                    } else {
                        str = null;
                    }
                    this.d = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
