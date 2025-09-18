package defpackage;

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
public final class C0276Dh0 extends AbstractC1289Qh0 {
    public final InterfaceC7492us n;
    public final C3957gP0 o;
    public final boolean p;
    public final C1688Vk0 q;
    public final C1688Vk0 r;
    public final C1688Vk0 s;
    public final C1688Vk0 t;
    public final C1766Wk0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276Dh0(C6045nH c6045nH, InterfaceC7492us interfaceC7492us, C3957gP0 c3957gP0, boolean z, C0276Dh0 c0276Dh0) {
        super(c6045nH, c0276Dh0);
        O90.f(c6045nH, "c");
        O90.f(interfaceC7492us, "ownerDescriptor");
        O90.f(c3957gP0, "jClass");
        this.n = interfaceC7492us;
        this.o = c3957gP0;
        this.p = z;
        C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) c6045nH.b).a;
        C0120Bh0 c0120Bh0 = new C0120Bh0(this, c6045nH);
        c1922Yk0.getClass();
        this.q = new C1688Vk0(c1922Yk0, c0120Bh0);
        C0198Ch0 c0198Ch0 = new C0198Ch0(this, 1);
        c1922Yk0.getClass();
        this.r = new C1688Vk0(c1922Yk0, c0198Ch0);
        C0120Bh0 c0120Bh02 = new C0120Bh0(c6045nH, this);
        c1922Yk0.getClass();
        this.s = new C1688Vk0(c1922Yk0, c0120Bh02);
        C0198Ch0 c0198Ch02 = new C0198Ch0(this, 0);
        c1922Yk0.getClass();
        this.t = new C1688Vk0(c1922Yk0, c0198Ch02);
        this.u = c1922Yk0.c(new C3690f1(this, 10, c6045nH));
    }

    public static U01 C(U01 u01, AZ az, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return u01;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            U01 u012 = (U01) it.next();
            if (!u01.equals(u012) && u012.C == null && F(u012, az)) {
                AZ azA = u01.N0().C().a();
                O90.c(azA);
                return (U01) azA;
            }
        }
        return u01;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.U01 D(defpackage.U01 r5) {
        /*
            java.util.List r0 = r5.f0()
            java.lang.String r1 = "getValueParameters(...)"
            defpackage.O90.e(r0, r1)
            java.lang.Object r0 = defpackage.AbstractC8069xu.K(r0)
            Wh1 r0 = (defpackage.C1758Wh1) r0
            r2 = 0
            if (r0 == 0) goto L7d
            r3 = r0
            fi1 r3 = (defpackage.AbstractC3824fi1) r3
            Ig0 r3 = r3.getType()
            Pd1 r3 = r3.E()
            Ns r3 = r3.a()
            if (r3 == 0) goto L36
            MX r3 = defpackage.AbstractC7384uI.h(r3)
            boolean r4 = r3.d()
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            KX r3 = r3.g()
            goto L37
        L36:
            r3 = r2
        L37:
            KX r4 = defpackage.AbstractC6581q41.g
            boolean r3 = defpackage.O90.a(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            goto L7d
        L44:
            zZ r2 = r5.N0()
            java.util.List r5 = r5.f0()
            defpackage.O90.e(r5, r1)
            r1 = 1
            java.util.List r5 = defpackage.AbstractC8069xu.x(r1, r5)
            zZ r5 = r2.j(r5)
            fi1 r0 = (defpackage.AbstractC3824fi1) r0
            Ig0 r0 = r0.getType()
            java.util.List r0 = r0.u()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            qe1 r0 = (defpackage.AbstractC6689qe1) r0
            Ig0 r0 = r0.b()
            zZ r5 = r5.A(r0)
            AZ r5 = r5.a()
            U01 r5 = (defpackage.U01) r5
            if (r5 != 0) goto L7a
            goto L7c
        L7a:
            r5.v = r1
        L7c:
            return r5
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0276Dh0.D(U01):U01");
    }

    public static boolean F(AZ az, AZ az2) {
        int iC = C7323tz0.c.n(az2, az, true).c();
        NX.q(iC, "getResult(...)");
        return iC == 1 && !I22.a(az2, az);
    }

    public static boolean G(U01 u01, U01 u012) {
        int i = AbstractC2190ak.l;
        O90.f(u01, "<this>");
        if (O90.a(u01.getName().b(), "removeAt") && O90.a(AbstractC3534eB1.b(u01), AbstractC4273i31.g.e)) {
            u012 = u012.a();
        }
        O90.c(u012);
        return F(u012, u01);
    }

    public static U01 H(CE0 ce0, String str, InterfaceC6099nZ interfaceC6099nZ) {
        U01 u01;
        Iterator it = ((Iterable) interfaceC6099nZ.invoke(C1559Tt0.e(str))).iterator();
        do {
            u01 = null;
            if (!it.hasNext()) {
                break;
            }
            U01 u012 = (U01) it.next();
            if (u012.f0().size() == 0) {
                C7883wv0 c7883wv0 = InterfaceC0819Kg0.a;
                AbstractC0663Ig0 abstractC0663Ig0 = u012.h;
                if (abstractC0663Ig0 == null ? false : c7883wv0.b(abstractC0663Ig0, ce0.getType())) {
                    u01 = u012;
                }
            }
        } while (u01 == null);
        return u01;
    }

    public static U01 J(CE0 ce0, InterfaceC6099nZ interfaceC6099nZ) {
        U01 u01;
        AbstractC0663Ig0 abstractC0663Ig0;
        String strB = ce0.getName().b();
        O90.e(strB, "asString(...)");
        Iterator it = ((Iterable) interfaceC6099nZ.invoke(C1559Tt0.e(AbstractC1040Nc0.b(strB)))).iterator();
        do {
            u01 = null;
            if (!it.hasNext()) {
                break;
            }
            U01 u012 = (U01) it.next();
            if (u012.f0().size() == 1 && (abstractC0663Ig0 = u012.h) != null) {
                C1559Tt0 c1559Tt0 = AbstractC8408zg0.e;
                if (AbstractC8408zg0.D(abstractC0663Ig0, AbstractC6390p41.d)) {
                    C7883wv0 c7883wv0 = InterfaceC0819Kg0.a;
                    List listF0 = u012.f0();
                    O90.e(listF0, "getValueParameters(...)");
                    if (c7883wv0.a(((C1758Wh1) AbstractC8069xu.R(listF0)).getType(), ce0.getType())) {
                        u01 = u012;
                    }
                }
            }
        } while (u01 == null);
        return u01;
    }

    public static boolean M(U01 u01, AZ az) {
        String strA = AbstractC3534eB1.a(u01, 2);
        AZ azX1 = az.x1();
        O90.e(azX1, "getOriginal(...)");
        return strA.equals(AbstractC3534eB1.a(azX1, 2)) && !F(u01, az);
    }

    public static final ArrayList v(C0276Dh0 c0276Dh0, C1559Tt0 c1559Tt0) {
        Collection collectionC = ((JD) c0276Dh0.e.invoke()).c(c1559Tt0);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collectionC));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(c0276Dh0.t((C6452pP0) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(C0276Dh0 c0276Dh0, C1559Tt0 c1559Tt0) {
        LinkedHashSet linkedHashSetK = c0276Dh0.K(c1559Tt0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            U01 u01 = (U01) obj;
            O90.f(u01, "<this>");
            if (DS1.c(u01) == null && C2381bk.a(u01) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, C8098y21 c8098y21, InterfaceC6099nZ interfaceC6099nZ) {
        U01 u01J;
        JE0 je0J;
        C2545cb0 c2545cb0;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CE0 ce0 = (CE0) it.next();
            if (E(ce0, interfaceC6099nZ)) {
                U01 u01I = I(ce0, interfaceC6099nZ);
                O90.c(u01I);
                if (ce0.s0()) {
                    u01J = J(ce0, interfaceC6099nZ);
                    O90.c(u01J);
                } else {
                    u01J = null;
                }
                if (u01J != null) {
                    u01J.f();
                    u01I.f();
                }
                InterfaceC7492us interfaceC7492us = this.n;
                O90.f(interfaceC7492us, "ownerDescriptor");
                C2545cb0 c2545cb02 = new C2545cb0(interfaceC7492us, S20.b, u01I.f(), u01I.getVisibility(), u01J != null, ce0.getName(), u01I.e(), null, 1, false, null);
                AbstractC0663Ig0 abstractC0663Ig0 = u01I.h;
                O90.c(abstractC0663Ig0);
                MN mn = MN.a;
                c2545cb02.F1(abstractC0663Ig0, mn, p(), null, mn);
                FE0 fe0I = EZ1.i(c2545cb02, u01I.getAnnotations(), false, u01I.e());
                fe0I.m = u01I;
                fe0I.B1(c2545cb02.getType());
                if (u01J != null) {
                    List listF0 = u01J.f0();
                    O90.e(listF0, "getValueParameters(...)");
                    C1758Wh1 c1758Wh1 = (C1758Wh1) AbstractC8069xu.C(listF0);
                    if (c1758Wh1 == null) {
                        throw new AssertionError("No parameter found for " + u01J);
                    }
                    je0J = EZ1.j(c2545cb02, u01J.getAnnotations(), c1758Wh1.getAnnotations(), false, u01J.getVisibility(), u01J.e());
                    je0J.m = u01J;
                } else {
                    je0J = null;
                }
                c2545cb02.C1(fe0I, je0J, null, null);
                c2545cb0 = c2545cb02;
            } else {
                c2545cb0 = null;
            }
            if (c2545cb0 != null) {
                abstractCollection.add(c2545cb0);
                if (c8098y21 != null) {
                    c8098y21.add(ce0);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z = this.p;
        InterfaceC7492us interfaceC7492us = this.n;
        if (z) {
            Collection collectionB = interfaceC7492us.v().b();
            O90.e(collectionB, "getSupertypes(...)");
            return collectionB;
        }
        ((C7883wv0) ((C4375ib0) this.b.b).u).getClass();
        O90.f(interfaceC7492us, "classDescriptor");
        Collection collectionB2 = interfaceC7492us.v().b();
        O90.e(collectionB2, "getSupertypes(...)");
        return collectionB2;
    }

    public final boolean E(CE0 ce0, InterfaceC6099nZ interfaceC6099nZ) {
        if (H22.a(ce0)) {
            return false;
        }
        U01 u01I = I(ce0, interfaceC6099nZ);
        U01 u01J = J(ce0, interfaceC6099nZ);
        if (u01I == null) {
            return false;
        }
        if (ce0.s0()) {
            return u01J != null && u01J.f() == u01I.f();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final U01 I(CE0 ce0, InterfaceC6099nZ interfaceC6099nZ) {
        C1559Tt0 c1559Tt0;
        FE0 fe0C = ce0.c();
        String strB = null;
        FE0 fe0 = fe0C != null ? (FE0) DS1.c(fe0C) : null;
        if (fe0 != null) {
            AbstractC8408zg0.z(fe0);
            InterfaceC8042xl interfaceC8042xlB = AbstractC7384uI.b(AbstractC7384uI.k(fe0), C4258i.z);
            if (interfaceC8042xlB != null && (c1559Tt0 = (C1559Tt0) AbstractC2571ck.a.get(AbstractC7384uI.g(interfaceC8042xlB))) != null) {
                strB = c1559Tt0.b();
            }
        }
        if (strB != null && !DS1.e(this.n, fe0)) {
            return H(ce0, strB, interfaceC6099nZ);
        }
        String strB2 = ce0.getName().b();
        O90.e(strB2, "asString(...)");
        return H(ce0, AbstractC1040Nc0.a(strB2), interfaceC6099nZ);
    }

    public final LinkedHashSet K(C1559Tt0 c1559Tt0) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(linkedHashSet, ((AbstractC0663Ig0) it.next()).d0().a(c1559Tt0, EnumC8453zv0.e));
        }
        return linkedHashSet;
    }

    public final Set L(C1559Tt0 c1559Tt0) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionE = ((AbstractC0663Ig0) it.next()).d0().e(c1559Tt0, EnumC8453zv0.e);
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(collectionE));
            Iterator it2 = collectionE.iterator();
            while (it2.hasNext()) {
                arrayList2.add((CE0) it2.next());
            }
            AbstractC0314Du.m(arrayList, arrayList2);
        }
        return AbstractC8069xu.g0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(defpackage.U01 r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0276Dh0.N(U01):boolean");
    }

    public final void O(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        O90.f((C3759fN) ((C4375ib0) this.b.b).n, "<this>");
        O90.f(this.n, "scopeOwner");
    }

    @Override // defpackage.AbstractC1289Qh0, defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O(c1559Tt0, interfaceC0600Hl0);
        return super.a(c1559Tt0, interfaceC0600Hl0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        C1766Wk0 c1766Wk0;
        InterfaceC7492us interfaceC7492us;
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        O(c1559Tt0, interfaceC0600Hl0);
        C0276Dh0 c0276Dh0 = (C0276Dh0) this.c;
        return (c0276Dh0 == null || (c1766Wk0 = c0276Dh0.u) == null || (interfaceC7492us = (InterfaceC7492us) c1766Wk0.invoke(c1559Tt0)) == null) ? (InterfaceC1087Ns) this.u.invoke(c1559Tt0) : interfaceC7492us;
    }

    @Override // defpackage.AbstractC1289Qh0, defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        O(c1559Tt0, enumC8453zv0);
        return super.e(c1559Tt0, enumC8453zv0);
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set h(C4317iI c4317iI, C3808fd0 c3808fd0) {
        O90.f(c4317iI, "kindFilter");
        return AbstractC7627vZ0.c((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set i(C4317iI c4317iI, C3808fd0 c3808fd0) {
        O90.f(c4317iI, "kindFilter");
        InterfaceC7492us interfaceC7492us = this.n;
        Collection collectionB = interfaceC7492us.v().b();
        O90.e(collectionB, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(linkedHashSet, ((AbstractC0663Ig0) it.next()).d0().b());
        }
        C1688Vk0 c1688Vk0 = this.e;
        linkedHashSet.addAll(((JD) c1688Vk0.invoke()).a());
        linkedHashSet.addAll(((JD) c1688Vk0.invoke()).e());
        linkedHashSet.addAll(h(c4317iI, c3808fd0));
        C6045nH c6045nH = this.b;
        linkedHashSet.addAll(((C2032Zv) ((H71) ((C4375ib0) c6045nH.b).x)).e(c6045nH, interfaceC7492us));
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final void j(C1559Tt0 c1559Tt0, ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.f(c1559Tt0, "name");
        boolean zG = this.o.g();
        InterfaceC7492us interfaceC7492us = this.n;
        C6045nH c6045nH = this.b;
        if (zG) {
            C1688Vk0 c1688Vk0 = this.e;
            if (((JD) c1688Vk0.invoke()).b(c1559Tt0) != null) {
                if (arrayList.isEmpty()) {
                    C7024sP0 c7024sP0B = ((JD) c1688Vk0.invoke()).b(c1559Tt0);
                    O90.c(c7024sP0B);
                    C8031xh0 c8031xh0E = AbstractC1993Zi.e(c6045nH, c7024sP0B);
                    C1559Tt0 c1559Tt0C = c7024sP0B.c();
                    C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
                    C3611eb0 c3611eb0N1 = C3611eb0.N1(interfaceC7492us, c8031xh0E, c1559Tt0C, ((C6518pl0) c4375ib0.j).n(c7024sP0B), true);
                    C8203yb0 c8203yb0A = K22.a(EnumC8403ze1.b, false, false, null, 6);
                    AbstractC0663Ig0 abstractC0663Ig0V = ((C1857Xo1) c6045nH.e).V(c7024sP0B.f(), c8203yb0A);
                    C6887rh0 c6887rh0P = p();
                    MN mn = MN.a;
                    EnumC6348os0.a.getClass();
                    c3611eb0N1.M1(null, c6887rh0P, mn, mn, mn, abstractC0663Ig0V, C0318Dv0.o(false, false, true), AbstractC7765wI.e, null);
                    c3611eb0N1.E = 1;
                    ((C0162Bv0) c4375ib0.g).getClass();
                    arrayList.add(c3611eb0N1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((U01) it.next()).f0().isEmpty()) {
                            break;
                        }
                    }
                    C7024sP0 c7024sP0B2 = ((JD) c1688Vk0.invoke()).b(c1559Tt0);
                    O90.c(c7024sP0B2);
                    C8031xh0 c8031xh0E2 = AbstractC1993Zi.e(c6045nH, c7024sP0B2);
                    C1559Tt0 c1559Tt0C2 = c7024sP0B2.c();
                    C4375ib0 c4375ib02 = (C4375ib0) c6045nH.b;
                    C3611eb0 c3611eb0N12 = C3611eb0.N1(interfaceC7492us, c8031xh0E2, c1559Tt0C2, ((C6518pl0) c4375ib02.j).n(c7024sP0B2), true);
                    C8203yb0 c8203yb0A2 = K22.a(EnumC8403ze1.b, false, false, null, 6);
                    AbstractC0663Ig0 abstractC0663Ig0V2 = ((C1857Xo1) c6045nH.e).V(c7024sP0B2.f(), c8203yb0A2);
                    C6887rh0 c6887rh0P2 = p();
                    MN mn2 = MN.a;
                    EnumC6348os0.a.getClass();
                    c3611eb0N12.M1(null, c6887rh0P2, mn2, mn2, mn2, abstractC0663Ig0V2, C0318Dv0.o(false, false, true), AbstractC7765wI.e, null);
                    c3611eb0N12.E = 1;
                    ((C0162Bv0) c4375ib02.g).getClass();
                    arrayList.add(c3611eb0N12);
                }
            }
        }
        ((C2032Zv) ((H71) ((C4375ib0) c6045nH.b).x)).b(c6045nH, interfaceC7492us, c1559Tt0, arrayList);
    }

    @Override // defpackage.AbstractC1289Qh0
    public final JD k() {
        return new C7301ts(this.o, C3808fd0.j);
    }

    @Override // defpackage.AbstractC1289Qh0
    public final void m(LinkedHashSet linkedHashSet, C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        LinkedHashSet linkedHashSetK = K(c1559Tt0);
        ArrayList arrayList = AbstractC4273i31.a;
        if (!AbstractC4273i31.j.contains(c1559Tt0)) {
            int i = C2381bk.l;
            if (!C2381bk.b(c1559Tt0)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (it.hasNext()) {
                        if (((AZ) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((U01) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, c1559Tt0, arrayList2, false);
                return;
            }
        }
        C8098y21 c8098y21 = new C8098y21();
        LinkedHashSet linkedHashSetI = GZ1.i(c1559Tt0, linkedHashSetK, MN.a, this.n, InterfaceC2508cP.t0, ((C7883wv0) ((C4375ib0) this.b.b).u).d);
        z(c1559Tt0, linkedHashSet, linkedHashSetI, linkedHashSet, new C1684Vj(1, this, 5));
        z(c1559Tt0, linkedHashSet, linkedHashSetI, c8098y21, new C1684Vj(1, this, 6));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((U01) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, c1559Tt0, AbstractC8069xu.N(arrayList3, c8098y21), true);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC1289Qh0
    public final void n(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        LinkedHashSet linkedHashSet;
        Set setG0;
        C6452pP0 c6452pP0;
        O90.f(c1559Tt0, "name");
        boolean zIsAnnotation = this.o.a.isAnnotation();
        C6045nH c6045nH = this.b;
        if (zIsAnnotation && (c6452pP0 = (C6452pP0) AbstractC8069xu.S(((JD) this.e.invoke()).c(c1559Tt0))) != null) {
            C0318Dv0 c0318Dv0 = EnumC6348os0.a;
            C4184hb0 c4184hb0G1 = C4184hb0.G1(this.n, AbstractC1993Zi.e(c6045nH, c6452pP0), AbstractC6947s02.a(c6452pP0.e()), false, c6452pP0.c(), ((C6518pl0) ((C4375ib0) c6045nH.b).j).n(c6452pP0), false);
            FE0 fe0C = EZ1.c(c4184hb0G1, S20.b);
            c4184hb0G1.C1(fe0C, null, null, null);
            O90.f(c6045nH, "<this>");
            AbstractC0663Ig0 abstractC0663Ig0L = AbstractC1289Qh0.l(c6452pP0, new C6045nH((C4375ib0) c6045nH.b, new C2359bc1(c6045nH, c4184hb0G1, c6452pP0, 0), c6045nH.a));
            MN mn = MN.a;
            c4184hb0G1.F1(abstractC0663Ig0L, mn, p(), null, mn);
            fe0C.n = abstractC0663Ig0L;
            arrayList.add(c4184hb0G1);
        }
        Set setL = L(c1559Tt0);
        if (setL.isEmpty()) {
            return;
        }
        C8098y21 c8098y21 = new C8098y21();
        C8098y21 c8098y212 = new C8098y21();
        A(setL, arrayList, c8098y21, new C0042Ah0(this, 0));
        Collection<?> collectionO = AbstractC0314Du.o(c8098y21);
        if (collectionO.isEmpty()) {
            setG0 = AbstractC8069xu.g0(setL);
        } else {
            if (collectionO instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : setL) {
                    if (!collectionO.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(setL);
                linkedHashSet.removeAll(collectionO);
            }
            setG0 = linkedHashSet;
        }
        A(setG0, c8098y212, null, new C0042Ah0(this, 1));
        LinkedHashSet linkedHashSetC = AbstractC7627vZ0.c(setL, c8098y212);
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        arrayList.addAll(GZ1.i(c1559Tt0, linkedHashSetC, arrayList, this.n, (S20) c4375ib0.f, ((C7883wv0) c4375ib0.u).d));
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set o(C4317iI c4317iI) {
        O90.f(c4317iI, "kindFilter");
        if (this.o.a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((JD) this.e.invoke()).f());
        Collection collectionB = this.n.v().b();
        O90.e(collectionB, "getSupertypes(...)");
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(linkedHashSet, ((AbstractC0663Ig0) it.next()).d0().f());
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final C6887rh0 p() {
        InterfaceC7492us interfaceC7492us = this.n;
        if (interfaceC7492us != null) {
            int i = AbstractC7002sI.a;
            return interfaceC7492us.a1();
        }
        AbstractC7002sI.a(0);
        throw null;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final CD q() {
        return this.n;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final boolean r(C3611eb0 c3611eb0) {
        if (this.o.a.isAnnotation()) {
            return false;
        }
        return N(c3611eb0);
    }

    @Override // defpackage.AbstractC1289Qh0
    public final C0977Mh0 s(C6452pP0 c6452pP0, ArrayList arrayList, AbstractC0663Ig0 abstractC0663Ig0, List list) {
        O90.f(c6452pP0, "method");
        ((C0162Bv0) ((C4375ib0) this.b.b).e).getClass();
        if (this.n != null) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return new C0977Mh0(abstractC0663Ig0, list, arrayList, listEmptyList);
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

    @Override // defpackage.AbstractC1289Qh0
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void x(ArrayList arrayList, C1736Wa0 c1736Wa0, int i, C6452pP0 c6452pP0, AbstractC0663Ig0 abstractC0663Ig0, AbstractC0663Ig0 abstractC0663Ig02) {
        InterfaceC1268Qa0 c5688lP0;
        C0276Dh0 c0276Dh0;
        AbstractC1521Tg1 abstractC1521Tg1G;
        H5 h5 = S20.b;
        C1559Tt0 c1559Tt0C = c6452pP0.c();
        if (abstractC0663Ig0 == null) {
            AbstractC0112Be1.a(2);
            throw null;
        }
        AbstractC1521Tg1 abstractC1521Tg1G2 = AbstractC0112Be1.g(abstractC0663Ig0, false);
        Object defaultValue = c6452pP0.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = VO0.a;
            c5688lP0 = Enum.class.isAssignableFrom(cls) ? new C5688lP0(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new YO0(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new ZO0(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C4148hP0(null, (Class) defaultValue) : new C6070nP0(null, defaultValue);
        } else {
            c5688lP0 = null;
        }
        boolean z = c5688lP0 != null;
        if (abstractC0663Ig02 != null) {
            c0276Dh0 = this;
            abstractC1521Tg1G = AbstractC0112Be1.g(abstractC0663Ig02, false);
        } else {
            c0276Dh0 = this;
            abstractC1521Tg1G = null;
        }
        arrayList.add(new C1758Wh1(c1736Wa0, null, i, h5, c1559Tt0C, abstractC1521Tg1G2, z, false, false, abstractC1521Tg1G, ((C6518pl0) ((C4375ib0) c0276Dh0.b.b).j).n(c6452pP0)));
    }

    public final void y(LinkedHashSet linkedHashSet, C1559Tt0 c1559Tt0, ArrayList arrayList, boolean z) {
        C4375ib0 c4375ib0 = (C4375ib0) this.b.b;
        LinkedHashSet<U01> linkedHashSetI = GZ1.i(c1559Tt0, arrayList, linkedHashSet, this.n, (S20) c4375ib0.f, ((C7883wv0) c4375ib0.u).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetI);
            return;
        }
        ArrayList arrayListN = AbstractC8069xu.N(linkedHashSet, linkedHashSetI);
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(linkedHashSetI));
        for (U01 u01C : linkedHashSetI) {
            U01 u01 = (U01) DS1.d(u01C);
            if (u01 != null) {
                u01C = C(u01C, u01, arrayListN);
            }
            arrayList2.add(u01C);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.C1559Tt0 r11, java.util.LinkedHashSet r12, java.util.LinkedHashSet r13, java.util.AbstractSet r14, defpackage.InterfaceC6099nZ r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0276Dh0.z(Tt0, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, nZ):void");
    }
}
