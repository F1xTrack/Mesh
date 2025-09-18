package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class V8 extends FrameLayout {
    public float a;
    public int b;

    public final int getResizeMode() {
        return this.b;
    }

    public final float getVideoAspectRatio() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        super.onMeasure(i, i2);
        if (this.a == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = (this.a / (f4 / f5)) - 1;
        if (Math.abs(f6) <= 0.01f) {
            return;
        }
        int i3 = this.b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        int i4 = (int) (this.a * f5);
                        if (i4 < measuredWidth) {
                            float f7 = i4;
                            float f8 = f4 / f7;
                            measuredWidth = (int) (f7 * f8);
                            f2 = f8 * f5;
                            measuredHeight = (int) f2;
                        } else {
                            measuredWidth = i4;
                        }
                    } else if (f6 > 0.0f) {
                        f = this.a;
                    } else {
                        f3 = this.a;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            f3 = this.a;
            measuredWidth = (int) (f5 * f3);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        f = this.a;
        f2 = f4 / f;
        measuredHeight = (int) f2;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public final void setResizeMode(int i) {
        if (i != this.b) {
            this.b = i;
            requestLayout();
        }
    }

    public final void setVideoAspectRatio(float f) {
        if (f == this.a) {
            return;
        }
        this.a = f;
        requestLayout();
    }
}
