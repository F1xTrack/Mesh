package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import kotlin.KotlinVersion;

/* renamed from: ch0 */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC9012ch0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ int f17688a;

    /* renamed from: b */
    public final /* synthetic */ Object f17689b;

    public /* synthetic */ AnimationAnimationListenerC9012ch0(int i, Object obj) {
        this.f17688a = i;
        this.f17689b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC10866r71 interfaceC10866r71;
        switch (this.f17688a) {
            case 0:
                ((C4218i3) ((InterfaceC9273eh0) this.f17689b)).m18949n();
                break;
            case 1:
                O90.m5968f(animation, "animation");
                C10659pW0 c10659pW0 = ((C10403nW0) this.f17689b).f38354x;
                c10659pW0.m19057u(true);
                View view = c10659pW0.getView();
                ViewParent parent = view != null ? view.getParent() : null;
                if (parent instanceof C10275mW0) {
                    C10275mW0 c10275mW0 = (C10275mW0) parent;
                    if (!c10275mW0.f37748m) {
                        c10275mW0.m22833j();
                        break;
                    }
                }
                break;
            case 2:
                PM0 pm0 = (PM0) this.f17689b;
                if (!pm0.f42856c) {
                    pm0.m24846l();
                    break;
                } else {
                    pm0.f42879z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    pm0.f42879z.start();
                    if (pm0.f42848E && (interfaceC10866r71 = pm0.f42855b) != null) {
                        ES1 es1 = (ES1) interfaceC10866r71;
                        PM0 pm02 = (PM0) es1.f2709c;
                        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) es1.f2708b, pm02.getId());
                        if (interfaceC6947uPM6091b != null) {
                            interfaceC6947uPM6091b.mo11046g(new C6846so(OZ1.m6094e(pm02), pm02.getId(), 14));
                        }
                    }
                    pm0.f42867n = pm0.f42873t.getTop();
                    break;
                }
            default:
                AbstractC11122t71 abstractC11122t71 = (AbstractC11122t71) this.f17689b;
                abstractC11122t71.getClass();
                C10354n71 c10354n71 = new C10354n71(abstractC11122t71, 1);
                abstractC11122t71.f42845B = c10354n71;
                c10354n71.setDuration(150L);
                C4206hs c4206hs = abstractC11122t71.f42873t;
                c4206hs.f28641a = null;
                c4206hs.clearAnimation();
                abstractC11122t71.f42873t.startAnimation(abstractC11122t71.f42845B);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.f17688a) {
            case 1:
                O90.m5968f(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f17688a) {
            case 1:
                O90.m5968f(animation, "animation");
                ((C10403nW0) this.f17689b).f38354x.m19057u(false);
                break;
        }
    }

    /* renamed from: a */
    private final void m10823a(Animation animation) {
    }

    /* renamed from: b */
    private final void m10824b(Animation animation) {
    }

    /* renamed from: c */
    private final void m10825c(Animation animation) {
    }

    /* renamed from: d */
    private final void m10826d(Animation animation) {
    }

    /* renamed from: e */
    private final void m10827e(Animation animation) {
    }

    /* renamed from: f */
    private final void m10828f(Animation animation) {
    }
}
