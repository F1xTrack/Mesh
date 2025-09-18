package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: Fm */
/* loaded from: classes.dex */
public final class C0364Fm extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final /* synthetic */ int f3411a;

    /* renamed from: b */
    public final Object f3412b;

    public C0364Fm(AbstractC6511nn abstractC6511nn) {
        this.f3411a = 1;
        if (abstractC6511nn == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f3412b = abstractC6511nn;
    }

    /* renamed from: a */
    public static int m2770a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof C10996s81) && (num = (Integer) ((C10996s81) captureRequest.getTag()).f42279a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C10996s81 c10996s81;
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    AbstractC9104dM1.m17545d("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof C10996s81);
                    c10996s81 = (C10996s81) tag;
                } else {
                    c10996s81 = C10996s81.f42278b;
                }
                ((AbstractC6511nn) this.f3412b).mo5817b(m2770a(captureRequest), new C4238iN(c10996s81, 7, totalCaptureResult));
                return;
            default:
                synchronized (((C4141gq) this.f3412b).f28040a) {
                    try {
                        C11812yY0 c11812yY0 = ((C4141gq) this.f3412b).f28045f;
                        if (c11812yY0 == null) {
                            return;
                        }
                        C1373Vp c1373Vp = c11812yY0.f46304g;
                        AbstractC7806Jm0.m4412f("CaptureSession");
                        C4141gq c4141gq = (C4141gq) this.f3412b;
                        c4141gq.f28053n.getClass();
                        c4141gq.mo4251f(Collections.singletonList(C0328FC.m2545e(c1373Vp)));
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((AbstractC6511nn) this.f3412b).mo6423c(m2770a(captureRequest), new C6702qn());
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        switch (this.f3411a) {
            case 0:
                Iterator it = ((ArrayList) this.f3412b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
                break;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                ((AbstractC6511nn) this.f3412b).mo9611e(m2770a(captureRequest));
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                break;
        }
    }

    public C0364Fm(List list) {
        this.f3411a = 0;
        this.f3412b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C0427Gm)) {
                ((ArrayList) this.f3412b).add(captureCallback);
            }
        }
    }

    public C0364Fm(C4141gq c4141gq) {
        this.f3411a = 2;
        this.f3412b = c4141gq;
    }
}
