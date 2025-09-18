package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: o40 */
/* loaded from: classes2.dex */
public final class C6198o40 {
    public final int a;
    public final C4085h40 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final C5816m40 i;
    public final C5625l40 j;
    public final C6007n40 k;
    public final C6007n40 l;
    public int m;
    public IOException n;

    public C6198o40(int i, C4085h40 c4085h40, boolean z, boolean z2, K20 k20) {
        O90.f(c4085h40, "connection");
        this.a = i;
        this.b = c4085h40;
        this.f = c4085h40.q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new C5816m40(this, c4085h40.p.a(), z2);
        this.j = new C5625l40(this, z);
        this.k = new C6007n40(this);
        this.l = new C6007n40(this);
        if (k20 == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(k20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = defpackage.AbstractC0199Ch1.a
            monitor-enter(r2)
            m40 r0 = r2.i     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            l40 r0 = r2.j     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.c(r0, r1)
            goto L33
        L2a:
            if (r1 != 0) goto L33
            h40 r0 = r2.b
            int r1 = r2.a
            r0.f(r1)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6198o40.a():void");
    }

    public final void b() throws IOException {
        C5625l40 c5625l40 = this.j;
        if (c5625l40.c) {
            throw new IOException("stream closed");
        }
        if (c5625l40.a) {
            throw new IOException("stream finished");
        }
        if (this.m != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.m;
            NX.l(i);
            throw new C4280i51(i);
        }
    }

    public final void c(int i, IOException iOException) {
        NX.m(i, "rstStatusCode");
        if (d(i, iOException)) {
            C4085h40 c4085h40 = this.b;
            c4085h40.getClass();
            NX.m(i, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
            c4085h40.w.l(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = AbstractC0199Ch1.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.b) {
                if (this.j.a) {
                    return false;
                }
            }
            this.b.f(this.a);
            return true;
        }
    }

    public final void e(int i) {
        NX.m(i, "errorCode");
        if (d(i, null)) {
            this.b.m(this.a, i);
        }
    }

    public final synchronized int f() {
        return this.m;
    }

    public final C5625l40 g() {
        synchronized (this) {
            if (!this.h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean h() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean i() {
        if (this.m != 0) {
            return false;
        }
        C5816m40 c5816m40 = this.i;
        if (c5816m40.b || c5816m40.e) {
            C5625l40 c5625l40 = this.j;
            if (c5625l40.a || c5625l40.c) {
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(K20 k20, boolean z) {
        boolean zI;
        O90.f(k20, "headers");
        byte[] bArr = AbstractC0199Ch1.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(k20);
                }
                if (z) {
                    this.i.b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.b.f(this.a);
    }

    public final synchronized void k(int i) {
        NX.m(i, "errorCode");
        if (this.m == 0) {
            this.m = i;
            notifyAll();
        }
    }

    public final void l() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
