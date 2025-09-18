package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ru.mes.dnevnik.R;

/* renamed from: dm1 */
/* loaded from: classes.dex */
public final class C3455dm1 extends AnimatorListenerAdapter implements InterfaceC0340Ec1 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ C6078nS e;

    public C3455dm1(C6078nS c6078nS, ViewGroup viewGroup, View view, View view2) {
        this.e = c6078nS;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void a(AbstractC0418Fc1 abstractC0418Fc1) {
        throw null;
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
    public final void g(AbstractC0418Fc1 abstractC0418Fc1) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.e();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void b() {
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void f() {
    }
}
