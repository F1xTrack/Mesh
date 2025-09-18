package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class QB extends MetricAffectingSpan implements LM0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final AssetManager e;

    public QB(int i, int i2, String str, String str2, AssetManager assetManager) {
        O90.f(assetManager, "assetManager");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.f(textPaint, "ds");
        Typeface typefaceA = UO1.a(textPaint.getTypeface(), this.a, this.b, this.d, this.e);
        O90.e(typefaceA, "applyStyles(...)");
        textPaint.setFontFeatureSettings(this.c);
        textPaint.setTypeface(typefaceA);
        textPaint.setSubpixelText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        O90.f(textPaint, "paint");
        Typeface typefaceA = UO1.a(textPaint.getTypeface(), this.a, this.b, this.d, this.e);
        O90.e(typefaceA, "applyStyles(...)");
        textPaint.setFontFeatureSettings(this.c);
        textPaint.setTypeface(typefaceA);
        textPaint.setSubpixelText(true);
    }
}
