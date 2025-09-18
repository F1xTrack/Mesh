package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: ny0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC6175ny0 implements Animation.AnimationListener {
    public final View a;
    public boolean b = false;

    public AnimationAnimationListenerC6175ny0(View view) {
        this.a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
