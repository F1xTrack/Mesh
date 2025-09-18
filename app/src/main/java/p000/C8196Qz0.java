package p000;

import android.view.View;
import com.reactnativepagerview.PagerViewViewManager;
import java.util.Locale;

/* renamed from: Qz0 */
/* loaded from: classes.dex */
public final class C8196Qz0 extends AbstractC9410fl1 {

    /* renamed from: a */
    public final /* synthetic */ int f9880a = 1;

    /* renamed from: b */
    public final Object f9881b;

    /* renamed from: c */
    public Object f9882c;

    public C8196Qz0(C9282el1 c9282el1) {
        this.f9881b = c9282el1;
    }

    @Override // p000.AbstractC9410fl1
    /* renamed from: a */
    public final void mo6839a(int i) {
        String str;
        switch (this.f9880a) {
            case 0:
                return;
            default:
                if (i == 0) {
                    str = "idle";
                } else if (i == 1) {
                    str = "dragging";
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("Unsupported pageScrollState");
                    }
                    str = "settling";
                }
                InterfaceC6947uP interfaceC6947uP = ((PagerViewViewManager) this.f9881b).eventDispatcher;
                if (interfaceC6947uP != null) {
                    interfaceC6947uP.mo11046g(new C0977PW(((C7562Eu0) this.f9882c).getId(), str));
                    return;
                } else {
                    O90.m5977o("eventDispatcher");
                    throw null;
                }
        }
    }

    @Override // p000.AbstractC9410fl1
    /* renamed from: b */
    public final void mo6840b(int i, float f, int i2) {
        switch (this.f9880a) {
            case 0:
                if (((InterfaceC9538gl1) this.f9882c) == null) {
                    return;
                }
                float f2 = -f;
                int i3 = 0;
                while (true) {
                    C9282el1 c9282el1 = (C9282el1) this.f9881b;
                    if (i3 >= c9282el1.m26426v()) {
                        return;
                    }
                    View viewM26425u = c9282el1.m26425u(i3);
                    if (viewM26425u == null) {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(AbstractC7222ym.m26233j("LayoutManager returned a null child at pos ", "/", i3, c9282el1.m26426v(), " while transforming pages"));
                    }
                    C10050kl1 c10050kl1 = (C10050kl1) ((C0804Mm) ((InterfaceC9538gl1) this.f9882c)).f7330c;
                    float fM26400H = r2.f7329b * ((AbstractC11919zO0.m26400H(viewM26425u) - i) + f2);
                    if (c10050kl1.getOrientation() == 0) {
                        if (c10050kl1.getLayoutDirection() == 1) {
                            fM26400H = -fM26400H;
                        }
                        viewM26425u.setTranslationX(fM26400H);
                    } else {
                        viewM26425u.setTranslationY(fM26400H);
                    }
                    i3++;
                }
            default:
                InterfaceC6947uP interfaceC6947uP = ((PagerViewViewManager) this.f9881b).eventDispatcher;
                if (interfaceC6947uP != null) {
                    interfaceC6947uP.mo11046g(new C8092Oz0(((C7562Eu0) this.f9882c).getId(), f, i));
                    return;
                } else {
                    O90.m5977o("eventDispatcher");
                    throw null;
                }
        }
    }

    @Override // p000.AbstractC9410fl1
    /* renamed from: c */
    public final void mo6841c(int i) {
        switch (this.f9880a) {
            case 0:
                return;
            default:
                InterfaceC6947uP interfaceC6947uP = ((PagerViewViewManager) this.f9881b).eventDispatcher;
                if (interfaceC6947uP != null) {
                    interfaceC6947uP.mo11046g(new C0400GL(((C7562Eu0) this.f9882c).getId(), i));
                    return;
                } else {
                    O90.m5977o("eventDispatcher");
                    throw null;
                }
        }
    }

    public C8196Qz0(PagerViewViewManager pagerViewViewManager, C7562Eu0 c7562Eu0) {
        this.f9881b = pagerViewViewManager;
        this.f9882c = c7562Eu0;
    }

    /* renamed from: d */
    private final void m6837d(int i) {
    }

    /* renamed from: e */
    private final void m6838e(int i) {
    }
}
