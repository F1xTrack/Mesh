package defpackage;

import android.view.MenuItem;

/* renamed from: Nq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1082Nq0 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ MenuItemC1160Oq0 b;

    public MenuItemOnActionExpandListenerC1082Nq0(MenuItemC1160Oq0 menuItemC1160Oq0, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = menuItemC1160Oq0;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.f(menuItem));
    }
}
