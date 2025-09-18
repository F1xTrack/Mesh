package defpackage;

/* renamed from: o20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6190o20 implements InterfaceC6254oN {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final C3383dO1 a;
    public final C4103hA0 b;
    public final boolean[] c = new boolean[4];
    public final C5808m20 d;
    public final C2133aR e;
    public C5999n20 f;
    public long g;
    public String h;
    public InterfaceC1584Ub1 i;
    public boolean j;
    public long k;

    public C6190o20(C3383dO1 c3383dO1) {
        this.a = c3383dO1;
        C5808m20 c5808m20 = new C5808m20();
        c5808m20.e = new byte[128];
        this.d = c5808m20;
        this.k = -9223372036854775807L;
        this.e = new C2133aR(178);
        this.b = new C4103hA0();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r20) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6190o20.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        TA1.a(this.c);
        C5808m20 c5808m20 = this.d;
        c5808m20.b = false;
        c5808m20.c = 0;
        c5808m20.a = 0;
        C5999n20 c5999n20 = this.f;
        if (c5999n20 != null) {
            c5999n20.b = false;
            c5999n20.c = false;
            c5999n20.d = false;
            c5999n20.e = -1;
        }
        C2133aR c2133aR = this.e;
        if (c2133aR != null) {
            c2133aR.g();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.h = (String) ym0.b;
        ym0.b();
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 2);
        this.i = interfaceC1584Ub1W;
        this.f = new C5999n20(interfaceC1584Ub1W);
        this.a.r(yr, ym0);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
        YN1.h(this.f);
        if (z) {
            this.f.b(0, this.g, this.j);
            C5999n20 c5999n20 = this.f;
            c5999n20.b = false;
            c5999n20.c = false;
            c5999n20.d = false;
            c5999n20.e = -1;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.k = j;
    }
}
