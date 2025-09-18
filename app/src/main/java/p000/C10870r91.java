package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: r91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10870r91 extends ReplacementSpan implements LM0 {

    /* renamed from: a */
    public final int f41366a;

    /* renamed from: b */
    public final int f41367b;

    /* renamed from: c */
    public final int f41368c;

    public C10870r91(int i, int i2, int i3) {
        this.f41366a = i;
        this.f41367b = i2;
        this.f41368c = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        O90.m5968f(canvas, "canvas");
        O90.m5968f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        O90.m5968f(paint, "paint");
        if (fontMetricsInt != null) {
            int i3 = -this.f41368c;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.f41367b;
    }
}
