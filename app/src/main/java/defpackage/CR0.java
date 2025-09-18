package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CR0 {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final C0589Hh1 a;
    public long b;
    public int c;

    public CR0() {
        if (OL0.h == null) {
            Pattern pattern = C0589Hh1.c;
            OL0.h = new OL0(21);
        }
        OL0 ol0 = OL0.h;
        if (C0589Hh1.d == null) {
            C0589Hh1.d = new C0589Hh1(ol0);
        }
        this.a = C0589Hh1.d;
    }

    public final synchronized long a(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return d;
        }
        double dPow = Math.pow(2.0d, this.c);
        this.a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            Hh1 r0 = r4.a     // Catch: java.lang.Throwable -> L19
            OL0 r0 = r0.a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.b     // Catch: java.lang.Throwable -> L19
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CR0.b():boolean");
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.c++;
        long jA = a(i);
        this.a.a.getClass();
        this.b = System.currentTimeMillis() + jA;
    }
}
