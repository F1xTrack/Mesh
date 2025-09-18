package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: SF */
/* loaded from: classes.dex */
public final class C1148SF extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f10651a = 1;

    /* renamed from: b */
    public final /* synthetic */ OO0 f10652b;

    /* renamed from: c */
    public final /* synthetic */ View f10653c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f10654d;

    /* renamed from: e */
    public final /* synthetic */ C1463XF f10655e;

    public C1148SF(C1463XF c1463xf, OO0 oo0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f10655e = c1463xf;
        this.f10652b = oo0;
        this.f10654d = viewPropertyAnimator;
        this.f10653c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10651a) {
            case 1:
                this.f10653c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10651a) {
            case 0:
                this.f10654d.setListener(null);
                this.f10653c.setAlpha(1.0f);
                C1463XF c1463xf = this.f10655e;
                OO0 oo0 = this.f10652b;
                c1463xf.m25614c(oo0);
                c1463xf.f13644q.remove(oo0);
                c1463xf.m8958i();
                break;
            default:
                this.f10654d.setListener(null);
                C1463XF c1463xf2 = this.f10655e;
                OO0 oo02 = this.f10652b;
                c1463xf2.m25614c(oo02);
                c1463xf2.f13642o.remove(oo02);
                c1463xf2.m8958i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10651a) {
            case 0:
                this.f10655e.getClass();
                break;
            default:
                this.f10655e.getClass();
                break;
        }
    }

    public C1148SF(C1463XF c1463xf, OO0 oo0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10655e = c1463xf;
        this.f10652b = oo0;
        this.f10653c = view;
        this.f10654d = viewPropertyAnimator;
    }
}
