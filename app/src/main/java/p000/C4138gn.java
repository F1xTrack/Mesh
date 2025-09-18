package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* renamed from: gn */
/* loaded from: classes.dex */
public final class C4138gn extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final QR0 f27989a;

    /* renamed from: b */
    public final RR0 f27990b;

    /* renamed from: c */
    public final boolean f27991c;

    /* renamed from: d */
    public final /* synthetic */ C4201hn f27992d;

    public C4138gn(C4201hn c4201hn, RR0 rr0, QR0 qr0, boolean z) {
        this.f27992d = c4201hn;
        this.f27989a = qr0;
        this.f27990b = rr0;
        this.f27991c = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        int i;
        QR0 qr0 = this.f27989a;
        RR0 rr0 = this.f27990b;
        C4201hn c4201hn = this.f27992d;
        synchronized (c4201hn.f28579a) {
            try {
                List list = c4201hn.f28581c;
                i = -1;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C9641hZ0 c9641hZ0 = (C9641hZ0) it.next();
                        if (c9641hZ0.m18992c().get() == surface) {
                            i = c9641hZ0.f28460p;
                            break;
                        }
                        continue;
                    }
                }
            } finally {
            }
        }
        qr0.onCaptureBufferLost(rr0, j, i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f27989a.onCaptureCompleted(this.f27990b, new C4238iN(totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.f27989a.onCaptureFailed(this.f27990b, new C3949dm(captureFailure));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f27989a.onCaptureProgressed(this.f27990b, new C4238iN(captureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        if (this.f27991c) {
            this.f27989a.onCaptureSequenceAborted(i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        if (this.f27991c) {
            this.f27989a.onCaptureSequenceCompleted(i, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f27989a.onCaptureStarted(this.f27990b, j2, j);
    }
}
