package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: Jr */
/* loaded from: classes.dex */
public final class C0621Jr extends AbstractC10272mU1 {

    /* renamed from: a */
    public final /* synthetic */ int f5750a;

    /* renamed from: b */
    public final /* synthetic */ Object f5751b;

    public /* synthetic */ C0621Jr(int i, Object obj) {
        this.f5750a = i;
        this.f5751b = obj;
    }

    @Override // p000.AbstractC10272mU1
    /* renamed from: a */
    public final void mo2788a(int i) {
        switch (this.f5750a) {
            case 0:
                break;
            default:
                C10358n91 c10358n91 = (C10358n91) this.f5751b;
                c10358n91.f38152d = true;
                InterfaceC10230m91 interfaceC10230m91 = (InterfaceC10230m91) c10358n91.f38153e.get();
                if (interfaceC10230m91 != null) {
                    C0872Nr c0872Nr = (C0872Nr) interfaceC10230m91;
                    c0872Nr.m5889u();
                    c0872Nr.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC10272mU1
    /* renamed from: b */
    public final void mo2789b(Typeface typeface, boolean z) {
        switch (this.f5750a) {
            case 0:
                Chip chip = (Chip) this.f5751b;
                C0872Nr c0872Nr = chip.f18179e;
                chip.setText(c0872Nr.f8063O1 ? c0872Nr.f8044F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    C10358n91 c10358n91 = (C10358n91) this.f5751b;
                    c10358n91.f38152d = true;
                    InterfaceC10230m91 interfaceC10230m91 = (InterfaceC10230m91) c10358n91.f38153e.get();
                    if (interfaceC10230m91 != null) {
                        C0872Nr c0872Nr2 = (C0872Nr) interfaceC10230m91;
                        c0872Nr2.m5889u();
                        c0872Nr2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    /* renamed from: c */
    private final void m4458c(int i) {
    }
}
