package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC5802S0;
import io.sentry.C5759D1;
import io.sentry.C5761E0;
import io.sentry.C5764F0;
import io.sentry.C5786M1;
import io.sentry.CallableC6196z;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5796Q;
import io.sentry.InterfaceC5810V;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.config.AbstractC6003a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p000.C9708i41;

/* renamed from: io.sentry.android.core.q */
/* loaded from: classes2.dex */
public final class C5908q implements InterfaceC5810V {

    /* renamed from: a */
    public final Context f33837a;

    /* renamed from: b */
    public final ILogger f33838b;

    /* renamed from: c */
    public final String f33839c;

    /* renamed from: d */
    public final boolean f33840d;

    /* renamed from: e */
    public final int f33841e;

    /* renamed from: f */
    public final InterfaceC5796Q f33842f;

    /* renamed from: g */
    public final C5832D f33843g;

    /* renamed from: h */
    public boolean f33844h;

    /* renamed from: i */
    public int f33845i;

    /* renamed from: j */
    public final C5893m f33846j;

    /* renamed from: k */
    public C5764F0 f33847k;

    /* renamed from: l */
    public C5900p f33848l;

    /* renamed from: m */
    public long f33849m;

    /* renamed from: n */
    public long f33850n;

    /* renamed from: o */
    public Date f33851o;

    public C5908q(Context context, SentryAndroidOptions sentryAndroidOptions, C5832D c5832d, C5893m c5893m) {
        this(context, c5832d, c5893m, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    /* renamed from: a */
    public final void m21615a() {
        if (this.f33844h) {
            return;
        }
        this.f33844h = true;
        boolean z = this.f33840d;
        ILogger iLogger = this.f33838b;
        if (!z) {
            iLogger.mo21407k(EnumC6069n1.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f33839c;
        if (str == null) {
            iLogger.mo21407k(EnumC6069n1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.f33841e;
        if (i <= 0) {
            iLogger.mo21407k(EnumC6069n1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
        } else {
            this.f33848l = new C5900p(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.f33846j, this.f33842f, this.f33838b, this.f33843g);
        }
    }

    /* renamed from: b */
    public final synchronized C5761E0 m21616b(String str, String str2, String str3, boolean z, List list, C5759D1 c5759d1) {
        try {
            ActivityManager.MemoryInfo memoryInfo = null;
            if (this.f33848l == null) {
                return null;
            }
            this.f33843g.getClass();
            C5764F0 c5764f0 = this.f33847k;
            if (c5764f0 != null && c5764f0.f33264a.equals(str2)) {
                int i = this.f33845i;
                if (i > 0) {
                    this.f33845i = i - 1;
                }
                this.f33838b.mo21407k(EnumC6069n1.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f33845i != 0) {
                    C5764F0 c5764f02 = this.f33847k;
                    if (c5764f02 != null) {
                        c5764f02.m21385a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f33849m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f33850n));
                    }
                    return null;
                }
                C9708i41 c9708i41M21601a = this.f33848l.m21601a(list, false);
                if (c9708i41M21601a == null) {
                    return null;
                }
                long j = c9708i41M21601a.f28810a - this.f33849m;
                ArrayList arrayList = new ArrayList(1);
                C5764F0 c5764f03 = this.f33847k;
                if (c5764f03 != null) {
                    arrayList.add(c5764f03);
                }
                this.f33847k = null;
                this.f33845i = 0;
                ILogger iLogger = this.f33838b;
                try {
                    ActivityManager activityManager = (ActivityManager) this.f33837a.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    if (activityManager != null) {
                        activityManager.getMemoryInfo(memoryInfo2);
                        memoryInfo = memoryInfo2;
                    } else {
                        iLogger.mo21407k(EnumC6069n1.INFO, "Error getting MemoryInfo.", new Object[0]);
                    }
                } catch (Throwable th) {
                    iLogger.mo21406d(EnumC6069n1.ERROR, "Error getting MemoryInfo.", th);
                }
                String string = memoryInfo != null ? Long.toString(memoryInfo.totalMem) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5764F0) it.next()).m21385a(Long.valueOf(c9708i41M21601a.f28810a), Long.valueOf(this.f33849m), Long.valueOf(c9708i41M21601a.f28811b), Long.valueOf(this.f33850n));
                }
                File file = (File) c9708i41M21601a.f28813d;
                Date date = this.f33851o;
                String string2 = Long.toString(j);
                this.f33843g.getClass();
                int i2 = Build.VERSION.SDK_INT;
                String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                CallableC6196z callableC6196z = new CallableC6196z(3);
                this.f33843g.getClass();
                String str5 = Build.MANUFACTURER;
                this.f33843g.getClass();
                String str6 = Build.MODEL;
                this.f33843g.getClass();
                return new C5761E0(file, date, arrayList, str, str2, str3, string2, i2, str4, callableC6196z, str5, str6, Build.VERSION.RELEASE, this.f33843g.m21516a(), string, c5759d1.getProguardUuid(), c5759d1.getRelease(), c5759d1.getEnvironment(), (c9708i41M21601a.f28812c || z) ? "timeout" : "normal", (HashMap) c9708i41M21601a.f28814e);
            }
            this.f33838b.mo21407k(EnumC6069n1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5810V
    public final void close() {
        C5764F0 c5764f0 = this.f33847k;
        if (c5764f0 != null) {
            m21616b(c5764f0.f33266c, c5764f0.f33264a, c5764f0.f33265b, true, null, AbstractC5802S0.m21465c().mo21364A());
        } else {
            int i = this.f33845i;
            if (i != 0) {
                this.f33845i = i - 1;
            }
        }
        C5900p c5900p = this.f33848l;
        if (c5900p != null) {
            synchronized (c5900p) {
                try {
                    Future future = c5900p.f33800d;
                    if (future != null) {
                        future.cancel(true);
                        c5900p.f33800d = null;
                    }
                    if (c5900p.f33811o) {
                        c5900p.m21601a(null, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC5810V
    /* renamed from: h */
    public final synchronized void mo21471h(C5786M1 c5786m1) {
        if (this.f33845i > 0 && this.f33847k == null) {
            this.f33847k = new C5764F0(c5786m1, Long.valueOf(this.f33849m), Long.valueOf(this.f33850n));
        }
    }

    @Override // io.sentry.InterfaceC5810V
    /* renamed from: i */
    public final synchronized C5761E0 mo21472i(C5786M1 c5786m1, List list, C5759D1 c5759d1) {
        return m21616b(c5786m1.f33330e, c5786m1.f33326a.toString(), c5786m1.f33327b.f33367c.f33379a.toString(), false, list, c5759d1);
    }

    @Override // io.sentry.InterfaceC5810V
    public final boolean isRunning() {
        return this.f33845i != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0012, B:13:0x0030, B:8:0x0018, B:11:0x001f, B:16:0x003e), top: B:21:0x0001 }] */
    @Override // io.sentry.InterfaceC5810V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void start() {
        /*
            r5 = this;
            monitor-enter(r5)
            io.sentry.android.core.D r0 = r5.f33843g     // Catch: java.lang.Throwable -> L3c
            r0.getClass()     // Catch: java.lang.Throwable -> L3c
            r5.m21615a()     // Catch: java.lang.Throwable -> L3c
            int r0 = r5.f33845i     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            int r0 = r0 + r1
            r5.f33845i = r0     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            if (r0 != r1) goto L3e
            io.sentry.android.core.p r0 = r5.f33848l     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L18
        L16:
            r0 = r2
            goto L2e
        L18:
            zm r0 = r0.m21603c()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L1f
            goto L16
        L1f:
            long r3 = r0.f46985a     // Catch: java.lang.Throwable -> L3c
            r5.f33849m = r3     // Catch: java.lang.Throwable -> L3c
            long r3 = r0.f46986b     // Catch: java.lang.Throwable -> L3c
            r5.f33850n = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.f46987c     // Catch: java.lang.Throwable -> L3c
            java.util.Date r0 = (java.util.Date) r0     // Catch: java.lang.Throwable -> L3c
            r5.f33851o = r0     // Catch: java.lang.Throwable -> L3c
            r0 = r1
        L2e:
            if (r0 == 0) goto L3e
            io.sentry.ILogger r0 = r5.f33838b     // Catch: java.lang.Throwable -> L3c
            io.sentry.n1 r1 = io.sentry.EnumC6069n1.DEBUG     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "Profiler started."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r0.mo21407k(r1, r3, r2)     // Catch: java.lang.Throwable -> L3c
            goto L4e
        L3c:
            r0 = move-exception
            goto L50
        L3e:
            int r0 = r5.f33845i     // Catch: java.lang.Throwable -> L3c
            int r0 = r0 - r1
            r5.f33845i = r0     // Catch: java.lang.Throwable -> L3c
            io.sentry.ILogger r0 = r5.f33838b     // Catch: java.lang.Throwable -> L3c
            io.sentry.n1 r1 = io.sentry.EnumC6069n1.WARNING     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "A profile is already running. This profile will be ignored."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r0.mo21407k(r1, r3, r2)     // Catch: java.lang.Throwable -> L3c
        L4e:
            monitor-exit(r5)
            return
        L50:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5908q.start():void");
    }

    public C5908q(Context context, C5832D c5832d, C5893m c5893m, ILogger iLogger, String str, boolean z, int i, InterfaceC5796Q interfaceC5796Q) {
        this.f33844h = false;
        this.f33845i = 0;
        this.f33848l = null;
        Context applicationContext = context.getApplicationContext();
        this.f33837a = applicationContext != null ? applicationContext : context;
        AbstractC6003a.m21735D(iLogger, "ILogger is required");
        this.f33838b = iLogger;
        this.f33846j = c5893m;
        AbstractC6003a.m21735D(c5832d, "The BuildInfoProvider is required.");
        this.f33843g = c5832d;
        this.f33839c = str;
        this.f33840d = z;
        this.f33841e = i;
        AbstractC6003a.m21735D(interfaceC5796Q, "The ISentryExecutorService is required.");
        this.f33842f = interfaceC5796Q;
        this.f33851o = AbstractC6003a.m21752k();
    }
}
