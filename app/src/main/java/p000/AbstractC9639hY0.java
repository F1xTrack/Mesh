package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: hY0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9639hY0 extends AbstractC9767iY0 {
    /* renamed from: d */
    public static InterfaceC9127dY0 m18825d(Iterator it) {
        O90.m5968f(it, "<this>");
        return m18826e(new C0764M8(3, it));
    }

    /* renamed from: e */
    public static InterfaceC9127dY0 m18826e(InterfaceC9127dY0 interfaceC9127dY0) {
        return interfaceC9127dY0 instanceof C0564Ix ? interfaceC9127dY0 : new C0564Ix(interfaceC9127dY0);
    }

    /* renamed from: f */
    public static int m18827f(InterfaceC9127dY0 interfaceC9127dY0) {
        Iterator it = interfaceC9127dY0.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    /* renamed from: g */
    public static InterfaceC9127dY0 m18828g(InterfaceC9127dY0 interfaceC9127dY0, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC9127dY0 : interfaceC9127dY0 instanceof InterfaceC4111gM ? ((InterfaceC4111gM) interfaceC9127dY0).drop(i) : new C1842cM(interfaceC9127dY0, i);
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: h */
    public static Object m18829h(C7141xU c7141xU) {
        C7078wU c7078wU = new C7078wU(c7141xU);
        if (c7078wU.hasNext()) {
            return c7078wU.next();
        }
        return null;
    }

    /* renamed from: i */
    public static final C1790bW m18830i(InterfaceC9127dY0 interfaceC9127dY0) {
        XS0 xs0 = XS0.f13776l;
        if (!(interfaceC9127dY0 instanceof C7319Ac1)) {
            return new C1790bW(interfaceC9127dY0, XS0.f13777m, xs0);
        }
        C7319Ac1 c7319Ac1 = (C7319Ac1) interfaceC9127dY0;
        return new C1790bW(c7319Ac1.f284a, c7319Ac1.f285b, xs0);
    }

    /* renamed from: j */
    public static InterfaceC9127dY0 m18831j(InterfaceC6434mZ interfaceC6434mZ) {
        return m18826e(new C4056fU(interfaceC6434mZ, new C10115lG0(interfaceC6434mZ)));
    }

    /* renamed from: k */
    public static InterfaceC9127dY0 m18832k(Object obj, InterfaceC6497nZ interfaceC6497nZ) {
        return obj == null ? C1093RN.f10147a : new C4056fU(new C10801qd0(25, obj), interfaceC6497nZ);
    }

    /* renamed from: l */
    public static C7319Ac1 m18833l(InterfaceC9127dY0 interfaceC9127dY0, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC6497nZ, "transform");
        return new C7319Ac1(interfaceC9127dY0, interfaceC6497nZ);
    }

    /* renamed from: m */
    public static C7141xU m18834m(InterfaceC9127dY0 interfaceC9127dY0, InterfaceC6497nZ interfaceC6497nZ) {
        return new C7141xU(new C7319Ac1(interfaceC9127dY0, interfaceC6497nZ), false, XS0.f13778n);
    }

    /* renamed from: n */
    public static List m18835n(InterfaceC9127dY0 interfaceC9127dY0) {
        Iterator it = interfaceC9127dY0.iterator();
        if (!it.hasNext()) {
            return C0779MN.f7117a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC7230yu.m26274e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static Set m18836o(InterfaceC9127dY0 interfaceC9127dY0) {
        Iterator it = interfaceC9127dY0.iterator();
        if (!it.hasNext()) {
            return C1156SN.f10705a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC11433vZ0.m25454e(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
