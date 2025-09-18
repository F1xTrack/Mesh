package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: i60 */
/* loaded from: classes.dex */
public final class C9711i60 extends AbstractC9402fh1 {

    /* renamed from: u */
    public static final C9455g60 f28819u = new C9455g60();

    /* renamed from: o */
    public final AbstractC10095l60 f28820o;

    /* renamed from: p */
    public final Object f28821p;

    /* renamed from: q */
    public InterfaceC9071d60 f28822q;

    /* renamed from: r */
    public C11303uY0 f28823r;

    /* renamed from: s */
    public G70 f28824s;

    /* renamed from: t */
    public C11431vY0 f28825t;

    public C9711i60(C10351n60 c10351n60) {
        super(c10351n60);
        this.f28821p = new Object();
        if (((Integer) ((C7882Ky0) ((C10351n60) this.f27337f).getConfig()).mo4792q(C10351n60.f38104b, 0)).intValue() == 1) {
            this.f28820o = new C10223m60();
        } else {
            this.f28820o = new C10735q60(F91.m2518a(c10351n60, QR1.m6707e()));
        }
        this.f28820o.f36895d = m18969G();
        AbstractC10095l60 abstractC10095l60 = this.f28820o;
        C10351n60 c10351n602 = (C10351n60) this.f27337f;
        Boolean bool = Boolean.FALSE;
        c10351n602.getClass();
        abstractC10095l60.f36896e = ((Boolean) AbstractC11153tN0.m24898j(c10351n602, C10351n60.f38109g, bool)).booleanValue();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: A */
    public final void mo18267A(Matrix matrix) {
        super.mo18267A(matrix);
        AbstractC10095l60 abstractC10095l60 = this.f28820o;
        synchronized (abstractC10095l60.f36909r) {
            abstractC10095l60.f36903l = matrix;
            abstractC10095l60.f36904m = new Matrix(abstractC10095l60.f36903l);
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: C */
    public final void mo7092C(Rect rect) {
        this.f27340i = rect;
        AbstractC10095l60 abstractC10095l60 = this.f28820o;
        synchronized (abstractC10095l60.f36909r) {
            abstractC10095l60.f36901j = rect;
            abstractC10095l60.f36902k = new Rect(abstractC10095l60.f36901j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a2  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11303uY0 m18968F(p000.C10351n60 r14, p000.C0419Ge r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9711i60.m18968F(n60, Ge):uY0");
    }

    /* renamed from: G */
    public final int m18969G() {
        C10351n60 c10351n60 = (C10351n60) this.f27337f;
        c10351n60.getClass();
        return ((Integer) AbstractC11153tN0.m24898j(c10351n60, C10351n60.f38107e, 1)).intValue();
    }

    /* renamed from: H */
    public final void m18970H(Executor executor, InterfaceC9071d60 interfaceC9071d60) {
        synchronized (this.f28821p) {
            try {
                this.f28820o.m22363h(executor, new C0267EE(19, interfaceC9071d60));
                if (this.f28822q == null) {
                    m18283p();
                }
                this.f28822q = interfaceC9071d60;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: g */
    public final InterfaceC9914jh1 mo7101g(boolean z, InterfaceC10298mh1 interfaceC10298mh1) {
        f28819u.getClass();
        C10351n60 c10351n60 = C9455g60.f27563a;
        c10351n60.getClass();
        InterfaceC6854sw interfaceC6854swMo6364a = interfaceC10298mh1.mo6364a(F91.m2519b(c10351n60), 1);
        if (z) {
            interfaceC6854swMo6364a = AbstractC1374Vq.m8598q(interfaceC6854swMo6364a, c10351n60);
        }
        if (interfaceC6854swMo6364a == null) {
            return null;
        }
        return ((C9327f60) mo7103m(interfaceC6854swMo6364a)).m18189b();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: m */
    public final InterfaceC9786ih1 mo7103m(InterfaceC6854sw interfaceC6854sw) {
        return new C9327f60(C7612Ft0.m2813c(interfaceC6854sw), 0);
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: s */
    public final void mo18286s() {
        this.f28820o.f36910s = true;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(m18277h());
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: u */
    public final InterfaceC9914jh1 mo7104u(InterfaceC6766ro interfaceC6766ro, InterfaceC9786ih1 interfaceC9786ih1) {
        C10351n60 c10351n60 = (C10351n60) this.f27337f;
        c10351n60.getClass();
        Boolean bool = (Boolean) AbstractC11153tN0.m24898j(c10351n60, C10351n60.f38108f, null);
        boolean zM17862x0 = interfaceC6766ro.mo2410v().m17862x0(OnePixelShiftQuirk.class);
        AbstractC10095l60 abstractC10095l60 = this.f28820o;
        if (bool != null) {
            zM17862x0 = bool.booleanValue();
        }
        abstractC10095l60.f36897f = zM17862x0;
        synchronized (this.f28821p) {
        }
        return interfaceC9786ih1.mo4872d();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: x */
    public final C0419Ge mo7107x(C3950dn c3950dn) {
        this.f28823r.m25204b(c3950dn);
        Object[] objArr = {this.f28823r.m25206d()};
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
        C10351n60 c10351n60 = (C10351n60) this.f27337f;
        m18276f();
        C11303uY0 c11303uY0M18968F = m18968F(c10351n60, c0419Ge);
        this.f28823r = c11303uY0M18968F;
        Object[] objArr = {c11303uY0M18968F.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
        return c0419Ge;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: z */
    public final void mo17508z() {
        DV1.m1716a();
        C11431vY0 c11431vY0 = this.f28825t;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
            this.f28825t = null;
        }
        G70 g70 = this.f28824s;
        if (g70 != null) {
            g70.mo6573a();
            this.f28824s = null;
        }
        AbstractC10095l60 abstractC10095l60 = this.f28820o;
        abstractC10095l60.f36910s = false;
        abstractC10095l60.mo22358c();
    }
}
