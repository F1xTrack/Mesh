package p000;

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
public final class C8215Ri1 extends AbstractC9402fh1 {

    /* renamed from: C */
    public static final C8111Pi1 f10386C = new C8111Pi1();

    /* renamed from: A */
    public C11431vY0 f10387A;

    /* renamed from: B */
    public final EG0 f10388B;

    /* renamed from: o */
    public AbstractC4232iH f10389o;

    /* renamed from: p */
    public R61 f10390p;

    /* renamed from: q */
    public C0356Fe f10391q;

    /* renamed from: r */
    public C11303uY0 f10392r;

    /* renamed from: s */
    public C0489Hl f10393s;

    /* renamed from: t */
    public Z61 f10394t;

    /* renamed from: u */
    public int f10395u;

    /* renamed from: v */
    public C8539Xo1 f10396v;

    /* renamed from: w */
    public Rect f10397w;

    /* renamed from: x */
    public int f10398x;

    /* renamed from: y */
    public boolean f10399y;

    /* renamed from: z */
    public C8163Qi1 f10400z;

    public C8215Ri1(C8267Si1 c8267Si1) {
        super(c8267Si1);
        this.f10391q = C0356Fe.f3369d;
        this.f10392r = new C11303uY0();
        this.f10393s = null;
        this.f10395u = 3;
        this.f10399y = false;
        this.f10388B = new EG0(2, this);
    }

    /* renamed from: F */
    public static void m7089F(HashSet hashSet, int i, int i2, Size size, InterfaceC8889bj1 interfaceC8889bj1) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) interfaceC8889bj1.mo10490D0(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException unused) {
            AbstractC7806Jm0.m4412f("VideoCapture");
        }
        try {
            hashSet.add(new Size(((Integer) interfaceC8889bj1.mo10498y0(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException unused2) {
            AbstractC7806Jm0.m4412f("VideoCapture");
        }
    }

    /* renamed from: G */
    public static int m7090G(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    /* renamed from: O */
    public static InterfaceC8889bj1 m7091O(InterfaceC6894tZ interfaceC6894tZ, C1614Ze c1614Ze, C1613Zd c1613Zd, Size size, C0149CM c0149cm, Range range) {
        C1488Xe c1488XeM8126b = AbstractC8371Ui1.m8126b(c1613Zd, c0149cm, c1614Ze);
        EnumC11690xa1 enumC11690xa1 = EnumC11690xa1.f45684a;
        String str = c1488XeM8126b.f13886a;
        C1551Ye c1551Ye = c1613Zd.f15046a;
        C7276zd c7276zd = c1488XeM8126b.f13888c;
        InterfaceC8889bj1 interfaceC8889bj1 = (InterfaceC8889bj1) interfaceC6894tZ.apply((C1362Ve) (c7276zd != null ? new C1002Pv(str, enumC11690xa1, c1551Ye, size, c7276zd, c0149cm, range) : new C8761aj1(str, enumC11690xa1, c1551Ye, size, c0149cm, range)).get());
        Size size2 = null;
        if (interfaceC8889bj1 == null) {
            AbstractC7806Jm0.m4412f("VideoCapture");
            return null;
        }
        if (c1614Ze != null) {
            C7276zd c7276zd2 = c1614Ze.f15068f;
            size2 = new Size(c7276zd2.f46903e, c7276zd2.f46904f);
        }
        return C9150dj1.m17731a(interfaceC8889bj1, size2);
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: C */
    public final void mo7092C(Rect rect) {
        this.f27340i = rect;
        m7100P();
    }

    /* renamed from: H */
    public final void m7093H(C11303uY0 c11303uY0, C0356Fe c0356Fe, C0419Ge c0419Ge) {
        AbstractC4232iH abstractC4232iH;
        boolean z = c0356Fe.f3372a == -1;
        boolean z2 = c0356Fe.f3373b == 1;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        c11303uY0.f43133a.clear();
        ((HashSet) c11303uY0.f43134b.f15116d).clear();
        C0149CM c0149cm = c0419Ge.f3840b;
        if (!z && (abstractC4232iH = this.f10389o) != null) {
            if (z2) {
                c11303uY0.m25205c(abstractC4232iH, c0149cm, -1);
            } else {
                C8128Pr0 c8128Pr0M26209a = C7214ye.m26209a(abstractC4232iH);
                if (c0149cm == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                c8128Pr0M26209a.f9308f = c0149cm;
                c11303uY0.f43133a.add(c8128Pr0M26209a.m6450l());
            }
        }
        C0489Hl c0489Hl = this.f10393s;
        if (c0489Hl != null && c0489Hl.cancel(false)) {
            AbstractC7806Jm0.m4412f("VideoCapture");
        }
        C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new H30(this, 18, c11303uY0));
        this.f10393s = c0489HlM26149b;
        AbstractC8301Sz1.m7478a(c0489HlM26149b, new X11(this, c0489HlM26149b, z2), QR1.m6710h());
    }

    /* renamed from: I */
    public final void m7094I() {
        DV1.m1716a();
        C11431vY0 c11431vY0 = this.f10387A;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
            this.f10387A = null;
        }
        AbstractC4232iH abstractC4232iH = this.f10389o;
        if (abstractC4232iH != null) {
            abstractC4232iH.mo6573a();
            this.f10389o = null;
        }
        C8539Xo1 c8539Xo1 = this.f10396v;
        if (c8539Xo1 != null) {
            c8539Xo1.m9131N();
            this.f10396v = null;
        }
        R61 r61 = this.f10390p;
        if (r61 != null) {
            r61.m6898c();
            this.f10390p = null;
        }
        this.f10397w = null;
        this.f10394t = null;
        this.f10391q = C0356Fe.f3369d;
        this.f10398x = 0;
        this.f10399y = false;
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
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11303uY0 m7095J(p000.C8267Si1 r32, p000.C0419Ge r33) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8215Ri1.m7095J(Si1, Ge):uY0");
    }

    /* renamed from: K */
    public final int m7096K(InterfaceC6972uo interfaceC6972uo) {
        boolean zM18281n = m18281n(interfaceC6972uo);
        int iM18278i = m18278i(interfaceC6972uo, zM18281n);
        C0922Oe c0922Oe = this.f10391q.f3374c;
        if (c0922Oe == null) {
            return iM18278i;
        }
        Objects.requireNonNull(c0922Oe);
        boolean z = c0922Oe.f8552f;
        int i = c0922Oe.f8548b;
        if (zM18281n != z) {
            i = -i;
        }
        return AbstractC11184tc1.m24954h(iM18278i - i);
    }

    /* renamed from: L */
    public final InterfaceC7645Gj1 m7097L() {
        C8267Si1 c8267Si1 = (C8267Si1) this.f27337f;
        c8267Si1.getClass();
        InterfaceC7645Gj1 interfaceC7645Gj1 = (InterfaceC7645Gj1) AbstractC11153tN0.m24897i(c8267Si1, C8267Si1.f10924b);
        Objects.requireNonNull(interfaceC7645Gj1);
        return interfaceC7645Gj1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7098M(p000.InterfaceC6972uo r3, p000.C8267Si1 r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            boolean r0 = r3.mo1339m()
            if (r0 == 0) goto L23
            r4.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            Hc r1 = p000.C8267Si1.f10926d
            sw r4 = r4.getConfig()
            Ky0 r4 = (p000.C7882Ky0) r4
            java.lang.Object r4 = r4.mo4792q(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L23
            goto L6b
        L23:
            boolean r4 = r3.mo1339m()
            if (r4 == 0) goto L40
            e41 r4 = p000.AbstractC6941uJ.f43644a
            boolean r4 = p000.AbstractC11153tN0.m24888F(r4)
            if (r4 != 0) goto L6b
            ro r4 = r3.mo1341o()
            e41 r4 = r4.mo2410v()
            boolean r4 = p000.AbstractC11153tN0.m24888F(r4)
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
            boolean r4 = r3.mo1339m()
            if (r4 == 0) goto L62
            boolean r3 = r2.m18281n(r3)
            if (r3 == 0) goto L62
            goto L6b
        L62:
            Fe r3 = r2.f10391q
            Oe r3 = r3.f3374c
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8215Ri1.m7098M(uo, Si1, android.graphics.Rect, android.util.Size):boolean");
    }

    /* renamed from: N */
    public final void m7099N() {
        if (m18274d() == null) {
            return;
        }
        m7094I();
        C8267Si1 c8267Si1 = (C8267Si1) this.f27337f;
        C0419Ge c0419Ge = this.f27338g;
        c0419Ge.getClass();
        C11303uY0 c11303uY0M7095J = m7095J(c8267Si1, c0419Ge);
        this.f10392r = c11303uY0M7095J;
        m7093H(c11303uY0M7095J, this.f10391q, this.f27338g);
        Object[] objArr = {this.f10392r.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
        m18284q();
    }

    /* renamed from: P */
    public final void m7100P() {
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        R61 r61 = this.f10390p;
        if (interfaceC6972uoM18274d == null || r61 == null) {
            return;
        }
        int iM7096K = m7096K(interfaceC6972uoM18274d);
        this.f10398x = iM7096K;
        DV1.m1719d(new O61(r61, iM7096K, ((Y60) this.f27337f).mo7431p0(), 0));
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: g */
    public final InterfaceC9914jh1 mo7101g(boolean z, InterfaceC10298mh1 interfaceC10298mh1) {
        f10386C.getClass();
        C8267Si1 c8267Si1 = C8111Pi1.f9256a;
        c8267Si1.getClass();
        InterfaceC6854sw interfaceC6854swMo6364a = interfaceC10298mh1.mo6364a(F91.m2519b(c8267Si1), 1);
        if (z) {
            interfaceC6854swMo6364a = AbstractC1374Vq.m8598q(interfaceC6854swMo6364a, c8267Si1);
        }
        if (interfaceC6854swMo6364a == null) {
            return null;
        }
        return new C8267Si1(C7882Ky0.m4786a(((C9327f60) mo7103m(interfaceC6854swMo6364a)).f27076b));
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: k */
    public final Set mo7102k() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: m */
    public final InterfaceC9786ih1 mo7103m(InterfaceC6854sw interfaceC6854sw) {
        return new C9327f60(C7612Ft0.m2813c(interfaceC6854sw), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(m18277h());
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x00c2  */
    @Override // p000.AbstractC9402fh1
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC9914jh1 mo7104u(p000.InterfaceC6766ro r23, p000.InterfaceC9786ih1 r24) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8215Ri1.mo7104u(ro, ih1):jh1");
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: v */
    public final void mo7105v() throws ExecutionException, InterruptedException {
        m18276f();
        AbstractC7806Jm0.m4412f("VideoCapture");
        C0419Ge c0419Ge = this.f27338g;
        if (c0419Ge == null || this.f10394t != null) {
            return;
        }
        InterfaceC9177dx0 interfaceC9177dx0Mo3140c = m7097L().mo3140c();
        Object obj = C0356Fe.f3369d;
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Mo1480g = interfaceC9177dx0Mo3140c.mo1480g();
        if (interfaceFutureC7800Jj0Mo1480g.isDone()) {
            try {
                obj = interfaceFutureC7800Jj0Mo1480g.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f10391q = (C0356Fe) obj;
        C11303uY0 c11303uY0M7095J = m7095J((C8267Si1) this.f27337f, c0419Ge);
        this.f10392r = c11303uY0M7095J;
        m7093H(c11303uY0M7095J, this.f10391q, c0419Ge);
        Object[] objArr = {this.f10392r.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        m18270E(Collections.unmodifiableList(arrayList));
        m18283p();
        m7097L().mo3140c().mo1479a(QR1.m6710h(), this.f10388B);
        C8163Qi1 c8163Qi1 = this.f10400z;
        if (c8163Qi1 != null) {
            AbstractC9104dM1.m17550i(DV1.m1718c(), "SourceStreamRequirementObserver can be closed from main thread only");
            AbstractC7806Jm0.m4412f("VideoCapture");
            InterfaceC1560Yn interfaceC1560Yn = c8163Qi1.f9751a;
            if (interfaceC1560Yn == null) {
                AbstractC7806Jm0.m4412f("VideoCapture");
            } else {
                if (c8163Qi1.f9752b) {
                    c8163Qi1.f9752b = false;
                    interfaceC1560Yn.mo925t();
                }
                c8163Qi1.f9751a = null;
            }
        }
        InterfaceC1560Yn interfaceC1560YnM18275e = m18275e();
        C8163Qi1 c8163Qi12 = new C8163Qi1();
        c8163Qi12.f9752b = false;
        c8163Qi12.f9751a = interfaceC1560YnM18275e;
        this.f10400z = c8163Qi12;
        m7097L().mo3141d().mo1479a(QR1.m6710h(), this.f10400z);
        if (2 != this.f10395u) {
            this.f10395u = 2;
            m7097L().mo3139b(2);
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: w */
    public final void mo7106w() {
        AbstractC7806Jm0.m4412f("VideoCapture");
        AbstractC9104dM1.m17550i(DV1.m1718c(), "VideoCapture can only be detached on the main thread.");
        if (this.f10400z != null) {
            m7097L().mo3141d().mo1481l(this.f10400z);
            C8163Qi1 c8163Qi1 = this.f10400z;
            c8163Qi1.getClass();
            AbstractC9104dM1.m17550i(DV1.m1718c(), "SourceStreamRequirementObserver can be closed from main thread only");
            AbstractC7806Jm0.m4412f("VideoCapture");
            InterfaceC1560Yn interfaceC1560Yn = c8163Qi1.f9751a;
            if (interfaceC1560Yn == null) {
                AbstractC7806Jm0.m4412f("VideoCapture");
            } else {
                if (c8163Qi1.f9752b) {
                    c8163Qi1.f9752b = false;
                    interfaceC1560Yn.mo925t();
                }
                c8163Qi1.f9751a = null;
            }
            this.f10400z = null;
        }
        if (3 != this.f10395u) {
            this.f10395u = 3;
            m7097L().mo3139b(3);
        }
        m7097L().mo3140c().mo1481l(this.f10388B);
        C0489Hl c0489Hl = this.f10393s;
        if (c0489Hl != null && c0489Hl.cancel(false)) {
            AbstractC7806Jm0.m4412f("VideoCapture");
        }
        m7094I();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: x */
    public final C0419Ge mo7107x(C3950dn c3950dn) {
        this.f10392r.m25204b(c3950dn);
        Object[] objArr = {this.f10392r.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
        C0419Ge c0419Ge = this.f27338g;
        Objects.requireNonNull(c0419Ge);
        C6937uF c6937uFM3116a = c0419Ge.m3116a();
        c6937uFM3116a.f43619d = c3950dn;
        return c6937uFM3116a.m25140l();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: y */
    public final C0419Ge mo7108y(C0419Ge c0419Ge, C0419Ge c0419Ge2) {
        Objects.toString(c0419Ge);
        AbstractC7806Jm0.m4412f("VideoCapture");
        C8267Si1 c8267Si1 = (C8267Si1) this.f27337f;
        c8267Si1.getClass();
        ArrayList arrayListM8929b = X60.m8929b(c8267Si1);
        if (arrayListM8929b != null && !arrayListM8929b.contains(c0419Ge.f3839a)) {
            Objects.toString(c0419Ge.f3839a);
            arrayListM8929b.toString();
            AbstractC7806Jm0.m4412f("VideoCapture");
        }
        return c0419Ge;
    }
}
