package p000;

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
public final class C1561Yo implements InterfaceC6385ln {

    /* renamed from: a */
    public final InterfaceC6972uo f14528a;

    /* renamed from: b */
    public final InterfaceC6972uo f14529b;

    /* renamed from: c */
    public final C9108dO1 f14530c;

    /* renamed from: d */
    public final C6322kn f14531d;

    /* renamed from: e */
    public final C0165Cc f14532e;

    /* renamed from: f */
    public final ArrayList f14533f;

    /* renamed from: g */
    public final ArrayList f14534g;

    /* renamed from: h */
    public final C8875bc1 f14535h;

    /* renamed from: i */
    public List f14536i;

    /* renamed from: j */
    public final InterfaceC0491Hn f14537j;

    /* renamed from: k */
    public final Object f14538k;

    /* renamed from: l */
    public boolean f14539l;

    /* renamed from: m */
    public InterfaceC6854sw f14540m;

    /* renamed from: n */
    public AbstractC9402fh1 f14541n;

    /* renamed from: o */
    public C9966k51 f14542o;

    /* renamed from: p */
    public final JS0 f14543p;

    /* renamed from: q */
    public final KS0 f14544q;

    /* renamed from: r */
    public final KS0 f14545r;

    /* renamed from: s */
    public final C6205iw f14546s;

    /* renamed from: t */
    public final C6205iw f14547t;

    /* renamed from: u */
    public final C1339VH f14548u;

    public C1561Yo(InterfaceC6972uo interfaceC6972uo, InterfaceC6972uo interfaceC6972uo2, KS0 ks0, KS0 ks02, C8875bc1 c8875bc1, C9108dO1 c9108dO1, C6322kn c6322kn) {
        C6205iw c6205iw = C6205iw.f34805d;
        this.f14533f = new ArrayList();
        this.f14534g = new ArrayList();
        this.f14536i = Collections.emptyList();
        this.f14538k = new Object();
        this.f14539l = true;
        this.f14540m = null;
        this.f14548u = new C1339VH(22);
        this.f14528a = interfaceC6972uo;
        this.f14529b = interfaceC6972uo2;
        this.f14546s = c6205iw;
        this.f14547t = c6205iw;
        this.f14535h = c8875bc1;
        this.f14530c = c9108dO1;
        this.f14531d = c6322kn;
        InterfaceC0491Hn interfaceC0491Hn = ks0.f6117d;
        this.f14537j = interfaceC0491Hn;
        this.f14543p = new JS0(interfaceC6972uo.mo1333g(), interfaceC0491Hn.mo3592V());
        this.f14544q = ks0;
        this.f14545r = ks02;
        this.f14532e = m9362v(ks0, ks02);
    }

    /* renamed from: B */
    public static boolean m9356B(C0419Ge c0419Ge, C11812yY0 c11812yY0) {
        C7882Ky0 c7882Ky0 = c11812yY0.f46304g.f12779b;
        C3950dn c3950dn = c0419Ge.f3842d;
        c3950dn.getClass();
        if (AbstractC11153tN0.m24895g(c3950dn).size() != c11812yY0.f46304g.f12779b.mo4793u().size()) {
            return true;
        }
        for (C0480Hc c0480Hc : AbstractC11153tN0.m24895g(c3950dn)) {
            if (!c7882Ky0.f6404a.containsKey(c0480Hc) || !Objects.equals(c7882Ky0.mo4794w(c0480Hc), AbstractC11153tN0.m24897i(c3950dn, c0480Hc))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m9357C(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            if (abstractC9402fh1 instanceof C11247u60) {
                InterfaceC9914jh1 interfaceC9914jh1 = abstractC9402fh1.f27337f;
                C0480Hc c0480Hc = C11375v60.f44151f;
                if (interfaceC9914jh1.mo4790Q(c0480Hc)) {
                    Integer num = (Integer) interfaceC9914jh1.mo4794w(c0480Hc);
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

    /* renamed from: D */
    public static boolean m9358D(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            if (abstractC9402fh1 instanceof C11247u60) {
                InterfaceC9914jh1 interfaceC9914jh1 = abstractC9402fh1.f27337f;
                C0480Hc c0480Hc = C11375v60.f44151f;
                if (interfaceC9914jh1.mo4790Q(c0480Hc)) {
                    Integer num = (Integer) interfaceC9914jh1.mo4794w(c0480Hc);
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

    /* renamed from: E */
    public static boolean m9359E(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            if (abstractC9402fh1 != null) {
                if (!abstractC9402fh1.f27337f.mo4790Q(InterfaceC9914jh1.f35332c1)) {
                    abstractC9402fh1.toString();
                } else if (abstractC9402fh1.f27337f.mo6166T() == EnumC10170lh1.f37254d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: J */
    public static ArrayList m9360J(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC9402fh1) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC7222ym.m26227d(it2);
            }
        }
        return arrayList2;
    }

    /* renamed from: q */
    public static Matrix m9361q(Rect rect, Size size) {
        AbstractC9104dM1.m17545d("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: v */
    public static C0165Cc m9362v(KS0 ks0, KS0 ks02) {
        StringBuilder sb = new StringBuilder();
        sb.append(ks0.f41720a.mo2393e());
        sb.append(ks02 == null ? "" : ks02.f41720a.mo2393e());
        return new C0165Cc(sb.toString(), ks0.f6117d.mo3594j0());
    }

    /* renamed from: x */
    public static HashMap m9363x(ArrayList arrayList, InterfaceC10298mh1 interfaceC10298mh1, C6322kn c6322kn) {
        InterfaceC9914jh1 interfaceC9914jh1Mo7101g;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            if (abstractC9402fh1 instanceof C9966k51) {
                C9966k51 c9966k51 = (C9966k51) abstractC9402fh1;
                C9213eD0 c9213eD0M18191f = new C9327f60(2).m18191f();
                X60.m8934g(c9213eD0M18191f);
                C9085dD0 c9085dD0 = new C9085dD0(c9213eD0M18191f);
                c9085dD0.f25882p = C9085dD0.f25880w;
                InterfaceC9914jh1 interfaceC9914jh1Mo7101g2 = c9085dD0.mo7101g(false, interfaceC10298mh1);
                if (interfaceC9914jh1Mo7101g2 == null) {
                    interfaceC9914jh1Mo7101g = null;
                } else {
                    C7612Ft0 c7612Ft0M2813c = C7612Ft0.m2813c(interfaceC9914jh1Mo7101g2);
                    c7612Ft0M2813c.f6404a.remove(C81.f1226S0);
                    interfaceC9914jh1Mo7101g = ((L21) c9966k51.mo7103m(c7612Ft0M2813c)).mo4872d();
                }
            } else {
                interfaceC9914jh1Mo7101g = abstractC9402fh1.mo7101g(false, interfaceC10298mh1);
            }
            InterfaceC9914jh1 interfaceC9914jh1Mo7101g3 = abstractC9402fh1.mo7101g(true, c6322kn);
            C1498Xo c1498Xo = new C1498Xo();
            c1498Xo.f13973a = interfaceC9914jh1Mo7101g;
            c1498Xo.f13974b = interfaceC9914jh1Mo7101g3;
            map.put(abstractC9402fh1, c1498Xo);
        }
        return map;
    }

    /* renamed from: A */
    public final boolean m9364A() {
        boolean z;
        synchronized (this.f14538k) {
            z = this.f14537j.mo3592V() != null;
        }
        return z;
    }

    /* renamed from: F */
    public final boolean m9365F() {
        boolean z;
        synchronized (this.f14538k) {
            z = true;
            if (this.f14537j.mo3591N() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: G */
    public final void m9366G(ArrayList arrayList) {
        synchronized (this.f14538k) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f14533f);
            linkedHashSet.removeAll(arrayList);
            InterfaceC6972uo interfaceC6972uo = this.f14529b;
            m9371M(linkedHashSet, interfaceC6972uo != null, interfaceC6972uo != null);
        }
    }

    /* renamed from: H */
    public final void m9367H() {
        synchronized (this.f14538k) {
            try {
                if (this.f14540m != null) {
                    this.f14528a.mo1333g().mo903E(this.f14540m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: I */
    public final void m9368I() {
        C0779MN c0779mn = C0779MN.f7117a;
        synchronized (this.f14538k) {
            this.f14536i = c0779mn;
        }
    }

    /* renamed from: K */
    public final void m9369K() {
        synchronized (this.f14538k) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00bd  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9370L(java.util.LinkedHashSet r7) {
        /*
            r6 = this;
            boolean r0 = r6.m9364A()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = m9359E(r7)
            if (r0 == 0) goto Le
            return r1
        Le:
            uo r0 = r6.f14528a
            ro r0 = r0.mo1341o()
            java.lang.String r0 = r0.mo2393e()
            VH r2 = r6.f14548u
            java.lang.Object r3 = r2.f12486b
            androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk r3 = (androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk) r3
            r4 = 0
            if (r3 == 0) goto L62
            java.util.HashSet r2 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.f15957a
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
            boolean r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.m9897e(r7)
            if (r7 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r4
        L4c:
            r4 = r1
            goto Le8
        L4f:
            boolean r2 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.m9896d()
            if (r2 == 0) goto Le8
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4b
            boolean r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.m9897e(r7)
            if (r7 == 0) goto L4b
            goto L4c
        L62:
            java.lang.Object r2 = r2.f12487c
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r2 = (androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk) r2
            if (r2 == 0) goto Le8
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r2 = androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.f15962a
            java.lang.String r2 = "cameraId"
            p000.O90.m5968f(r0, r2)
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r2 = androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.f15962a
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
            fh1 r2 = (p000.AbstractC9402fh1) r2
            boolean r2 = r2 instanceof p000.C9085dD0
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
            fh1 r2 = (p000.AbstractC9402fh1) r2
            jh1 r3 = r2.f27337f
            Hc r5 = p000.InterfaceC9914jh1.f35332c1
            boolean r3 = r3.mo4790Q(r5)
            if (r3 == 0) goto Lc1
            jh1 r2 = r2.f27337f
            lh1 r2 = r2.mo6166T()
            lh1 r3 = p000.EnumC10170lh1.f37254d
            if (r2 != r3) goto Lc1
            r7 = r1
        Le2:
            if (r0 == 0) goto L4b
            if (r7 == 0) goto L4b
            goto L4c
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1561Yo.m9370L(java.util.LinkedHashSet):boolean");
    }

    /* renamed from: M */
    public final void m9371M(LinkedHashSet linkedHashSet, boolean z, boolean z2) {
        HashMap map;
        C0419Ge c0419Ge;
        C3950dn c3950dn;
        synchronized (this.f14538k) {
            try {
                m9378s(linkedHashSet);
                if (!z && m9370L(linkedHashSet)) {
                    m9371M(linkedHashSet, true, z2);
                    return;
                }
                C9966k51 c9966k51M9379t = m9379t(linkedHashSet, z);
                AbstractC9402fh1 abstractC9402fh1M9376p = m9376p(linkedHashSet, c9966k51M9379t);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (abstractC9402fh1M9376p != null) {
                    arrayList.add(abstractC9402fh1M9376p);
                }
                if (c9966k51M9379t != null) {
                    arrayList.add(c9966k51M9379t);
                    arrayList.removeAll(c9966k51M9379t.f36293p.f6835a);
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f14534g);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f14534g);
                ArrayList arrayList4 = new ArrayList(this.f14534g);
                arrayList4.removeAll(arrayList);
                HashMap mapM9363x = m9363x(arrayList2, this.f14537j.mo3593j(), this.f14531d);
                Map mapEmptyMap = Collections.emptyMap();
                try {
                    HashMap map2 = mapM9363x;
                    HashMap mapM9377r = m9377r(m9381w(), this.f14528a.mo1341o(), arrayList2, arrayList3, map2);
                    if (this.f14529b != null) {
                        int iM9381w = m9381w();
                        InterfaceC6972uo interfaceC6972uo = this.f14529b;
                        Objects.requireNonNull(interfaceC6972uo);
                        map = mapM9377r;
                        mapEmptyMap = m9377r(iM9381w, interfaceC6972uo.mo1341o(), arrayList2, arrayList3, map2);
                    } else {
                        map = mapM9377r;
                    }
                    Map map3 = mapEmptyMap;
                    m9372N(map, arrayList);
                    ArrayList arrayListM9360J = m9360J(arrayList, this.f14536i);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListM9360J2 = m9360J(arrayList5, arrayListM9360J);
                    if (arrayListM9360J2.size() > 0) {
                        arrayListM9360J2.toString();
                        AbstractC7806Jm0.m4412f("CameraUseCaseAdapter");
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9402fh1) it.next()).m18269D(this.f14528a);
                    }
                    this.f14528a.mo1337k(arrayList4);
                    if (this.f14529b != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it2.next();
                            InterfaceC6972uo interfaceC6972uo2 = this.f14529b;
                            Objects.requireNonNull(interfaceC6972uo2);
                            abstractC9402fh1.m18269D(interfaceC6972uo2);
                        }
                        InterfaceC6972uo interfaceC6972uo3 = this.f14529b;
                        Objects.requireNonNull(interfaceC6972uo3);
                        interfaceC6972uo3.mo1337k(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            AbstractC9402fh1 abstractC9402fh12 = (AbstractC9402fh1) it3.next();
                            if (map.containsKey(abstractC9402fh12) && (c3950dn = (c0419Ge = (C0419Ge) map.get(abstractC9402fh12)).f3842d) != null && m9356B(c0419Ge, abstractC9402fh12.f27344m)) {
                                abstractC9402fh12.f27338g = abstractC9402fh12.mo7107x(c3950dn);
                                if (this.f14539l) {
                                    this.f14528a.mo1335i(abstractC9402fh12);
                                    InterfaceC6972uo interfaceC6972uo4 = this.f14529b;
                                    if (interfaceC6972uo4 != null) {
                                        interfaceC6972uo4.mo1335i(abstractC9402fh12);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        AbstractC9402fh1 abstractC9402fh13 = (AbstractC9402fh1) it4.next();
                        HashMap map4 = map2;
                        C1498Xo c1498Xo = (C1498Xo) map4.get(abstractC9402fh13);
                        Objects.requireNonNull(c1498Xo);
                        InterfaceC6972uo interfaceC6972uo5 = this.f14529b;
                        if (interfaceC6972uo5 != null) {
                            abstractC9402fh13.m18272b(this.f14528a, interfaceC6972uo5, c1498Xo.f13973a, c1498Xo.f13974b);
                            C0419Ge c0419Ge2 = (C0419Ge) map.get(abstractC9402fh13);
                            c0419Ge2.getClass();
                            abstractC9402fh13.f27338g = abstractC9402fh13.mo7108y(c0419Ge2, (C0419Ge) map3.get(abstractC9402fh13));
                        } else {
                            abstractC9402fh13.m18272b(this.f14528a, null, c1498Xo.f13973a, c1498Xo.f13974b);
                            C0419Ge c0419Ge3 = (C0419Ge) map.get(abstractC9402fh13);
                            c0419Ge3.getClass();
                            abstractC9402fh13.f27338g = abstractC9402fh13.mo7108y(c0419Ge3, null);
                        }
                        map2 = map4;
                    }
                    if (this.f14539l) {
                        this.f14528a.mo1338l(arrayList2);
                        InterfaceC6972uo interfaceC6972uo6 = this.f14529b;
                        if (interfaceC6972uo6 != null) {
                            interfaceC6972uo6.mo1338l(arrayList2);
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC9402fh1) it5.next()).m18285r();
                    }
                    this.f14533f.clear();
                    this.f14533f.addAll(linkedHashSet);
                    this.f14534g.clear();
                    this.f14534g.addAll(arrayList);
                    this.f14541n = abstractC9402fh1M9376p;
                    this.f14542o = c9966k51M9379t;
                } catch (IllegalArgumentException e) {
                    if (z || m9364A() || this.f14535h.f17088a == 2) {
                        throw e;
                    }
                    m9371M(linkedHashSet, true, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: N */
    public final void m9372N(HashMap map, ArrayList arrayList) {
        synchronized (this.f14538k) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
                    Rect rectMo905P = this.f14528a.mo1333g().mo905P();
                    C0419Ge c0419Ge = (C0419Ge) map.get(abstractC9402fh1);
                    c0419Ge.getClass();
                    abstractC9402fh1.mo18267A(m9361q(rectMo905P, c0419Ge.f3839a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC6385ln
    /* renamed from: b */
    public final InterfaceC6766ro mo1328b() {
        return this.f14544q;
    }

    /* renamed from: d */
    public final void m9373d(Collection collection) {
        synchronized (this.f14538k) {
            try {
                this.f14528a.mo1329c(this.f14537j);
                InterfaceC6972uo interfaceC6972uo = this.f14529b;
                if (interfaceC6972uo != null) {
                    interfaceC6972uo.mo1329c(this.f14537j);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f14533f);
                linkedHashSet.addAll(collection);
                try {
                    InterfaceC6972uo interfaceC6972uo2 = this.f14529b;
                    m9371M(linkedHashSet, interfaceC6972uo2 != null, interfaceC6972uo2 != null);
                } catch (IllegalArgumentException e) {
                    throw new C1435Wo(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m9374f() {
        synchronized (this.f14538k) {
            try {
                if (!this.f14539l) {
                    if (!this.f14534g.isEmpty()) {
                        this.f14528a.mo1329c(this.f14537j);
                        InterfaceC6972uo interfaceC6972uo = this.f14529b;
                        if (interfaceC6972uo != null) {
                            interfaceC6972uo.mo1329c(this.f14537j);
                        }
                    }
                    this.f14528a.mo1338l(this.f14534g);
                    InterfaceC6972uo interfaceC6972uo2 = this.f14529b;
                    if (interfaceC6972uo2 != null) {
                        interfaceC6972uo2.mo1338l(this.f14534g);
                    }
                    m9367H();
                    Iterator it = this.f14534g.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9402fh1) it.next()).m18285r();
                    }
                    this.f14539l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final void m9375i() {
        synchronized (this.f14538k) {
            InterfaceC1560Yn interfaceC1560YnMo1333g = this.f14528a.mo1333g();
            this.f14540m = interfaceC1560YnMo1333g.mo923n0();
            interfaceC1560YnMo1333g.mo926z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00bb  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC9402fh1 m9376p(java.util.LinkedHashSet r8, p000.C9966k51 r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f14538k
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L18
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
            Ll1 r8 = r9.f36293p     // Catch: java.lang.Throwable -> L15
            java.util.HashSet r8 = r8.f6835a     // Catch: java.lang.Throwable -> L15
            r1.removeAll(r8)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r8 = move-exception
            goto Lbe
        L18:
            boolean r8 = r7.m9365F()     // Catch: java.lang.Throwable -> L15
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
            fh1 r4 = (p000.AbstractC9402fh1) r4     // Catch: java.lang.Throwable -> L15
            boolean r6 = r4 instanceof p000.C9085dD0     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L41
            boolean r6 = r4 instanceof p000.C9966k51     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L3b
            goto L41
        L3b:
            boolean r4 = r4 instanceof p000.C11247u60     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L25
            r2 = r5
            goto L25
        L41:
            r3 = r5
            goto L25
        L43:
            if (r2 == 0) goto L7a
            if (r3 != 0) goto L7a
            fh1 r8 = r7.f14541n     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof p000.C9085dD0     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L4f
            goto Lbc
        L4f:
            f60 r8 = new f60     // Catch: java.lang.Throwable -> L15
            r9 = 2
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "Preview-Extra"
            Hc r1 = p000.C81.f1225R0     // Catch: java.lang.Throwable -> L15
            Ft0 r2 = r8.f27076b     // Catch: java.lang.Throwable -> L15
            r2.m2815e(r1, r9)     // Catch: java.lang.Throwable -> L15
            eD0 r8 = r8.m18191f()     // Catch: java.lang.Throwable -> L15
            p000.X60.m8934g(r8)     // Catch: java.lang.Throwable -> L15
            dD0 r9 = new dD0     // Catch: java.lang.Throwable -> L15
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L15
            C20 r8 = p000.C9085dD0.f25880w     // Catch: java.lang.Throwable -> L15
            r9.f25882p = r8     // Catch: java.lang.Throwable -> L15
            il r8 = new il     // Catch: java.lang.Throwable -> L15
            r1 = 9
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r9.m17506H(r8)     // Catch: java.lang.Throwable -> L15
            r8 = r9
            goto Lbc
        L7a:
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r9
        L7f:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L15
            fh1 r2 = (p000.AbstractC9402fh1) r2     // Catch: java.lang.Throwable -> L15
            boolean r3 = r2 instanceof p000.C9085dD0     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L9a
            boolean r3 = r2 instanceof p000.C9966k51     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L94
            goto L9a
        L94:
            boolean r2 = r2 instanceof p000.C11247u60     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L7f
            r1 = r5
            goto L7f
        L9a:
            r9 = r5
            goto L7f
        L9c:
            if (r9 == 0) goto Lbb
            if (r1 != 0) goto Lbb
            fh1 r8 = r7.f14541n     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof p000.C11247u60     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto La7
            goto Lbc
        La7:
            f60 r8 = new f60     // Catch: java.lang.Throwable -> L15
            r9 = 1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "ImageCapture-Extra"
            Hc r1 = p000.C81.f1225R0     // Catch: java.lang.Throwable -> L15
            Ft0 r2 = r8.f27076b     // Catch: java.lang.Throwable -> L15
            r2.m2815e(r1, r9)     // Catch: java.lang.Throwable -> L15
            u60 r8 = r8.m18188a()     // Catch: java.lang.Throwable -> L15
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C1561Yo.m9376p(java.util.LinkedHashSet, k51):fh1");
    }

    /* renamed from: r */
    public final HashMap m9377r(int i, InterfaceC6766ro interfaceC6766ro, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        C9108dO1 c9108dO1;
        Rect rectMo905P;
        ArrayList arrayList3 = new ArrayList();
        String strMo2393e = interfaceC6766ro.mo2393e();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c9108dO1 = this.f14530c;
            if (!zHasNext) {
                break;
            }
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            int iMo5267p = abstractC9402fh1.f27337f.mo5267p();
            Size sizeM18273c = abstractC9402fh1.m18273c();
            H61 h61 = (H61) ((HashMap) c9108dO1.f26012b).get(strMo2393e);
            C0545Ie c0545IeM3959b = h61 != null ? C0545Ie.m3959b(i, iMo5267p, sizeM18273c, h61.m3309i(iMo5267p)) : null;
            int iMo5267p2 = abstractC9402fh1.f27337f.mo5267p();
            Size sizeM18273c2 = abstractC9402fh1.m18273c();
            C0419Ge c0419Ge = abstractC9402fh1.f27338g;
            c0419Ge.getClass();
            C6691qc c6691qc = new C6691qc(c0545IeM3959b, iMo5267p2, sizeM18273c2, c0419Ge.f3840b, C9966k51.m22152J(abstractC9402fh1), abstractC9402fh1.f27338g.f3842d, abstractC9402fh1.f27337f.mo6168Z(null));
            arrayList3.add(c6691qc);
            map3.put(c6691qc, abstractC9402fh1);
            map2.put(abstractC9402fh1, abstractC9402fh1.f27338g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectMo905P = this.f14528a.mo1333g().mo905P();
            } catch (NullPointerException unused) {
                rectMo905P = null;
            }
            C7608Fr0 c7608Fr0 = new C7608Fr0(interfaceC6766ro, rectMo905P != null ? AbstractC11184tc1.m24951e(rectMo905P) : null);
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                AbstractC9402fh1 abstractC9402fh12 = (AbstractC9402fh1) it2.next();
                C1498Xo c1498Xo = (C1498Xo) map.get(abstractC9402fh12);
                InterfaceC9914jh1 interfaceC9914jh1M18282o = abstractC9402fh12.m18282o(interfaceC6766ro, c1498Xo.f13973a, c1498Xo.f13974b);
                map4.put(interfaceC9914jh1M18282o, abstractC9402fh12);
                map5.put(interfaceC9914jh1M18282o, c7608Fr0.m2803e(interfaceC9914jh1M18282o));
                InterfaceC9914jh1 interfaceC9914jh1 = abstractC9402fh12.f27337f;
                if (interfaceC9914jh1 instanceof C9213eD0) {
                    C9213eD0 c9213eD0 = (C9213eD0) interfaceC9914jh1;
                    c9213eD0.getClass();
                    z = F91.m2522e(c9213eD0) == 2;
                }
            }
            boolean zM9359E = m9359E(arrayList);
            c9108dO1.getClass();
            AbstractC9104dM1.m17545d("No new use cases to be bound.", !map5.isEmpty());
            H61 h612 = (H61) ((HashMap) c9108dO1.f26012b).get(strMo2393e);
            if (h612 == null) {
                throw new IllegalArgumentException(AbstractC7222ym.m26245v("No such camera id in supported combination list: ", strMo2393e));
            }
            Pair pairM3307g = h612.m3307g(i, arrayList3, map5, z, zM9359E);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((AbstractC9402fh1) entry.getValue(), (C0419Ge) ((Map) pairM3307g.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairM3307g.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((AbstractC9402fh1) map3.get(entry2.getKey()), (C0419Ge) entry2.getValue());
                }
            }
        }
        return map2;
    }

    /* renamed from: s */
    public final void m9378s(LinkedHashSet linkedHashSet) {
        if (m9364A()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C0149CM c0149cmMo5266k = ((AbstractC9402fh1) it.next()).f27337f.mo5266k();
                boolean z = false;
                boolean z2 = c0149cmMo5266k.f1337b == 10;
                int i = c0149cmMo5266k.f1336a;
                if (i != 1 && i != 0) {
                    z = true;
                }
                if (z2 || z) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if (m9358D(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
            if (m9357C(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f14538k) {
            try {
                if (!this.f14536i.isEmpty() && (m9358D(linkedHashSet) || m9357C(linkedHashSet))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    /* renamed from: t */
    public final C9966k51 m9379t(LinkedHashSet linkedHashSet, boolean z) {
        boolean z2;
        synchronized (this.f14538k) {
            try {
                HashSet hashSetM9382y = m9382y(linkedHashSet, z);
                if (hashSetM9382y.size() < 2 && (!m9364A() || !m9359E(hashSetM9382y))) {
                    return null;
                }
                C9966k51 c9966k51 = this.f14542o;
                if (c9966k51 != null && c9966k51.f36293p.f6835a.equals(hashSetM9382y)) {
                    C9966k51 c9966k512 = this.f14542o;
                    Objects.requireNonNull(c9966k512);
                    return c9966k512;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = hashSetM9382y.iterator();
                while (it.hasNext()) {
                    AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        Iterator it2 = abstractC9402fh1.mo7102k().iterator();
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
                return new C9966k51(this.f14528a, this.f14529b, this.f14546s, this.f14547t, hashSetM9382y, this.f14531d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m9380u() {
        synchronized (this.f14538k) {
            try {
                if (this.f14539l) {
                    this.f14528a.mo1337k(new ArrayList(this.f14534g));
                    InterfaceC6972uo interfaceC6972uo = this.f14529b;
                    if (interfaceC6972uo != null) {
                        interfaceC6972uo.mo1337k(new ArrayList(this.f14534g));
                    }
                    m9375i();
                    this.f14539l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final int m9381w() {
        synchronized (this.f14538k) {
            try {
                return this.f14535h.f17088a == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final HashSet m9382y(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f14538k) {
            Iterator it = this.f14536i.iterator();
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
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it2.next();
            AbstractC9104dM1.m17545d("Only support one level of sharing for now.", !(abstractC9402fh1 instanceof C9966k51));
            Iterator it3 = abstractC9402fh1.mo7102k().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    if ((i & iIntValue) == iIntValue) {
                        hashSet.add(abstractC9402fh1);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: z */
    public final List m9383z() {
        ArrayList arrayList;
        synchronized (this.f14538k) {
            arrayList = new ArrayList(this.f14533f);
        }
        return arrayList;
    }
}
