package p000;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: Tm */
/* loaded from: classes.dex */
public final class C1244Tm implements InterfaceC6510nm {

    /* renamed from: a */
    public C0300El f11502a;

    /* renamed from: b */
    public final C0489Hl f11503b = AbstractC11797yQ1.m26149b(new C0071B7(11, this));

    /* renamed from: c */
    public final InterfaceC1181Sm f11504c;

    public C1244Tm(InterfaceC1181Sm interfaceC1181Sm) {
        this.f11504c = interfaceC1181Sm;
    }

    @Override // p000.InterfaceC6510nm
    /* renamed from: c */
    public final boolean mo2326c(TotalCaptureResult totalCaptureResult) {
        InterfaceC1181Sm interfaceC1181Sm = this.f11504c;
        if (interfaceC1181Sm != null && !interfaceC1181Sm.mo7449b(totalCaptureResult)) {
            return false;
        }
        this.f11502a.m2375b(totalCaptureResult);
        return true;
    }
}
