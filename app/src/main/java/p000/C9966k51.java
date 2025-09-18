package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: k51 */
/* loaded from: classes.dex */
public final class C9966k51 extends AbstractC9402fh1 {

    /* renamed from: A */
    public C11431vY0 f36291A;

    /* renamed from: o */
    public final C10094l51 f36292o;

    /* renamed from: p */
    public final C7909Ll1 f36293p;

    /* renamed from: q */
    public final C6205iw f36294q;

    /* renamed from: r */
    public final C6205iw f36295r;

    /* renamed from: s */
    public C8539Xo1 f36296s;

    /* renamed from: t */
    public C6479nH f36297t;

    /* renamed from: u */
    public R61 f36298u;

    /* renamed from: v */
    public R61 f36299v;

    /* renamed from: w */
    public R61 f36300w;

    /* renamed from: x */
    public R61 f36301x;

    /* renamed from: y */
    public C11303uY0 f36302y;

    /* renamed from: z */
    public C11303uY0 f36303z;

    public C9966k51(InterfaceC6972uo interfaceC6972uo, InterfaceC6972uo interfaceC6972uo2, C6205iw c6205iw, C6205iw c6205iw2, HashSet hashSet, C6322kn c6322kn) {
        super(m22153K(hashSet));
        this.f36292o = m22153K(hashSet);
        this.f36294q = c6205iw;
        this.f36295r = c6205iw2;
        this.f36293p = new C7909Ll1(interfaceC6972uo, interfaceC6972uo2, hashSet, c6322kn, new C8450Vw0(17, this));
    }

    /* renamed from: J */
    public static ArrayList m22152J(AbstractC9402fh1 abstractC9402fh1) {
        ArrayList arrayList = new ArrayList();
        if (abstractC9402fh1 instanceof C9966k51) {
            Iterator it = ((C9966k51) abstractC9402fh1).f36293p.f6835a.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC9402fh1) it.next()).f27337f.mo6166T());
            }
        } else {
            arrayList.add(abstractC9402fh1.f27337f.mo6166T());
        }
        return arrayList;
    }

    /* renamed from: K */
    public static C10094l51 m22153K(HashSet hashSet) {
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        new L21(c7612Ft0M2812b);
        c7612Ft0M2812b.m2815e(M60.f6992x0, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            if (abstractC9402fh1.f27337f.mo4790Q(InterfaceC9914jh1.f35332c1)) {
                arrayList.add(abstractC9402fh1.f27337f.mo6166T());
            }
        }
        c7612Ft0M2812b.m2815e(C10094l51.f36887b, arrayList);
        c7612Ft0M2812b.m2815e(Y60.f14162D0, 2);
        return new C10094l51(C7882Ky0.m4786a(c7612Ft0M2812b));
    }

    /* renamed from: F */
    public final void m22154F() {
        C11431vY0 c11431vY0 = this.f36291A;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
            this.f36291A = null;
        }
        R61 r61 = this.f36298u;
        if (r61 != null) {
            r61.m6898c();
            this.f36298u = null;
        }
        R61 r612 = this.f36299v;
        if (r612 != null) {
            r612.m6898c();
            this.f36299v = null;
        }
        R61 r613 = this.f36300w;
        if (r613 != null) {
            r613.m6898c();
            this.f36300w = null;
        }
        R61 r614 = this.f36301x;
        if (r614 != null) {
            r614.m6898c();
            this.f36301x = null;
        }
        C8539Xo1 c8539Xo1 = this.f36296s;
        if (c8539Xo1 != null) {
            c8539Xo1.m9131N();
            this.f36296s = null;
        }
        C6479nH c6479nH = this.f36297t;
        if (c6479nH != null) {
            ((C6421mM) c6479nH.f38227a).m22811d();
            DV1.m1719d(new RunnableC0204DE(11, c6479nH));
            this.f36297t = null;
        }
    }

    /* renamed from: G */
    public final List m22155G(String str, String str2, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge, C0419Ge c0419Ge2) {
        DV1.m1716a();
        C7909Ll1 c7909Ll1 = this.f36293p;
        int i = 1;
        boolean z = false;
        if (c0419Ge2 == null) {
            m22156H(str, str2, interfaceC9914jh1, c0419Ge, null);
            InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
            Objects.requireNonNull(interfaceC6972uoM18274d);
            this.f36296s = new C8539Xo1(interfaceC6972uoM18274d, new C0584JG(c0419Ge.f3840b));
            boolean z2 = this.f27340i != null;
            R61 r61 = this.f36300w;
            int iM18280l = m18280l();
            c7909Ll1.getClass();
            HashMap map = new HashMap();
            Iterator it = c7909Ll1.f6835a.iterator();
            while (it.hasNext()) {
                AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
                map.put(abstractC9402fh1, c7909Ll1.m5101q(abstractC9402fh1, c7909Ll1.f6845k, c7909Ll1.f6840f, r61, iM18280l, z2));
                i = i;
                z = false;
            }
            int i2 = i;
            C1380Vw c1380VwM9137T = this.f36296s.m9137T(new C0796Me(this.f36300w, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((AbstractC9402fh1) entry.getKey(), (R61) c1380VwM9137T.get(entry.getValue()));
            }
            c7909Ll1.m5103u(map2);
            Object[] objArr = new Object[i2];
            objArr[0] = this.f36302y.m25206d();
            ArrayList arrayList = new ArrayList(i2);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        m22156H(str, str2, interfaceC9914jh1, c0419Ge, c0419Ge2);
        Matrix matrix = this.f27341j;
        InterfaceC6972uo interfaceC6972uoM18279j = m18279j();
        Objects.requireNonNull(interfaceC6972uoM18279j);
        boolean zMo1339m = interfaceC6972uoM18279j.mo1339m();
        Rect rect = this.f27340i;
        if (rect == null) {
            Size size = c0419Ge2.f3839a;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        InterfaceC6972uo interfaceC6972uoM18279j2 = m18279j();
        Objects.requireNonNull(interfaceC6972uoM18279j2);
        int iM18278i = m18278i(interfaceC6972uoM18279j2, false);
        InterfaceC6972uo interfaceC6972uoM18279j3 = m18279j();
        Objects.requireNonNull(interfaceC6972uoM18279j3);
        R61 r612 = new R61(3, 34, c0419Ge2, matrix, zMo1339m, rect, iM18278i, -1, m18281n(interfaceC6972uoM18279j3));
        this.f36299v = r612;
        Objects.requireNonNull(m18279j());
        this.f36301x = r612;
        C11303uY0 c11303uY0M22157I = m22157I(this.f36299v, interfaceC9914jh1, c0419Ge2);
        this.f36303z = c11303uY0M22157I;
        C11431vY0 c11431vY0 = this.f36291A;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
        }
        boolean z3 = false;
        boolean z4 = true;
        C11431vY0 c11431vY02 = new C11431vY0(new C9838j51(this, str, str2, interfaceC9914jh1, c0419Ge, c0419Ge2));
        this.f36291A = c11431vY02;
        c11303uY0M22157I.f43138f = c11431vY02;
        InterfaceC6972uo interfaceC6972uoM18274d2 = m18274d();
        InterfaceC6972uo interfaceC6972uoM18279j4 = m18279j();
        C6421mM c6421mM = new C6421mM(c0419Ge.f3840b, this.f36294q, this.f36295r);
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38228b = interfaceC6972uoM18274d2;
        c6479nH.f38229c = interfaceC6972uoM18279j4;
        c6479nH.f38227a = c6421mM;
        this.f36297t = c6479nH;
        boolean z5 = this.f27340i != null;
        R61 r613 = this.f36300w;
        R61 r614 = this.f36301x;
        int iM18280l2 = m18280l();
        c7909Ll1.getClass();
        HashMap map3 = new HashMap();
        Iterator it2 = c7909Ll1.f6835a.iterator();
        while (it2.hasNext()) {
            AbstractC9402fh1 abstractC9402fh12 = (AbstractC9402fh1) it2.next();
            C1860ce c1860ceM5101q = c7909Ll1.m5101q(abstractC9402fh12, c7909Ll1.f6845k, c7909Ll1.f6840f, r613, iM18280l2, z5);
            InterfaceC6972uo interfaceC6972uo = c7909Ll1.f6841g;
            Objects.requireNonNull(interfaceC6972uo);
            map3.put(abstractC9402fh12, new C7024vd(c1860ceM5101q, c7909Ll1.m5101q(abstractC9402fh12, c7909Ll1.f6846l, interfaceC6972uo, r614, iM18280l2, z5)));
            it2 = it2;
            z4 = true;
            z3 = false;
        }
        C6479nH c6479nH2 = this.f36297t;
        C7087wd c7087wd = new C7087wd(this.f36300w, this.f36301x, new ArrayList(map3.values()));
        c6479nH2.getClass();
        DV1.m1716a();
        c6479nH2.f38231e = c7087wd;
        c6479nH2.f38230d = new C1380Vw();
        C7087wd c7087wd2 = (C7087wd) c6479nH2.f38231e;
        R61 r615 = c7087wd2.f44999a;
        Iterator it3 = c7087wd2.f45001c.iterator();
        while (it3.hasNext()) {
            C7024vd c7024vd = (C7024vd) it3.next();
            C1380Vw c1380Vw = (C1380Vw) c6479nH2.f38230d;
            C1860ce c1860ce = c7024vd.f44449a;
            Matrix matrix2 = new Matrix();
            Size sizeM24951e = AbstractC11184tc1.m24951e(c1860ce.f17669d);
            int i3 = c1860ce.f17671f;
            Size sizeM24953g = AbstractC11184tc1.m24953g(sizeM24951e, i3);
            Size size2 = c1860ce.f17670e;
            AbstractC9104dM1.m17546e(AbstractC11184tc1.m24950d(sizeM24953g, false, size2));
            Rect rect2 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            C6937uF c6937uFM3116a = r615.f10008g.m3116a();
            c6937uFM3116a.f43616a = size2;
            c1380Vw.put(c7024vd, new R61(c1860ce.f17667b, c1860ce.f17668c, c6937uFM3116a.m25140l(), matrix2, false, rect2, r615.f10010i - i3, -1, r615.f10006e != c1860ce.f17672g));
        }
        Z61 z61M6899d = r615.m6899d((InterfaceC6972uo) c6479nH2.f38228b, true);
        C6421mM c6421mM2 = (C6421mM) c6479nH2.f38227a;
        c6421mM2.m22810c(z61M6899d);
        R61 r616 = c7087wd2.f45000b;
        c6421mM2.m22810c(r616.m6899d((InterfaceC6972uo) c6479nH2.f38229c, false));
        for (Map.Entry entry2 : ((C1380Vw) c6479nH2.f38230d).entrySet()) {
            InterfaceC6972uo interfaceC6972uo2 = (InterfaceC6972uo) c6479nH2.f38228b;
            InterfaceC6972uo interfaceC6972uo3 = (InterfaceC6972uo) c6479nH2.f38229c;
            c6479nH2.m23117c(interfaceC6972uo2, interfaceC6972uo3, r615, r616, entry2);
            ((R61) entry2.getValue()).m6896a(new RunnableC6970um(c6479nH2, interfaceC6972uo2, interfaceC6972uo3, r615, r616, entry2, 1));
        }
        C1380Vw c1380Vw2 = (C1380Vw) c6479nH2.f38230d;
        HashMap map4 = new HashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            map4.put((AbstractC9402fh1) entry3.getKey(), (R61) c1380Vw2.get(entry3.getValue()));
        }
        c7909Ll1.m5103u(map4);
        Object[] objArr2 = {this.f36302y.m25206d(), this.f36303z.m25206d()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            Object obj2 = objArr2[i4];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: H */
    public final void m22156H(String str, String str2, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge, C0419Ge c0419Ge2) {
        Matrix matrix = this.f27341j;
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        Objects.requireNonNull(interfaceC6972uoM18274d);
        boolean zMo1339m = interfaceC6972uoM18274d.mo1339m();
        Size size = c0419Ge.f3839a;
        Rect rect = this.f27340i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        InterfaceC6972uo interfaceC6972uoM18274d2 = m18274d();
        Objects.requireNonNull(interfaceC6972uoM18274d2);
        int iM18278i = m18278i(interfaceC6972uoM18274d2, false);
        InterfaceC6972uo interfaceC6972uoM18274d3 = m18274d();
        Objects.requireNonNull(interfaceC6972uoM18274d3);
        R61 r61 = new R61(3, 34, c0419Ge, matrix, zMo1339m, rect2, iM18278i, -1, m18281n(interfaceC6972uoM18274d3));
        this.f36298u = r61;
        Objects.requireNonNull(m18274d());
        this.f36300w = r61;
        C11303uY0 c11303uY0M22157I = m22157I(this.f36298u, interfaceC9914jh1, c0419Ge);
        this.f36302y = c11303uY0M22157I;
        C11431vY0 c11431vY0 = this.f36291A;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
        }
        C11431vY0 c11431vY02 = new C11431vY0(new C9838j51(this, str, str2, interfaceC9914jh1, c0419Ge, c0419Ge2));
        this.f36291A = c11431vY02;
        c11303uY0M22157I.f43138f = c11431vY02;
    }

    /* renamed from: I */
    public final C11303uY0 m22157I(R61 r61, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge) {
        C11303uY0 c11303uY0M25202e = C11303uY0.m25202e(interfaceC9914jh1, c0419Ge.f3839a);
        C7909Ll1 c7909Ll1 = this.f36293p;
        Iterator it = c7909Ll1.f6835a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((AbstractC9402fh1) it.next()).f27337f.mo6172x().f46304g.f12780c;
            Integer numValueOf = Integer.valueOf(i);
            List list = C11812yY0.f46297j;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        C1622Zm c1622Zm = c11303uY0M25202e.f43134b;
        if (i != -1) {
            c1622Zm.f15113a = i;
        }
        Iterator it2 = c7909Ll1.f6835a.iterator();
        while (it2.hasNext()) {
            C11812yY0 c11812yY0M25206d = C11303uY0.m25202e(((AbstractC9402fh1) it2.next()).f27337f, c0419Ge.f3839a).m25206d();
            C1373Vp c1373Vp = c11812yY0M25206d.f46304g;
            c1622Zm.m9588a(c1373Vp.f12782e);
            for (AbstractC6511nn abstractC6511nn : c11812yY0M25206d.f46302e) {
                c1622Zm.m9589b(abstractC6511nn);
                ArrayList arrayList = c11303uY0M25202e.f43137e;
                if (!arrayList.contains(abstractC6511nn)) {
                    arrayList.add(abstractC6511nn);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c11812yY0M25206d.f46301d) {
                ArrayList arrayList2 = c11303uY0M25202e.f43136d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c11812yY0M25206d.f46300c) {
                ArrayList arrayList3 = c11303uY0M25202e.f43135c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            c1622Zm.m9590c(c1373Vp.f12779b);
        }
        r61.getClass();
        DV1.m1716a();
        r61.m6897b();
        AbstractC9104dM1.m17550i(!r61.f10011j, "Consumer can only be linked once.");
        r61.f10011j = true;
        c11303uY0M25202e.m25205c(r61.f10013l, c0419Ge.f3840b, -1);
        c1622Zm.m9589b(c7909Ll1.f6842h);
        C3950dn c3950dn = c0419Ge.f3842d;
        if (c3950dn != null) {
            c1622Zm.m9590c(c3950dn);
        }
        m18271a(c11303uY0M25202e, c0419Ge);
        return c11303uY0M25202e;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: g */
    public final InterfaceC9914jh1 mo7101g(boolean z, InterfaceC10298mh1 interfaceC10298mh1) {
        C10094l51 c10094l51 = this.f36292o;
        c10094l51.getClass();
        InterfaceC6854sw interfaceC6854swMo6364a = interfaceC10298mh1.mo6364a(F91.m2519b(c10094l51), 1);
        if (z) {
            interfaceC6854swMo6364a = AbstractC1374Vq.m8598q(interfaceC6854swMo6364a, c10094l51.f36888a);
        }
        if (interfaceC6854swMo6364a == null) {
            return null;
        }
        return ((L21) mo7103m(interfaceC6854swMo6364a)).mo4872d();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: k */
    public final Set mo7102k() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: m */
    public final InterfaceC9786ih1 mo7103m(InterfaceC6854sw interfaceC6854sw) {
        return new L21(C7612Ft0.m2813c(interfaceC6854sw));
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: s */
    public final void mo18286s() {
        C7909Ll1 c7909Ll1 = this.f36293p;
        Iterator it = c7909Ll1.f6835a.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            C7857Kl1 c7857Kl1 = (C7857Kl1) c7909Ll1.f6837c.get(abstractC9402fh1);
            Objects.requireNonNull(c7857Kl1);
            abstractC9402fh1.m18272b(c7857Kl1, null, null, abstractC9402fh1.mo7101g(true, c7909Ll1.f6839e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0171  */
    @Override // p000.AbstractC9402fh1
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC9914jh1 mo7104u(p000.InterfaceC6766ro r14, p000.InterfaceC9786ih1 r15) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9966k51.mo7104u(ro, ih1):jh1");
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: v */
    public final void mo7105v() {
        Iterator it = this.f36293p.f6835a.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            abstractC9402fh1.mo7105v();
            abstractC9402fh1.mo18287t();
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: w */
    public final void mo7106w() {
        Iterator it = this.f36293p.f6835a.iterator();
        while (it.hasNext()) {
            ((AbstractC9402fh1) it.next()).mo7106w();
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: x */
    public final C0419Ge mo7107x(C3950dn c3950dn) {
        this.f36302y.m25204b(c3950dn);
        Object[] objArr = {this.f36302y.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
        C6937uF c6937uFM3116a = this.f27338g.m3116a();
        c6937uFM3116a.f43619d = c3950dn;
        return c6937uFM3116a.m25140l();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: y */
    public final C0419Ge mo7108y(C0419Ge c0419Ge, C0419Ge c0419Ge2) {
        m18270E(m22155G(m18276f(), m18279j() == null ? null : m18279j().mo1341o().mo2393e(), this.f27337f, c0419Ge, c0419Ge2));
        m18283p();
        return c0419Ge;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: z */
    public final void mo17508z() {
        m22154F();
        C7909Ll1 c7909Ll1 = this.f36293p;
        Iterator it = c7909Ll1.f6835a.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            C7857Kl1 c7857Kl1 = (C7857Kl1) c7909Ll1.f6837c.get(abstractC9402fh1);
            Objects.requireNonNull(c7857Kl1);
            abstractC9402fh1.m18269D(c7857Kl1);
        }
    }
}
