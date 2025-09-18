package defpackage;

/* renamed from: Ur, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630Ur implements InterfaceC3403dV0 {
    public final C1708Vr a;
    public final C2527cV0 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ C1708Vr e;

    public C1630Ur(C1708Vr c1708Vr, C1708Vr c1708Vr2, C2527cV0 c2527cV0, int i) {
        this.e = c1708Vr;
        this.a = c1708Vr2;
        this.b = c2527cV0;
        this.c = i;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        C1708Vr c1708Vr = this.e;
        VY vy = c1708Vr.g;
        int[] iArr = c1708Vr.b;
        int i = this.c;
        vy.x(iArr[i], c1708Vr.c[i], 0, null, c1708Vr.t);
        this.d = true;
    }

    public final void c() {
        C1708Vr c1708Vr = this.e;
        boolean[] zArr = c1708Vr.d;
        int i = this.c;
        YN1.f(zArr[i]);
        c1708Vr.d[i] = false;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        C1708Vr c1708Vr = this.e;
        return !c1708Vr.x() && this.b.w(c1708Vr.w);
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        C1708Vr c1708Vr = this.e;
        if (c1708Vr.x()) {
            return 0;
        }
        boolean z = c1708Vr.w;
        C2527cV0 c2527cV0 = this.b;
        int iT = c2527cV0.t(j, z);
        AbstractC6502pg abstractC6502pg = c1708Vr.v;
        if (abstractC6502pg != null) {
            iT = Math.min(iT, abstractC6502pg.c(this.c + 1) - c2527cV0.r());
        }
        c2527cV0.G(iT);
        if (iT > 0) {
            b();
        }
        return iT;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        C1708Vr c1708Vr = this.e;
        if (c1708Vr.x()) {
            return -3;
        }
        AbstractC6502pg abstractC6502pg = c1708Vr.v;
        C2527cV0 c2527cV0 = this.b;
        if (abstractC6502pg != null && abstractC6502pg.c(this.c + 1) <= c2527cV0.r()) {
            return -3;
        }
        b();
        return c2527cV0.B(n8, zd, i, c1708Vr.w);
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() {
    }
}
