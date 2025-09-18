package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: mS */
/* loaded from: classes.dex */
public final class C6427mS extends AnimatorListenerAdapter implements InterfaceC7527Ec1 {

    /* renamed from: a */
    public final View f37710a;

    /* renamed from: b */
    public boolean f37711b = false;

    public C6427mS(View view) {
        this.f37710a = view;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: a */
    public final void mo2334a(AbstractC7579Fc1 abstractC7579Fc1) {
        throw null;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: b */
    public final void mo2335b() {
        View view = this.f37710a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC11966zl1.f46983a.mo3150b(view) : 0.0f));
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        throw null;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: e */
    public final void mo2338e(AbstractC7579Fc1 abstractC7579Fc1) {
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: f */
    public final void mo2339f() {
        this.f37710a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC11966zl1.f46983a.mo3151c(this.f37710a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f37710a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f37711b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f37711b;
        View view = this.f37710a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C7597Fl1 c7597Fl1 = AbstractC11966zl1.f46983a;
        c7597Fl1.mo3151c(view, 1.0f);
        c7597Fl1.getClass();
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: d */
    public final void mo2337d(AbstractC7579Fc1 abstractC7579Fc1) {
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: g */
    public final void mo2340g(AbstractC7579Fc1 abstractC7579Fc1) {
    }
}
