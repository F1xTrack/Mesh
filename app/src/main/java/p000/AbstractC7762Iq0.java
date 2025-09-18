package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: Iq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7762Iq0 {
    /* renamed from: a */
    public static int m4024a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* renamed from: b */
    public static CharSequence m4025b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: c */
    public static ColorStateList m4026c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: d */
    public static PorterDuff.Mode m4027d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* renamed from: e */
    public static int m4028e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: f */
    public static CharSequence m4029f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* renamed from: g */
    public static MenuItem m4030g(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* renamed from: h */
    public static MenuItem m4031h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: i */
    public static MenuItem m4032i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: j */
    public static MenuItem m4033j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: k */
    public static MenuItem m4034k(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* renamed from: l */
    public static MenuItem m4035l(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* renamed from: m */
    public static MenuItem m4036m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
