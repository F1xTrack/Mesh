package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Size;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: Yo */
/* loaded from: classes.dex */
public final class C1933Yo implements InterfaceC5759ln {
    public final InterfaceC7480uo a;
    public final InterfaceC7480uo b;
    public final C3383dO1 c;
    public final C5568kn d;
    public final C0182Cc e;
    public final ArrayList f;
    public final ArrayList g;
    public final C2359bc1 h;
    public List i;
    public final InterfaceC0605Hn j;
    public final Object k;
    public boolean l;
    public InterfaceC7122sw m;
    public AbstractC3821fh1 n;
    public C5438k51 o;
    public final JS0 p;
    public final KS0 q;
    public final KS0 r;
    public final C5213iw s;
    public final C5213iw t;
    public final VH u;

    public C1933Yo(InterfaceC7480uo interfaceC7480uo, InterfaceC7480uo interfaceC7480uo2, KS0 ks0, KS0 ks02, C2359bc1 c2359bc1, C3383dO1 c3383dO1, C5568kn c5568kn) {
        C5213iw c5213iw = C5213iw.d;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = Collections.emptyList();
        this.k = new Object();
        this.l = true;
        this.m = null;
        this.u = new VH(22);
        this.a = interfaceC7480uo;
        this.b = interfaceC7480uo2;
        this.s = c5213iw;
        this.t = c5213iw;
        this.h = c2359bc1;
        this.c = c3383dO1;
        this.d = c5568kn;
        InterfaceC0605Hn interfaceC0605Hn = ks0.d;
        this.j = interfaceC0605Hn;
        this.p = new JS0(interfaceC7480uo.g(), interfaceC0605Hn.V());
        this.q = ks0;
        this.r = ks02;
        this.e = v(ks0, ks02);
    }

    public static boolean B(C0500Ge c0500Ge, C8194yY0 c8194yY0) {
        C0873Ky0 c0873Ky0 = c8194yY0.g.b;
        C3456dn c3456dn = c0500Ge.d;
        c3456dn.getClass();
        if (AbstractC7209tN0.g(c3456dn).size() != c8194yY0.g.b.u().size()) {
            return true;
        }
        for (C0572Hc c0572Hc : AbstractC7209tN0.g(c3456dn)) {
            if (!c0873Ky0.a.containsKey(c0572Hc) || !Objects.equals(c0873Ky0.w(c0572Hc), AbstractC7209tN0.i(c3456dn, c0572Hc))) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            if (abstractC3821fh1 instanceof C7349u60) {
                InterfaceC5361jh1 interfaceC5361jh1 = abstractC3821fh1.f;
                C0572Hc c0572Hc = C7540v60.f;
                if (interfaceC5361jh1.Q(c0572Hc)) {
                    Integer num = (Integer) interfaceC5361jh1.w(c0572Hc);
                    num.getClass();
                    if (num.intValue() == 2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean D(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            if (abstractC3821fh1 instanceof C7349u60) {
                InterfaceC5361jh1 interfaceC5361jh1 = abstractC3821fh1.f;
                C0572Hc c0572Hc = C7540v60.f;
                if (interfaceC5361jh1.Q(c0572Hc)) {
                    Integer num = (Integer) interfaceC5361jh1.w(c0572Hc);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean E(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            if (abstractC3821fh1 != null) {
                if (!abstractC3821fh1.f.Q(InterfaceC5361jh1.c1)) {
                    abstractC3821fh1.toString();
                } else if (abstractC3821fh1.f.T() == EnumC5743lh1.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList J(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3821fh1) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC8235ym.d(it2);
            }
        }
        return arrayList2;
    }

    public static Matrix q(Rect rect, Size size) {
        AbstractC3377dM1.d("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static C0182Cc v(KS0 ks0, KS0 ks02) {
        StringBuilder sb = new StringBuilder();
        sb.append(ks0.a.e());
        sb.append(ks02 == null ? "" : ks02.a.e());
        return new C0182Cc(sb.toString(), ks0.d.j0());
    }

    public static HashMap x(ArrayList arrayList, InterfaceC5934mh1 interfaceC5934mh1, C5568kn c5568kn) {
        InterfaceC5361jh1 interfaceC5361jh1G;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            if (abstractC3821fh1 instanceof C5438k51) {
                C5438k51 c5438k51 = (C5438k51) abstractC3821fh1;
                C3539eD0 c3539eD0F = new C3709f60(2).f();
                X60.g(c3539eD0F);
                C3349dD0 c3349dD0 = new C3349dD0(c3539eD0F);
                c3349dD0.p = C3349dD0.w;
                InterfaceC5361jh1 interfaceC5361jh1G2 = c3349dD0.g(false, interfaceC5934mh1);
                if (interfaceC5361jh1G2 == null) {
                    interfaceC5361jh1G = null;
                } else {
                    C0468Ft0 c0468Ft0C = C0468Ft0.c(interfaceC5361jh1G2);
                    c0468Ft0C.a.remove(C81.S0);
                    interfaceC5361jh1G = ((L21) c5438k51.m(c0468Ft0C)).d();
                }
            } else {
                interfaceC5361jh1G = abstractC3821fh1.g(false, interfaceC5934mh1);
            }
            InterfaceC5361jh1 interfaceC5361jh1G3 = abstractC3821fh1.g(true, c5568kn);
            C1855Xo c1855Xo = new C1855Xo();
            c1855Xo.a = interfaceC5361jh1G;
            c1855Xo.b = interfaceC5361jh1G3;
            map.put(abstractC3821fh1, c1855Xo);
        }
        return map;
    }

    public final boolean A() {
        boolean z;
        synchronized (this.k) {
            z = this.j.V() != null;
        }
        return z;
    }

    public final boolean F() {
        boolean z;
        synchronized (this.k) {
            z = true;
            if (this.j.N() != 1) {
                z = false;
            }
        }
        return z;
    }

    public final void G(ArrayList arrayList) {
        synchronized (this.k) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f);
            linkedHashSet.removeAll(arrayList);
            InterfaceC7480uo interfaceC7480uo = this.b;
            M(linkedHashSet, interfaceC7480uo != null, interfaceC7480uo != null);
        }
    }

    public final void H() {
        synchronized (this.k) {
            try {
                if (this.m != null) {
                    this.a.g().E(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I() {
        MN mn = MN.a;
        synchronized (this.k) {
            this.i = mn;
        }
    }

    public final void K() {
        synchronized (this.k) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(java.util.LinkedHashSet r7) {
        /*
            r6 = this;
            boolean r0 = r6.A()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = E(r7)
            if (r0 == 0) goto Le
            return r1
        Le:
            uo r0 = r6.a
            ro r0 = r0.o()
            java.lang.String r0 = r0.e()
            VH r2 = r6.u
            java.lang.Object r3 = r2.b
            androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk r3 = (androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk) r3
            r4 = 0
            if (r3 == 0) goto L62
            java.util.HashSet r2 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.a
            java.lang.String r2 = "oneplus"
            java.lang.String r3 = android.os.Build.BRAND
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L39
            java.lang.String r2 = "cph2583"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L39
            r2 = r1
            goto L3a
        L39:
            r2 = r4
        L3a:
            java.lang.String r3 = "1"
            if (r2 == 0) goto L4f
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4b
            boolean r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.e(r7)
            if (r7 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r4
        L4c:
            r4 = r1
            goto Le8
        L4f:
            boolean r2 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.d()
            if (r2 == 0) goto Le8
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4b
            boolean r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.e(r7)
            if (r7 == 0) goto L4b
            goto L4c
        L62:
            java.lang.Object r2 = r2.c
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r2 = (androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk) r2
            if (r2 == 0) goto Le8
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r2 = androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.a
            java.lang.String r2 = "cameraId"
            defpackage.O90.f(r0, r2)
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r2 = androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.a
            r2.getClass()
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "motorola"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto Le8
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r3 = "moto e20"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto Le8
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Le8
            int r0 = r7.size()
            r2 = 2
            if (r0 == r2) goto L98
            goto Le8
        L98:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto La0
        L9e:
            r0 = r4
            goto Lb5
        La0:
            java.util.Iterator r0 = r7.iterator()
        La4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r0.next()
            fh1 r2 = (defpackage.AbstractC3821fh1) r2
            boolean r2 = r2 instanceof defpackage.C3349dD0
            if (r2 == 0) goto La4
            r0 = r1
        Lb5:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto Lbd
        Lbb:
            r7 = r4
            goto Le2
        Lbd:
            java.util.Iterator r7 = r7.iterator()
        Lc1:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r7.next()
            fh1 r2 = (defpackage.AbstractC3821fh1) r2
            jh1 r3 = r2.f
            Hc r5 = defpackage.InterfaceC5361jh1.c1
            boolean r3 = r3.Q(r5)
            if (r3 == 0) goto Lc1
            jh1 r2 = r2.f
            lh1 r2 = r2.T()
            lh1 r3 = defpackage.EnumC5743lh1.d
            if (r2 != r3) goto Lc1
            r7 = r1
        Le2:
            if (r0 == 0) goto L4b
            if (r7 == 0) goto L4b
            goto L4c
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1933Yo.L(java.util.LinkedHashSet):boolean");
    }

    public final void M(LinkedHashSet linkedHashSet, boolean z, boolean z2) {
        HashMap map;
        C0500Ge c0500Ge;
        C3456dn c3456dn;
        synchronized (this.k) {
            try {
                s(linkedHashSet);
                if (!z && L(linkedHashSet)) {
                    M(linkedHashSet, true, z2);
                    return;
                }
                C5438k51 c5438k51T = t(linkedHashSet, z);
                AbstractC3821fh1 abstractC3821fh1P = p(linkedHashSet, c5438k51T);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (abstractC3821fh1P != null) {
                    arrayList.add(abstractC3821fh1P);
                }
                if (c5438k51T != null) {
                    arrayList.add(c5438k51T);
                    arrayList.removeAll(c5438k51T.p.a);
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.g);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.g);
                ArrayList arrayList4 = new ArrayList(this.g);
                arrayList4.removeAll(arrayList);
                HashMap mapX = x(arrayList2, this.j.j(), this.d);
                Map mapEmptyMap = Collections.emptyMap();
                try {
                    HashMap map2 = mapX;
                    HashMap mapR = r(w(), this.a.o(), arrayList2, arrayList3, map2);
                    if (this.b != null) {
                        int iW = w();
                        InterfaceC7480uo interfaceC7480uo = this.b;
                        Objects.requireNonNull(interfaceC7480uo);
                        map = mapR;
                        mapEmptyMap = r(iW, interfaceC7480uo.o(), arrayList2, arrayList3, map2);
                    } else {
                        map = mapR;
                    }
                    Map map3 = mapEmptyMap;
                    N(map, arrayList);
                    ArrayList arrayListJ = J(arrayList, this.i);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListJ2 = J(arrayList5, arrayListJ);
                    if (arrayListJ2.size() > 0) {
                        arrayListJ2.toString();
                        AbstractC0759Jm0.f("CameraUseCaseAdapter");
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3821fh1) it.next()).D(this.a);
                    }
                    this.a.k(arrayList4);
                    if (this.b != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it2.next();
                            InterfaceC7480uo interfaceC7480uo2 = this.b;
                            Objects.requireNonNull(interfaceC7480uo2);
                            abstractC3821fh1.D(interfaceC7480uo2);
                        }
                        InterfaceC7480uo interfaceC7480uo3 = this.b;
                        Objects.requireNonNull(interfaceC7480uo3);
                        interfaceC7480uo3.k(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            AbstractC3821fh1 abstractC3821fh12 = (AbstractC3821fh1) it3.next();
                            if (map.containsKey(abstractC3821fh12) && (c3456dn = (c0500Ge = (C0500Ge) map.get(abstractC3821fh12)).d) != null && B(c0500Ge, abstractC3821fh12.m)) {
                                abstractC3821fh12.g = abstractC3821fh12.x(c3456dn);
                                if (this.l) {
                                    this.a.i(abstractC3821fh12);
                                    InterfaceC7480uo interfaceC7480uo4 = this.b;
                                    if (interfaceC7480uo4 != null) {
                                        interfaceC7480uo4.i(abstractC3821fh12);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        AbstractC3821fh1 abstractC3821fh13 = (AbstractC3821fh1) it4.next();
                        HashMap map4 = map2;
                        C1855Xo c1855Xo = (C1855Xo) map4.get(abstractC3821fh13);
                        Objects.requireNonNull(c1855Xo);
                        InterfaceC7480uo interfaceC7480uo5 = this.b;
                        if (interfaceC7480uo5 != null) {
                            abstractC3821fh13.b(this.a, interfaceC7480uo5, c1855Xo.a, c1855Xo.b);
                            C0500Ge c0500Ge2 = (C0500Ge) map.get(abstractC3821fh13);
                            c0500Ge2.getClass();
                            abstractC3821fh13.g = abstractC3821fh13.y(c0500Ge2, (C0500Ge) map3.get(abstractC3821fh13));
                        } else {
                            abstractC3821fh13.b(this.a, null, c1855Xo.a, c1855Xo.b);
                            C0500Ge c0500Ge3 = (C0500Ge) map.get(abstractC3821fh13);
                            c0500Ge3.getClass();
                            abstractC3821fh13.g = abstractC3821fh13.y(c0500Ge3, null);
                        }
                        map2 = map4;
                    }
                    if (this.l) {
                        this.a.l(arrayList2);
                        InterfaceC7480uo interfaceC7480uo6 = this.b;
                        if (interfaceC7480uo6 != null) {
                            interfaceC7480uo6.l(arrayList2);
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC3821fh1) it5.next()).r();
                    }
                    this.f.clear();
                    this.f.addAll(linkedHashSet);
                    this.g.clear();
                    this.g.addAll(arrayList);
                    this.n = abstractC3821fh1P;
                    this.o = c5438k51T;
                } catch (IllegalArgumentException e) {
                    if (z || A() || this.h.a == 2) {
                        throw e;
                    }
                    M(linkedHashSet, true, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N(HashMap map, ArrayList arrayList) {
        synchronized (this.k) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
                    Rect rectP = this.a.g().P();
                    C0500Ge c0500Ge = (C0500Ge) map.get(abstractC3821fh1);
                    c0500Ge.getClass();
                    abstractC3821fh1.A(q(rectP, c0500Ge.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5759ln
    public final InterfaceC6907ro b() {
        return this.q;
    }

    public final void d(Collection collection) {
        synchronized (this.k) {
            try {
                this.a.c(this.j);
                InterfaceC7480uo interfaceC7480uo = this.b;
                if (interfaceC7480uo != null) {
                    interfaceC7480uo.c(this.j);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f);
                linkedHashSet.addAll(collection);
                try {
                    InterfaceC7480uo interfaceC7480uo2 = this.b;
                    M(linkedHashSet, interfaceC7480uo2 != null, interfaceC7480uo2 != null);
                } catch (IllegalArgumentException e) {
                    throw new C1777Wo(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.k) {
            try {
                if (!this.l) {
                    if (!this.g.isEmpty()) {
                        this.a.c(this.j);
                        InterfaceC7480uo interfaceC7480uo = this.b;
                        if (interfaceC7480uo != null) {
                            interfaceC7480uo.c(this.j);
                        }
                    }
                    this.a.l(this.g);
                    InterfaceC7480uo interfaceC7480uo2 = this.b;
                    if (interfaceC7480uo2 != null) {
                        interfaceC7480uo2.l(this.g);
                    }
                    H();
                    Iterator it = this.g.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3821fh1) it.next()).r();
                    }
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.k) {
            InterfaceC1930Yn interfaceC1930YnG = this.a.g();
            this.m = interfaceC1930YnG.n0();
            interfaceC1930YnG.z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC3821fh1 p(java.util.LinkedHashSet r8, defpackage.C5438k51 r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L18
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
            Ll1 r8 = r9.p     // Catch: java.lang.Throwable -> L15
            java.util.HashSet r8 = r8.a     // Catch: java.lang.Throwable -> L15
            r1.removeAll(r8)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r8 = move-exception
            goto Lbe
        L18:
            boolean r8 = r7.F()     // Catch: java.lang.Throwable -> L15
            if (r8 == 0) goto Lbb
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r9 = 0
            r2 = r9
            r3 = r2
        L25:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            r5 = 1
            if (r4 == 0) goto L43
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L15
            fh1 r4 = (defpackage.AbstractC3821fh1) r4     // Catch: java.lang.Throwable -> L15
            boolean r6 = r4 instanceof defpackage.C3349dD0     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L41
            boolean r6 = r4 instanceof defpackage.C5438k51     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L3b
            goto L41
        L3b:
            boolean r4 = r4 instanceof defpackage.C7349u60     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L25
            r2 = r5
            goto L25
        L41:
            r3 = r5
            goto L25
        L43:
            if (r2 == 0) goto L7a
            if (r3 != 0) goto L7a
            fh1 r8 = r7.n     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof defpackage.C3349dD0     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L4f
            goto Lbc
        L4f:
            f60 r8 = new f60     // Catch: java.lang.Throwable -> L15
            r9 = 2
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "Preview-Extra"
            Hc r1 = defpackage.C81.R0     // Catch: java.lang.Throwable -> L15
            Ft0 r2 = r8.b     // Catch: java.lang.Throwable -> L15
            r2.e(r1, r9)     // Catch: java.lang.Throwable -> L15
            eD0 r8 = r8.f()     // Catch: java.lang.Throwable -> L15
            defpackage.X60.g(r8)     // Catch: java.lang.Throwable -> L15
            dD0 r9 = new dD0     // Catch: java.lang.Throwable -> L15
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L15
            C20 r8 = defpackage.C3349dD0.w     // Catch: java.lang.Throwable -> L15
            r9.p = r8     // Catch: java.lang.Throwable -> L15
            il r8 = new il     // Catch: java.lang.Throwable -> L15
            r1 = 9
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r9.H(r8)     // Catch: java.lang.Throwable -> L15
            r8 = r9
            goto Lbc
        L7a:
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r9
        L7f:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L15
            fh1 r2 = (defpackage.AbstractC3821fh1) r2     // Catch: java.lang.Throwable -> L15
            boolean r3 = r2 instanceof defpackage.C3349dD0     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L9a
            boolean r3 = r2 instanceof defpackage.C5438k51     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L94
            goto L9a
        L94:
            boolean r2 = r2 instanceof defpackage.C7349u60     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L7f
            r1 = r5
            goto L7f
        L9a:
            r9 = r5
            goto L7f
        L9c:
            if (r9 == 0) goto Lbb
            if (r1 != 0) goto Lbb
            fh1 r8 = r7.n     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof defpackage.C7349u60     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto La7
            goto Lbc
        La7:
            f60 r8 = new f60     // Catch: java.lang.Throwable -> L15
            r9 = 1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "ImageCapture-Extra"
            Hc r1 = defpackage.C81.R0     // Catch: java.lang.Throwable -> L15
            Ft0 r2 = r8.b     // Catch: java.lang.Throwable -> L15
            r2.e(r1, r9)     // Catch: java.lang.Throwable -> L15
            u60 r8 = r8.a()     // Catch: java.lang.Throwable -> L15
            goto Lbc
        Lbb:
            r8 = 0
        Lbc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r8
        Lbe:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1933Yo.p(java.util.LinkedHashSet, k51):fh1");
    }

    public final HashMap r(int i, InterfaceC6907ro interfaceC6907ro, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        C3383dO1 c3383dO1;
        Rect rectP;
        ArrayList arrayList3 = new ArrayList();
        String strE = interfaceC6907ro.e();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3383dO1 = this.c;
            if (!zHasNext) {
                break;
            }
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            int iP = abstractC3821fh1.f.p();
            Size sizeC = abstractC3821fh1.c();
            H61 h61 = (H61) ((HashMap) c3383dO1.b).get(strE);
            C0656Ie c0656IeB = h61 != null ? C0656Ie.b(i, iP, sizeC, h61.i(iP)) : null;
            int iP2 = abstractC3821fh1.f.p();
            Size sizeC2 = abstractC3821fh1.c();
            C0500Ge c0500Ge = abstractC3821fh1.g;
            c0500Ge.getClass();
            C6681qc c6681qc = new C6681qc(c0656IeB, iP2, sizeC2, c0500Ge.b, C5438k51.J(abstractC3821fh1), abstractC3821fh1.g.d, abstractC3821fh1.f.Z(null));
            arrayList3.add(c6681qc);
            map3.put(c6681qc, abstractC3821fh1);
            map2.put(abstractC3821fh1, abstractC3821fh1.g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectP = this.a.g().P();
            } catch (NullPointerException unused) {
                rectP = null;
            }
            C0462Fr0 c0462Fr0 = new C0462Fr0(interfaceC6907ro, rectP != null ? AbstractC7255tc1.e(rectP) : null);
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                AbstractC3821fh1 abstractC3821fh12 = (AbstractC3821fh1) it2.next();
                C1855Xo c1855Xo = (C1855Xo) map.get(abstractC3821fh12);
                InterfaceC5361jh1 interfaceC5361jh1O = abstractC3821fh12.o(interfaceC6907ro, c1855Xo.a, c1855Xo.b);
                map4.put(interfaceC5361jh1O, abstractC3821fh12);
                map5.put(interfaceC5361jh1O, c0462Fr0.e(interfaceC5361jh1O));
                InterfaceC5361jh1 interfaceC5361jh1 = abstractC3821fh12.f;
                if (interfaceC5361jh1 instanceof C3539eD0) {
                    C3539eD0 c3539eD0 = (C3539eD0) interfaceC5361jh1;
                    c3539eD0.getClass();
                    z = F91.e(c3539eD0) == 2;
                }
            }
            boolean zE = E(arrayList);
            c3383dO1.getClass();
            AbstractC3377dM1.d("No new use cases to be bound.", !map5.isEmpty());
            H61 h612 = (H61) ((HashMap) c3383dO1.b).get(strE);
            if (h612 == null) {
                throw new IllegalArgumentException(AbstractC8235ym.v("No such camera id in supported combination list: ", strE));
            }
            Pair pairG = h612.g(i, arrayList3, map5, z, zE);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((AbstractC3821fh1) entry.getValue(), (C0500Ge) ((Map) pairG.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairG.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((AbstractC3821fh1) map3.get(entry2.getKey()), (C0500Ge) entry2.getValue());
                }
            }
        }
        return map2;
    }

    public final void s(LinkedHashSet linkedHashSet) {
        if (A()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                CM cmK = ((AbstractC3821fh1) it.next()).f.k();
                boolean z = false;
                boolean z2 = cmK.b == 10;
                int i = cmK.a;
                if (i != 1 && i != 0) {
                    z = true;
                }
                if (z2 || z) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if (D(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
            if (C(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.k) {
            try {
                if (!this.i.isEmpty() && (D(linkedHashSet) || C(linkedHashSet))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    public final C5438k51 t(LinkedHashSet linkedHashSet, boolean z) {
        boolean z2;
        synchronized (this.k) {
            try {
                HashSet hashSetY = y(linkedHashSet, z);
                if (hashSetY.size() < 2 && (!A() || !E(hashSetY))) {
                    return null;
                }
                C5438k51 c5438k51 = this.o;
                if (c5438k51 != null && c5438k51.p.a.equals(hashSetY)) {
                    C5438k51 c5438k512 = this.o;
                    Objects.requireNonNull(c5438k512);
                    return c5438k512;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = hashSetY.iterator();
                while (it.hasNext()) {
                    AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        Iterator it2 = abstractC3821fh1.k().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            }
                            int iIntValue = ((Integer) it2.next()).intValue();
                            if ((i2 & iIntValue) == iIntValue) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (hashSet.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new C5438k51(this.a, this.b, this.s, this.t, hashSetY, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.k) {
            try {
                if (this.l) {
                    this.a.k(new ArrayList(this.g));
                    InterfaceC7480uo interfaceC7480uo = this.b;
                    if (interfaceC7480uo != null) {
                        interfaceC7480uo.k(new ArrayList(this.g));
                    }
                    i();
                    this.l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int w() {
        synchronized (this.k) {
            try {
                return this.h.a == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet y(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.k) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it2.next();
            AbstractC3377dM1.d("Only support one level of sharing for now.", !(abstractC3821fh1 instanceof C5438k51));
            Iterator it3 = abstractC3821fh1.k().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    if ((i & iIntValue) == iIntValue) {
                        hashSet.add(abstractC3821fh1);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List z() {
        ArrayList arrayList;
        synchronized (this.k) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }
}
