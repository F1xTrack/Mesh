package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: TF */
/* loaded from: classes.dex */
public final class C1211TF extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ OO0 f11255a;

    /* renamed from: b */
    public final /* synthetic */ int f11256b;

    /* renamed from: c */
    public final /* synthetic */ View f11257c;

    /* renamed from: d */
    public final /* synthetic */ int f11258d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f11259e;

    /* renamed from: f */
    public final /* synthetic */ C1463XF f11260f;

    public C1211TF(C1463XF c1463xf, OO0 oo0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f11260f = c1463xf;
        this.f11255a = oo0;
        this.f11256b = i;
        this.f11257c = view;
        this.f11258d = i2;
        this.f11259e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f11256b;
        View view = this.f11257c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f11258d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f11259e.setListener(null);
        C1463XF c1463xf = this.f11260f;
        OO0 oo0 = this.f11255a;
        c1463xf.m25614c(oo0);
        c1463xf.f13643p.remove(oo0);
        c1463xf.m8958i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f11260f.getClass();
    }
}
