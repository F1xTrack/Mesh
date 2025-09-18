package p000;

/* renamed from: oW */
/* loaded from: classes.dex */
public final class C6557oW {

    /* renamed from: a */
    public int f39046a;

    /* renamed from: d */
    public C0627Jx f39049d;

    /* renamed from: e */
    public C0627Jx f39050e;

    /* renamed from: f */
    public C0627Jx f39051f;

    /* renamed from: g */
    public C0627Jx f39052g;

    /* renamed from: h */
    public int f39053h;

    /* renamed from: i */
    public int f39054i;

    /* renamed from: j */
    public int f39055j;

    /* renamed from: k */
    public int f39056k;

    /* renamed from: q */
    public int f39062q;

    /* renamed from: r */
    public final /* synthetic */ C6685qW f39063r;

    /* renamed from: b */
    public C3960dy f39047b = null;

    /* renamed from: c */
    public int f39048c = 0;

    /* renamed from: l */
    public int f39057l = 0;

    /* renamed from: m */
    public int f39058m = 0;

    /* renamed from: n */
    public int f39059n = 0;

    /* renamed from: o */
    public int f39060o = 0;

    /* renamed from: p */
    public int f39061p = 0;

    public C6557oW(C6685qW c6685qW, int i, C0627Jx c0627Jx, C0627Jx c0627Jx2, C0627Jx c0627Jx3, C0627Jx c0627Jx4, int i2) {
        this.f39063r = c6685qW;
        this.f39053h = 0;
        this.f39054i = 0;
        this.f39055j = 0;
        this.f39056k = 0;
        this.f39062q = 0;
        this.f39046a = i;
        this.f39049d = c0627Jx;
        this.f39050e = c0627Jx2;
        this.f39051f = c0627Jx3;
        this.f39052g = c0627Jx4;
        this.f39053h = c6685qW.f40933j0;
        this.f39054i = c6685qW.f40929f0;
        this.f39055j = c6685qW.f40934k0;
        this.f39056k = c6685qW.f40930g0;
        this.f39062q = i2;
    }

    /* renamed from: a */
    public final void m23495a(C3960dy c3960dy) {
        int i = this.f39046a;
        C6685qW c6685qW = this.f39063r;
        if (i == 0) {
            int iM24017D = c6685qW.m24017D(c3960dy, this.f39062q);
            if (c3960dy.f26433c0[0] == 3) {
                this.f39061p++;
                iM24017D = 0;
            }
            this.f39057l = iM24017D + (c3960dy.f26423V != 8 ? c6685qW.f40916C0 : 0) + this.f39057l;
            int iM24016C = c6685qW.m24016C(c3960dy, this.f39062q);
            if (this.f39047b == null || this.f39048c < iM24016C) {
                this.f39047b = c3960dy;
                this.f39048c = iM24016C;
                this.f39058m = iM24016C;
            }
        } else {
            int iM24017D2 = c6685qW.m24017D(c3960dy, this.f39062q);
            int iM24016C2 = c6685qW.m24016C(c3960dy, this.f39062q);
            if (c3960dy.f26433c0[1] == 3) {
                this.f39061p++;
                iM24016C2 = 0;
            }
            this.f39058m = iM24016C2 + (c3960dy.f26423V != 8 ? c6685qW.f40917D0 : 0) + this.f39058m;
            if (this.f39047b == null || this.f39048c < iM24017D2) {
                this.f39047b = c3960dy;
                this.f39048c = iM24017D2;
                this.f39057l = iM24017D2;
            }
        }
        this.f39060o++;
    }

    /* renamed from: b */
    public final void m23496b(int i, boolean z, boolean z2) {
        C6685qW c6685qW;
        int i2;
        C3960dy c3960dy;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f39060o;
        int i8 = 0;
        while (true) {
            c6685qW = this.f39063r;
            if (i8 >= i7 || (i6 = this.f39059n + i8) >= c6685qW.f40928O0) {
                break;
            }
            C3960dy c3960dy2 = c6685qW.f40927N0[i6];
            if (c3960dy2 != null) {
                c3960dy2.m17797t();
            }
            i8++;
        }
        if (i7 == 0 || this.f39047b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.f39059n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= c6685qW.f40928O0) {
                break;
            }
            if (c6685qW.f40927N0[i12].f26423V == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.f39046a != 0) {
            C3960dy c3960dy3 = this.f39047b;
            c3960dy3.f26425X = c6685qW.f40940q0;
            int i13 = this.f39053h;
            if (i > 0) {
                i13 += c6685qW.f40916C0;
            }
            C0627Jx c0627Jx = c3960dy3.f26454x;
            C0627Jx c0627Jx2 = c3960dy3.f26456z;
            if (z) {
                c0627Jx2.m4470a(this.f39051f, i13);
                if (z2) {
                    c0627Jx.m4470a(this.f39049d, this.f39055j);
                }
                if (i > 0) {
                    this.f39051f.f5807b.f26454x.m4470a(c0627Jx2, 0);
                }
            } else {
                c0627Jx.m4470a(this.f39049d, i13);
                if (z2) {
                    c0627Jx2.m4470a(this.f39051f, this.f39055j);
                }
                if (i > 0) {
                    this.f39049d.f5807b.f26456z.m4470a(c0627Jx, 0);
                }
            }
            int i14 = 0;
            C3960dy c3960dy4 = null;
            while (i14 < i7) {
                int i15 = this.f39059n + i14;
                if (i15 >= c6685qW.f40928O0) {
                    return;
                }
                C3960dy c3960dy5 = c6685qW.f40927N0[i15];
                if (i14 == 0) {
                    c3960dy5.m17782e(c3960dy5.f26455y, this.f39050e, this.f39054i);
                    int i16 = c6685qW.f40941r0;
                    float f = c6685qW.f40947x0;
                    if (this.f39059n == 0) {
                        int i17 = c6685qW.f40943t0;
                        i2 = -1;
                        if (i17 != -1) {
                            f = c6685qW.f40949z0;
                        }
                        i16 = i17;
                        c3960dy5.f26426Y = i16;
                        c3960dy5.f26421T = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i17 = c6685qW.f40945v0) != i2) {
                        f = c6685qW.f40915B0;
                        i16 = i17;
                    }
                    c3960dy5.f26426Y = i16;
                    c3960dy5.f26421T = f;
                }
                if (i14 == i7 - 1) {
                    c3960dy5.m17782e(c3960dy5.f26402A, this.f39052g, this.f39056k);
                }
                if (c3960dy4 != null) {
                    C0627Jx c0627Jx3 = c3960dy5.f26455y;
                    int i18 = c6685qW.f40917D0;
                    C0627Jx c0627Jx4 = c3960dy4.f26402A;
                    c0627Jx3.m4470a(c0627Jx4, i18);
                    C0627Jx c0627Jx5 = c3960dy5.f26455y;
                    if (i14 == i9) {
                        int i19 = this.f39054i;
                        if (c0627Jx5.m4475f()) {
                            c0627Jx5.f5811f = i19;
                        }
                    }
                    c0627Jx4.m4470a(c0627Jx5, 0);
                    if (i14 == i10 + 1) {
                        int i20 = this.f39056k;
                        if (c0627Jx4.m4475f()) {
                            c0627Jx4.f5811f = i20;
                        }
                    }
                }
                if (c3960dy5 != c3960dy3) {
                    if (z) {
                        int i21 = c6685qW.f40918E0;
                        if (i21 == 0) {
                            c3960dy5.f26456z.m4470a(c0627Jx2, 0);
                        } else if (i21 == 1) {
                            c3960dy5.f26454x.m4470a(c0627Jx, 0);
                        } else if (i21 == 2) {
                            c3960dy5.f26454x.m4470a(c0627Jx, 0);
                            c3960dy5.f26456z.m4470a(c0627Jx2, 0);
                        }
                    } else {
                        int i22 = c6685qW.f40918E0;
                        if (i22 == 0) {
                            c3960dy5.f26454x.m4470a(c0627Jx, 0);
                        } else if (i22 == 1) {
                            c3960dy5.f26456z.m4470a(c0627Jx2, 0);
                        } else if (i22 == 2) {
                            if (z3) {
                                c3960dy5.f26454x.m4470a(this.f39049d, this.f39053h);
                                c3960dy5.f26456z.m4470a(this.f39051f, this.f39055j);
                            } else {
                                c3960dy5.f26454x.m4470a(c0627Jx, 0);
                                c3960dy5.f26456z.m4470a(c0627Jx2, 0);
                            }
                        }
                    }
                }
                i14++;
                c3960dy4 = c3960dy5;
            }
            return;
        }
        C3960dy c3960dy6 = this.f39047b;
        c3960dy6.f26426Y = c6685qW.f40941r0;
        int i23 = this.f39054i;
        if (i > 0) {
            i23 += c6685qW.f40917D0;
        }
        C0627Jx c0627Jx6 = this.f39050e;
        C0627Jx c0627Jx7 = c3960dy6.f26455y;
        c0627Jx7.m4470a(c0627Jx6, i23);
        C0627Jx c0627Jx8 = c3960dy6.f26402A;
        if (z2) {
            c0627Jx8.m4470a(this.f39052g, this.f39056k);
        }
        if (i > 0) {
            this.f39050e.f5807b.f26402A.m4470a(c0627Jx7, 0);
        }
        if (c6685qW.f40919F0 != 3 || c3960dy6.f26453w) {
            c3960dy = c3960dy6;
        } else {
            for (int i24 = 0; i24 < i7; i24++) {
                int i25 = this.f39059n + (z ? (i7 - 1) - i24 : i24);
                if (i25 >= c6685qW.f40928O0) {
                    break;
                }
                c3960dy = c6685qW.f40927N0[i25];
                if (c3960dy.f26453w) {
                    break;
                }
            }
            c3960dy = c3960dy6;
        }
        int i26 = 0;
        C3960dy c3960dy7 = null;
        while (i26 < i7) {
            int i27 = z ? (i7 - 1) - i26 : i26;
            int i28 = this.f39059n + i27;
            if (i28 >= c6685qW.f40928O0) {
                return;
            }
            C3960dy c3960dy8 = c6685qW.f40927N0[i28];
            if (i26 == 0) {
                c3960dy8.m17782e(c3960dy8.f26454x, this.f39049d, this.f39053h);
            }
            if (i27 == 0) {
                int i29 = c6685qW.f40940q0;
                float f2 = c6685qW.f40946w0;
                if (this.f39059n == 0) {
                    int i30 = c6685qW.f40942s0;
                    i3 = i29;
                    i4 = -1;
                    if (i30 != -1) {
                        f2 = c6685qW.f40948y0;
                    }
                    i5 = i30;
                    c3960dy8.f26425X = i5;
                    c3960dy8.f26420S = f2;
                } else {
                    i3 = i29;
                    i4 = -1;
                }
                if (!z2 || (i30 = c6685qW.f40944u0) == i4) {
                    i5 = i3;
                    c3960dy8.f26425X = i5;
                    c3960dy8.f26420S = f2;
                } else {
                    f2 = c6685qW.f40914A0;
                    i5 = i30;
                    c3960dy8.f26425X = i5;
                    c3960dy8.f26420S = f2;
                }
            }
            if (i26 == i7 - 1) {
                c3960dy8.m17782e(c3960dy8.f26456z, this.f39051f, this.f39055j);
            }
            if (c3960dy7 != null) {
                C0627Jx c0627Jx9 = c3960dy8.f26454x;
                int i31 = c6685qW.f40916C0;
                C0627Jx c0627Jx10 = c3960dy7.f26456z;
                c0627Jx9.m4470a(c0627Jx10, i31);
                C0627Jx c0627Jx11 = c3960dy8.f26454x;
                if (i26 == i9) {
                    int i32 = this.f39053h;
                    if (c0627Jx11.m4475f()) {
                        c0627Jx11.f5811f = i32;
                    }
                }
                c0627Jx10.m4470a(c0627Jx11, 0);
                if (i26 == i10 + 1) {
                    int i33 = this.f39055j;
                    if (c0627Jx10.m4475f()) {
                        c0627Jx10.f5811f = i33;
                    }
                }
            }
            if (c3960dy8 != c3960dy6) {
                int i34 = c6685qW.f40919F0;
                c = 3;
                if (i34 == 3 && c3960dy.f26453w && c3960dy8 != c3960dy && c3960dy8.f26453w) {
                    c3960dy8.f26403B.m4470a(c3960dy.f26403B, 0);
                } else if (i34 == 0) {
                    c3960dy8.f26455y.m4470a(c0627Jx7, 0);
                } else if (i34 == 1) {
                    c3960dy8.f26402A.m4470a(c0627Jx8, 0);
                } else if (z3) {
                    c3960dy8.f26455y.m4470a(this.f39050e, this.f39054i);
                    c3960dy8.f26402A.m4470a(this.f39052g, this.f39056k);
                } else {
                    c3960dy8.f26455y.m4470a(c0627Jx7, 0);
                    c3960dy8.f26402A.m4470a(c0627Jx8, 0);
                }
            } else {
                c = 3;
            }
            i26++;
            c3960dy7 = c3960dy8;
        }
    }

    /* renamed from: c */
    public final int m23497c() {
        return this.f39046a == 1 ? this.f39058m - this.f39063r.f40917D0 : this.f39058m;
    }

    /* renamed from: d */
    public final int m23498d() {
        return this.f39046a == 0 ? this.f39057l - this.f39063r.f40916C0 : this.f39057l;
    }

    /* renamed from: e */
    public final void m23499e(int i) {
        C6685qW c6685qW;
        int i2;
        int i3 = this.f39061p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f39060o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c6685qW = this.f39063r;
            if (i6 >= i4 || (i2 = this.f39059n + i6) >= c6685qW.f40928O0) {
                break;
            }
            C3960dy c3960dy = c6685qW.f40927N0[i2];
            if (this.f39046a == 0) {
                if (c3960dy != null) {
                    int[] iArr = c3960dy.f26433c0;
                    if (iArr[0] == 3 && c3960dy.f26440j == 0) {
                        c6685qW.m24018E(1, i5, iArr[1], c3960dy.m17786i(), c3960dy);
                    }
                }
            } else if (c3960dy != null) {
                int[] iArr2 = c3960dy.f26433c0;
                if (iArr2[1] == 3 && c3960dy.f26441k == 0) {
                    c6685qW.m24018E(iArr2[0], c3960dy.m17789l(), 1, i5, c3960dy);
                }
            }
            i6++;
        }
        this.f39057l = 0;
        this.f39058m = 0;
        this.f39047b = null;
        this.f39048c = 0;
        int i7 = this.f39060o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f39059n + i8;
            if (i9 >= c6685qW.f40928O0) {
                return;
            }
            C3960dy c3960dy2 = c6685qW.f40927N0[i9];
            if (this.f39046a == 0) {
                int iM17789l = c3960dy2.m17789l();
                int i10 = c6685qW.f40916C0;
                if (c3960dy2.f26423V == 8) {
                    i10 = 0;
                }
                this.f39057l = iM17789l + i10 + this.f39057l;
                int iM24016C = c6685qW.m24016C(c3960dy2, this.f39062q);
                if (this.f39047b == null || this.f39048c < iM24016C) {
                    this.f39047b = c3960dy2;
                    this.f39048c = iM24016C;
                    this.f39058m = iM24016C;
                }
            } else {
                int iM24017D = c6685qW.m24017D(c3960dy2, this.f39062q);
                int iM24016C2 = c6685qW.m24016C(c3960dy2, this.f39062q);
                int i11 = c6685qW.f40917D0;
                if (c3960dy2.f26423V == 8) {
                    i11 = 0;
                }
                this.f39058m = iM24016C2 + i11 + this.f39058m;
                if (this.f39047b == null || this.f39048c < iM24017D) {
                    this.f39047b = c3960dy2;
                    this.f39048c = iM24017D;
                    this.f39057l = iM24017D;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m23500f(int i, C0627Jx c0627Jx, C0627Jx c0627Jx2, C0627Jx c0627Jx3, C0627Jx c0627Jx4, int i2, int i3, int i4, int i5, int i6) {
        this.f39046a = i;
        this.f39049d = c0627Jx;
        this.f39050e = c0627Jx2;
        this.f39051f = c0627Jx3;
        this.f39052g = c0627Jx4;
        this.f39053h = i2;
        this.f39054i = i3;
        this.f39055j = i4;
        this.f39056k = i5;
        this.f39062q = i6;
    }
}
