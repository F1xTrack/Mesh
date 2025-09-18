package defpackage;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: Ri1 */
/* loaded from: classes.dex */
public final class C1371Ri1 extends AbstractC3821fh1 {
    public static final C1215Pi1 C = new C1215Pi1();
    public C7624vY0 A;
    public final EG0 B;
    public AbstractC4314iH o;
    public R61 p;
    public C0422Fe q;
    public C7433uY0 r;
    public C0599Hl s;
    public Z61 t;
    public int u;
    public C1857Xo1 v;
    public Rect w;
    public int x;
    public boolean y;
    public C1293Qi1 z;

    public C1371Ri1(C1449Si1 c1449Si1) {
        super(c1449Si1);
        this.q = C0422Fe.d;
        this.r = new C7433uY0();
        this.s = null;
        this.u = 3;
        this.y = false;
        this.B = new EG0(2, this);
    }

    public static void F(HashSet hashSet, int i, int i2, Size size, InterfaceC2380bj1 interfaceC2380bj1) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) interfaceC2380bj1.D0(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException unused) {
            AbstractC0759Jm0.f("VideoCapture");
        }
        try {
            hashSet.add(new Size(((Integer) interfaceC2380bj1.y0(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException unused2) {
            AbstractC0759Jm0.f("VideoCapture");
        }
    }

    public static int G(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static InterfaceC2380bj1 O(InterfaceC7244tZ interfaceC7244tZ, C1981Ze c1981Ze, C1978Zd c1978Zd, Size size, CM cm, Range range) {
        C1825Xe c1825XeB = AbstractC1605Ui1.b(c1978Zd, cm, c1981Ze);
        EnumC8011xa1 enumC8011xa1 = EnumC8011xa1.a;
        String str = c1825XeB.a;
        C1903Ye c1903Ye = c1978Zd.a;
        C8398zd c8398zd = c1825XeB.c;
        InterfaceC2380bj1 interfaceC2380bj1 = (InterfaceC2380bj1) interfaceC7244tZ.apply((C1669Ve) (c8398zd != null ? new C1252Pv(str, enumC8011xa1, c1903Ye, size, c8398zd, cm, range) : new C2189aj1(str, enumC8011xa1, c1903Ye, size, cm, range)).get());
        Size size2 = null;
        if (interfaceC2380bj1 == null) {
            AbstractC0759Jm0.f("VideoCapture");
            return null;
        }
        if (c1981Ze != null) {
            C8398zd c8398zd2 = c1981Ze.f;
            size2 = new Size(c8398zd2.e, c8398zd2.f);
        }
        return C3446dj1.a(interfaceC2380bj1, size2);
    }

    @Override // defpackage.AbstractC3821fh1
    public final void C(Rect rect) {
        this.i = rect;
        P();
    }

    public final void H(C7433uY0 c7433uY0, C0422Fe c0422Fe, C0500Ge c0500Ge) {
        AbstractC4314iH abstractC4314iH;
        boolean z = c0422Fe.a == -1;
        boolean z2 = c0422Fe.b == 1;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        c7433uY0.a.clear();
        ((HashSet) c7433uY0.b.d).clear();
        CM cm = c0500Ge.b;
        if (!z && (abstractC4314iH = this.o) != null) {
            if (z2) {
                c7433uY0.c(abstractC4314iH, cm, -1);
            } else {
                C1241Pr0 c1241Pr0A = C8211ye.a(abstractC4314iH);
                if (cm == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                c1241Pr0A.f = cm;
                c7433uY0.a.add(c1241Pr0A.l());
            }
        }
        C0599Hl c0599Hl = this.s;
        if (c0599Hl != null && c0599Hl.cancel(false)) {
            AbstractC0759Jm0.f("VideoCapture");
        }
        C0599Hl c0599HlB = AbstractC8171yQ1.b(new H30(this, 18, c7433uY0));
        this.s = c0599HlB;
        AbstractC1500Sz1.a(c0599HlB, new X11(this, c0599HlB, z2), QR1.h());
    }

    public final void I() {
        DV1.a();
        C7624vY0 c7624vY0 = this.A;
        if (c7624vY0 != null) {
            c7624vY0.b();
            this.A = null;
        }
        AbstractC4314iH abstractC4314iH = this.o;
        if (abstractC4314iH != null) {
            abstractC4314iH.a();
            this.o = null;
        }
        C1857Xo1 c1857Xo1 = this.v;
        if (c1857Xo1 != null) {
            c1857Xo1.N();
            this.v = null;
        }
        R61 r61 = this.p;
        if (r61 != null) {
            r61.c();
            this.p = null;
        }
        this.w = null;
        this.t = null;
        this.q = C0422Fe.d;
        this.x = 0;
        this.y = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7433uY0 J(defpackage.C1449Si1 r32, defpackage.C0500Ge r33) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1371Ri1.J(Si1, Ge):uY0");
    }

    public final int K(InterfaceC7480uo interfaceC7480uo) {
        boolean zN = n(interfaceC7480uo);
        int i = i(interfaceC7480uo, zN);
        C1123Oe c1123Oe = this.q.c;
        if (c1123Oe == null) {
            return i;
        }
        Objects.requireNonNull(c1123Oe);
        boolean z = c1123Oe.f;
        int i2 = c1123Oe.b;
        if (zN != z) {
            i2 = -i2;
        }
        return AbstractC7255tc1.h(i - i2);
    }

    public final InterfaceC0517Gj1 L() {
        C1449Si1 c1449Si1 = (C1449Si1) this.f;
        c1449Si1.getClass();
        InterfaceC0517Gj1 interfaceC0517Gj1 = (InterfaceC0517Gj1) AbstractC7209tN0.i(c1449Si1, C1449Si1.b);
        Objects.requireNonNull(interfaceC0517Gj1);
        return interfaceC0517Gj1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(defpackage.InterfaceC7480uo r3, defpackage.C1449Si1 r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            boolean r0 = r3.m()
            if (r0 == 0) goto L23
            r4.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            Hc r1 = defpackage.C1449Si1.d
            sw r4 = r4.getConfig()
            Ky0 r4 = (defpackage.C0873Ky0) r4
            java.lang.Object r4 = r4.q(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L23
            goto L6b
        L23:
            boolean r4 = r3.m()
            if (r4 == 0) goto L40
            e41 r4 = defpackage.AbstractC7387uJ.a
            boolean r4 = defpackage.AbstractC7209tN0.F(r4)
            if (r4 != 0) goto L6b
            ro r4 = r3.o()
            e41 r4 = r4.v()
            boolean r4 = defpackage.AbstractC7209tN0.F(r4)
            if (r4 == 0) goto L40
            goto L6b
        L40:
            int r4 = r6.getWidth()
            int r0 = r5.width()
            if (r4 != r0) goto L6b
            int r4 = r6.getHeight()
            int r5 = r5.height()
            if (r4 == r5) goto L55
            goto L6b
        L55:
            boolean r4 = r3.m()
            if (r4 == 0) goto L62
            boolean r3 = r2.n(r3)
            if (r3 == 0) goto L62
            goto L6b
        L62:
            Fe r3 = r2.q
            Oe r3 = r3.c
            if (r3 == 0) goto L69
            goto L6b
        L69:
            r3 = 0
            goto L6c
        L6b:
            r3 = 1
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1371Ri1.M(uo, Si1, android.graphics.Rect, android.util.Size):boolean");
    }

    public final void N() {
        if (d() == null) {
            return;
        }
        I();
        C1449Si1 c1449Si1 = (C1449Si1) this.f;
        C0500Ge c0500Ge = this.g;
        c0500Ge.getClass();
        C7433uY0 c7433uY0J = J(c1449Si1, c0500Ge);
        this.r = c7433uY0J;
        H(c7433uY0J, this.q, this.g);
        Object[] objArr = {this.r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
    }

    public final void P() {
        InterfaceC7480uo interfaceC7480uoD = d();
        R61 r61 = this.p;
        if (interfaceC7480uoD == null || r61 == null) {
            return;
        }
        int iK = K(interfaceC7480uoD);
        this.x = iK;
        DV1.d(new O61(r61, iK, ((Y60) this.f).p0(), 0));
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 g(boolean z, InterfaceC5934mh1 interfaceC5934mh1) {
        C.getClass();
        C1449Si1 c1449Si1 = C1215Pi1.a;
        c1449Si1.getClass();
        InterfaceC7122sw interfaceC7122swA = interfaceC5934mh1.a(F91.b(c1449Si1), 1);
        if (z) {
            interfaceC7122swA = AbstractC1705Vq.q(interfaceC7122swA, c1449Si1);
        }
        if (interfaceC7122swA == null) {
            return null;
        }
        return new C1449Si1(C0873Ky0.a(((C3709f60) m(interfaceC7122swA)).b));
    }

    @Override // defpackage.AbstractC3821fh1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC4393ih1 m(InterfaceC7122sw interfaceC7122sw) {
        return new C3709f60(C0468Ft0.c(interfaceC7122sw), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(h());
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x00c2  */
    @Override // defpackage.AbstractC3821fh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC5361jh1 u(defpackage.InterfaceC6907ro r23, defpackage.InterfaceC4393ih1 r24) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1371Ri1.u(ro, ih1):jh1");
    }

    @Override // defpackage.AbstractC3821fh1
    public final void v() throws ExecutionException, InterruptedException {
        f();
        AbstractC0759Jm0.f("VideoCapture");
        C0500Ge c0500Ge = this.g;
        if (c0500Ge == null || this.t != null) {
            return;
        }
        InterfaceC3486dx0 interfaceC3486dx0C = L().c();
        Object obj = C0422Fe.d;
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0G = interfaceC3486dx0C.g();
        if (interfaceFutureC0750Jj0G.isDone()) {
            try {
                obj = interfaceFutureC0750Jj0G.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.q = (C0422Fe) obj;
        C7433uY0 c7433uY0J = J((C1449Si1) this.f, c0500Ge);
        this.r = c7433uY0J;
        H(c7433uY0J, this.q, c0500Ge);
        Object[] objArr = {this.r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        E(Collections.unmodifiableList(arrayList));
        p();
        L().c().a(QR1.h(), this.B);
        C1293Qi1 c1293Qi1 = this.z;
        if (c1293Qi1 != null) {
            AbstractC3377dM1.i(DV1.c(), "SourceStreamRequirementObserver can be closed from main thread only");
            AbstractC0759Jm0.f("VideoCapture");
            InterfaceC1930Yn interfaceC1930Yn = c1293Qi1.a;
            if (interfaceC1930Yn == null) {
                AbstractC0759Jm0.f("VideoCapture");
            } else {
                if (c1293Qi1.b) {
                    c1293Qi1.b = false;
                    interfaceC1930Yn.t();
                }
                c1293Qi1.a = null;
            }
        }
        InterfaceC1930Yn interfaceC1930YnE = e();
        C1293Qi1 c1293Qi12 = new C1293Qi1();
        c1293Qi12.b = false;
        c1293Qi12.a = interfaceC1930YnE;
        this.z = c1293Qi12;
        L().d().a(QR1.h(), this.z);
        if (2 != this.u) {
            this.u = 2;
            L().b(2);
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final void w() {
        AbstractC0759Jm0.f("VideoCapture");
        AbstractC3377dM1.i(DV1.c(), "VideoCapture can only be detached on the main thread.");
        if (this.z != null) {
            L().d().l(this.z);
            C1293Qi1 c1293Qi1 = this.z;
            c1293Qi1.getClass();
            AbstractC3377dM1.i(DV1.c(), "SourceStreamRequirementObserver can be closed from main thread only");
            AbstractC0759Jm0.f("VideoCapture");
            InterfaceC1930Yn interfaceC1930Yn = c1293Qi1.a;
            if (interfaceC1930Yn == null) {
                AbstractC0759Jm0.f("VideoCapture");
            } else {
                if (c1293Qi1.b) {
                    c1293Qi1.b = false;
                    interfaceC1930Yn.t();
                }
                c1293Qi1.a = null;
            }
            this.z = null;
        }
        if (3 != this.u) {
            this.u = 3;
            L().b(3);
        }
        L().c().l(this.B);
        C0599Hl c0599Hl = this.s;
        if (c0599Hl != null && c0599Hl.cancel(false)) {
            AbstractC0759Jm0.f("VideoCapture");
        }
        I();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge x(C3456dn c3456dn) {
        this.r.b(c3456dn);
        Object[] objArr = {this.r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        C0500Ge c0500Ge = this.g;
        Objects.requireNonNull(c0500Ge);
        C7375uF c7375uFA = c0500Ge.a();
        c7375uFA.d = c3456dn;
        return c7375uFA.l();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge y(C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        Objects.toString(c0500Ge);
        AbstractC0759Jm0.f("VideoCapture");
        C1449Si1 c1449Si1 = (C1449Si1) this.f;
        c1449Si1.getClass();
        ArrayList arrayListB = X60.b(c1449Si1);
        if (arrayListB != null && !arrayListB.contains(c0500Ge.a)) {
            Objects.toString(c0500Ge.a);
            arrayListB.toString();
            AbstractC0759Jm0.f("VideoCapture");
        }
        return c0500Ge;
    }
}
