package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.C4277i41;
import io.sentry.CallableC5188z;
import io.sentry.D1;
import io.sentry.E0;
import io.sentry.EnumC5148n1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.M1;
import io.sentry.S0;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5100q implements io.sentry.V {
    public final Context a;
    public final ILogger b;
    public final String c;
    public final boolean d;
    public final int e;
    public final io.sentry.Q f;
    public final D g;
    public boolean h;
    public int i;
    public final io.sentry.android.core.internal.util.m j;
    public F0 k;
    public C5099p l;
    public long m;
    public long n;
    public Date o;

    public C5100q(Context context, SentryAndroidOptions sentryAndroidOptions, D d, io.sentry.android.core.internal.util.m mVar) {
        this(context, d, mVar, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        boolean z = this.d;
        ILogger iLogger = this.b;
        if (!z) {
            iLogger.k(EnumC5148n1.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.c;
        if (str == null) {
            iLogger.k(EnumC5148n1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.e;
        if (i <= 0) {
            iLogger.k(EnumC5148n1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
        } else {
            this.l = new C5099p(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.j, this.f, this.b, this.g);
        }
    }

    public final synchronized E0 b(String str, String str2, String str3, boolean z, List list, D1 d1) {
        try {
            ActivityManager.MemoryInfo memoryInfo = null;
            if (this.l == null) {
                return null;
            }
            this.g.getClass();
            F0 f0 = this.k;
            if (f0 != null && f0.a.equals(str2)) {
                int i = this.i;
                if (i > 0) {
                    this.i = i - 1;
                }
                this.b.k(EnumC5148n1.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.i != 0) {
                    F0 f02 = this.k;
                    if (f02 != null) {
                        f02.a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.n));
                    }
                    return null;
                }
                C4277i41 c4277i41A = this.l.a(list, false);
                if (c4277i41A == null) {
                    return null;
                }
                long j = c4277i41A.a - this.m;
                ArrayList arrayList = new ArrayList(1);
                F0 f03 = this.k;
                if (f03 != null) {
                    arrayList.add(f03);
                }
                this.k = null;
                this.i = 0;
                ILogger iLogger = this.b;
                try {
                    ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    if (activityManager != null) {
                        activityManager.getMemoryInfo(memoryInfo2);
                        memoryInfo = memoryInfo2;
                    } else {
                        iLogger.k(EnumC5148n1.INFO, "Error getting MemoryInfo.", new Object[0]);
                    }
                } catch (Throwable th) {
                    iLogger.d(EnumC5148n1.ERROR, "Error getting MemoryInfo.", th);
                }
                String string = memoryInfo != null ? Long.toString(memoryInfo.totalMem) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((F0) it.next()).a(Long.valueOf(c4277i41A.a), Long.valueOf(this.m), Long.valueOf(c4277i41A.b), Long.valueOf(this.n));
                }
                File file = (File) c4277i41A.d;
                Date date = this.o;
                String string2 = Long.toString(j);
                this.g.getClass();
                int i2 = Build.VERSION.SDK_INT;
                String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                CallableC5188z callableC5188z = new CallableC5188z(3);
                this.g.getClass();
                String str5 = Build.MANUFACTURER;
                this.g.getClass();
                String str6 = Build.MODEL;
                this.g.getClass();
                return new E0(file, date, arrayList, str, str2, str3, string2, i2, str4, callableC5188z, str5, str6, Build.VERSION.RELEASE, this.g.a(), string, d1.getProguardUuid(), d1.getRelease(), d1.getEnvironment(), (c4277i41A.c || z) ? "timeout" : "normal", (HashMap) c4277i41A.e);
            }
            this.b.k(EnumC5148n1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.V
    public final void close() {
        F0 f0 = this.k;
        if (f0 != null) {
            b(f0.c, f0.a, f0.b, true, null, S0.c().A());
        } else {
            int i = this.i;
            if (i != 0) {
                this.i = i - 1;
            }
        }
        C5099p c5099p = this.l;
        if (c5099p != null) {
            synchronized (c5099p) {
                try {
                    Future future = c5099p.d;
                    if (future != null) {
                        future.cancel(true);
                        c5099p.d = null;
                    }
                    if (c5099p.o) {
                        c5099p.a(null, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.V
    public final synchronized void h(M1 m1) {
        if (this.i > 0 && this.k == null) {
            this.k = new F0(m1, Long.valueOf(this.m), Long.valueOf(this.n));
        }
    }

    @Override // io.sentry.V
    public final synchronized E0 i(M1 m1, List list, D1 d1) {
        return b(m1.e, m1.a.toString(), m1.b.c.a.toString(), false, list, d1);
    }

    @Override // io.sentry.V
    public final boolean isRunning() {
        return this.i != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0012, B:13:0x0030, B:8:0x0018, B:11:0x001f, B:16:0x003e), top: B:21:0x0001 }] */
    @Override // io.sentry.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void start() {
        /*
            r5 = this;
            monitor-enter(r5)
            io.sentry.android.core.D r0 = r5.g     // Catch: java.lang.Throwable -> L3c
            r0.getClass()     // Catch: java.lang.Throwable -> L3c
            r5.a()     // Catch: java.lang.Throwable -> L3c
            int r0 = r5.i     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            int r0 = r0 + r1
            r5.i = r0     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            if (r0 != r1) goto L3e
            io.sentry.android.core.p r0 = r5.l     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L18
        L16:
            r0 = r2
            goto L2e
        L18:
            zm r0 = r0.c()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L1f
            goto L16
        L1f:
            long r3 = r0.a     // Catch: java.lang.Throwable -> L3c
            r5.m = r3     // Catch: java.lang.Throwable -> L3c
            long r3 = r0.b     // Catch: java.lang.Throwable -> L3c
            r5.n = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L3c
            java.util.Date r0 = (java.util.Date) r0     // Catch: java.lang.Throwable -> L3c
            r5.o = r0     // Catch: java.lang.Throwable -> L3c
            r0 = r1
        L2e:
            if (r0 == 0) goto L3e
            io.sentry.ILogger r0 = r5.b     // Catch: java.lang.Throwable -> L3c
            io.sentry.n1 r1 = io.sentry.EnumC5148n1.DEBUG     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "Profiler started."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r0.k(r1, r3, r2)     // Catch: java.lang.Throwable -> L3c
            goto L4e
        L3c:
            r0 = move-exception
            goto L50
        L3e:
            int r0 = r5.i     // Catch: java.lang.Throwable -> L3c
            int r0 = r0 - r1
            r5.i = r0     // Catch: java.lang.Throwable -> L3c
            io.sentry.ILogger r0 = r5.b     // Catch: java.lang.Throwable -> L3c
            io.sentry.n1 r1 = io.sentry.EnumC5148n1.WARNING     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "A profile is already running. This profile will be ignored."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r0.k(r1, r3, r2)     // Catch: java.lang.Throwable -> L3c
        L4e:
            monitor-exit(r5)
            return
        L50:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5100q.start():void");
    }

    public C5100q(Context context, D d, io.sentry.android.core.internal.util.m mVar, ILogger iLogger, String str, boolean z, int i, io.sentry.Q q) {
        this.h = false;
        this.i = 0;
        this.l = null;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        io.sentry.config.a.D(iLogger, "ILogger is required");
        this.b = iLogger;
        this.j = mVar;
        io.sentry.config.a.D(d, "The BuildInfoProvider is required.");
        this.g = d;
        this.c = str;
        this.d = z;
        this.e = i;
        io.sentry.config.a.D(q, "The ISentryExecutorService is required.");
        this.f = q;
        this.o = io.sentry.config.a.k();
    }
}
