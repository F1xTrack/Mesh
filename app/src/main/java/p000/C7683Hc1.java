package p000;

import java.util.ArrayList;

/* renamed from: Hc1 */
/* loaded from: classes.dex */
public final class C7683Hc1 extends AbstractC7631Gc1 {

    /* renamed from: a */
    public final /* synthetic */ C7119x8 f4374a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC7735Ic1 f4375b;

    public C7683Hc1(ViewTreeObserverOnPreDrawListenerC7735Ic1 viewTreeObserverOnPreDrawListenerC7735Ic1, C7119x8 c7119x8) {
        this.f4375b = viewTreeObserverOnPreDrawListenerC7735Ic1;
        this.f4374a = c7119x8;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        ((ArrayList) this.f4374a.getOrDefault(this.f4375b.f5044b, null)).remove(abstractC7579Fc1);
        abstractC7579Fc1.mo2715z(this);
    }
}
