package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Yd1 */
/* loaded from: classes2.dex */
public final class C8569Yd1 {

    /* renamed from: a */
    public final C1361Vd f14399a;

    /* renamed from: b */
    public final C8569Yd1 f14400b;

    /* renamed from: c */
    public final String f14401c;

    /* renamed from: d */
    public final String f14402d;

    /* renamed from: e */
    public final C8478Wk0 f14403e;

    /* renamed from: f */
    public final C8478Wk0 f14404f;

    /* renamed from: g */
    public final Object f14405g;

    public C8569Yd1(C1361Vd c1361Vd, C8569Yd1 c8569Yd1, List list, String str, String str2) {
        Map linkedHashMap;
        O90.m5968f(c1361Vd, "c");
        O90.m5968f(list, "typeParameterProtos");
        O90.m5968f(str, "debugName");
        this.f14399a = c1361Vd;
        this.f14400b = c8569Yd1;
        this.f14401c = str;
        this.f14402d = str2;
        C7129xI c7129xI = (C7129xI) c1361Vd.f12662c;
        this.f14403e = ((C8582Yk0) c7129xI.f45518a).m9351c(new C8465Wd1(this, 0));
        this.f14404f = ((C8582Yk0) c7129xI.f45518a).m9351c(new C8465Wd1(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = C0842NN.f7735a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                FF0 ff0 = (FF0) it.next();
                linkedHashMap.put(Integer.valueOf(ff0.f3115d), new C1403WI(this.f14399a, ff0, i));
                i++;
            }
        }
        this.f14405g = linkedHashMap;
    }

    /* renamed from: a */
    public static X01 m9325a(X01 x01, AbstractC7742Ig0 abstractC7742Ig0) {
        AbstractC11955zg0 abstractC11955zg0M1230f = CZ1.m1230f(x01);
        InterfaceC0510I5 annotations = x01.getAnnotations();
        AbstractC7742Ig0 abstractC7742Ig0M23f = A12.m23f(x01);
        List listM21d = A12.m21d(x01);
        List listM25996x = AbstractC7167xu.m25996x(1, A12.m24g(x01));
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listM25996x));
        Iterator it = listM25996x.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC10804qe1) it.next()).mo24038b());
        }
        return A12.m19b(abstractC11955zg0M1230f, annotations, abstractC7742Ig0M23f, listM21d, arrayList, abstractC7742Ig0, true).mo250P(x01.mo3798G());
    }

    /* renamed from: e */
    public static final ArrayList m9326e(AF0 af0, C8569Yd1 c8569Yd1) {
        List list = af0.f127d;
        O90.m5967e(list, "getArgumentList(...)");
        List list2 = list;
        AF0 af0M9722b = AbstractC8717aN1.m9722b(af0, (C10226m71) c8569Yd1.f14399a.f12661b);
        Iterable iterableM9326e = af0M9722b != null ? m9326e(af0M9722b, c8569Yd1) : null;
        if (iterableM9326e == null) {
            iterableM9326e = C0779MN.f7117a;
        }
        return AbstractC7167xu.m25968N(list2, iterableM9326e);
    }

    /* renamed from: f */
    public static C7789Jd1 m9327f(List list, InterfaceC0510I5 interfaceC0510I5, InterfaceC8101Pd1 interfaceC8101Pd1, InterfaceC0140CD interfaceC0140CD) {
        C7789Jd1 c7789Jd1M1005J0;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C3918dH) it.next()).getClass();
            if (interfaceC0510I5.isEmpty()) {
                C7789Jd1.f5652b.getClass();
                c7789Jd1M1005J0 = C7789Jd1.f5653c;
            } else {
                CC0 cc0 = C7789Jd1.f5652b;
                List listM26274e = AbstractC7230yu.m26274e(new C0699L5(interfaceC0510I5));
                cc0.getClass();
                c7789Jd1M1005J0 = CC0.m1005J0(listM26274e);
            }
            arrayList.add(c7789Jd1M1005J0);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0246Du.m1920m(arrayList2, (Iterable) it2.next());
        }
        C7789Jd1.f5652b.getClass();
        return CC0.m1005J0(arrayList2);
    }

    /* renamed from: h */
    public static final InterfaceC6976us m9328h(C8569Yd1 c8569Yd1, AF0 af0, int i) {
        C0055As c0055AsM1001a = CB1.m1001a((InterfaceC8392Ut0) c8569Yd1.f14399a.f12663d, i);
        C7319Ac1 c7319Ac1M18833l = AbstractC9639hY0.m18833l(AbstractC9639hY0.m18832k(af0, new C8465Wd1(c8569Yd1, 2)), XS0.f13762B);
        ArrayList arrayList = new ArrayList();
        Iterator it = c7319Ac1M18833l.iterator();
        while (true) {
            C11948zc1 c11948zc1 = (C11948zc1) it;
            if (!c11948zc1.hasNext()) {
                break;
            }
            arrayList.add(c11948zc1.next());
        }
        int iM18827f = AbstractC9639hY0.m18827f(AbstractC9639hY0.m18832k(c0055AsM1001a, C8517Xd1.f13885a));
        while (arrayList.size() < iM18827f) {
            arrayList.add(0);
        }
        return ((C7129xI) c8569Yd1.f14399a.f12662c).f45529l.m7556B(c0055AsM1001a, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* renamed from: b */
    public final List m9329b() {
        return AbstractC7167xu.m25982b0(this.f14405g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* renamed from: c */
    public final InterfaceC10292me1 m9330c(int i) {
        InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) this.f14405g.get(Integer.valueOf(i));
        if (interfaceC10292me1 != null) {
            return interfaceC10292me1;
        }
        C8569Yd1 c8569Yd1 = this.f14400b;
        if (c8569Yd1 != null) {
            return c8569Yd1.m9330c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x037a A[PHI: r4
  0x037a: PHI (r4v11 X01) = (r4v9 X01), (r4v16 X01) binds: [B:326:0x0395, B:320:0x036c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.X01 m9331d(p000.AF0 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8569Yd1.m9331d(AF0, boolean):X01");
    }

    /* renamed from: g */
    public final AbstractC7742Ig0 m9332g(AF0 af0) {
        O90.m5968f(af0, "proto");
        if (!((af0.f126c & 2) == 2)) {
            return m9331d(af0, true);
        }
        C1361Vd c1361Vd = this.f14399a;
        String string = ((InterfaceC8392Ut0) c1361Vd.f12663d).getString(af0.f129f);
        X01 x01M9331d = m9331d(af0, true);
        C10226m71 c10226m71 = (C10226m71) c1361Vd.f12661b;
        O90.m5968f(c10226m71, "typeTable");
        int i = af0.f126c;
        AF0 af0M22681h = (i & 4) == 4 ? af0.f130g : (i & 8) == 8 ? c10226m71.m22681h(af0.f131h) : null;
        O90.m5965c(af0M22681h);
        return ((C7129xI) c1361Vd.f12662c).f45527j.mo6024l(af0, string, x01M9331d, m9331d(af0M22681h, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14401c);
        C8569Yd1 c8569Yd1 = this.f14400b;
        if (c8569Yd1 == null) {
            str = "";
        } else {
            str = ". Child of " + c8569Yd1.f14401c;
        }
        sb.append(str);
        return sb.toString();
    }
}
