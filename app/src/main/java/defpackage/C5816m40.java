package defpackage;

import java.io.IOException;

/* renamed from: m40 */
/* loaded from: classes2.dex */
public final class C5816m40 implements U21 {
    public final long a;
    public boolean b;
    public final C6129nj c = new C6129nj();
    public final C6129nj d = new C6129nj();
    public boolean e;
    public final /* synthetic */ C6198o40 f;

    public C5816m40(C6198o40 c6198o40, long j, boolean z) {
        this.f = c6198o40;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws Throwable {
        Throwable c4280i51;
        boolean z;
        long jH;
        O90.f(c6129nj, "sink");
        do {
            C6198o40 c6198o40 = this.f;
            synchronized (c6198o40) {
                c6198o40.k.i();
                try {
                    if (c6198o40.f() == 0 || this.b) {
                        c4280i51 = null;
                    } else {
                        c4280i51 = c6198o40.n;
                        if (c4280i51 == null) {
                            int iF = c6198o40.f();
                            NX.l(iF);
                            c4280i51 = new C4280i51(iF);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    C6129nj c6129nj2 = this.d;
                    long j2 = c6129nj2.b;
                    z = false;
                    if (j2 > 0) {
                        jH = c6129nj2.H(c6129nj, Math.min(8192L, j2));
                        long j3 = c6198o40.c + jH;
                        c6198o40.c = j3;
                        long j4 = j3 - c6198o40.d;
                        if (c4280i51 == null && j4 >= c6198o40.b.p.a() / 2) {
                            c6198o40.b.n(c6198o40.a, j4);
                            c6198o40.d = c6198o40.c;
                        }
                    } else {
                        if (!this.b && c4280i51 == null) {
                            c6198o40.l();
                            z = true;
                        }
                        jH = -1;
                    }
                    c6198o40.k.l();
                } finally {
                }
            }
        } while (z);
        if (jH != -1) {
            return jH;
        }
        if (c4280i51 == null) {
            return -1L;
        }
        throw c4280i51;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C6198o40 c6198o40 = this.f;
        synchronized (c6198o40) {
            this.e = true;
            C6129nj c6129nj = this.d;
            j = c6129nj.b;
            c6129nj.m();
            c6198o40.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = AbstractC0199Ch1.a;
            this.f.b.j(j);
        }
        this.f.a();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.f.k;
    }
}
