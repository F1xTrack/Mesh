package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import p000.AbstractC3929dS;

/* renamed from: com.horcrux.svg.b */
/* loaded from: classes.dex */
public final class C1987b extends C1993g {
    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        AbstractC3929dS.m17683p("ReactNative");
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public final boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    public final void mergeProperties(RenderableView renderableView) {
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView
    public final void resetProperties() {
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
