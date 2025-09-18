package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: u60 */
/* loaded from: classes.dex */
public final class C11247u60 extends AbstractC9402fh1 {

    /* renamed from: z */
    public static final C10991s60 f43513z = new C10991s60();

    /* renamed from: o */
    public final int f43514o;

    /* renamed from: p */
    public final AtomicReference f43515p;

    /* renamed from: q */
    public final int f43516q;

    /* renamed from: r */
    public int f43517r;

    /* renamed from: s */
    public Rational f43518s;

    /* renamed from: t */
    public final C8734aW0 f43519t;

    /* renamed from: u */
    public C11303uY0 f43520u;

    /* renamed from: v */
    public C6937uF f43521v;

    /* renamed from: w */
    public C11507w81 f43522w;

    /* renamed from: x */
    public C11431vY0 f43523x;

    /* renamed from: y */
    public final C8170Qm0 f43524y;

    public C11247u60(C11375v60 c11375v60) {
        super(c11375v60);
        this.f43515p = new AtomicReference(null);
        this.f43517r = -1;
        this.f43518s = null;
        this.f43524y = new C8170Qm0(21, this);
        C11375v60 c11375v602 = (C11375v60) this.f27337f;
        C0480Hc c0480Hc = C11375v60.f44147b;
        if (c11375v602.mo4790Q(c0480Hc)) {
            this.f43514o = ((Integer) AbstractC11153tN0.m24897i(c11375v602, c0480Hc)).intValue();
        } else {
            this.f43514o = 1;
        }
        this.f43516q = ((Integer) c11375v602.mo4792q(C11375v60.f44154i, 0)).intValue();
        this.f43519t = new C8734aW0((InterfaceC11119t60) c11375v602.mo4792q(C11375v60.f44156k, null));
    }

    /* renamed from: I */
    public static boolean m25109I(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final void m25110F(boolean z) {
        C11507w81 c11507w81;
        DV1.m1716a();
        C11431vY0 c11431vY0 = this.f43523x;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
            this.f43523x = null;
        }
        C6937uF c6937uF = this.f43521v;
        if (c6937uF != null) {
            c6937uF.m25143v();
            this.f43521v = null;
        }
        if (z || (c11507w81 = this.f43522w) == null) {
            return;
        }
        c11507w81.m25566a();
        this.f43522w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0104  */
    /* JADX WARN: Type inference failed for: r14v7, types: [Ir0] */
    /* JADX WARN: Type inference failed for: r14v9, types: [Ir0] */
    /* JADX WARN: Type inference failed for: r1v26, types: [nn] */
    /* JADX WARN: Type inference failed for: r1v31, types: [nn] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11303uY0 m25111G(java.lang.String r29, p000.C11375v60 r30, p000.C0419Ge r31) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11247u60.m25111G(java.lang.String, v60, Ge):uY0");
    }

    /* renamed from: H */
    public final int m25112H() {
        int iIntValue;
        synchronized (this.f43515p) {
            iIntValue = this.f43517r;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((C11375v60) this.f27337f).mo4792q(C11375v60.f44148c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    /* renamed from: J */
    public final void m25113J(C1339VH c1339vh, ExecutorService executorService, C1753aw c1753aw) {
        Rect rect;
        int iRound;
        int i;
        int i2;
        int i3;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            QR1.m6710h().execute(new RunnableC6757rf(this, c1339vh, executorService, c1753aw, 8));
            return;
        }
        DV1.m1716a();
        if (m25112H() == 3 && this.f43519t.f15548a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        Rect rect2 = null;
        if (interfaceC6972uoM18274d == null) {
            C11502w60 c11502w60 = new C11502w60("Not bound to a valid Camera [" + this + "]", null);
            C0619Jp c0619Jp = (C0619Jp) c1753aw.f16685e;
            if (c0619Jp.isActive()) {
                c0619Jp.resumeWith(RQ1.m7015b(c11502w60));
                return;
            }
            return;
        }
        boolean z = this.f27337f.mo5265Y() != 0;
        if (z) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        C11507w81 c11507w81 = this.f43522w;
        Objects.requireNonNull(c11507w81);
        Rect rect3 = this.f27340i;
        Size sizeM18273c = m18273c();
        Objects.requireNonNull(sizeM18273c);
        if (rect3 != null) {
            rect = rect3;
        } else {
            Rational rational = this.f43518s;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect2 = new Rect(0, 0, sizeM18273c.getWidth(), sizeM18273c.getHeight());
            } else {
                InterfaceC6972uo interfaceC6972uoM18274d2 = m18274d();
                Objects.requireNonNull(interfaceC6972uoM18274d2);
                int iM18278i = m18278i(interfaceC6972uoM18274d2, false);
                Rational rational2 = new Rational(this.f43518s.getDenominator(), this.f43518s.getNumerator());
                if (!AbstractC11184tc1.m24949c(iM18278i)) {
                    rational2 = this.f43518s;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    AbstractC7806Jm0.m4412f("ImageUtil");
                } else {
                    int width = sizeM18273c.getWidth();
                    int height = sizeM18273c.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i3 = (height - iRound2) / 2;
                        i2 = iRound2;
                        iRound = width;
                        i = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i = (width - iRound) / 2;
                        i2 = height;
                        i3 = 0;
                    }
                    rect2 = new Rect(i, i3, iRound + i, i2 + i3);
                }
                Objects.requireNonNull(rect2);
            }
            rect = rect2;
        }
        Matrix matrix = this.f27341j;
        int iM18278i2 = m18278i(interfaceC6972uoM18274d, false);
        C11375v60 c11375v60 = (C11375v60) this.f27337f;
        C0480Hc c0480Hc = C11375v60.f44155j;
        if (c11375v60.mo4790Q(c0480Hc)) {
            iIntValue = ((Integer) ((C7882Ky0) c11375v60.getConfig()).mo4794w(c0480Hc)).intValue();
        } else {
            int i4 = this.f43514o;
            if (i4 == 0) {
                iIntValue = 100;
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException(AbstractC7222ym.m26230g(i4, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i5 = iIntValue;
        List listUnmodifiableList = Collections.unmodifiableList(this.f43520u.f43137e);
        AbstractC9104dM1.m17545d("onDiskCallback and outputFileOptions should be both null or both non-null.", !false);
        C1110Re c1110Re = new C1110Re(executorService, c1753aw, c1339vh, rect, matrix, iM18278i2, i5, this.f43514o, z, listUnmodifiableList);
        if (z) {
            HashMap map = c1110Re.f10348b;
            Boolean bool = Boolean.FALSE;
            map.put(32, bool);
            map.put(256, bool);
        }
        DV1.m1716a();
        c11507w81.f44692a.offer(c1110Re);
        c11507w81.m25567c();
    }

    /* renamed from: K */
    public final void m25114K() {
        synchronized (this.f43515p) {
            try {
                if (this.f43515p.get() != null) {
                    return;
                }
                m18275e().mo907R(m25112H());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: g */
    public final InterfaceC9914jh1 mo7101g(boolean z, InterfaceC10298mh1 interfaceC10298mh1) {
        f43513z.getClass();
        C11375v60 c11375v60 = C10991s60.f42256a;
        c11375v60.getClass();
        InterfaceC6854sw interfaceC6854swMo6364a = interfaceC10298mh1.mo6364a(F91.m2519b(c11375v60), this.f43514o);
        if (z) {
            interfaceC6854swMo6364a = AbstractC1374Vq.m8598q(interfaceC6854swMo6364a, c11375v60);
        }
        if (interfaceC6854swMo6364a == null) {
            return null;
        }
        return ((C9327f60) mo7103m(interfaceC6854swMo6364a)).m18190e();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: k */
    public final Set mo7102k() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: m */
    public final InterfaceC9786ih1 mo7103m(InterfaceC6854sw interfaceC6854sw) {
        return new C9327f60(C7612Ft0.m2813c(interfaceC6854sw), 1);
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: s */
    public final void mo18286s() {
        AbstractC9104dM1.m17549h(m18274d(), "Attached camera cannot be null");
        if (m25112H() == 3) {
            InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
            if ((interfaceC6972uoM18274d != null ? interfaceC6972uoM18274d.mo1328b().mo2398j() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: t */
    public final void mo18287t() {
        AbstractC7806Jm0.m4412f("ImageCapture");
        m25114K();
        m18275e().mo908T(this.f43519t);
    }

    public final String toString() {
        return "ImageCapture:".concat(m18277h());
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: u */
    public final InterfaceC9914jh1 mo7104u(InterfaceC6766ro interfaceC6766ro, InterfaceC9786ih1 interfaceC9786ih1) {
        boolean z;
        Object objMo4794w;
        Object objMo4794w2;
        Object objMo4794w3;
        Object objMo4794w4;
        Object objMo4794w5;
        if (interfaceC6766ro.mo2410v().m17862x0(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            C7612Ft0 c7612Ft0Mo4871c = interfaceC9786ih1.mo4871c();
            C0480Hc c0480Hc = C11375v60.f44153h;
            Object objMo4794w6 = Boolean.TRUE;
            c7612Ft0Mo4871c.getClass();
            try {
                objMo4794w6 = c7612Ft0Mo4871c.mo4794w(c0480Hc);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objMo4794w6)) {
                AbstractC7806Jm0.m4412f("ImageCapture");
            } else {
                AbstractC7806Jm0.m4412f("ImageCapture");
                interfaceC9786ih1.mo4871c().m2815e(C11375v60.f44153h, Boolean.TRUE);
            }
        }
        C7612Ft0 c7612Ft0Mo4871c2 = interfaceC9786ih1.mo4871c();
        Boolean bool2 = Boolean.TRUE;
        C0480Hc c0480Hc2 = C11375v60.f44153h;
        Object objMo4794w7 = Boolean.FALSE;
        c7612Ft0Mo4871c2.getClass();
        try {
            objMo4794w7 = c7612Ft0Mo4871c2.mo4794w(c0480Hc2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objMo4794w7);
        boolean z2 = true;
        Object objMo4794w8 = null;
        if (zEquals) {
            if (m18274d() == null || m18274d().mo1334h().mo3592V() == null) {
                z = true;
            } else {
                AbstractC7806Jm0.m4412f("ImageCapture");
                z = false;
            }
            try {
                objMo4794w5 = c7612Ft0Mo4871c2.mo4794w(C11375v60.f44150e);
            } catch (IllegalArgumentException unused3) {
                objMo4794w5 = null;
            }
            Integer num = (Integer) objMo4794w5;
            if (num != null && num.intValue() != 256) {
                AbstractC7806Jm0.m4412f("ImageCapture");
                z = false;
            }
            if (!z) {
                AbstractC7806Jm0.m4412f("ImageCapture");
                c7612Ft0Mo4871c2.m2815e(C11375v60.f44153h, Boolean.FALSE);
            }
        } else {
            z = false;
        }
        C7612Ft0 c7612Ft0Mo4871c3 = interfaceC9786ih1.mo4871c();
        C0480Hc c0480Hc3 = C11375v60.f44150e;
        c7612Ft0Mo4871c3.getClass();
        try {
            objMo4794w = c7612Ft0Mo4871c3.mo4794w(c0480Hc3);
        } catch (IllegalArgumentException unused4) {
            objMo4794w = null;
        }
        Integer num2 = (Integer) objMo4794w;
        if (num2 != null) {
            if (m18274d() != null && m18274d().mo1334h().mo3592V() != null && num2.intValue() != 256) {
                z2 = false;
            }
            AbstractC9104dM1.m17545d("Cannot set non-JPEG buffer format with Extensions enabled.", z2);
            interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            C7612Ft0 c7612Ft0Mo4871c4 = interfaceC9786ih1.mo4871c();
            C0480Hc c0480Hc4 = C11375v60.f44151f;
            c7612Ft0Mo4871c4.getClass();
            try {
                objMo4794w2 = c7612Ft0Mo4871c4.mo4794w(c0480Hc4);
            } catch (IllegalArgumentException unused5) {
                objMo4794w2 = null;
            }
            if (Objects.equals(objMo4794w2, 2)) {
                interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 32);
            } else {
                C7612Ft0 c7612Ft0Mo4871c5 = interfaceC9786ih1.mo4871c();
                C0480Hc c0480Hc5 = C11375v60.f44151f;
                c7612Ft0Mo4871c5.getClass();
                try {
                    objMo4794w3 = c7612Ft0Mo4871c5.mo4794w(c0480Hc5);
                } catch (IllegalArgumentException unused6) {
                    objMo4794w3 = null;
                }
                if (Objects.equals(objMo4794w3, 3)) {
                    interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 32);
                    interfaceC9786ih1.mo4871c().m2815e(M60.f6993y0, 256);
                } else {
                    C7612Ft0 c7612Ft0Mo4871c6 = interfaceC9786ih1.mo4871c();
                    C0480Hc c0480Hc6 = C11375v60.f44151f;
                    c7612Ft0Mo4871c6.getClass();
                    try {
                        objMo4794w4 = c7612Ft0Mo4871c6.mo4794w(c0480Hc6);
                    } catch (IllegalArgumentException unused7) {
                        objMo4794w4 = null;
                    }
                    if (Objects.equals(objMo4794w4, 1)) {
                        interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 4101);
                        interfaceC9786ih1.mo4871c().m2815e(M60.f6994z0, C0149CM.f1328c);
                    } else if (z) {
                        interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 35);
                    } else {
                        C7612Ft0 c7612Ft0Mo4871c7 = interfaceC9786ih1.mo4871c();
                        C0480Hc c0480Hc7 = Y60.f14166H0;
                        c7612Ft0Mo4871c7.getClass();
                        try {
                            objMo4794w8 = c7612Ft0Mo4871c7.mo4794w(c0480Hc7);
                        } catch (IllegalArgumentException unused8) {
                        }
                        List list = (List) objMo4794w8;
                        if (list == null || m25109I(256, list)) {
                            interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 256);
                        } else if (m25109I(35, list)) {
                            interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 35);
                        }
                    }
                }
            }
        }
        return interfaceC9786ih1.mo4872d();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: w */
    public final void mo7106w() {
        C8734aW0 c8734aW0 = this.f43519t;
        c8734aW0.m9757c();
        c8734aW0.m9756b();
        C11507w81 c11507w81 = this.f43522w;
        if (c11507w81 != null) {
            c11507w81.m25566a();
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: x */
    public final C0419Ge mo7107x(C3950dn c3950dn) {
        this.f43520u.m25204b(c3950dn);
        Object[] objArr = {this.f43520u.m25206d()};
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
        C11303uY0 c11303uY0M25111G = m25111G(m18276f(), (C11375v60) this.f27337f, c0419Ge);
        this.f43520u = c11303uY0M25111G;
        Object[] objArr = {c11303uY0M25111G.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
        m18283p();
        return c0419Ge;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: z */
    public final void mo17508z() {
        C8734aW0 c8734aW0 = this.f43519t;
        c8734aW0.m9757c();
        c8734aW0.m9756b();
        C11507w81 c11507w81 = this.f43522w;
        if (c11507w81 != null) {
            c11507w81.m25566a();
        }
        m25110F(false);
        m18275e().mo908T(null);
    }
}
