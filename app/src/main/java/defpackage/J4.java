package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class J4 extends Animatable2.AnimationCallback {
    public final /* synthetic */ C2584co0 a;

    public J4(C2584co0 c2584co0) {
        this.a = c2584co0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.o;
        if (colorStateList != null) {
            AbstractC4135hL.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C3650eo0 c3650eo0 = this.a.b;
        ColorStateList colorStateList = c3650eo0.o;
        if (colorStateList != null) {
            AbstractC4135hL.g(drawable, colorStateList.getColorForState(c3650eo0.s, colorStateList.getDefaultColor()));
        }
    }
}
