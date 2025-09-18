package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

/* renamed from: zo */
/* loaded from: classes.dex */
public class C7287zo extends C7224yo {
    @Override // p000.C7224yo, p000.CC0
    /* renamed from: R0 */
    public final CameraCharacteristics mo1039R0(String str) throws C6448mn {
        try {
            return ((CameraManager) this.f1250b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }

    @Override // p000.C7224yo, p000.CC0
    /* renamed from: f1 */
    public final void mo1070f1(String str, ExecutorC10151lY0 executorC10151lY0, CameraDevice.StateCallback stateCallback) throws C6448mn, CameraAccessException {
        try {
            ((CameraManager) this.f1250b).openCamera(str, executorC10151lY0, stateCallback);
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }
}
