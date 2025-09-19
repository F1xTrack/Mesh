package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import defpackage.AbstractC3393dS;

/* renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587b extends C2592g {
    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        AbstractC3393dS.p("ReactNative");
    }

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
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

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView
    public final void resetProperties() {
    }

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
