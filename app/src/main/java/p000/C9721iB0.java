package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: iB0 */
/* loaded from: classes.dex */
public final class C9721iB0 extends AbstractC0693L {

    /* renamed from: t */
    public final C8342Tu0 f28883t;

    /* renamed from: u */
    public final CC0 f28884u;

    /* renamed from: v */
    public C4196hi f28885v;

    /* renamed from: w */
    public InterfaceC10608p61 f28886w;

    /* renamed from: x */
    public C10737q70 f28887x;

    public C9721iB0(Resources resources, C6479nH c6479nH, ScheduledExecutorServiceC7689Hf1 scheduledExecutorServiceC7689Hf1, CC0 cc0) {
        super(c6479nH, scheduledExecutorServiceC7689Hf1);
        this.f28883t = new C8342Tu0(10, resources);
        this.f28884u = cc0;
    }

    @Override // p000.AbstractC0693L
    /* renamed from: b */
    public final Drawable mo4804b(Object obj) {
        AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
        try {
            AbstractC4250iZ.m19063b();
            ML1.m5338e(AbstractC7292zt.m26565D(abstractC7292zt));
            InterfaceC7103wt interfaceC7103wt = (InterfaceC7103wt) abstractC7292zt.m26572w();
            m18979q(interfaceC7103wt);
            Drawable drawableM7816h0 = this.f28883t.m7816h0(interfaceC7103wt);
            if (drawableM7816h0 != null) {
                return drawableM7816h0;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + interfaceC7103wt);
        } finally {
            AbstractC4250iZ.m19063b();
        }
    }

    @Override // p000.AbstractC0693L
    /* renamed from: d */
    public final L60 mo4806d(Object obj) {
        AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
        ML1.m5338e(AbstractC7292zt.m26565D(abstractC7292zt));
        C1336VE c1336ve = (C1336VE) ((InterfaceC7103wt) abstractC7292zt.m26572w());
        if (c1336ve.f12444b == null) {
            int width = c1336ve.getWidth();
            int height = c1336ve.getHeight();
            AbstractC6697qi.m24051d(c1336ve.f12446d);
            c1336ve.f12444b = new L60(width, height, c1336ve.f12443a);
        }
        return c1336ve.f12444b;
    }

    /* renamed from: r */
    public final void m18980r(InterfaceC7006vL interfaceC7006vL) {
        if (AbstractC3929dS.f26114a.m18228o(2)) {
            AbstractC3929dS.m17679l(AbstractC0693L.f6427s, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f6435h, interfaceC7006vL);
        }
        this.f6428a.m25182a(interfaceC7006vL != null ? EnumC6880tL.f42997a : EnumC6880tL.f42998b);
        if (this.f6438k) {
            this.f6429b.m23116b(this);
            m4815m();
        }
        F00 f00 = this.f6433f;
        if (f00 != null) {
            C11037sT0 c11037sT0 = f00.f3008d;
            c11037sT0.f42445d = null;
            c11037sT0.invalidateSelf();
            this.f6433f = null;
        }
        if (interfaceC7006vL != null) {
            if (!(interfaceC7006vL instanceof F00)) {
                throw new IllegalArgumentException();
            }
            F00 f002 = (F00) interfaceC7006vL;
            this.f6433f = f002;
            C6998vD c6998vD = this.f6434g;
            C11037sT0 c11037sT02 = f002.f3008d;
            c11037sT02.f42445d = c6998vD;
            c11037sT02.invalidateSelf();
        }
        m18979q(null);
    }

    @Override // p000.AbstractC0693L
    public final String toString() {
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        c8539Xo1M2121d.m9143l(super.toString(), "super");
        c8539Xo1M2121d.m9143l(this.f28886w, "dataSourceSupplier");
        return c8539Xo1M2121d.toString();
    }

    /* renamed from: q */
    public final void m18979q(InterfaceC7103wt interfaceC7103wt) {
    }
}
