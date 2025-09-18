package androidx.media3.p002ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.InterfaceC1204T8;
import p000.RunnableC1267U8;
import p000.YG0;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f16361d = 0;

    /* renamed from: a */
    public final RunnableC1267U8 f16362a;

    /* renamed from: b */
    public float f16363b;

    /* renamed from: c */
    public int f16364c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16364c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, YG0.f14219a, 0, 0);
            try {
                this.f16364c = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f16362a = new RunnableC1267U8(this);
    }

    public int getResizeMode() {
        return this.f16364c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f16363b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f16363b / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        RunnableC1267U8 runnableC1267U8 = this.f16362a;
        if (fAbs <= 0.01f) {
            if (runnableC1267U8.f11660b) {
                return;
            }
            runnableC1267U8.f11660b = true;
            ((AspectRatioFrameLayout) runnableC1267U8.f11661c).post(runnableC1267U8);
            return;
        }
        int i3 = this.f16364c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f16363b;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.f16363b;
                    } else {
                        f2 = this.f16363b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f16363b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.f16363b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f16363b;
            measuredWidth = (int) (f4 * f);
        }
        if (!runnableC1267U8.f11660b) {
            runnableC1267U8.f11660b = true;
            ((AspectRatioFrameLayout) runnableC1267U8.f11661c).post(runnableC1267U8);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f16363b != f) {
            this.f16363b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f16364c != i) {
            this.f16364c = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC1204T8 interfaceC1204T8) {
    }
}
