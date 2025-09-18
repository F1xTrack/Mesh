package p000;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: V8 */
/* loaded from: classes.dex */
public final class C1330V8 extends FrameLayout {

    /* renamed from: a */
    public float f12385a;

    /* renamed from: b */
    public int f12386b;

    public final int getResizeMode() {
        return this.f12386b;
    }

    public final float getVideoAspectRatio() {
        return this.f12385a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        super.onMeasure(i, i2);
        if (this.f12385a == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = (this.f12385a / (f4 / f5)) - 1;
        if (Math.abs(f6) <= 0.01f) {
            return;
        }
        int i3 = this.f12386b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        int i4 = (int) (this.f12385a * f5);
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
                        f = this.f12385a;
                    } else {
                        f3 = this.f12385a;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            f3 = this.f12385a;
            measuredWidth = (int) (f5 * f3);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        f = this.f12385a;
        f2 = f4 / f;
        measuredHeight = (int) f2;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public final void setResizeMode(int i) {
        if (i != this.f12386b) {
            this.f12386b = i;
            requestLayout();
        }
    }

    public final void setVideoAspectRatio(float f) {
        if (f == this.f12385a) {
            return;
        }
        this.f12385a = f;
        requestLayout();
    }
}
