package p000;

/* renamed from: ma1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10284ma1 implements InterfaceC9121dV0 {

    /* renamed from: a */
    public final InterfaceC9121dV0 f37781a;

    /* renamed from: b */
    public final long f37782b;

    public C10284ma1(InterfaceC9121dV0 interfaceC9121dV0, long j) {
        this.f37781a = interfaceC9121dV0;
        this.f37782b = j;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() {
        this.f37781a.mo34a();
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        return this.f37781a.mo37f();
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        return this.f37781a.mo38j(j - this.f37782b);
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        int iMo39k = this.f37781a.mo39k(c0827n8, c1587zd, i);
        if (iMo39k == -4) {
            c1587zd.f14800g += this.f37782b;
        }
        return iMo39k;
    }
}
