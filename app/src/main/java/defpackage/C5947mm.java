package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5947mm extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public C5947mm(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = AbstractC8171yQ1.b(new C1724Vw0(10, this));
                break;
            default:
                this.c = null;
                this.b = new HashMap();
                break;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.b;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    public void b() {
        C0365El c0365El = (C0365El) this.c;
        if (c0365El != null) {
            c0365El.b(null);
            this.c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.b).get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC8428zn(this, cameraCaptureSession, captureRequest, surface, j));
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC6769r4(this, 17, totalCaptureResult));
                break;
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC6880rf(this, cameraCaptureSession, captureRequest, totalCaptureResult, 1));
                break;
            default:
                b();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC6880rf(this, cameraCaptureSession, captureRequest, captureFailure, 3));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC6880rf(this, cameraCaptureSession, captureRequest, captureResult, 2));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.a) {
            case 1:
                Iterator it = ((HashMap) this.b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
                C3655eq c3655eq = (C3655eq) this.c;
                if (c3655eq != null) {
                    c3655eq.a();
                    break;
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC6690qf(this, cameraCaptureSession, i, 3));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        switch (this.a) {
            case 1:
                Iterator it = ((HashMap) this.b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                }
                C3655eq c3655eq = (C3655eq) this.c;
                if (c3655eq != null) {
                    c3655eq.a();
                    break;
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC8238yn(this, cameraCaptureSession, i, j, 0));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
                break;
            case 2:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC8048xn(this, cameraCaptureSession, captureRequest, j, j2));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                break;
        }
    }

    public C5947mm(ExecutorC5715lY0 executorC5715lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        this.a = 2;
        this.c = executorC5715lY0;
        this.b = captureCallback;
    }

    public C5947mm(ExecutorC5715lY0 executorC5715lY0) {
        this.a = 0;
        this.b = new HashSet();
        this.c = executorC5715lY0;
    }
}
