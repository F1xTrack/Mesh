package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: Kq0 */
/* loaded from: classes.dex */
public final class C7866Kq0 implements InterfaceMenuItemC11884z61 {

    /* renamed from: A */
    public ActionProviderVisibilityListenerC7918Lq0 f6329A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f6330B;

    /* renamed from: a */
    public final int f6332a;

    /* renamed from: b */
    public final int f6333b;

    /* renamed from: c */
    public final int f6334c;

    /* renamed from: d */
    public final int f6335d;

    /* renamed from: e */
    public CharSequence f6336e;

    /* renamed from: f */
    public CharSequence f6337f;

    /* renamed from: g */
    public Intent f6338g;

    /* renamed from: h */
    public char f6339h;

    /* renamed from: j */
    public char f6341j;

    /* renamed from: l */
    public Drawable f6343l;

    /* renamed from: n */
    public final MenuC7450Cq0 f6345n;

    /* renamed from: o */
    public I51 f6346o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f6347p;

    /* renamed from: q */
    public CharSequence f6348q;

    /* renamed from: r */
    public CharSequence f6349r;

    /* renamed from: y */
    public int f6356y;

    /* renamed from: z */
    public View f6357z;

    /* renamed from: i */
    public int f6340i = 4096;

    /* renamed from: k */
    public int f6342k = 4096;

    /* renamed from: m */
    public int f6344m = 0;

    /* renamed from: s */
    public ColorStateList f6350s = null;

    /* renamed from: t */
    public PorterDuff.Mode f6351t = null;

    /* renamed from: u */
    public boolean f6352u = false;

    /* renamed from: v */
    public boolean f6353v = false;

    /* renamed from: w */
    public boolean f6354w = false;

    /* renamed from: x */
    public int f6355x = 16;

    /* renamed from: C */
    public boolean f6331C = false;

    public C7866Kq0(MenuC7450Cq0 menuC7450Cq0, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f6345n = menuC7450Cq0;
        this.f6332a = i2;
        this.f6333b = i;
        this.f6334c = i3;
        this.f6335d = i4;
        this.f6336e = charSequence;
        this.f6356y = i5;
    }

    /* renamed from: c */
    public static void m4765c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.InterfaceMenuItemC11884z61
    /* renamed from: a */
    public final InterfaceMenuItemC11884z61 mo4766a(ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0) {
        ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq02 = this.f6329A;
        if (actionProviderVisibilityListenerC7918Lq02 != null) {
            actionProviderVisibilityListenerC7918Lq02.getClass();
        }
        this.f6357z = null;
        this.f6329A = actionProviderVisibilityListenerC7918Lq0;
        this.f6345n.m1417p(true);
        ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq03 = this.f6329A;
        if (actionProviderVisibilityListenerC7918Lq03 != null) {
            actionProviderVisibilityListenerC7918Lq03.f6894a = new C8170Qm0(24, this);
            actionProviderVisibilityListenerC7918Lq03.f6895b.setVisibilityListener(actionProviderVisibilityListenerC7918Lq03);
        }
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61
    /* renamed from: b */
    public final ActionProviderVisibilityListenerC7918Lq0 mo4767b() {
        return this.f6329A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6356y & 8) == 0) {
            return false;
        }
        if (this.f6357z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6330B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6345n.mo1405d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m4768d(Drawable drawable) {
        if (drawable != null && this.f6354w && (this.f6352u || this.f6353v)) {
            drawable = drawable.mutate();
            if (this.f6352u) {
                AbstractC4173hL.m18806h(drawable, this.f6350s);
            }
            if (this.f6353v) {
                AbstractC4173hL.m18807i(drawable, this.f6351t);
            }
            this.f6354w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m4769e() {
        ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0;
        if ((this.f6356y & 8) == 0) {
            return false;
        }
        if (this.f6357z == null && (actionProviderVisibilityListenerC7918Lq0 = this.f6329A) != null) {
            this.f6357z = actionProviderVisibilityListenerC7918Lq0.f6895b.onCreateActionView(this);
        }
        return this.f6357z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m4769e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6330B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6345n.mo1407f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4770f() {
        return (this.f6355x & 32) == 32;
    }

    /* renamed from: g */
    public final void m4771g(boolean z) {
        if (z) {
            this.f6355x |= 32;
        } else {
            this.f6355x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6357z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0 = this.f6329A;
        if (actionProviderVisibilityListenerC7918Lq0 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC7918Lq0.f6895b.onCreateActionView(this);
        this.f6357z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6342k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6341j;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6348q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6333b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6343l;
        if (drawable != null) {
            return m4768d(drawable);
        }
        int i = this.f6344m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM26394b = AbstractC11918zN1.m26394b(this.f6345n.f1702a, i);
        this.f6344m = 0;
        this.f6343l = drawableM26394b;
        return m4768d(drawableM26394b);
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6350s;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6351t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6338g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6332a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6340i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6339h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6334c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6346o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6336e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6337f;
        return charSequence != null ? charSequence : this.f6336e;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6349r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6346o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6331C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6355x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6355x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6355x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0 = this.f6329A;
        return (actionProviderVisibilityListenerC7918Lq0 == null || !actionProviderVisibilityListenerC7918Lq0.f6895b.overridesItemVisibility()) ? (this.f6355x & 8) == 0 : (this.f6355x & 8) == 0 && this.f6329A.f6895b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f6357z = view;
        this.f6329A = null;
        if (view != null && view.getId() == -1 && (i = this.f6332a) > 0) {
            view.setId(i);
        }
        MenuC7450Cq0 menuC7450Cq0 = this.f6345n;
        menuC7450Cq0.f1712k = true;
        menuC7450Cq0.m1417p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f6341j == c) {
            return this;
        }
        this.f6341j = Character.toLowerCase(c);
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f6355x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f6355x = i2;
        if (i != i2) {
            this.f6345n.m1417p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f6355x;
        if ((i & 4) != 0) {
            MenuC7450Cq0 menuC7450Cq0 = this.f6345n;
            menuC7450Cq0.getClass();
            ArrayList arrayList = menuC7450Cq0.f1707f;
            int size = arrayList.size();
            menuC7450Cq0.m1424w();
            for (int i2 = 0; i2 < size; i2++) {
                C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList.get(i2);
                if (c7866Kq0.f6333b == this.f6333b && (c7866Kq0.f6355x & 4) != 0 && c7866Kq0.isCheckable()) {
                    boolean z2 = c7866Kq0 == this;
                    int i3 = c7866Kq0.f6355x;
                    int i4 = (z2 ? 2 : 0) | (i3 & (-3));
                    c7866Kq0.f6355x = i4;
                    if (i3 != i4) {
                        c7866Kq0.f6345n.m1417p(false);
                    }
                }
            }
            menuC7450Cq0.m1423v();
        } else {
            int i5 = (i & (-3)) | (z ? 2 : 0);
            this.f6355x = i5;
            if (i != i5) {
                this.f6345n.m1417p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f6355x |= 16;
        } else {
            this.f6355x &= -17;
        }
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6344m = 0;
        this.f6343l = drawable;
        this.f6354w = true;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6350s = colorStateList;
        this.f6352u = true;
        this.f6354w = true;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6351t = mode;
        this.f6353v = true;
        this.f6354w = true;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6338g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f6339h == c) {
            return this;
        }
        this.f6339h = c;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6330B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6347p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f6339h = c;
        this.f6341j = Character.toLowerCase(c2);
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6356y = i;
        MenuC7450Cq0 menuC7450Cq0 = this.f6345n;
        menuC7450Cq0.f1712k = true;
        menuC7450Cq0.m1417p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6336e = charSequence;
        this.f6345n.m1417p(false);
        I51 i51 = this.f6346o;
        if (i51 != null) {
            i51.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6337f = charSequence;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f6355x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f6355x = i2;
        if (i != i2) {
            MenuC7450Cq0 menuC7450Cq0 = this.f6345n;
            menuC7450Cq0.f1709h = true;
            menuC7450Cq0.m1417p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6336e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final InterfaceMenuItemC11884z61 setContentDescription(CharSequence charSequence) {
        this.f6348q = charSequence;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final InterfaceMenuItemC11884z61 setTooltipText(CharSequence charSequence) {
        this.f6349r = charSequence;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f6341j == c && this.f6342k == i) {
            return this;
        }
        this.f6341j = Character.toLowerCase(c);
        this.f6342k = KeyEvent.normalizeMetaState(i);
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f6339h == c && this.f6340i == i) {
            return this;
        }
        this.f6339h = c;
        this.f6340i = KeyEvent.normalizeMetaState(i);
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC11884z61, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f6339h = c;
        this.f6340i = KeyEvent.normalizeMetaState(i);
        this.f6341j = Character.toLowerCase(c2);
        this.f6342k = KeyEvent.normalizeMetaState(i2);
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6343l = null;
        this.f6344m = i;
        this.f6354w = true;
        this.f6345n.m1417p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f6345n.f1702a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f6345n.f1702a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f6357z = viewInflate;
        this.f6329A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f6332a) > 0) {
            viewInflate.setId(i2);
        }
        MenuC7450Cq0 menuC7450Cq0 = this.f6345n;
        menuC7450Cq0.f1712k = true;
        menuC7450Cq0.m1417p(true);
        return this;
    }
}
