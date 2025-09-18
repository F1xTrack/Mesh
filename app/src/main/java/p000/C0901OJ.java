package p000;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: OJ */
/* loaded from: classes2.dex */
public final class C0901OJ extends AbstractC1052Qi {

    /* renamed from: a */
    public final RV0 f8350a;

    /* renamed from: b */
    public final View f8351b;

    /* renamed from: c */
    public float f8352c;

    /* renamed from: d */
    public float f8353d;

    /* renamed from: e */
    public float f8354e;

    /* renamed from: f */
    public final ValueAnimator f8355f;

    public C0901OJ(RV0 rv0, View view, float f) {
        O90.m5968f(rv0, "screen");
        O90.m5968f(view, "viewToAnimate");
        this.f8350a = rv0;
        this.f8351b = view;
        this.f8352c = m6009c(rv0.getSheetLargestUndimmedDetentIndex());
        float fM6009c = m6009c(AbstractC10132lO1.m22418c(rv0.getSheetLargestUndimmedDetentIndex() + 1, 0, rv0.getSheetDetents().size() - 1));
        this.f8353d = fM6009c;
        this.f8354e = fM6009c - this.f8352c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
        valueAnimatorOfFloat.setDuration(1L);
        valueAnimatorOfFloat.addUpdateListener(new C0772MG(1, this));
        this.f8355f = valueAnimatorOfFloat;
    }

    @Override // p000.AbstractC1052Qi
    /* renamed from: a */
    public final void mo6007a(View view, float f) {
        float f2 = this.f8352c;
        if (f2 >= f || f >= this.f8353d) {
            return;
        }
        this.f8355f.setCurrentFraction((f - f2) / this.f8354e);
    }

    @Override // p000.AbstractC1052Qi
    /* renamed from: b */
    public final void mo6008b(int i, View view) {
        if (i == 1 || i == 2) {
            RV0 rv0 = this.f8350a;
            this.f8352c = m6009c(rv0.getSheetLargestUndimmedDetentIndex());
            float fM6009c = m6009c(AbstractC10132lO1.m22418c(rv0.getSheetLargestUndimmedDetentIndex() + 1, 0, rv0.getSheetDetents().size() - 1));
            this.f8353d = fM6009c;
            this.f8354e = fM6009c - this.f8352c;
        }
    }

    /* renamed from: c */
    public final float m6009c(int i) {
        RV0 rv0 = this.f8350a;
        int size = rv0.getSheetDetents().size();
        if (size != 1) {
            if (size != 2) {
                if (size == 3 && i != -1) {
                    if (i != 0) {
                        if (i == 1) {
                            BottomSheetBehavior<RV0> sheetBehavior = rv0.getSheetBehavior();
                            O90.m5965c(sheetBehavior);
                            return sheetBehavior.f18095F;
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
