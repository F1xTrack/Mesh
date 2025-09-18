package defpackage;

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
public final class C7349u60 extends AbstractC3821fh1 {
    public static final C6967s60 z = new C6967s60();
    public final int o;
    public final AtomicReference p;
    public final int q;
    public int r;
    public Rational s;
    public final C2149aW0 t;
    public C7433uY0 u;
    public C7375uF v;
    public C7737w81 w;
    public C7624vY0 x;
    public final C1304Qm0 y;

    public C7349u60(C7540v60 c7540v60) {
        super(c7540v60);
        this.p = new AtomicReference(null);
        this.r = -1;
        this.s = null;
        this.y = new C1304Qm0(21, this);
        C7540v60 c7540v602 = (C7540v60) this.f;
        C0572Hc c0572Hc = C7540v60.b;
        if (c7540v602.Q(c0572Hc)) {
            this.o = ((Integer) AbstractC7209tN0.i(c7540v602, c0572Hc)).intValue();
        } else {
            this.o = 1;
        }
        this.q = ((Integer) c7540v602.q(C7540v60.i, 0)).intValue();
        this.t = new C2149aW0((InterfaceC7158t60) c7540v602.q(C7540v60.k, null));
    }

    public static boolean I(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z2) {
        C7737w81 c7737w81;
        DV1.a();
        C7624vY0 c7624vY0 = this.x;
        if (c7624vY0 != null) {
            c7624vY0.b();
            this.x = null;
        }
        C7375uF c7375uF = this.v;
        if (c7375uF != null) {
            c7375uF.v();
            this.v = null;
        }
        if (z2 || (c7737w81 = this.w) == null) {
            return;
        }
        c7737w81.a();
        this.w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0104  */
    /* JADX WARN: Type inference failed for: r14v7, types: [Ir0] */
    /* JADX WARN: Type inference failed for: r14v9, types: [Ir0] */
    /* JADX WARN: Type inference failed for: r1v26, types: [nn] */
    /* JADX WARN: Type inference failed for: r1v31, types: [nn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7433uY0 G(java.lang.String r29, defpackage.C7540v60 r30, defpackage.C0500Ge r31) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7349u60.G(java.lang.String, v60, Ge):uY0");
    }

    public final int H() {
        int iIntValue;
        synchronized (this.p) {
            iIntValue = this.r;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((C7540v60) this.f).q(C7540v60.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void J(VH vh, ExecutorService executorService, C2226aw c2226aw) {
        Rect rect;
        int iRound;
        int i;
        int i2;
        int i3;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            QR1.h().execute(new RunnableC6880rf(this, vh, executorService, c2226aw, 8));
            return;
        }
        DV1.a();
        if (H() == 3 && this.t.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        InterfaceC7480uo interfaceC7480uoD = d();
        Rect rect2 = null;
        if (interfaceC7480uoD == null) {
            C7730w60 c7730w60 = new C7730w60("Not bound to a valid Camera [" + this + "]", null);
            C0767Jp c0767Jp = (C0767Jp) c2226aw.e;
            if (c0767Jp.isActive()) {
                c0767Jp.resumeWith(RQ1.b(c7730w60));
                return;
            }
            return;
        }
        boolean z2 = this.f.Y() != 0;
        if (z2) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        C7737w81 c7737w81 = this.w;
        Objects.requireNonNull(c7737w81);
        Rect rect3 = this.i;
        Size sizeC = c();
        Objects.requireNonNull(sizeC);
        if (rect3 != null) {
            rect = rect3;
        } else {
            Rational rational = this.s;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect2 = new Rect(0, 0, sizeC.getWidth(), sizeC.getHeight());
            } else {
                InterfaceC7480uo interfaceC7480uoD2 = d();
                Objects.requireNonNull(interfaceC7480uoD2);
                int i4 = i(interfaceC7480uoD2, false);
                Rational rational2 = new Rational(this.s.getDenominator(), this.s.getNumerator());
                if (!AbstractC7255tc1.c(i4)) {
                    rational2 = this.s;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    AbstractC0759Jm0.f("ImageUtil");
                } else {
                    int width = sizeC.getWidth();
                    int height = sizeC.getHeight();
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
        Matrix matrix = this.j;
        int i5 = i(interfaceC7480uoD, false);
        C7540v60 c7540v60 = (C7540v60) this.f;
        C0572Hc c0572Hc = C7540v60.j;
        if (c7540v60.Q(c0572Hc)) {
            iIntValue = ((Integer) ((C0873Ky0) c7540v60.getConfig()).w(c0572Hc)).intValue();
        } else {
            int i6 = this.o;
            if (i6 == 0) {
                iIntValue = 100;
            } else {
                if (i6 != 1 && i6 != 2) {
                    throw new IllegalStateException(AbstractC8235ym.g(i6, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i7 = iIntValue;
        List listUnmodifiableList = Collections.unmodifiableList(this.u.e);
        AbstractC3377dM1.d("onDiskCallback and outputFileOptions should be both null or both non-null.", !false);
        C1357Re c1357Re = new C1357Re(executorService, c2226aw, vh, rect, matrix, i5, i7, this.o, z2, listUnmodifiableList);
        if (z2) {
            HashMap map = c1357Re.b;
            Boolean bool = Boolean.FALSE;
            map.put(32, bool);
            map.put(256, bool);
        }
        DV1.a();
        c7737w81.a.offer(c1357Re);
        c7737w81.c();
    }

    public final void K() {
        synchronized (this.p) {
            try {
                if (this.p.get() != null) {
                    return;
                }
                e().R(H());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 g(boolean z2, InterfaceC5934mh1 interfaceC5934mh1) {
        z.getClass();
        C7540v60 c7540v60 = C6967s60.a;
        c7540v60.getClass();
        InterfaceC7122sw interfaceC7122swA = interfaceC5934mh1.a(F91.b(c7540v60), this.o);
        if (z2) {
            interfaceC7122swA = AbstractC1705Vq.q(interfaceC7122swA, c7540v60);
        }
        if (interfaceC7122swA == null) {
            return null;
        }
        return ((C3709f60) m(interfaceC7122swA)).e();
    }

    @Override // defpackage.AbstractC3821fh1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC4393ih1 m(InterfaceC7122sw interfaceC7122sw) {
        return new C3709f60(C0468Ft0.c(interfaceC7122sw), 1);
    }

    @Override // defpackage.AbstractC3821fh1
    public final void s() {
        AbstractC3377dM1.h(d(), "Attached camera cannot be null");
        if (H() == 3) {
            InterfaceC7480uo interfaceC7480uoD = d();
            if ((interfaceC7480uoD != null ? interfaceC7480uoD.b().j() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final void t() {
        AbstractC0759Jm0.f("ImageCapture");
        K();
        e().T(this.t);
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 u(InterfaceC6907ro interfaceC6907ro, InterfaceC4393ih1 interfaceC4393ih1) {
        boolean z2;
        Object objW;
        Object objW2;
        Object objW3;
        Object objW4;
        Object objW5;
        if (interfaceC6907ro.v().x0(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            C0468Ft0 c0468Ft0C = interfaceC4393ih1.c();
            C0572Hc c0572Hc = C7540v60.h;
            Object objW6 = Boolean.TRUE;
            c0468Ft0C.getClass();
            try {
                objW6 = c0468Ft0C.w(c0572Hc);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objW6)) {
                AbstractC0759Jm0.f("ImageCapture");
            } else {
                AbstractC0759Jm0.f("ImageCapture");
                interfaceC4393ih1.c().e(C7540v60.h, Boolean.TRUE);
            }
        }
        C0468Ft0 c0468Ft0C2 = interfaceC4393ih1.c();
        Boolean bool2 = Boolean.TRUE;
        C0572Hc c0572Hc2 = C7540v60.h;
        Object objW7 = Boolean.FALSE;
        c0468Ft0C2.getClass();
        try {
            objW7 = c0468Ft0C2.w(c0572Hc2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objW7);
        boolean z3 = true;
        Object objW8 = null;
        if (zEquals) {
            if (d() == null || d().h().V() == null) {
                z2 = true;
            } else {
                AbstractC0759Jm0.f("ImageCapture");
                z2 = false;
            }
            try {
                objW5 = c0468Ft0C2.w(C7540v60.e);
            } catch (IllegalArgumentException unused3) {
                objW5 = null;
            }
            Integer num = (Integer) objW5;
            if (num != null && num.intValue() != 256) {
                AbstractC0759Jm0.f("ImageCapture");
                z2 = false;
            }
            if (!z2) {
                AbstractC0759Jm0.f("ImageCapture");
                c0468Ft0C2.e(C7540v60.h, Boolean.FALSE);
            }
        } else {
            z2 = false;
        }
        C0468Ft0 c0468Ft0C3 = interfaceC4393ih1.c();
        C0572Hc c0572Hc3 = C7540v60.e;
        c0468Ft0C3.getClass();
        try {
            objW = c0468Ft0C3.w(c0572Hc3);
        } catch (IllegalArgumentException unused4) {
            objW = null;
        }
        Integer num2 = (Integer) objW;
        if (num2 != null) {
            if (d() != null && d().h().V() != null && num2.intValue() != 256) {
                z3 = false;
            }
            AbstractC3377dM1.d("Cannot set non-JPEG buffer format with Extensions enabled.", z3);
            interfaceC4393ih1.c().e(M60.x0, Integer.valueOf(z2 ? 35 : num2.intValue()));
        } else {
            C0468Ft0 c0468Ft0C4 = interfaceC4393ih1.c();
            C0572Hc c0572Hc4 = C7540v60.f;
            c0468Ft0C4.getClass();
            try {
                objW2 = c0468Ft0C4.w(c0572Hc4);
            } catch (IllegalArgumentException unused5) {
                objW2 = null;
            }
            if (Objects.equals(objW2, 2)) {
                interfaceC4393ih1.c().e(M60.x0, 32);
            } else {
                C0468Ft0 c0468Ft0C5 = interfaceC4393ih1.c();
                C0572Hc c0572Hc5 = C7540v60.f;
                c0468Ft0C5.getClass();
                try {
                    objW3 = c0468Ft0C5.w(c0572Hc5);
                } catch (IllegalArgumentException unused6) {
                    objW3 = null;
                }
                if (Objects.equals(objW3, 3)) {
                    interfaceC4393ih1.c().e(M60.x0, 32);
                    interfaceC4393ih1.c().e(M60.y0, 256);
                } else {
                    C0468Ft0 c0468Ft0C6 = interfaceC4393ih1.c();
                    C0572Hc c0572Hc6 = C7540v60.f;
                    c0468Ft0C6.getClass();
                    try {
                        objW4 = c0468Ft0C6.w(c0572Hc6);
                    } catch (IllegalArgumentException unused7) {
                        objW4 = null;
                    }
                    if (Objects.equals(objW4, 1)) {
                        interfaceC4393ih1.c().e(M60.x0, 4101);
                        interfaceC4393ih1.c().e(M60.z0, CM.c);
                    } else if (z2) {
                        interfaceC4393ih1.c().e(M60.x0, 35);
                    } else {
                        C0468Ft0 c0468Ft0C7 = interfaceC4393ih1.c();
                        C0572Hc c0572Hc7 = Y60.H0;
                        c0468Ft0C7.getClass();
                        try {
                            objW8 = c0468Ft0C7.w(c0572Hc7);
                        } catch (IllegalArgumentException unused8) {
                        }
                        List list = (List) objW8;
                        if (list == null || I(256, list)) {
                            interfaceC4393ih1.c().e(M60.x0, 256);
                        } else if (I(35, list)) {
                            interfaceC4393ih1.c().e(M60.x0, 35);
                        }
                    }
                }
            }
        }
        return interfaceC4393ih1.d();
    }

    @Override // defpackage.AbstractC3821fh1
    public final void w() {
        C2149aW0 c2149aW0 = this.t;
        c2149aW0.c();
        c2149aW0.b();
        C7737w81 c7737w81 = this.w;
        if (c7737w81 != null) {
            c7737w81.a();
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge x(C3456dn c3456dn) {
        this.u.b(c3456dn);
        Object[] objArr = {this.u.d()};
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
        C7433uY0 c7433uY0G = G(f(), (C7540v60) this.f, c0500Ge);
        this.u = c7433uY0G;
        Object[] objArr = {c7433uY0G.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p();
        return c0500Ge;
    }

    @Override // defpackage.AbstractC3821fh1
    public final void z() {
        C2149aW0 c2149aW0 = this.t;
        c2149aW0.c();
        c2149aW0.b();
        C7737w81 c7737w81 = this.w;
        if (c7737w81 != null) {
            c7737w81.a();
        }
        F(false);
        e().T(null);
    }
}
