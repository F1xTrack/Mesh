package p000;

/* renamed from: qy */
/* loaded from: classes.dex */
public final class C6713qy extends AbstractC6632pg {

    /* renamed from: o */
    public final int f41267o;

    /* renamed from: p */
    public final long f41268p;

    /* renamed from: q */
    public final InterfaceC1123Rr f41269q;

    /* renamed from: r */
    public long f41270r;

    /* renamed from: s */
    public volatile boolean f41271s;

    /* renamed from: t */
    public boolean f41272t;

    public C6713qy(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD, C6686qX c6686qX, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, InterfaceC1123Rr interfaceC1123Rr) {
        super(interfaceC1586ZC, c3976eD, c6686qX, i, obj, j, j2, j3, j4, j5);
        this.f41267o = i2;
        this.f41268p = j6;
        this.f41269q = interfaceC1123Rr;
    }

    @Override // p000.AbstractC7498Do0
    /* renamed from: a */
    public final long mo1898a() {
        return this.f2255j + this.f41267o;
    }

    @Override // p000.AbstractC7498Do0
    /* renamed from: b */
    public final boolean mo1899b() {
        return this.f41272t;
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        C1339VH c1339vh = this.f40274m;
        YN1.m9283h(c1339vh);
        if (this.f41270r == 0) {
            long j = this.f41268p;
            for (C8988cV0 c8988cV0 : (C8988cV0[]) c1339vh.f12487c) {
                if (c8988cV0.f17545F != j) {
                    c8988cV0.f17545F = j;
                    c8988cV0.f17572z = true;
                }
            }
            InterfaceC1123Rr interfaceC1123Rr = this.f41269q;
            long j2 = this.f40272k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f41268p;
            long j4 = this.f40273l;
            ((C4135gk) interfaceC1123Rr).m18605a(c1339vh, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.f41268p);
        }
        try {
            C3976eD c3976eDM17881d = this.f9812b.m17881d(this.f41270r);
            M41 m41 = this.f9819i;
            C7000vF c7000vF = new C7000vF(m41, c3976eDM17881d.f26600f, m41.mo2365c(c3976eDM17881d));
            while (!this.f41271s) {
                try {
                    int iMo738d = ((C4135gk) this.f41269q).f27966a.mo738d(c7000vF, C4135gk.f27965k);
                    YN1.m9281f(iMo738d != 1);
                    if (!(iMo738d == 0)) {
                        break;
                    }
                } finally {
                    this.f41270r = c7000vF.f44295d - this.f9812b.f26600f;
                }
            }
            C6686qX c6686qX = this.f9814d;
            if (AbstractC8544Xr0.m9168k(c6686qX.f40973l)) {
                int i = c6686qX.f40958H;
                int i2 = c6686qX.f40959I;
                if ((i > 1 || i2 > 1) && i != -1 && i2 != -1) {
                    InterfaceC8357Ub1 interfaceC8357Ub1M8361E = c1339vh.m8361E(4);
                    int i3 = i * i2;
                    long j5 = (this.f9818h - this.f9817g) / i3;
                    for (int i4 = 1; i4 < i3; i4++) {
                        interfaceC8357Ub1M8361E.mo963d(0, new C9591hA0());
                        interfaceC8357Ub1M8361E.mo960a(i4 * j5, 0, 0, 0, null);
                    }
                }
            }
            AbstractC9770iZ1.m19065b(this.f9819i);
            this.f41272t = !this.f41271s;
        } catch (Throwable th) {
            AbstractC9770iZ1.m19065b(this.f9819i);
            throw th;
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
        this.f41271s = true;
    }
}
