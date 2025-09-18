package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: i2 */
/* loaded from: classes.dex */
public final class C4217i2 implements InterfaceMenuItemC11884z61 {

    /* renamed from: a */
    public CharSequence f28762a;

    /* renamed from: b */
    public CharSequence f28763b;

    /* renamed from: c */
    public Intent f28764c;

    /* renamed from: d */
    public char f28765d;

    /* renamed from: e */
    public int f28766e;

    /* renamed from: f */
    public char f28767f;

    /* renamed from: g */
    public int f28768g;

    /* renamed from: h */
    public Drawable f28769h;

    /* renamed from: i */
    public Context f28770i;

    /* renamed from: j */
    public CharSequence f28771j;

    /* renamed from: k */
    public CharSequence f28772k;

    /* renamed from: l */
    public ColorStateList f28773l;

    /* renamed from: m */
    public PorterDuff.Mode f28774m;

    /* renamed from: n */
    public boolean f28775n;

    /* renamed from: o */
    public boolean f28776o;

    /* renamed from: p */
    public int f28777p;

    @Override // p000.InterfaceMenuItemC11884z61
    /* renamed from: a */
    public final InterfaceMenuItemC11884z61 mo4766a(ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC11884z61
    /* renamed from: b */
    public final ActionProviderVisibilityListenerC7918Lq0 mo4767b() {
        return null;
    }

    /* renamed from: c */
    public final void m18932c() {
        Drawable drawable = this.f28769h;
        if (drawable != null) {
            if (this.f28775n || this.f28776o) {
                this.f28769h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f28769h = drawableMutate;
                if (this.f28775n) {
                    AbstractC4173hL.m18806h(drawableMutate, this.f28773l);
                }
                if (this.f28776o) {
                    AbstractC4173hL.m18807i(this.f28769h, this.f28774m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f28768g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f28767f;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f28771j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f28769h;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f28773l;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f28774m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f28764c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f28766e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f28765d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f28762a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f28763b;
        return charSequence != null ? charSequence : this.f28762a;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f28772k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f28777p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f28777p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f28777p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f28777p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f28767f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f28777p = (z ? 1 : 0) | (this.f28777p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f28777p = (z ? 2 : 0) | (this.f28777p & (-3));
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final InterfaceMenuItemC11884z61 setContentDescription(CharSequence charSequence) {
        this.f28771j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f28777p = (z ? 16 : 0) | (this.f28777p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f28769h = drawable;
        m18932c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f28773l = colorStateList;
        this.f28775n = true;
        m18932c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f28774m = mode;
        this.f28776o = true;
        m18932c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f28764c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f28765d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f28765d = c;
        this.f28767f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f28762a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f28763b = charSequence;
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final InterfaceMenuItemC11884z61 setTooltipText(CharSequence charSequence) {
        this.f28772k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f28777p = (this.f28777p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f28767f = Character.toLowerCase(c);
        this.f28768g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f28771j = charSequence;
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f28765d = c;
        this.f28766e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f28762a = this.f28770i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f28772k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f28769h = AbstractC0628Jy.m4480b(this.f28770i, i);
        m18932c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f28765d = c;
        this.f28766e = KeyEvent.normalizeMetaState(i);
        this.f28767f = Character.toLowerCase(c2);
        this.f28768g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
