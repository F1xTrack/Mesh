package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: hL */
/* loaded from: classes.dex */
public abstract class AbstractC4173hL {
    /* renamed from: a */
    public static void m18799a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: b */
    public static boolean m18800b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* renamed from: c */
    public static ColorFilter m18801c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: d */
    public static void m18802d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: e */
    public static void m18803e(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* renamed from: f */
    public static void m18804f(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: g */
    public static void m18805g(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: h */
    public static void m18806h(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: i */
    public static void m18807i(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
