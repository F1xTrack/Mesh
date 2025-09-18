package p000;

import android.view.animation.Animation;

/* renamed from: bh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC8884bh0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ int f17119a;

    /* renamed from: b */
    public final /* synthetic */ C9145dh0 f17120b;

    public AnimationAnimationListenerC8884bh0(C9145dh0 c9145dh0, int i) {
        this.f17120b = c9145dh0;
        this.f17119a = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f17120b.mLayoutHandlers.remove(this.f17119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f17120b.mLayoutHandlers.put(this.f17119a, (InterfaceC9785ih0) animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
