package p000;

import android.view.MenuItem;

/* renamed from: Nq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC8022Nq0 implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f8028a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC8074Oq0 f8029b;

    public MenuItemOnActionExpandListenerC8022Nq0(MenuItemC8074Oq0 menuItemC8074Oq0, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8029b = menuItemC8074Oq0;
        this.f8028a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8028a.onMenuItemActionCollapse(this.f8029b.m2028f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8028a.onMenuItemActionExpand(this.f8029b.m2028f(menuItem));
    }
}
