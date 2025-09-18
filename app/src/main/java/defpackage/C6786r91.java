package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: r91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6786r91 extends ReplacementSpan implements LM0 {
    public final int a;
    public final int b;
    public final int c;

    public C6786r91(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        O90.f(canvas, "canvas");
        O90.f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        O90.f(paint, "paint");
        if (fontMetricsInt != null) {
            int i3 = -this.c;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.b;
    }
}
