package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class CZ1 {
    public static final C6962s41 a(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        return new C6962s41(abstractC0663Ig0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(defpackage.InterfaceC7492us r3, defpackage.C5806m12 r4) {
        /*
            java.lang.String r0 = "klass"
            defpackage.O90.f(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            defpackage.O90.f(r4, r0)
            CD r0 = r3.i()
            java.lang.String r1 = "getContainingDeclaration(...)"
            defpackage.O90.e(r0, r1)
            Tt0 r1 = r3.getName()
            if (r1 == 0) goto L20
            Tt0 r2 = defpackage.AbstractC5431k31.a
            boolean r2 = r1.b
            if (r2 != 0) goto L20
            goto L22
        L20:
            Tt0 r1 = defpackage.AbstractC5431k31.c
        L22:
            java.lang.String r1 = r1.c()
            boolean r2 = r0 instanceof defpackage.InterfaceC8465zz0
            if (r2 == 0) goto L56
            zz0 r0 = (defpackage.InterfaceC8465zz0) r0
            Az0 r0 = (defpackage.AbstractC0096Az0) r0
            KX r3 = r0.f
            boolean r4 = r3.d()
            if (r4 == 0) goto L37
            goto L55
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.b()
            r0 = 46
            r2 = 47
            java.lang.String r3 = defpackage.D51.l(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L55:
            return r1
        L56:
            boolean r2 = r0 instanceof defpackage.InterfaceC7492us
            if (r2 == 0) goto L5e
            r2 = r0
            us r2 = (defpackage.InterfaceC7492us) r2
            goto L5f
        L5e:
            r2 = 0
        L5f:
            if (r2 == 0) goto L7a
            java.lang.String r3 = b(r2, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CZ1.b(us, m12):java.lang.String");
    }

    public static final boolean c(AbstractC0663Ig0 abstractC0663Ig0, InterfaceC1200Pd1 interfaceC1200Pd1, Set set) {
        boolean zC;
        if (O90.a(abstractC0663Ig0.E(), interfaceC1200Pd1)) {
            return true;
        }
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        InterfaceC1165Os interfaceC1165Os = interfaceC1087NsA instanceof InterfaceC1165Os ? (InterfaceC1165Os) interfaceC1087NsA : null;
        List listO = interfaceC1165Os != null ? interfaceC1165Os.o() : null;
        Iterable iterableH0 = AbstractC8069xu.h0(abstractC0663Ig0.u());
        if (!(iterableH0 instanceof Collection) || !((Collection) iterableH0).isEmpty()) {
            Iterator it = iterableH0.iterator();
            do {
                C2309bM c2309bM = (C2309bM) it;
                if (c2309bM.b.hasNext()) {
                    C5255j80 c5255j80 = (C5255j80) c2309bM.next();
                    int i = c5255j80.a;
                    AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) c5255j80.b;
                    InterfaceC5925me1 interfaceC5925me1 = listO != null ? (InterfaceC5925me1) AbstractC8069xu.D(i, listO) : null;
                    if ((interfaceC5925me1 == null || set == null || !set.contains(interfaceC5925me1)) && !abstractC6689qe1.c()) {
                        AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
                        O90.e(abstractC0663Ig0B, "getType(...)");
                        zC = c(abstractC0663Ig0B, interfaceC1200Pd1, set);
                    } else {
                        zC = false;
                    }
                }
            } while (!zC);
            return true;
        }
        return false;
    }

    public static final C6962s41 d(AbstractC0663Ig0 abstractC0663Ig0, EnumC4015gi1 enumC4015gi1, InterfaceC5925me1 interfaceC5925me1) {
        O90.f(abstractC0663Ig0, "type");
        if ((interfaceC5925me1 != null ? interfaceC5925me1.O() : null) == enumC4015gi1) {
            enumC4015gi1 = EnumC4015gi1.c;
        }
        return new C6962s41(abstractC0663Ig0, enumC4015gi1);
    }

    public static final void e(AbstractC0663Ig0 abstractC0663Ig0, X01 x01, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        if (interfaceC1087NsA instanceof InterfaceC5925me1) {
            if (!O90.a(abstractC0663Ig0.E(), x01.E())) {
                linkedHashSet.add(interfaceC1087NsA);
                return;
            }
            for (AbstractC0663Ig0 abstractC0663Ig02 : ((InterfaceC5925me1) interfaceC1087NsA).getUpperBounds()) {
                O90.c(abstractC0663Ig02);
                e(abstractC0663Ig02, x01, linkedHashSet, set);
            }
            return;
        }
        InterfaceC1087Ns interfaceC1087NsA2 = abstractC0663Ig0.E().a();
        InterfaceC1165Os interfaceC1165Os = interfaceC1087NsA2 instanceof InterfaceC1165Os ? (InterfaceC1165Os) interfaceC1087NsA2 : null;
        List listO = interfaceC1165Os != null ? interfaceC1165Os.o() : null;
        int i = 0;
        for (AbstractC6689qe1 abstractC6689qe1 : abstractC0663Ig0.u()) {
            int i2 = i + 1;
            InterfaceC5925me1 interfaceC5925me1 = listO != null ? (InterfaceC5925me1) AbstractC8069xu.D(i, listO) : null;
            if ((interfaceC5925me1 == null || set == null || !set.contains(interfaceC5925me1)) && !abstractC6689qe1.c() && !AbstractC8069xu.v(linkedHashSet, abstractC6689qe1.b().E().a()) && !O90.a(abstractC6689qe1.b().E(), x01.E())) {
                AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
                O90.e(abstractC0663Ig0B, "getType(...)");
                e(abstractC0663Ig0B, x01, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final AbstractC8408zg0 f(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        AbstractC8408zg0 abstractC8408zg0H = abstractC0663Ig0.E().h();
        O90.e(abstractC8408zg0H, "getBuiltIns(...)");
        return abstractC8408zg0H;
    }

    public static final AbstractC0663Ig0 g(InterfaceC5925me1 interfaceC5925me1) {
        Object obj;
        List upperBounds = interfaceC5925me1.getUpperBounds();
        O90.e(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC5925me1.getUpperBounds();
        O90.e(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1087Ns interfaceC1087NsA = ((AbstractC0663Ig0) next).E().a();
            InterfaceC7492us interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
            if (interfaceC7492us != null && interfaceC7492us.l() != EnumC0152Bs.b && interfaceC7492us.l() != EnumC0152Bs.e) {
                obj = next;
                break;
            }
        }
        AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) obj;
        if (abstractC0663Ig0 != null) {
            return abstractC0663Ig0;
        }
        List upperBounds3 = interfaceC5925me1.getUpperBounds();
        O90.e(upperBounds3, "getUpperBounds(...)");
        Object objA = AbstractC8069xu.A(upperBounds3);
        O90.e(objA, "first(...)");
        return (AbstractC0663Ig0) objA;
    }

    public static final boolean h(InterfaceC5925me1 interfaceC5925me1, InterfaceC1200Pd1 interfaceC1200Pd1, Set set) {
        O90.f(interfaceC5925me1, "typeParameter");
        List upperBounds = interfaceC5925me1.getUpperBounds();
        O90.e(upperBounds, "getUpperBounds(...)");
        List<AbstractC0663Ig0> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AbstractC0663Ig0 abstractC0663Ig0 : list) {
            O90.c(abstractC0663Ig0);
            if (c(abstractC0663Ig0, interfaceC5925me1.m().E(), set) && (interfaceC1200Pd1 == null || O90.a(abstractC0663Ig0.E(), interfaceC1200Pd1))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean i(InterfaceC5925me1 interfaceC5925me1, InterfaceC1200Pd1 interfaceC1200Pd1, int i) {
        if ((i & 2) != 0) {
            interfaceC1200Pd1 = null;
        }
        return h(interfaceC5925me1, interfaceC1200Pd1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(defpackage.AbstractC0663Ig0 r22, defpackage.C5734le1 r23, defpackage.InterfaceC6481pZ r24) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CZ1.j(Ig0, le1, pZ):java.lang.Object");
    }

    public static final AbstractC0663Ig0 k(AbstractC0663Ig0 abstractC0663Ig0, I5 i5) {
        return (abstractC0663Ig0.getAnnotations().isEmpty() && i5.isEmpty()) ? abstractC0663Ig0 : abstractC0663Ig0.L().T(AbstractC3988gZ1.d(abstractC0663Ig0.B(), i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [Tg1] */
    public static final AbstractC1521Tg1 l(AbstractC0663Ig0 abstractC0663Ig0) {
        X01 x01D;
        O90.f(abstractC0663Ig0, "<this>");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (abstractC1521Tg1L instanceof AbstractC3405dW) {
            AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC1521Tg1L;
            X01 x01D2 = abstractC3405dW.b;
            if (!x01D2.E().getParameters().isEmpty() && x01D2.E().a() != null) {
                List parameters = x01D2.E().getParameters();
                O90.e(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C6962s41((InterfaceC5925me1) it.next()));
                }
                x01D2 = AbstractC8198yZ1.d(x01D2, arrayList, null, 2);
            }
            X01 x01D3 = abstractC3405dW.c;
            if (!x01D3.E().getParameters().isEmpty() && x01D3.E().a() != null) {
                List parameters2 = x01D3.E().getParameters();
                O90.e(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C6962s41((InterfaceC5925me1) it2.next()));
                }
                x01D3 = AbstractC8198yZ1.d(x01D3, arrayList2, null, 2);
            }
            x01D = NV1.t(x01D2, x01D3);
        } else {
            if (!(abstractC1521Tg1L instanceof X01)) {
                throw new C7074sg();
            }
            X01 x01 = (X01) abstractC1521Tg1L;
            boolean zIsEmpty = x01.E().getParameters().isEmpty();
            x01D = x01;
            if (!zIsEmpty) {
                InterfaceC1087Ns interfaceC1087NsA = x01.E().a();
                x01D = x01;
                if (interfaceC1087NsA != null) {
                    List parameters3 = x01.E().getParameters();
                    O90.e(parameters3, "getParameters(...)");
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(list3));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C6962s41((InterfaceC5925me1) it3.next()));
                    }
                    x01D = AbstractC8198yZ1.d(x01, arrayList3, null, 2);
                }
            }
        }
        return EZ1.l(x01D, abstractC1521Tg1L);
    }
}
