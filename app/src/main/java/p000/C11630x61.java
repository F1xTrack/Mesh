package p000;

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
public final class C11630x61 {

    /* renamed from: A */
    public CharSequence f45367A;

    /* renamed from: B */
    public CharSequence f45368B;

    /* renamed from: E */
    public final /* synthetic */ C11757y61 f45371E;

    /* renamed from: a */
    public final Menu f45372a;

    /* renamed from: h */
    public boolean f45379h;

    /* renamed from: i */
    public int f45380i;

    /* renamed from: j */
    public int f45381j;

    /* renamed from: k */
    public CharSequence f45382k;

    /* renamed from: l */
    public CharSequence f45383l;

    /* renamed from: m */
    public int f45384m;

    /* renamed from: n */
    public char f45385n;

    /* renamed from: o */
    public int f45386o;

    /* renamed from: p */
    public char f45387p;

    /* renamed from: q */
    public int f45388q;

    /* renamed from: r */
    public int f45389r;

    /* renamed from: s */
    public boolean f45390s;

    /* renamed from: t */
    public boolean f45391t;

    /* renamed from: u */
    public boolean f45392u;

    /* renamed from: v */
    public int f45393v;

    /* renamed from: w */
    public int f45394w;

    /* renamed from: x */
    public String f45395x;

    /* renamed from: y */
    public String f45396y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC7918Lq0 f45397z;

    /* renamed from: C */
    public ColorStateList f45369C = null;

    /* renamed from: D */
    public PorterDuff.Mode f45370D = null;

    /* renamed from: b */
    public int f45373b = 0;

    /* renamed from: c */
    public int f45374c = 0;

    /* renamed from: d */
    public int f45375d = 0;

    /* renamed from: e */
    public int f45376e = 0;

    /* renamed from: f */
    public boolean f45377f = true;

    /* renamed from: g */
    public boolean f45378g = true;

    public C11630x61(C11757y61 c11757y61, Menu menu) {
        this.f45371E = c11757y61;
        this.f45372a = menu;
    }

    /* renamed from: a */
    public final Object m25760a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f45371E.f46094c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void m25761b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        menuItem.setChecked(this.f45390s).setVisible(this.f45391t).setEnabled(this.f45392u).setCheckable(this.f45389r >= 1).setTitleCondensed(this.f45383l).setIcon(this.f45384m);
        int i = this.f45393v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f45396y;
        C11757y61 c11757y61 = this.f45371E;
        if (str != null) {
            if (c11757y61.f46094c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c11757y61.f46095d == null) {
                c11757y61.f46095d = C11757y61.m26048a(c11757y61.f46094c);
            }
            Object obj = c11757y61.f46095d;
            String str2 = this.f45396y;
            MenuItemOnMenuItemClickListenerC11503w61 menuItemOnMenuItemClickListenerC11503w61 = new MenuItemOnMenuItemClickListenerC11503w61();
            menuItemOnMenuItemClickListenerC11503w61.f44681b = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC11503w61.f44682c = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC11503w61.f44679d);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC11503w61);
            } catch (Exception e) {
                StringBuilder sbM26240q = AbstractC7222ym.m26240q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM26240q.append(cls.getName());
                InflateException inflateException = new InflateException(sbM26240q.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f45389r >= 2) {
            if (menuItem instanceof C7866Kq0) {
                C7866Kq0 c7866Kq0 = (C7866Kq0) menuItem;
                c7866Kq0.f6355x = (c7866Kq0.f6355x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC8074Oq0) {
                MenuItemC8074Oq0 menuItemC8074Oq0 = (MenuItemC8074Oq0) menuItem;
                try {
                    Method method = menuItemC8074Oq0.f8642d;
                    InterfaceMenuItemC11884z61 interfaceMenuItemC11884z61 = menuItemC8074Oq0.f8641c;
                    if (method == null) {
                        menuItemC8074Oq0.f8642d = interfaceMenuItemC11884z61.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC8074Oq0.f8642d.invoke(interfaceMenuItemC11884z61, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.f45395x;
        if (str3 != null) {
            menuItem.setActionView((View) m25760a(str3, C11757y61.f46090e, c11757y61.f46092a));
            z = true;
        }
        int i2 = this.f45394w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0 = this.f45397z;
        if (actionProviderVisibilityListenerC7918Lq0 != null && (menuItem instanceof InterfaceMenuItemC11884z61)) {
            ((InterfaceMenuItemC11884z61) menuItem).mo4766a(actionProviderVisibilityListenerC7918Lq0);
        }
        CharSequence charSequence = this.f45367A;
        boolean z2 = menuItem instanceof InterfaceMenuItemC11884z61;
        if (z2) {
            ((InterfaceMenuItemC11884z61) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7762Iq0.m4031h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f45368B;
        if (z2) {
            ((InterfaceMenuItemC11884z61) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7762Iq0.m4036m(menuItem, charSequence2);
        }
        char c = this.f45385n;
        int i3 = this.f45386o;
        if (z2) {
            ((InterfaceMenuItemC11884z61) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7762Iq0.m4030g(menuItem, c, i3);
        }
        char c2 = this.f45387p;
        int i4 = this.f45388q;
        if (z2) {
            ((InterfaceMenuItemC11884z61) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7762Iq0.m4034k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f45370D;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC11884z61) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC7762Iq0.m4033j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f45369C;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC11884z61) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC7762Iq0.m4032i(menuItem, colorStateList);
            }
        }
    }
}
