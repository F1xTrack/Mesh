package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;

/* renamed from: bo */
/* loaded from: classes.dex */
public class C1808bo extends C4238iN {
    @Override // p000.C4238iN
    /* renamed from: r */
    public void mo10521r(DY0 dy0) throws C6448mn, CameraAccessException {
        CameraDevice cameraDevice = (CameraDevice) this.f29113b;
        C4238iN.m19008m(cameraDevice, dy0);
        CY0 cy0 = dy0.f2043a;
        C0113Bn c0113Bn = new C0113Bn(cy0.mo222c(), cy0.mo224e());
        List listMo225f = cy0.mo225f();
        C9432fw1 c9432fw1 = (C9432fw1) this.f29114c;
        c9432fw1.getClass();
        C11887z80 c11887z80Mo221b = cy0.mo221b();
        Handler handler = (Handler) c9432fw1.f27505b;
        try {
            if (c11887z80Mo221b != null) {
                InputConfiguration inputConfiguration = c11887z80Mo221b.f46643a.f45419a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, DY0.m1725a(listMo225f), c0113Bn, handler);
            } else if (cy0.mo223d() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(C4238iN.m19007B(listMo225f), c0113Bn, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(DY0.m1725a(listMo225f), c0113Bn, handler);
            }
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }
}
