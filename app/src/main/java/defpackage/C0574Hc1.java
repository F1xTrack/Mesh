package defpackage;

import java.util.ArrayList;

/* renamed from: Hc1 */
/* loaded from: classes.dex */
public final class C0574Hc1 extends AbstractC0496Gc1 {
    public final /* synthetic */ C7925x8 a;
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0652Ic1 b;

    public C0574Hc1(ViewTreeObserverOnPreDrawListenerC0652Ic1 viewTreeObserverOnPreDrawListenerC0652Ic1, C7925x8 c7925x8) {
        this.b = viewTreeObserverOnPreDrawListenerC0652Ic1;
        this.a = c7925x8;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        ((ArrayList) this.a.getOrDefault(this.b.b, null)).remove(abstractC0418Fc1);
        abstractC0418Fc1.z(this);
    }
}
