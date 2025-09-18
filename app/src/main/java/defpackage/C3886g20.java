package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: g20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3886g20 extends View {
    public C3886g20(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C1180Ox c1180Ox = (C1180Ox) getLayoutParams();
        c1180Ox.a = i;
        setLayoutParams(c1180Ox);
    }

    public void setGuidelineEnd(int i) {
        C1180Ox c1180Ox = (C1180Ox) getLayoutParams();
        c1180Ox.b = i;
        setLayoutParams(c1180Ox);
    }

    public void setGuidelinePercent(float f) {
        C1180Ox c1180Ox = (C1180Ox) getLayoutParams();
        c1180Ox.c = f;
        setLayoutParams(c1180Ox);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
