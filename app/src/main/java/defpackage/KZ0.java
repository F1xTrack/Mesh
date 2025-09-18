package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class KZ0 extends CharacterStyle implements LM0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public KZ0(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.f(textPaint, "textPaint");
        textPaint.setShadowLayer(this.c, this.a, this.b, this.d);
    }
}
