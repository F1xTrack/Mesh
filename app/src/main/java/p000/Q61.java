package p000;

import android.util.Size;

/* loaded from: classes.dex */
public final class Q61 extends AbstractC4232iH {

    /* renamed from: o */
    public final C0489Hl f9480o;

    /* renamed from: p */
    public C0300El f9481p;

    /* renamed from: q */
    public AbstractC4232iH f9482q;

    /* renamed from: r */
    public T61 f9483r;

    public Q61(Size size, int i) {
        super(size, i);
        this.f9480o = AbstractC11797yQ1.m26149b(new C8450Vw0(20, this));
    }

    @Override // p000.AbstractC4232iH
    /* renamed from: a */
    public final void mo6573a() {
        super.mo6573a();
        DV1.m1719d(new M61(this, 2));
    }

    @Override // p000.AbstractC4232iH
    /* renamed from: f */
    public final InterfaceFutureC7800Jj0 mo2926f() {
        return this.f9480o;
    }

    /* renamed from: g */
    public final boolean m6574g(AbstractC4232iH abstractC4232iH, Runnable runnable) {
        boolean z;
        DV1.m1716a();
        abstractC4232iH.getClass();
        AbstractC4232iH abstractC4232iH2 = this.f9482q;
        if (abstractC4232iH2 == abstractC4232iH) {
            return false;
        }
        AbstractC9104dM1.m17550i(abstractC4232iH2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        Size size = this.f29026h;
        Size size2 = abstractC4232iH.f29026h;
        AbstractC9104dM1.m17545d("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i = abstractC4232iH.f29027i;
        int i2 = this.f29027i;
        AbstractC9104dM1.m17545d(AbstractC7222ym.m26233j("The provider's format(", ") must match the parent(", i2, i, ")"), i2 == i);
        synchronized (this.f29019a) {
            z = this.f29021c;
        }
        AbstractC9104dM1.m17550i(!z, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.f9482q = abstractC4232iH;
        AbstractC8301Sz1.m7490m(abstractC4232iH.m18992c(), this.f9481p);
        abstractC4232iH.m18993d();
        AbstractC8301Sz1.m7489l(this.f29023e).mo2494d(new RunnableC4106gH(abstractC4232iH, 2), QR1.m6703a());
        AbstractC8301Sz1.m7489l(abstractC4232iH.f29025g).mo2494d(runnable, QR1.m6710h());
        return true;
    }
}
