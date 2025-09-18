package defpackage;

import android.view.animation.Animation;

/* renamed from: bh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC2373bh0 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3439dh0 b;

    public AnimationAnimationListenerC2373bh0(C3439dh0 c3439dh0, int i) {
        this.b = c3439dh0;
        this.a = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.mLayoutHandlers.remove(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.b.mLayoutHandlers.put(this.a, (InterfaceC4392ih0) animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
