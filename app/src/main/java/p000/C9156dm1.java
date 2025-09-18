package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ru.mes.dnevnik.R;

/* renamed from: dm1 */
/* loaded from: classes.dex */
public final class C9156dm1 extends AnimatorListenerAdapter implements InterfaceC7527Ec1 {

    /* renamed from: a */
    public final ViewGroup f26266a;

    /* renamed from: b */
    public final View f26267b;

    /* renamed from: c */
    public final View f26268c;

    /* renamed from: d */
    public boolean f26269d = true;

    /* renamed from: e */
    public final /* synthetic */ C6490nS f26270e;

    public C9156dm1(C6490nS c6490nS, ViewGroup viewGroup, View view, View view2) {
        this.f26270e = c6490nS;
        this.f26266a = viewGroup;
        this.f26267b = view;
        this.f26268c = view2;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: a */
    public final void mo2334a(AbstractC7579Fc1 abstractC7579Fc1) {
        throw null;
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
    /* renamed from: g */
    public final void mo2340g(AbstractC7579Fc1 abstractC7579Fc1) {
        if (this.f26269d) {
            m17742h();
        }
    }

    /* renamed from: h */
    public final void m17742h() {
        this.f26268c.setTag(R.id.save_overlay_view, null);
        this.f26266a.getOverlay().remove(this.f26267b);
        this.f26269d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m17742h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f26266a.getOverlay().remove(this.f26267b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f26267b;
        if (view.getParent() == null) {
            this.f26266a.getOverlay().add(view);
        } else {
            this.f26270e.mo2696e();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f26268c;
            View view2 = this.f26267b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f26266a.getOverlay().add(view2);
            this.f26269d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m17742h();
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: b */
    public final void mo2335b() {
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: f */
    public final void mo2339f() {
    }
}
