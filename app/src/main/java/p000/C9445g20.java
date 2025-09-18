package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: g20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9445g20 extends View {
    public C9445g20(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0941Ox c0941Ox = (C0941Ox) getLayoutParams();
        c0941Ox.f8722a = i;
        setLayoutParams(c0941Ox);
    }

    public void setGuidelineEnd(int i) {
        C0941Ox c0941Ox = (C0941Ox) getLayoutParams();
        c0941Ox.f8724b = i;
        setLayoutParams(c0941Ox);
    }

    public void setGuidelinePercent(float f) {
        C0941Ox c0941Ox = (C0941Ox) getLayoutParams();
        c0941Ox.f8726c = f;
        setLayoutParams(c0941Ox);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
