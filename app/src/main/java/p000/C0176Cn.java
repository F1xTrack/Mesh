package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* renamed from: Cn */
/* loaded from: classes.dex */
public final class C0176Cn extends ES1 {
    @Override // p000.ES1
    /* renamed from: J */
    public final int mo1364J(CaptureRequest captureRequest, ExecutorC10151lY0 executorC10151lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f2708b).setSingleRepeatingRequest(captureRequest, executorC10151lY0, captureCallback);
    }

    @Override // p000.ES1
    /* renamed from: n */
    public final int mo1365n(ArrayList arrayList, ExecutorC10151lY0 executorC10151lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f2708b).captureBurstRequests(arrayList, executorC10151lY0, captureCallback);
    }
}
