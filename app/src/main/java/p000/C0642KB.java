package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: KB */
/* loaded from: classes.dex */
public final class C0642KB implements LineHeightSpan, LM0 {

    /* renamed from: a */
    public final int f5930a;

    public C0642KB(float f) {
        this.f5930a = (int) Math.ceil(f);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        O90.m5968f(fontMetricsInt, "fm");
        int i5 = fontMetricsInt.descent;
        int i6 = this.f5930a;
        if (i5 > i6) {
            int iMin = (int) Math.min(i6, i5);
            fontMetricsInt.descent = iMin;
            fontMetricsInt.bottom = iMin;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i7 = fontMetricsInt.ascent;
        if ((-i7) + i5 > i6) {
            fontMetricsInt.bottom = i5;
            int i8 = (-i6) + i5;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            return;
        }
        int i9 = fontMetricsInt.bottom;
        if ((-i7) + i9 > i6) {
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i7 + i6;
            return;
        }
        int i10 = fontMetricsInt.top;
        if ((-i10) + i9 > i6) {
            fontMetricsInt.top = i9 - i6;
            return;
        }
        double d = (i6 - ((-i10) + i9)) / 2.0f;
        int iCeil = (int) (i10 - ((float) Math.ceil(d)));
        int iFloor = (int) (fontMetricsInt.bottom + ((float) Math.floor(d)));
        fontMetricsInt.top = iCeil;
        fontMetricsInt.ascent = iCeil;
        fontMetricsInt.descent = iFloor;
        fontMetricsInt.bottom = iFloor;
    }
}
