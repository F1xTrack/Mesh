package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.E02;

/* loaded from: classes.dex */
public final class W extends C2592g {
    public float f;
    public float g;
    public float h;
    public float i;
    public String j;
    public int k;

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    public final void s(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.j != null) {
            float f4 = this.f;
            float f5 = this.mScale;
            float f6 = this.g;
            canvas.concat(E02.b(new RectF(f4 * f5, f6 * f5, (f4 + this.h) * f5, (f6 + this.i) * f5), new RectF(0.0f, 0.0f, f2, f3), this.j, this.k));
            super.draw(canvas, paint, f);
        }
    }
}
