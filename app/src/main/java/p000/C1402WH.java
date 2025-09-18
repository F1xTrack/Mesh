package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: WH */
/* loaded from: classes.dex */
public final class C1402WH {

    /* renamed from: a */
    public C4023ey f13109a;

    /* renamed from: b */
    public boolean f13110b;

    /* renamed from: c */
    public boolean f13111c;

    /* renamed from: d */
    public C4023ey f13112d;

    /* renamed from: e */
    public ArrayList f13113e;

    /* renamed from: f */
    public C1004Px f13114f;

    /* renamed from: g */
    public C1050Qg f13115g;

    /* renamed from: h */
    public ArrayList f13116h;

    /* renamed from: a */
    public final void m8740a(C1465XH c1465xh, int i, ArrayList arrayList, C9887jU0 c9887jU0) {
        AbstractC10822qn1 abstractC10822qn1 = c1465xh.f13654d;
        if (abstractC10822qn1.f41158c == null) {
            C4023ey c4023ey = this.f13109a;
            if (abstractC10822qn1 == c4023ey.f26434d || abstractC10822qn1 == c4023ey.f26435e) {
                return;
            }
            if (c9887jU0 == null) {
                c9887jU0 = new C9887jU0();
                c9887jU0.f35159a = null;
                c9887jU0.f35160b = new ArrayList();
                c9887jU0.f35159a = abstractC10822qn1;
                arrayList.add(c9887jU0);
            }
            abstractC10822qn1.f41158c = c9887jU0;
            c9887jU0.f35160b.add(abstractC10822qn1);
            C1465XH c1465xh2 = abstractC10822qn1.f41163h;
            Iterator it = c1465xh2.f13661k.iterator();
            while (it.hasNext()) {
                InterfaceC1150SH interfaceC1150SH = (InterfaceC1150SH) it.next();
                if (interfaceC1150SH instanceof C1465XH) {
                    m8740a((C1465XH) interfaceC1150SH, i, arrayList, c9887jU0);
                }
            }
            C1465XH c1465xh3 = abstractC10822qn1.f41164i;
            Iterator it2 = c1465xh3.f13661k.iterator();
            while (it2.hasNext()) {
                InterfaceC1150SH interfaceC1150SH2 = (InterfaceC1150SH) it2.next();
                if (interfaceC1150SH2 instanceof C1465XH) {
                    m8740a((C1465XH) interfaceC1150SH2, i, arrayList, c9887jU0);
                }
            }
            if (i == 1 && (abstractC10822qn1 instanceof C7643Gi1)) {
                Iterator it3 = ((C7643Gi1) abstractC10822qn1).f3857k.f13661k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1150SH interfaceC1150SH3 = (InterfaceC1150SH) it3.next();
                    if (interfaceC1150SH3 instanceof C1465XH) {
                        m8740a((C1465XH) interfaceC1150SH3, i, arrayList, c9887jU0);
                    }
                }
            }
            Iterator it4 = c1465xh2.f13662l.iterator();
            while (it4.hasNext()) {
                m8740a((C1465XH) it4.next(), i, arrayList, c9887jU0);
            }
            Iterator it5 = c1465xh3.f13662l.iterator();
            while (it5.hasNext()) {
                m8740a((C1465XH) it5.next(), i, arrayList, c9887jU0);
            }
            if (i == 1 && (abstractC10822qn1 instanceof C7643Gi1)) {
                Iterator it6 = ((C7643Gi1) abstractC10822qn1).f3857k.f13662l.iterator();
                while (it6.hasNext()) {
                    m8740a((C1465XH) it6.next(), i, arrayList, c9887jU0);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8741b(p000.C4023ey r20) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1402WH.m8741b(ey):void");
    }

    /* renamed from: c */
    public final void m8742c() {
        ArrayList arrayList = this.f13113e;
        arrayList.clear();
        C4023ey c4023ey = this.f13112d;
        c4023ey.f26434d.mo3129f();
        C7643Gi1 c7643Gi1 = c4023ey.f26435e;
        c7643Gi1.mo3129f();
        arrayList.add(c4023ey.f26434d);
        arrayList.add(c7643Gi1);
        Iterator it = c4023ey.f26968d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3960dy c3960dy = (C3960dy) it.next();
            if (c3960dy instanceof C9573h20) {
                C9701i20 c9701i20 = new C9701i20(c3960dy);
                c3960dy.f26434d.mo3129f();
                c3960dy.f26435e.mo3129f();
                c9701i20.f41161f = ((C9573h20) c3960dy).f28173h0;
                arrayList.add(c9701i20);
            } else {
                if (c3960dy.m17794q()) {
                    if (c3960dy.f26430b == null) {
                        c3960dy.f26430b = new C1811br(c3960dy, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3960dy.f26430b);
                } else {
                    arrayList.add(c3960dy.f26434d);
                }
                if (c3960dy.m17795r()) {
                    if (c3960dy.f26432c == null) {
                        c3960dy.f26432c = new C1811br(c3960dy, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3960dy.f26432c);
                } else {
                    arrayList.add(c3960dy.f26435e);
                }
                if (c3960dy instanceof X20) {
                    arrayList.add(new W20(c3960dy));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC10822qn1) it2.next()).mo3129f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC10822qn1 abstractC10822qn1 = (AbstractC10822qn1) it3.next();
            if (abstractC10822qn1.f41157b != c4023ey) {
                abstractC10822qn1.mo3127d();
            }
        }
        ArrayList arrayList2 = this.f13116h;
        arrayList2.clear();
        C4023ey c4023ey2 = this.f13109a;
        m8744e(c4023ey2.f26434d, 0, arrayList2);
        m8744e(c4023ey2.f26435e, 1, arrayList2);
        this.f13110b = false;
    }

    /* renamed from: d */
    public final int m8743d(C4023ey c4023ey, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long jMax;
        float f;
        C4023ey c4023ey2 = c4023ey;
        ArrayList arrayList2 = this.f13116h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            AbstractC10822qn1 abstractC10822qn1 = ((C9887jU0) arrayList2.get(i4)).f35159a;
            if (!(abstractC10822qn1 instanceof C1811br) ? !(i != 0 ? (abstractC10822qn1 instanceof C7643Gi1) : (abstractC10822qn1 instanceof M30)) : ((C1811br) abstractC10822qn1).f41161f != i) {
                C1465XH c1465xh = (i == 0 ? c4023ey2.f26434d : c4023ey2.f26435e).f41163h;
                C1465XH c1465xh2 = (i == 0 ? c4023ey2.f26434d : c4023ey2.f26435e).f41164i;
                boolean zContains = abstractC10822qn1.f41163h.f13662l.contains(c1465xh);
                C1465XH c1465xh3 = abstractC10822qn1.f41164i;
                boolean zContains2 = c1465xh3.f13662l.contains(c1465xh2);
                long jMo10527j = abstractC10822qn1.mo10527j();
                C1465XH c1465xh4 = abstractC10822qn1.f41163h;
                if (zContains && zContains2) {
                    long jM22052b = C9887jU0.m22052b(c1465xh4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jM22051a = C9887jU0.m22051a(c1465xh3, 0L);
                    long j = jM22052b - jMo10527j;
                    int i5 = c1465xh3.f13656f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j >= (-i5)) {
                        j += i5;
                    }
                    long j2 = (-jM22051a) - jMo10527j;
                    long j3 = c1465xh4.f13656f;
                    long j4 = j2 - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C3960dy c3960dy = abstractC10822qn1.f41157b;
                    if (i == 0) {
                        f = c3960dy.f26420S;
                    } else if (i == 1) {
                        f = c3960dy.f26421T;
                    } else {
                        c3960dy.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (c1465xh4.f13656f + ((((long) ((f2 * f) + 0.5f)) + jMo10527j) + ((long) AbstractC1374Vq.m8585d(1.0f, f, f2, 0.5f)))) - c1465xh3.f13656f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    jMax = zContains ? Math.max(C9887jU0.m22052b(c1465xh4, c1465xh4.f13656f), c1465xh4.f13656f + jMo10527j) : zContains2 ? Math.max(-C9887jU0.m22051a(c1465xh3, c1465xh3.f13656f), (-c1465xh3.f13656f) + jMo10527j) : (abstractC10822qn1.mo10527j() + c1465xh4.f13656f) - c1465xh3.f13656f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4 = i3 + 1;
            c4023ey2 = c4023ey;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    /* renamed from: e */
    public final void m8744e(AbstractC10822qn1 abstractC10822qn1, int i, ArrayList arrayList) {
        C1465XH c1465xh;
        Iterator it = abstractC10822qn1.f41163h.f13661k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1465xh = abstractC10822qn1.f41164i;
            if (!zHasNext) {
                break;
            }
            InterfaceC1150SH interfaceC1150SH = (InterfaceC1150SH) it.next();
            if (interfaceC1150SH instanceof C1465XH) {
                m8740a((C1465XH) interfaceC1150SH, i, arrayList, null);
            } else if (interfaceC1150SH instanceof AbstractC10822qn1) {
                m8740a(((AbstractC10822qn1) interfaceC1150SH).f41163h, i, arrayList, null);
            }
        }
        Iterator it2 = c1465xh.f13661k.iterator();
        while (it2.hasNext()) {
            InterfaceC1150SH interfaceC1150SH2 = (InterfaceC1150SH) it2.next();
            if (interfaceC1150SH2 instanceof C1465XH) {
                m8740a((C1465XH) interfaceC1150SH2, i, arrayList, null);
            } else if (interfaceC1150SH2 instanceof AbstractC10822qn1) {
                m8740a(((AbstractC10822qn1) interfaceC1150SH2).f41164i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C7643Gi1) abstractC10822qn1).f3857k.f13661k.iterator();
            while (it3.hasNext()) {
                InterfaceC1150SH interfaceC1150SH3 = (InterfaceC1150SH) it3.next();
                if (interfaceC1150SH3 instanceof C1465XH) {
                    m8740a((C1465XH) interfaceC1150SH3, i, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m8745f(int i, int i2, int i3, int i4, C3960dy c3960dy) {
        C1050Qg c1050Qg = this.f13115g;
        c1050Qg.f9715a = i;
        c1050Qg.f9716b = i3;
        c1050Qg.f9717c = i2;
        c1050Qg.f9718d = i4;
        this.f13114f.m6490a(c3960dy, c1050Qg);
        c3960dy.m17802y(c1050Qg.f9719e);
        c3960dy.m17799v(c1050Qg.f9720f);
        c3960dy.f26453w = c1050Qg.f9722h;
        int i5 = c1050Qg.f9721g;
        c3960dy.f26417P = i5;
        c3960dy.f26453w = i5 > 0;
    }

    /* renamed from: g */
    public final void m8746g() {
        C0861Ng c0861Ng;
        Iterator it = this.f13109a.f26968d0.iterator();
        while (it.hasNext()) {
            C3960dy c3960dy = (C3960dy) it.next();
            if (!c3960dy.f26428a) {
                int[] iArr = c3960dy.f26433c0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c3960dy.f26440j;
                int i4 = c3960dy.f26441k;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                M30 m30 = c3960dy.f26434d;
                C0775MJ c0775mj = m30.f41160e;
                boolean z3 = c0775mj.f13660j;
                C7643Gi1 c7643Gi1 = c3960dy.f26435e;
                C0775MJ c0775mj2 = c7643Gi1.f41160e;
                boolean z4 = c0775mj2.f13660j;
                if (z3 && z4) {
                    m8745f(1, c0775mj.f13657g, 1, c0775mj2.f13657g, c3960dy);
                    c3960dy.f26428a = true;
                } else if (z3 && z) {
                    m8745f(1, c0775mj.f13657g, 2, c0775mj2.f13657g, c3960dy);
                    if (i2 == 3) {
                        c7643Gi1.f41160e.f7088m = c3960dy.m17786i();
                    } else {
                        c7643Gi1.f41160e.mo5302d(c3960dy.m17786i());
                        c3960dy.f26428a = true;
                    }
                } else if (z4 && z2) {
                    m8745f(2, c0775mj.f13657g, 1, c0775mj2.f13657g, c3960dy);
                    if (i == 3) {
                        m30.f41160e.f7088m = c3960dy.m17789l();
                    } else {
                        m30.f41160e.mo5302d(c3960dy.m17789l());
                        c3960dy.f26428a = true;
                    }
                }
                if (c3960dy.f26428a && (c0861Ng = c7643Gi1.f3858l) != null) {
                    c0861Ng.mo5302d(c3960dy.f26417P);
                }
            }
        }
    }
}
