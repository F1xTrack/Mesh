package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;

/* renamed from: yo */
/* loaded from: classes.dex */
public class C8241yo extends CC0 {
    public static boolean p1(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            return (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        return false;
    }

    @Override // defpackage.CC0
    public CameraCharacteristics R0(String str) throws C5950mn {
        try {
            return super.R0(str);
        } catch (RuntimeException e) {
            if (p1(e)) {
                throw new C5950mn(e);
            }
            throw e;
        }
    }

    @Override // defpackage.CC0
    public void f1(String str, ExecutorC5715lY0 executorC5715lY0, CameraDevice.StateCallback stateCallback) throws C5950mn, CameraAccessException {
        try {
            ((CameraManager) this.b).openCamera(str, executorC5715lY0, stateCallback);
        } catch (CameraAccessException e) {
            throw new C5950mn(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!p1(e4)) {
                throw e4;
            }
            throw new C5950mn(e4);
        }
    }

    @Override // defpackage.CC0
    public final void j1(ExecutorC5715lY0 executorC5715lY0, C7855wm c7855wm) {
        ((CameraManager) this.b).registerAvailabilityCallback(executorC5715lY0, c7855wm);
    }

    @Override // defpackage.CC0
    public final void o1(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
