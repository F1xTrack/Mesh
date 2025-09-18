package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class WH {
    public C3679ey a;
    public boolean b;
    public boolean c;
    public C3679ey d;
    public ArrayList e;
    public C1258Px f;
    public C1285Qg g;
    public ArrayList h;

    public final void a(XH xh, int i, ArrayList arrayList, C5321jU0 c5321jU0) {
        AbstractC6716qn1 abstractC6716qn1 = xh.d;
        if (abstractC6716qn1.c == null) {
            C3679ey c3679ey = this.a;
            if (abstractC6716qn1 == c3679ey.d || abstractC6716qn1 == c3679ey.e) {
                return;
            }
            if (c5321jU0 == null) {
                c5321jU0 = new C5321jU0();
                c5321jU0.a = null;
                c5321jU0.b = new ArrayList();
                c5321jU0.a = abstractC6716qn1;
                arrayList.add(c5321jU0);
            }
            abstractC6716qn1.c = c5321jU0;
            c5321jU0.b.add(abstractC6716qn1);
            XH xh2 = abstractC6716qn1.h;
            Iterator it = xh2.k.iterator();
            while (it.hasNext()) {
                SH sh = (SH) it.next();
                if (sh instanceof XH) {
                    a((XH) sh, i, arrayList, c5321jU0);
                }
            }
            XH xh3 = abstractC6716qn1.i;
            Iterator it2 = xh3.k.iterator();
            while (it2.hasNext()) {
                SH sh2 = (SH) it2.next();
                if (sh2 instanceof XH) {
                    a((XH) sh2, i, arrayList, c5321jU0);
                }
            }
            if (i == 1 && (abstractC6716qn1 instanceof C0514Gi1)) {
                Iterator it3 = ((C0514Gi1) abstractC6716qn1).k.k.iterator();
                while (it3.hasNext()) {
                    SH sh3 = (SH) it3.next();
                    if (sh3 instanceof XH) {
                        a((XH) sh3, i, arrayList, c5321jU0);
                    }
                }
            }
            Iterator it4 = xh2.l.iterator();
            while (it4.hasNext()) {
                a((XH) it4.next(), i, arrayList, c5321jU0);
            }
            Iterator it5 = xh3.l.iterator();
            while (it5.hasNext()) {
                a((XH) it5.next(), i, arrayList, c5321jU0);
            }
            if (i == 1 && (abstractC6716qn1 instanceof C0514Gi1)) {
                Iterator it6 = ((C0514Gi1) abstractC6716qn1).k.l.iterator();
                while (it6.hasNext()) {
                    a((XH) it6.next(), i, arrayList, c5321jU0);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C3679ey r20) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WH.b(ey):void");
    }

    public final void c() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        C3679ey c3679ey = this.d;
        c3679ey.d.f();
        C0514Gi1 c0514Gi1 = c3679ey.e;
        c0514Gi1.f();
        arrayList.add(c3679ey.d);
        arrayList.add(c0514Gi1);
        Iterator it = c3679ey.d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3488dy c3488dy = (C3488dy) it.next();
            if (c3488dy instanceof C4077h20) {
                C4268i20 c4268i20 = new C4268i20(c3488dy);
                c3488dy.d.f();
                c3488dy.e.f();
                c4268i20.f = ((C4077h20) c3488dy).h0;
                arrayList.add(c4268i20);
            } else {
                if (c3488dy.q()) {
                    if (c3488dy.b == null) {
                        c3488dy.b = new C2402br(c3488dy, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3488dy.b);
                } else {
                    arrayList.add(c3488dy.d);
                }
                if (c3488dy.r()) {
                    if (c3488dy.c == null) {
                        c3488dy.c = new C2402br(c3488dy, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3488dy.c);
                } else {
                    arrayList.add(c3488dy.e);
                }
                if (c3488dy instanceof X20) {
                    arrayList.add(new W20(c3488dy));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC6716qn1) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC6716qn1 abstractC6716qn1 = (AbstractC6716qn1) it3.next();
            if (abstractC6716qn1.b != c3679ey) {
                abstractC6716qn1.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C3679ey c3679ey2 = this.a;
        e(c3679ey2.d, 0, arrayList2);
        e(c3679ey2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(C3679ey c3679ey, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long jMax;
        float f;
        C3679ey c3679ey2 = c3679ey;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            AbstractC6716qn1 abstractC6716qn1 = ((C5321jU0) arrayList2.get(i4)).a;
            if (!(abstractC6716qn1 instanceof C2402br) ? !(i != 0 ? (abstractC6716qn1 instanceof C0514Gi1) : (abstractC6716qn1 instanceof M30)) : ((C2402br) abstractC6716qn1).f != i) {
                XH xh = (i == 0 ? c3679ey2.d : c3679ey2.e).h;
                XH xh2 = (i == 0 ? c3679ey2.d : c3679ey2.e).i;
                boolean zContains = abstractC6716qn1.h.l.contains(xh);
                XH xh3 = abstractC6716qn1.i;
                boolean zContains2 = xh3.l.contains(xh2);
                long j = abstractC6716qn1.j();
                XH xh4 = abstractC6716qn1.h;
                if (zContains && zContains2) {
                    long jB = C5321jU0.b(xh4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jA = C5321jU0.a(xh3, 0L);
                    long j2 = jB - j;
                    int i5 = xh3.f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j2 >= (-i5)) {
                        j2 += i5;
                    }
                    long j3 = (-jA) - j;
                    long j4 = xh4.f;
                    long j5 = j3 - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C3488dy c3488dy = abstractC6716qn1.b;
                    if (i == 0) {
                        f = c3488dy.S;
                    } else if (i == 1) {
                        f = c3488dy.T;
                    } else {
                        c3488dy.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (xh4.f + ((((long) ((f2 * f) + 0.5f)) + j) + ((long) AbstractC1705Vq.d(1.0f, f, f2, 0.5f)))) - xh3.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    jMax = zContains ? Math.max(C5321jU0.b(xh4, xh4.f), xh4.f + j) : zContains2 ? Math.max(-C5321jU0.a(xh3, xh3.f), (-xh3.f) + j) : (abstractC6716qn1.j() + xh4.f) - xh3.f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4 = i3 + 1;
            c3679ey2 = c3679ey;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public final void e(AbstractC6716qn1 abstractC6716qn1, int i, ArrayList arrayList) {
        XH xh;
        Iterator it = abstractC6716qn1.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            xh = abstractC6716qn1.i;
            if (!zHasNext) {
                break;
            }
            SH sh = (SH) it.next();
            if (sh instanceof XH) {
                a((XH) sh, i, arrayList, null);
            } else if (sh instanceof AbstractC6716qn1) {
                a(((AbstractC6716qn1) sh).h, i, arrayList, null);
            }
        }
        Iterator it2 = xh.k.iterator();
        while (it2.hasNext()) {
            SH sh2 = (SH) it2.next();
            if (sh2 instanceof XH) {
                a((XH) sh2, i, arrayList, null);
            } else if (sh2 instanceof AbstractC6716qn1) {
                a(((AbstractC6716qn1) sh2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0514Gi1) abstractC6716qn1).k.k.iterator();
            while (it3.hasNext()) {
                SH sh3 = (SH) it3.next();
                if (sh3 instanceof XH) {
                    a((XH) sh3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C3488dy c3488dy) {
        C1285Qg c1285Qg = this.g;
        c1285Qg.a = i;
        c1285Qg.b = i3;
        c1285Qg.c = i2;
        c1285Qg.d = i4;
        this.f.a(c3488dy, c1285Qg);
        c3488dy.y(c1285Qg.e);
        c3488dy.v(c1285Qg.f);
        c3488dy.w = c1285Qg.h;
        int i5 = c1285Qg.g;
        c3488dy.P = i5;
        c3488dy.w = i5 > 0;
    }

    public final void g() {
        C1051Ng c1051Ng;
        Iterator it = this.a.d0.iterator();
        while (it.hasNext()) {
            C3488dy c3488dy = (C3488dy) it.next();
            if (!c3488dy.a) {
                int[] iArr = c3488dy.c0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c3488dy.j;
                int i4 = c3488dy.k;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                M30 m30 = c3488dy.d;
                MJ mj = m30.e;
                boolean z3 = mj.j;
                C0514Gi1 c0514Gi1 = c3488dy.e;
                MJ mj2 = c0514Gi1.e;
                boolean z4 = mj2.j;
                if (z3 && z4) {
                    f(1, mj.g, 1, mj2.g, c3488dy);
                    c3488dy.a = true;
                } else if (z3 && z) {
                    f(1, mj.g, 2, mj2.g, c3488dy);
                    if (i2 == 3) {
                        c0514Gi1.e.m = c3488dy.i();
                    } else {
                        c0514Gi1.e.d(c3488dy.i());
                        c3488dy.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, mj.g, 1, mj2.g, c3488dy);
                    if (i == 3) {
                        m30.e.m = c3488dy.l();
                    } else {
                        m30.e.d(c3488dy.l());
                        c3488dy.a = true;
                    }
                }
                if (c3488dy.a && (c1051Ng = c0514Gi1.l) != null) {
                    c1051Ng.d(c3488dy.P);
                }
            }
        }
    }
}
