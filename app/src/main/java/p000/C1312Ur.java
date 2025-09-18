package p000;

/* renamed from: Ur */
/* loaded from: classes.dex */
public final class C1312Ur implements InterfaceC9121dV0 {

    /* renamed from: a */
    public final C1375Vr f12169a;

    /* renamed from: b */
    public final C8988cV0 f12170b;

    /* renamed from: c */
    public final int f12171c;

    /* renamed from: d */
    public boolean f12172d;

    /* renamed from: e */
    public final /* synthetic */ C1375Vr f12173e;

    public C1312Ur(C1375Vr c1375Vr, C1375Vr c1375Vr2, C8988cV0 c8988cV0, int i) {
        this.f12173e = c1375Vr;
        this.f12169a = c1375Vr2;
        this.f12170b = c8988cV0;
        this.f12171c = i;
    }

    /* renamed from: b */
    public final void m8192b() {
        if (this.f12172d) {
            return;
        }
        C1375Vr c1375Vr = this.f12173e;
        C1356VY c1356vy = c1375Vr.f12808g;
        int[] iArr = c1375Vr.f12803b;
        int i = this.f12171c;
        c1356vy.m8504x(iArr[i], c1375Vr.f12804c[i], 0, null, c1375Vr.f12821t);
        this.f12172d = true;
    }

    /* renamed from: c */
    public final void m8193c() {
        C1375Vr c1375Vr = this.f12173e;
        boolean[] zArr = c1375Vr.f12805d;
        int i = this.f12171c;
        YN1.m9281f(zArr[i]);
        c1375Vr.f12805d[i] = false;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        C1375Vr c1375Vr = this.f12173e;
        return !c1375Vr.m8609x() && this.f12170b.m10737w(c1375Vr.f12824w);
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        C1375Vr c1375Vr = this.f12173e;
        if (c1375Vr.m8609x()) {
            return 0;
        }
        boolean z = c1375Vr.f12824w;
        C8988cV0 c8988cV0 = this.f12170b;
        int iM10734t = c8988cV0.m10734t(j, z);
        AbstractC6632pg abstractC6632pg = c1375Vr.f12823v;
        if (abstractC6632pg != null) {
            iM10734t = Math.min(iM10734t, abstractC6632pg.m23833c(this.f12171c + 1) - c8988cV0.m10732r());
        }
        c8988cV0.m10721G(iM10734t);
        if (iM10734t > 0) {
            m8192b();
        }
        return iM10734t;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        C1375Vr c1375Vr = this.f12173e;
        if (c1375Vr.m8609x()) {
            return -3;
        }
        AbstractC6632pg abstractC6632pg = c1375Vr.f12823v;
        C8988cV0 c8988cV0 = this.f12170b;
        if (abstractC6632pg != null && abstractC6632pg.m23833c(this.f12171c + 1) <= c8988cV0.m10732r()) {
            return -3;
        }
        m8192b();
        return c8988cV0.m10716B(c0827n8, c1587zd, i, c1375Vr.f12824w);
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() {
    }
}
