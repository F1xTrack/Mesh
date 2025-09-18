package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: cm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2579cm1 extends AnimatorListenerAdapter implements InterfaceC0340Ec1 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public C2579cm1(int i, View view) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void a(AbstractC0418Fc1 abstractC0418Fc1) {
        throw null;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(false);
        if (this.f) {
            return;
        }
        AbstractC8424zl1.b(this.a, this.b);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        abstractC0418Fc1.z(this);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void d(AbstractC0418Fc1 abstractC0418Fc1) {
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void e(AbstractC0418Fc1 abstractC0418Fc1) {
        abstractC0418Fc1.z(this);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void f() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(true);
        if (this.f) {
            return;
        }
        AbstractC8424zl1.b(this.a, 0);
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        H02.b(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f) {
            AbstractC8424zl1.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            AbstractC8424zl1.b(this.a, 0);
            ViewGroup viewGroup = this.c;
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
        if (!this.f) {
            AbstractC8424zl1.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void g(AbstractC0418Fc1 abstractC0418Fc1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
