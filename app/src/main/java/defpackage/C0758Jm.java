package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: Jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758Jm implements InterfaceC1381Rm {
    public final C6329om a;
    public final C1036Nb b;
    public final int c;
    public boolean d = false;

    public C0758Jm(C6329om c6329om, int i, C1036Nb c1036Nb) {
        this.a = c6329om;
        this.c = i;
        this.b = c1036Nb;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final InterfaceFutureC0750Jj0 a(TotalCaptureResult totalCaptureResult) {
        if (!C2005Zm.j(totalCaptureResult, this.c)) {
            return AbstractC1500Sz1.g(Boolean.FALSE);
        }
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        this.d = true;
        QZ qzA = QZ.a(AbstractC8171yQ1.b(new B7(7, this)));
        C0680Im c0680Im = new C0680Im(0);
        TJ tjA = QR1.a();
        qzA.getClass();
        return AbstractC1500Sz1.r(qzA, new C0136Bm1(20, c0680Im), tjA);
    }

    @Override // defpackage.InterfaceC1381Rm
    public final boolean b() {
        return this.c == 0;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final void c() {
        if (this.d) {
            AbstractC0759Jm0.f("Camera2CapturePipeline");
            this.a.g.a(false, true);
            this.b.b = false;
        }
    }
}
