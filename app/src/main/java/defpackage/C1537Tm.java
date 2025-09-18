package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: Tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537Tm implements InterfaceC6138nm {
    public C0365El a;
    public final C0599Hl b = AbstractC8171yQ1.b(new B7(11, this));
    public final InterfaceC1459Sm c;

    public C1537Tm(InterfaceC1459Sm interfaceC1459Sm) {
        this.c = interfaceC1459Sm;
    }

    @Override // defpackage.InterfaceC6138nm
    public final boolean c(TotalCaptureResult totalCaptureResult) {
        InterfaceC1459Sm interfaceC1459Sm = this.c;
        if (interfaceC1459Sm != null && !interfaceC1459Sm.b(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
