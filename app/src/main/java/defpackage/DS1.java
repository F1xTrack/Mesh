package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class DS1 {
    public static C0125Bj a(int i, int i2, EnumC7274tj enumC7274tj) {
        C0125Bj c5980mx;
        if ((i2 & 2) != 0) {
            enumC7274tj = EnumC7274tj.a;
        }
        if (i != -2) {
            if (i == -1) {
                if (enumC7274tj == EnumC7274tj.a) {
                    return new C5980mx(1, EnumC7274tj.b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? enumC7274tj == EnumC7274tj.a ? new C0125Bj(i, null) : new C5980mx(i, enumC7274tj, null) : new C0125Bj(Integer.MAX_VALUE, null);
            }
            c5980mx = enumC7274tj == EnumC7274tj.a ? new C0125Bj(0, null) : new C5980mx(1, enumC7274tj, null);
        } else if (enumC7274tj == EnumC7274tj.a) {
            InterfaceC5580kr.a.getClass();
            c5980mx = new C0125Bj(C5389jr.b, null);
        } else {
            c5980mx = new C5980mx(1, enumC7274tj, null);
        }
        return c5980mx;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String b(AZ az) {
        C1559Tt0 c1559Tt0;
        InterfaceC8042xl interfaceC8042xlC = AbstractC8408zg0.z(az) ? c(az) : null;
        if (interfaceC8042xlC == null) {
            return null;
        }
        InterfaceC8042xl interfaceC8042xlK = AbstractC7384uI.k(interfaceC8042xlC);
        if (interfaceC8042xlK instanceof CE0) {
            AbstractC8408zg0.z(interfaceC8042xlK);
            InterfaceC8042xl interfaceC8042xlB = AbstractC7384uI.b(AbstractC7384uI.k(interfaceC8042xlK), C4258i.z);
            if (interfaceC8042xlB == null || (c1559Tt0 = (C1559Tt0) AbstractC2571ck.a.get(AbstractC7384uI.g(interfaceC8042xlB))) == null) {
                return null;
            }
            return c1559Tt0.b();
        }
        if (!(interfaceC8042xlK instanceof U01)) {
            return null;
        }
        int i = AbstractC2190ak.l;
        LinkedHashMap linkedHashMap = AbstractC4273i31.i;
        String strB = AbstractC3534eB1.b((U01) interfaceC8042xlK);
        C1559Tt0 c1559Tt02 = strB == null ? null : (C1559Tt0) linkedHashMap.get(strB);
        if (c1559Tt02 != null) {
            return c1559Tt02.b();
        }
        return null;
    }

    public static final InterfaceC8042xl c(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "<this>");
        if (!AbstractC4273i31.j.contains(interfaceC8042xl.getName()) && !AbstractC2571ck.d.contains(AbstractC7384uI.k(interfaceC8042xl).getName())) {
            return null;
        }
        if (interfaceC8042xl instanceof CE0 ? true : interfaceC8042xl instanceof InterfaceC8324zE0) {
            return AbstractC7384uI.b(interfaceC8042xl, XS0.v);
        }
        if (interfaceC8042xl instanceof U01) {
            return AbstractC7384uI.b(interfaceC8042xl, XS0.w);
        }
        return null;
    }

    public static final InterfaceC8042xl d(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "<this>");
        InterfaceC8042xl interfaceC8042xlC = c(interfaceC8042xl);
        if (interfaceC8042xlC != null) {
            return interfaceC8042xlC;
        }
        int i = C2381bk.l;
        C1559Tt0 name = interfaceC8042xl.getName();
        O90.e(name, "getName(...)");
        if (C2381bk.b(name)) {
            return AbstractC7384uI.b(interfaceC8042xl, XS0.x);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x014d, code lost:
    
        if (r6 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0154, code lost:
    
        return !defpackage.AbstractC8408zg0.z(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(defpackage.InterfaceC7492us r13, defpackage.InterfaceC8042xl r14) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DS1.e(us, xl):boolean");
    }
}
