package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: l5 */
/* loaded from: classes.dex */
public final class C6341l5 implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: a */
    public final float f36882a;

    /* renamed from: b */
    public final float f36883b;

    /* renamed from: c */
    public final /* synthetic */ C6404m5 f36884c;

    public C6341l5(C6404m5 c6404m5, float f, float f2) {
        this.f36884c = c6404m5;
        this.f36882a = f;
        this.f36883b = f2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C6404m5 c6404m5 = this.f36884c;
        ((C11891zA0) c6404m5.f37468c).m26022o();
        c6404m5.m22661e();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C6404m5 c6404m5 = this.f36884c;
        ((C11891zA0) c6404m5.f37468c).m26022o();
        ((C11891zA0) c6404m5.f37468c).m26024q();
        c6404m5.m22661e();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((C11891zA0) this.f36884c.f37468c).m26028u(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f36882a, this.f36883b));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
