package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: l5 */
/* loaded from: classes.dex */
public final class C5627l5 implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final /* synthetic */ C5818m5 c;

    public C5627l5(C5818m5 c5818m5, float f, float f2) {
        this.c = c5818m5;
        this.a = f;
        this.b = f2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C5818m5 c5818m5 = this.c;
        ((C8312zA0) c5818m5.c).o();
        c5818m5.e();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5818m5 c5818m5 = this.c;
        ((C8312zA0) c5818m5.c).o();
        ((C8312zA0) c5818m5.c).q();
        c5818m5.e();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((C8312zA0) this.c.c).u(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.a, this.b));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
