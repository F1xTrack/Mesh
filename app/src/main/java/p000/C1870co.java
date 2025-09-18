package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* renamed from: co */
/* loaded from: classes.dex */
public final class C1870co extends C1808bo {
    @Override // p000.C1808bo, p000.C4238iN
    /* renamed from: r */
    public final void mo10521r(DY0 dy0) throws C6448mn, CameraAccessException {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) dy0.f2043a.mo220a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f29113b).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }
}
