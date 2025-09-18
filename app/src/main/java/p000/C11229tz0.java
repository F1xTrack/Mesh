package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;

/* renamed from: tz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11229tz0 {

    /* renamed from: b */
    public static final List f43433b = AbstractC7167xu.m25982b0(ServiceLoader.load(InterfaceC1160SR.class, InterfaceC1160SR.class.getClassLoader()));

    /* renamed from: c */
    public static final C11229tz0 f43434c;

    /* renamed from: d */
    public static final C7460Cv0 f43435d;

    /* renamed from: a */
    public final InterfaceC7794Jg0 f43436a;

    static {
        C7460Cv0 c7460Cv0 = new C7460Cv0(18);
        f43435d = c7460Cv0;
        f43434c = new C11229tz0(c7460Cv0);
    }

    public C11229tz0(InterfaceC7794Jg0 interfaceC7794Jg0) {
        if (interfaceC7794Jg0 != null) {
            this.f43436a = interfaceC7794Jg0;
        } else {
            m25046a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m25046a(int r25) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11229tz0.m25046a(int):void");
    }

    /* renamed from: b */
    public static boolean m25047b(AbstractC7742Ig0 abstractC7742Ig0, AbstractC7742Ig0 abstractC7742Ig02, C1622Zm c1622Zm) {
        if (abstractC7742Ig0 == null) {
            m25046a(46);
            throw null;
        }
        if (abstractC7742Ig02 == null) {
            m25046a(47);
            throw null;
        }
        if (AbstractC1141S8.m7182b(abstractC7742Ig0) && AbstractC1141S8.m7182b(abstractC7742Ig02)) {
            return true;
        }
        return C6914tt.m25020o(c1622Zm, abstractC7742Ig0.mo3963L(), abstractC7742Ig02.mo3963L());
    }

    /* renamed from: c */
    public static void m25048c(InterfaceC7158xl interfaceC7158xl, LinkedHashSet linkedHashSet) {
        if (interfaceC7158xl == null) {
            m25046a(17);
            throw null;
        }
        if (interfaceC7158xl.mo116l() != 2) {
            linkedHashSet.add(interfaceC7158xl);
            return;
        }
        if (interfaceC7158xl.mo1222j().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC7158xl);
        }
        Iterator it = interfaceC7158xl.mo1222j().iterator();
        while (it.hasNext()) {
            m25048c((InterfaceC7158xl) it.next(), linkedHashSet);
        }
    }

    /* renamed from: d */
    public static ArrayList m25049d(InterfaceC7032vl interfaceC7032vl) {
        C10937rh0 c10937rh0Mo121t0 = interfaceC7032vl.mo121t0();
        ArrayList arrayList = new ArrayList();
        if (c10937rh0Mo121t0 != null) {
            arrayList.add(c10937rh0Mo121t0.getType());
        }
        Iterator it = interfaceC7032vl.mo1221f0().iterator();
        while (it.hasNext()) {
            arrayList.add(((C8473Wh1) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017f, code lost:
    
        r1 = p000.AbstractC7066wI.f44766g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
    
        r11 = ((p000.InterfaceC7158xl) m25059s(r10, new p000.C0726LX(2))).mo117m0(r11, r0, r1);
        r12.mo9682c(r11, r10);
        r12.mo1622a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0197, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017a, code lost:
    
        if (r1 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
    
        r1 = p000.AbstractC7066wI.f44767h;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m25050e(java.util.Collection r10, p000.InterfaceC6976us r11, p000.AbstractC8695aC1 r12) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11229tz0.m25050e(java.util.Collection, us, aC1):void");
    }

    /* renamed from: g */
    public static ArrayList m25051g(Object obj, LinkedList linkedList, InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2) {
        if (obj == null) {
            m25046a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) interfaceC6497nZ.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC7032vl interfaceC7032vl2 = (InterfaceC7032vl) interfaceC6497nZ.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iM25053j = m25053j(interfaceC7032vl, interfaceC7032vl2);
                if (iM25053j == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iM25053j == 3) {
                    interfaceC6497nZ2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static C11101sz0 m25052i(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2) {
        boolean z;
        if (interfaceC7032vl == null) {
            m25046a(40);
            throw null;
        }
        if (interfaceC7032vl2 == null) {
            m25046a(41);
            throw null;
        }
        boolean z2 = interfaceC7032vl instanceof InterfaceC0036AZ;
        if ((z2 && !(interfaceC7032vl2 instanceof InterfaceC0036AZ)) || (((z = interfaceC7032vl instanceof CE0)) && !(interfaceC7032vl2 instanceof CE0))) {
            return C11101sz0.m24814d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC7032vl);
        }
        if (!interfaceC7032vl.getName().equals(interfaceC7032vl2.getName())) {
            return C11101sz0.m24814d("Name mismatch");
        }
        C11101sz0 c11101sz0M24814d = (interfaceC7032vl.mo121t0() == null) != (interfaceC7032vl2.mo121t0() == null) ? C11101sz0.m24814d("Receiver presence mismatch") : interfaceC7032vl.mo1221f0().size() != interfaceC7032vl2.mo1221f0().size() ? C11101sz0.m24814d("Value parameter number mismatch") : null;
        if (c11101sz0M24814d != null) {
            return c11101sz0M24814d;
        }
        return null;
    }

    /* renamed from: j */
    public static int m25053j(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2) {
        C11229tz0 c11229tz0 = f43434c;
        int iM24815c = c11229tz0.m25062l(interfaceC7032vl2, interfaceC7032vl, null).m24815c();
        int iM24815c2 = c11229tz0.m25063m(interfaceC7032vl, interfaceC7032vl2, null, false).m24815c();
        if (iM24815c == 1 && iM24815c2 == 1) {
            return 1;
        }
        return (iM24815c == 3 || iM24815c2 == 3) ? 3 : 2;
    }

    /* renamed from: k */
    public static boolean m25054k(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2) {
        if (interfaceC7032vl == null) {
            m25046a(67);
            throw null;
        }
        if (interfaceC7032vl2 == null) {
            m25046a(68);
            throw null;
        }
        AbstractC7742Ig0 returnType = interfaceC7032vl.getReturnType();
        AbstractC7742Ig0 returnType2 = interfaceC7032vl2.getReturnType();
        if (!m25056p(interfaceC7032vl, interfaceC7032vl2)) {
            return false;
        }
        C1622Zm c1622ZmM25060f = f43434c.m25060f(interfaceC7032vl.getTypeParameters(), interfaceC7032vl2.getTypeParameters());
        if (interfaceC7032vl instanceof InterfaceC0036AZ) {
            return m25055o(interfaceC7032vl, returnType, interfaceC7032vl2, returnType2, c1622ZmM25060f);
        }
        if (!(interfaceC7032vl instanceof CE0)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC7032vl.getClass());
        }
        CE0 ce0 = (CE0) interfaceC7032vl;
        CE0 ce02 = (CE0) interfaceC7032vl2;
        JE0 je0Mo1122d = ce0.mo1122d();
        JE0 je0Mo1122d2 = ce02.mo1122d();
        if ((je0Mo1122d == null || je0Mo1122d2 == null) ? true : m25056p(je0Mo1122d, je0Mo1122d2)) {
            return (ce0.mo2087s0() && ce02.mo2087s0()) ? C6914tt.m25020o(c1622ZmM25060f, returnType.mo3963L(), returnType2.mo3963L()) : (ce0.mo2087s0() || !ce02.mo2087s0()) && m25055o(interfaceC7032vl, returnType, interfaceC7032vl2, returnType2, c1622ZmM25060f);
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m25055o(InterfaceC7032vl interfaceC7032vl, AbstractC7742Ig0 abstractC7742Ig0, InterfaceC7032vl interfaceC7032vl2, AbstractC7742Ig0 abstractC7742Ig02, C1622Zm c1622Zm) {
        if (interfaceC7032vl == null) {
            m25046a(73);
            throw null;
        }
        if (abstractC7742Ig0 == null) {
            m25046a(74);
            throw null;
        }
        if (interfaceC7032vl2 == null) {
            m25046a(75);
            throw null;
        }
        if (abstractC7742Ig02 != null) {
            return C6914tt.m25024s(C6914tt.f43391b, c1622Zm, abstractC7742Ig0.mo3963L(), abstractC7742Ig02.mo3963L());
        }
        m25046a(76);
        throw null;
    }

    /* renamed from: p */
    public static boolean m25056p(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2) {
        if (interfaceC7032vl == null) {
            m25046a(69);
            throw null;
        }
        if (interfaceC7032vl2 != null) {
            Integer numM25588b = AbstractC7066wI.m25588b(interfaceC7032vl.getVisibility(), interfaceC7032vl2.getVisibility());
            return numM25588b == null || numM25588b.intValue() >= 0;
        }
        m25046a(70);
        throw null;
    }

    /* renamed from: q */
    public static boolean m25057q(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2) {
        if (interfaceC7032vl == null) {
            m25046a(13);
            throw null;
        }
        if (interfaceC7032vl2 == null) {
            m25046a(14);
            throw null;
        }
        boolean zEquals = interfaceC7032vl.equals(interfaceC7032vl2);
        OL0 ol0 = OL0.f8367b;
        if (!zEquals && ol0.m6021e(interfaceC7032vl.mo2089x1(), interfaceC7032vl2.mo2089x1(), false, true)) {
            return true;
        }
        InterfaceC7032vl interfaceC7032vlMo2089x1 = interfaceC7032vl2.mo2089x1();
        int i = AbstractC6814sI.f42360a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC6814sI.m24690b(interfaceC7032vl.mo2089x1(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (ol0.m6021e(interfaceC7032vlMo2089x1, (InterfaceC7032vl) it.next(), false, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static void m25058r(InterfaceC7158xl interfaceC7158xl, InterfaceC6497nZ interfaceC6497nZ) {
        C7003vI c7003vI;
        C7003vI c7003vIM25592f;
        C7003vI c7003vI2;
        if (interfaceC7158xl == null) {
            m25046a(107);
            throw null;
        }
        for (InterfaceC7158xl interfaceC7158xl2 : interfaceC7158xl.mo1222j()) {
            if (interfaceC7158xl2.getVisibility() == AbstractC7066wI.f44766g) {
                m25058r(interfaceC7158xl2, interfaceC6497nZ);
            }
        }
        if (interfaceC7158xl.getVisibility() != AbstractC7066wI.f44766g) {
            return;
        }
        Collection<InterfaceC7158xl> collectionMo1222j = interfaceC7158xl.mo1222j();
        if (collectionMo1222j == null) {
            m25046a(109);
            throw null;
        }
        if (collectionMo1222j.isEmpty()) {
            c7003vIM25592f = AbstractC7066wI.f44769j;
        } else {
            Iterator it = collectionMo1222j.iterator();
            loop3: while (true) {
                c7003vI = null;
                while (it.hasNext()) {
                    C7003vI visibility = ((InterfaceC7158xl) it.next()).getVisibility();
                    if (c7003vI != null) {
                        Integer numM25588b = AbstractC7066wI.m25588b(visibility, c7003vI);
                        if (numM25588b == null) {
                            break;
                        } else if (numM25588b.intValue() > 0) {
                        }
                    }
                    c7003vI = visibility;
                }
            }
            if (c7003vI == null) {
                c7003vIM25592f = null;
                break;
            }
            Iterator it2 = collectionMo1222j.iterator();
            while (it2.hasNext()) {
                Integer numM25588b2 = AbstractC7066wI.m25588b(c7003vI, ((InterfaceC7158xl) it2.next()).getVisibility());
                if (numM25588b2 == null || numM25588b2.intValue() < 0) {
                    c7003vIM25592f = null;
                    break;
                }
            }
            c7003vIM25592f = c7003vI;
        }
        if (c7003vIM25592f == null) {
            c7003vIM25592f = null;
            break;
        }
        if (interfaceC7158xl.mo116l() == 2) {
            for (InterfaceC7158xl interfaceC7158xl3 : collectionMo1222j) {
                if (interfaceC7158xl3.mo115f() != EnumC10575os0.f39326e && !interfaceC7158xl3.getVisibility().equals(c7003vIM25592f)) {
                    c7003vIM25592f = null;
                    break;
                }
            }
        } else {
            c7003vIM25592f = AbstractC7066wI.m25592f(c7003vIM25592f.f44322a.mo3952m());
        }
        if (c7003vIM25592f == null) {
            if (interfaceC6497nZ != null) {
                interfaceC6497nZ.invoke(interfaceC7158xl);
            }
            c7003vI2 = AbstractC7066wI.f44764e;
        } else {
            c7003vI2 = c7003vIM25592f;
        }
        if (interfaceC7158xl instanceof EE0) {
            EE0 ee0 = (EE0) interfaceC7158xl;
            if (c7003vI2 == null) {
                EE0.m2078b1(20);
                throw null;
            }
            ee0.f2549k = c7003vI2;
            Iterator it3 = ((CE0) interfaceC7158xl).mo1123p().iterator();
            while (it3.hasNext()) {
                m25058r((InterfaceC11899zE0) it3.next(), c7003vIM25592f == null ? null : interfaceC6497nZ);
            }
            return;
        }
        if (interfaceC7158xl instanceof AbstractC0162CZ) {
            AbstractC0162CZ abstractC0162CZ = (AbstractC0162CZ) interfaceC7158xl;
            if (c7003vI2 != null) {
                abstractC0162CZ.f1437m = c7003vI2;
                return;
            } else {
                AbstractC0162CZ.m1213b1(10);
                throw null;
            }
        }
        AE0 ae0 = (AE0) interfaceC7158xl;
        ae0.f118l = c7003vI2;
        if (c7003vI2 != ae0.m123y1().getVisibility()) {
            ae0.f112f = false;
        }
    }

    /* renamed from: s */
    public static Object m25059s(Collection collection, InterfaceC6497nZ interfaceC6497nZ) {
        Object next;
        if (collection.size() == 1) {
            Object objM25998z = AbstractC7167xu.m25998z(collection);
            if (objM25998z != null) {
                return objM25998z;
            }
            m25046a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC6497nZ.invoke(it.next()));
        }
        Object objM25998z2 = AbstractC7167xu.m25998z(collection);
        InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) interfaceC6497nZ.invoke(objM25998z2);
        for (Object obj : collection) {
            InterfaceC7032vl interfaceC7032vl2 = (InterfaceC7032vl) interfaceC6497nZ.invoke(obj);
            if (interfaceC7032vl2 == null) {
                m25046a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!m25054k(interfaceC7032vl2, (InterfaceC7032vl) it2.next())) {
                    break;
                }
            }
            if (m25054k(interfaceC7032vl2, interfaceC7032vl) && !m25054k(interfaceC7032vl, interfaceC7032vl2)) {
                objM25998z2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objM25998z2 != null) {
                return objM25998z2;
            }
            m25046a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objM25998z3 = AbstractC7167xu.m25998z(arrayList);
            if (objM25998z3 != null) {
                return objM25998z3;
            }
            m25046a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!AbstractC9572h12.m18696d(((InterfaceC7032vl) interfaceC6497nZ.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objM25998z4 = AbstractC7167xu.m25998z(arrayList);
        if (objM25998z4 != null) {
            return objM25998z4;
        }
        m25046a(84);
        throw null;
    }

    /* renamed from: f */
    public final C1622Zm m25060f(List list, List list2) {
        if (list == null) {
            m25046a(42);
            throw null;
        }
        if (list2 == null) {
            m25046a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        C8002Ng0 c8002Ng0 = C8002Ng0.f7948a;
        C8054Og0 c8054Og0 = C8054Og0.f8561a;
        InterfaceC7794Jg0 interfaceC7794Jg0 = this.f43436a;
        if (zIsEmpty) {
            return new C1622Zm(true, true, (InterfaceC0810Ms) new CC0((HashMap) null, interfaceC7794Jg0), c8002Ng0, c8054Og0);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((InterfaceC10292me1) list.get(i)).mo1439v(), ((InterfaceC10292me1) list2.get(i)).mo1439v());
        }
        return new C1622Zm(true, true, (InterfaceC0810Ms) new CC0(map, interfaceC7794Jg0), c8002Ng0, c8054Og0);
    }

    /* renamed from: h */
    public final void m25061h(C8340Tt0 c8340Tt0, Collection collection, Collection collection2, InterfaceC6976us interfaceC6976us, AbstractC8695aC1 abstractC8695aC1) {
        Integer numM25588b;
        if (c8340Tt0 == null) {
            m25046a(52);
            throw null;
        }
        if (collection == null) {
            m25046a(53);
            throw null;
        }
        if (collection2 == null) {
            m25046a(54);
            throw null;
        }
        if (interfaceC6976us == null) {
            m25046a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) it.next();
            if (interfaceC7158xl == null) {
                m25046a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            C11748y21 c11748y21 = new C11748y21();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC7158xl interfaceC7158xl2 = (InterfaceC7158xl) it2.next();
                int iM24815c = m25062l(interfaceC7158xl2, interfaceC7158xl, interfaceC6976us).m24815c();
                boolean z = !AbstractC7066wI.m25591e(interfaceC7158xl2.getVisibility()) && AbstractC7066wI.m25589c(AbstractC7066wI.f44771l, interfaceC7158xl2, interfaceC7158xl) == null;
                int iM26247x = AbstractC7222ym.m26247x(iM24815c);
                if (iM26247x == 0) {
                    if (z) {
                        c11748y21.add(interfaceC7158xl2);
                    }
                    arrayList.add(interfaceC7158xl2);
                } else if (iM26247x == 2) {
                    if (z) {
                        abstractC8695aC1.mo1623b(interfaceC7158xl2, interfaceC7158xl);
                    }
                    arrayList.add(interfaceC7158xl2);
                }
            }
            abstractC8695aC1.mo9682c(interfaceC7158xl, c11748y21);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC0140CD interfaceC0140CDMo423i = ((InterfaceC7158xl) linkedHashSet.iterator().next()).mo423i();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC7158xl) it3.next()).mo423i() != interfaceC0140CDMo423i) {
                        LinkedList<InterfaceC7158xl> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC7158xl interfaceC7158xl3 = null;
                            for (InterfaceC7158xl interfaceC7158xl4 : linkedList) {
                                if (interfaceC7158xl3 == null || ((numM25588b = AbstractC7066wI.m25588b(interfaceC7158xl3.getVisibility(), interfaceC7158xl4.getVisibility())) != null && numM25588b.intValue() < 0)) {
                                    interfaceC7158xl3 = interfaceC7158xl4;
                                }
                            }
                            O90.m5965c(interfaceC7158xl3);
                            m25050e(m25051g(interfaceC7158xl3, linkedList, new C0726LX(3), new C1508Xy(abstractC8695aC1, interfaceC7158xl3)), interfaceC6976us, abstractC8695aC1);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            m25050e(Collections.singleton((InterfaceC7158xl) it4.next()), interfaceC6976us, abstractC8695aC1);
        }
    }

    /* renamed from: l */
    public final C11101sz0 m25062l(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2, InterfaceC6976us interfaceC6976us) {
        if (interfaceC7032vl == null) {
            m25046a(19);
            throw null;
        }
        if (interfaceC7032vl2 != null) {
            return m25063m(interfaceC7032vl, interfaceC7032vl2, interfaceC6976us, false);
        }
        m25046a(20);
        throw null;
    }

    /* renamed from: m */
    public final C11101sz0 m25063m(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2, InterfaceC6976us interfaceC6976us, boolean z) {
        if (interfaceC7032vl == null) {
            m25046a(22);
            throw null;
        }
        if (interfaceC7032vl2 == null) {
            m25046a(23);
            throw null;
        }
        C11101sz0 c11101sz0M25064n = m25064n(interfaceC7032vl, interfaceC7032vl2, z);
        boolean z2 = c11101sz0M25064n.m24815c() == 1;
        List<InterfaceC1160SR> list = f43433b;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            EnumC1035QR enumC1035QR = EnumC1035QR.f9621a;
            if (!zHasNext) {
                if (!z2) {
                    return c11101sz0M25064n;
                }
                for (InterfaceC1160SR interfaceC1160SR : list) {
                    if (interfaceC1160SR.mo7369a() == enumC1035QR) {
                        int iOrdinal = interfaceC1160SR.mo7370b(interfaceC7032vl, interfaceC7032vl2, interfaceC6976us).ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("Contract violation in " + interfaceC1160SR.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (iOrdinal == 1) {
                            return C11101sz0.m24813b("External condition failed");
                        }
                        if (iOrdinal == 2) {
                            return C11101sz0.m24814d("External condition");
                        }
                    }
                }
                C11101sz0 c11101sz0 = C11101sz0.f42744b;
                if (c11101sz0 != null) {
                    return c11101sz0;
                }
                C11101sz0.m24812a(0);
                throw null;
            }
            InterfaceC1160SR interfaceC1160SR2 = (InterfaceC1160SR) it.next();
            if (interfaceC1160SR2.mo7369a() != enumC1035QR && (!z2 || interfaceC1160SR2.mo7369a() != EnumC1035QR.f9622b)) {
                int iOrdinal2 = interfaceC1160SR2.mo7370b(interfaceC7032vl, interfaceC7032vl2, interfaceC6976us).ordinal();
                if (iOrdinal2 == 0) {
                    z2 = true;
                } else {
                    if (iOrdinal2 == 1) {
                        return C11101sz0.m24813b("External condition failed");
                    }
                    if (iOrdinal2 == 2) {
                        return C11101sz0.m24814d("External condition");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r14.remove();
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11101sz0 m25064n(p000.InterfaceC7032vl r17, p000.InterfaceC7032vl r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11229tz0.m25064n(vl, vl, boolean):sz0");
    }
}
