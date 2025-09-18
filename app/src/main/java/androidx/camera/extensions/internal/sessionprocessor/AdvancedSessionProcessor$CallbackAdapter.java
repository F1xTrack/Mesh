package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import p000.AbstractC9104dM1;
import p000.C6702qn;
import p000.InterfaceC7034vn;
import p000.QR0;
import p000.RR0;

/* loaded from: classes.dex */
class AdvancedSessionProcessor$CallbackAdapter implements QR0 {
    private final RequestProcessorImpl.Callback mCallback;

    public AdvancedSessionProcessor$CallbackAdapter(RequestProcessorImpl.Callback callback) {
        this.mCallback = callback;
    }

    private RequestProcessorImpl.Request getImplRequest(RR0 rr0) {
        AbstractC9104dM1.m17546e(rr0 instanceof AdvancedSessionProcessor$RequestAdapter);
        return ((AdvancedSessionProcessor$RequestAdapter) rr0).getImplRequest();
    }

    @Override // p000.QR0
    public void onCaptureBufferLost(RR0 rr0, long j, int i) {
        this.mCallback.onCaptureBufferLost(getImplRequest(rr0), j, i);
    }

    @Override // p000.QR0
    public void onCaptureCompleted(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
        CaptureResult captureResultMo403t = interfaceC7034vn.mo403t();
        AbstractC9104dM1.m17545d("CaptureResult in cameraCaptureResult is not a TotalCaptureResult", captureResultMo403t instanceof TotalCaptureResult);
        this.mCallback.onCaptureCompleted(getImplRequest(rr0), (TotalCaptureResult) captureResultMo403t);
    }

    @Override // p000.QR0
    public void onCaptureFailed(RR0 rr0, C6702qn c6702qn) {
        Object objMo17740a = c6702qn.mo17740a();
        AbstractC9104dM1.m17545d("CameraCaptureFailure does not contain CaptureFailure.", objMo17740a instanceof CaptureFailure);
        this.mCallback.onCaptureFailed(getImplRequest(rr0), (CaptureFailure) objMo17740a);
    }

    @Override // p000.QR0
    public void onCaptureProgressed(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
        CaptureResult captureResultMo403t = interfaceC7034vn.mo403t();
        AbstractC9104dM1.m17545d("Cannot get CaptureResult from the cameraCaptureResult ", captureResultMo403t != null);
        this.mCallback.onCaptureProgressed(getImplRequest(rr0), captureResultMo403t);
    }

    @Override // p000.QR0
    public void onCaptureSequenceAborted(int i) {
        this.mCallback.onCaptureSequenceAborted(i);
    }

    @Override // p000.QR0
    public void onCaptureSequenceCompleted(int i, long j) {
        this.mCallback.onCaptureSequenceCompleted(i, j);
    }

    @Override // p000.QR0
    public void onCaptureStarted(RR0 rr0, long j, long j2) {
        this.mCallback.onCaptureStarted(getImplRequest(rr0), j, j2);
    }
}
