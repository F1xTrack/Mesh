package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Yd1 */
/* loaded from: classes2.dex */
public final class C1902Yd1 {
    public final C1666Vd a;
    public final C1902Yd1 b;
    public final String c;
    public final String d;
    public final C1766Wk0 e;
    public final C1766Wk0 f;
    public final Object g;

    public C1902Yd1(C1666Vd c1666Vd, C1902Yd1 c1902Yd1, List list, String str, String str2) {
        Map linkedHashMap;
        O90.f(c1666Vd, "c");
        O90.f(list, "typeParameterProtos");
        O90.f(str, "debugName");
        this.a = c1666Vd;
        this.b = c1902Yd1;
        this.c = str;
        this.d = str2;
        C7955xI c7955xI = (C7955xI) c1666Vd.c;
        this.e = ((C1922Yk0) c7955xI.a).c(new C1746Wd1(this, 0));
        this.f = ((C1922Yk0) c7955xI.a).c(new C1746Wd1(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = NN.a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                FF0 ff0 = (FF0) it.next();
                linkedHashMap.put(Integer.valueOf(ff0.d), new WI(this.a, ff0, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static X01 a(X01 x01, AbstractC0663Ig0 abstractC0663Ig0) {
        AbstractC8408zg0 abstractC8408zg0F = CZ1.f(x01);
        I5 annotations = x01.getAnnotations();
        AbstractC0663Ig0 abstractC0663Ig0F = A12.f(x01);
        List listD = A12.d(x01);
        List listX = AbstractC8069xu.x(1, A12.g(x01));
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listX));
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6689qe1) it.next()).b());
        }
        return A12.b(abstractC8408zg0F, annotations, abstractC0663Ig0F, listD, arrayList, abstractC0663Ig0, true).P(x01.G());
    }

    public static final ArrayList e(AF0 af0, C1902Yd1 c1902Yd1) {
        List list = af0.d;
        O90.e(list, "getArgumentList(...)");
        List list2 = list;
        AF0 af0B = AbstractC2123aN1.b(af0, (C5826m71) c1902Yd1.a.b);
        Iterable iterableE = af0B != null ? e(af0B, c1902Yd1) : null;
        if (iterableE == null) {
            iterableE = MN.a;
        }
        return AbstractC8069xu.N(list2, iterableE);
    }

    public static C0733Jd1 f(List list, I5 i5, InterfaceC1200Pd1 interfaceC1200Pd1, CD cd) {
        C0733Jd1 c0733Jd1J0;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C3360dH) it.next()).getClass();
            if (i5.isEmpty()) {
                C0733Jd1.b.getClass();
                c0733Jd1J0 = C0733Jd1.c;
            } else {
                CC0 cc0 = C0733Jd1.b;
                List listE = AbstractC8259yu.e(new L5(i5));
                cc0.getClass();
                c0733Jd1J0 = CC0.J0(listE);
            }
            arrayList.add(c0733Jd1J0);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0314Du.m(arrayList2, (Iterable) it2.next());
        }
        C0733Jd1.b.getClass();
        return CC0.J0(arrayList2);
    }

    public static final InterfaceC7492us h(C1902Yd1 c1902Yd1, AF0 af0, int i) {
        C0074As c0074AsA = CB1.a((InterfaceC1637Ut0) c1902Yd1.a.d, i);
        C0028Ac1 c0028Ac1L = AbstractC4175hY0.l(AbstractC4175hY0.k(af0, new C1746Wd1(c1902Yd1, 2)), XS0.B);
        ArrayList arrayList = new ArrayList();
        Iterator it = c0028Ac1L.iterator();
        while (true) {
            C8397zc1 c8397zc1 = (C8397zc1) it;
            if (!c8397zc1.hasNext()) {
                break;
            }
            arrayList.add(c8397zc1.next());
        }
        int iF = AbstractC4175hY0.f(AbstractC4175hY0.k(c0074AsA, C1824Xd1.a));
        while (arrayList.size() < iF) {
            arrayList.add(0);
        }
        return ((C7955xI) c1902Yd1.a.c).l.B(c0074AsA, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return AbstractC8069xu.b0(this.g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final InterfaceC5925me1 c(int i) {
        InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) this.g.get(Integer.valueOf(i));
        if (interfaceC5925me1 != null) {
            return interfaceC5925me1;
        }
        C1902Yd1 c1902Yd1 = this.b;
        if (c1902Yd1 != null) {
            return c1902Yd1.c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x037a A[PHI: r4
  0x037a: PHI (r4v11 X01) = (r4v9 X01), (r4v16 X01) binds: [B:326:0x0395, B:320:0x036c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.X01 d(defpackage.AF0 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1902Yd1.d(AF0, boolean):X01");
    }

    public final AbstractC0663Ig0 g(AF0 af0) {
        O90.f(af0, "proto");
        if (!((af0.c & 2) == 2)) {
            return d(af0, true);
        }
        C1666Vd c1666Vd = this.a;
        String string = ((InterfaceC1637Ut0) c1666Vd.d).getString(af0.f);
        X01 x01D = d(af0, true);
        C5826m71 c5826m71 = (C5826m71) c1666Vd.b;
        O90.f(c5826m71, "typeTable");
        int i = af0.c;
        AF0 af0H = (i & 4) == 4 ? af0.g : (i & 8) == 8 ? c5826m71.h(af0.h) : null;
        O90.c(af0H);
        return ((C7955xI) c1666Vd.c).j.l(af0, string, x01D, d(af0H, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        C1902Yd1 c1902Yd1 = this.b;
        if (c1902Yd1 == null) {
            str = "";
        } else {
            str = ". Child of " + c1902Yd1.c;
        }
        sb.append(str);
        return sb.toString();
    }
}
