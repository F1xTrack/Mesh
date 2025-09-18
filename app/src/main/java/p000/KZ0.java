package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class KZ0 extends CharacterStyle implements LM0 {

    /* renamed from: a */
    public final float f6192a;

    /* renamed from: b */
    public final float f6193b;

    /* renamed from: c */
    public final float f6194c;

    /* renamed from: d */
    public final int f6195d;

    public KZ0(float f, float f2, float f3, int i) {
        this.f6192a = f;
        this.f6193b = f2;
        this.f6194c = f3;
        this.f6195d = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        O90.m5968f(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f6194c, this.f6192a, this.f6193b, this.f6195d);
    }
}
