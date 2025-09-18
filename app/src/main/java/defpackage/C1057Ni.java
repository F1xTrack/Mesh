package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: Ni */
/* loaded from: classes.dex */
public final class C1057Ni implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1057Ni(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C6145no0 c6145no0 = ((BottomSheetBehavior) this.b).i;
                if (c6145no0 != null) {
                    C5954mo0 c5954mo0 = c6145no0.a;
                    if (c5954mo0.i != fFloatValue) {
                        c5954mo0.i = fFloatValue;
                        c6145no0.e = true;
                        c6145no0.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                FS fs = (FS) this.b;
                fs.c.setAlpha(iFloatValue);
                fs.d.setAlpha(iFloatValue);
                fs.s.invalidate();
                break;
            default:
                ((TextInputLayout) this.b).G1.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
