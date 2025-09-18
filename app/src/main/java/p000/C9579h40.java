package p000;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: h40 */
/* loaded from: classes2.dex */
public final class C9579h40 implements Closeable {

    /* renamed from: z */
    public static final AZ0 f28213z;

    /* renamed from: a */
    public final AbstractC8806b40 f28214a;

    /* renamed from: b */
    public final LinkedHashMap f28215b = new LinkedHashMap();

    /* renamed from: c */
    public final String f28216c;

    /* renamed from: d */
    public int f28217d;

    /* renamed from: e */
    public int f28218e;

    /* renamed from: f */
    public boolean f28219f;

    /* renamed from: g */
    public final C8817b91 f28220g;

    /* renamed from: h */
    public final C8689a91 f28221h;

    /* renamed from: i */
    public final C8689a91 f28222i;

    /* renamed from: j */
    public final C8689a91 f28223j;

    /* renamed from: k */
    public final C1210TE f28224k;

    /* renamed from: l */
    public long f28225l;

    /* renamed from: m */
    public long f28226m;

    /* renamed from: n */
    public long f28227n;

    /* renamed from: o */
    public long f28228o;

    /* renamed from: p */
    public final AZ0 f28229p;

    /* renamed from: q */
    public AZ0 f28230q;

    /* renamed from: r */
    public long f28231r;

    /* renamed from: s */
    public long f28232s;

    /* renamed from: t */
    public long f28233t;

    /* renamed from: u */
    public long f28234u;

    /* renamed from: v */
    public final Socket f28235v;

    /* renamed from: w */
    public final C10603p40 f28236w;

    /* renamed from: x */
    public final C6526o1 f28237x;

    /* renamed from: y */
    public final LinkedHashSet f28238y;

    static {
        AZ0 az0 = new AZ0();
        az0.m232c(7, 65535);
        az0.m232c(5, 16384);
        f28213z = az0;
    }

    public C9579h40(U41 u41) {
        this.f28214a = (AbstractC8806b40) u41.f11649f;
        String str = (String) u41.f11646c;
        if (str == null) {
            O90.m5977o("connectionName");
            throw null;
        }
        this.f28216c = str;
        this.f28218e = 3;
        C8817b91 c8817b91 = (C8817b91) u41.f11644a;
        this.f28220g = c8817b91;
        this.f28221h = c8817b91.m10429e();
        this.f28222i = c8817b91.m10429e();
        this.f28223j = c8817b91.m10429e();
        this.f28224k = C1210TE.f11213h;
        AZ0 az0 = new AZ0();
        az0.m232c(7, 16777216);
        this.f28229p = az0;
        this.f28230q = f28213z;
        this.f28234u = r0.m230a();
        Socket socket = (Socket) u41.f11645b;
        if (socket == null) {
            O90.m5977o("socket");
            throw null;
        }
        this.f28235v = socket;
        C11790yN0 c11790yN0 = (C11790yN0) u41.f11648e;
        if (c11790yN0 == null) {
            O90.m5977o("sink");
            throw null;
        }
        this.f28236w = new C10603p40(c11790yN0);
        C11917zN0 c11917zN0 = (C11917zN0) u41.f11647d;
        if (c11917zN0 == null) {
            O90.m5977o("source");
            throw null;
        }
        this.f28237x = new C6526o1(this, 2, new C9963k40(c11917zN0));
        this.f28238y = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void m18713a(int i, int i2, IOException iOException) throws IOException {
        int i3;
        Object[] array;
        AbstractC0852NX.m5764m(i, "connectionCode");
        AbstractC0852NX.m5764m(i2, "streamCode");
        byte[] bArr = AbstractC7433Ch1.f1577a;
        try {
            m18717g(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f28215b.isEmpty()) {
                array = null;
            } else {
                array = this.f28215b.values().toArray(new C10475o40[0]);
                this.f28215b.clear();
            }
        }
        C10475o40[] c10475o40Arr = (C10475o40[]) array;
        if (c10475o40Arr != null) {
            for (C10475o40 c10475o40 : c10475o40Arr) {
                try {
                    c10475o40.m23331c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f28236w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f28235v.close();
        } catch (IOException unused4) {
        }
        this.f28221h.m9681f();
        this.f28222i.m9681f();
        this.f28223j.m9681f();
    }

    /* renamed from: c */
    public final synchronized C10475o40 m18714c(int i) {
        return (C10475o40) this.f28215b.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m18713a(1, 9, null);
    }

    /* renamed from: e */
    public final synchronized boolean m18715e(long j) {
        if (this.f28219f) {
            return false;
        }
        if (this.f28227n < this.f28226m) {
            if (j >= this.f28228o) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final synchronized C10475o40 m18716f(int i) {
        C10475o40 c10475o40;
        c10475o40 = (C10475o40) this.f28215b.remove(Integer.valueOf(i));
        notifyAll();
        return c10475o40;
    }

    /* renamed from: g */
    public final void m18717g(int i) {
        AbstractC0852NX.m5764m(i, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        synchronized (this.f28236w) {
            synchronized (this) {
                if (this.f28219f) {
                    return;
                }
                this.f28219f = true;
                this.f28236w.m23600f(AbstractC7433Ch1.f1577a, this.f28217d, i);
            }
        }
    }

    /* renamed from: j */
    public final synchronized void m18718j(long j) {
        long j2 = this.f28231r + j;
        this.f28231r = j2;
        long j3 = j2 - this.f28232s;
        if (j3 >= this.f28229p.m230a() / 2) {
            m18721n(0, j3);
            this.f28232s += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f28236w.f39771c);
        r6 = r2;
        r8.f28233t += r6;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18719l(int r9, boolean r10, p000.C6507nj r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            p40 r12 = r8.f28236w
            r12.m23598c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f28233t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f28234u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f28215b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
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
            p40 r4 = r8.f28236w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f39771c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f28233t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f28233t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            p40 r4 = r8.f28236w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m23598c(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C9579h40.m18719l(int, boolean, nj, long):void");
    }

    /* renamed from: m */
    public final void m18720m(int i, int i2) {
        AbstractC0852NX.m5764m(i2, "errorCode");
        this.f28221h.m9679c(new C9067d40(this.f28216c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    /* renamed from: n */
    public final void m18721n(int i, long j) {
        this.f28221h.m9679c(new C9451g40(this.f28216c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
