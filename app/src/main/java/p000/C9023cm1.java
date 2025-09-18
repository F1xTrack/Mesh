package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: cm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9023cm1 extends AnimatorListenerAdapter implements InterfaceC7527Ec1 {

    /* renamed from: a */
    public final View f17738a;

    /* renamed from: b */
    public final int f17739b;

    /* renamed from: c */
    public final ViewGroup f17740c;

    /* renamed from: e */
    public boolean f17742e;

    /* renamed from: f */
    public boolean f17743f = false;

    /* renamed from: d */
    public final boolean f17741d = true;

    public C9023cm1(int i, View view) {
        this.f17738a = view;
        this.f17739b = i;
        this.f17740c = (ViewGroup) view.getParent();
        m10865h(true);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: a */
    public final void mo2334a(AbstractC7579Fc1 abstractC7579Fc1) {
        throw null;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: b */
    public final void mo2335b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m10865h(false);
        if (this.f17743f) {
            return;
        }
        AbstractC11966zl1.m26533b(this.f17738a, this.f17739b);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        abstractC7579Fc1.mo2715z(this);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: d */
    public final void mo2337d(AbstractC7579Fc1 abstractC7579Fc1) {
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: e */
    public final void mo2338e(AbstractC7579Fc1 abstractC7579Fc1) {
        abstractC7579Fc1.mo2715z(this);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: f */
    public final void mo2339f() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m10865h(true);
        if (this.f17743f) {
            return;
        }
        AbstractC11966zl1.m26533b(this.f17738a, 0);
    }

    /* renamed from: h */
    public final void m10865h(boolean z) {
        ViewGroup viewGroup;
        if (!this.f17741d || this.f17742e == z || (viewGroup = this.f17740c) == null) {
            return;
        }
        this.f17742e = z;
        H02.m3209b(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f17743f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f17743f) {
            AbstractC11966zl1.m26533b(this.f17738a, this.f17739b);
            ViewGroup viewGroup = this.f17740c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m10865h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            AbstractC11966zl1.m26533b(this.f17738a, 0);
            ViewGroup viewGroup = this.f17740c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            return;
        }
        if (!this.f17743f) {
            AbstractC11966zl1.m26533b(this.f17738a, this.f17739b);
            ViewGroup viewGroup = this.f17740c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m10865h(false);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: g */
    public final void mo2340g(AbstractC7579Fc1 abstractC7579Fc1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
