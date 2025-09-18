package p000;

/* renamed from: l20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10085l20 implements InterfaceC6548oN {

    /* renamed from: q */
    public static final double[] f36825q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f36826a;

    /* renamed from: b */
    public InterfaceC8357Ub1 f36827b;

    /* renamed from: c */
    public final C9108dO1 f36828c;

    /* renamed from: d */
    public final C9591hA0 f36829d;

    /* renamed from: e */
    public final C1664aR f36830e;

    /* renamed from: f */
    public final boolean[] f36831f = new boolean[4];

    /* renamed from: g */
    public final C9957k20 f36832g;

    /* renamed from: h */
    public long f36833h;

    /* renamed from: i */
    public boolean f36834i;

    /* renamed from: j */
    public boolean f36835j;

    /* renamed from: k */
    public long f36836k;

    /* renamed from: l */
    public long f36837l;

    /* renamed from: m */
    public long f36838m;

    /* renamed from: n */
    public long f36839n;

    /* renamed from: o */
    public boolean f36840o;

    /* renamed from: p */
    public boolean f36841p;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte[], java.io.Serializable] */
    public C10085l20(C9108dO1 c9108dO1) {
        this.f36828c = c9108dO1;
        C9957k20 c9957k20 = new C9957k20();
        c9957k20.f36230d = new byte[128];
        this.f36832g = c9957k20;
        if (c9108dO1 != null) {
            this.f36830e = new C1664aR(178);
            this.f36829d = new C9591hA0();
        } else {
            this.f36830e = null;
            this.f36829d = null;
        }
        this.f36837l = -9223372036854775807L;
        this.f36839n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r27) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10085l20.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        TA1.m7611a(this.f36831f);
        C9957k20 c9957k20 = this.f36832g;
        c9957k20.f36229c = false;
        c9957k20.f36227a = 0;
        c9957k20.f36228b = 0;
        C1664aR c1664aR = this.f36830e;
        if (c1664aR != null) {
            c1664aR.m9738g();
        }
        this.f36833h = 0L;
        this.f36834i = false;
        this.f36837l = -9223372036854775807L;
        this.f36839n = -9223372036854775807L;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f36826a = (String) ym0.f14269b;
        ym0.m9267b();
        this.f36827b = interfaceC1538YR.mo2005w(ym0.f14272e, 2);
        C9108dO1 c9108dO1 = this.f36828c;
        if (c9108dO1 != null) {
            c9108dO1.m17574r(interfaceC1538YR, ym0);
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
        YN1.m9283h(this.f36827b);
        if (z) {
            boolean z2 = this.f36840o;
            this.f36827b.mo960a(this.f36839n, z2 ? 1 : 0, (int) (this.f36833h - this.f36838m), 0, null);
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f36837l = j;
    }
}
