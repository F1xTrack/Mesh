package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class Q61 extends AbstractC4314iH {
    public final C0599Hl o;
    public C0365El p;
    public AbstractC4314iH q;
    public T61 r;

    public Q61(Size size, int i) {
        super(size, i);
        this.o = AbstractC8171yQ1.b(new C1724Vw0(20, this));
    }

    @Override // defpackage.AbstractC4314iH
    public final void a() {
        super.a();
        DV1.d(new M61(this, 2));
    }

    @Override // defpackage.AbstractC4314iH
    public final InterfaceFutureC0750Jj0 f() {
        return this.o;
    }

    public final boolean g(AbstractC4314iH abstractC4314iH, Runnable runnable) {
        boolean z;
        DV1.a();
        abstractC4314iH.getClass();
        AbstractC4314iH abstractC4314iH2 = this.q;
        if (abstractC4314iH2 == abstractC4314iH) {
            return false;
        }
        AbstractC3377dM1.i(abstractC4314iH2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        Size size = this.h;
        Size size2 = abstractC4314iH.h;
        AbstractC3377dM1.d("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i = abstractC4314iH.i;
        int i2 = this.i;
        AbstractC3377dM1.d(AbstractC8235ym.j("The provider's format(", ") must match the parent(", i2, i, ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        AbstractC3377dM1.i(!z, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.q = abstractC4314iH;
        AbstractC1500Sz1.m(abstractC4314iH.c(), this.p);
        abstractC4314iH.d();
        AbstractC1500Sz1.l(this.e).d(new RunnableC3932gH(abstractC4314iH, 2), QR1.a());
        AbstractC1500Sz1.l(abstractC4314iH.g).d(runnable, QR1.h());
        return true;
    }
}
