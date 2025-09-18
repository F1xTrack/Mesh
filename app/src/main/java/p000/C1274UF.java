package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: UF */
/* loaded from: classes.dex */
public final class C1274UF extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f11701a;

    /* renamed from: b */
    public final /* synthetic */ C1337VF f11702b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f11703c;

    /* renamed from: d */
    public final /* synthetic */ View f11704d;

    /* renamed from: e */
    public final /* synthetic */ C1463XF f11705e;

    public /* synthetic */ C1274UF(C1463XF c1463xf, C1337VF c1337vf, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f11701a = i;
        this.f11705e = c1463xf;
        this.f11702b = c1337vf;
        this.f11703c = viewPropertyAnimator;
        this.f11704d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11701a) {
            case 0:
                this.f11703c.setListener(null);
                View view = this.f11704d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1337VF c1337vf = this.f11702b;
                OO0 oo0 = c1337vf.f12460a;
                C1463XF c1463xf = this.f11705e;
                c1463xf.m25614c(oo0);
                c1463xf.f13645r.remove(c1337vf.f12460a);
                c1463xf.m8958i();
                break;
            default:
                this.f11703c.setListener(null);
                View view2 = this.f11704d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1337VF c1337vf2 = this.f11702b;
                OO0 oo02 = c1337vf2.f12461b;
                C1463XF c1463xf2 = this.f11705e;
                c1463xf2.m25614c(oo02);
                c1463xf2.f13645r.remove(c1337vf2.f12461b);
                c1463xf2.m8958i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f11701a) {
            case 0:
                OO0 oo0 = this.f11702b.f12460a;
                this.f11705e.getClass();
                break;
            default:
                OO0 oo02 = this.f11702b.f12461b;
                this.f11705e.getClass();
                break;
        }
    }
}
