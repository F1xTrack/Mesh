package defpackage;

/* renamed from: Pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225Pm extends AbstractC6141nn {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0365El b;

    public /* synthetic */ C1225Pm(int i, C0365El c0365El) {
        this.a = i;
        this.b = c0365El;
    }

    @Override // defpackage.AbstractC6141nn
    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.b.d(new C7730w60("Capture request is cancelled because camera is closed", null));
                break;
            default:
                C0365El c0365El = this.b;
                if (c0365El != null) {
                    c0365El.d(new C1774Wn("Camera is closed"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void b(int i, InterfaceC7668vn interfaceC7668vn) {
        switch (this.a) {
            case 0:
                this.b.b(null);
                break;
            default:
                C0365El c0365El = this.b;
                if (c0365El != null) {
                    AbstractC0759Jm0.f("FocusMeteringControl");
                    c0365El.b(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void c(int i, C6714qn c6714qn) {
        switch (this.a) {
            case 0:
                this.b.d(new C7730w60("Capture request failed with reason ".concat("ERROR"), null));
                break;
            default:
                this.b.d(new C0254Da(1));
                break;
        }
    }
}
