package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: mS */
/* loaded from: classes.dex */
public final class C5887mS extends AnimatorListenerAdapter implements InterfaceC0340Ec1 {
    public final View a;
    public boolean b = false;

    public C5887mS(View view) {
        this.a = view;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void a(AbstractC0418Fc1 abstractC0418Fc1) {
        throw null;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC8424zl1.a.b(view) : 0.0f));
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        throw null;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void e(AbstractC0418Fc1 abstractC0418Fc1) {
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void f() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC8424zl1.a.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C0445Fl1 c0445Fl1 = AbstractC8424zl1.a;
        c0445Fl1.c(view, 1.0f);
        c0445Fl1.getClass();
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void d(AbstractC0418Fc1 abstractC0418Fc1) {
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void g(AbstractC0418Fc1 abstractC0418Fc1) {
    }
}
