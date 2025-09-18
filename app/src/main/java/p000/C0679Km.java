package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: Km */
/* loaded from: classes.dex */
public final class C0679Km implements InterfaceC1118Rm {

    /* renamed from: a */
    public final C6573om f6277a;

    /* renamed from: b */
    public boolean f6278b = false;

    public C0679Km(C6573om c6573om) {
        this.f6277a = c6573om;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 mo4404a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        F70 f70M7484g = AbstractC8301Sz1.m7484g(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return f70M7484g;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
                this.f6278b = true;
                this.f6277a.f39235g.m3081g(false);
            }
        }
        return f70M7484g;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: b */
    public final boolean mo4405b() {
        return true;
    }

    @Override // p000.InterfaceC1118Rm
    /* renamed from: c */
    public final void mo4406c() {
        if (this.f6278b) {
            AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
            this.f6277a.f39235g.m3075a(true, false);
        }
    }
}
