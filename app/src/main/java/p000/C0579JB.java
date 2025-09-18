package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: JB */
/* loaded from: classes.dex */
public final class C0579JB extends MetricAffectingSpan implements LM0 {

    /* renamed from: a */
    public final float f5373a;

    public C0579JB(float f) {
        this.f5373a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.m5968f(textPaint, "paint");
        float f = this.f5373a;
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setLetterSpacing(f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        O90.m5968f(textPaint, "paint");
        float f = this.f5373a;
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setLetterSpacing(f);
    }
}
