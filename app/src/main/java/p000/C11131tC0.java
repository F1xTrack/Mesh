package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: tC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11131tC0 {

    /* renamed from: a */
    public final TextPaint f42945a;

    /* renamed from: b */
    public final TextDirectionHeuristic f42946b;

    /* renamed from: c */
    public final int f42947c;

    /* renamed from: d */
    public final int f42948d;

    public C11131tC0(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC6606pG.m23682k(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f42945a = textPaint;
        this.f42946b = textDirectionHeuristic;
        this.f42947c = i;
        this.f42948d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11131tC0)) {
            return false;
        }
        C11131tC0 c11131tC0 = (C11131tC0) obj;
        int i = Build.VERSION.SDK_INT;
        if (this.f42947c == c11131tC0.f42947c && this.f42948d == c11131tC0.f42948d) {
            TextPaint textPaint = this.f42945a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c11131tC0.f42945a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f42946b == c11131tC0.f42946b;
        }
        return false;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f42946b;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f42948d;
        int i3 = this.f42947c;
        TextPaint textPaint = this.f42945a;
        return i >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f42945a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f42946b);
        sb.append(", breakStrategy=" + this.f42947c);
        sb.append(", hyphenationFrequency=" + this.f42948d);
        sb.append("}");
        return sb.toString();
    }

    public C11131tC0(PrecomputedText.Params params) {
        this.f42945a = params.getTextPaint();
        this.f42946b = params.getTextDirection();
        this.f42947c = params.getBreakStrategy();
        this.f42948d = params.getHyphenationFrequency();
    }
}
