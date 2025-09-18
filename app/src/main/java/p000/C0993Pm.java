package p000;

/* renamed from: Pm */
/* loaded from: classes.dex */
public final class C0993Pm extends AbstractC6511nn {

    /* renamed from: a */
    public final /* synthetic */ int f9275a;

    /* renamed from: b */
    public final /* synthetic */ C0300El f9276b;

    public /* synthetic */ C0993Pm(int i, C0300El c0300El) {
        this.f9275a = i;
        this.f9276b = c0300El;
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: a */
    public final void mo6422a(int i) {
        switch (this.f9275a) {
            case 0:
                this.f9276b.m2377d(new C11502w60("Capture request is cancelled because camera is closed", null));
                break;
            default:
                C0300El c0300El = this.f9276b;
                if (c0300El != null) {
                    c0300El.m2377d(new C1434Wn("Camera is closed"));
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: b */
    public final void mo5817b(int i, InterfaceC7034vn interfaceC7034vn) {
        switch (this.f9275a) {
            case 0:
                this.f9276b.m2375b(null);
                break;
            default:
                C0300El c0300El = this.f9276b;
                if (c0300El != null) {
                    AbstractC7806Jm0.m4412f("FocusMeteringControl");
                    c0300El.m2375b(null);
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: c */
    public final void mo6423c(int i, C6702qn c6702qn) {
        switch (this.f9275a) {
            case 0:
                this.f9276b.m2377d(new C11502w60("Capture request failed with reason ".concat("ERROR"), null));
                break;
            default:
                this.f9276b.m2377d(new C0226Da(1));
                break;
        }
    }
}
