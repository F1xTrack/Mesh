package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: Up, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1624Up extends AbstractC6141nn {
    public final CameraCaptureSession.CaptureCallback a;

    public C1624Up(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.a = captureCallback;
    }
}
