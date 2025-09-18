package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class SF extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ OO0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ XF e;

    public SF(XF xf, OO0 oo0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = xf;
        this.b = oo0;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                XF xf = this.e;
                OO0 oo0 = this.b;
                xf.c(oo0);
                xf.q.remove(oo0);
                xf.i();
                break;
            default:
                this.d.setListener(null);
                XF xf2 = this.e;
                OO0 oo02 = this.b;
                xf2.c(oo02);
                xf2.o.remove(oo02);
                xf2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public SF(XF xf, OO0 oo0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = xf;
        this.b = oo0;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
