package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C5755C0;
import io.sentry.C6037i;
import io.sentry.C6074p0;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5796Q;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.config.AbstractC6003a;
import io.sentry.profilemeasurements.C6076a;
import io.sentry.profilemeasurements.C6077b;
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
import p000.C7285zm;

/* renamed from: io.sentry.android.core.p */
/* loaded from: classes2.dex */
public final class C5900p {

    /* renamed from: b */
    public final File f33798b;

    /* renamed from: c */
    public final int f33799c;

    /* renamed from: f */
    public String f33802f;

    /* renamed from: g */
    public final C5893m f33803g;

    /* renamed from: l */
    public final C5832D f33808l;

    /* renamed from: m */
    public final InterfaceC5796Q f33809m;

    /* renamed from: n */
    public final ILogger f33810n;

    /* renamed from: a */
    public long f33797a = 0;

    /* renamed from: d */
    public Future f33800d = null;

    /* renamed from: e */
    public File f33801e = null;

    /* renamed from: h */
    public final ArrayDeque f33804h = new ArrayDeque();

    /* renamed from: i */
    public final ArrayDeque f33805i = new ArrayDeque();

    /* renamed from: j */
    public final ArrayDeque f33806j = new ArrayDeque();

    /* renamed from: k */
    public final HashMap f33807k = new HashMap();

    /* renamed from: o */
    public boolean f33811o = false;

    public C5900p(String str, int i, C5893m c5893m, InterfaceC5796Q interfaceC5796Q, ILogger iLogger, C5832D c5832d) {
        AbstractC6003a.m21735D(str, "TracesFilesDirPath is required");
        this.f33798b = new File(str);
        this.f33799c = i;
        AbstractC6003a.m21735D(iLogger, "Logger is required");
        this.f33810n = iLogger;
        AbstractC6003a.m21735D(interfaceC5796Q, "ExecutorService is required.");
        this.f33809m = interfaceC5796Q;
        AbstractC6003a.m21735D(c5893m, "SentryFrameMetricsCollector is required");
        this.f33803g = c5893m;
        AbstractC6003a.m21735D(c5832d, "The BuildInfoProvider is required.");
        this.f33808l = c5832d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:10:0x0017, B:12:0x001f, B:17:0x002d, B:19:0x0040, B:22:0x004d, B:24:0x0055, B:25:0x0065, B:27:0x006d, B:28:0x007d, B:30:0x0085, B:31:0x0095, B:33:0x009c, B:34:0x00a2, B:38:0x00b0, B:39:0x00b2, B:11:0x001c, B:15:0x0023), top: B:44:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:10:0x0017, B:12:0x001f, B:17:0x002d, B:19:0x0040, B:22:0x004d, B:24:0x0055, B:25:0x0065, B:27:0x006d, B:28:0x007d, B:30:0x0085, B:31:0x0095, B:33:0x009c, B:34:0x00a2, B:38:0x00b0, B:39:0x00b2, B:11:0x001c, B:15:0x0023), top: B:44:0x0001, inners: #0, #2 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized p000.C9708i41 m21601a(java.util.List r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f33811o     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            io.sentry.ILogger r13 = r12.f33810n     // Catch: java.lang.Throwable -> L14
            io.sentry.n1 r14 = io.sentry.EnumC6069n1.WARNING     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "Profiler not running"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            r13.mo21407k(r14, r0, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r12)
            return r1
        L14:
            r13 = move-exception
            goto Lb3
        L17:
            io.sentry.android.core.D r0 = r12.f33808l     // Catch: java.lang.Throwable -> L14
            r0.getClass()     // Catch: java.lang.Throwable -> L14
            android.os.Debug.stopMethodTracing()     // Catch: java.lang.Throwable -> L22
        L1f:
            r12.f33811o = r2     // Catch: java.lang.Throwable -> L14
            goto L2d
        L22:
            r0 = move-exception
            io.sentry.ILogger r3 = r12.f33810n     // Catch: java.lang.Throwable -> Laf
            io.sentry.n1 r4 = io.sentry.EnumC6069n1.ERROR     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "Error while stopping profiling: "
            r3.mo21406d(r4, r5, r0)     // Catch: java.lang.Throwable -> Laf
            goto L1f
        L2d:
            io.sentry.android.core.internal.util.m r0 = r12.f33803g     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r12.f33802f     // Catch: java.lang.Throwable -> L14
            r0.m21596a(r3)     // Catch: java.lang.Throwable -> L14
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L14
            long r7 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = r12.f33801e     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L4d
            io.sentry.ILogger r13 = r12.f33810n     // Catch: java.lang.Throwable -> L14
            io.sentry.n1 r14 = io.sentry.EnumC6069n1.ERROR     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "Trace file does not exists"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            r13.mo21407k(r14, r0, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r12)
            return r1
        L4d:
            java.util.ArrayDeque r0 = r12.f33805i     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L65
            java.util.HashMap r0 = r12.f33807k     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "slow_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque r9 = r12.f33805i     // Catch: java.lang.Throwable -> L14
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
        L65:
            java.util.ArrayDeque r0 = r12.f33806j     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L7d
            java.util.HashMap r0 = r12.f33807k     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "frozen_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque r9 = r12.f33806j     // Catch: java.lang.Throwable -> L14
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
        L7d:
            java.util.ArrayDeque r0 = r12.f33804h     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L95
            java.util.HashMap r0 = r12.f33807k     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "screen_frame_rates"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "hz"
            java.util.ArrayDeque r9 = r12.f33804h     // Catch: java.lang.Throwable -> L14
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
        L95:
            r12.m21602b(r13)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Future r13 = r12.f33800d     // Catch: java.lang.Throwable -> L14
            if (r13 == 0) goto La2
            r0 = 1
            r13.cancel(r0)     // Catch: java.lang.Throwable -> L14
            r12.f33800d = r1     // Catch: java.lang.Throwable -> L14
        La2:
            i41 r13 = new i41     // Catch: java.lang.Throwable -> L14
            java.io.File r10 = r12.f33801e     // Catch: java.lang.Throwable -> L14
            java.util.HashMap r11 = r12.f33807k     // Catch: java.lang.Throwable -> L14
            r4 = r13
            r9 = r14
            r4.<init>(r5, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r12)
            return r13
        Laf:
            r13 = move-exception
            r12.f33811o = r2     // Catch: java.lang.Throwable -> L14
            throw r13     // Catch: java.lang.Throwable -> L14
        Lb3:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L14
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5900p.m21601a(java.util.List, boolean):i41");
    }

    /* renamed from: b */
    public final void m21602b(List list) {
        this.f33808l.getClass();
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f33797a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C5755C0 c5755c0 = (C5755C0) it.next();
                        C6037i c6037i = c5755c0.f33225b;
                        C6074p0 c6074p0 = c5755c0.f33224a;
                        if (c6037i != null) {
                            arrayDeque3.add(new C6077b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c6037i.f34183a) + jElapsedRealtimeNanos), Double.valueOf(c6037i.f34184b)));
                        }
                        if (c6074p0 != null && c6074p0.f34268b > -1) {
                            arrayDeque.add(new C6077b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c6074p0.f34267a) + jElapsedRealtimeNanos), Long.valueOf(c6074p0.f34268b)));
                        }
                        if (c6074p0 != null && c6074p0.f34269c > -1) {
                            arrayDeque2.add(new C6077b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c6074p0.f34267a) + jElapsedRealtimeNanos), Long.valueOf(c6074p0.f34269c)));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f33807k.put("cpu_usage", new C6076a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f33807k.put("memory_footprint", new C6076a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f33807k.put("memory_native_footprint", new C6076a("byte", arrayDeque2));
        }
    }

    /* renamed from: c */
    public final synchronized C7285zm m21603c() {
        String string;
        int i = this.f33799c;
        if (i == 0) {
            this.f33810n.mo21407k(EnumC6069n1.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
            return null;
        }
        if (this.f33811o) {
            this.f33810n.mo21407k(EnumC6069n1.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        this.f33808l.getClass();
        this.f33801e = new File(this.f33798b, UUID.randomUUID() + ".trace");
        this.f33807k.clear();
        this.f33804h.clear();
        this.f33805i.clear();
        this.f33806j.clear();
        C5893m c5893m = this.f33803g;
        C5899o c5899o = new C5899o(this);
        if (c5893m.f33785g) {
            string = UUID.randomUUID().toString();
            c5893m.f33784f.put(string, c5899o);
            c5893m.m21598c();
        } else {
            string = null;
        }
        this.f33802f = string;
        try {
            this.f33800d = this.f33809m.mo13827t(new RunnableC5854a(2, this), 30000L);
        } catch (RejectedExecutionException e) {
            this.f33810n.mo21406d(EnumC6069n1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
        }
        this.f33797a = SystemClock.elapsedRealtimeNanos();
        Date dateM21752k = AbstractC6003a.m21752k();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.f33801e.getPath(), 3000000, this.f33799c);
            this.f33811o = true;
            return new C7285zm(this.f33797a, elapsedCpuTime, dateM21752k);
        } catch (Throwable th) {
            m21601a(null, false);
            this.f33810n.mo21406d(EnumC6069n1.ERROR, "Unable to start a profile: ", th);
            this.f33811o = false;
            return null;
        }
    }
}
