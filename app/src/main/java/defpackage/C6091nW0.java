package defpackage;

import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: nW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6091nW0 extends CoordinatorLayout implements InterfaceC4330iM0 {
    public final C6473pW0 x;
    public final AnimationAnimationListenerC2563ch0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6091nW0(Context context, C6473pW0 c6473pW0) {
        super(context, null);
        O90.f(c6473pW0, "fragment");
        this.x = c6473pW0;
        this.y = new AnimationAnimationListenerC2563ch0(1, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    @Override // defpackage.InterfaceC4330iM0
    public final XB0 getPointerEvents() {
        return XB0.c;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        O90.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        O90.f(animation, "animation");
        C6473pW0 c6473pW0 = this.x;
        C6017n71 c6017n71 = new C6017n71(c6473pW0);
        c6017n71.setDuration(animation.getDuration());
        boolean z = animation instanceof AnimationSet;
        AnimationAnimationListenerC2563ch0 animationAnimationListenerC2563ch0 = this.y;
        if (z && !c6473pW0.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(c6017n71);
            animationSet.setAnimationListener(animationAnimationListenerC2563ch0);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(c6017n71);
        animationSet2.setAnimationListener(animationAnimationListenerC2563ch0);
        super.startAnimation(animationSet2);
    }
}
