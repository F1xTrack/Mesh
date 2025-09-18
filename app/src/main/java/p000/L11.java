package p000;

/* loaded from: classes.dex */
public final class L11 extends AbstractC6632pg {

    /* renamed from: o */
    public final int f6467o;

    /* renamed from: p */
    public final C6686qX f6468p;

    /* renamed from: q */
    public long f6469q;

    /* renamed from: r */
    public boolean f6470r;

    public L11(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD, C6686qX c6686qX, int i, Object obj, long j, long j2, long j3, int i2, C6686qX c6686qX2) {
        super(interfaceC1586ZC, c3976eD, c6686qX, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f6467o = i2;
        this.f6468p = c6686qX2;
    }

    @Override // p000.AbstractC7498Do0
    /* renamed from: b */
    public final boolean mo1899b() {
        return this.f6470r;
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        M41 m41 = this.f9819i;
        C1339VH c1339vh = this.f40274m;
        YN1.m9283h(c1339vh);
        for (C8988cV0 c8988cV0 : (C8988cV0[]) c1339vh.f12487c) {
            if (c8988cV0.f17545F != 0) {
                c8988cV0.f17545F = 0L;
                c8988cV0.f17572z = true;
            }
        }
        InterfaceC8357Ub1 interfaceC8357Ub1M8361E = c1339vh.m8361E(this.f6467o);
        interfaceC8357Ub1M8361E.mo965f(this.f6468p);
        try {
            long jMo2365c = m41.mo2365c(this.f9812b.m17881d(this.f6469q));
            if (jMo2365c != -1) {
                jMo2365c += this.f6469q;
            }
            C7000vF c7000vF = new C7000vF(this.f9819i, this.f6469q, jMo2365c);
            for (int iMo964e = 0; iMo964e != -1; iMo964e = interfaceC8357Ub1M8361E.mo964e(c7000vF, Integer.MAX_VALUE, true)) {
                this.f6469q += iMo964e;
            }
            interfaceC8357Ub1M8361E.mo960a(this.f9817g, 1, (int) this.f6469q, 0, null);
            AbstractC9770iZ1.m19065b(m41);
            this.f6470r = true;
        } catch (Throwable th) {
            AbstractC9770iZ1.m19065b(m41);
            throw th;
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
    }
}
