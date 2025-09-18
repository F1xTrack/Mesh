package defpackage;

import android.view.ActionProvider;

/* renamed from: Lq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0927Lq0 implements ActionProvider.VisibilityListener {
    public C1304Qm0 a;
    public final ActionProvider b;
    public final /* synthetic */ MenuItemC1160Oq0 c;

    public ActionProviderVisibilityListenerC0927Lq0(MenuItemC1160Oq0 menuItemC1160Oq0, ActionProvider actionProvider) {
        this.c = menuItemC1160Oq0;
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C1304Qm0 c1304Qm0 = this.a;
        if (c1304Qm0 != null) {
            MenuC0225Cq0 menuC0225Cq0 = ((C0849Kq0) c1304Qm0.b).n;
            menuC0225Cq0.h = true;
            menuC0225Cq0.p(true);
        }
    }
}
