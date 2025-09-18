package defpackage;

/* renamed from: r20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6762r20 implements InterfaceC6254oN {
    public final C4332iN a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public InterfaceC1584Ub1 j;
    public C6572q20 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final C2133aR d = new C2133aR(7);
    public final C2133aR e = new C2133aR(8);
    public final C2133aR f = new C2133aR(6);
    public long m = -9223372036854775807L;
    public final C4103hA0 o = new C4103hA0();

    public C6762r20(C4332iN c4332iN, boolean z, boolean z2) {
        this.a = c4332iN;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6762r20.a(byte[], int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r31) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6762r20.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        TA1.a(this.h);
        this.d.g();
        this.e.g();
        this.f.g();
        C6572q20 c6572q20 = this.k;
        if (c6572q20 != null) {
            c6572q20.k = false;
            c6572q20.o = false;
            C6381p20 c6381p20 = c6572q20.n;
            c6381p20.b = false;
            c6381p20.a = false;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.i = (String) ym0.b;
        ym0.b();
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 2);
        this.j = interfaceC1584Ub1W;
        this.k = new C6572q20(interfaceC1584Ub1W, this.b, this.c);
        this.a.s(yr, ym0);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
        YN1.h(this.j);
        int i = AbstractC0277Dh1.a;
        if (z) {
            C6572q20 c6572q20 = this.k;
            long j = this.g;
            c6572q20.a();
            c6572q20.j = j;
            long j2 = c6572q20.q;
            if (j2 != -9223372036854775807L) {
                boolean z2 = c6572q20.r;
                c6572q20.a.a(j2, z2 ? 1 : 0, (int) (j - c6572q20.p), 0, null);
            }
            c6572q20.o = false;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }
}
