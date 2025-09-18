package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: we1 */
/* loaded from: classes2.dex */
public final class C11571we1 {

    /* renamed from: b */
    public static final C11571we1 f45010b = new C11571we1(AbstractC11316ue1.f43786a);

    /* renamed from: a */
    public final AbstractC11316ue1 f45011a;

    public C11571we1(AbstractC11316ue1 abstractC11316ue1) {
        this.f45011a = abstractC11316ue1;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0021 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m25659a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11571we1.m25659a(int):void");
    }

    /* renamed from: b */
    public static EnumC9532gi1 m25660b(EnumC9532gi1 enumC9532gi1, EnumC9532gi1 enumC9532gi12) {
        if (enumC9532gi1 == null) {
            m25659a(38);
            throw null;
        }
        if (enumC9532gi12 == null) {
            m25659a(39);
            throw null;
        }
        EnumC9532gi1 enumC9532gi13 = EnumC9532gi1.f27947c;
        if (enumC9532gi1 == enumC9532gi13) {
            if (enumC9532gi12 != null) {
                return enumC9532gi12;
            }
            m25659a(40);
            throw null;
        }
        if (enumC9532gi12 == enumC9532gi13) {
            if (enumC9532gi1 != null) {
                return enumC9532gi1;
            }
            m25659a(41);
            throw null;
        }
        if (enumC9532gi1 == enumC9532gi12) {
            if (enumC9532gi12 != null) {
                return enumC9532gi12;
            }
            m25659a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC9532gi1 + "' and projection kind '" + enumC9532gi12 + "' cannot be combined");
    }

    /* renamed from: c */
    public static int m25661c(EnumC9532gi1 enumC9532gi1, EnumC9532gi1 enumC9532gi12) {
        EnumC9532gi1 enumC9532gi13 = EnumC9532gi1.f27948d;
        if (enumC9532gi1 == enumC9532gi13 && enumC9532gi12 == EnumC9532gi1.f27949e) {
            return 3;
        }
        return (enumC9532gi1 == EnumC9532gi1.f27949e && enumC9532gi12 == enumC9532gi13) ? 2 : 1;
    }

    /* renamed from: d */
    public static C11571we1 m25662d(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m25659a(6);
            throw null;
        }
        return new C11571we1(AbstractC8257Sd1.f10883b.m22120p(abstractC7742Ig0.mo3797E(), abstractC7742Ig0.mo3800u()));
    }

    /* renamed from: e */
    public static C11571we1 m25663e(AbstractC11316ue1 abstractC11316ue1, AbstractC11316ue1 abstractC11316ue12) {
        if (abstractC11316ue1 == null) {
            m25659a(3);
            throw null;
        }
        if (abstractC11316ue12 == null) {
            m25659a(4);
            throw null;
        }
        if (abstractC11316ue1.mo7050e()) {
            abstractC11316ue1 = abstractC11316ue12;
        } else if (!abstractC11316ue12.mo7050e()) {
            abstractC11316ue1 = new C1530YJ(abstractC11316ue1, abstractC11316ue12);
        }
        return new C11571we1(abstractC11316ue1);
    }

    /* renamed from: h */
    public static String m25664h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (H02.m3208a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* renamed from: f */
    public final AbstractC11316ue1 m25665f() {
        AbstractC11316ue1 abstractC11316ue1 = this.f45011a;
        if (abstractC11316ue1 != null) {
            return abstractC11316ue1;
        }
        m25659a(8);
        throw null;
    }

    /* renamed from: g */
    public final AbstractC7742Ig0 m25666g(AbstractC7742Ig0 abstractC7742Ig0, EnumC9532gi1 enumC9532gi1) {
        if (abstractC7742Ig0 == null) {
            m25659a(9);
            throw null;
        }
        if (this.f45011a.mo7050e()) {
            return abstractC7742Ig0;
        }
        try {
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b = m25668j(new C10988s41(abstractC7742Ig0, enumC9532gi1), null, 0).mo24038b();
            if (abstractC7742Ig0Mo24038b != null) {
                return abstractC7742Ig0Mo24038b;
            }
            m25659a(12);
            throw null;
        } catch (C11444ve1 e) {
            return C6298kP.m22197c(EnumC6235jP.f35126k, e.getMessage());
        }
    }

    /* renamed from: i */
    public final AbstractC7742Ig0 m25667i(AbstractC7742Ig0 abstractC7742Ig0, EnumC9532gi1 enumC9532gi1) {
        if (abstractC7742Ig0 == null) {
            m25659a(14);
            throw null;
        }
        if (enumC9532gi1 == null) {
            m25659a(15);
            throw null;
        }
        AbstractC10804qe1 c10988s41 = new C10988s41(m25665f().mo9254f(abstractC7742Ig0, enumC9532gi1), enumC9532gi1);
        AbstractC11316ue1 abstractC11316ue1 = this.f45011a;
        if (!abstractC11316ue1.mo7050e()) {
            try {
                c10988s41 = m25668j(c10988s41, null, 0);
            } catch (C11444ve1 unused) {
                c10988s41 = null;
            }
        }
        if (abstractC11316ue1.mo7049a() || abstractC11316ue1.mo9252b()) {
            boolean zMo9252b = abstractC11316ue1.mo9252b();
            if (c10988s41 == null) {
                c10988s41 = null;
            } else if (!c10988s41.mo24039c()) {
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b = c10988s41.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
                if (AbstractC7375Be1.m785c(abstractC7742Ig0Mo24038b, C4214i.f28737v, null)) {
                    EnumC9532gi1 enumC9532gi1Mo24037a = c10988s41.mo24037a();
                    O90.m5967e(enumC9532gi1Mo24037a, "getProjectionKind(...)");
                    if (enumC9532gi1Mo24037a == EnumC9532gi1.f27949e) {
                        c10988s41 = new C10988s41((AbstractC7742Ig0) AbstractC10012kS1.m22213a(abstractC7742Ig0Mo24038b).f27578b, enumC9532gi1Mo24037a);
                    } else if (zMo9252b) {
                        c10988s41 = new C10988s41((AbstractC7742Ig0) AbstractC10012kS1.m22213a(abstractC7742Ig0Mo24038b).f27577a, enumC9532gi1Mo24037a);
                    } else {
                        C6388lq c6388lq = new C6388lq();
                        C11571we1 c11571we1 = new C11571we1(c6388lq);
                        if (!c6388lq.mo7050e()) {
                            try {
                                c10988s41 = c11571we1.m25668j(c10988s41, null, 0);
                            } catch (C11444ve1 unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (c10988s41 == null) {
            return null;
        }
        return c10988s41.mo24038b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final AbstractC10804qe1 m25668j(AbstractC10804qe1 abstractC10804qe1, InterfaceC10292me1 interfaceC10292me1, int i) throws C11444ve1 {
        char c;
        C11571we1 c11571we1;
        AbstractC7742Ig0 abstractC7742Ig0M25667i = null;
        if (abstractC10804qe1 == null) {
            m25659a(18);
            throw null;
        }
        AbstractC11316ue1 abstractC11316ue1 = this.f45011a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m25664h(abstractC10804qe1) + "; substitution: " + m25664h(abstractC11316ue1));
        }
        if (abstractC10804qe1.mo24039c()) {
            return abstractC10804qe1;
        }
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
        if (abstractC7742Ig0Mo24038b instanceof InterfaceC7583Fe1) {
            InterfaceC7583Fe1 interfaceC7583Fe1 = (InterfaceC7583Fe1) abstractC7742Ig0Mo24038b;
            AbstractC8315Tg1 abstractC8315Tg1Mo2721t = interfaceC7583Fe1.mo2721t();
            AbstractC7742Ig0 abstractC7742Ig0Mo2720k = interfaceC7583Fe1.mo2720k();
            AbstractC10804qe1 abstractC10804qe1M25668j = m25668j(new C10988s41(abstractC8315Tg1Mo2721t, abstractC10804qe1.mo24037a()), interfaceC10292me1, i + 1);
            return abstractC10804qe1M25668j.mo24039c() ? abstractC10804qe1M25668j : new C10988s41(EZ1.m2354n(abstractC10804qe1M25668j.mo24038b().mo3963L(), m25667i(abstractC7742Ig0Mo2720k, abstractC10804qe1.mo24037a())), abstractC10804qe1M25668j.mo24037a());
        }
        O90.m5968f(abstractC7742Ig0Mo24038b, "<this>");
        abstractC7742Ig0Mo24038b.mo3963L();
        if (abstractC7742Ig0Mo24038b.mo3963L() instanceof C10633pJ0) {
            return abstractC10804qe1;
        }
        AbstractC10804qe1 abstractC10804qe1Mo7400d = abstractC11316ue1.mo7400d(abstractC7742Ig0Mo24038b);
        if (abstractC10804qe1Mo7400d == null) {
            abstractC10804qe1Mo7400d = null;
        } else if (abstractC7742Ig0Mo24038b.getAnnotations().mo3261g(AbstractC10604p41.f39827y)) {
            InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC10804qe1Mo7400d.mo24038b().mo3797E();
            if (interfaceC8101Pd1Mo3797E instanceof C10709pv0) {
                AbstractC10804qe1 abstractC10804qe12 = ((C10709pv0) interfaceC8101Pd1Mo3797E).f40434a;
                EnumC9532gi1 enumC9532gi1Mo24037a = abstractC10804qe12.mo24037a();
                if (m25661c(abstractC10804qe1.mo24037a(), enumC9532gi1Mo24037a) == 3) {
                    abstractC10804qe1Mo7400d = new C10988s41(abstractC10804qe12.mo24038b());
                } else if (interfaceC10292me1 != null && m25661c(interfaceC10292me1.mo22918O(), enumC9532gi1Mo24037a) == 3) {
                    abstractC10804qe1Mo7400d = new C10988s41(abstractC10804qe12.mo24038b());
                }
            }
        }
        EnumC9532gi1 enumC9532gi1Mo24037a2 = abstractC10804qe1.mo24037a();
        if (abstractC10804qe1Mo7400d == null && AbstractC9572h12.m18696d(abstractC7742Ig0Mo24038b)) {
            InterfaceC6595p5 interfaceC6595p5Mo3963L = abstractC7742Ig0Mo24038b.mo3963L();
            InterfaceC1649aC interfaceC1649aC = interfaceC6595p5Mo3963L instanceof InterfaceC1649aC ? (InterfaceC1649aC) interfaceC6595p5Mo3963L : null;
            if (!(interfaceC1649aC != null ? interfaceC1649aC.mo7466r() : false)) {
                AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC7742Ig0Mo24038b.mo3963L();
                X01 x01 = abstractC3933dW.f26126b;
                int i2 = i + 1;
                AbstractC10804qe1 abstractC10804qe1M25668j2 = m25668j(new C10988s41(x01, enumC9532gi1Mo24037a2), interfaceC10292me1, i2);
                X01 x012 = abstractC3933dW.f26127c;
                AbstractC10804qe1 abstractC10804qe1M25668j3 = m25668j(new C10988s41(x012, enumC9532gi1Mo24037a2), interfaceC10292me1, i2);
                return (abstractC10804qe1M25668j2.mo24038b() == x01 && abstractC10804qe1M25668j3.mo24038b() == x012) ? abstractC10804qe1 : new C10988s41(NV1.m5738t(AbstractC11815yZ1.m26170a(abstractC10804qe1M25668j2.mo24038b()), AbstractC11815yZ1.m26170a(abstractC10804qe1M25668j3.mo24038b())), abstractC10804qe1M25668j2.mo24037a());
            }
        }
        if (AbstractC11955zg0.m26486E(abstractC7742Ig0Mo24038b) || AbstractC1141S8.m7182b(abstractC7742Ig0Mo24038b)) {
            return abstractC10804qe1;
        }
        if (abstractC10804qe1Mo7400d != null) {
            int iM25661c = m25661c(enumC9532gi1Mo24037a2, abstractC10804qe1Mo7400d.mo24037a());
            if (!(abstractC7742Ig0Mo24038b.mo3797E() instanceof InterfaceC6451mq)) {
                int iM26247x = AbstractC7222ym.m26247x(iM25661c);
                if (iM26247x == 1) {
                    return new C10988s41(abstractC7742Ig0Mo24038b.mo3797E().mo1964h().m26507o(), EnumC9532gi1.f27949e);
                }
                if (iM26247x == 2) {
                    throw new C11444ve1("Out-projection in in-position");
                }
            }
            InterfaceC6595p5 interfaceC6595p5Mo3963L2 = abstractC7742Ig0Mo24038b.mo3963L();
            InterfaceC1649aC interfaceC1649aC2 = interfaceC6595p5Mo3963L2 instanceof InterfaceC1649aC ? (InterfaceC1649aC) interfaceC6595p5Mo3963L2 : null;
            if (interfaceC1649aC2 == null || !interfaceC1649aC2.mo7466r()) {
                interfaceC1649aC2 = null;
            }
            if (abstractC10804qe1Mo7400d.mo24039c()) {
                return abstractC10804qe1Mo7400d;
            }
            AbstractC7742Ig0 abstractC7742Ig0Mo7465n = interfaceC1649aC2 != null ? interfaceC1649aC2.mo7465n(abstractC10804qe1Mo7400d.mo24038b()) : AbstractC7375Be1.m790h(abstractC10804qe1Mo7400d.mo24038b(), abstractC7742Ig0Mo24038b.mo3798G());
            if (!abstractC7742Ig0Mo24038b.getAnnotations().isEmpty()) {
                InterfaceC0510I5 interfaceC0510I5Mo9253c = abstractC11316ue1.mo9253c(abstractC7742Ig0Mo24038b.getAnnotations());
                if (interfaceC0510I5Mo9253c == null) {
                    m25659a(33);
                    throw null;
                }
                if (interfaceC0510I5Mo9253c.mo3261g(AbstractC10604p41.f39827y)) {
                    interfaceC0510I5Mo9253c = new C7015vU(interfaceC0510I5Mo9253c, new C0726LX(4));
                }
                abstractC7742Ig0Mo7465n = CZ1.m1235k(abstractC7742Ig0Mo7465n, new C0636K5(new InterfaceC0510I5[]{abstractC7742Ig0Mo7465n.getAnnotations(), interfaceC0510I5Mo9253c}));
            }
            if (iM25661c == 1) {
                enumC9532gi1Mo24037a2 = m25660b(enumC9532gi1Mo24037a2, abstractC10804qe1Mo7400d.mo24037a());
            }
            return new C10988s41(abstractC7742Ig0Mo7465n, enumC9532gi1Mo24037a2);
        }
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b2 = abstractC10804qe1.mo24038b();
        EnumC9532gi1 enumC9532gi1Mo24037a3 = abstractC10804qe1.mo24037a();
        if (abstractC7742Ig0Mo24038b2.mo3797E().mo1962a() instanceof InterfaceC10292me1) {
            return abstractC10804qe1;
        }
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0Mo24038b2.mo3963L();
        C6652q c6652q = abstractC8315Tg1Mo3963L instanceof C6652q ? (C6652q) abstractC8315Tg1Mo3963L : null;
        X01 x013 = c6652q != null ? c6652q.f40478c : null;
        if (x013 != null) {
            if ((abstractC11316ue1 instanceof C9715i80) && abstractC11316ue1.mo9252b()) {
                C9715i80 c9715i80 = (C9715i80) abstractC11316ue1;
                c11571we1 = new C11571we1(new C9715i80(c9715i80.f28833b, c9715i80.f28834c, false));
            } else {
                c11571we1 = this;
            }
            abstractC7742Ig0M25667i = c11571we1.m25667i(x013, EnumC9532gi1.f27947c);
        }
        List parameters = abstractC7742Ig0Mo24038b2.mo3797E().getParameters();
        List listMo3800u = abstractC7742Ig0Mo24038b2.mo3800u();
        ArrayList arrayList = new ArrayList(parameters.size());
        boolean z = false;
        for (int i3 = 0; i3 < parameters.size(); i3++) {
            InterfaceC10292me1 interfaceC10292me12 = (InterfaceC10292me1) parameters.get(i3);
            AbstractC10804qe1 abstractC10804qe13 = (AbstractC10804qe1) listMo3800u.get(i3);
            AbstractC10804qe1 abstractC10804qe1M25668j4 = m25668j(abstractC10804qe13, interfaceC10292me12, i + 1);
            int iM26247x2 = AbstractC7222ym.m26247x(m25661c(interfaceC10292me12.mo22918O(), abstractC10804qe1M25668j4.mo24037a()));
            if (iM26247x2 != 0) {
                if (iM26247x2 != 1) {
                    c = 2;
                    if (iM26247x2 == 2) {
                    }
                } else {
                    c = 2;
                }
                abstractC10804qe1M25668j4 = AbstractC7375Be1.m792j(interfaceC10292me12);
            } else {
                c = 2;
                EnumC9532gi1 enumC9532gi1Mo22918O = interfaceC10292me12.mo22918O();
                EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
                if (enumC9532gi1Mo22918O != enumC9532gi1 && !abstractC10804qe1M25668j4.mo24039c()) {
                    abstractC10804qe1M25668j4 = new C10988s41(abstractC10804qe1M25668j4.mo24038b(), enumC9532gi1);
                }
            }
            if (abstractC10804qe1M25668j4 != abstractC10804qe13) {
                z = true;
            }
            arrayList.add(abstractC10804qe1M25668j4);
        }
        if (z) {
            listMo3800u = arrayList;
        }
        InterfaceC0510I5 interfaceC0510I5Mo9253c2 = abstractC11316ue1.mo9253c(abstractC7742Ig0Mo24038b2.getAnnotations());
        O90.m5968f(listMo3800u, "newArguments");
        O90.m5968f(interfaceC0510I5Mo9253c2, "newAnnotations");
        AbstractC7742Ig0 abstractC7742Ig0M26172c = AbstractC11815yZ1.m26172c(abstractC7742Ig0Mo24038b2, listMo3800u, interfaceC0510I5Mo9253c2, 4);
        if ((abstractC7742Ig0M26172c instanceof X01) && (abstractC7742Ig0M25667i instanceof X01)) {
            abstractC7742Ig0M26172c = KS1.m4648d((X01) abstractC7742Ig0M26172c, (X01) abstractC7742Ig0M25667i);
        }
        return new C10988s41(abstractC7742Ig0M26172c, enumC9532gi1Mo24037a3);
    }
}
