package p000;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class J91 {
    /* renamed from: b */
    public static String[] m4238b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static PrecomputedText.Params m4239c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: d */
    public static void m4240d(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: a */
    public static CharSequence m4237a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
