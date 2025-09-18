package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: Km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836Km implements InterfaceC1381Rm {
    public final C6329om a;
    public boolean b = false;

    public C0836Km(C6329om c6329om) {
        this.a = c6329om;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final InterfaceFutureC0750Jj0 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        F70 f70G = AbstractC1500Sz1.g(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return f70G;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            AbstractC0759Jm0.f("Camera2CapturePipeline");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                AbstractC0759Jm0.f("Camera2CapturePipeline");
                this.b = true;
                this.a.g.g(false);
            }
        }
        return f70G;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final boolean b() {
        return true;
    }

    @Override // defpackage.InterfaceC1381Rm
    public final void c() {
        if (this.b) {
            AbstractC0759Jm0.f("Camera2CapturePipeline");
            this.a.g.a(true, false);
        }
    }
}
