package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* renamed from: dn */
/* loaded from: classes.dex */
public final class C3950dn extends C8342Tu0 {

    /* renamed from: d */
    public static final C0480Hc f26271d = new C0480Hc("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* renamed from: e */
    public static final C0480Hc f26272e = new C0480Hc("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* renamed from: f */
    public static final C0480Hc f26273f = new C0480Hc("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* renamed from: g */
    public static final C0480Hc f26274g = new C0480Hc("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* renamed from: h */
    public static final C0480Hc f26275h = new C0480Hc("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* renamed from: i */
    public static final C0480Hc f26276i = new C0480Hc("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    /* renamed from: L0 */
    public static C0480Hc m17743L0(CaptureRequest.Key key) {
        return new C0480Hc("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
