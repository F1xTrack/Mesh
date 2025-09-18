package defpackage;

/* loaded from: classes.dex */
public final class WA0 implements InterfaceC5540kd1 {
    public final InterfaceC6254oN a;
    public final C0848Kq b = new C0848Kq(new byte[10], 10);
    public int c = 0;
    public int d;
    public C0724Ja1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public WA0(InterfaceC6254oN interfaceC6254oN) {
        this.a = interfaceC6254oN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Kq] */
    /* JADX WARN: Type inference failed for: r3v0, types: [oN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.InterfaceC5540kd1
    public final void a(int i, C4103hA0 c4103hA0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        YN1.h(this.e);
        int i7 = i & 1;
        ?? r3 = this.a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        ?? r8 = 0;
        if (i7 != 0) {
            int i11 = this.c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    AbstractC6789rA1.h("Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        AbstractC6789rA1.h("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    r3.e(c4103hA0.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i;
        while (c4103hA0.a() > 0) {
            int i13 = this.c;
            if (i13 != 0) {
                ?? r10 = this.b;
                if (i13 == 1) {
                    i3 = i9;
                    int i14 = r8;
                    if (b(c4103hA0, r10.b, 9)) {
                        r10.t(i14);
                        int iL = r10.l(24);
                        if (iL != 1) {
                            NX.p("Unexpected start code prefix: ", iL);
                            this.j = -1;
                            i2 = -1;
                            i6 = 0;
                            i4 = 2;
                        } else {
                            r10.w(8);
                            int iL2 = r10.l(16);
                            r10.w(5);
                            this.k = r10.k();
                            i4 = 2;
                            r10.w(2);
                            this.f = r10.k();
                            this.g = r10.k();
                            r10.w(6);
                            int iL3 = r10.l(8);
                            this.i = iL3;
                            if (iL2 == 0) {
                                this.j = -1;
                                i2 = -1;
                            } else {
                                int i15 = (iL2 - 3) - iL3;
                                this.j = i15;
                                if (i15 < 0) {
                                    AbstractC6789rA1.h("Found negative packet payload size: " + this.j);
                                    i2 = -1;
                                    this.j = -1;
                                } else {
                                    i2 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.c = i6;
                        i5 = 0;
                        this.d = 0;
                    } else {
                        i5 = i14;
                        i2 = -1;
                        i4 = 2;
                    }
                } else if (i13 == i10) {
                    if (b(c4103hA0, r10.b, Math.min(10, this.i)) && b(c4103hA0, null, this.i)) {
                        r10.t(r8);
                        this.l = -9223372036854775807L;
                        if (this.f) {
                            r10.w(4);
                            r10.w(1);
                            r10.w(1);
                            long jL = (r10.l(15) << 15) | (r10.l(i9) << 30) | r10.l(15);
                            r10.w(1);
                            if (!this.h && this.g) {
                                r10.w(4);
                                r10.w(1);
                                r10.w(1);
                                r10.w(1);
                                this.e.b((r10.l(15) << 15) | (r10.l(i9) << 30) | r10.l(15));
                                this.h = true;
                            }
                            this.l = this.e.b(jL);
                        }
                        i12 |= this.k ? 4 : 0;
                        r3.f(i12, this.l);
                        this.c = 3;
                        this.d = 0;
                        r8 = 0;
                        i10 = 2;
                        i9 = 3;
                        i8 = -1;
                    } else {
                        i3 = i9;
                        i2 = -1;
                        int i16 = r8;
                        i4 = i10;
                        i5 = i16;
                    }
                } else {
                    if (i13 != i9) {
                        throw new IllegalStateException();
                    }
                    int iA = c4103hA0.a();
                    int i17 = this.j;
                    int i18 = i17 == i8 ? r8 : iA - i17;
                    if (i18 > 0) {
                        iA -= i18;
                        c4103hA0.F(c4103hA0.b + iA);
                    }
                    r3.b(c4103hA0);
                    int i19 = this.j;
                    if (i19 != i8) {
                        int i20 = i19 - iA;
                        this.j = i20;
                        if (i20 == 0) {
                            r3.e(r8);
                            this.c = 1;
                            this.d = r8;
                        }
                    }
                    int i21 = i9;
                    i2 = i8;
                    i3 = i21;
                    int i22 = r8;
                    i4 = i10;
                    i5 = i22;
                }
            } else {
                int i23 = i9;
                i2 = i8;
                i3 = i23;
                int i24 = r8;
                i4 = i10;
                i5 = i24;
                c4103hA0.H(c4103hA0.a());
            }
            int i25 = i2;
            i9 = i3;
            i8 = i25;
            int i26 = i4;
            r8 = i5;
            i10 = i26;
        }
    }

    public final boolean b(C4103hA0 c4103hA0, byte[] bArr, int i) {
        int iMin = Math.min(c4103hA0.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c4103hA0.H(iMin);
        } else {
            c4103hA0.e(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.InterfaceC5540kd1
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    @Override // defpackage.InterfaceC5540kd1
    public final void e(C0724Ja1 c0724Ja1, YR yr, YM0 ym0) {
        this.e = c0724Ja1;
        this.a.d(yr, ym0);
    }
}
