package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* renamed from: gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4028gn extends CameraCaptureSession.CaptureCallback {
    public final QR0 a;
    public final RR0 b;
    public final boolean c;
    public final /* synthetic */ C4219hn d;

    public C4028gn(C4219hn c4219hn, RR0 rr0, QR0 qr0, boolean z) {
        this.d = c4219hn;
        this.a = qr0;
        this.b = rr0;
        this.c = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        int i;
        QR0 qr0 = this.a;
        RR0 rr0 = this.b;
        C4219hn c4219hn = this.d;
        synchronized (c4219hn.a) {
            try {
                List list = c4219hn.c;
                i = -1;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4178hZ0 c4178hZ0 = (C4178hZ0) it.next();
                        if (c4178hZ0.c().get() == surface) {
                            i = c4178hZ0.p;
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
        this.a.onCaptureCompleted(this.b, new C4332iN(totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.a.onCaptureFailed(this.b, new C3453dm(captureFailure));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.a.onCaptureProgressed(this.b, new C4332iN(captureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        if (this.c) {
            this.a.onCaptureSequenceAborted(i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        if (this.c) {
            this.a.onCaptureSequenceCompleted(i, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.a.onCaptureStarted(this.b, j2, j);
    }
}
