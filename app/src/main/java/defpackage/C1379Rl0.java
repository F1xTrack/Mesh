package defpackage;

import android.animation.Animator;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Rl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379Rl0 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1379Rl0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                O90.f(animator, "animation");
                AbstractC5781lu0.b((C1145Ol0) this.b, true);
                break;
            case 1:
                O90.f(animator, "animator");
                ((InterfaceC7968xM0) ((FrameLayout) this.b)).getReactScrollViewScrollState().e = true;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                O90.f(animator, "animation");
                AbstractC5781lu0.b((C1145Ol0) this.b, false);
                break;
            case 1:
                O90.f(animator, "animator");
                FrameLayout frameLayout = (FrameLayout) this.b;
                ((InterfaceC7968xM0) frameLayout).getReactScrollViewScrollState().f = true;
                CM0.i(frameLayout);
                break;
            default:
                AbstractC0759Jm0.f("ScreenFlashView");
                ((RunnableC1577Tz0) this.b).run();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                O90.f(animator, "animation");
                break;
            case 1:
                O90.f(animator, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                O90.f(animator, "animation");
                break;
            case 1:
                O90.f(animator, "animator");
                BM0 reactScrollViewScrollState = ((InterfaceC7968xM0) ((FrameLayout) this.b)).getReactScrollViewScrollState();
                reactScrollViewScrollState.e = false;
                reactScrollViewScrollState.f = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }
}
