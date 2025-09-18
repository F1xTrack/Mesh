package p000;

import java.io.IOException;

/* renamed from: m40 */
/* loaded from: classes2.dex */
public final class C10219m40 implements U21 {

    /* renamed from: a */
    public final long f37460a;

    /* renamed from: b */
    public boolean f37461b;

    /* renamed from: c */
    public final C6507nj f37462c = new C6507nj();

    /* renamed from: d */
    public final C6507nj f37463d = new C6507nj();

    /* renamed from: e */
    public boolean f37464e;

    /* renamed from: f */
    public final /* synthetic */ C10475o40 f37465f;

    public C10219m40(C10475o40 c10475o40, long j, boolean z) {
        this.f37465f = c10475o40;
        this.f37460a = j;
        this.f37461b = z;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws Throwable {
        Throwable c9710i51;
        boolean z;
        long jMo96H;
        O90.m5968f(c6507nj, "sink");
        do {
            C10475o40 c10475o40 = this.f37465f;
            synchronized (c10475o40) {
                c10475o40.f38766k.m25369i();
                try {
                    if (c10475o40.m23334f() == 0 || this.f37461b) {
                        c9710i51 = null;
                    } else {
                        c9710i51 = c10475o40.f38769n;
                        if (c9710i51 == null) {
                            int iM23334f = c10475o40.m23334f();
                            AbstractC0852NX.m5763l(iM23334f);
                            c9710i51 = new C9710i51(iM23334f);
                        }
                    }
                    if (this.f37464e) {
                        throw new IOException("stream closed");
                    }
                    C6507nj c6507nj2 = this.f37463d;
                    long j2 = c6507nj2.f38488b;
                    z = false;
                    if (j2 > 0) {
                        jMo96H = c6507nj2.mo96H(c6507nj, Math.min(8192L, j2));
                        long j3 = c10475o40.f38758c + jMo96H;
                        c10475o40.f38758c = j3;
                        long j4 = j3 - c10475o40.f38759d;
                        if (c9710i51 == null && j4 >= c10475o40.f38757b.f28229p.m230a() / 2) {
                            c10475o40.f38757b.m18721n(c10475o40.f38756a, j4);
                            c10475o40.f38759d = c10475o40.f38758c;
                        }
                    } else {
                        if (!this.f37461b && c9710i51 == null) {
                            c10475o40.m23340l();
                            z = true;
                        }
                        jMo96H = -1;
                    }
                    c10475o40.f38766k.m23068l();
                } finally {
                }
            }
        } while (z);
        if (jMo96H != -1) {
            return jMo96H;
        }
        if (c9710i51 == null) {
            return -1L;
        }
        throw c9710i51;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C10475o40 c10475o40 = this.f37465f;
        synchronized (c10475o40) {
            this.f37464e = true;
            C6507nj c6507nj = this.f37463d;
            j = c6507nj.f38488b;
            c6507nj.m23186m();
            c10475o40.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = AbstractC7433Ch1.f1577a;
            this.f37465f.f38757b.m18718j(j);
        }
        this.f37465f.m23329a();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f37465f.f38766k;
    }
}
