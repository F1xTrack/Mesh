package p000;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: Jd0 */
/* loaded from: classes2.dex */
public final class C7788Jd0 {

    /* renamed from: a */
    public static final C0217DR f5651a;

    static {
        C0217DR c0217dr = new C0217DR();
        c0217dr.m1683a(AbstractC7736Id0.f5049a);
        c0217dr.m1683a(AbstractC7736Id0.f5050b);
        c0217dr.m1683a(AbstractC7736Id0.f5051c);
        c0217dr.m1683a(AbstractC7736Id0.f5052d);
        c0217dr.m1683a(AbstractC7736Id0.f5053e);
        c0217dr.m1683a(AbstractC7736Id0.f5054f);
        c0217dr.m1683a(AbstractC7736Id0.f5055g);
        c0217dr.m1683a(AbstractC7736Id0.f5056h);
        c0217dr.m1683a(AbstractC7736Id0.f5057i);
        c0217dr.m1683a(AbstractC7736Id0.f5058j);
        c0217dr.m1683a(AbstractC7736Id0.f5059k);
        c0217dr.m1683a(AbstractC7736Id0.f5060l);
        c0217dr.m1683a(AbstractC7736Id0.f5061m);
        c0217dr.m1683a(AbstractC7736Id0.f5062n);
        f5651a = c0217dr;
    }

    /* renamed from: a */
    public static C10289md0 m4370a(VE0 ve0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71) {
        String strM25962H;
        O90.m5968f(ve0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        C11741y00 c11741y00 = AbstractC7736Id0.f5049a;
        O90.m5967e(c11741y00, "constructorSignature");
        C7320Ad0 c7320Ad0 = (C7320Ad0) XM1.m8993a(ve0, c11741y00);
        String string = (c7320Ad0 == null || (c7320Ad0.f292b & 1) != 1) ? "<init>" : interfaceC8392Ut0.getString(c7320Ad0.f293c);
        if (c7320Ad0 == null || (c7320Ad0.f292b & 2) != 2) {
            List list = ve0.f12455e;
            O90.m5967e(list, "getValueParameterList(...)");
            List<IF0> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
            for (IF0 if0 : list2) {
                O90.m5965c(if0);
                String strM4374e = m4374e(AbstractC8717aN1.m9726i(if0, c10226m71), interfaceC8392Ut0);
                if (strM4374e == null) {
                    return null;
                }
                arrayList.add(strM4374e);
            }
            strM25962H = AbstractC7167xu.m25962H(arrayList, "", "(", ")V", null, 56);
        } else {
            strM25962H = interfaceC8392Ut0.getString(c7320Ad0.f294d);
        }
        return new C10289md0(string, strM25962H);
    }

    /* renamed from: b */
    public static C10161ld0 m4371b(C10753qF0 c10753qF0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, boolean z) {
        String strM4374e;
        O90.m5968f(c10753qF0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        C11741y00 c11741y00 = AbstractC7736Id0.f5052d;
        O90.m5967e(c11741y00, "propertySignature");
        C7424Cd0 c7424Cd0 = (C7424Cd0) XM1.m8993a(c10753qF0, c11741y00);
        if (c7424Cd0 == null) {
            return null;
        }
        C11949zd0 c11949zd0 = (c7424Cd0.f1496b & 1) == 1 ? c7424Cd0.f1497c : null;
        if (c11949zd0 == null && z) {
            return null;
        }
        int i = (c11949zd0 == null || (c11949zd0.f46912b & 1) != 1) ? c10753qF0.f40690f : c11949zd0.f46913c;
        if (c11949zd0 == null || (c11949zd0.f46912b & 2) != 2) {
            strM4374e = m4374e(AbstractC8717aN1.m9725e(c10753qF0, c10226m71), interfaceC8392Ut0);
            if (strM4374e == null) {
                return null;
            }
        } else {
            strM4374e = interfaceC8392Ut0.getString(c11949zd0.f46914d);
        }
        return new C10161ld0(interfaceC8392Ut0.getString(i), strM4374e);
    }

    /* renamed from: c */
    public static C10289md0 m4372c(C9729iF0 c9729iF0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71) {
        String strConcat;
        O90.m5968f(c9729iF0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        C11741y00 c11741y00 = AbstractC7736Id0.f5050b;
        O90.m5967e(c11741y00, "methodSignature");
        C7320Ad0 c7320Ad0 = (C7320Ad0) XM1.m8993a(c9729iF0, c11741y00);
        int i = (c7320Ad0 == null || (c7320Ad0.f292b & 1) != 1) ? c9729iF0.f28985f : c7320Ad0.f293c;
        if (c7320Ad0 == null || (c7320Ad0.f292b & 2) != 2) {
            List listM26276g = AbstractC7230yu.m26276g(AbstractC8717aN1.m9723c(c9729iF0, c10226m71));
            List list = c9729iF0.f28994o;
            O90.m5967e(list, "getValueParameterList(...)");
            List<IF0> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
            for (IF0 if0 : list2) {
                O90.m5965c(if0);
                arrayList.add(AbstractC8717aN1.m9726i(if0, c10226m71));
            }
            ArrayList arrayListM25968N = AbstractC7167xu.m25968N(listM26276g, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayListM25968N));
            Iterator it = arrayListM25968N.iterator();
            while (it.hasNext()) {
                String strM4374e = m4374e((AF0) it.next(), interfaceC8392Ut0);
                if (strM4374e == null) {
                    return null;
                }
                arrayList2.add(strM4374e);
            }
            String strM4374e2 = m4374e(AbstractC8717aN1.m9724d(c9729iF0, c10226m71), interfaceC8392Ut0);
            if (strM4374e2 == null) {
                return null;
            }
            strConcat = AbstractC7167xu.m25962H(arrayList2, "", "(", ")", null, 56).concat(strM4374e2);
        } else {
            strConcat = interfaceC8392Ut0.getString(c7320Ad0.f294d);
        }
        return new C10289md0(interfaceC8392Ut0.getString(i), strConcat);
    }

    /* renamed from: d */
    public static final boolean m4373d(C10753qF0 c10753qF0) {
        O90.m5968f(c10753qF0, "proto");
        C1416WV c1416wv = AbstractC9265ed0.f26783a;
        Object objM25537k = c10753qF0.m25537k(AbstractC7736Id0.f5053e);
        O90.m5967e(objM25537k, "getExtension(...)");
        return c1416wv.m8799c(((Number) objM25537k).intValue()).booleanValue();
    }

    /* renamed from: e */
    public static String m4374e(AF0 af0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        if (af0.m133p()) {
            return AbstractC0244Ds.m1919b(interfaceC8392Ut0.mo5440c(af0.f132i));
        }
        return null;
    }

    /* renamed from: f */
    public static final Pair m4375f(String[] strArr, String[] strArr2) throws Y90 {
        O90.m5968f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1239Th.m7726a(strArr));
        C10545od0 c10545od0M4376g = m4376g(byteArrayInputStream, strArr2);
        C11695xd0 c11695xd0 = TE0.f11219K;
        c11695xd0.getClass();
        C6392lu c6392lu = new C6392lu(byteArrayInputStream);
        AbstractC0631K0 abstractC0631K0 = (AbstractC0631K0) c11695xd0.mo21982a(c6392lu, f5651a);
        try {
            c6392lu.m22573a(0);
            if (abstractC0631K0.mo131e()) {
                return new Pair(c10545od0M4376g, (TE0) abstractC0631K0);
            }
            Y90 y90 = new Y90(new C6838sg().getMessage());
            y90.f14178a = abstractC0631K0;
            throw y90;
        } catch (Y90 e) {
            e.f14178a = abstractC0631K0;
            throw e;
        }
    }

    /* renamed from: g */
    public static C10545od0 m4376g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        C7684Hd0 c7684Hd0 = (C7684Hd0) C7684Hd0.f4380h.m25925b(byteArrayInputStream, f5651a);
        O90.m5967e(c7684Hd0, "parseDelimitedFrom(...)");
        return new C10545od0(c7684Hd0, strArr);
    }

    /* renamed from: h */
    public static final Pair m4377h(String[] strArr, String[] strArr2) {
        O90.m5968f(strArr, "data");
        O90.m5968f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1239Th.m7726a(strArr));
        C10545od0 c10545od0M4376g = m4376g(byteArrayInputStream, strArr2);
        C11695xd0 c11695xd0 = C10241mF0.f37590l;
        c11695xd0.getClass();
        C6392lu c6392lu = new C6392lu(byteArrayInputStream);
        AbstractC0631K0 abstractC0631K0 = (AbstractC0631K0) c11695xd0.mo21982a(c6392lu, f5651a);
        try {
            c6392lu.m22573a(0);
            if (abstractC0631K0.mo131e()) {
                return new Pair(c10545od0M4376g, (C10241mF0) abstractC0631K0);
            }
            Y90 y90 = new Y90(new C6838sg().getMessage());
            y90.f14178a = abstractC0631K0;
            throw y90;
        } catch (Y90 e) {
            e.f14178a = abstractC0631K0;
            throw e;
        }
    }
}
