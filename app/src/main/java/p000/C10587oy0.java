package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: oy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10587oy0 extends Animation {

    /* renamed from: a */
    public final View f39399a;

    /* renamed from: b */
    public final float f39400b;

    /* renamed from: c */
    public final float f39401c;

    public C10587oy0(View view, float f, float f2) {
        this.f39399a = view;
        this.f39400b = f;
        this.f39401c = f2 - f;
        setAnimationListener(new AnimationAnimationListenerC10459ny0(view));
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f39399a.setAlpha((this.f39401c * f) + this.f39400b);
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }
}
