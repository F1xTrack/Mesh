package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* renamed from: dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3456dn extends C1562Tu0 {
    public static final C0572Hc d = new C0572Hc("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final C0572Hc e = new C0572Hc("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final C0572Hc f = new C0572Hc("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final C0572Hc g = new C0572Hc("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final C0572Hc h = new C0572Hc("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final C0572Hc i = new C0572Hc("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static C0572Hc L0(CaptureRequest.Key key) {
        return new C0572Hc("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
