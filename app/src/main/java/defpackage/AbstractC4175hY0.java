package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: hY0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4175hY0 extends AbstractC4366iY0 {
    public static InterfaceC3412dY0 d(Iterator it) {
        O90.f(it, "<this>");
        return e(new M8(3, it));
    }

    public static InterfaceC3412dY0 e(InterfaceC3412dY0 interfaceC3412dY0) {
        return interfaceC3412dY0 instanceof C0713Ix ? interfaceC3412dY0 : new C0713Ix(interfaceC3412dY0);
    }

    public static int f(InterfaceC3412dY0 interfaceC3412dY0) {
        Iterator it = interfaceC3412dY0.iterator();
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

    public static InterfaceC3412dY0 g(InterfaceC3412dY0 interfaceC3412dY0, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC3412dY0 : interfaceC3412dY0 instanceof InterfaceC3947gM ? ((InterfaceC3947gM) interfaceC3412dY0).drop(i) : new C2499cM(interfaceC3412dY0, i);
        }
        throw new IllegalArgumentException(AbstractC8235ym.g(i, "Requested element count ", " is less than zero.").toString());
    }

    public static Object h(C7991xU c7991xU) {
        C7801wU c7801wU = new C7801wU(c7991xU);
        if (c7801wU.hasNext()) {
            return c7801wU.next();
        }
        return null;
    }

    public static final C2339bW i(InterfaceC3412dY0 interfaceC3412dY0) {
        XS0 xs0 = XS0.l;
        if (!(interfaceC3412dY0 instanceof C0028Ac1)) {
            return new C2339bW(interfaceC3412dY0, XS0.m, xs0);
        }
        C0028Ac1 c0028Ac1 = (C0028Ac1) interfaceC3412dY0;
        return new C2339bW(c0028Ac1.a, c0028Ac1.b, xs0);
    }

    public static InterfaceC3412dY0 j(InterfaceC5908mZ interfaceC5908mZ) {
        return e(new C3780fU(interfaceC5908mZ, new C5661lG0(interfaceC5908mZ)));
    }

    public static InterfaceC3412dY0 k(Object obj, InterfaceC6099nZ interfaceC6099nZ) {
        return obj == null ? RN.a : new C3780fU(new C6685qd0(25, obj), interfaceC6099nZ);
    }

    public static C0028Ac1 l(InterfaceC3412dY0 interfaceC3412dY0, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC6099nZ, "transform");
        return new C0028Ac1(interfaceC3412dY0, interfaceC6099nZ);
    }

    public static C7991xU m(InterfaceC3412dY0 interfaceC3412dY0, InterfaceC6099nZ interfaceC6099nZ) {
        return new C7991xU(new C0028Ac1(interfaceC3412dY0, interfaceC6099nZ), false, XS0.n);
    }

    public static List n(InterfaceC3412dY0 interfaceC3412dY0) {
        Iterator it = interfaceC3412dY0.iterator();
        if (!it.hasNext()) {
            return MN.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC8259yu.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set o(InterfaceC3412dY0 interfaceC3412dY0) {
        Iterator it = interfaceC3412dY0.iterator();
        if (!it.hasNext()) {
            return SN.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC7627vZ0.e(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
