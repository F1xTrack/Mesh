package p000;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: QB */
/* loaded from: classes.dex */
public final class C1019QB extends MetricAffectingSpan implements LM0 {

    /* renamed from: a */
    public final int f9512a;

    /* renamed from: b */
    public final int f9513b;

    /* renamed from: c */
    public final String f9514c;

    /* renamed from: d */
    public final String f9515d;

    /* renamed from: e */
    public final AssetManager f9516e;

    public C1019QB(int i, int i2, String str, String str2, AssetManager assetManager) {
        O90.m5968f(assetManager, "assetManager");
        this.f9512a = i;
        this.f9513b = i2;
        this.f9514c = str;
        this.f9515d = str2;
        this.f9516e = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.m5968f(textPaint, "ds");
        Typeface typefaceM8004a = UO1.m8004a(textPaint.getTypeface(), this.f9512a, this.f9513b, this.f9515d, this.f9516e);
        O90.m5967e(typefaceM8004a, "applyStyles(...)");
        textPaint.setFontFeatureSettings(this.f9514c);
        textPaint.setTypeface(typefaceM8004a);
        textPaint.setSubpixelText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        O90.m5968f(textPaint, "paint");
        Typeface typefaceM8004a = UO1.m8004a(textPaint.getTypeface(), this.f9512a, this.f9513b, this.f9515d, this.f9516e);
        O90.m5967e(typefaceM8004a, "applyStyles(...)");
        textPaint.setFontFeatureSettings(this.f9514c);
        textPaint.setTypeface(typefaceM8004a);
        textPaint.setSubpixelText(true);
    }
}
