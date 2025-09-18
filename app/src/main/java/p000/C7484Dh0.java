package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Dh0 */
/* loaded from: classes2.dex */
public final class C7484Dh0 extends AbstractC8160Qh0 {

    /* renamed from: n */
    public final InterfaceC6976us f2158n;

    /* renamed from: o */
    public final C9493gP0 f2159o;

    /* renamed from: p */
    public final boolean f2160p;

    /* renamed from: q */
    public final C8426Vk0 f2161q;

    /* renamed from: r */
    public final C8426Vk0 f2162r;

    /* renamed from: s */
    public final C8426Vk0 f2163s;

    /* renamed from: t */
    public final C8426Vk0 f2164t;

    /* renamed from: u */
    public final C8478Wk0 f2165u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7484Dh0(C6479nH c6479nH, InterfaceC6976us interfaceC6976us, C9493gP0 c9493gP0, boolean z, C7484Dh0 c7484Dh0) {
        super(c6479nH, c7484Dh0);
        O90.m5968f(c6479nH, "c");
        O90.m5968f(interfaceC6976us, "ownerDescriptor");
        O90.m5968f(c9493gP0, "jClass");
        this.f2158n = interfaceC6976us;
        this.f2159o = c9493gP0;
        this.f2160p = z;
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a;
        C7380Bh0 c7380Bh0 = new C7380Bh0(this, c6479nH);
        c8582Yk0.getClass();
        this.f2161q = new C8426Vk0(c8582Yk0, c7380Bh0);
        C7432Ch0 c7432Ch0 = new C7432Ch0(this, 1);
        c8582Yk0.getClass();
        this.f2162r = new C8426Vk0(c8582Yk0, c7432Ch0);
        C7380Bh0 c7380Bh02 = new C7380Bh0(c6479nH, this);
        c8582Yk0.getClass();
        this.f2163s = new C8426Vk0(c8582Yk0, c7380Bh02);
        C7432Ch0 c7432Ch02 = new C7432Ch0(this, 0);
        c8582Yk0.getClass();
        this.f2164t = new C8426Vk0(c8582Yk0, c7432Ch02);
        this.f2165u = c8582Yk0.m9351c(new C4027f1(this, 10, c6479nH));
    }

    /* renamed from: C */
    public static U01 m1752C(U01 u01, InterfaceC0036AZ interfaceC0036AZ, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return u01;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            U01 u012 = (U01) it.next();
            if (!u01.equals(u012) && u012.f1428C == null && m1754F(u012, interfaceC0036AZ)) {
                InterfaceC0036AZ interfaceC0036AZMo759a = u01.mo228N0().mo756C().mo759a();
                O90.m5965c(interfaceC0036AZMo759a);
                return (U01) interfaceC0036AZMo759a;
            }
        }
        return u01;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.U01 m1753D(p000.U01 r5) {
        /*
            java.util.List r0 = r5.mo1221f0()
            java.lang.String r1 = "getValueParameters(...)"
            p000.O90.m5967e(r0, r1)
            java.lang.Object r0 = p000.AbstractC7167xu.m25965K(r0)
            Wh1 r0 = (p000.C8473Wh1) r0
            r2 = 0
            if (r0 == 0) goto L7d
            r3 = r0
            fi1 r3 = (p000.AbstractC9404fi1) r3
            Ig0 r3 = r3.getType()
            Pd1 r3 = r3.mo3797E()
            Ns r3 = r3.mo1962a()
            if (r3 == 0) goto L36
            MX r3 = p000.AbstractC6940uI.m25155h(r3)
            boolean r4 = r3.m5390d()
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            KX r3 = r3.m5393g()
            goto L37
        L36:
            r3 = r2
        L37:
            KX r4 = p000.AbstractC10732q41.f40583g
            boolean r3 = p000.O90.m5963a(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            goto L7d
        L44:
            zZ r2 = r5.mo228N0()
            java.util.List r5 = r5.mo1221f0()
            p000.O90.m5967e(r5, r1)
            r1 = 1
            java.util.List r5 = p000.AbstractC7167xu.m25996x(r1, r5)
            zZ r5 = r2.mo760j(r5)
            fi1 r0 = (p000.AbstractC9404fi1) r0
            Ig0 r0 = r0.getType()
            java.util.List r0 = r0.mo3800u()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            qe1 r0 = (p000.AbstractC10804qe1) r0
            Ig0 r0 = r0.mo24038b()
            zZ r5 = r5.mo755A(r0)
            AZ r5 = r5.mo759a()
            U01 r5 = (p000.U01) r5
            if (r5 != 0) goto L7a
            goto L7c
        L7a:
            r5.f1446v = r1
        L7c:
            return r5
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7484Dh0.m1753D(U01):U01");
    }

    /* renamed from: F */
    public static boolean m1754F(InterfaceC0036AZ interfaceC0036AZ, InterfaceC0036AZ interfaceC0036AZ2) {
        int iM24815c = C11229tz0.f43434c.m25064n(interfaceC0036AZ2, interfaceC0036AZ, true).m24815c();
        AbstractC0852NX.m5768q(iM24815c, "getResult(...)");
        return iM24815c == 1 && !I22.m3733a(interfaceC0036AZ2, interfaceC0036AZ);
    }

    /* renamed from: G */
    public static boolean m1755G(U01 u01, U01 u012) {
        int i = AbstractC1683ak.f15660l;
        O90.m5968f(u01, "<this>");
        if (O90.m5963a(u01.getName().m7801b(), "removeAt") && O90.m5963a(AbstractC9210eB1.m17875b(u01), AbstractC9705i31.f28794g.f26523e)) {
            u012 = u012.mo229a();
        }
        O90.m5965c(u012);
        return m1754F(u012, u01);
    }

    /* renamed from: H */
    public static U01 m1756H(CE0 ce0, String str, InterfaceC6497nZ interfaceC6497nZ) {
        U01 u01;
        Iterator it = ((Iterable) interfaceC6497nZ.invoke(C8340Tt0.m7798e(str))).iterator();
        do {
            u01 = null;
            if (!it.hasNext()) {
                break;
            }
            U01 u012 = (U01) it.next();
            if (u012.mo1221f0().size() == 0) {
                C11604wv0 c11604wv0 = InterfaceC7846Kg0.f6251a;
                AbstractC7742Ig0 abstractC7742Ig0 = u012.f1432h;
                if (abstractC7742Ig0 == null ? false : c11604wv0.m25726b(abstractC7742Ig0, ce0.getType())) {
                    u01 = u012;
                }
            }
        } while (u01 == null);
        return u01;
    }

    /* renamed from: J */
    public static U01 m1757J(CE0 ce0, InterfaceC6497nZ interfaceC6497nZ) {
        U01 u01;
        AbstractC7742Ig0 abstractC7742Ig0;
        String strM7801b = ce0.getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        Iterator it = ((Iterable) interfaceC6497nZ.invoke(C8340Tt0.m7798e(AbstractC7994Nc0.m5785b(strM7801b)))).iterator();
        do {
            u01 = null;
            if (!it.hasNext()) {
                break;
            }
            U01 u012 = (U01) it.next();
            if (u012.mo1221f0().size() == 1 && (abstractC7742Ig0 = u012.f1432h) != null) {
                C8340Tt0 c8340Tt0 = AbstractC11955zg0.f46926e;
                if (AbstractC11955zg0.m26485D(abstractC7742Ig0, AbstractC10604p41.f39806d)) {
                    C11604wv0 c11604wv0 = InterfaceC7846Kg0.f6251a;
                    List listMo1221f0 = u012.mo1221f0();
                    O90.m5967e(listMo1221f0, "getValueParameters(...)");
                    if (c11604wv0.m25725a(((C8473Wh1) AbstractC7167xu.m25972R(listMo1221f0)).getType(), ce0.getType())) {
                        u01 = u012;
                    }
                }
            }
        } while (u01 == null);
        return u01;
    }

    /* renamed from: M */
    public static boolean m1758M(U01 u01, InterfaceC0036AZ interfaceC0036AZ) {
        String strM17874a = AbstractC9210eB1.m17874a(u01, 2);
        InterfaceC0036AZ interfaceC0036AZMo2089x1 = interfaceC0036AZ.mo2089x1();
        O90.m5967e(interfaceC0036AZMo2089x1, "getOriginal(...)");
        return strM17874a.equals(AbstractC9210eB1.m17874a(interfaceC0036AZMo2089x1, 2)) && !m1754F(u01, interfaceC0036AZ);
    }

    /* renamed from: v */
    public static final ArrayList m1759v(C7484Dh0 c7484Dh0, C8340Tt0 c8340Tt0) {
        Collection collectionMo3783c = ((InterfaceC0581JD) c7484Dh0.f9742e.invoke()).mo3783c(c8340Tt0);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collectionMo3783c));
        Iterator it = collectionMo3783c.iterator();
        while (it.hasNext()) {
            arrayList.add(c7484Dh0.m6746t((C10645pP0) it.next()));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static final ArrayList m1760w(C7484Dh0 c7484Dh0, C8340Tt0 c8340Tt0) {
        LinkedHashSet linkedHashSetM1765K = c7484Dh0.m1765K(c8340Tt0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM1765K) {
            U01 u01 = (U01) obj;
            O90.m5968f(u01, "<this>");
            if (DS1.m1691c(u01) == null && C1804bk.m10499a(u01) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final void m1761A(Set set, AbstractCollection abstractCollection, C11748y21 c11748y21, InterfaceC6497nZ interfaceC6497nZ) {
        U01 u01M1757J;
        JE0 je0M2350j;
        C9000cb0 c9000cb0;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CE0 ce0 = (CE0) it.next();
            if (m1763E(ce0, interfaceC6497nZ)) {
                U01 u01M1764I = m1764I(ce0, interfaceC6497nZ);
                O90.m5965c(u01M1764I);
                if (ce0.mo2087s0()) {
                    u01M1757J = m1757J(ce0, interfaceC6497nZ);
                    O90.m5965c(u01M1757J);
                } else {
                    u01M1757J = null;
                }
                if (u01M1757J != null) {
                    u01M1757J.mo115f();
                    u01M1764I.mo115f();
                }
                InterfaceC6976us interfaceC6976us = this.f2158n;
                O90.m5968f(interfaceC6976us, "ownerDescriptor");
                C9000cb0 c9000cb02 = new C9000cb0(interfaceC6976us, S20.f10539b, u01M1764I.mo115f(), u01M1764I.getVisibility(), u01M1757J != null, ce0.getName(), u01M1764I.mo422e(), null, 1, false, null);
                AbstractC7742Ig0 abstractC7742Ig0 = u01M1764I.f1432h;
                O90.m5965c(abstractC7742Ig0);
                C0779MN c0779mn = C0779MN.f7117a;
                c9000cb02.m2085F1(abstractC7742Ig0, c0779mn, mo1779p(), null, c0779mn);
                FE0 fe0M2349i = EZ1.m2349i(c9000cb02, u01M1764I.getAnnotations(), false, u01M1764I.mo422e());
                fe0M2349i.f119m = u01M1764I;
                fe0M2349i.m2559B1(c9000cb02.getType());
                if (u01M1757J != null) {
                    List listMo1221f0 = u01M1757J.mo1221f0();
                    O90.m5967e(listMo1221f0, "getValueParameters(...)");
                    C8473Wh1 c8473Wh1 = (C8473Wh1) AbstractC7167xu.m25957C(listMo1221f0);
                    if (c8473Wh1 == null) {
                        throw new AssertionError("No parameter found for " + u01M1757J);
                    }
                    je0M2350j = EZ1.m2350j(c9000cb02, u01M1757J.getAnnotations(), c8473Wh1.getAnnotations(), false, u01M1757J.getVisibility(), u01M1757J.mo422e());
                    je0M2350j.f119m = u01M1757J;
                } else {
                    je0M2350j = null;
                }
                c9000cb02.m2082C1(fe0M2349i, je0M2350j, null, null);
                c9000cb0 = c9000cb02;
            } else {
                c9000cb0 = null;
            }
            if (c9000cb0 != null) {
                abstractCollection.add(c9000cb0);
                if (c11748y21 != null) {
                    c11748y21.add(ce0);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: B */
    public final Collection m1762B() {
        boolean z = this.f2160p;
        InterfaceC6976us interfaceC6976us = this.f2158n;
        if (z) {
            Collection collectionMo5276b = interfaceC6976us.mo1439v().mo5276b();
            O90.m5967e(collectionMo5276b, "getSupertypes(...)");
            return collectionMo5276b;
        }
        ((C11604wv0) ((C9773ib0) this.f9739b.f38228b).f29358u).getClass();
        O90.m5968f(interfaceC6976us, "classDescriptor");
        Collection collectionMo5276b2 = interfaceC6976us.mo1439v().mo5276b();
        O90.m5967e(collectionMo5276b2, "getSupertypes(...)");
        return collectionMo5276b2;
    }

    /* renamed from: E */
    public final boolean m1763E(CE0 ce0, InterfaceC6497nZ interfaceC6497nZ) {
        if (H22.m3245a(ce0)) {
            return false;
        }
        U01 u01M1764I = m1764I(ce0, interfaceC6497nZ);
        U01 u01M1757J = m1757J(ce0, interfaceC6497nZ);
        if (u01M1764I == null) {
            return false;
        }
        if (ce0.mo2087s0()) {
            return u01M1757J != null && u01M1757J.mo115f() == u01M1764I.mo115f();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* renamed from: I */
    public final U01 m1764I(CE0 ce0, InterfaceC6497nZ interfaceC6497nZ) {
        C8340Tt0 c8340Tt0;
        FE0 fe0Mo1121c = ce0.mo1121c();
        String strM7801b = null;
        FE0 fe0 = fe0Mo1121c != null ? (FE0) DS1.m1691c(fe0Mo1121c) : null;
        if (fe0 != null) {
            AbstractC11955zg0.m26496z(fe0);
            InterfaceC7158xl interfaceC7158xlM25149b = AbstractC6940uI.m25149b(AbstractC6940uI.m25158k(fe0), C4214i.f28741z);
            if (interfaceC7158xlM25149b != null && (c8340Tt0 = (C8340Tt0) AbstractC1866ck.f17715a.get(AbstractC6940uI.m25154g(interfaceC7158xlM25149b))) != null) {
                strM7801b = c8340Tt0.m7801b();
            }
        }
        if (strM7801b != null && !DS1.m1693e(this.f2158n, fe0)) {
            return m1756H(ce0, strM7801b, interfaceC6497nZ);
        }
        String strM7801b2 = ce0.getName().m7801b();
        O90.m5967e(strM7801b2, "asString(...)");
        return m1756H(ce0, AbstractC7994Nc0.m5784a(strM7801b2), interfaceC6497nZ);
    }

    /* renamed from: K */
    public final LinkedHashSet m1765K(C8340Tt0 c8340Tt0) {
        Collection collectionM1762B = m1762B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionM1762B.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(linkedHashSet, ((AbstractC7742Ig0) it.next()).mo3799d0().mo1769a(c8340Tt0, EnumC11985zv0.f47098e));
        }
        return linkedHashSet;
    }

    /* renamed from: L */
    public final Set m1766L(C8340Tt0 c8340Tt0) {
        Collection collectionM1762B = m1762B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionM1762B.iterator();
        while (it.hasNext()) {
            Collection collectionMo1771e = ((AbstractC7742Ig0) it.next()).mo3799d0().mo1771e(c8340Tt0, EnumC11985zv0.f47098e);
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(collectionMo1771e));
            Iterator it2 = collectionMo1771e.iterator();
            while (it2.hasNext()) {
                arrayList2.add((CE0) it2.next());
            }
            AbstractC0246Du.m1920m(arrayList, arrayList2);
        }
        return AbstractC7167xu.m25987g0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1767N(p000.U01 r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7484Dh0.m1767N(U01):boolean");
    }

    /* renamed from: O */
    public final void m1768O(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        O90.m5968f((C4049fN) ((C9773ib0) this.f9739b.f38228b).f29351n, "<this>");
        O90.m5968f(this.f2158n, "scopeOwner");
    }

    @Override // p000.AbstractC8160Qh0, p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        m1768O(c8340Tt0, interfaceC7700Hl0);
        return super.mo1769a(c8340Tt0, interfaceC7700Hl0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        C8478Wk0 c8478Wk0;
        InterfaceC6976us interfaceC6976us;
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        m1768O(c8340Tt0, interfaceC7700Hl0);
        C7484Dh0 c7484Dh0 = (C7484Dh0) this.f9740c;
        return (c7484Dh0 == null || (c8478Wk0 = c7484Dh0.f2165u) == null || (interfaceC6976us = (InterfaceC6976us) c8478Wk0.invoke(c8340Tt0)) == null) ? (InterfaceC0873Ns) this.f2165u.invoke(c8340Tt0) : interfaceC6976us;
    }

    @Override // p000.AbstractC8160Qh0, p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        m1768O(c8340Tt0, enumC11985zv0);
        return super.mo1771e(c8340Tt0, enumC11985zv0);
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: h */
    public final Set mo1772h(C4233iI c4233iI, C9393fd0 c9393fd0) {
        O90.m5968f(c4233iI, "kindFilter");
        return AbstractC11433vZ0.m25452c((Set) this.f2162r.invoke(), ((Map) this.f2164t.invoke()).keySet());
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: i */
    public final Set mo1773i(C4233iI c4233iI, C9393fd0 c9393fd0) {
        O90.m5968f(c4233iI, "kindFilter");
        InterfaceC6976us interfaceC6976us = this.f2158n;
        Collection collectionMo5276b = interfaceC6976us.mo1439v().mo5276b();
        O90.m5967e(collectionMo5276b, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionMo5276b.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(linkedHashSet, ((AbstractC7742Ig0) it.next()).mo3799d0().mo6677b());
        }
        C8426Vk0 c8426Vk0 = this.f9742e;
        linkedHashSet.addAll(((InterfaceC0581JD) c8426Vk0.invoke()).mo3781a());
        linkedHashSet.addAll(((InterfaceC0581JD) c8426Vk0.invoke()).mo3785e());
        linkedHashSet.addAll(mo1772h(c4233iI, c9393fd0));
        C6479nH c6479nH = this.f9739b;
        linkedHashSet.addAll(((C1631Zv) ((H71) ((C9773ib0) c6479nH.f38228b).f29361x)).m9641e(c6479nH, interfaceC6976us));
        return linkedHashSet;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: j */
    public final void mo1774j(C8340Tt0 c8340Tt0, ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(c8340Tt0, "name");
        boolean zM18517g = this.f2159o.m18517g();
        InterfaceC6976us interfaceC6976us = this.f2158n;
        C6479nH c6479nH = this.f9739b;
        if (zM18517g) {
            C8426Vk0 c8426Vk0 = this.f9742e;
            if (((InterfaceC0581JD) c8426Vk0.invoke()).mo3782b(c8340Tt0) != null) {
                if (arrayList.isEmpty()) {
                    C11029sP0 c11029sP0Mo3782b = ((InterfaceC0581JD) c8426Vk0.invoke()).mo3782b(c8340Tt0);
                    O90.m5965c(c11029sP0Mo3782b);
                    C11703xh0 c11703xh0M9582e = AbstractC1618Zi.m9582e(c6479nH, c11029sP0Mo3782b);
                    C8340Tt0 c8340Tt0M23388c = c11029sP0Mo3782b.m23388c();
                    C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
                    C9261eb0 c9261eb0M18010N1 = C9261eb0.m18010N1(interfaceC6976us, c11703xh0M9582e, c8340Tt0M23388c, ((C10689pl0) c9773ib0.f29347j).m23868n(c11029sP0Mo3782b), true);
                    C11818yb0 c11818yb0M4530a = K22.m4530a(EnumC11952ze1.f46923b, false, false, null, 6);
                    AbstractC7742Ig0 abstractC7742Ig0M9139V = ((C8539Xo1) c6479nH.f38231e).m9139V(c11029sP0Mo3782b.m24737f(), c11818yb0M4530a);
                    C10937rh0 c10937rh0Mo1779p = mo1779p();
                    C0779MN c0779mn = C0779MN.f7117a;
                    EnumC10575os0.f39322a.getClass();
                    c9261eb0M18010N1.mo7857M1(null, c10937rh0Mo1779p, c0779mn, c0779mn, c0779mn, abstractC7742Ig0M9139V, C7512Dv0.m1930o(false, false, true), AbstractC7066wI.f44764e, null);
                    c9261eb0M18010N1.f26761E = 1;
                    ((C7408Bv0) c9773ib0.f29344g).getClass();
                    arrayList.add(c9261eb0M18010N1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((U01) it.next()).mo1221f0().isEmpty()) {
                            break;
                        }
                    }
                    C11029sP0 c11029sP0Mo3782b2 = ((InterfaceC0581JD) c8426Vk0.invoke()).mo3782b(c8340Tt0);
                    O90.m5965c(c11029sP0Mo3782b2);
                    C11703xh0 c11703xh0M9582e2 = AbstractC1618Zi.m9582e(c6479nH, c11029sP0Mo3782b2);
                    C8340Tt0 c8340Tt0M23388c2 = c11029sP0Mo3782b2.m23388c();
                    C9773ib0 c9773ib02 = (C9773ib0) c6479nH.f38228b;
                    C9261eb0 c9261eb0M18010N12 = C9261eb0.m18010N1(interfaceC6976us, c11703xh0M9582e2, c8340Tt0M23388c2, ((C10689pl0) c9773ib02.f29347j).m23868n(c11029sP0Mo3782b2), true);
                    C11818yb0 c11818yb0M4530a2 = K22.m4530a(EnumC11952ze1.f46923b, false, false, null, 6);
                    AbstractC7742Ig0 abstractC7742Ig0M9139V2 = ((C8539Xo1) c6479nH.f38231e).m9139V(c11029sP0Mo3782b2.m24737f(), c11818yb0M4530a2);
                    C10937rh0 c10937rh0Mo1779p2 = mo1779p();
                    C0779MN c0779mn2 = C0779MN.f7117a;
                    EnumC10575os0.f39322a.getClass();
                    c9261eb0M18010N12.mo7857M1(null, c10937rh0Mo1779p2, c0779mn2, c0779mn2, c0779mn2, abstractC7742Ig0M9139V2, C7512Dv0.m1930o(false, false, true), AbstractC7066wI.f44764e, null);
                    c9261eb0M18010N12.f26761E = 1;
                    ((C7408Bv0) c9773ib02.f29344g).getClass();
                    arrayList.add(c9261eb0M18010N12);
                }
            }
        }
        ((C1631Zv) ((H71) ((C9773ib0) c6479nH.f38228b).f29361x)).m9638b(c6479nH, interfaceC6976us, c8340Tt0, arrayList);
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: k */
    public final InterfaceC0581JD mo1775k() {
        return new C6913ts(this.f2159o, C9393fd0.f27284j);
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: m */
    public final void mo1776m(LinkedHashSet linkedHashSet, C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        LinkedHashSet linkedHashSetM1765K = m1765K(c8340Tt0);
        ArrayList arrayList = AbstractC9705i31.f28788a;
        if (!AbstractC9705i31.f28797j.contains(c8340Tt0)) {
            int i = C1804bk.f17126l;
            if (!C1804bk.m10500b(c8340Tt0)) {
                if (!linkedHashSetM1765K.isEmpty()) {
                    Iterator it = linkedHashSetM1765K.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC0036AZ) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetM1765K) {
                    if (m1767N((U01) obj)) {
                        arrayList2.add(obj);
                    }
                }
                m1784y(linkedHashSet, c8340Tt0, arrayList2, false);
                return;
            }
        }
        C11748y21 c11748y21 = new C11748y21();
        LinkedHashSet linkedHashSetM3087i = GZ1.m3087i(c8340Tt0, linkedHashSetM1765K, C0779MN.f7117a, this.f2158n, InterfaceC1845cP.f17466t0, ((C11604wv0) ((C9773ib0) this.f9739b.f38228b).f29358u).f45165d);
        m1785z(c8340Tt0, linkedHashSet, linkedHashSetM3087i, linkedHashSet, new C1367Vj(1, this, 5));
        m1785z(c8340Tt0, linkedHashSet, linkedHashSetM3087i, c11748y21, new C1367Vj(1, this, 6));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetM1765K) {
            if (m1767N((U01) obj2)) {
                arrayList3.add(obj2);
            }
        }
        m1784y(linkedHashSet, c8340Tt0, AbstractC7167xu.m25968N(arrayList3, c11748y21), true);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC8160Qh0
    /* renamed from: n */
    public final void mo1777n(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        LinkedHashSet linkedHashSet;
        Set setM25987g0;
        C10645pP0 c10645pP0;
        O90.m5968f(c8340Tt0, "name");
        boolean zIsAnnotation = this.f2159o.f27782a.isAnnotation();
        C6479nH c6479nH = this.f9739b;
        if (zIsAnnotation && (c10645pP0 = (C10645pP0) AbstractC7167xu.m25973S(((InterfaceC0581JD) this.f9742e.invoke()).mo3783c(c8340Tt0))) != null) {
            C7512Dv0 c7512Dv0 = EnumC10575os0.f39322a;
            C9645hb0 c9645hb0M18838G1 = C9645hb0.m18838G1(this.f2158n, AbstractC1618Zi.m9582e(c6479nH, c10645pP0), AbstractC10977s02.m24575a(c10645pP0.m23390e()), false, c10645pP0.m23388c(), ((C10689pl0) ((C9773ib0) c6479nH.f38228b).f29347j).m23868n(c10645pP0), false);
            FE0 fe0M2343c = EZ1.m2343c(c9645hb0M18838G1, S20.f10539b);
            c9645hb0M18838G1.m2082C1(fe0M2343c, null, null, null);
            O90.m5968f(c6479nH, "<this>");
            AbstractC7742Ig0 abstractC7742Ig0M6744l = AbstractC8160Qh0.m6744l(c10645pP0, new C6479nH((C9773ib0) c6479nH.f38228b, new C8875bc1(c6479nH, c9645hb0M18838G1, c10645pP0, 0), c6479nH.f38227a));
            C0779MN c0779mn = C0779MN.f7117a;
            c9645hb0M18838G1.m2085F1(abstractC7742Ig0M6744l, c0779mn, mo1779p(), null, c0779mn);
            fe0M2343c.f3093n = abstractC7742Ig0M6744l;
            arrayList.add(c9645hb0M18838G1);
        }
        Set setM1766L = m1766L(c8340Tt0);
        if (setM1766L.isEmpty()) {
            return;
        }
        C11748y21 c11748y21 = new C11748y21();
        C11748y21 c11748y212 = new C11748y21();
        m1761A(setM1766L, arrayList, c11748y21, new C7328Ah0(this, 0));
        Collection<?> collectionM1922o = AbstractC0246Du.m1922o(c11748y21);
        if (collectionM1922o.isEmpty()) {
            setM25987g0 = AbstractC7167xu.m25987g0(setM1766L);
        } else {
            if (collectionM1922o instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : setM1766L) {
                    if (!collectionM1922o.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(setM1766L);
                linkedHashSet.removeAll(collectionM1922o);
            }
            setM25987g0 = linkedHashSet;
        }
        m1761A(setM25987g0, c11748y212, null, new C7328Ah0(this, 1));
        LinkedHashSet linkedHashSetM25452c = AbstractC11433vZ0.m25452c(setM1766L, c11748y212);
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        arrayList.addAll(GZ1.m3087i(c8340Tt0, linkedHashSetM25452c, arrayList, this.f2158n, (S20) c9773ib0.f29343f, ((C11604wv0) c9773ib0.f29358u).f45165d));
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: o */
    public final Set mo1778o(C4233iI c4233iI) {
        O90.m5968f(c4233iI, "kindFilter");
        if (this.f2159o.f27782a.isAnnotation()) {
            return mo6677b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC0581JD) this.f9742e.invoke()).mo3786f());
        Collection collectionMo5276b = this.f2158n.mo1439v().mo5276b();
        O90.m5967e(collectionMo5276b, "getSupertypes(...)");
        Iterator it = collectionMo5276b.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(linkedHashSet, ((AbstractC7742Ig0) it.next()).mo3799d0().mo6678f());
        }
        return linkedHashSet;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: p */
    public final C10937rh0 mo1779p() {
        InterfaceC6976us interfaceC6976us = this.f2158n;
        if (interfaceC6976us != null) {
            int i = AbstractC6814sI.f42360a;
            return interfaceC6976us.mo1489a1();
        }
        AbstractC6814sI.m24689a(0);
        throw null;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: q */
    public final InterfaceC0140CD mo1780q() {
        return this.f2158n;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: r */
    public final boolean mo1781r(C9261eb0 c9261eb0) {
        if (this.f2159o.f27782a.isAnnotation()) {
            return false;
        }
        return m1767N(c9261eb0);
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: s */
    public final C7952Mh0 mo1782s(C10645pP0 c10645pP0, ArrayList arrayList, AbstractC7742Ig0 abstractC7742Ig0, List list) {
        O90.m5968f(c10645pP0, "method");
        ((C7408Bv0) ((C9773ib0) this.f9739b.f38228b).f29342e).getClass();
        if (this.f2158n != null) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return new C7952Mh0(abstractC7742Ig0, list, arrayList, listEmptyList);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p000.AbstractC8160Qh0
    public final String toString() {
        return "Lazy Java member scope for " + this.f2159o.m18513c();
    }

    /* renamed from: x */
    public final void m1783x(ArrayList arrayList, C8458Wa0 c8458Wa0, int i, C10645pP0 c10645pP0, AbstractC7742Ig0 abstractC7742Ig0, AbstractC7742Ig0 abstractC7742Ig02) {
        InterfaceC8146Qa0 c10133lP0;
        C7484Dh0 c7484Dh0;
        AbstractC8315Tg1 abstractC8315Tg1M789g;
        C0447H5 c0447h5 = S20.f10539b;
        C8340Tt0 c8340Tt0M23388c = c10645pP0.m23388c();
        if (abstractC7742Ig0 == null) {
            AbstractC7375Be1.m783a(2);
            throw null;
        }
        AbstractC8315Tg1 abstractC8315Tg1M789g2 = AbstractC7375Be1.m789g(abstractC7742Ig0, false);
        Object defaultValue = c10645pP0.f40051a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = VO0.f12536a;
            c10133lP0 = Enum.class.isAssignableFrom(cls) ? new C10133lP0(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new YO0(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new ZO0(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C9621hP0(null, (Class) defaultValue) : new C10389nP0(null, defaultValue);
        } else {
            c10133lP0 = null;
        }
        boolean z = c10133lP0 != null;
        if (abstractC7742Ig02 != null) {
            c7484Dh0 = this;
            abstractC8315Tg1M789g = AbstractC7375Be1.m789g(abstractC7742Ig02, false);
        } else {
            c7484Dh0 = this;
            abstractC8315Tg1M789g = null;
        }
        arrayList.add(new C8473Wh1(c8458Wa0, null, i, c0447h5, c8340Tt0M23388c, abstractC8315Tg1M789g2, z, false, false, abstractC8315Tg1M789g, ((C10689pl0) ((C9773ib0) c7484Dh0.f9739b.f38228b).f29347j).m23868n(c10645pP0)));
    }

    /* renamed from: y */
    public final void m1784y(LinkedHashSet linkedHashSet, C8340Tt0 c8340Tt0, ArrayList arrayList, boolean z) {
        C9773ib0 c9773ib0 = (C9773ib0) this.f9739b.f38228b;
        LinkedHashSet<U01> linkedHashSetM3087i = GZ1.m3087i(c8340Tt0, arrayList, linkedHashSet, this.f2158n, (S20) c9773ib0.f29343f, ((C11604wv0) c9773ib0.f29358u).f45165d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetM3087i);
            return;
        }
        ArrayList arrayListM25968N = AbstractC7167xu.m25968N(linkedHashSet, linkedHashSetM3087i);
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(linkedHashSetM3087i));
        for (U01 u01M1752C : linkedHashSetM3087i) {
            U01 u01 = (U01) DS1.m1692d(u01M1752C);
            if (u01 != null) {
                u01M1752C = m1752C(u01M1752C, u01, arrayListM25968N);
            }
            arrayList2.add(u01M1752C);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1785z(p000.C8340Tt0 r11, java.util.LinkedHashSet r12, java.util.LinkedHashSet r13, java.util.AbstractSet r14, p000.InterfaceC6497nZ r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7484Dh0.m1785z(Tt0, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, nZ):void");
    }
}
