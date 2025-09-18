package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class UF extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ VF b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ XF e;

    public /* synthetic */ UF(XF xf, VF vf, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = xf;
        this.b = vf;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                VF vf = this.b;
                OO0 oo0 = vf.a;
                XF xf = this.e;
                xf.c(oo0);
                xf.r.remove(vf.a);
                xf.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                VF vf2 = this.b;
                OO0 oo02 = vf2.b;
                XF xf2 = this.e;
                xf2.c(oo02);
                xf2.r.remove(vf2.b);
                xf2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                OO0 oo0 = this.b.a;
                this.e.getClass();
                break;
            default:
                OO0 oo02 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
