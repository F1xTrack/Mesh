package p000;

import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: nW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10403nW0 extends CoordinatorLayout implements InterfaceC9743iM0 {

    /* renamed from: x */
    public final C10659pW0 f38354x;

    /* renamed from: y */
    public final AnimationAnimationListenerC9012ch0 f38355y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10403nW0(Context context, C10659pW0 c10659pW0) {
        super(context, null);
        O90.m5968f(c10659pW0, "fragment");
        this.f38354x = c10659pW0;
        this.f38355y = new AnimationAnimationListenerC9012ch0(1, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    @Override // p000.InterfaceC9743iM0
    public final XB0 getPointerEvents() {
        return XB0.f13608c;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        O90.m5967e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        O90.m5968f(animation, "animation");
        C10659pW0 c10659pW0 = this.f38354x;
        C10354n71 c10354n71 = new C10354n71(c10659pW0);
        c10354n71.setDuration(animation.getDuration());
        boolean z = animation instanceof AnimationSet;
        AnimationAnimationListenerC9012ch0 animationAnimationListenerC9012ch0 = this.f38355y;
        if (z && !c10659pW0.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(c10354n71);
            animationSet.setAnimationListener(animationAnimationListenerC9012ch0);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(c10354n71);
        animationSet2.setAnimationListener(animationAnimationListenerC9012ch0);
        super.startAnimation(animationSet2);
    }
}
