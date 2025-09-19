package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import defpackage.AbstractC3393dS;
import defpackage.C8372zU0;

/* loaded from: classes.dex */
public final class Z extends RenderableView {
    public String a;
    public C8372zU0 b;
    public C8372zU0 c;
    public C8372zU0 d;
    public C8372zU0 e;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.a);
        if (definedTemplate == null) {
            AbstractC3393dS.p("ReactNative");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.b), (float) relativeOnHeight(this.c));
        boolean z = definedTemplate instanceof RenderableView;
        if (z) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof W) {
            ((W) definedTemplate).s(canvas, paint, f, (float) relativeOnWidth(this.d), (float) relativeOnHeight(this.e));
        } else {
            definedTemplate.draw(canvas, paint, f * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, iSaveAndSetupCanvas);
        if (z) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.a);
        if (definedTemplate == null) {
            AbstractC3393dS.p("ReactNative");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.b), (float) relativeOnHeight(this.c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.a);
            if (definedTemplate == null) {
                AbstractC3393dS.p("ReactNative");
                return -1;
            }
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
        }
        return -1;
    }
}
