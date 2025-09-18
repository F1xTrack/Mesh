package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class RV implements WR {
    public YR e;
    public InterfaceC1584Ub1 f;
    public C0540Gr0 h;
    public UV i;
    public int j;
    public int k;
    public QV l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final C4103hA0 b = new C4103hA0(new byte[32768], 0);
    public final boolean c = false;
    public final SV d = new SV();
    public int g = 0;

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws C5643lA0, EOFException, InterruptedIOException {
        UV uv;
        CX0 c4004gf;
        long j;
        boolean z;
        long j2;
        boolean zA;
        boolean z2 = true;
        int i = this.g;
        C0540Gr0 c0540Gr0 = null;
        if (i == 0) {
            ((C7566vF) xr).f = 0;
            C7566vF c7566vF = (C7566vF) xr;
            long j3 = c7566vF.j();
            C0540Gr0 c0540Gr0X = new C0136Bm1(21).x(c7566vF, !this.c ? null : U50.b);
            if (c0540Gr0X != null && c0540Gr0X.a.length != 0) {
                c0540Gr0 = c0540Gr0X;
            }
            c7566vF.n((int) (c7566vF.j() - j3));
            this.h = c0540Gr0;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            ((C7566vF) xr).f(bArr, 0, bArr.length, false);
            ((C7566vF) xr).f = 0;
            this.g = 2;
            return 0;
        }
        int i2 = 3;
        if (i == 2) {
            C4103hA0 c4103hA0 = new C4103hA0(4);
            ((C7566vF) xr).b(c4103hA0.a, 0, 4, false);
            if (c4103hA0.w() != 1716281667) {
                throw C5643lA0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        if (i == 3) {
            ?? r1 = 0;
            UV uv2 = this.i;
            boolean z3 = false;
            while (!z3) {
                ((C7566vF) xr).f = r1;
                byte[] bArr2 = new byte[4];
                C0848Kq c0848Kq = new C0848Kq(bArr2, 4);
                C7566vF c7566vF2 = (C7566vF) xr;
                c7566vF2.f(bArr2, r1, 4, r1);
                boolean zK = c0848Kq.k();
                int iL = c0848Kq.l(i);
                int iL2 = c0848Kq.l(24) + 4;
                if (iL == 0) {
                    byte[] bArr3 = new byte[38];
                    c7566vF2.b(bArr3, r1, 38, r1);
                    uv = new UV(bArr3, 4);
                } else {
                    if (uv2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iL == i2) {
                        C4103hA0 c4103hA02 = new C4103hA0(iL2);
                        c7566vF2.b(c4103hA02.a, 0, iL2, false);
                        uv = new UV(uv2.a, uv2.b, uv2.c, uv2.d, uv2.e, uv2.g, uv2.h, uv2.j, AbstractC3693f12.b(c4103hA02), uv2.l);
                    } else {
                        C0540Gr0 c0540Gr02 = uv2.l;
                        if (iL == 4) {
                            C4103hA0 c4103hA03 = new C4103hA0(iL2);
                            c7566vF2.b(c4103hA03.a, 0, iL2, false);
                            c4103hA03.H(4);
                            C0540Gr0 c0540Gr0C = U02.c(Arrays.asList((String[]) U02.d(c4103hA03, false, false).a));
                            if (c0540Gr02 != null) {
                                c0540Gr0C = c0540Gr02.b(c0540Gr0C);
                            }
                            uv = new UV(uv2.a, uv2.b, uv2.c, uv2.d, uv2.e, uv2.g, uv2.h, uv2.j, uv2.k, c0540Gr0C);
                        } else if (iL == 6) {
                            C4103hA0 c4103hA04 = new C4103hA0(iL2);
                            c7566vF2.b(c4103hA04.a, 0, iL2, false);
                            c4103hA04.H(4);
                            C0540Gr0 c0540Gr03 = new C0540Gr0(P70.B(C2467cB0.a(c4103hA04)));
                            if (c0540Gr02 != null) {
                                c0540Gr03 = c0540Gr02.b(c0540Gr03);
                            }
                            uv = new UV(uv2.a, uv2.b, uv2.c, uv2.d, uv2.e, uv2.g, uv2.h, uv2.j, uv2.k, c0540Gr03);
                        } else {
                            c7566vF2.n(iL2);
                            int i3 = AbstractC0277Dh1.a;
                            this.i = uv2;
                            z3 = zK;
                            r1 = 0;
                            i2 = 3;
                            i = 7;
                        }
                    }
                }
                uv2 = uv;
                int i32 = AbstractC0277Dh1.a;
                this.i = uv2;
                z3 = zK;
                r1 = 0;
                i2 = 3;
                i = 7;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            InterfaceC1584Ub1 interfaceC1584Ub1 = this.f;
            int i4 = AbstractC0277Dh1.a;
            interfaceC1584Ub1.f(this.i.c(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j4 = 0;
        if (i == 4) {
            ((C7566vF) xr).f = 0;
            C4103hA0 c4103hA05 = new C4103hA0(2);
            C7566vF c7566vF3 = (C7566vF) xr;
            c7566vF3.f(c4103hA05.a, 0, 2, false);
            int iA = c4103hA05.A();
            if ((iA >> 2) != 16382) {
                c7566vF3.f = 0;
                throw C5643lA0.a(null, "First frame does not start with sync code.");
            }
            c7566vF3.f = 0;
            this.k = iA;
            YR yr = this.e;
            int i5 = AbstractC0277Dh1.a;
            long j5 = c7566vF3.d;
            this.i.getClass();
            UV uv3 = this.i;
            if (uv3.k != null) {
                c4004gf = new C4004gf(uv3, j5, 1);
            } else {
                long j6 = c7566vF3.c;
                if (j6 == -1 || uv3.j <= 0) {
                    c4004gf = new C4004gf(uv3.b());
                } else {
                    int i6 = this.k;
                    EE ee = new EE(13, uv3);
                    VY vy = new VY(uv3, i6);
                    long jB = uv3.b();
                    int i7 = uv3.c;
                    int i8 = uv3.d;
                    if (i8 > 0) {
                        j = ((i8 + i7) / 2) + 1;
                    } else {
                        int i9 = uv3.b;
                        int i10 = uv3.a;
                        j = (((((i10 != i9 || i10 <= 0) ? 4096L : i10) * uv3.g) * uv3.h) / 8) + 64;
                    }
                    QV qv = new QV(ee, vy, jB, uv3.j, j5, j6, j, Math.max(6, i7));
                    this.l = qv;
                    c4004gf = qv.a;
                }
            }
            yr.x(c4004gf);
            this.g = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        QV qv2 = this.l;
        if (qv2 != null && qv2.c != null) {
            return qv2.b((C7566vF) xr, sv);
        }
        if (this.n == -1) {
            UV uv4 = this.i;
            ((C7566vF) xr).f = 0;
            C7566vF c7566vF4 = (C7566vF) xr;
            c7566vF4.a(1, false);
            byte[] bArr4 = new byte[1];
            c7566vF4.f(bArr4, 0, 1, false);
            boolean z4 = (bArr4[0] & 1) == 1;
            c7566vF4.a(2, false);
            i = z4 ? 7 : 6;
            C4103hA0 c4103hA06 = new C4103hA0(i);
            byte[] bArr5 = c4103hA06.a;
            int i11 = 0;
            while (i11 < i) {
                int iG = c7566vF4.g(bArr5, i11, i - i11);
                if (iG == -1) {
                    break;
                }
                i11 += iG;
            }
            c4103hA06.F(i11);
            c7566vF4.f = 0;
            try {
                long jB2 = c4103hA06.B();
                if (!z4) {
                    jB2 *= uv4.b;
                }
                j4 = jB2;
            } catch (NumberFormatException unused) {
                z2 = false;
            }
            if (!z2) {
                throw C5643lA0.a(null, null);
            }
            this.n = j4;
            return 0;
        }
        C4103hA0 c4103hA07 = this.b;
        int i12 = c4103hA07.c;
        if (i12 < 32768) {
            int iR = ((C7566vF) xr).r(c4103hA07.a, i12, 32768 - i12);
            z = iR == -1;
            if (!z) {
                c4103hA07.F(i12 + iR);
            } else if (c4103hA07.a() == 0) {
                long j7 = this.n * 1000000;
                UV uv5 = this.i;
                int i13 = AbstractC0277Dh1.a;
                this.f.a(j7 / uv5.e, 1, this.m, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i14 = c4103hA07.b;
        int i15 = this.m;
        int i16 = this.j;
        if (i15 < i16) {
            c4103hA07.H(Math.min(i16 - i15, c4103hA07.a()));
        }
        this.i.getClass();
        int i17 = c4103hA07.b;
        while (true) {
            int i18 = c4103hA07.c - 16;
            SV sv2 = this.d;
            if (i17 <= i18) {
                c4103hA07.G(i17);
                if (AbstractC3502e12.a(c4103hA07, this.i, this.k, sv2)) {
                    c4103hA07.G(i17);
                    j2 = sv2.a;
                    break;
                }
                i17++;
            } else {
                if (z) {
                    while (true) {
                        int i19 = c4103hA07.c;
                        if (i17 > i19 - this.j) {
                            c4103hA07.G(i19);
                            break;
                        }
                        c4103hA07.G(i17);
                        try {
                            zA = AbstractC3502e12.a(c4103hA07, this.i, this.k, sv2);
                        } catch (IndexOutOfBoundsException unused2) {
                            zA = false;
                        }
                        if (c4103hA07.b > c4103hA07.c) {
                            zA = false;
                        }
                        if (zA) {
                            c4103hA07.G(i17);
                            j2 = sv2.a;
                            break;
                        }
                        i17++;
                    }
                } else {
                    c4103hA07.G(i17);
                }
                j2 = -1;
            }
        }
        int i20 = c4103hA07.b - i14;
        c4103hA07.G(i14);
        this.f.d(i20, c4103hA07);
        int i21 = i20 + this.m;
        this.m = i21;
        if (j2 != -1) {
            long j8 = this.n * 1000000;
            UV uv6 = this.i;
            int i22 = AbstractC0277Dh1.a;
            this.f.a(j8 / uv6.e, 1, i21, 0, null);
            this.m = 0;
            this.n = j2;
        }
        if (c4103hA07.a() >= 16) {
            return 0;
        }
        int iA2 = c4103hA07.a();
        byte[] bArr6 = c4103hA07.a;
        System.arraycopy(bArr6, c4103hA07.b, bArr6, 0, iA2);
        c4103hA07.G(0);
        c4103hA07.F(iA2);
        return 0;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        C7566vF c7566vF = (C7566vF) xr;
        C0540Gr0 c0540Gr0X = new C0136Bm1(21).x(c7566vF, U50.b);
        if (c0540Gr0X != null) {
            int length = c0540Gr0X.a.length;
        }
        C4103hA0 c4103hA0 = new C4103hA0(4);
        c7566vF.f(c4103hA0.a, 0, 4, false);
        return c4103hA0.w() == 1716281667;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            QV qv = this.l;
            if (qv != null) {
                qv.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.D(0);
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.e = yr;
        this.f = yr.w(0, 1);
        yr.p();
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
