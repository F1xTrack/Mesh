package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import kotlin.KotlinVersion;

/* renamed from: ch0 */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC2563ch0 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ AnimationAnimationListenerC2563ch0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC6780r71 interfaceC6780r71;
        switch (this.a) {
            case 0:
                ((C4271i3) ((InterfaceC3629eh0) this.b)).n();
                break;
            case 1:
                O90.f(animation, "animation");
                C6473pW0 c6473pW0 = ((C6091nW0) this.b).x;
                c6473pW0.u(true);
                View view = c6473pW0.getView();
                ViewParent parent = view != null ? view.getParent() : null;
                if (parent instanceof C5900mW0) {
                    C5900mW0 c5900mW0 = (C5900mW0) parent;
                    if (!c5900mW0.m) {
                        c5900mW0.j();
                        break;
                    }
                }
                break;
            case 2:
                PM0 pm0 = (PM0) this.b;
                if (!pm0.c) {
                    pm0.l();
                    break;
                } else {
                    pm0.z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    pm0.z.start();
                    if (pm0.E && (interfaceC6780r71 = pm0.b) != null) {
                        ES1 es1 = (ES1) interfaceC6780r71;
                        PM0 pm02 = (PM0) es1.c;
                        InterfaceC7405uP interfaceC7405uPB = OZ1.b((S91) es1.b, pm02.getId());
                        if (interfaceC7405uPB != null) {
                            interfaceC7405uPB.g(new C7098so(OZ1.e(pm02), pm02.getId(), 14));
                        }
                    }
                    pm0.n = pm0.t.getTop();
                    break;
                }
            default:
                AbstractC7162t71 abstractC7162t71 = (AbstractC7162t71) this.b;
                abstractC7162t71.getClass();
                C6017n71 c6017n71 = new C6017n71(abstractC7162t71, 1);
                abstractC7162t71.B = c6017n71;
                c6017n71.setDuration(150L);
                C4234hs c4234hs = abstractC7162t71.t;
                c4234hs.a = null;
                c4234hs.clearAnimation();
                abstractC7162t71.t.startAnimation(abstractC7162t71.B);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.a) {
            case 1:
                O90.f(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 1:
                O90.f(animation, "animation");
                ((C6091nW0) this.b).x.u(false);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }

    private final void f(Animation animation) {
    }
}
