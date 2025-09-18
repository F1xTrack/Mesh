package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class I51 extends MenuC0225Cq0 implements SubMenu {
    public final C0849Kq0 A;
    public final MenuC0225Cq0 z;

    public I51(Context context, MenuC0225Cq0 menuC0225Cq0, C0849Kq0 c0849Kq0) {
        super(context);
        this.z = menuC0225Cq0;
        this.A = c0849Kq0;
    }

    @Override // defpackage.MenuC0225Cq0
    public final boolean d(C0849Kq0 c0849Kq0) {
        return this.z.d(c0849Kq0);
    }

    @Override // defpackage.MenuC0225Cq0
    public final boolean e(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        return super.e(menuC0225Cq0, menuItem) || this.z.e(menuC0225Cq0, menuItem);
    }

    @Override // defpackage.MenuC0225Cq0
    public final boolean f(C0849Kq0 c0849Kq0) {
        return this.z.f(c0849Kq0);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.MenuC0225Cq0
    public final String j() {
        C0849Kq0 c0849Kq0 = this.A;
        int i = c0849Kq0 != null ? c0849Kq0.a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC7209tN0.u(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.MenuC0225Cq0
    public final MenuC0225Cq0 k() {
        return this.z.k();
    }

    @Override // defpackage.MenuC0225Cq0
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.MenuC0225Cq0
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.MenuC0225Cq0
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.MenuC0225Cq0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.MenuC0225Cq0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
