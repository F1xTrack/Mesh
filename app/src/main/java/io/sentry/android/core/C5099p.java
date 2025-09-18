package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.C8425zm;
import io.sentry.C0;
import io.sentry.C5131i;
import io.sentry.C5153p0;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5099p {
    public final File b;
    public final int c;
    public String f;
    public final io.sentry.android.core.internal.util.m g;
    public final D l;
    public final io.sentry.Q m;
    public final ILogger n;
    public long a = 0;
    public Future d = null;
    public File e = null;
    public final ArrayDeque h = new ArrayDeque();
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();
    public boolean o = false;

    public C5099p(String str, int i, io.sentry.android.core.internal.util.m mVar, io.sentry.Q q, ILogger iLogger, D d) {
        io.sentry.config.a.D(str, "TracesFilesDirPath is required");
        this.b = new File(str);
        this.c = i;
        io.sentry.config.a.D(iLogger, "Logger is required");
        this.n = iLogger;
        io.sentry.config.a.D(q, "ExecutorService is required.");
        this.m = q;
        io.sentry.config.a.D(mVar, "SentryFrameMetricsCollector is required");
        this.g = mVar;
        io.sentry.config.a.D(d, "The BuildInfoProvider is required.");
        this.l = d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:10:0x0017, B:12:0x001f, B:17:0x002d, B:19:0x0040, B:22:0x004d, B:24:0x0055, B:25:0x0065, B:27:0x006d, B:28:0x007d, B:30:0x0085, B:31:0x0095, B:33:0x009c, B:34:0x00a2, B:38:0x00b0, B:39:0x00b2, B:11:0x001c, B:15:0x0023), top: B:44:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:10:0x0017, B:12:0x001f, B:17:0x002d, B:19:0x0040, B:22:0x004d, B:24:0x0055, B:25:0x0065, B:27:0x006d, B:28:0x007d, B:30:0x0085, B:31:0x0095, B:33:0x009c, B:34:0x00a2, B:38:0x00b0, B:39:0x00b2, B:11:0x001c, B:15:0x0023), top: B:44:0x0001, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.C4277i41 a(java.util.List r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.o     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            io.sentry.ILogger r13 = r12.n     // Catch: java.lang.Throwable -> L14
            io.sentry.n1 r14 = io.sentry.EnumC5148n1.WARNING     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "Profiler not running"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            r13.k(r14, r0, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r12)
            return r1
        L14:
            r13 = move-exception
            goto Lb3
        L17:
            io.sentry.android.core.D r0 = r12.l     // Catch: java.lang.Throwable -> L14
            r0.getClass()     // Catch: java.lang.Throwable -> L14
            android.os.Debug.stopMethodTracing()     // Catch: java.lang.Throwable -> L22
        L1f:
            r12.o = r2     // Catch: java.lang.Throwable -> L14
            goto L2d
        L22:
            r0 = move-exception
            io.sentry.ILogger r3 = r12.n     // Catch: java.lang.Throwable -> Laf
            io.sentry.n1 r4 = io.sentry.EnumC5148n1.ERROR     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "Error while stopping profiling: "
            r3.d(r4, r5, r0)     // Catch: java.lang.Throwable -> Laf
            goto L1f
        L2d:
            io.sentry.android.core.internal.util.m r0 = r12.g     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r12.f     // Catch: java.lang.Throwable -> L14
            r0.a(r3)     // Catch: java.lang.Throwable -> L14
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L14
            long r7 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = r12.e     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L4d
            io.sentry.ILogger r13 = r12.n     // Catch: java.lang.Throwable -> L14
            io.sentry.n1 r14 = io.sentry.EnumC5148n1.ERROR     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "Trace file does not exists"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            r13.k(r14, r0, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r12)
            return r1
        L4d:
            java.util.ArrayDeque r0 = r12.i     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L65
            java.util.HashMap r0 = r12.k     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "slow_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque r9 = r12.i     // Catch: java.lang.Throwable -> L14
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
        L65:
            java.util.ArrayDeque r0 = r12.j     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L7d
            java.util.HashMap r0 = r12.k     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "frozen_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque r9 = r12.j     // Catch: java.lang.Throwable -> L14
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
        L7d:
            java.util.ArrayDeque r0 = r12.h     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L95
            java.util.HashMap r0 = r12.k     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "screen_frame_rates"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "hz"
            java.util.ArrayDeque r9 = r12.h     // Catch: java.lang.Throwable -> L14
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
        L95:
            r12.b(r13)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Future r13 = r12.d     // Catch: java.lang.Throwable -> L14
            if (r13 == 0) goto La2
            r0 = 1
            r13.cancel(r0)     // Catch: java.lang.Throwable -> L14
            r12.d = r1     // Catch: java.lang.Throwable -> L14
        La2:
            i41 r13 = new i41     // Catch: java.lang.Throwable -> L14
            java.io.File r10 = r12.e     // Catch: java.lang.Throwable -> L14
            java.util.HashMap r11 = r12.k     // Catch: java.lang.Throwable -> L14
            r4 = r13
            r9 = r14
            r4.<init>(r5, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r12)
            return r13
        Laf:
            r13 = move-exception
            r12.o = r2     // Catch: java.lang.Throwable -> L14
            throw r13     // Catch: java.lang.Throwable -> L14
        Lb3:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L14
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5099p.a(java.util.List, boolean):i41");
    }

    public final void b(List list) {
        this.l.getClass();
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C0 c0 = (C0) it.next();
                        C5131i c5131i = c0.b;
                        C5153p0 c5153p0 = c0.a;
                        if (c5131i != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c5131i.a) + jElapsedRealtimeNanos), Double.valueOf(c5131i.b)));
                        }
                        if (c5153p0 != null && c5153p0.b > -1) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c5153p0.a) + jElapsedRealtimeNanos), Long.valueOf(c5153p0.b)));
                        }
                        if (c5153p0 != null && c5153p0.c > -1) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c5153p0.a) + jElapsedRealtimeNanos), Long.valueOf(c5153p0.c)));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final synchronized C8425zm c() {
        String string;
        int i = this.c;
        if (i == 0) {
            this.n.k(EnumC5148n1.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
            return null;
        }
        if (this.o) {
            this.n.k(EnumC5148n1.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        this.l.getClass();
        this.e = new File(this.b, UUID.randomUUID() + ".trace");
        this.k.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        io.sentry.android.core.internal.util.m mVar = this.g;
        C5098o c5098o = new C5098o(this);
        if (mVar.g) {
            string = UUID.randomUUID().toString();
            mVar.f.put(string, c5098o);
            mVar.c();
        } else {
            string = null;
        }
        this.f = string;
        try {
            this.d = this.m.t(new RunnableC5084a(2, this), 30000L);
        } catch (RejectedExecutionException e) {
            this.n.d(EnumC5148n1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
        }
        this.a = SystemClock.elapsedRealtimeNanos();
        Date dateK = io.sentry.config.a.k();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
            this.o = true;
            return new C8425zm(this.a, elapsedCpuTime, dateK);
        } catch (Throwable th) {
            a(null, false);
            this.n.d(EnumC5148n1.ERROR, "Unable to start a profile: ", th);
            this.o = false;
            return null;
        }
    }
}
