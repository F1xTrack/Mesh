package defpackage;

/* renamed from: l20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5617l20 implements InterfaceC6254oN {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public InterfaceC1584Ub1 b;
    public final C3383dO1 c;
    public final C4103hA0 d;
    public final C2133aR e;
    public final boolean[] f = new boolean[4];
    public final C5426k20 g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte[], java.io.Serializable] */
    public C5617l20(C3383dO1 c3383dO1) {
        this.c = c3383dO1;
        C5426k20 c5426k20 = new C5426k20();
        c5426k20.d = new byte[128];
        this.g = c5426k20;
        if (c3383dO1 != null) {
            this.e = new C2133aR(178);
            this.d = new C4103hA0();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r27) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5617l20.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        TA1.a(this.f);
        C5426k20 c5426k20 = this.g;
        c5426k20.c = false;
        c5426k20.a = 0;
        c5426k20.b = 0;
        C2133aR c2133aR = this.e;
        if (c2133aR != null) {
            c2133aR.g();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.a = (String) ym0.b;
        ym0.b();
        this.b = yr.w(ym0.e, 2);
        C3383dO1 c3383dO1 = this.c;
        if (c3383dO1 != null) {
            c3383dO1.r(yr, ym0);
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
        YN1.h(this.b);
        if (z) {
            boolean z2 = this.o;
            this.b.a(this.n, z2 ? 1 : 0, (int) (this.h - this.m), 0, null);
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.l = j;
    }
}
