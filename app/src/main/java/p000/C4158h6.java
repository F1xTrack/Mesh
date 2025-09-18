package p000;

import android.view.LayoutInflater;

/* renamed from: h6 */
/* loaded from: classes.dex */
public final class C4158h6 implements InterfaceC8192Qx0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractActivityC4221i6 f28259a;

    public C4158h6(AbstractActivityC4221i6 abstractActivityC4221i6) {
        this.f28259a = abstractActivityC4221i6;
    }

    @Override // p000.InterfaceC8192Qx0
    /* renamed from: a */
    public final void mo6835a(AbstractActivityC0499Hv abstractActivityC0499Hv) {
        AbstractActivityC4221i6 abstractActivityC4221i6 = this.f28259a;
        AbstractC6928u6 abstractC6928u6M18964g = abstractActivityC4221i6.m18964g();
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) abstractC6928u6M18964g;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0448H6.f4091k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0448H6);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0448H6;
        }
        abstractActivityC4221i6.getSavedStateRegistry().m22441a("androidx:appcompat");
        abstractC6928u6M18964g.mo3280c();
    }
}
