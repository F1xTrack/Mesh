package defpackage;

/* renamed from: oW */
/* loaded from: classes.dex */
public final class C6281oW {
    public int a;
    public C0791Jx d;
    public C0791Jx e;
    public C0791Jx f;
    public C0791Jx g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ C6663qW r;
    public C3488dy b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public C6281oW(C6663qW c6663qW, int i, C0791Jx c0791Jx, C0791Jx c0791Jx2, C0791Jx c0791Jx3, C0791Jx c0791Jx4, int i2) {
        this.r = c6663qW;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.a = i;
        this.d = c0791Jx;
        this.e = c0791Jx2;
        this.f = c0791Jx3;
        this.g = c0791Jx4;
        this.h = c6663qW.j0;
        this.i = c6663qW.f0;
        this.j = c6663qW.k0;
        this.k = c6663qW.g0;
        this.q = i2;
    }

    public final void a(C3488dy c3488dy) {
        int i = this.a;
        C6663qW c6663qW = this.r;
        if (i == 0) {
            int iD = c6663qW.D(c3488dy, this.q);
            if (c3488dy.c0[0] == 3) {
                this.p++;
                iD = 0;
            }
            this.l = iD + (c3488dy.V != 8 ? c6663qW.C0 : 0) + this.l;
            int iC = c6663qW.C(c3488dy, this.q);
            if (this.b == null || this.c < iC) {
                this.b = c3488dy;
                this.c = iC;
                this.m = iC;
            }
        } else {
            int iD2 = c6663qW.D(c3488dy, this.q);
            int iC2 = c6663qW.C(c3488dy, this.q);
            if (c3488dy.c0[1] == 3) {
                this.p++;
                iC2 = 0;
            }
            this.m = iC2 + (c3488dy.V != 8 ? c6663qW.D0 : 0) + this.m;
            if (this.b == null || this.c < iD2) {
                this.b = c3488dy;
                this.c = iD2;
                this.l = iD2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        C6663qW c6663qW;
        int i2;
        C3488dy c3488dy;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.o;
        int i8 = 0;
        while (true) {
            c6663qW = this.r;
            if (i8 >= i7 || (i6 = this.n + i8) >= c6663qW.O0) {
                break;
            }
            C3488dy c3488dy2 = c6663qW.N0[i6];
            if (c3488dy2 != null) {
                c3488dy2.t();
            }
            i8++;
        }
        if (i7 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= c6663qW.O0) {
                break;
            }
            if (c6663qW.N0[i12].V == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.a != 0) {
            C3488dy c3488dy3 = this.b;
            c3488dy3.X = c6663qW.q0;
            int i13 = this.h;
            if (i > 0) {
                i13 += c6663qW.C0;
            }
            C0791Jx c0791Jx = c3488dy3.x;
            C0791Jx c0791Jx2 = c3488dy3.z;
            if (z) {
                c0791Jx2.a(this.f, i13);
                if (z2) {
                    c0791Jx.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.b.x.a(c0791Jx2, 0);
                }
            } else {
                c0791Jx.a(this.d, i13);
                if (z2) {
                    c0791Jx2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.b.z.a(c0791Jx, 0);
                }
            }
            int i14 = 0;
            C3488dy c3488dy4 = null;
            while (i14 < i7) {
                int i15 = this.n + i14;
                if (i15 >= c6663qW.O0) {
                    return;
                }
                C3488dy c3488dy5 = c6663qW.N0[i15];
                if (i14 == 0) {
                    c3488dy5.e(c3488dy5.y, this.e, this.i);
                    int i16 = c6663qW.r0;
                    float f = c6663qW.x0;
                    if (this.n == 0) {
                        int i17 = c6663qW.t0;
                        i2 = -1;
                        if (i17 != -1) {
                            f = c6663qW.z0;
                        }
                        i16 = i17;
                        c3488dy5.Y = i16;
                        c3488dy5.T = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i17 = c6663qW.v0) != i2) {
                        f = c6663qW.B0;
                        i16 = i17;
                    }
                    c3488dy5.Y = i16;
                    c3488dy5.T = f;
                }
                if (i14 == i7 - 1) {
                    c3488dy5.e(c3488dy5.A, this.g, this.k);
                }
                if (c3488dy4 != null) {
                    C0791Jx c0791Jx3 = c3488dy5.y;
                    int i18 = c6663qW.D0;
                    C0791Jx c0791Jx4 = c3488dy4.A;
                    c0791Jx3.a(c0791Jx4, i18);
                    C0791Jx c0791Jx5 = c3488dy5.y;
                    if (i14 == i9) {
                        int i19 = this.i;
                        if (c0791Jx5.f()) {
                            c0791Jx5.f = i19;
                        }
                    }
                    c0791Jx4.a(c0791Jx5, 0);
                    if (i14 == i10 + 1) {
                        int i20 = this.k;
                        if (c0791Jx4.f()) {
                            c0791Jx4.f = i20;
                        }
                    }
                }
                if (c3488dy5 != c3488dy3) {
                    if (z) {
                        int i21 = c6663qW.E0;
                        if (i21 == 0) {
                            c3488dy5.z.a(c0791Jx2, 0);
                        } else if (i21 == 1) {
                            c3488dy5.x.a(c0791Jx, 0);
                        } else if (i21 == 2) {
                            c3488dy5.x.a(c0791Jx, 0);
                            c3488dy5.z.a(c0791Jx2, 0);
                        }
                    } else {
                        int i22 = c6663qW.E0;
                        if (i22 == 0) {
                            c3488dy5.x.a(c0791Jx, 0);
                        } else if (i22 == 1) {
                            c3488dy5.z.a(c0791Jx2, 0);
                        } else if (i22 == 2) {
                            if (z3) {
                                c3488dy5.x.a(this.d, this.h);
                                c3488dy5.z.a(this.f, this.j);
                            } else {
                                c3488dy5.x.a(c0791Jx, 0);
                                c3488dy5.z.a(c0791Jx2, 0);
                            }
                        }
                    }
                }
                i14++;
                c3488dy4 = c3488dy5;
            }
            return;
        }
        C3488dy c3488dy6 = this.b;
        c3488dy6.Y = c6663qW.r0;
        int i23 = this.i;
        if (i > 0) {
            i23 += c6663qW.D0;
        }
        C0791Jx c0791Jx6 = this.e;
        C0791Jx c0791Jx7 = c3488dy6.y;
        c0791Jx7.a(c0791Jx6, i23);
        C0791Jx c0791Jx8 = c3488dy6.A;
        if (z2) {
            c0791Jx8.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.b.A.a(c0791Jx7, 0);
        }
        if (c6663qW.F0 != 3 || c3488dy6.w) {
            c3488dy = c3488dy6;
        } else {
            for (int i24 = 0; i24 < i7; i24++) {
                int i25 = this.n + (z ? (i7 - 1) - i24 : i24);
                if (i25 >= c6663qW.O0) {
                    break;
                }
                c3488dy = c6663qW.N0[i25];
                if (c3488dy.w) {
                    break;
                }
            }
            c3488dy = c3488dy6;
        }
        int i26 = 0;
        C3488dy c3488dy7 = null;
        while (i26 < i7) {
            int i27 = z ? (i7 - 1) - i26 : i26;
            int i28 = this.n + i27;
            if (i28 >= c6663qW.O0) {
                return;
            }
            C3488dy c3488dy8 = c6663qW.N0[i28];
            if (i26 == 0) {
                c3488dy8.e(c3488dy8.x, this.d, this.h);
            }
            if (i27 == 0) {
                int i29 = c6663qW.q0;
                float f2 = c6663qW.w0;
                if (this.n == 0) {
                    int i30 = c6663qW.s0;
                    i3 = i29;
                    i4 = -1;
                    if (i30 != -1) {
                        f2 = c6663qW.y0;
                    }
                    i5 = i30;
                    c3488dy8.X = i5;
                    c3488dy8.S = f2;
                } else {
                    i3 = i29;
                    i4 = -1;
                }
                if (!z2 || (i30 = c6663qW.u0) == i4) {
                    i5 = i3;
                    c3488dy8.X = i5;
                    c3488dy8.S = f2;
                } else {
                    f2 = c6663qW.A0;
                    i5 = i30;
                    c3488dy8.X = i5;
                    c3488dy8.S = f2;
                }
            }
            if (i26 == i7 - 1) {
                c3488dy8.e(c3488dy8.z, this.f, this.j);
            }
            if (c3488dy7 != null) {
                C0791Jx c0791Jx9 = c3488dy8.x;
                int i31 = c6663qW.C0;
                C0791Jx c0791Jx10 = c3488dy7.z;
                c0791Jx9.a(c0791Jx10, i31);
                C0791Jx c0791Jx11 = c3488dy8.x;
                if (i26 == i9) {
                    int i32 = this.h;
                    if (c0791Jx11.f()) {
                        c0791Jx11.f = i32;
                    }
                }
                c0791Jx10.a(c0791Jx11, 0);
                if (i26 == i10 + 1) {
                    int i33 = this.j;
                    if (c0791Jx10.f()) {
                        c0791Jx10.f = i33;
                    }
                }
            }
            if (c3488dy8 != c3488dy6) {
                int i34 = c6663qW.F0;
                c = 3;
                if (i34 == 3 && c3488dy.w && c3488dy8 != c3488dy && c3488dy8.w) {
                    c3488dy8.B.a(c3488dy.B, 0);
                } else if (i34 == 0) {
                    c3488dy8.y.a(c0791Jx7, 0);
                } else if (i34 == 1) {
                    c3488dy8.A.a(c0791Jx8, 0);
                } else if (z3) {
                    c3488dy8.y.a(this.e, this.i);
                    c3488dy8.A.a(this.g, this.k);
                } else {
                    c3488dy8.y.a(c0791Jx7, 0);
                    c3488dy8.A.a(c0791Jx8, 0);
                }
            } else {
                c = 3;
            }
            i26++;
            c3488dy7 = c3488dy8;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.D0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.C0 : this.l;
    }

    public final void e(int i) {
        C6663qW c6663qW;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c6663qW = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= c6663qW.O0) {
                break;
            }
            C3488dy c3488dy = c6663qW.N0[i2];
            if (this.a == 0) {
                if (c3488dy != null) {
                    int[] iArr = c3488dy.c0;
                    if (iArr[0] == 3 && c3488dy.j == 0) {
                        c6663qW.E(1, i5, iArr[1], c3488dy.i(), c3488dy);
                    }
                }
            } else if (c3488dy != null) {
                int[] iArr2 = c3488dy.c0;
                if (iArr2[1] == 3 && c3488dy.k == 0) {
                    c6663qW.E(iArr2[0], c3488dy.l(), 1, i5, c3488dy);
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i7 = this.o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.n + i8;
            if (i9 >= c6663qW.O0) {
                return;
            }
            C3488dy c3488dy2 = c6663qW.N0[i9];
            if (this.a == 0) {
                int iL = c3488dy2.l();
                int i10 = c6663qW.C0;
                if (c3488dy2.V == 8) {
                    i10 = 0;
                }
                this.l = iL + i10 + this.l;
                int iC = c6663qW.C(c3488dy2, this.q);
                if (this.b == null || this.c < iC) {
                    this.b = c3488dy2;
                    this.c = iC;
                    this.m = iC;
                }
            } else {
                int iD = c6663qW.D(c3488dy2, this.q);
                int iC2 = c6663qW.C(c3488dy2, this.q);
                int i11 = c6663qW.D0;
                if (c3488dy2.V == 8) {
                    i11 = 0;
                }
                this.m = iC2 + i11 + this.m;
                if (this.b == null || this.c < iD) {
                    this.b = c3488dy2;
                    this.c = iD;
                    this.l = iD;
                }
            }
        }
    }

    public final void f(int i, C0791Jx c0791Jx, C0791Jx c0791Jx2, C0791Jx c0791Jx3, C0791Jx c0791Jx4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = c0791Jx;
        this.e = c0791Jx2;
        this.f = c0791Jx3;
        this.g = c0791Jx4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
