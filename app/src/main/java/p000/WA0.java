package p000;

/* loaded from: classes.dex */
public final class WA0 implements InterfaceC10034kd1 {

    /* renamed from: a */
    public final InterfaceC6548oN f13017a;

    /* renamed from: b */
    public final C0683Kq f13018b = new C0683Kq(new byte[10], 10);

    /* renamed from: c */
    public int f13019c = 0;

    /* renamed from: d */
    public int f13020d;

    /* renamed from: e */
    public C7783Ja1 f13021e;

    /* renamed from: f */
    public boolean f13022f;

    /* renamed from: g */
    public boolean f13023g;

    /* renamed from: h */
    public boolean f13024h;

    /* renamed from: i */
    public int f13025i;

    /* renamed from: j */
    public int f13026j;

    /* renamed from: k */
    public boolean f13027k;

    /* renamed from: l */
    public long f13028l;

    public WA0(InterfaceC6548oN interfaceC6548oN) {
        this.f13017a = interfaceC6548oN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Kq] */
    /* JADX WARN: Type inference failed for: r3v0, types: [oN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // p000.InterfaceC10034kd1
    /* renamed from: a */
    public final void mo8700a(int i, C9591hA0 c9591hA0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        YN1.m9283h(this.f13021e);
        int i7 = i & 1;
        ?? r3 = this.f13017a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        ?? r8 = 0;
        if (i7 != 0) {
            int i11 = this.f13019c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    AbstractC10872rA1.m24175h("Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f13026j != -1) {
                        AbstractC10872rA1.m24175h("Unexpected start indicator: expected " + this.f13026j + " more bytes");
                    }
                    r3.mo9105e(c9591hA0.f28295c == 0);
                }
            }
            this.f13019c = 1;
            this.f13020d = 0;
        }
        int i12 = i;
        while (c9591hA0.m18743a() > 0) {
            int i13 = this.f13019c;
            if (i13 != 0) {
                ?? r10 = this.f13018b;
                if (i13 == 1) {
                    i3 = i9;
                    int i14 = r8;
                    if (m8701b(c9591hA0, r10.f6325b, 9)) {
                        r10.m4760t(i14);
                        int iM4752l = r10.m4752l(24);
                        if (iM4752l != 1) {
                            AbstractC0852NX.m5767p("Unexpected start code prefix: ", iM4752l);
                            this.f13026j = -1;
                            i2 = -1;
                            i6 = 0;
                            i4 = 2;
                        } else {
                            r10.m4763w(8);
                            int iM4752l2 = r10.m4752l(16);
                            r10.m4763w(5);
                            this.f13027k = r10.m4751k();
                            i4 = 2;
                            r10.m4763w(2);
                            this.f13022f = r10.m4751k();
                            this.f13023g = r10.m4751k();
                            r10.m4763w(6);
                            int iM4752l3 = r10.m4752l(8);
                            this.f13025i = iM4752l3;
                            if (iM4752l2 == 0) {
                                this.f13026j = -1;
                                i2 = -1;
                            } else {
                                int i15 = (iM4752l2 - 3) - iM4752l3;
                                this.f13026j = i15;
                                if (i15 < 0) {
                                    AbstractC10872rA1.m24175h("Found negative packet payload size: " + this.f13026j);
                                    i2 = -1;
                                    this.f13026j = -1;
                                } else {
                                    i2 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.f13019c = i6;
                        i5 = 0;
                        this.f13020d = 0;
                    } else {
                        i5 = i14;
                        i2 = -1;
                        i4 = 2;
                    }
                } else if (i13 == i10) {
                    if (m8701b(c9591hA0, r10.f6325b, Math.min(10, this.f13025i)) && m8701b(c9591hA0, null, this.f13025i)) {
                        r10.m4760t(r8);
                        this.f13028l = -9223372036854775807L;
                        if (this.f13022f) {
                            r10.m4763w(4);
                            r10.m4763w(1);
                            r10.m4763w(1);
                            long jM4752l = (r10.m4752l(15) << 15) | (r10.m4752l(i9) << 30) | r10.m4752l(15);
                            r10.m4763w(1);
                            if (!this.f13024h && this.f13023g) {
                                r10.m4763w(4);
                                r10.m4763w(1);
                                r10.m4763w(1);
                                r10.m4763w(1);
                                this.f13021e.m4351b((r10.m4752l(15) << 15) | (r10.m4752l(i9) << 30) | r10.m4752l(15));
                                this.f13024h = true;
                            }
                            this.f13028l = this.f13021e.m4351b(jM4752l);
                        }
                        i12 |= this.f13027k ? 4 : 0;
                        r3.mo9106f(i12, this.f13028l);
                        this.f13019c = 3;
                        this.f13020d = 0;
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
                    int iM18743a = c9591hA0.m18743a();
                    int i17 = this.f13026j;
                    int i18 = i17 == i8 ? r8 : iM18743a - i17;
                    if (i18 > 0) {
                        iM18743a -= i18;
                        c9591hA0.m18740F(c9591hA0.f28294b + iM18743a);
                    }
                    r3.mo9102b(c9591hA0);
                    int i19 = this.f13026j;
                    if (i19 != i8) {
                        int i20 = i19 - iM18743a;
                        this.f13026j = i20;
                        if (i20 == 0) {
                            r3.mo9105e(r8);
                            this.f13019c = 1;
                            this.f13020d = r8;
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
                c9591hA0.m18742H(c9591hA0.m18743a());
            }
            int i25 = i2;
            i9 = i3;
            i8 = i25;
            int i26 = i4;
            r8 = i5;
            i10 = i26;
        }
    }

    /* renamed from: b */
    public final boolean m8701b(C9591hA0 c9591hA0, byte[] bArr, int i) {
        int iMin = Math.min(c9591hA0.m18743a(), i - this.f13020d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c9591hA0.m18742H(iMin);
        } else {
            c9591hA0.m18747e(bArr, this.f13020d, iMin);
        }
        int i2 = this.f13020d + iMin;
        this.f13020d = i2;
        return i2 == i;
    }

    @Override // p000.InterfaceC10034kd1
    /* renamed from: c */
    public final void mo8702c() {
        this.f13019c = 0;
        this.f13020d = 0;
        this.f13024h = false;
        this.f13017a.mo9103c();
    }

    @Override // p000.InterfaceC10034kd1
    /* renamed from: e */
    public final void mo8703e(C7783Ja1 c7783Ja1, InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        this.f13021e = c7783Ja1;
        this.f13017a.mo9104d(interfaceC1538YR, ym0);
    }
}
