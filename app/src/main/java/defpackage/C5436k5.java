package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: k5 */
/* loaded from: classes.dex */
public final class C5436k5 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5818m5 b;

    public /* synthetic */ C5436k5(C5818m5 c5818m5, int i) {
        this.a = i;
        this.b = c5818m5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                C5818m5 c5818m5 = this.b;
                ((C8312zA0) c5818m5.c).o();
                c5818m5.b = false;
                c5818m5.e();
                break;
            default:
                C5818m5 c5818m52 = this.b;
                ((C8312zA0) c5818m52.c).o();
                c5818m52.b = false;
                c5818m52.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                C5818m5 c5818m5 = this.b;
                ((C8312zA0) c5818m5.c).o();
                c5818m5.b = false;
                c5818m5.e();
                break;
            default:
                C5818m5 c5818m52 = this.b;
                ((C8312zA0) c5818m52.c).o();
                c5818m52.b = false;
                c5818m52.e();
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5818m5 c5818m5 = this.b;
                C8312zA0 c8312zA0 = (C8312zA0) c5818m5.c;
                c8312zA0.p(fFloatValue, c8312zA0.getCurrentYOffset());
                ((C8312zA0) c5818m5.c).n();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5818m5 c5818m52 = this.b;
                C8312zA0 c8312zA02 = (C8312zA0) c5818m52.c;
                c8312zA02.p(c8312zA02.getCurrentXOffset(), fFloatValue2);
                ((C8312zA0) c5818m52.c).n();
                break;
        }
    }
}
