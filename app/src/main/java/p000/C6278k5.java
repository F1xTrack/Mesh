package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: k5 */
/* loaded from: classes.dex */
public final class C6278k5 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f36287a;

    /* renamed from: b */
    public final /* synthetic */ C6404m5 f36288b;

    public /* synthetic */ C6278k5(C6404m5 c6404m5, int i) {
        this.f36287a = i;
        this.f36288b = c6404m5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36287a) {
            case 0:
                C6404m5 c6404m5 = this.f36288b;
                ((C11891zA0) c6404m5.f37468c).m26022o();
                c6404m5.f37467b = false;
                c6404m5.m22661e();
                break;
            default:
                C6404m5 c6404m52 = this.f36288b;
                ((C11891zA0) c6404m52.f37468c).m26022o();
                c6404m52.f37467b = false;
                c6404m52.m22661e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36287a) {
            case 0:
                C6404m5 c6404m5 = this.f36288b;
                ((C11891zA0) c6404m5.f37468c).m26022o();
                c6404m5.f37467b = false;
                c6404m5.m22661e();
                break;
            default:
                C6404m5 c6404m52 = this.f36288b;
                ((C11891zA0) c6404m52.f37468c).m26022o();
                c6404m52.f37467b = false;
                c6404m52.m22661e();
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36287a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C6404m5 c6404m5 = this.f36288b;
                C11891zA0 c11891zA0 = (C11891zA0) c6404m5.f37468c;
                c11891zA0.m26023p(fFloatValue, c11891zA0.getCurrentYOffset());
                ((C11891zA0) c6404m5.f37468c).m26021n();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C6404m5 c6404m52 = this.f36288b;
                C11891zA0 c11891zA02 = (C11891zA0) c6404m52.f37468c;
                c11891zA02.m26023p(c11891zA02.getCurrentXOffset(), fFloatValue2);
                ((C11891zA0) c6404m52.f37468c).m26021n();
                break;
        }
    }
}
