package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: iB0 */
/* loaded from: classes.dex */
public final class C4297iB0 extends L {
    public final C1562Tu0 t;
    public final CC0 u;
    public C4204hi v;
    public InterfaceC6396p61 w;
    public C6589q70 x;

    public C4297iB0(Resources resources, C6045nH c6045nH, ScheduledExecutorServiceC0583Hf1 scheduledExecutorServiceC0583Hf1, CC0 cc0) {
        super(c6045nH, scheduledExecutorServiceC0583Hf1);
        this.t = new C1562Tu0(10, resources);
        this.u = cc0;
    }

    @Override // defpackage.L
    public final Drawable b(Object obj) {
        AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
        try {
            AbstractC4368iZ.b();
            ML1.e(AbstractC8446zt.D(abstractC8446zt));
            InterfaceC7876wt interfaceC7876wt = (InterfaceC7876wt) abstractC8446zt.w();
            q(interfaceC7876wt);
            Drawable drawableH0 = this.t.h0(interfaceC7876wt);
            if (drawableH0 != null) {
                return drawableH0;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + interfaceC7876wt);
        } finally {
            AbstractC4368iZ.b();
        }
    }

    @Override // defpackage.L
    public final L60 d(Object obj) {
        AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
        ML1.e(AbstractC8446zt.D(abstractC8446zt));
        VE ve = (VE) ((InterfaceC7876wt) abstractC8446zt.w());
        if (ve.b == null) {
            int width = ve.getWidth();
            int height = ve.getHeight();
            AbstractC6699qi.d(ve.d);
            ve.b = new L60(width, height, ve.a);
        }
        return ve.b;
    }

    public final void r(InterfaceC7584vL interfaceC7584vL) {
        if (AbstractC3393dS.a.o(2)) {
            AbstractC3393dS.l(L.s, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.h, interfaceC7584vL);
        }
        this.a.a(interfaceC7584vL != null ? EnumC7202tL.a : EnumC7202tL.b);
        if (this.k) {
            this.b.b(this);
            m();
        }
        F00 f00 = this.f;
        if (f00 != null) {
            C7036sT0 c7036sT0 = f00.d;
            c7036sT0.d = null;
            c7036sT0.invalidateSelf();
            this.f = null;
        }
        if (interfaceC7584vL != null) {
            if (!(interfaceC7584vL instanceof F00)) {
                throw new IllegalArgumentException();
            }
            F00 f002 = (F00) interfaceC7584vL;
            this.f = f002;
            C7560vD c7560vD = this.g;
            C7036sT0 c7036sT02 = f002.d;
            c7036sT02.d = c7560vD;
            c7036sT02.invalidateSelf();
        }
        q(null);
    }

    @Override // defpackage.L
    public final String toString() {
        C1857Xo1 c1857Xo1D = EI1.d(this);
        c1857Xo1D.l(super.toString(), "super");
        c1857Xo1D.l(this.w, "dataSourceSupplier");
        return c1857Xo1D.toString();
    }

    public final void q(InterfaceC7876wt interfaceC7876wt) {
    }
}
