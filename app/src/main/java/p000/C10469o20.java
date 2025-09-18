package p000;

/* renamed from: o20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10469o20 implements InterfaceC6548oN {

    /* renamed from: l */
    public static final float[] f38713l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C9108dO1 f38714a;

    /* renamed from: b */
    public final C9591hA0 f38715b;

    /* renamed from: c */
    public final boolean[] f38716c = new boolean[4];

    /* renamed from: d */
    public final C10213m20 f38717d;

    /* renamed from: e */
    public final C1664aR f38718e;

    /* renamed from: f */
    public C10341n20 f38719f;

    /* renamed from: g */
    public long f38720g;

    /* renamed from: h */
    public String f38721h;

    /* renamed from: i */
    public InterfaceC8357Ub1 f38722i;

    /* renamed from: j */
    public boolean f38723j;

    /* renamed from: k */
    public long f38724k;

    public C10469o20(C9108dO1 c9108dO1) {
        this.f38714a = c9108dO1;
        C10213m20 c10213m20 = new C10213m20();
        c10213m20.f37424e = new byte[128];
        this.f38717d = c10213m20;
        this.f38724k = -9223372036854775807L;
        this.f38718e = new C1664aR(178);
        this.f38715b = new C9591hA0();
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
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r20) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10469o20.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        TA1.m7611a(this.f38716c);
        C10213m20 c10213m20 = this.f38717d;
        c10213m20.f37421b = false;
        c10213m20.f37422c = 0;
        c10213m20.f37420a = 0;
        C10341n20 c10341n20 = this.f38719f;
        if (c10341n20 != null) {
            c10341n20.f38049b = false;
            c10341n20.f38050c = false;
            c10341n20.f38051d = false;
            c10341n20.f38052e = -1;
        }
        C1664aR c1664aR = this.f38718e;
        if (c1664aR != null) {
            c1664aR.m9738g();
        }
        this.f38720g = 0L;
        this.f38724k = -9223372036854775807L;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f38721h = (String) ym0.f14269b;
        ym0.m9267b();
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 2);
        this.f38722i = interfaceC8357Ub1Mo2005w;
        this.f38719f = new C10341n20(interfaceC8357Ub1Mo2005w);
        this.f38714a.m17574r(interfaceC1538YR, ym0);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
        YN1.m9283h(this.f38719f);
        if (z) {
            this.f38719f.m23060b(0, this.f38720g, this.f38723j);
            C10341n20 c10341n20 = this.f38719f;
            c10341n20.f38049b = false;
            c10341n20.f38050c = false;
            c10341n20.f38051d = false;
            c10341n20.f38052e = -1;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f38724k = j;
    }
}
