package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class OJ extends AbstractC1291Qi {
    public final RV0 a;
    public final View b;
    public float c;
    public float d;
    public float e;
    public final ValueAnimator f;

    public OJ(RV0 rv0, View view, float f) {
        O90.f(rv0, "screen");
        O90.f(view, "viewToAnimate");
        this.a = rv0;
        this.b = view;
        this.c = c(rv0.getSheetLargestUndimmedDetentIndex());
        float fC = c(AbstractC5686lO1.c(rv0.getSheetLargestUndimmedDetentIndex() + 1, 0, rv0.getSheetDetents().size() - 1));
        this.d = fC;
        this.e = fC - this.c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
        valueAnimatorOfFloat.setDuration(1L);
        valueAnimatorOfFloat.addUpdateListener(new MG(1, this));
        this.f = valueAnimatorOfFloat;
    }

    @Override // defpackage.AbstractC1291Qi
    public final void a(View view, float f) {
        float f2 = this.c;
        if (f2 >= f || f >= this.d) {
            return;
        }
        this.f.setCurrentFraction((f - f2) / this.e);
    }

    @Override // defpackage.AbstractC1291Qi
    public final void b(int i, View view) {
        if (i == 1 || i == 2) {
            RV0 rv0 = this.a;
            this.c = c(rv0.getSheetLargestUndimmedDetentIndex());
            float fC = c(AbstractC5686lO1.c(rv0.getSheetLargestUndimmedDetentIndex() + 1, 0, rv0.getSheetDetents().size() - 1));
            this.d = fC;
            this.e = fC - this.c;
        }
    }

    public final float c(int i) {
        RV0 rv0 = this.a;
        int size = rv0.getSheetDetents().size();
        if (size != 1) {
            if (size != 2) {
                if (size == 3 && i != -1) {
                    if (i != 0) {
                        if (i == 1) {
                            BottomSheetBehavior<RV0> sheetBehavior = rv0.getSheetBehavior();
                            O90.c(sheetBehavior);
                            return sheetBehavior.F;
                        }
                        if (i == 2) {
                            return 1.0f;
                        }
                    }
                    return 0.0f;
                }
            } else if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1.0f;
                    }
                }
                return 0.0f;
            }
        } else if (i != -1 && i == 0) {
            return 1.0f;
        }
        return -1.0f;
    }
}
