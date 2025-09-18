package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: Jd0 */
/* loaded from: classes2.dex */
public final class C0732Jd0 {
    public static final DR a;

    static {
        DR dr = new DR();
        dr.a(AbstractC0654Id0.a);
        dr.a(AbstractC0654Id0.b);
        dr.a(AbstractC0654Id0.c);
        dr.a(AbstractC0654Id0.d);
        dr.a(AbstractC0654Id0.e);
        dr.a(AbstractC0654Id0.f);
        dr.a(AbstractC0654Id0.g);
        dr.a(AbstractC0654Id0.h);
        dr.a(AbstractC0654Id0.i);
        dr.a(AbstractC0654Id0.j);
        dr.a(AbstractC0654Id0.k);
        dr.a(AbstractC0654Id0.l);
        dr.a(AbstractC0654Id0.m);
        dr.a(AbstractC0654Id0.n);
        a = dr;
    }

    public static C5921md0 a(VE0 ve0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71) {
        String strH;
        O90.f(ve0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        C8089y00 c8089y00 = AbstractC0654Id0.a;
        O90.e(c8089y00, "constructorSignature");
        C0030Ad0 c0030Ad0 = (C0030Ad0) XM1.a(ve0, c8089y00);
        String string = (c0030Ad0 == null || (c0030Ad0.b & 1) != 1) ? "<init>" : interfaceC1637Ut0.getString(c0030Ad0.c);
        if (c0030Ad0 == null || (c0030Ad0.b & 2) != 2) {
            List list = ve0.e;
            O90.e(list, "getValueParameterList(...)");
            List<IF0> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
            for (IF0 if0 : list2) {
                O90.c(if0);
                String strE = e(AbstractC2123aN1.i(if0, c5826m71), interfaceC1637Ut0);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strH = AbstractC8069xu.H(arrayList, "", "(", ")V", null, 56);
        } else {
            strH = interfaceC1637Ut0.getString(c0030Ad0.d);
        }
        return new C5921md0(string, strH);
    }

    public static C5730ld0 b(C6613qF0 c6613qF0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, boolean z) {
        String strE;
        O90.f(c6613qF0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        C8089y00 c8089y00 = AbstractC0654Id0.d;
        O90.e(c8089y00, "propertySignature");
        C0186Cd0 c0186Cd0 = (C0186Cd0) XM1.a(c6613qF0, c8089y00);
        if (c0186Cd0 == null) {
            return null;
        }
        C8399zd0 c8399zd0 = (c0186Cd0.b & 1) == 1 ? c0186Cd0.c : null;
        if (c8399zd0 == null && z) {
            return null;
        }
        int i = (c8399zd0 == null || (c8399zd0.b & 1) != 1) ? c6613qF0.f : c8399zd0.c;
        if (c8399zd0 == null || (c8399zd0.b & 2) != 2) {
            strE = e(AbstractC2123aN1.e(c6613qF0, c5826m71), interfaceC1637Ut0);
            if (strE == null) {
                return null;
            }
        } else {
            strE = interfaceC1637Ut0.getString(c8399zd0.d);
        }
        return new C5730ld0(interfaceC1637Ut0.getString(i), strE);
    }

    public static C5921md0 c(C4309iF0 c4309iF0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71) {
        String strConcat;
        O90.f(c4309iF0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        C8089y00 c8089y00 = AbstractC0654Id0.b;
        O90.e(c8089y00, "methodSignature");
        C0030Ad0 c0030Ad0 = (C0030Ad0) XM1.a(c4309iF0, c8089y00);
        int i = (c0030Ad0 == null || (c0030Ad0.b & 1) != 1) ? c4309iF0.f : c0030Ad0.c;
        if (c0030Ad0 == null || (c0030Ad0.b & 2) != 2) {
            List listG = AbstractC8259yu.g(AbstractC2123aN1.c(c4309iF0, c5826m71));
            List list = c4309iF0.o;
            O90.e(list, "getValueParameterList(...)");
            List<IF0> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
            for (IF0 if0 : list2) {
                O90.c(if0);
                arrayList.add(AbstractC2123aN1.i(if0, c5826m71));
            }
            ArrayList arrayListN = AbstractC8069xu.N(listG, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayListN));
            Iterator it = arrayListN.iterator();
            while (it.hasNext()) {
                String strE = e((AF0) it.next(), interfaceC1637Ut0);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(AbstractC2123aN1.d(c4309iF0, c5826m71), interfaceC1637Ut0);
            if (strE2 == null) {
                return null;
            }
            strConcat = AbstractC8069xu.H(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = interfaceC1637Ut0.getString(c0030Ad0.d);
        }
        return new C5921md0(interfaceC1637Ut0.getString(i), strConcat);
    }

    public static final boolean d(C6613qF0 c6613qF0) {
        O90.f(c6613qF0, "proto");
        WV wv = AbstractC3617ed0.a;
        Object objK = c6613qF0.k(AbstractC0654Id0.e);
        O90.e(objK, "getExtension(...)");
        return wv.c(((Number) objK).intValue()).booleanValue();
    }

    public static String e(AF0 af0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        if (af0.p()) {
            return AbstractC0308Ds.b(interfaceC1637Ut0.c(af0.i));
        }
        return null;
    }

    public static final Pair f(String[] strArr, String[] strArr2) throws Y90 {
        O90.f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1522Th.a(strArr));
        C6303od0 c6303od0G = g(byteArrayInputStream, strArr2);
        C8019xd0 c8019xd0 = TE0.K;
        c8019xd0.getClass();
        C5780lu c5780lu = new C5780lu(byteArrayInputStream);
        K0 k0 = (K0) c8019xd0.a(c5780lu, a);
        try {
            c5780lu.a(0);
            if (k0.e()) {
                return new Pair(c6303od0G, (TE0) k0);
            }
            Y90 y90 = new Y90(new C7074sg().getMessage());
            y90.a = k0;
            throw y90;
        } catch (Y90 e) {
            e.a = k0;
            throw e;
        }
    }

    public static C6303od0 g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        C0576Hd0 c0576Hd0 = (C0576Hd0) C0576Hd0.h.b(byteArrayInputStream, a);
        O90.e(c0576Hd0, "parseDelimitedFrom(...)");
        return new C6303od0(c0576Hd0, strArr);
    }

    public static final Pair h(String[] strArr, String[] strArr2) {
        O90.f(strArr, "data");
        O90.f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1522Th.a(strArr));
        C6303od0 c6303od0G = g(byteArrayInputStream, strArr2);
        C8019xd0 c8019xd0 = C5849mF0.l;
        c8019xd0.getClass();
        C5780lu c5780lu = new C5780lu(byteArrayInputStream);
        K0 k0 = (K0) c8019xd0.a(c5780lu, a);
        try {
            c5780lu.a(0);
            if (k0.e()) {
                return new Pair(c6303od0G, (C5849mF0) k0);
            }
            Y90 y90 = new Y90(new C7074sg().getMessage());
            y90.a = k0;
            throw y90;
        } catch (Y90 e) {
            e.a = k0;
            throw e;
        }
    }
}
