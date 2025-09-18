package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class CZ1 {
    /* renamed from: a */
    public static final C10988s41 m1225a(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        return new C10988s41(abstractC7742Ig0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m1226b(p000.InterfaceC6976us r3, p000.C10212m12 r4) {
        /*
            java.lang.String r0 = "klass"
            p000.O90.m5968f(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            p000.O90.m5968f(r4, r0)
            CD r0 = r3.mo423i()
            java.lang.String r1 = "getContainingDeclaration(...)"
            p000.O90.m5967e(r0, r1)
            Tt0 r1 = r3.getName()
            if (r1 == 0) goto L20
            Tt0 r2 = p000.AbstractC9961k31.f36274a
            boolean r2 = r1.f11578b
            if (r2 != 0) goto L20
            goto L22
        L20:
            Tt0 r1 = p000.AbstractC9961k31.f36276c
        L22:
            java.lang.String r1 = r1.m7802c()
            boolean r2 = r0 instanceof p000.InterfaceC11993zz0
            if (r2 == 0) goto L56
            zz0 r0 = (p000.InterfaceC11993zz0) r0
            Az0 r0 = (p000.AbstractC7364Az0) r0
            KX r3 = r0.f494f
            boolean r4 = r3.m4656d()
            if (r4 == 0) goto L37
            goto L55
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.m4654b()
            r0 = 46
            r2 = 47
            java.lang.String r3 = p000.D51.m1553l(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L55:
            return r1
        L56:
            boolean r2 = r0 instanceof p000.InterfaceC6976us
            if (r2 == 0) goto L5e
            r2 = r0
            us r2 = (p000.InterfaceC6976us) r2
            goto L5f
        L5e:
            r2 = 0
        L5f:
            if (r2 == 0) goto L7a
            java.lang.String r3 = m1226b(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L7a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.CZ1.m1226b(us, m12):java.lang.String");
    }

    /* renamed from: c */
    public static final boolean m1227c(AbstractC7742Ig0 abstractC7742Ig0, InterfaceC8101Pd1 interfaceC8101Pd1, Set set) {
        boolean zM1227c;
        if (O90.m5963a(abstractC7742Ig0.mo3797E(), interfaceC8101Pd1)) {
            return true;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        InterfaceC0936Os interfaceC0936Os = interfaceC0873NsMo1962a instanceof InterfaceC0936Os ? (InterfaceC0936Os) interfaceC0873NsMo1962a : null;
        List listMo1438o = interfaceC0936Os != null ? interfaceC0936Os.mo1438o() : null;
        Iterable iterableM25988h0 = AbstractC7167xu.m25988h0(abstractC7742Ig0.mo3800u());
        if (!(iterableM25988h0 instanceof Collection) || !((Collection) iterableM25988h0).isEmpty()) {
            Iterator it = iterableM25988h0.iterator();
            do {
                C1780bM c1780bM = (C1780bM) it;
                if (c1780bM.f16986b.hasNext()) {
                    C9843j80 c9843j80 = (C9843j80) c1780bM.next();
                    int i = c9843j80.f34932a;
                    AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) c9843j80.f34933b;
                    InterfaceC10292me1 interfaceC10292me1 = listMo1438o != null ? (InterfaceC10292me1) AbstractC7167xu.m25958D(i, listMo1438o) : null;
                    if ((interfaceC10292me1 == null || set == null || !set.contains(interfaceC10292me1)) && !abstractC10804qe1.mo24039c()) {
                        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
                        O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
                        zM1227c = m1227c(abstractC7742Ig0Mo24038b, interfaceC8101Pd1, set);
                    } else {
                        zM1227c = false;
                    }
                }
            } while (!zM1227c);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final C10988s41 m1228d(AbstractC7742Ig0 abstractC7742Ig0, EnumC9532gi1 enumC9532gi1, InterfaceC10292me1 interfaceC10292me1) {
        O90.m5968f(abstractC7742Ig0, "type");
        if ((interfaceC10292me1 != null ? interfaceC10292me1.mo22918O() : null) == enumC9532gi1) {
            enumC9532gi1 = EnumC9532gi1.f27947c;
        }
        return new C10988s41(abstractC7742Ig0, enumC9532gi1);
    }

    /* renamed from: e */
    public static final void m1229e(AbstractC7742Ig0 abstractC7742Ig0, X01 x01, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a instanceof InterfaceC10292me1) {
            if (!O90.m5963a(abstractC7742Ig0.mo3797E(), x01.mo3797E())) {
                linkedHashSet.add(interfaceC0873NsMo1962a);
                return;
            }
            for (AbstractC7742Ig0 abstractC7742Ig02 : ((InterfaceC10292me1) interfaceC0873NsMo1962a).getUpperBounds()) {
                O90.m5965c(abstractC7742Ig02);
                m1229e(abstractC7742Ig02, x01, linkedHashSet, set);
            }
            return;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a2 = abstractC7742Ig0.mo3797E().mo1962a();
        InterfaceC0936Os interfaceC0936Os = interfaceC0873NsMo1962a2 instanceof InterfaceC0936Os ? (InterfaceC0936Os) interfaceC0873NsMo1962a2 : null;
        List listMo1438o = interfaceC0936Os != null ? interfaceC0936Os.mo1438o() : null;
        int i = 0;
        for (AbstractC10804qe1 abstractC10804qe1 : abstractC7742Ig0.mo3800u()) {
            int i2 = i + 1;
            InterfaceC10292me1 interfaceC10292me1 = listMo1438o != null ? (InterfaceC10292me1) AbstractC7167xu.m25958D(i, listMo1438o) : null;
            if ((interfaceC10292me1 == null || set == null || !set.contains(interfaceC10292me1)) && !abstractC10804qe1.mo24039c() && !AbstractC7167xu.m25994v(linkedHashSet, abstractC10804qe1.mo24038b().mo3797E().mo1962a()) && !O90.m5963a(abstractC10804qe1.mo24038b().mo3797E(), x01.mo3797E())) {
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
                m1229e(abstractC7742Ig0Mo24038b, x01, linkedHashSet, set);
            }
            i = i2;
        }
    }

    /* renamed from: f */
    public static final AbstractC11955zg0 m1230f(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        AbstractC11955zg0 abstractC11955zg0Mo1964h = abstractC7742Ig0.mo3797E().mo1964h();
        O90.m5967e(abstractC11955zg0Mo1964h, "getBuiltIns(...)");
        return abstractC11955zg0Mo1964h;
    }

    /* renamed from: g */
    public static final AbstractC7742Ig0 m1231g(InterfaceC10292me1 interfaceC10292me1) {
        Object obj;
        List upperBounds = interfaceC10292me1.getUpperBounds();
        O90.m5967e(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC10292me1.getUpperBounds();
        O90.m5967e(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC0873Ns interfaceC0873NsMo1962a = ((AbstractC7742Ig0) next).mo3797E().mo1962a();
            InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
            if (interfaceC6976us != null && interfaceC6976us.mo1436l() != EnumC0118Bs.f1061b && interfaceC6976us.mo1436l() != EnumC0118Bs.f1064e) {
                obj = next;
                break;
            }
        }
        AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) obj;
        if (abstractC7742Ig0 != null) {
            return abstractC7742Ig0;
        }
        List upperBounds3 = interfaceC10292me1.getUpperBounds();
        O90.m5967e(upperBounds3, "getUpperBounds(...)");
        Object objM25955A = AbstractC7167xu.m25955A(upperBounds3);
        O90.m5967e(objM25955A, "first(...)");
        return (AbstractC7742Ig0) objM25955A;
    }

    /* renamed from: h */
    public static final boolean m1232h(InterfaceC10292me1 interfaceC10292me1, InterfaceC8101Pd1 interfaceC8101Pd1, Set set) {
        O90.m5968f(interfaceC10292me1, "typeParameter");
        List upperBounds = interfaceC10292me1.getUpperBounds();
        O90.m5967e(upperBounds, "getUpperBounds(...)");
        List<AbstractC7742Ig0> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AbstractC7742Ig0 abstractC7742Ig0 : list) {
            O90.m5965c(abstractC7742Ig0);
            if (m1227c(abstractC7742Ig0, interfaceC10292me1.mo1492m().mo3797E(), set) && (interfaceC8101Pd1 == null || O90.m5963a(abstractC7742Ig0.mo3797E(), interfaceC8101Pd1))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m1233i(InterfaceC10292me1 interfaceC10292me1, InterfaceC8101Pd1 interfaceC8101Pd1, int i) {
        if ((i & 2) != 0) {
            interfaceC8101Pd1 = null;
        }
        return m1232h(interfaceC10292me1, interfaceC8101Pd1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0316  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1234j(p000.AbstractC7742Ig0 r22, p000.C10164le1 r23, p000.InterfaceC6625pZ r24) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.CZ1.m1234j(Ig0, le1, pZ):java.lang.Object");
    }

    /* renamed from: k */
    public static final AbstractC7742Ig0 m1235k(AbstractC7742Ig0 abstractC7742Ig0, InterfaceC0510I5 interfaceC0510I5) {
        return (abstractC7742Ig0.getAnnotations().isEmpty() && interfaceC0510I5.isEmpty()) ? abstractC7742Ig0 : abstractC7742Ig0.mo3963L().mo252T(AbstractC9514gZ1.m18583d(abstractC7742Ig0.mo3796B(), interfaceC0510I5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [Tg1] */
    /* renamed from: l */
    public static final AbstractC8315Tg1 m1236l(AbstractC7742Ig0 abstractC7742Ig0) {
        X01 x01M26173d;
        O90.m5968f(abstractC7742Ig0, "<this>");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) {
            AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC8315Tg1Mo3963L;
            X01 x01M26173d2 = abstractC3933dW.f26126b;
            if (!x01M26173d2.mo3797E().getParameters().isEmpty() && x01M26173d2.mo3797E().mo1962a() != null) {
                List parameters = x01M26173d2.mo3797E().getParameters();
                O90.m5967e(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C10988s41((InterfaceC10292me1) it.next()));
                }
                x01M26173d2 = AbstractC11815yZ1.m26173d(x01M26173d2, arrayList, null, 2);
            }
            X01 x01M26173d3 = abstractC3933dW.f26127c;
            if (!x01M26173d3.mo3797E().getParameters().isEmpty() && x01M26173d3.mo3797E().mo1962a() != null) {
                List parameters2 = x01M26173d3.mo3797E().getParameters();
                O90.m5967e(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C10988s41((InterfaceC10292me1) it2.next()));
                }
                x01M26173d3 = AbstractC11815yZ1.m26173d(x01M26173d3, arrayList2, null, 2);
            }
            x01M26173d = NV1.m5738t(x01M26173d2, x01M26173d3);
        } else {
            if (!(abstractC8315Tg1Mo3963L instanceof X01)) {
                throw new C6838sg();
            }
            X01 x01 = (X01) abstractC8315Tg1Mo3963L;
            boolean zIsEmpty = x01.mo3797E().getParameters().isEmpty();
            x01M26173d = x01;
            if (!zIsEmpty) {
                InterfaceC0873Ns interfaceC0873NsMo1962a = x01.mo3797E().mo1962a();
                x01M26173d = x01;
                if (interfaceC0873NsMo1962a != null) {
                    List parameters3 = x01.mo3797E().getParameters();
                    O90.m5967e(parameters3, "getParameters(...)");
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(list3));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C10988s41((InterfaceC10292me1) it3.next()));
                    }
                    x01M26173d = AbstractC11815yZ1.m26173d(x01, arrayList3, null, 2);
                }
            }
        }
        return EZ1.m2352l(x01M26173d, abstractC8315Tg1Mo3963L);
    }
}
