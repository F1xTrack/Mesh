package p000;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: Jm */
/* loaded from: classes.dex */
public final class C0616Jm implements InterfaceC1118Rm {

    /* renamed from: a */
    public final C6573om f5683a;

    /* renamed from: b */
    public final C0856Nb f5684b;

    /* renamed from: c */
    public final int f5685c;

    /* renamed from: d */
    public boolean f5686d = false;

    public C0616Jm(C6573om c6573om, int i, C0856Nb c0856Nb) {
        this.f5683a = c6573om;
        this.f5685c = i;
        this.f5684b = c0856Nb;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 mo4404a(TotalCaptureResult totalCaptureResult) {
        if (!C1622Zm.m9587j(totalCaptureResult, this.f5685c)) {
            return AbstractC8301Sz1.m7484g(Boolean.FALSE);
        }
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        this.f5686d = true;
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11797yQ1.m26149b(new C0071B7(7, this)));
        C0553Im c0553Im = new C0553Im(0);
        ExecutorC1215TJ executorC1215TJM6703a = QR1.m6703a();
        c1043qzM6727a.getClass();
        return AbstractC8301Sz1.m7495r(c1043qzM6727a, new C7391Bm1(20, c0553Im), executorC1215TJM6703a);
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: b */
    public final boolean mo4405b() {
        return this.f5685c == 0;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: c */
    public final void mo4406c() {
        if (this.f5686d) {
            AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
            this.f5683a.f39235g.m3075a(false, true);
            this.f5684b.f7895b = false;
        }
    }
}
