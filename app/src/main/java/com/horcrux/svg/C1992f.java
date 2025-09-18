package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import p000.C11931zU0;

/* renamed from: com.horcrux.svg.f */
/* loaded from: classes.dex */
public final class C1992f extends C1993g {

    /* renamed from: f */
    public C11931zU0 f18597f;

    /* renamed from: g */
    public C11931zU0 f18598g;

    /* renamed from: h */
    public C11931zU0 f18599h;

    /* renamed from: i */
    public C11931zU0 f18600i;

    /* renamed from: j */
    public Canvas f18601j;

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f18601j);
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f18597f);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f18598g);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f18599h);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f18600i);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(this.f18601j, view, j);
    }

    @Override // com.horcrux.svg.C1993g
    /* renamed from: l */
    public final void mo11365l(Canvas canvas, Paint paint, float f) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        mo532q();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C1999m)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!LocalNotification.Importance.NONE.equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        mo531p();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }
}
