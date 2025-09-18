package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ES */
/* loaded from: classes.dex */
public final class C0281ES extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f2700a = false;

    /* renamed from: b */
    public final /* synthetic */ C0344FS f2701b;

    public C0281ES(C0344FS c0344fs) {
        this.f2701b = c0344fs;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2700a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2700a) {
            this.f2700a = false;
            return;
        }
        C0344FS c0344fs = this.f2701b;
        if (((Float) c0344fs.f3255z.getAnimatedValue()).floatValue() == 0.0f) {
            c0344fs.f3228A = 0;
            c0344fs.m2659f(0);
        } else {
            c0344fs.f3228A = 2;
            c0344fs.f3248s.invalidate();
        }
    }
}
