package p000;

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

/* renamed from: mm */
/* loaded from: classes.dex */
public final class C6447mm extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final /* synthetic */ int f37863a;

    /* renamed from: b */
    public final Object f37864b;

    /* renamed from: c */
    public Object f37865c;

    public C6447mm(int i) {
        this.f37863a = i;
        switch (i) {
            case 3:
                this.f37864b = AbstractC11797yQ1.m26149b(new C8450Vw0(10, this));
                break;
            default:
                this.f37865c = null;
                this.f37864b = new HashMap();
                break;
        }
    }

    /* renamed from: a */
    public void m22943a(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.f37864b;
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

    /* renamed from: b */
    public void m22944b() {
        C0300El c0300El = (C0300El) this.f37865c;
        if (c0300El != null) {
            c0300El.m2375b(null);
            this.f37865c = null;
        }
    }

    /* renamed from: c */
    public List m22945c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f37864b).get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        switch (this.f37863a) {
            case 1:
                Iterator it = m22945c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC7286zn(this, cameraCaptureSession, captureRequest, surface, j));
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f37863a) {
            case 0:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC6720r4(this, 17, totalCaptureResult));
                break;
            case 1:
                Iterator it = m22945c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC6757rf(this, cameraCaptureSession, captureRequest, totalCaptureResult, 1));
                break;
            default:
                m22944b();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f37863a) {
            case 1:
                Iterator it = m22945c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC6757rf(this, cameraCaptureSession, captureRequest, captureFailure, 3));
                break;
            case 3:
                m22944b();
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f37863a) {
            case 1:
                Iterator it = m22945c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC6757rf(this, cameraCaptureSession, captureRequest, captureResult, 2));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.f37863a) {
            case 1:
                Iterator it = ((HashMap) this.f37864b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
                C4015eq c4015eq = (C4015eq) this.f37865c;
                if (c4015eq != null) {
                    c4015eq.m18059a();
                    break;
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC6694qf(this, cameraCaptureSession, i, 3));
                break;
            case 3:
                m22944b();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        switch (this.f37863a) {
            case 1:
                Iterator it = ((HashMap) this.f37864b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                }
                C4015eq c4015eq = (C4015eq) this.f37865c;
                if (c4015eq != null) {
                    c4015eq.m18059a();
                    break;
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC7223yn(this, cameraCaptureSession, i, j, 0));
                break;
            case 3:
                m22944b();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        switch (this.f37863a) {
            case 1:
                Iterator it = m22945c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
                break;
            case 2:
                ((ExecutorC10151lY0) this.f37865c).execute(new RunnableC7160xn(this, cameraCaptureSession, captureRequest, j, j2));
                break;
            case 3:
                m22944b();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                break;
        }
    }

    public C6447mm(ExecutorC10151lY0 executorC10151lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f37863a = 2;
        this.f37865c = executorC10151lY0;
        this.f37864b = captureCallback;
    }

    public C6447mm(ExecutorC10151lY0 executorC10151lY0) {
        this.f37863a = 0;
        this.f37864b = new HashSet();
        this.f37865c = executorC10151lY0;
    }
}
