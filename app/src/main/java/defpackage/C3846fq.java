package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3846fq extends B71 {
    public final /* synthetic */ int a;
    public final Object b;

    public C3846fq(List list, int i) {
        this.a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.b = list.isEmpty() ? new C0371En() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new C0293Dn(list);
                break;
        }
    }

    @Override // defpackage.B71
    public void a(E71 e71) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((ES1) e71.y().b).b);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).a(e71);
                }
                break;
        }
    }

    @Override // defpackage.B71
    public void b(E71 e71) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((ES1) e71.y().b).b);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).b(e71);
                }
                break;
        }
    }

    @Override // defpackage.B71
    public void c(E71 e71) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((ES1) e71.y().b).b);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).c(e71);
                }
                break;
        }
    }

    @Override // defpackage.B71
    public final void d(E71 e71) {
        switch (this.a) {
            case 0:
                synchronized (((C4037gq) this.b).a) {
                    try {
                        switch (AbstractC8235ym.x(((C4037gq) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(AbstractC8235ym.A(((C4037gq) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((C4037gq) this.b).k();
                                break;
                            case 7:
                                AbstractC0759Jm0.f("CaptureSession");
                                break;
                        }
                        int i = ((C4037gq) this.b).i;
                        AbstractC0759Jm0.f("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((ES1) e71.y().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).d(e71);
                }
                return;
        }
    }

    @Override // defpackage.B71
    public final void e(E71 e71) {
        switch (this.a) {
            case 0:
                synchronized (((C4037gq) this.b).a) {
                    try {
                        switch (AbstractC8235ym.x(((C4037gq) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(AbstractC8235ym.A(((C4037gq) this.b).i)));
                            case 3:
                                C4037gq c4037gq = (C4037gq) this.b;
                                c4037gq.i = 5;
                                c4037gq.e = e71;
                                AbstractC0759Jm0.f("CaptureSession");
                                C4037gq c4037gq2 = (C4037gq) this.b;
                                c4037gq2.o(c4037gq2.f);
                                C4037gq c4037gq3 = (C4037gq) this.b;
                                c4037gq3.o.b().d(new G4(19, c4037gq3), QR1.a());
                                break;
                            case 5:
                                ((C4037gq) this.b).e = e71;
                                break;
                            case 6:
                                e71.k();
                                break;
                        }
                        int i = ((C4037gq) this.b).i;
                        AbstractC0759Jm0.f("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((ES1) e71.y().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).e(e71);
                }
                return;
        }
    }

    @Override // defpackage.B71
    public final void f(E71 e71) {
        switch (this.a) {
            case 0:
                synchronized (((C4037gq) this.b).a) {
                    try {
                        if (AbstractC8235ym.x(((C4037gq) this.b).i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(AbstractC8235ym.A(((C4037gq) this.b).i)));
                        }
                        int i = ((C4037gq) this.b).i;
                        AbstractC0759Jm0.f("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((ES1) e71.y().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).f(e71);
                }
                return;
        }
    }

    @Override // defpackage.B71
    public final void g(E71 e71) {
        switch (this.a) {
            case 0:
                synchronized (((C4037gq) this.b).a) {
                    try {
                        if (((C4037gq) this.b).i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(AbstractC8235ym.A(((C4037gq) this.b).i)));
                        }
                        AbstractC0759Jm0.f("CaptureSession");
                        ((C4037gq) this.b).k();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).g(e71);
                }
                return;
        }
    }

    @Override // defpackage.B71
    public void h(E71 e71, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((ES1) e71.y().b).b, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).h(e71, surface);
                }
                break;
        }
    }

    public C3846fq(C4037gq c4037gq) {
        this.a = 0;
        this.b = c4037gq;
    }

    private final void i(E71 e71) {
    }
}
