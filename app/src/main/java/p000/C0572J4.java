package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: J4 */
/* loaded from: classes.dex */
public final class C0572J4 extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C9026co0 f5319a;

    public C0572J4(C9026co0 c9026co0) {
        this.f5319a = c9026co0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f5319a.f17766b.f26879o;
        if (colorStateList != null) {
            AbstractC4173hL.m18806h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C9287eo0 c9287eo0 = this.f5319a.f17766b;
        ColorStateList colorStateList = c9287eo0.f26879o;
        if (colorStateList != null) {
            AbstractC4173hL.m18805g(drawable, colorStateList.getColorForState(c9287eo0.f26883s, colorStateList.getDefaultColor()));
        }
    }
}
