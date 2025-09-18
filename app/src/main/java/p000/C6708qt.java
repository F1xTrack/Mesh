package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qt */
/* loaded from: classes.dex */
public final class C6708qt extends AnimatorListenerAdapter {
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.end();
    }
}
