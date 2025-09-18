package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3450dl implements ZC {
    public final N01 a;
    public final ZC b;
    public final C3528e91 c;
    public final ZC d;
    public final boolean e = false;
    public final boolean f = false;
    public final boolean g = false;
    public Uri h;
    public C3538eD i;
    public C3538eD j;
    public ZC k;
    public long l;
    public long m;
    public long n;
    public P01 o;
    public boolean p;
    public boolean q;
    public long r;

    public C3450dl(N01 n01, ZC zc, ZC zc2, C2574cl c2574cl) {
        this.a = n01;
        this.b = zc2;
        if (zc != null) {
            this.d = zc;
            this.c = c2574cl != null ? new C3528e91(zc, c2574cl) : null;
        } else {
            this.d = C6028nB0.a;
            this.c = null;
        }
    }

    public final void a() {
        N01 n01 = this.a;
        ZC zc = this.k;
        if (zc == null) {
            return;
        }
        try {
            zc.close();
        } finally {
            this.j = null;
            this.k = null;
            P01 p01 = this.o;
            if (p01 != null) {
                n01.j(p01);
                this.o = null;
            }
        }
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) {
        N01 n01 = this.a;
        try {
            String string = c3538eD.h;
            long j = c3538eD.f;
            if (string == null) {
                string = c3538eD.a.toString();
            }
            C3348dD c3348dDA = c3538eD.a();
            c3348dDA.h = string;
            C3538eD c3538eDA = c3348dDA.a();
            this.i = c3538eDA;
            Uri uri = c3538eDA.a;
            byte[] bArr = (byte[]) n01.g(string).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, AbstractC8250yr.c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.h = uri;
            this.m = j;
            boolean z = this.f;
            long j2 = c3538eD.g;
            boolean z2 = (z && this.p) || (this.g && j2 == -1);
            this.q = z2;
            if (z2) {
                this.n = -1L;
            } else {
                long jA = AbstractC1705Vq.a(n01.g(string));
                this.n = jA;
                if (jA != -1) {
                    long j3 = jA - j;
                    this.n = j3;
                    if (j3 < 0) {
                        throw new C2091aD(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.n;
                this.n = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.n;
            if (j5 > 0 || j5 == -1) {
                e(c3538eDA, false);
            }
            return j2 != -1 ? j2 : this.n;
        } catch (Throwable th) {
            if (this.k == this.b || (th instanceof C1531Tk)) {
                this.p = true;
            }
            throw th;
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        this.i = null;
        this.h = null;
        this.m = 0L;
        try {
            a();
        } catch (Throwable th) {
            if (this.k == this.b || (th instanceof C1531Tk)) {
                this.p = true;
            }
            throw th;
        }
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
        interfaceC4188hc1.getClass();
        this.b.d(interfaceC4188hc1);
        this.d.d(interfaceC4188hc1);
    }

    public final void e(C3538eD c3538eD, boolean z) throws InterruptedIOException {
        P01 p01M;
        C3538eD c3538eDA;
        ZC zc;
        String str = c3538eD.h;
        int i = AbstractC0277Dh1.a;
        if (this.q) {
            p01M = null;
        } else if (this.e) {
            try {
                N01 n01 = this.a;
                long j = this.m;
                long j2 = this.n;
                synchronized (n01) {
                    n01.d();
                    while (true) {
                        p01M = n01.m(j, j2, str);
                        if (p01M != null) {
                            break;
                        } else {
                            n01.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            p01M = this.a.m(this.m, this.n, str);
        }
        if (p01M == null) {
            zc = this.d;
            C3348dD c3348dDA = c3538eD.a();
            c3348dDA.f = this.m;
            c3348dDA.g = this.n;
            c3538eDA = c3348dDA.a();
        } else if (p01M.d) {
            Uri uriFromFile = Uri.fromFile(p01M.e);
            long j3 = p01M.b;
            long j4 = this.m - j3;
            long jMin = p01M.c - j4;
            long j5 = this.n;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            C3348dD c3348dDA2 = c3538eD.a();
            c3348dDA2.a = uriFromFile;
            c3348dDA2.b = j3;
            c3348dDA2.f = j4;
            c3348dDA2.g = jMin;
            c3538eDA = c3348dDA2.a();
            zc = this.b;
        } else {
            long jMin2 = p01M.c;
            if (jMin2 == -1) {
                jMin2 = this.n;
            } else {
                long j6 = this.n;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            C3348dD c3348dDA3 = c3538eD.a();
            c3348dDA3.f = this.m;
            c3348dDA3.g = jMin2;
            c3538eDA = c3348dDA3.a();
            zc = this.c;
            if (zc == null) {
                zc = this.d;
                this.a.j(p01M);
                p01M = null;
            }
        }
        this.r = (this.q || zc != this.d) ? Long.MAX_VALUE : this.m + 102400;
        if (z) {
            YN1.f(this.k == this.d);
            if (zc == this.d) {
                return;
            }
            try {
                a();
            } finally {
            }
        }
        if (p01M != null && !p01M.d) {
            this.o = p01M;
        }
        this.k = zc;
        this.j = c3538eDA;
        this.l = 0L;
        long jC = zc.c(c3538eDA);
        C3383dO1 c3383dO1 = new C3383dO1(9);
        if (c3538eDA.g == -1 && jC != -1) {
            this.n = jC;
            c3383dO1.o(Long.valueOf(this.m + jC), "exo_len");
        }
        if (!(this.k == this.b)) {
            Uri uriO = zc.o();
            this.h = uriO;
            Uri uri = c3538eD.a.equals(uriO) ? null : this.h;
            if (uri == null) {
                ((ArrayList) c3383dO1.c).add("exo_redir");
                ((HashMap) c3383dO1.b).remove("exo_redir");
            } else {
                c3383dO1.o(uri.toString(), "exo_redir");
            }
        }
        if (this.k == this.c) {
            this.a.c(str, c3383dO1);
        }
    }

    @Override // defpackage.ZC
    public final Map l() {
        return !(this.k == this.b) ? this.d.l() : Collections.emptyMap();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        return this.h;
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) {
        int i3;
        ZC zc = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        C3538eD c3538eD = this.i;
        c3538eD.getClass();
        C3538eD c3538eD2 = this.j;
        c3538eD2.getClass();
        try {
            if (this.m >= this.r) {
                e(c3538eD, true);
            }
            ZC zc2 = this.k;
            zc2.getClass();
            int iR = zc2.r(bArr, i, i2);
            if (iR != -1) {
                long j = iR;
                this.m += j;
                this.l += j;
                long j2 = this.n;
                if (j2 != -1) {
                    this.n = j2 - j;
                }
                return iR;
            }
            ZC zc3 = this.k;
            if (zc3 == zc) {
                i3 = iR;
            } else {
                i3 = iR;
                long j3 = c3538eD2.g;
                if (j3 == -1 || this.l < j3) {
                    String str = c3538eD.h;
                    int i4 = AbstractC0277Dh1.a;
                    this.n = 0L;
                    if (!(zc3 == this.c)) {
                        return i3;
                    }
                    C3383dO1 c3383dO1 = new C3383dO1(9);
                    c3383dO1.o(Long.valueOf(this.m), "exo_len");
                    this.a.c(str, c3383dO1);
                    return i3;
                }
            }
            long j4 = this.n;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            a();
            e(c3538eD, false);
            return r(bArr, i, i2);
        } catch (Throwable th) {
            if (this.k == zc || (th instanceof C1531Tk)) {
                this.p = true;
            }
            throw th;
        }
    }
}
