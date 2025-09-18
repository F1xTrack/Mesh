package defpackage;

/* renamed from: Gn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528Gn0 extends AbstractC5195ip1 {
    public final boolean l;
    public final C0100Ba1 m;
    public final C0022Aa1 n;
    public C0372En0 o;
    public C0294Dn0 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public C0528Gn0(AbstractC6883rg abstractC6883rg, boolean z) {
        super(abstractC6883rg);
        this.l = z && abstractC6883rg.i();
        this.m = new C0100Ba1();
        this.n = new C0022Aa1();
        AbstractC0178Ca1 abstractC0178Ca1G = abstractC6883rg.g();
        if (abstractC0178Ca1G == null) {
            this.o = new C0372En0(new C0450Fn0(abstractC6883rg.h()), C0100Ba1.q, C0372En0.e);
        } else {
            this.o = new C0372En0(abstractC0178Ca1G, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.AbstractC5195ip1
    public final C0456Fp0 A(C0456Fp0 c0456Fp0) {
        Object obj = c0456Fp0.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0372En0.e;
        }
        return c0456Fp0.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC5195ip1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.AbstractC0178Ca1 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0528Gn0.B(Ca1):void");
    }

    @Override // defpackage.AbstractC5195ip1
    public final void D() {
        if (this.l) {
            return;
        }
        this.q = true;
        C();
    }

    @Override // defpackage.AbstractC6883rg
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C0294Dn0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        C0294Dn0 c0294Dn0 = new C0294Dn0(c0456Fp0, c5272jE, j);
        AbstractC6883rg abstractC6883rg = this.k;
        YN1.f(c0294Dn0.d == null);
        c0294Dn0.d = abstractC6883rg;
        if (this.r) {
            Object obj = this.o.d;
            Object obj2 = c0456Fp0.a;
            if (obj != null && obj2.equals(C0372En0.e)) {
                obj2 = this.o.d;
            }
            c0294Dn0.c(c0456Fp0.a(obj2));
        } else {
            this.p = c0294Dn0;
            if (!this.q) {
                this.q = true;
                C();
            }
        }
        return c0294Dn0;
    }

    public final boolean F(long j) {
        C0294Dn0 c0294Dn0 = this.p;
        int iB = this.o.b(c0294Dn0.a.a);
        if (iB == -1) {
            return false;
        }
        C0372En0 c0372En0 = this.o;
        C0022Aa1 c0022Aa1 = this.n;
        c0372En0.f(iB, c0022Aa1, false);
        long j2 = c0022Aa1.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c0294Dn0.h = j;
        return true;
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        C0294Dn0 c0294Dn0 = (C0294Dn0) interfaceC8435zp0;
        if (c0294Dn0.e != null) {
            AbstractC6883rg abstractC6883rg = c0294Dn0.d;
            abstractC6883rg.getClass();
            abstractC6883rg.o(c0294Dn0.e);
        }
        if (interfaceC8435zp0 == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.AbstractC1720Vv, defpackage.AbstractC6883rg
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // defpackage.AbstractC5195ip1, defpackage.AbstractC6883rg
    public final void t(C6721qp0 c6721qp0) {
        if (this.s) {
            C0372En0 c0372En0 = this.o;
            this.o = new C0372En0(new RB0(this.o.b, c6721qp0), c0372En0.c, c0372En0.d);
        } else {
            this.o = new C0372En0(new C0450Fn0(c6721qp0), C0100Ba1.q, C0372En0.e);
        }
        this.k.t(c6721qp0);
    }

    @Override // defpackage.AbstractC1720Vv, defpackage.AbstractC6883rg
    public final void j() {
    }
}
