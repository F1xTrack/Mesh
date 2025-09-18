package p000;

import android.transition.Transition;

/* renamed from: zY */
/* loaded from: classes.dex */
public final class C7271zY implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ RunnableC3973eA f46864a;

    public C7271zY(RunnableC3973eA runnableC3973eA) {
        this.f46864a = runnableC3973eA;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) throws SecurityException, IllegalArgumentException {
        this.f46864a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
