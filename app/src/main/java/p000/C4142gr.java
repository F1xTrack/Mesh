package p000;

import android.view.ViewGroup;

/* renamed from: gr */
/* loaded from: classes.dex */
public final class C4142gr extends AbstractC7631Gc1 {

    /* renamed from: a */
    public boolean f28065a = false;

    /* renamed from: b */
    public final ViewGroup f28066b;

    public C4142gr(ViewGroup viewGroup) {
        this.f28066b = viewGroup;
    }

    @Override // p000.AbstractC7631Gc1, p000.InterfaceC7527Ec1
    /* renamed from: b */
    public final void mo2335b() {
        H02.m3209b(this.f28066b, false);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        if (!this.f28065a) {
            H02.m3209b(this.f28066b, false);
        }
        abstractC7579Fc1.mo2715z(this);
    }

    @Override // p000.AbstractC7631Gc1, p000.InterfaceC7527Ec1
    /* renamed from: f */
    public final void mo2339f() {
        H02.m3209b(this.f28066b, true);
    }

    @Override // p000.AbstractC7631Gc1, p000.InterfaceC7527Ec1
    /* renamed from: g */
    public final void mo2340g(AbstractC7579Fc1 abstractC7579Fc1) {
        H02.m3209b(this.f28066b, false);
        this.f28065a = true;
    }
}
