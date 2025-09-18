package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* renamed from: Cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215Cn extends ES1 {
    @Override // defpackage.ES1
    public final int J(CaptureRequest captureRequest, ExecutorC5715lY0 executorC5715lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).setSingleRepeatingRequest(captureRequest, executorC5715lY0, captureCallback);
    }

    @Override // defpackage.ES1
    public final int n(ArrayList arrayList, ExecutorC5715lY0 executorC5715lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).captureBurstRequests(arrayList, executorC5715lY0, captureCallback);
    }
}
