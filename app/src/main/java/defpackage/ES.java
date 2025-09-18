package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class ES extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ FS b;

    public ES(FS fs) {
        this.b = fs;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        FS fs = this.b;
        if (((Float) fs.z.getAnimatedValue()).floatValue() == 0.0f) {
            fs.A = 0;
            fs.f(0);
        } else {
            fs.A = 2;
            fs.s.invalidate();
        }
    }
}
