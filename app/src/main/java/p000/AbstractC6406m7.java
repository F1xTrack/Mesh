package p000;

import android.widget.TextView;

/* renamed from: m7 */
/* loaded from: classes.dex */
public abstract class AbstractC6406m7 {
    /* renamed from: a */
    public static int m22674a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m22675b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static void m22676c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: d */
    public static boolean m22677d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
