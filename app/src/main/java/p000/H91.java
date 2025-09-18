package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class H91 {
    /* renamed from: a */
    public static int m3321a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* renamed from: b */
    public static ColorStateList m3322b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* renamed from: c */
    public static PorterDuff.Mode m3323c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* renamed from: d */
    public static int m3324d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* renamed from: e */
    public static void m3325e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* renamed from: f */
    public static void m3326f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: g */
    public static void m3327g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: h */
    public static void m3328h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
