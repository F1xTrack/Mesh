package io.sentry.android.core;

import io.sentry.AbstractC5827a1;
import io.sentry.C6113q1;
import io.sentry.C6191x0;
import io.sentry.C6194y0;
import io.sentry.InterfaceC5787N;
import io.sentry.InterfaceC5804T;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.android.core.internal.util.InterfaceC5892l;
import java.util.Date;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.e0 */
/* loaded from: classes2.dex */
public final class C5864e0 implements InterfaceC5787N, InterfaceC5892l {

    /* renamed from: h */
    public static final long f33675h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: i */
    public static final C6113q1 f33676i = new C6113q1(new Date(0), 0);

    /* renamed from: a */
    public final boolean f33677a;

    /* renamed from: c */
    public final C5893m f33679c;

    /* renamed from: d */
    public volatile String f33680d;

    /* renamed from: b */
    public final Object f33678b = new Object();

    /* renamed from: e */
    public final TreeSet f33681e = new TreeSet(new C5859c0(0));

    /* renamed from: f */
    public final ConcurrentSkipListSet f33682f = new ConcurrentSkipListSet();

    /* renamed from: g */
    public long f33683g = 16666666;

    public C5864e0(SentryAndroidOptions sentryAndroidOptions, C5893m c5893m) {
        this.f33679c = c5893m;
        this.f33677a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    /* renamed from: h */
    public static long m21562h(AbstractC5827a1 abstractC5827a1) {
        if (abstractC5827a1 instanceof C6113q1) {
            return abstractC5827a1.mo21495b(f33676i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC5827a1.mo21497d());
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC5892l
    /* renamed from: b */
    public final void mo21563b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f33682f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (f33675h / f);
        this.f33683g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new C5862d0(j, j2, j3, j4, z, z2, j5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21564d(io.sentry.InterfaceC5804T r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5864e0.m21564d(io.sentry.T):void");
    }

    /* renamed from: e */
    public final void m21565e() {
        synchronized (this.f33678b) {
            try {
                if (this.f33680d != null) {
                    this.f33679c.m21596a(this.f33680d);
                    this.f33680d = null;
                }
                this.f33682f.clear();
                this.f33681e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m21566f(InterfaceC5804T interfaceC5804T) throws Throwable {
        if (!this.f33677a || (interfaceC5804T instanceof C6191x0) || (interfaceC5804T instanceof C6194y0)) {
            return;
        }
        synchronized (this.f33678b) {
            try {
                if (this.f33681e.contains(interfaceC5804T)) {
                    m21564d(interfaceC5804T);
                    synchronized (this.f33678b) {
                        try {
                            if (this.f33681e.isEmpty()) {
                                m21565e();
                            } else {
                                this.f33682f.headSet((ConcurrentSkipListSet) new C5862d0(m21562h(((InterfaceC5804T) this.f33681e.first()).mo21435q()))).clear();
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: g */
    public final void m21567g(InterfaceC5804T interfaceC5804T) {
        String str;
        if (!this.f33677a || (interfaceC5804T instanceof C6191x0) || (interfaceC5804T instanceof C6194y0)) {
            return;
        }
        synchronized (this.f33678b) {
            try {
                this.f33681e.add(interfaceC5804T);
                if (this.f33680d == null) {
                    C5893m c5893m = this.f33679c;
                    if (c5893m.f33785g) {
                        String string = UUID.randomUUID().toString();
                        c5893m.f33784f.put(string, this);
                        c5893m.m21598c();
                        str = string;
                    } else {
                        str = null;
                    }
                    this.f33680d = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
