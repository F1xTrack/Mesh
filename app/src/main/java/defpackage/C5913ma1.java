package defpackage;

/* renamed from: ma1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5913ma1 implements InterfaceC3403dV0 {
    public final InterfaceC3403dV0 a;
    public final long b;

    public C5913ma1(InterfaceC3403dV0 interfaceC3403dV0, long j) {
        this.a = interfaceC3403dV0;
        this.b = j;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        return this.a.j(j - this.b);
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        int iK = this.a.k(n8, zd, i);
        if (iK == -4) {
            zd.g += this.b;
        }
        return iK;
    }
}
