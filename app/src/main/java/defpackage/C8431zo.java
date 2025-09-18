package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

/* renamed from: zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8431zo extends C8241yo {
    @Override // defpackage.C8241yo, defpackage.CC0
    public final CameraCharacteristics R0(String str) throws C5950mn {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new C5950mn(e);
        }
    }

    @Override // defpackage.C8241yo, defpackage.CC0
    public final void f1(String str, ExecutorC5715lY0 executorC5715lY0, CameraDevice.StateCallback stateCallback) throws C5950mn, CameraAccessException {
        try {
            ((CameraManager) this.b).openCamera(str, executorC5715lY0, stateCallback);
        } catch (CameraAccessException e) {
            throw new C5950mn(e);
        }
    }
}
