package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class JB extends MetricAffectingSpan implements LM0 {
    public final float a;

    public JB(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.f(textPaint, "paint");
        float f = this.a;
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setLetterSpacing(f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        O90.f(textPaint, "paint");
        float f = this.a;
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setLetterSpacing(f);
    }
}
