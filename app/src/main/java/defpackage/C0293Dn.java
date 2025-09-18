package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293Dn extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0293Dn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.b;
                e71.l(cameraCaptureSession);
                e71.a(e71);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.b;
                e71.l(cameraCaptureSession);
                e71.b(e71);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.b;
                e71.l(cameraCaptureSession);
                e71.c(e71);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C0365El c0365El;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((E71) this.b).l(cameraCaptureSession);
                    E71 e71 = (E71) this.b;
                    e71.d(e71);
                    synchronized (((E71) this.b).a) {
                        AbstractC3377dM1.h(((E71) this.b).i, "OpenCaptureSession completer should not null");
                        E71 e712 = (E71) this.b;
                        c0365El = e712.i;
                        e712.i = null;
                    }
                    c0365El.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((E71) this.b).a) {
                        AbstractC3377dM1.h(((E71) this.b).i, "OpenCaptureSession completer should not null");
                        E71 e713 = (E71) this.b;
                        C0365El c0365El2 = e713.i;
                        e713.i = null;
                        c0365El2.d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0365El c0365El;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((E71) this.b).l(cameraCaptureSession);
                    E71 e71 = (E71) this.b;
                    e71.e(e71);
                    synchronized (((E71) this.b).a) {
                        AbstractC3377dM1.h(((E71) this.b).i, "OpenCaptureSession completer should not null");
                        E71 e712 = (E71) this.b;
                        c0365El = e712.i;
                        e712.i = null;
                    }
                    c0365El.b(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((E71) this.b).a) {
                        AbstractC3377dM1.h(((E71) this.b).i, "OpenCaptureSession completer should not null");
                        E71 e713 = (E71) this.b;
                        C0365El c0365El2 = e713.i;
                        e713.i = null;
                        c0365El2.b(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((C1704Vp1) this.b).j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                E71 e71 = (E71) this.b;
                e71.l(cameraCaptureSession);
                e71.f(e71);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                E71 e71 = (E71) this.b;
                e71.l(cameraCaptureSession);
                e71.h(e71, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public C0293Dn(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C0371En)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }
}
