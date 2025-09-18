package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: Ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789Ws extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1867Xs b;

    public /* synthetic */ C1789Ws(C1867Xs c1867Xs, int i) {
        this.a = i;
        this.b = c1867Xs;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
