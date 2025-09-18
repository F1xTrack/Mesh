package defpackage;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: h40 */
/* loaded from: classes2.dex */
public final class C4085h40 implements Closeable {
    public static final AZ0 z;
    public final AbstractC2256b40 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final C2272b91 g;
    public final C2081a91 h;
    public final C2081a91 i;
    public final C2081a91 j;
    public final TE k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final AZ0 p;
    public AZ0 q;
    public long r;
    public long s;
    public long t;
    public long u;
    public final Socket v;
    public final C6389p40 w;
    public final C6185o1 x;
    public final LinkedHashSet y;

    static {
        AZ0 az0 = new AZ0();
        az0.c(7, 65535);
        az0.c(5, 16384);
        z = az0;
    }

    public C4085h40(U41 u41) {
        this.a = (AbstractC2256b40) u41.f;
        String str = (String) u41.c;
        if (str == null) {
            O90.o("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        C2272b91 c2272b91 = (C2272b91) u41.a;
        this.g = c2272b91;
        this.h = c2272b91.e();
        this.i = c2272b91.e();
        this.j = c2272b91.e();
        this.k = TE.h;
        AZ0 az0 = new AZ0();
        az0.c(7, 16777216);
        this.p = az0;
        this.q = z;
        this.u = r0.a();
        Socket socket = (Socket) u41.b;
        if (socket == null) {
            O90.o("socket");
            throw null;
        }
        this.v = socket;
        C8161yN0 c8161yN0 = (C8161yN0) u41.e;
        if (c8161yN0 == null) {
            O90.o("sink");
            throw null;
        }
        this.w = new C6389p40(c8161yN0);
        C8351zN0 c8351zN0 = (C8351zN0) u41.d;
        if (c8351zN0 == null) {
            O90.o("source");
            throw null;
        }
        this.x = new C6185o1(this, 2, new C5434k40(c8351zN0));
        this.y = new LinkedHashSet();
    }

    public final void a(int i, int i2, IOException iOException) throws IOException {
        int i3;
        Object[] array;
        NX.m(i, "connectionCode");
        NX.m(i2, "streamCode");
        byte[] bArr = AbstractC0199Ch1.a;
        try {
            g(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new C6198o40[0]);
                this.b.clear();
            }
        }
        C6198o40[] c6198o40Arr = (C6198o40[]) array;
        if (c6198o40Arr != null) {
            for (C6198o40 c6198o40 : c6198o40Arr) {
                try {
                    c6198o40.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.h.f();
        this.i.f();
        this.j.f();
    }

    public final synchronized C6198o40 c(int i) {
        return (C6198o40) this.b.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(1, 9, null);
    }

    public final synchronized boolean e(long j) {
        if (this.f) {
            return false;
        }
        if (this.n < this.m) {
            if (j >= this.o) {
                return false;
            }
        }
        return true;
    }

    public final synchronized C6198o40 f(int i) {
        C6198o40 c6198o40;
        c6198o40 = (C6198o40) this.b.remove(Integer.valueOf(i));
        notifyAll();
        return c6198o40;
    }

    public final void g(int i) {
        NX.m(i, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        synchronized (this.w) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.w.f(AbstractC0199Ch1.a, this.d, i);
            }
        }
    }

    public final synchronized void j(long j) {
        long j2 = this.r + j;
        this.r = j2;
        long j3 = j2 - this.s;
        if (j3 >= this.p.a() / 2) {
            n(0, j3);
            this.s += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.w.c);
        r6 = r2;
        r8.t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r9, boolean r10, defpackage.C6129nj r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            p40 r12 = r8.w
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            p40 r4 = r8.w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            p40 r4 = r8.w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4085h40.l(int, boolean, nj, long):void");
    }

    public final void m(int i, int i2) {
        NX.m(i2, "errorCode");
        this.h.c(new C3322d40(this.c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j) {
        this.h.c(new C3894g40(this.c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
