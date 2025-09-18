package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* renamed from: co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2583co extends C2393bo {
    @Override // defpackage.C2393bo, defpackage.C4332iN
    public final void r(DY0 dy0) throws C5950mn, CameraAccessException {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) dy0.a.a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.b).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new C5950mn(e);
        }
    }
}
