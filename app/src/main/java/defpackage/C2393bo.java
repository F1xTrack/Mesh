package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;

/* renamed from: bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2393bo extends C4332iN {
    @Override // defpackage.C4332iN
    public void r(DY0 dy0) throws C5950mn, CameraAccessException {
        CameraDevice cameraDevice = (CameraDevice) this.b;
        C4332iN.m(cameraDevice, dy0);
        CY0 cy0 = dy0.a;
        C0137Bn c0137Bn = new C0137Bn(cy0.c(), cy0.e());
        List listF = cy0.f();
        C3866fw1 c3866fw1 = (C3866fw1) this.c;
        c3866fw1.getClass();
        C8306z80 c8306z80B = cy0.b();
        Handler handler = (Handler) c3866fw1.b;
        try {
            if (c8306z80B != null) {
                InputConfiguration inputConfiguration = c8306z80B.a.a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, DY0.a(listF), c0137Bn, handler);
            } else if (cy0.d() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(C4332iN.B(listF), c0137Bn, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(DY0.a(listF), c0137Bn, handler);
            }
        } catch (CameraAccessException e) {
            throw new C5950mn(e);
        }
    }
}
