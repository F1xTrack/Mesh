package p000;

import android.animation.Animator;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Rl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8220Rl0 implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ int f10411a;

    /* renamed from: b */
    public final /* synthetic */ Object f10412b;

    public /* synthetic */ C8220Rl0(int i, Object obj) {
        this.f10411a = i;
        this.f10412b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f10411a) {
            case 0:
                O90.m5968f(animator, "animation");
                AbstractC10195lu0.m22593b((C8064Ol0) this.f10412b, true);
                break;
            case 1:
                O90.m5968f(animator, "animator");
                ((InterfaceC11661xM0) ((FrameLayout) this.f10412b)).getReactScrollViewScrollState().f769e = true;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f10411a) {
            case 0:
                O90.m5968f(animator, "animation");
                AbstractC10195lu0.m22593b((C8064Ol0) this.f10412b, false);
                break;
            case 1:
                O90.m5968f(animator, "animator");
                FrameLayout frameLayout = (FrameLayout) this.f10412b;
                ((InterfaceC11661xM0) frameLayout).getReactScrollViewScrollState().f770f = true;
                CM0.m1156i(frameLayout);
                break;
            default:
                AbstractC7806Jm0.m4412f("ScreenFlashView");
                ((RunnableC8352Tz0) this.f10412b).run();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f10411a) {
            case 0:
                O90.m5968f(animator, "animation");
                break;
            case 1:
                O90.m5968f(animator, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10411a) {
            case 0:
                O90.m5968f(animator, "animation");
                break;
            case 1:
                O90.m5968f(animator, "animator");
                BM0 reactScrollViewScrollState = ((InterfaceC11661xM0) ((FrameLayout) this.f10412b)).getReactScrollViewScrollState();
                reactScrollViewScrollState.f769e = false;
                reactScrollViewScrollState.f770f = false;
                break;
        }
    }

    /* renamed from: a */
    private final void m7113a(Animator animator) {
    }

    /* renamed from: b */
    private final void m7114b(Animator animator) {
    }

    /* renamed from: c */
    private final void m7115c(Animator animator) {
    }
}
