package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p000.E02;

/* renamed from: com.horcrux.svg.W */
/* loaded from: classes.dex */
public final class C1981W extends C1993g {

    /* renamed from: f */
    public float f18553f;

    /* renamed from: g */
    public float f18554g;

    /* renamed from: h */
    public float f18555h;

    /* renamed from: i */
    public float f18556i;

    /* renamed from: j */
    public String f18557j;

    /* renamed from: k */
    public int f18558k;

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    /* renamed from: s */
    public final void m11357s(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.f18557j != null) {
            float f4 = this.f18553f;
            float f5 = this.mScale;
            float f6 = this.f18554g;
            canvas.concat(E02.m1975b(new RectF(f4 * f5, f6 * f5, (f4 + this.f18555h) * f5, (f6 + this.f18556i) * f5), new RectF(0.0f, 0.0f, f2, f3), this.f18557j, this.f18558k));
            super.draw(canvas, paint, f);
        }
    }
}
