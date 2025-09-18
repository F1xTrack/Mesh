package defpackage;

/* renamed from: Zb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1973Zb0 extends AbstractC1583Ub0 {
    public final C2548cc0 e;
    public final C2167ac0 f;
    public final C0539Gr g;
    public final Object h;

    public C1973Zb0(C2548cc0 c2548cc0, C2167ac0 c2167ac0, C0539Gr c0539Gr, Object obj) {
        this.e = c2548cc0;
        this.f = c2167ac0;
        this.g = c0539Gr;
        this.h = obj;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final boolean j() {
        return false;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final void k(Throwable th) {
        C0539Gr c0539Gr = this.g;
        C2548cc0 c2548cc0 = this.e;
        c2548cc0.getClass();
        C0539Gr c0539GrJ = C2548cc0.J(c0539Gr);
        C2167ac0 c2167ac0 = this.f;
        Object obj = this.h;
        if (c0539GrJ == null || !c2548cc0.S(c2167ac0, c0539GrJ, obj)) {
            c2167ac0.a.d(new C6893rj0(2), 2);
            C0539Gr c0539GrJ2 = C2548cc0.J(c0539Gr);
            if (c0539GrJ2 == null || !c2548cc0.S(c2167ac0, c0539GrJ2, obj)) {
                c2548cc0.d(c2548cc0.t(c2167ac0, obj));
            }
        }
    }
}
