package defpackage;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: b6 */
/* loaded from: classes.dex */
public final class C2261b6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ C3708f6 b;
    public final /* synthetic */ AppBarLayout$BaseBehavior c;

    public C2261b6(C3708f6 c3708f6, CoordinatorLayout coordinatorLayout, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        this.c = appBarLayout$BaseBehavior;
        this.a = coordinatorLayout;
        this.b = c3708f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.c.B(this.a, this.b, iIntValue);
    }
}
