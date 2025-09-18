package p000;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: ny0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC10459ny0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final View f38648a;

    /* renamed from: b */
    public boolean f38649b = false;

    public AnimationAnimationListenerC10459ny0(View view) {
        this.f38648a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f38649b) {
            this.f38648a.setLayerType(0, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        View view = this.f38648a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f38649b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
