package defpackage;

import android.view.View;
import com.reactnativepagerview.PagerViewViewManager;
import java.util.Locale;

/* renamed from: Qz0 */
/* loaded from: classes.dex */
public final class C1343Qz0 extends AbstractC3833fl1 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;

    public C1343Qz0(C3642el1 c3642el1) {
        this.b = c3642el1;
    }

    @Override // defpackage.AbstractC3833fl1
    public final void a(int i) {
        String str;
        switch (this.a) {
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
                InterfaceC7405uP interfaceC7405uP = ((PagerViewViewManager) this.b).eventDispatcher;
                if (interfaceC7405uP != null) {
                    interfaceC7405uP.g(new PW(((C0393Eu0) this.c).getId(), str));
                    return;
                } else {
                    O90.o("eventDispatcher");
                    throw null;
                }
        }
    }

    @Override // defpackage.AbstractC3833fl1
    public final void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                if (((InterfaceC4024gl1) this.c) == null) {
                    return;
                }
                float f2 = -f;
                int i3 = 0;
                while (true) {
                    C3642el1 c3642el1 = (C3642el1) this.b;
                    if (i3 >= c3642el1.v()) {
                        return;
                    }
                    View viewU = c3642el1.u(i3);
                    if (viewU == null) {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(AbstractC8235ym.j("LayoutManager returned a null child at pos ", "/", i3, c3642el1.v(), " while transforming pages"));
                    }
                    C5564kl1 c5564kl1 = (C5564kl1) ((C0991Mm) ((InterfaceC4024gl1) this.c)).c;
                    float fH = r2.b * ((AbstractC8354zO0.H(viewU) - i) + f2);
                    if (c5564kl1.getOrientation() == 0) {
                        if (c5564kl1.getLayoutDirection() == 1) {
                            fH = -fH;
                        }
                        viewU.setTranslationX(fH);
                    } else {
                        viewU.setTranslationY(fH);
                    }
                    i3++;
                }
            default:
                InterfaceC7405uP interfaceC7405uP = ((PagerViewViewManager) this.b).eventDispatcher;
                if (interfaceC7405uP != null) {
                    interfaceC7405uP.g(new C1187Oz0(((C0393Eu0) this.c).getId(), f, i));
                    return;
                } else {
                    O90.o("eventDispatcher");
                    throw null;
                }
        }
    }

    @Override // defpackage.AbstractC3833fl1
    public final void c(int i) {
        switch (this.a) {
            case 0:
                return;
            default:
                InterfaceC7405uP interfaceC7405uP = ((PagerViewViewManager) this.b).eventDispatcher;
                if (interfaceC7405uP != null) {
                    interfaceC7405uP.g(new GL(((C0393Eu0) this.c).getId(), i));
                    return;
                } else {
                    O90.o("eventDispatcher");
                    throw null;
                }
        }
    }

    public C1343Qz0(PagerViewViewManager pagerViewViewManager, C0393Eu0 c0393Eu0) {
        this.b = pagerViewViewManager;
        this.c = c0393Eu0;
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }
}
