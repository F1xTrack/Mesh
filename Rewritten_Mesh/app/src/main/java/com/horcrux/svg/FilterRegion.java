package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import p000.C11931zU0;
import p000.EnumC6889tU;

/* loaded from: classes.dex */
public class FilterRegion {

    /* renamed from: mH */
    C11931zU0 f18537mH;

    /* renamed from: mW */
    C11931zU0 f18538mW;

    /* renamed from: mX */
    C11931zU0 f18539mX;

    /* renamed from: mY */
    C11931zU0 f18540mY;

    private double getRelativeOrDefault(VirtualView virtualView, C11931zU0 c11931zU0, float f, double d) {
        return (c11931zU0 == null || c11931zU0.f46848b == SVGLength$UnitType.UNKNOWN) ? d : virtualView.relativeOn(c11931zU0, f);
    }

    public Rect getCropRect(VirtualView virtualView, EnumC6889tU enumC6889tU, RectF rectF) {
        double relativeOrDefault;
        double dRelativeOnFraction;
        double dRelativeOnFraction2;
        double dRelativeOnFraction3;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (enumC6889tU == EnumC6889tU.OBJECT_BOUNDING_BOX) {
            dRelativeOnFraction = virtualView.relativeOnFraction(this.f18539mX, rectF.width()) + rectF.left;
            dRelativeOnFraction2 = virtualView.relativeOnFraction(this.f18540mY, rectF.height()) + rectF.top;
            dRelativeOnFraction3 = virtualView.relativeOnFraction(this.f18538mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.f18537mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.f18539mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.f18540mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.f18538mW, canvasWidth, rectF.width());
            relativeOrDefault = getRelativeOrDefault(virtualView, this.f18537mH, canvasHeight, rectF.height());
            dRelativeOnFraction = relativeOrDefault2;
            dRelativeOnFraction2 = relativeOrDefault3;
            dRelativeOnFraction3 = relativeOrDefault4;
        }
        return new Rect((int) dRelativeOnFraction, (int) dRelativeOnFraction2, (int) (dRelativeOnFraction + dRelativeOnFraction3), (int) (dRelativeOnFraction2 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.f18537mH = C11931zU0.m26443b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.f18538mW = C11931zU0.m26443b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.f18539mX = C11931zU0.m26443b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.f18540mY = C11931zU0.m26443b(dynamic);
    }
}
