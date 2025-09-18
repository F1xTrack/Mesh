package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: we1 */
/* loaded from: classes2.dex */
public final class C7833we1 {
    public static final C7833we1 b = new C7833we1(AbstractC7452ue1.a);
    public final AbstractC7452ue1 a;

    public C7833we1(AbstractC7452ue1 abstractC7452ue1) {
        this.a = abstractC7452ue1;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7833we1.a(int):void");
    }

    public static EnumC4015gi1 b(EnumC4015gi1 enumC4015gi1, EnumC4015gi1 enumC4015gi12) {
        if (enumC4015gi1 == null) {
            a(38);
            throw null;
        }
        if (enumC4015gi12 == null) {
            a(39);
            throw null;
        }
        EnumC4015gi1 enumC4015gi13 = EnumC4015gi1.c;
        if (enumC4015gi1 == enumC4015gi13) {
            if (enumC4015gi12 != null) {
                return enumC4015gi12;
            }
            a(40);
            throw null;
        }
        if (enumC4015gi12 == enumC4015gi13) {
            if (enumC4015gi1 != null) {
                return enumC4015gi1;
            }
            a(41);
            throw null;
        }
        if (enumC4015gi1 == enumC4015gi12) {
            if (enumC4015gi12 != null) {
                return enumC4015gi12;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC4015gi1 + "' and projection kind '" + enumC4015gi12 + "' cannot be combined");
    }

    public static int c(EnumC4015gi1 enumC4015gi1, EnumC4015gi1 enumC4015gi12) {
        EnumC4015gi1 enumC4015gi13 = EnumC4015gi1.d;
        if (enumC4015gi1 == enumC4015gi13 && enumC4015gi12 == EnumC4015gi1.e) {
            return 3;
        }
        return (enumC4015gi1 == EnumC4015gi1.e && enumC4015gi12 == enumC4015gi13) ? 2 : 1;
    }

    public static C7833we1 d(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(6);
            throw null;
        }
        return new C7833we1(AbstractC1434Sd1.b.p(abstractC0663Ig0.E(), abstractC0663Ig0.u()));
    }

    public static C7833we1 e(AbstractC7452ue1 abstractC7452ue1, AbstractC7452ue1 abstractC7452ue12) {
        if (abstractC7452ue1 == null) {
            a(3);
            throw null;
        }
        if (abstractC7452ue12 == null) {
            a(4);
            throw null;
        }
        if (abstractC7452ue1.e()) {
            abstractC7452ue1 = abstractC7452ue12;
        } else if (!abstractC7452ue12.e()) {
            abstractC7452ue1 = new YJ(abstractC7452ue1, abstractC7452ue12);
        }
        return new C7833we1(abstractC7452ue1);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (H02.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final AbstractC7452ue1 f() {
        AbstractC7452ue1 abstractC7452ue1 = this.a;
        if (abstractC7452ue1 != null) {
            return abstractC7452ue1;
        }
        a(8);
        throw null;
    }

    public final AbstractC0663Ig0 g(AbstractC0663Ig0 abstractC0663Ig0, EnumC4015gi1 enumC4015gi1) {
        if (abstractC0663Ig0 == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return abstractC0663Ig0;
        }
        try {
            AbstractC0663Ig0 abstractC0663Ig0B = j(new C6962s41(abstractC0663Ig0, enumC4015gi1), null, 0).b();
            if (abstractC0663Ig0B != null) {
                return abstractC0663Ig0B;
            }
            a(12);
            throw null;
        } catch (C7643ve1 e) {
            return C5496kP.c(EnumC5305jP.k, e.getMessage());
        }
    }

    public final AbstractC0663Ig0 i(AbstractC0663Ig0 abstractC0663Ig0, EnumC4015gi1 enumC4015gi1) {
        if (abstractC0663Ig0 == null) {
            a(14);
            throw null;
        }
        if (enumC4015gi1 == null) {
            a(15);
            throw null;
        }
        AbstractC6689qe1 c6962s41 = new C6962s41(f().f(abstractC0663Ig0, enumC4015gi1), enumC4015gi1);
        AbstractC7452ue1 abstractC7452ue1 = this.a;
        if (!abstractC7452ue1.e()) {
            try {
                c6962s41 = j(c6962s41, null, 0);
            } catch (C7643ve1 unused) {
                c6962s41 = null;
            }
        }
        if (abstractC7452ue1.a() || abstractC7452ue1.b()) {
            boolean zB = abstractC7452ue1.b();
            if (c6962s41 == null) {
                c6962s41 = null;
            } else if (!c6962s41.c()) {
                AbstractC0663Ig0 abstractC0663Ig0B = c6962s41.b();
                O90.e(abstractC0663Ig0B, "getType(...)");
                if (AbstractC0112Be1.c(abstractC0663Ig0B, C4258i.v, null)) {
                    EnumC4015gi1 enumC4015gi1A = c6962s41.a();
                    O90.e(enumC4015gi1A, "getProjectionKind(...)");
                    if (enumC4015gi1A == EnumC4015gi1.e) {
                        c6962s41 = new C6962s41((AbstractC0663Ig0) AbstractC5507kS1.a(abstractC0663Ig0B).b, enumC4015gi1A);
                    } else if (zB) {
                        c6962s41 = new C6962s41((AbstractC0663Ig0) AbstractC5507kS1.a(abstractC0663Ig0B).a, enumC4015gi1A);
                    } else {
                        C5768lq c5768lq = new C5768lq();
                        C7833we1 c7833we1 = new C7833we1(c5768lq);
                        if (!c5768lq.e()) {
                            try {
                                c6962s41 = c7833we1.j(c6962s41, null, 0);
                            } catch (C7643ve1 unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (c6962s41 == null) {
            return null;
        }
        return c6962s41.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC6689qe1 j(AbstractC6689qe1 abstractC6689qe1, InterfaceC5925me1 interfaceC5925me1, int i) throws C7643ve1 {
        char c;
        C7833we1 c7833we1;
        AbstractC0663Ig0 abstractC0663Ig0I = null;
        if (abstractC6689qe1 == null) {
            a(18);
            throw null;
        }
        AbstractC7452ue1 abstractC7452ue1 = this.a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(abstractC6689qe1) + "; substitution: " + h(abstractC7452ue1));
        }
        if (abstractC6689qe1.c()) {
            return abstractC6689qe1;
        }
        AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
        if (abstractC0663Ig0B instanceof InterfaceC0424Fe1) {
            InterfaceC0424Fe1 interfaceC0424Fe1 = (InterfaceC0424Fe1) abstractC0663Ig0B;
            AbstractC1521Tg1 abstractC1521Tg1T = interfaceC0424Fe1.t();
            AbstractC0663Ig0 abstractC0663Ig0K = interfaceC0424Fe1.k();
            AbstractC6689qe1 abstractC6689qe1J = j(new C6962s41(abstractC1521Tg1T, abstractC6689qe1.a()), interfaceC5925me1, i + 1);
            return abstractC6689qe1J.c() ? abstractC6689qe1J : new C6962s41(EZ1.n(abstractC6689qe1J.b().L(), i(abstractC0663Ig0K, abstractC6689qe1.a())), abstractC6689qe1J.a());
        }
        O90.f(abstractC0663Ig0B, "<this>");
        abstractC0663Ig0B.L();
        if (abstractC0663Ig0B.L() instanceof C6434pJ0) {
            return abstractC6689qe1;
        }
        AbstractC6689qe1 abstractC6689qe1D = abstractC7452ue1.d(abstractC0663Ig0B);
        if (abstractC6689qe1D == null) {
            abstractC6689qe1D = null;
        } else if (abstractC0663Ig0B.getAnnotations().g(AbstractC6390p41.y)) {
            InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC6689qe1D.b().E();
            if (interfaceC1200Pd1E instanceof C6548pv0) {
                AbstractC6689qe1 abstractC6689qe12 = ((C6548pv0) interfaceC1200Pd1E).a;
                EnumC4015gi1 enumC4015gi1A = abstractC6689qe12.a();
                if (c(abstractC6689qe1.a(), enumC4015gi1A) == 3) {
                    abstractC6689qe1D = new C6962s41(abstractC6689qe12.b());
                } else if (interfaceC5925me1 != null && c(interfaceC5925me1.O(), enumC4015gi1A) == 3) {
                    abstractC6689qe1D = new C6962s41(abstractC6689qe12.b());
                }
            }
        }
        EnumC4015gi1 enumC4015gi1A2 = abstractC6689qe1.a();
        if (abstractC6689qe1D == null && AbstractC4075h12.d(abstractC0663Ig0B)) {
            InterfaceC6391p5 interfaceC6391p5L = abstractC0663Ig0B.L();
            InterfaceC2088aC interfaceC2088aC = interfaceC6391p5L instanceof InterfaceC2088aC ? (InterfaceC2088aC) interfaceC6391p5L : null;
            if (!(interfaceC2088aC != null ? interfaceC2088aC.r() : false)) {
                AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC0663Ig0B.L();
                X01 x01 = abstractC3405dW.b;
                int i2 = i + 1;
                AbstractC6689qe1 abstractC6689qe1J2 = j(new C6962s41(x01, enumC4015gi1A2), interfaceC5925me1, i2);
                X01 x012 = abstractC3405dW.c;
                AbstractC6689qe1 abstractC6689qe1J3 = j(new C6962s41(x012, enumC4015gi1A2), interfaceC5925me1, i2);
                return (abstractC6689qe1J2.b() == x01 && abstractC6689qe1J3.b() == x012) ? abstractC6689qe1 : new C6962s41(NV1.t(AbstractC8198yZ1.a(abstractC6689qe1J2.b()), AbstractC8198yZ1.a(abstractC6689qe1J3.b())), abstractC6689qe1J2.a());
            }
        }
        if (AbstractC8408zg0.E(abstractC0663Ig0B) || S8.b(abstractC0663Ig0B)) {
            return abstractC6689qe1;
        }
        if (abstractC6689qe1D != null) {
            int iC = c(enumC4015gi1A2, abstractC6689qe1D.a());
            if (!(abstractC0663Ig0B.E() instanceof InterfaceC5959mq)) {
                int iX = AbstractC8235ym.x(iC);
                if (iX == 1) {
                    return new C6962s41(abstractC0663Ig0B.E().h().o(), EnumC4015gi1.e);
                }
                if (iX == 2) {
                    throw new C7643ve1("Out-projection in in-position");
                }
            }
            InterfaceC6391p5 interfaceC6391p5L2 = abstractC0663Ig0B.L();
            InterfaceC2088aC interfaceC2088aC2 = interfaceC6391p5L2 instanceof InterfaceC2088aC ? (InterfaceC2088aC) interfaceC6391p5L2 : null;
            if (interfaceC2088aC2 == null || !interfaceC2088aC2.r()) {
                interfaceC2088aC2 = null;
            }
            if (abstractC6689qe1D.c()) {
                return abstractC6689qe1D;
            }
            AbstractC0663Ig0 abstractC0663Ig0N = interfaceC2088aC2 != null ? interfaceC2088aC2.n(abstractC6689qe1D.b()) : AbstractC0112Be1.h(abstractC6689qe1D.b(), abstractC0663Ig0B.G());
            if (!abstractC0663Ig0B.getAnnotations().isEmpty()) {
                I5 i5C = abstractC7452ue1.c(abstractC0663Ig0B.getAnnotations());
                if (i5C == null) {
                    a(33);
                    throw null;
                }
                if (i5C.g(AbstractC6390p41.y)) {
                    i5C = new C7611vU(i5C, new LX(4));
                }
                abstractC0663Ig0N = CZ1.k(abstractC0663Ig0N, new K5(new I5[]{abstractC0663Ig0N.getAnnotations(), i5C}));
            }
            if (iC == 1) {
                enumC4015gi1A2 = b(enumC4015gi1A2, abstractC6689qe1D.a());
            }
            return new C6962s41(abstractC0663Ig0N, enumC4015gi1A2);
        }
        AbstractC0663Ig0 abstractC0663Ig0B2 = abstractC6689qe1.b();
        EnumC4015gi1 enumC4015gi1A3 = abstractC6689qe1.a();
        if (abstractC0663Ig0B2.E().a() instanceof InterfaceC5925me1) {
            return abstractC6689qe1;
        }
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0B2.L();
        C6562q c6562q = abstractC1521Tg1L instanceof C6562q ? (C6562q) abstractC1521Tg1L : null;
        X01 x013 = c6562q != null ? c6562q.c : null;
        if (x013 != null) {
            if ((abstractC7452ue1 instanceof C4288i80) && abstractC7452ue1.b()) {
                C4288i80 c4288i80 = (C4288i80) abstractC7452ue1;
                c7833we1 = new C7833we1(new C4288i80(c4288i80.b, c4288i80.c, false));
            } else {
                c7833we1 = this;
            }
            abstractC0663Ig0I = c7833we1.i(x013, EnumC4015gi1.c);
        }
        List parameters = abstractC0663Ig0B2.E().getParameters();
        List listU = abstractC0663Ig0B2.u();
        ArrayList arrayList = new ArrayList(parameters.size());
        boolean z = false;
        for (int i3 = 0; i3 < parameters.size(); i3++) {
            InterfaceC5925me1 interfaceC5925me12 = (InterfaceC5925me1) parameters.get(i3);
            AbstractC6689qe1 abstractC6689qe13 = (AbstractC6689qe1) listU.get(i3);
            AbstractC6689qe1 abstractC6689qe1J4 = j(abstractC6689qe13, interfaceC5925me12, i + 1);
            int iX2 = AbstractC8235ym.x(c(interfaceC5925me12.O(), abstractC6689qe1J4.a()));
            if (iX2 != 0) {
                if (iX2 != 1) {
                    c = 2;
                    if (iX2 == 2) {
                    }
                } else {
                    c = 2;
                }
                abstractC6689qe1J4 = AbstractC0112Be1.j(interfaceC5925me12);
            } else {
                c = 2;
                EnumC4015gi1 enumC4015gi1O = interfaceC5925me12.O();
                EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
                if (enumC4015gi1O != enumC4015gi1 && !abstractC6689qe1J4.c()) {
                    abstractC6689qe1J4 = new C6962s41(abstractC6689qe1J4.b(), enumC4015gi1);
                }
            }
            if (abstractC6689qe1J4 != abstractC6689qe13) {
                z = true;
            }
            arrayList.add(abstractC6689qe1J4);
        }
        if (z) {
            listU = arrayList;
        }
        I5 i5C2 = abstractC7452ue1.c(abstractC0663Ig0B2.getAnnotations());
        O90.f(listU, "newArguments");
        O90.f(i5C2, "newAnnotations");
        AbstractC0663Ig0 abstractC0663Ig0C = AbstractC8198yZ1.c(abstractC0663Ig0B2, listU, i5C2, 4);
        if ((abstractC0663Ig0C instanceof X01) && (abstractC0663Ig0I instanceof X01)) {
            abstractC0663Ig0C = KS1.d((X01) abstractC0663Ig0C, (X01) abstractC0663Ig0I);
        }
        return new C6962s41(abstractC0663Ig0C, enumC4015gi1A3);
    }
}
