package p000;

import android.animation.Animator;

/* renamed from: ms */
/* loaded from: classes.dex */
public final class C6453ms implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ C6516ns f37970a;

    /* renamed from: b */
    public final /* synthetic */ C6581os f37971b;

    public C6453ms(C6581os c6581os, C6516ns c6516ns) {
        this.f37971b = c6581os;
        this.f37970a = c6516ns;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C6581os c6581os = this.f37971b;
        C6516ns c6516ns = this.f37970a;
        c6581os.m23572a(1.0f, c6516ns, true);
        c6516ns.f38575k = c6516ns.f38569e;
        c6516ns.f38576l = c6516ns.f38570f;
        c6516ns.f38577m = c6516ns.f38571g;
        c6516ns.m23242a((c6516ns.f38574j + 1) % c6516ns.f38573i.length);
        if (!c6581os.f39321f) {
            c6581os.f39320e += 1.0f;
            return;
        }
        c6581os.f39321f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (c6516ns.f38578n) {
            c6516ns.f38578n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f37971b.f39320e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
