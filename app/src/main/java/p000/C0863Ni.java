package p000;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: Ni */
/* loaded from: classes.dex */
public final class C0863Ni implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f7966a;

    /* renamed from: b */
    public final /* synthetic */ Object f7967b;

    public /* synthetic */ C0863Ni(int i, Object obj) {
        this.f7966a = i;
        this.f7967b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7966a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C10439no0 c10439no0 = ((BottomSheetBehavior) this.f7967b).f18128i;
                if (c10439no0 != null) {
                    C10311mo0 c10311mo0 = c10439no0.f38516a;
                    if (c10311mo0.f37939i != fFloatValue) {
                        c10311mo0.f37939i = fFloatValue;
                        c10439no0.f38520e = true;
                        c10439no0.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0344FS c0344fs = (C0344FS) this.f7967b;
                c0344fs.f3232c.setAlpha(iFloatValue);
                c0344fs.f3233d.setAlpha(iFloatValue);
                c0344fs.f3248s.invalidate();
                break;
            default:
                ((TextInputLayout) this.f7967b).f18275G1.m24806k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
