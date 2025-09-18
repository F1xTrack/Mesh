package p000;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: b6 */
/* loaded from: classes.dex */
public final class C1764b6 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f16743a;

    /* renamed from: b */
    public final /* synthetic */ C4032f6 f16744b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout$BaseBehavior f16745c;

    public C1764b6(C4032f6 c4032f6, CoordinatorLayout coordinatorLayout, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        this.f16745c = appBarLayout$BaseBehavior;
        this.f16743a = coordinatorLayout;
        this.f16744b = c4032f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f16745c.m11166B(this.f16743a, this.f16744b, iIntValue);
    }
}
