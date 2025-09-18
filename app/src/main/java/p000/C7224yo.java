package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;

/* renamed from: yo */
/* loaded from: classes.dex */
public class C7224yo extends CC0 {
    /* renamed from: p1 */
    public static boolean m26255p1(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            return (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        return false;
    }

    @Override // p000.CC0
    /* renamed from: R0 */
    public CameraCharacteristics mo1039R0(String str) throws C6448mn {
        try {
            return super.mo1039R0(str);
        } catch (RuntimeException e) {
            if (m26255p1(e)) {
                throw new C6448mn(e);
            }
            throw e;
        }
    }

    @Override // p000.CC0
    /* renamed from: f1 */
    public void mo1070f1(String str, ExecutorC10151lY0 executorC10151lY0, CameraDevice.StateCallback stateCallback) throws C6448mn, CameraAccessException {
        try {
            ((CameraManager) this.f1250b).openCamera(str, executorC10151lY0, stateCallback);
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!m26255p1(e4)) {
                throw e4;
            }
            throw new C6448mn(e4);
        }
    }

    @Override // p000.CC0
    /* renamed from: j1 */
    public final void mo1082j1(ExecutorC10151lY0 executorC10151lY0, C7096wm c7096wm) {
        ((CameraManager) this.f1250b).registerAvailabilityCallback(executorC10151lY0, c7096wm);
    }

    @Override // p000.CC0
    /* renamed from: o1 */
    public final void mo1097o1(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f1250b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
