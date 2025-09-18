package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: br0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC8904br0 extends AbstractC0259E6 implements Menu {

    /* renamed from: c */
    public final MenuC7450Cq0 f17189c;

    public MenuC8904br0(Context context, MenuC7450Cq0 menuC7450Cq0) {
        super(context);
        if (menuC7450Cq0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f17189c = menuC7450Cq0;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2028f(this.f17189c.m1402a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f17189c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m2028f(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f17189c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        L01 l01 = (L01) this.f2474b;
        if (l01 != null) {
            l01.clear();
        }
        this.f17189c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f17189c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m2028f(this.f17189c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m2028f(this.f17189c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f17189c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f17189c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f17189c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f17189c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((L01) this.f2474b) != null) {
            int i2 = 0;
            while (true) {
                L01 l01 = (L01) this.f2474b;
                if (i2 >= l01.f6450c) {
                    break;
                }
                if (((InterfaceMenuItemC11884z61) l01.m4827i(i2)).getGroupId() == i) {
                    ((L01) this.f2474b).mo4829k(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f17189c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((L01) this.f2474b) != null) {
            int i2 = 0;
            while (true) {
                L01 l01 = (L01) this.f2474b;
                if (i2 >= l01.f6450c) {
                    break;
                }
                if (((InterfaceMenuItemC11884z61) l01.m4827i(i2)).getItemId() == i) {
                    ((L01) this.f2474b).mo4829k(i2);
                    break;
                }
                i2++;
            }
        }
        this.f17189c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f17189c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f17189c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f17189c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f17189c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f17189c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f17189c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m2028f(this.f17189c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f17189c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2028f(this.f17189c.m1402a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f17189c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m2028f(this.f17189c.add(i, i2, i3, i4));
    }
}
