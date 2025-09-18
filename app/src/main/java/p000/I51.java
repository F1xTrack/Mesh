package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class I51 extends MenuC7450Cq0 implements SubMenu {

    /* renamed from: A */
    public final C7866Kq0 f4695A;

    /* renamed from: z */
    public final MenuC7450Cq0 f4696z;

    public I51(Context context, MenuC7450Cq0 menuC7450Cq0, C7866Kq0 c7866Kq0) {
        super(context);
        this.f4696z = menuC7450Cq0;
        this.f4695A = c7866Kq0;
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: d */
    public final boolean mo1405d(C7866Kq0 c7866Kq0) {
        return this.f4696z.mo1405d(c7866Kq0);
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: e */
    public final boolean mo1406e(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        return super.mo1406e(menuC7450Cq0, menuItem) || this.f4696z.mo1406e(menuC7450Cq0, menuItem);
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: f */
    public final boolean mo1407f(C7866Kq0 c7866Kq0) {
        return this.f4696z.mo1407f(c7866Kq0);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4695A;
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: j */
    public final String mo1411j() {
        C7866Kq0 c7866Kq0 = this.f4695A;
        int i = c7866Kq0 != null ? c7866Kq0.f6332a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC11153tN0.m24909u(i, "android:menu:actionviewstates:");
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: k */
    public final MenuC7450Cq0 mo1412k() {
        return this.f4696z.mo1412k();
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: m */
    public final boolean mo1414m() {
        return this.f4696z.mo1414m();
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: n */
    public final boolean mo1415n() {
        return this.f4696z.mo1415n();
    }

    @Override // p000.MenuC7450Cq0
    /* renamed from: o */
    public final boolean mo1416o() {
        return this.f4696z.mo1416o();
    }

    @Override // p000.MenuC7450Cq0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f4696z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m1422u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m1422u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m1422u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4695A.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC7450Cq0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f4696z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m1422u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m1422u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4695A.setIcon(i);
        return this;
    }
}
