package p000;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class DS1 {
    /* renamed from: a */
    public static C0109Bj m1689a(int i, int i2, EnumC6904tj enumC6904tj) {
        C0109Bj c6458mx;
        if ((i2 & 2) != 0) {
            enumC6904tj = EnumC6904tj.f43225a;
        }
        if (i != -2) {
            if (i == -1) {
                if (enumC6904tj == EnumC6904tj.f43225a) {
                    return new C6458mx(1, EnumC6904tj.f43226b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? enumC6904tj == EnumC6904tj.f43225a ? new C0109Bj(i, null) : new C6458mx(i, enumC6904tj, null) : new C0109Bj(Integer.MAX_VALUE, null);
            }
            c6458mx = enumC6904tj == EnumC6904tj.f43225a ? new C0109Bj(0, null) : new C6458mx(1, enumC6904tj, null);
        } else if (enumC6904tj == EnumC6904tj.f43225a) {
            InterfaceC6326kr.f36726a.getClass();
            c6458mx = new C0109Bj(C6263jr.f35426b, null);
        } else {
            c6458mx = new C6458mx(1, enumC6904tj, null);
        }
        return c6458mx;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* renamed from: b */
    public static final String m1690b(InterfaceC0036AZ interfaceC0036AZ) {
        C8340Tt0 c8340Tt0;
        InterfaceC7158xl interfaceC7158xlM1691c = AbstractC11955zg0.m26496z(interfaceC0036AZ) ? m1691c(interfaceC0036AZ) : null;
        if (interfaceC7158xlM1691c == null) {
            return null;
        }
        InterfaceC7158xl interfaceC7158xlM25158k = AbstractC6940uI.m25158k(interfaceC7158xlM1691c);
        if (interfaceC7158xlM25158k instanceof CE0) {
            AbstractC11955zg0.m26496z(interfaceC7158xlM25158k);
            InterfaceC7158xl interfaceC7158xlM25149b = AbstractC6940uI.m25149b(AbstractC6940uI.m25158k(interfaceC7158xlM25158k), C4214i.f28741z);
            if (interfaceC7158xlM25149b == null || (c8340Tt0 = (C8340Tt0) AbstractC1866ck.f17715a.get(AbstractC6940uI.m25154g(interfaceC7158xlM25149b))) == null) {
                return null;
            }
            return c8340Tt0.m7801b();
        }
        if (!(interfaceC7158xlM25158k instanceof U01)) {
            return null;
        }
        int i = AbstractC1683ak.f15660l;
        LinkedHashMap linkedHashMap = AbstractC9705i31.f28796i;
        String strM17875b = AbstractC9210eB1.m17875b((U01) interfaceC7158xlM25158k);
        C8340Tt0 c8340Tt02 = strM17875b == null ? null : (C8340Tt0) linkedHashMap.get(strM17875b);
        if (c8340Tt02 != null) {
            return c8340Tt02.m7801b();
        }
        return null;
    }

    /* renamed from: c */
    public static final InterfaceC7158xl m1691c(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "<this>");
        if (!AbstractC9705i31.f28797j.contains(interfaceC7158xl.getName()) && !AbstractC1866ck.f17718d.contains(AbstractC6940uI.m25158k(interfaceC7158xl).getName())) {
            return null;
        }
        if (interfaceC7158xl instanceof CE0 ? true : interfaceC7158xl instanceof InterfaceC11899zE0) {
            return AbstractC6940uI.m25149b(interfaceC7158xl, XS0.f13786v);
        }
        if (interfaceC7158xl instanceof U01) {
            return AbstractC6940uI.m25149b(interfaceC7158xl, XS0.f13787w);
        }
        return null;
    }

    /* renamed from: d */
    public static final InterfaceC7158xl m1692d(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "<this>");
        InterfaceC7158xl interfaceC7158xlM1691c = m1691c(interfaceC7158xl);
        if (interfaceC7158xlM1691c != null) {
            return interfaceC7158xlM1691c;
        }
        int i = C1804bk.f17126l;
        C8340Tt0 name = interfaceC7158xl.getName();
        O90.m5967e(name, "getName(...)");
        if (C1804bk.m10500b(name)) {
            return AbstractC6940uI.m25149b(interfaceC7158xl, XS0.f13788x);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x014d, code lost:
    
        if (r6 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0154, code lost:
    
        return !p000.AbstractC11955zg0.m26496z(r13);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m1693e(p000.InterfaceC6976us r13, p000.InterfaceC7158xl r14) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DS1.m1693e(us, xl):boolean");
    }
}
