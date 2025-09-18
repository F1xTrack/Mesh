package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x61 */
/* loaded from: classes.dex */
public final class C7921x61 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ C8111y61 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ActionProviderVisibilityListenerC0927Lq0 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public C7921x61(C8111y61 c8111y61, Menu menu) {
        this.E = c8111y61;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        C8111y61 c8111y61 = this.E;
        if (str != null) {
            if (c8111y61.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c8111y61.d == null) {
                c8111y61.d = C8111y61.a(c8111y61.c);
            }
            Object obj = c8111y61.d;
            String str2 = this.y;
            MenuItemOnMenuItemClickListenerC7731w61 menuItemOnMenuItemClickListenerC7731w61 = new MenuItemOnMenuItemClickListenerC7731w61();
            menuItemOnMenuItemClickListenerC7731w61.b = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC7731w61.c = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC7731w61.d);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC7731w61);
            } catch (Exception e) {
                StringBuilder sbQ = AbstractC8235ym.q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbQ.append(cls.getName());
                InflateException inflateException = new InflateException(sbQ.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof C0849Kq0) {
                C0849Kq0 c0849Kq0 = (C0849Kq0) menuItem;
                c0849Kq0.x = (c0849Kq0.x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1160Oq0) {
                MenuItemC1160Oq0 menuItemC1160Oq0 = (MenuItemC1160Oq0) menuItem;
                try {
                    Method method = menuItemC1160Oq0.d;
                    InterfaceMenuItemC8301z61 interfaceMenuItemC8301z61 = menuItemC1160Oq0.c;
                    if (method == null) {
                        menuItemC1160Oq0.d = interfaceMenuItemC8301z61.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1160Oq0.d.invoke(interfaceMenuItemC8301z61, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C8111y61.e, c8111y61.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        ActionProviderVisibilityListenerC0927Lq0 actionProviderVisibilityListenerC0927Lq0 = this.z;
        if (actionProviderVisibilityListenerC0927Lq0 != null && (menuItem instanceof InterfaceMenuItemC8301z61)) {
            ((InterfaceMenuItemC8301z61) menuItem).a(actionProviderVisibilityListenerC0927Lq0);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof InterfaceMenuItemC8301z61;
        if (z2) {
            ((InterfaceMenuItemC8301z61) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0693Iq0.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((InterfaceMenuItemC8301z61) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0693Iq0.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((InterfaceMenuItemC8301z61) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0693Iq0.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((InterfaceMenuItemC8301z61) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0693Iq0.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC8301z61) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0693Iq0.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC8301z61) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0693Iq0.i(menuItem, colorStateList);
            }
        }
    }
}
