package defpackage;

import java.util.Collections;

/* renamed from: Xg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832Xg0 implements InterfaceC6254oN {
    public final String a;
    public final int b;
    public final C4103hA0 c;
    public final C0848Kq d;
    public InterfaceC1584Ub1 e;
    public String f;
    public C6666qX g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public C1832Xg0(String str, int i) {
        this.a = str;
        this.b = i;
        C4103hA0 c4103hA0 = new C4103hA0(1024);
        this.c = c4103hA0;
        byte[] bArr = c4103hA0.a;
        this.d = new C0848Kq(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void b(C4103hA0 c4103hA0) throws C5643lA0 {
        int iL;
        boolean zK;
        YN1.h(this.e);
        while (c4103hA0.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    C4103hA0 c4103hA02 = this.c;
                    C0848Kq c0848Kq = this.d;
                    if (i == 2) {
                        int iU = ((this.k & (-225)) << 8) | c4103hA0.u();
                        this.j = iU;
                        if (iU > c4103hA02.a.length) {
                            c4103hA02.D(iU);
                            byte[] bArr = c4103hA02.a;
                            c0848Kq.getClass();
                            c0848Kq.r(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c4103hA0.a(), this.j - this.i);
                        c4103hA0.e(c0848Kq.b, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            c0848Kq.t(0);
                            if (c0848Kq.k()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iL2 = c0848Kq.l(1);
                                int iL3 = iL2 == 1 ? c0848Kq.l(1) : 0;
                                this.n = iL3;
                                if (iL3 != 0) {
                                    throw C5643lA0.a(null, null);
                                }
                                if (iL2 == 1) {
                                    c0848Kq.l((c0848Kq.l(2) + 1) * 8);
                                }
                                if (!c0848Kq.k()) {
                                    throw C5643lA0.a(null, null);
                                }
                                this.o = c0848Kq.l(6);
                                int iL4 = c0848Kq.l(4);
                                int iL5 = c0848Kq.l(3);
                                if (iL4 != 0 || iL5 != 0) {
                                    throw C5643lA0.a(null, null);
                                }
                                if (iL2 == 0) {
                                    int iJ = c0848Kq.j();
                                    int iC = c0848Kq.c();
                                    C6371p c6371pD = AbstractC1993Zi.d(c0848Kq, true);
                                    this.v = c6371pD.b;
                                    this.s = c6371pD.c;
                                    this.u = c6371pD.d;
                                    int iC2 = iC - c0848Kq.c();
                                    c0848Kq.t(iJ);
                                    byte[] bArr2 = new byte[(iC2 + 7) / 8];
                                    c0848Kq.m(iC2, bArr2);
                                    C6475pX c6475pX = new C6475pX();
                                    c6475pX.a = this.f;
                                    c6475pX.l = AbstractC1865Xr0.n("audio/mp4a-latm");
                                    c6475pX.i = this.v;
                                    c6475pX.z = this.u;
                                    c6475pX.A = this.s;
                                    c6475pX.o = Collections.singletonList(bArr2);
                                    c6475pX.d = this.a;
                                    c6475pX.f = this.b;
                                    C6666qX c6666qX = new C6666qX(c6475pX);
                                    if (!c6666qX.equals(this.g)) {
                                        this.g = c6666qX;
                                        this.t = 1024000000 / c6666qX.B;
                                        this.e.f(c6666qX);
                                    }
                                } else {
                                    int iC3 = c0848Kq.c();
                                    C6371p c6371pD2 = AbstractC1993Zi.d(c0848Kq, true);
                                    this.v = c6371pD2.b;
                                    this.s = c6371pD2.c;
                                    this.u = c6371pD2.d;
                                    c0848Kq.w(c0848Kq.l((c0848Kq.l(2) + 1) * 8) - (iC3 - c0848Kq.c()));
                                }
                                int iL6 = c0848Kq.l(3);
                                this.p = iL6;
                                if (iL6 == 0) {
                                    c0848Kq.w(8);
                                } else if (iL6 == 1) {
                                    c0848Kq.w(9);
                                } else if (iL6 == 3 || iL6 == 4 || iL6 == 5) {
                                    c0848Kq.w(6);
                                } else {
                                    if (iL6 != 6 && iL6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c0848Kq.w(1);
                                }
                                boolean zK2 = c0848Kq.k();
                                this.q = zK2;
                                this.r = 0L;
                                if (zK2) {
                                    if (iL2 == 1) {
                                        this.r = c0848Kq.l((c0848Kq.l(2) + 1) * 8);
                                    } else {
                                        do {
                                            zK = c0848Kq.k();
                                            this.r = (this.r << 8) + c0848Kq.l(8);
                                        } while (zK);
                                    }
                                }
                                if (c0848Kq.k()) {
                                    c0848Kq.w(8);
                                }
                            }
                            if (this.n != 0) {
                                throw C5643lA0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw C5643lA0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw C5643lA0.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iL = c0848Kq.l(8);
                                i3 += iL;
                            } while (iL == 255);
                            int iJ2 = c0848Kq.j();
                            if ((iJ2 & 7) == 0) {
                                c4103hA02.G(iJ2 >> 3);
                            } else {
                                c0848Kq.m(i3 * 8, c4103hA02.a);
                                c4103hA02.G(0);
                            }
                            this.e.d(i3, c4103hA02);
                            YN1.f(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                c0848Kq.w((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = c4103hA0.u();
                    if ((iU2 & 224) == 224) {
                        this.k = iU2;
                        this.h = 2;
                    } else if (iU2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (c4103hA0.u() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.e = yr.w(ym0.e, 1);
        ym0.b();
        this.f = (String) ym0.b;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
    }
}
