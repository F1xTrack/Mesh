package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.concurrent.TimeUnit;

/* renamed from: iJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4321iJ0 {
    public static final long i;
    public C8425zm b;
    public final C8425zm e;
    public final C8425zm f;
    public final long g;
    public final long h;
    public long c = 500;
    public double d = 500;
    public C0646Ia1 a = new C0646Ia1();

    static {
        C7533v4.d();
        i = TimeUnit.SECONDS.toMicros(1L);
    }

    public C4321iJ0(C8425zm c8425zm, C0396Ev0 c0396Ev0, C0943Lw c0943Lw, String str) {
        long jN;
        C5598kx c5598kx;
        this.b = c8425zm;
        long jO = str == "Trace" ? c0943Lw.o() : c0943Lw.o();
        if (str == "Trace") {
            synchronized (C5598kx.class) {
                try {
                    if (C5598kx.a == null) {
                        C5598kx.a = new C5598kx();
                    }
                    c5598kx = C5598kx.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager = c0943Lw.a;
            c5598kx.getClass();
            C8462zy0 c8462zy0 = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (c8462zy0.b() && C0943Lw.r(((Long) c8462zy0.a()).longValue())) {
                c0943Lw.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jN = ((Long) c8462zy0.a()).longValue();
            } else {
                C8462zy0 c8462zy0C = c0943Lw.c(c5598kx);
                jN = (c8462zy0C.b() && C0943Lw.r(((Long) c8462zy0C.a()).longValue())) ? ((Long) c8462zy0C.a()).longValue() : 300L;
            }
        } else {
            jN = c0943Lw.n();
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new C8425zm(jN, jO, timeUnit);
        this.g = jN;
        long jO2 = str == "Trace" ? c0943Lw.o() : c0943Lw.o();
        long jC = c(c0943Lw, str);
        this.f = new C8425zm(jC, jO2, timeUnit);
        this.h = jC;
    }

    public static long c(C0943Lw c0943Lw, String str) {
        C5407jx c5407jx;
        if (str != "Trace") {
            return c0943Lw.m();
        }
        c0943Lw.getClass();
        synchronized (C5407jx.class) {
            try {
                if (C5407jx.a == null) {
                    C5407jx.a = new C5407jx();
                }
                c5407jx = C5407jx.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = c0943Lw.a;
        c5407jx.getClass();
        C8462zy0 c8462zy0 = remoteConfigManager.getLong("fpr_rl_trace_event_count_bg");
        if (c8462zy0.b() && C0943Lw.r(((Long) c8462zy0.a()).longValue())) {
            c0943Lw.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
            return ((Long) c8462zy0.a()).longValue();
        }
        C8462zy0 c8462zy0C = c0943Lw.c(c5407jx);
        if (c8462zy0C.b() && C0943Lw.r(((Long) c8462zy0C.a()).longValue())) {
            return ((Long) c8462zy0C.a()).longValue();
        }
        return 30L;
    }

    public final synchronized void a(boolean z) {
        try {
            this.b = z ? this.e : this.f;
            this.c = z ? this.g : this.h;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:14:0x005a, B:16:0x0065, B:19:0x0076, B:21:0x007e, B:10:0x0039, B:11:0x0042, B:12:0x0046, B:13:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:14:0x005a, B:16:0x0065, B:19:0x0076, B:21:0x007e, B:10:0x0039, B:11:0x0042, B:12:0x0046, B:13:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b() {
        /*
            r13 = this;
            monitor-enter(r13)
            Ia1 r0 = new Ia1     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            Ia1 r1 = r13.a     // Catch: java.lang.Throwable -> L74
            r1.getClass()     // Catch: java.lang.Throwable -> L74
            long r2 = r0.b     // Catch: java.lang.Throwable -> L74
            long r4 = r1.b     // Catch: java.lang.Throwable -> L74
            long r2 = r2 - r4
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L74
            zm r3 = r13.b     // Catch: java.lang.Throwable -> L74
            r3.getClass()     // Catch: java.lang.Throwable -> L74
            int[] r4 = defpackage.AbstractC4130hJ0.a     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r3.c     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.TimeUnit r5 = (java.util.concurrent.TimeUnit) r5     // Catch: java.lang.Throwable -> L74
            int r6 = r5.ordinal()     // Catch: java.lang.Throwable -> L74
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L74
            long r6 = r3.b     // Catch: java.lang.Throwable -> L74
            long r8 = r3.a     // Catch: java.lang.Throwable -> L74
            r3 = 1
            r10 = 1
            if (r4 == r3) goto L50
            r12 = 2
            if (r4 == r12) goto L46
            r12 = 3
            if (r4 == r12) goto L39
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L74
            long r4 = r5.toSeconds(r6)     // Catch: java.lang.Throwable -> L74
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L74
            double r8 = r8 / r4
            goto L5a
        L39:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L74
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L74
            long r6 = r6.toMillis(r10)     // Catch: java.lang.Throwable -> L74
        L42:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r8 = r4 * r6
            goto L5a
        L46:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L74
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L74
            long r6 = r6.toMicros(r10)     // Catch: java.lang.Throwable -> L74
            goto L42
        L50:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L74
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L74
            long r6 = r6.toNanos(r10)     // Catch: java.lang.Throwable -> L74
            goto L42
        L5a:
            double r1 = r1 * r8
            long r4 = defpackage.C4321iJ0.i     // Catch: java.lang.Throwable -> L74
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L74
            double r1 = r1 / r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L76
            double r4 = r13.d     // Catch: java.lang.Throwable -> L74
            double r4 = r4 + r1
            long r1 = r13.c     // Catch: java.lang.Throwable -> L74
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L74
            double r1 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L74
            r13.d = r1     // Catch: java.lang.Throwable -> L74
            r13.a = r0     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L86
        L76:
            double r0 = r13.d     // Catch: java.lang.Throwable -> L74
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L83
            double r0 = r0 - r4
            r13.d = r0     // Catch: java.lang.Throwable -> L74
            monitor-exit(r13)
            return r3
        L83:
            monitor-exit(r13)
            r0 = 0
            return r0
        L86:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L74
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4321iJ0.b():boolean");
    }
}
