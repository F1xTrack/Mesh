package p000;

/* renamed from: Gn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7652Gn0 extends AbstractC9802ip1 {

    /* renamed from: l */
    public final boolean f3893l;

    /* renamed from: m */
    public final C7367Ba1 f3894m;

    /* renamed from: n */
    public final C7315Aa1 f3895n;

    /* renamed from: o */
    public C7548En0 f3896o;

    /* renamed from: p */
    public C7496Dn0 f3897p;

    /* renamed from: q */
    public boolean f3898q;

    /* renamed from: r */
    public boolean f3899r;

    /* renamed from: s */
    public boolean f3900s;

    public C7652Gn0(AbstractC6758rg abstractC6758rg, boolean z) {
        super(abstractC6758rg);
        this.f3893l = z && abstractC6758rg.mo21933i();
        this.f3894m = new C7367Ba1();
        this.f3895n = new C7315Aa1();
        AbstractC7419Ca1 abstractC7419Ca1Mo21932g = abstractC6758rg.mo21932g();
        if (abstractC7419Ca1Mo21932g == null) {
            this.f3896o = new C7548En0(new C7600Fn0(abstractC6758rg.mo6202h()), C7367Ba1.f912q, C7548En0.f2900e);
        } else {
            this.f3896o = new C7548En0(abstractC7419Ca1Mo21932g, null, null);
            this.f3900s = true;
        }
    }

    @Override // p000.AbstractC9802ip1
    /* renamed from: A */
    public final C7604Fp0 mo3157A(C7604Fp0 c7604Fp0) {
        Object obj = c7604Fp0.f3430a;
        Object obj2 = this.f3896o.f2902d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C7548En0.f2900e;
        }
        return c7604Fp0.m2790a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC9802ip1
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3158B(p000.AbstractC7419Ca1 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7652Gn0.mo3158B(Ca1):void");
    }

    @Override // p000.AbstractC9802ip1
    /* renamed from: D */
    public final void mo3159D() {
        if (this.f3893l) {
            return;
        }
        this.f3898q = true;
        m21931C();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C7496Dn0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        C7496Dn0 c7496Dn0 = new C7496Dn0(c7604Fp0, c6224jE, j);
        AbstractC6758rg abstractC6758rg = this.f34756k;
        YN1.m9281f(c7496Dn0.f2247d == null);
        c7496Dn0.f2247d = abstractC6758rg;
        if (this.f3899r) {
            Object obj = this.f3896o.f2902d;
            Object obj2 = c7604Fp0.f3430a;
            if (obj != null && obj2.equals(C7548En0.f2900e)) {
                obj2 = this.f3896o.f2902d;
            }
            c7496Dn0.m1878c(c7604Fp0.m2790a(obj2));
        } else {
            this.f3897p = c7496Dn0;
            if (!this.f3898q) {
                this.f3898q = true;
                m21931C();
            }
        }
        return c7496Dn0;
    }

    /* renamed from: F */
    public final boolean m3161F(long j) {
        C7496Dn0 c7496Dn0 = this.f3897p;
        int iMo1245b = this.f3896o.mo1245b(c7496Dn0.f2244a.f3430a);
        if (iMo1245b == -1) {
            return false;
        }
        C7548En0 c7548En0 = this.f3896o;
        C7315Aa1 c7315Aa1 = this.f3895n;
        c7548En0.mo1249f(iMo1245b, c7315Aa1, false);
        long j2 = c7315Aa1.f259d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c7496Dn0.f2251h = j;
        return true;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        C7496Dn0 c7496Dn0 = (C7496Dn0) interfaceC11973zp0;
        if (c7496Dn0.f2248e != null) {
            AbstractC6758rg abstractC6758rg = c7496Dn0.f2247d;
            abstractC6758rg.getClass();
            abstractC6758rg.mo3164o(c7496Dn0.f2248e);
        }
        if (interfaceC11973zp0 == this.f3897p) {
            this.f3897p = null;
        }
    }

    @Override // p000.AbstractC1379Vv, p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        this.f3899r = false;
        this.f3898q = false;
        super.mo3165q();
    }

    @Override // p000.AbstractC9802ip1, p000.AbstractC6758rg
    /* renamed from: t */
    public final void mo3166t(C10825qp0 c10825qp0) {
        if (this.f3900s) {
            C7548En0 c7548En0 = this.f3896o;
            this.f3896o = new C7548En0(new RB0(this.f3896o.f3796b, c10825qp0), c7548En0.f2901c, c7548En0.f2902d);
        } else {
            this.f3896o = new C7548En0(new C7600Fn0(c10825qp0), C7367Ba1.f912q, C7548En0.f2900e);
        }
        this.f34756k.mo3166t(c10825qp0);
    }

    @Override // p000.AbstractC1379Vv, p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() {
    }
}
