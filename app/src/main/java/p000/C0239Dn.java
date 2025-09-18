package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Dn */
/* loaded from: classes.dex */
public final class C0239Dn extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ int f2242a;

    /* renamed from: b */
    public final Object f2243b;

    public /* synthetic */ C0239Dn(int i, Object obj) {
        this.f2242a = i;
        this.f2243b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.f2243b;
                e71.m2039l(cameraCaptureSession);
                e71.mo510a(e71);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.f2243b;
                e71.m2039l(cameraCaptureSession);
                e71.mo511b(e71);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.f2243b;
                e71.m2039l(cameraCaptureSession);
                e71.mo512c(e71);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C0300El c0300El;
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((E71) this.f2243b).m2039l(cameraCaptureSession);
                    E71 e71 = (E71) this.f2243b;
                    e71.mo513d(e71);
                    synchronized (((E71) this.f2243b).f2479a) {
                        AbstractC9104dM1.m17549h(((E71) this.f2243b).f2487i, "OpenCaptureSession completer should not null");
                        E71 e712 = (E71) this.f2243b;
                        c0300El = e712.f2487i;
                        e712.f2487i = null;
                    }
                    c0300El.m2377d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((E71) this.f2243b).f2479a) {
                        AbstractC9104dM1.m17549h(((E71) this.f2243b).f2487i, "OpenCaptureSession completer should not null");
                        E71 e713 = (E71) this.f2243b;
                        C0300El c0300El2 = e713.f2487i;
                        e713.f2487i = null;
                        c0300El2.m2377d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0300El c0300El;
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((E71) this.f2243b).m2039l(cameraCaptureSession);
                    E71 e71 = (E71) this.f2243b;
                    e71.mo514e(e71);
                    synchronized (((E71) this.f2243b).f2479a) {
                        AbstractC9104dM1.m17549h(((E71) this.f2243b).f2487i, "OpenCaptureSession completer should not null");
                        E71 e712 = (E71) this.f2243b;
                        c0300El = e712.f2487i;
                        e712.f2487i = null;
                    }
                    c0300El.m2375b(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((E71) this.f2243b).f2479a) {
                        AbstractC9104dM1.m17549h(((E71) this.f2243b).f2487i, "OpenCaptureSession completer should not null");
                        E71 e713 = (E71) this.f2243b;
                        C0300El c0300El2 = e713.f2487i;
                        e713.f2487i = null;
                        c0300El2.m2375b(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((C8437Vp1) this.f2243b).f12799j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.f2243b;
                e71.m2039l(cameraCaptureSession);
                e71.mo515f(e71);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f2242a) {
            case 0:
                Iterator it = ((ArrayList) this.f2243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                E71 e71 = (E71) this.f2243b;
                e71.m2039l(cameraCaptureSession);
                e71.mo517h(e71, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public C0239Dn(List list) {
        this.f2242a = 0;
        this.f2243b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C0302En)) {
                ((ArrayList) this.f2243b).add(stateCallback);
            }
        }
    }

    /* renamed from: a */
    private final void m1875a(CameraCaptureSession cameraCaptureSession) {
    }
}
