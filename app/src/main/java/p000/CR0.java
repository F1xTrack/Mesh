package p000;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CR0 {

    /* renamed from: d */
    public static final long f1369d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f1370e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C7693Hh1 f1371a;

    /* renamed from: b */
    public long f1372b;

    /* renamed from: c */
    public int f1373c;

    public CR0() {
        if (OL0.f8373h == null) {
            Pattern pattern = C7693Hh1.f4439c;
            OL0.f8373h = new OL0(21);
        }
        OL0 ol0 = OL0.f8373h;
        if (C7693Hh1.f4440d == null) {
            C7693Hh1.f4440d = new C7693Hh1(ol0);
        }
        this.f1371a = C7693Hh1.f4440d;
    }

    /* renamed from: a */
    public final synchronized long m1183a(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return f1369d;
        }
        double dPow = Math.pow(2.0d, this.f1373c);
        this.f1371a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f1370e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m1184b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f1373c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            Hh1 r0 = r4.f1371a     // Catch: java.lang.Throwable -> L19
            OL0 r0 = r0.f4441a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f1372b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.CR0.m1184b():boolean");
    }

    /* renamed from: c */
    public final synchronized void m1185c() {
        this.f1373c = 0;
    }

    /* renamed from: d */
    public final synchronized void m1186d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            m1185c();
            return;
        }
        this.f1373c++;
        long jM1183a = m1183a(i);
        this.f1371a.f4441a.getClass();
        this.f1372b = System.currentTimeMillis() + jM1183a;
    }
}
