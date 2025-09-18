package p000;

import android.animation.ValueAnimator;
import android.view.Window;

/* loaded from: classes2.dex */
public final /* synthetic */ class CW0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f1419a;

    /* renamed from: b */
    public final /* synthetic */ Window f1420b;

    public /* synthetic */ CW0(Window window, int i) {
        this.f1419a = i;
        this.f1420b = window;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1419a) {
            case 0:
                O90.m5968f(valueAnimator, "animator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                O90.m5966d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.f1420b.setStatusBarColor(((Integer) animatedValue).intValue());
                break;
            default:
                O90.m5968f(valueAnimator, "animator");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                O90.m5966d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                this.f1420b.setStatusBarColor(((Integer) animatedValue2).intValue());
                break;
        }
    }
}
