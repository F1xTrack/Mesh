package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import p000.AbstractC3929dS;
import p000.C11931zU0;

/* renamed from: com.horcrux.svg.Z */
/* loaded from: classes.dex */
public final class C1984Z extends RenderableView {

    /* renamed from: a */
    public String f18576a;

    /* renamed from: b */
    public C11931zU0 f18577b;

    /* renamed from: c */
    public C11931zU0 f18578c;

    /* renamed from: d */
    public C11931zU0 f18579d;

    /* renamed from: e */
    public C11931zU0 f18580e;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f18576a);
        if (definedTemplate == null) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f18577b), (float) relativeOnHeight(this.f18578c));
        boolean z = definedTemplate instanceof RenderableView;
        if (z) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof C1981W) {
            ((C1981W) definedTemplate).m11357s(canvas, paint, f, (float) relativeOnWidth(this.f18579d), (float) relativeOnHeight(this.f18580e));
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
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f18576a);
        if (definedTemplate == null) {
            AbstractC3929dS.m17683p("ReactNative");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f18577b), (float) relativeOnHeight(this.f18578c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f18576a);
            if (definedTemplate == null) {
                AbstractC3929dS.m17683p("ReactNative");
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
