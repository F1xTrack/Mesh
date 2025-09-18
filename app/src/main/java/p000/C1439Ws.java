package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: Ws */
/* loaded from: classes.dex */
public final class C1439Ws extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f13425a;

    /* renamed from: b */
    public final /* synthetic */ C1502Xs f13426b;

    public /* synthetic */ C1439Ws(C1502Xs c1502Xs, int i) {
        this.f13425a = i;
        this.f13426b = c1502Xs;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f13425a) {
            case 1:
                this.f13426b.f1351b.m705h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f13425a) {
            case 0:
                this.f13426b.f1351b.m705h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
