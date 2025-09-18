package defpackage;

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
public final class C5438k51 extends AbstractC3821fh1 {
    public C7624vY0 A;
    public final C5629l51 o;
    public final C0913Ll1 p;
    public final C5213iw q;
    public final C5213iw r;
    public C1857Xo1 s;
    public C6045nH t;
    public R61 u;
    public R61 v;
    public R61 w;
    public R61 x;
    public C7433uY0 y;
    public C7433uY0 z;

    public C5438k51(InterfaceC7480uo interfaceC7480uo, InterfaceC7480uo interfaceC7480uo2, C5213iw c5213iw, C5213iw c5213iw2, HashSet hashSet, C5568kn c5568kn) {
        super(K(hashSet));
        this.o = K(hashSet);
        this.q = c5213iw;
        this.r = c5213iw2;
        this.p = new C0913Ll1(interfaceC7480uo, interfaceC7480uo2, hashSet, c5568kn, new C1724Vw0(17, this));
    }

    public static ArrayList J(AbstractC3821fh1 abstractC3821fh1) {
        ArrayList arrayList = new ArrayList();
        if (abstractC3821fh1 instanceof C5438k51) {
            Iterator it = ((C5438k51) abstractC3821fh1).p.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC3821fh1) it.next()).f.T());
            }
        } else {
            arrayList.add(abstractC3821fh1.f.T());
        }
        return arrayList;
    }

    public static C5629l51 K(HashSet hashSet) {
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        new L21(c0468Ft0B);
        c0468Ft0B.e(M60.x0, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            if (abstractC3821fh1.f.Q(InterfaceC5361jh1.c1)) {
                arrayList.add(abstractC3821fh1.f.T());
            }
        }
        c0468Ft0B.e(C5629l51.b, arrayList);
        c0468Ft0B.e(Y60.D0, 2);
        return new C5629l51(C0873Ky0.a(c0468Ft0B));
    }

    public final void F() {
        C7624vY0 c7624vY0 = this.A;
        if (c7624vY0 != null) {
            c7624vY0.b();
            this.A = null;
        }
        R61 r61 = this.u;
        if (r61 != null) {
            r61.c();
            this.u = null;
        }
        R61 r612 = this.v;
        if (r612 != null) {
            r612.c();
            this.v = null;
        }
        R61 r613 = this.w;
        if (r613 != null) {
            r613.c();
            this.w = null;
        }
        R61 r614 = this.x;
        if (r614 != null) {
            r614.c();
            this.x = null;
        }
        C1857Xo1 c1857Xo1 = this.s;
        if (c1857Xo1 != null) {
            c1857Xo1.N();
            this.s = null;
        }
        C6045nH c6045nH = this.t;
        if (c6045nH != null) {
            ((C5869mM) c6045nH.a).d();
            DV1.d(new DE(11, c6045nH));
            this.t = null;
        }
    }

    public final List G(String str, String str2, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        DV1.a();
        C0913Ll1 c0913Ll1 = this.p;
        int i = 1;
        boolean z = false;
        if (c0500Ge2 == null) {
            H(str, str2, interfaceC5361jh1, c0500Ge, null);
            InterfaceC7480uo interfaceC7480uoD = d();
            Objects.requireNonNull(interfaceC7480uoD);
            this.s = new C1857Xo1(interfaceC7480uoD, new JG(c0500Ge.b));
            boolean z2 = this.i != null;
            R61 r61 = this.w;
            int iL = l();
            c0913Ll1.getClass();
            HashMap map = new HashMap();
            Iterator it = c0913Ll1.a.iterator();
            while (it.hasNext()) {
                AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
                map.put(abstractC3821fh1, c0913Ll1.q(abstractC3821fh1, c0913Ll1.k, c0913Ll1.f, r61, iL, z2));
                i = i;
                z = false;
            }
            int i2 = i;
            C1723Vw c1723VwT = this.s.T(new C0967Me(this.w, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((AbstractC3821fh1) entry.getKey(), (R61) c1723VwT.get(entry.getValue()));
            }
            c0913Ll1.u(map2);
            Object[] objArr = new Object[i2];
            objArr[0] = this.y.d();
            ArrayList arrayList = new ArrayList(i2);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        H(str, str2, interfaceC5361jh1, c0500Ge, c0500Ge2);
        Matrix matrix = this.j;
        InterfaceC7480uo interfaceC7480uoJ = j();
        Objects.requireNonNull(interfaceC7480uoJ);
        boolean zM = interfaceC7480uoJ.m();
        Rect rect = this.i;
        if (rect == null) {
            Size size = c0500Ge2.a;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        InterfaceC7480uo interfaceC7480uoJ2 = j();
        Objects.requireNonNull(interfaceC7480uoJ2);
        int i3 = i(interfaceC7480uoJ2, false);
        InterfaceC7480uo interfaceC7480uoJ3 = j();
        Objects.requireNonNull(interfaceC7480uoJ3);
        R61 r612 = new R61(3, 34, c0500Ge2, matrix, zM, rect, i3, -1, n(interfaceC7480uoJ3));
        this.v = r612;
        Objects.requireNonNull(j());
        this.x = r612;
        C7433uY0 c7433uY0I = I(this.v, interfaceC5361jh1, c0500Ge2);
        this.z = c7433uY0I;
        C7624vY0 c7624vY0 = this.A;
        if (c7624vY0 != null) {
            c7624vY0.b();
        }
        boolean z3 = false;
        boolean z4 = true;
        C7624vY0 c7624vY02 = new C7624vY0(new C5247j51(this, str, str2, interfaceC5361jh1, c0500Ge, c0500Ge2));
        this.A = c7624vY02;
        c7433uY0I.f = c7624vY02;
        InterfaceC7480uo interfaceC7480uoD2 = d();
        InterfaceC7480uo interfaceC7480uoJ4 = j();
        C5869mM c5869mM = new C5869mM(c0500Ge.b, this.q, this.r);
        C6045nH c6045nH = new C6045nH();
        c6045nH.b = interfaceC7480uoD2;
        c6045nH.c = interfaceC7480uoJ4;
        c6045nH.a = c5869mM;
        this.t = c6045nH;
        boolean z5 = this.i != null;
        R61 r613 = this.w;
        R61 r614 = this.x;
        int iL2 = l();
        c0913Ll1.getClass();
        HashMap map3 = new HashMap();
        Iterator it2 = c0913Ll1.a.iterator();
        while (it2.hasNext()) {
            AbstractC3821fh1 abstractC3821fh12 = (AbstractC3821fh1) it2.next();
            C2553ce c2553ceQ = c0913Ll1.q(abstractC3821fh12, c0913Ll1.k, c0913Ll1.f, r613, iL2, z5);
            InterfaceC7480uo interfaceC7480uo = c0913Ll1.g;
            Objects.requireNonNull(interfaceC7480uo);
            map3.put(abstractC3821fh12, new C7638vd(c2553ceQ, c0913Ll1.q(abstractC3821fh12, c0913Ll1.l, interfaceC7480uo, r614, iL2, z5)));
            it2 = it2;
            z4 = true;
            z3 = false;
        }
        C6045nH c6045nH2 = this.t;
        C7828wd c7828wd = new C7828wd(this.w, this.x, new ArrayList(map3.values()));
        c6045nH2.getClass();
        DV1.a();
        c6045nH2.e = c7828wd;
        c6045nH2.d = new C1723Vw();
        C7828wd c7828wd2 = (C7828wd) c6045nH2.e;
        R61 r615 = c7828wd2.a;
        Iterator it3 = c7828wd2.c.iterator();
        while (it3.hasNext()) {
            C7638vd c7638vd = (C7638vd) it3.next();
            C1723Vw c1723Vw = (C1723Vw) c6045nH2.d;
            C2553ce c2553ce = c7638vd.a;
            Matrix matrix2 = new Matrix();
            Size sizeE = AbstractC7255tc1.e(c2553ce.d);
            int i4 = c2553ce.f;
            Size sizeG = AbstractC7255tc1.g(sizeE, i4);
            Size size2 = c2553ce.e;
            AbstractC3377dM1.e(AbstractC7255tc1.d(sizeG, false, size2));
            Rect rect2 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            C7375uF c7375uFA = r615.g.a();
            c7375uFA.a = size2;
            c1723Vw.put(c7638vd, new R61(c2553ce.b, c2553ce.c, c7375uFA.l(), matrix2, false, rect2, r615.i - i4, -1, r615.e != c2553ce.g));
        }
        Z61 z61D = r615.d((InterfaceC7480uo) c6045nH2.b, true);
        C5869mM c5869mM2 = (C5869mM) c6045nH2.a;
        c5869mM2.c(z61D);
        R61 r616 = c7828wd2.b;
        c5869mM2.c(r616.d((InterfaceC7480uo) c6045nH2.c, false));
        for (Map.Entry entry2 : ((C1723Vw) c6045nH2.d).entrySet()) {
            InterfaceC7480uo interfaceC7480uo2 = (InterfaceC7480uo) c6045nH2.b;
            InterfaceC7480uo interfaceC7480uo3 = (InterfaceC7480uo) c6045nH2.c;
            c6045nH2.c(interfaceC7480uo2, interfaceC7480uo3, r615, r616, entry2);
            ((R61) entry2.getValue()).a(new RunnableC7474um(c6045nH2, interfaceC7480uo2, interfaceC7480uo3, r615, r616, entry2, 1));
        }
        C1723Vw c1723Vw2 = (C1723Vw) c6045nH2.d;
        HashMap map4 = new HashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            map4.put((AbstractC3821fh1) entry3.getKey(), (R61) c1723Vw2.get(entry3.getValue()));
        }
        c0913Ll1.u(map4);
        Object[] objArr2 = {this.y.d(), this.z.d()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Object obj2 = objArr2[i5];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void H(String str, String str2, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        Matrix matrix = this.j;
        InterfaceC7480uo interfaceC7480uoD = d();
        Objects.requireNonNull(interfaceC7480uoD);
        boolean zM = interfaceC7480uoD.m();
        Size size = c0500Ge.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        InterfaceC7480uo interfaceC7480uoD2 = d();
        Objects.requireNonNull(interfaceC7480uoD2);
        int i = i(interfaceC7480uoD2, false);
        InterfaceC7480uo interfaceC7480uoD3 = d();
        Objects.requireNonNull(interfaceC7480uoD3);
        R61 r61 = new R61(3, 34, c0500Ge, matrix, zM, rect2, i, -1, n(interfaceC7480uoD3));
        this.u = r61;
        Objects.requireNonNull(d());
        this.w = r61;
        C7433uY0 c7433uY0I = I(this.u, interfaceC5361jh1, c0500Ge);
        this.y = c7433uY0I;
        C7624vY0 c7624vY0 = this.A;
        if (c7624vY0 != null) {
            c7624vY0.b();
        }
        C7624vY0 c7624vY02 = new C7624vY0(new C5247j51(this, str, str2, interfaceC5361jh1, c0500Ge, c0500Ge2));
        this.A = c7624vY02;
        c7433uY0I.f = c7624vY02;
    }

    public final C7433uY0 I(R61 r61, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge) {
        C7433uY0 c7433uY0E = C7433uY0.e(interfaceC5361jh1, c0500Ge.a);
        C0913Ll1 c0913Ll1 = this.p;
        Iterator it = c0913Ll1.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((AbstractC3821fh1) it.next()).f.x().g.c;
            Integer numValueOf = Integer.valueOf(i);
            List list = C8194yY0.j;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        C2005Zm c2005Zm = c7433uY0E.b;
        if (i != -1) {
            c2005Zm.a = i;
        }
        Iterator it2 = c0913Ll1.a.iterator();
        while (it2.hasNext()) {
            C8194yY0 c8194yY0D = C7433uY0.e(((AbstractC3821fh1) it2.next()).f, c0500Ge.a).d();
            C1702Vp c1702Vp = c8194yY0D.g;
            c2005Zm.a(c1702Vp.e);
            for (AbstractC6141nn abstractC6141nn : c8194yY0D.e) {
                c2005Zm.b(abstractC6141nn);
                ArrayList arrayList = c7433uY0E.e;
                if (!arrayList.contains(abstractC6141nn)) {
                    arrayList.add(abstractC6141nn);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c8194yY0D.d) {
                ArrayList arrayList2 = c7433uY0E.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c8194yY0D.c) {
                ArrayList arrayList3 = c7433uY0E.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            c2005Zm.c(c1702Vp.b);
        }
        r61.getClass();
        DV1.a();
        r61.b();
        AbstractC3377dM1.i(!r61.j, "Consumer can only be linked once.");
        r61.j = true;
        c7433uY0E.c(r61.l, c0500Ge.b, -1);
        c2005Zm.b(c0913Ll1.h);
        C3456dn c3456dn = c0500Ge.d;
        if (c3456dn != null) {
            c2005Zm.c(c3456dn);
        }
        a(c7433uY0E, c0500Ge);
        return c7433uY0E;
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 g(boolean z, InterfaceC5934mh1 interfaceC5934mh1) {
        C5629l51 c5629l51 = this.o;
        c5629l51.getClass();
        InterfaceC7122sw interfaceC7122swA = interfaceC5934mh1.a(F91.b(c5629l51), 1);
        if (z) {
            interfaceC7122swA = AbstractC1705Vq.q(interfaceC7122swA, c5629l51.a);
        }
        if (interfaceC7122swA == null) {
            return null;
        }
        return ((L21) m(interfaceC7122swA)).d();
    }

    @Override // defpackage.AbstractC3821fh1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC4393ih1 m(InterfaceC7122sw interfaceC7122sw) {
        return new L21(C0468Ft0.c(interfaceC7122sw));
    }

    @Override // defpackage.AbstractC3821fh1
    public final void s() {
        C0913Ll1 c0913Ll1 = this.p;
        Iterator it = c0913Ll1.a.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            C0835Kl1 c0835Kl1 = (C0835Kl1) c0913Ll1.c.get(abstractC3821fh1);
            Objects.requireNonNull(c0835Kl1);
            abstractC3821fh1.b(c0835Kl1, null, null, abstractC3821fh1.g(true, c0913Ll1.e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0171  */
    @Override // defpackage.AbstractC3821fh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC5361jh1 u(defpackage.InterfaceC6907ro r14, defpackage.InterfaceC4393ih1 r15) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5438k51.u(ro, ih1):jh1");
    }

    @Override // defpackage.AbstractC3821fh1
    public final void v() {
        Iterator it = this.p.a.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            abstractC3821fh1.v();
            abstractC3821fh1.t();
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final void w() {
        Iterator it = this.p.a.iterator();
        while (it.hasNext()) {
            ((AbstractC3821fh1) it.next()).w();
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge x(C3456dn c3456dn) {
        this.y.b(c3456dn);
        Object[] objArr = {this.y.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        C7375uF c7375uFA = this.g.a();
        c7375uFA.d = c3456dn;
        return c7375uFA.l();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge y(C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        E(G(f(), j() == null ? null : j().o().e(), this.f, c0500Ge, c0500Ge2));
        p();
        return c0500Ge;
    }

    @Override // defpackage.AbstractC3821fh1
    public final void z() {
        F();
        C0913Ll1 c0913Ll1 = this.p;
        Iterator it = c0913Ll1.a.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            C0835Kl1 c0835Kl1 = (C0835Kl1) c0913Ll1.c.get(abstractC3821fh1);
            Objects.requireNonNull(c0835Kl1);
            abstractC3821fh1.D(c0835Kl1);
        }
    }
}
