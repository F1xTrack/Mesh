package defpackage;

/* renamed from: t20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7144t20 implements InterfaceC6254oN {
    public final C4332iN a;
    public String b;
    public InterfaceC1584Ub1 c;
    public C6953s20 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final C2133aR g = new C2133aR(32);
    public final C2133aR h = new C2133aR(33);
    public final C2133aR i = new C2133aR(34);
    public final C2133aR j = new C2133aR(39);
    public final C2133aR k = new C2133aR(40);
    public long m = -9223372036854775807L;
    public final C4103hA0 n = new C4103hA0();

    public C7144t20(C4332iN c4332iN) {
        this.a = c4332iN;
    }

    public final void a(byte[] bArr, int i, int i2) {
        C6953s20 c6953s20 = this.d;
        if (c6953s20.f) {
            int i3 = c6953s20.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                c6953s20.g = (bArr[i4] & 128) != 0;
                c6953s20.f = false;
            } else {
                c6953s20.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e A[SYNTHETIC] */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r38) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7144t20.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        TA1.a(this.f);
        this.g.g();
        this.h.g();
        this.i.g();
        this.j.g();
        this.k.g();
        C6953s20 c6953s20 = this.d;
        if (c6953s20 != null) {
            c6953s20.f = false;
            c6953s20.g = false;
            c6953s20.h = false;
            c6953s20.i = false;
            c6953s20.j = false;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.b = (String) ym0.b;
        ym0.b();
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 2);
        this.c = interfaceC1584Ub1W;
        this.d = new C6953s20(interfaceC1584Ub1W);
        this.a.s(yr, ym0);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
        YN1.h(this.c);
        int i = AbstractC0277Dh1.a;
        if (z) {
            C6953s20 c6953s20 = this.d;
            long j = this.l;
            c6953s20.m = c6953s20.c;
            c6953s20.a((int) (j - c6953s20.b));
            c6953s20.k = c6953s20.b;
            c6953s20.b = j;
            c6953s20.a(0);
            c6953s20.i = false;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.m = j;
    }
}
