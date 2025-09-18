package p000;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: Up */
/* loaded from: classes.dex */
public final class C1310Up extends AbstractC6511nn {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f12154a;

    public C1310Up(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f12154a = captureCallback;
    }
}
