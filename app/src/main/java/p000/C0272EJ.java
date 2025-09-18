package p000;

import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;

/* renamed from: EJ */
/* loaded from: classes.dex */
public final class C0272EJ extends AbstractC1544YX {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1544YX f2600a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1725g f2601b;

    public C0272EJ(DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g, AbstractC1544YX abstractC1544YX) {
        this.f2601b = dialogInterfaceOnCancelListenerC1725g;
        this.f2600a = abstractC1544YX;
    }

    @Override // p000.AbstractC1544YX
    /* renamed from: b */
    public final View mo2122b(int i) {
        AbstractC1544YX abstractC1544YX = this.f2600a;
        return abstractC1544YX.mo2123c() ? abstractC1544YX.mo2122b(i) : this.f2601b.onFindViewById(i);
    }

    @Override // p000.AbstractC1544YX
    /* renamed from: c */
    public final boolean mo2123c() {
        return this.f2600a.mo2123c() || this.f2601b.onHasView();
    }
}
