package defpackage;

import android.animation.Animator;

/* renamed from: ms */
/* loaded from: classes.dex */
public final class C5965ms implements Animator.AnimatorListener {
    public final /* synthetic */ C6156ns a;
    public final /* synthetic */ C6347os b;

    public C5965ms(C6347os c6347os, C6156ns c6156ns) {
        this.b = c6347os;
        this.a = c6156ns;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C6347os c6347os = this.b;
        C6156ns c6156ns = this.a;
        c6347os.a(1.0f, c6156ns, true);
        c6156ns.k = c6156ns.e;
        c6156ns.l = c6156ns.f;
        c6156ns.m = c6156ns.g;
        c6156ns.a((c6156ns.j + 1) % c6156ns.i.length);
        if (!c6347os.f) {
            c6347os.e += 1.0f;
            return;
        }
        c6347os.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (c6156ns.n) {
            c6156ns.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
