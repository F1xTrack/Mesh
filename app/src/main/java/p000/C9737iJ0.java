package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.concurrent.TimeUnit;

/* renamed from: iJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9737iJ0 {

    /* renamed from: i */
    public static final long f29071i;

    /* renamed from: b */
    public C7285zm f29073b;

    /* renamed from: e */
    public final C7285zm f29076e;

    /* renamed from: f */
    public final C7285zm f29077f;

    /* renamed from: g */
    public final long f29078g;

    /* renamed from: h */
    public final long f29079h;

    /* renamed from: c */
    public long f29074c = 500;

    /* renamed from: d */
    public double f29075d = 500;

    /* renamed from: a */
    public C7731Ia1 f29072a = new C7731Ia1();

    static {
        C6989v4.m25319d();
        f29071i = TimeUnit.SECONDS.toMicros(1L);
    }

    public C9737iJ0(C7285zm c7285zm, C7564Ev0 c7564Ev0, C0751Lw c0751Lw, String str) {
        long jM5152n;
        C6332kx c6332kx;
        this.f29073b = c7285zm;
        long jM5153o = str == "Trace" ? c0751Lw.m5153o() : c0751Lw.m5153o();
        if (str == "Trace") {
            synchronized (C6332kx.class) {
                try {
                    if (C6332kx.f36766a == null) {
                        C6332kx.f36766a = new C6332kx();
                    }
                    c6332kx = C6332kx.f36766a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager = c0751Lw.f6932a;
            c6332kx.getClass();
            C11991zy0 c11991zy0 = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (c11991zy0.m26594b() && C0751Lw.m5136r(((Long) c11991zy0.m26593a()).longValue())) {
                c0751Lw.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jM5152n = ((Long) c11991zy0.m26593a()).longValue();
            } else {
                C11991zy0 c11991zy0M5142c = c0751Lw.m5142c(c6332kx);
                jM5152n = (c11991zy0M5142c.m26594b() && C0751Lw.m5136r(((Long) c11991zy0M5142c.m26593a()).longValue())) ? ((Long) c11991zy0M5142c.m26593a()).longValue() : 300L;
            }
        } else {
            jM5152n = c0751Lw.m5152n();
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f29076e = new C7285zm(jM5152n, jM5153o, timeUnit);
        this.f29078g = jM5152n;
        long jM5153o2 = str == "Trace" ? c0751Lw.m5153o() : c0751Lw.m5153o();
        long jM18999c = m18999c(c0751Lw, str);
        this.f29077f = new C7285zm(jM18999c, jM5153o2, timeUnit);
        this.f29079h = jM18999c;
    }

    /* renamed from: c */
    public static long m18999c(C0751Lw c0751Lw, String str) {
        C6269jx c6269jx;
        if (str != "Trace") {
            return c0751Lw.m5151m();
        }
        c0751Lw.getClass();
        synchronized (C6269jx.class) {
            try {
                if (C6269jx.f35455a == null) {
                    C6269jx.f35455a = new C6269jx();
                }
                c6269jx = C6269jx.f35455a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = c0751Lw.f6932a;
        c6269jx.getClass();
        C11991zy0 c11991zy0 = remoteConfigManager.getLong("fpr_rl_trace_event_count_bg");
        if (c11991zy0.m26594b() && C0751Lw.m5136r(((Long) c11991zy0.m26593a()).longValue())) {
            c0751Lw.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
            return ((Long) c11991zy0.m26593a()).longValue();
        }
        C11991zy0 c11991zy0M5142c = c0751Lw.m5142c(c6269jx);
        if (c11991zy0M5142c.m26594b() && C0751Lw.m5136r(((Long) c11991zy0M5142c.m26593a()).longValue())) {
            return ((Long) c11991zy0M5142c.m26593a()).longValue();
        }
        return 30L;
    }

    /* renamed from: a */
    public final synchronized void m19000a(boolean z) {
        try {
            this.f29073b = z ? this.f29076e : this.f29077f;
            this.f29074c = z ? this.f29078g : this.f29079h;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:14:0x005a, B:16:0x0065, B:19:0x0076, B:21:0x007e, B:10:0x0039, B:11:0x0042, B:12:0x0046, B:13:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:14:0x005a, B:16:0x0065, B:19:0x0076, B:21:0x007e, B:10:0x0039, B:11:0x0042, B:12:0x0046, B:13:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[DONT_GENERATE] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m19001b() {
        /*
            r13 = this;
            monitor-enter(r13)
            Ia1 r0 = new Ia1     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            Ia1 r1 = r13.f29072a     // Catch: java.lang.Throwable -> L74
            r1.getClass()     // Catch: java.lang.Throwable -> L74
            long r2 = r0.f5022b     // Catch: java.lang.Throwable -> L74
            long r4 = r1.f5022b     // Catch: java.lang.Throwable -> L74
            long r2 = r2 - r4
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L74
            zm r3 = r13.f29073b     // Catch: java.lang.Throwable -> L74
            r3.getClass()     // Catch: java.lang.Throwable -> L74
            int[] r4 = p000.AbstractC9609hJ0.f28375a     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r3.f46987c     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.TimeUnit r5 = (java.util.concurrent.TimeUnit) r5     // Catch: java.lang.Throwable -> L74
            int r6 = r5.ordinal()     // Catch: java.lang.Throwable -> L74
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L74
            long r6 = r3.f46986b     // Catch: java.lang.Throwable -> L74
            long r8 = r3.f46985a     // Catch: java.lang.Throwable -> L74
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
            long r4 = p000.C9737iJ0.f29071i     // Catch: java.lang.Throwable -> L74
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L74
            double r1 = r1 / r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L76
            double r4 = r13.f29075d     // Catch: java.lang.Throwable -> L74
            double r4 = r4 + r1
            long r1 = r13.f29074c     // Catch: java.lang.Throwable -> L74
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L74
            double r1 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L74
            r13.f29075d = r1     // Catch: java.lang.Throwable -> L74
            r13.f29072a = r0     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L86
        L76:
            double r0 = r13.f29075d     // Catch: java.lang.Throwable -> L74
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L83
            double r0 = r0 - r4
            r13.f29075d = r0     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C9737iJ0.m19001b():boolean");
    }
}
