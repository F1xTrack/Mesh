package defpackage;

import android.transition.Transition;

/* renamed from: zY */
/* loaded from: classes.dex */
public final class C8383zY implements Transition.TransitionListener {
    public final /* synthetic */ RunnableC3529eA a;

    public C8383zY(RunnableC3529eA runnableC3529eA) {
        this.a = runnableC3529eA;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) throws SecurityException, IllegalArgumentException {
        this.a.run();
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
