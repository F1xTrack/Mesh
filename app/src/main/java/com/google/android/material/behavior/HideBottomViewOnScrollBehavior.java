package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC10490oB1;
import p000.AbstractC6397lz;
import p000.AbstractC6467n5;
import p000.AbstractC7222ym;
import p000.C3903d2;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC6397lz {

    /* renamed from: b */
    public int f18076b;

    /* renamed from: c */
    public int f18077c;

    /* renamed from: d */
    public TimeInterpolator f18078d;

    /* renamed from: e */
    public TimeInterpolator f18079e;

    /* renamed from: h */
    public ViewPropertyAnimator f18082h;

    /* renamed from: a */
    public final LinkedHashSet f18075a = new LinkedHashSet();

    /* renamed from: f */
    public int f18080f = 0;

    /* renamed from: g */
    public int f18081g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    public boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f18080f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f18076b = AbstractC10490oB1.m23359d(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f18077c = AbstractC10490oB1.m23359d(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f18078d = AbstractC10490oB1.m23360e(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC6467n5.f38093d);
        this.f18079e = AbstractC10490oB1.m23360e(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC6467n5.f38092c);
        return false;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: l */
    public final void mo11171l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f18075a;
        if (i > 0) {
            if (this.f18081g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f18082h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f18081g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC7222ym.m26227d(it);
            }
            this.f18082h = view.animate().translationY(this.f18080f).setInterpolator(this.f18079e).setDuration(this.f18077c).setListener(new C3903d2(3, this));
            return;
        }
        if (i >= 0 || this.f18081g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f18082h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f18081g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC7222ym.m26227d(it2);
        }
        this.f18082h = view.animate().translationY(0).setInterpolator(this.f18078d).setDuration(this.f18076b).setListener(new C3903d2(3, this));
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: p */
    public boolean mo11174p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
