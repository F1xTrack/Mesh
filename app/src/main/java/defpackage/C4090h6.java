package defpackage;

import android.view.LayoutInflater;

/* renamed from: h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4090h6 implements InterfaceC1337Qx0 {
    public final /* synthetic */ AbstractActivityC4281i6 a;

    public C4090h6(AbstractActivityC4281i6 abstractActivityC4281i6) {
        this.a = abstractActivityC4281i6;
    }

    @Override // defpackage.InterfaceC1337Qx0
    public final void a(AbstractActivityC0629Hv abstractActivityC0629Hv) {
        AbstractActivityC4281i6 abstractActivityC4281i6 = this.a;
        AbstractC7348u6 abstractC7348u6G = abstractActivityC4281i6.g();
        H6 h6 = (H6) abstractC7348u6G;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(h6.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(h6);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof H6;
        }
        abstractActivityC4281i6.getSavedStateRegistry().a("androidx:appcompat");
        abstractC7348u6G.c();
    }
}
