package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2574cl {
    public final N01 a;
    public final long b;
    public final int c;
    public C3538eD d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public C2521cT0 j;

    public C2574cl(N01 n01) {
        n01.getClass();
        this.a = n01;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            AbstractC0277Dh1.h(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            long j = this.h;
            N01 n01 = this.a;
            synchronized (n01) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    P01 p01B = P01.b(file, j, -9223372036854775807L, n01.c);
                    p01B.getClass();
                    C5753ll c5753llQ = n01.c.q(p01B.a);
                    c5753llQ.getClass();
                    YN1.f(c5753llQ.a(p01B.b, p01B.c));
                    long jA = AbstractC1705Vq.a(c5753llQ.e);
                    if (jA != -1) {
                        YN1.f(p01B.b + p01B.c <= jA);
                    }
                    if (n01.d == null) {
                        n01.b(p01B);
                        n01.c.C();
                        n01.notifyAll();
                        return;
                    }
                    try {
                        n01.d.H(p01B.c, p01B.f, file.getName());
                        n01.b(p01B);
                        try {
                            n01.c.C();
                            n01.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new C1531Tk(e);
                        }
                    } catch (IOException e2) {
                        throw new C1531Tk(e2);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0277Dh1.h(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(C3538eD c3538eD) {
        File fileC;
        long j = c3538eD.g;
        long jMin = j == -1 ? -1L : Math.min(j - this.i, this.e);
        N01 n01 = this.a;
        String str = c3538eD.h;
        int i = AbstractC0277Dh1.a;
        long j2 = c3538eD.f + this.i;
        synchronized (n01) {
            try {
                n01.d();
                C5753ll c5753llQ = n01.c.q(str);
                c5753llQ.getClass();
                YN1.f(c5753llQ.a(j2, jMin));
                if (!n01.a.exists()) {
                    N01.e(n01.a);
                    n01.l();
                }
                C5363ji0 c5363ji0 = n01.b;
                if (jMin != -1) {
                    c5363ji0.a(n01, jMin);
                } else {
                    c5363ji0.getClass();
                }
                File file = new File(n01.a, Integer.toString(n01.f.nextInt(10)));
                if (!file.exists()) {
                    N01.e(file);
                }
                fileC = P01.c(file, c5753llQ.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            C2521cT0 c2521cT0 = this.j;
            if (c2521cT0 == null) {
                this.j = new C2521cT0(fileOutputStream, this.c);
            } else {
                c2521cT0.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }
}
