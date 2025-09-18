package defpackage;

import android.animation.ValueAnimator;
import android.view.Window;

/* loaded from: classes2.dex */
public final /* synthetic */ class CW0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Window b;

    public /* synthetic */ CW0(Window window, int i) {
        this.a = i;
        this.b = window;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                O90.f(valueAnimator, "animator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                O90.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.b.setStatusBarColor(((Integer) animatedValue).intValue());
                break;
            default:
                O90.f(valueAnimator, "animator");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                O90.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                this.b.setStatusBarColor(((Integer) animatedValue2).intValue());
                break;
        }
    }
}
