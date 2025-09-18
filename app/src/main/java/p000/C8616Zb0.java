package p000;

/* renamed from: Zb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8616Zb0 extends AbstractC8356Ub0 {

    /* renamed from: e */
    public final C9002cc0 f14991e;

    /* renamed from: f */
    public final C8746ac0 f14992f;

    /* renamed from: g */
    public final C0432Gr f14993g;

    /* renamed from: h */
    public final Object f14994h;

    public C8616Zb0(C9002cc0 c9002cc0, C8746ac0 c8746ac0, C0432Gr c0432Gr, Object obj) {
        this.f14991e = c9002cc0;
        this.f14992f = c8746ac0;
        this.f14993g = c0432Gr;
        this.f14994h = obj;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: j */
    public final boolean mo2434j() {
        return false;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: k */
    public final void mo2435k(Throwable th) {
        C0432Gr c0432Gr = this.f14993g;
        C9002cc0 c9002cc0 = this.f14991e;
        c9002cc0.getClass();
        C0432Gr c0432GrM10794J = C9002cc0.m10794J(c0432Gr);
        C8746ac0 c8746ac0 = this.f14992f;
        Object obj = this.f14994h;
        if (c0432GrM10794J == null || !c9002cc0.m10808S(c8746ac0, c0432GrM10794J, obj)) {
            c8746ac0.f15586a.m9806d(new C10941rj0(2), 2);
            C0432Gr c0432GrM10794J2 = C9002cc0.m10794J(c0432Gr);
            if (c0432GrM10794J2 == null || !c9002cc0.m10808S(c8746ac0, c0432GrM10794J2, obj)) {
                c9002cc0.mo1298d(c9002cc0.m10817t(c8746ac0, obj));
            }
        }
    }
}
