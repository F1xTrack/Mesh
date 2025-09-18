package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: oy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6366oy0 extends Animation {
    public final View a;
    public final float b;
    public final float c;

    public C6366oy0(View view, float f, float f2) {
        this.a = view;
        this.b = f;
        this.c = f2 - f;
        setAnimationListener(new AnimationAnimationListenerC6175ny0(view));
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.setAlpha((this.c * f) + this.b);
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }
}
