package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: Jr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773Jr extends AbstractC5895mU1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0773Jr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.AbstractC5895mU1
    public final void a(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                C6023n91 c6023n91 = (C6023n91) this.b;
                c6023n91.d = true;
                InterfaceC5832m91 interfaceC5832m91 = (InterfaceC5832m91) c6023n91.e.get();
                if (interfaceC5832m91 != null) {
                    C1084Nr c1084Nr = (C1084Nr) interfaceC5832m91;
                    c1084Nr.u();
                    c1084Nr.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC5895mU1
    public final void b(Typeface typeface, boolean z) {
        switch (this.a) {
            case 0:
                Chip chip = (Chip) this.b;
                C1084Nr c1084Nr = chip.e;
                chip.setText(c1084Nr.O1 ? c1084Nr.F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    C6023n91 c6023n91 = (C6023n91) this.b;
                    c6023n91.d = true;
                    InterfaceC5832m91 interfaceC5832m91 = (InterfaceC5832m91) c6023n91.e.get();
                    if (interfaceC5832m91 != null) {
                        C1084Nr c1084Nr2 = (C1084Nr) interfaceC5832m91;
                        c1084Nr2.u();
                        c1084Nr2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void c(int i) {
    }
}
