package p000;

import android.view.ActionProvider;

/* renamed from: Lq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC7918Lq0 implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public C8170Qm0 f6894a;

    /* renamed from: b */
    public final ActionProvider f6895b;

    /* renamed from: c */
    public final /* synthetic */ MenuItemC8074Oq0 f6896c;

    public ActionProviderVisibilityListenerC7918Lq0(MenuItemC8074Oq0 menuItemC8074Oq0, ActionProvider actionProvider) {
        this.f6896c = menuItemC8074Oq0;
        this.f6895b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C8170Qm0 c8170Qm0 = this.f6894a;
        if (c8170Qm0 != null) {
            MenuC7450Cq0 menuC7450Cq0 = ((C7866Kq0) c8170Qm0.f9780b).f6345n;
            menuC7450Cq0.f1709h = true;
            menuC7450Cq0.m1417p(true);
        }
    }
}
