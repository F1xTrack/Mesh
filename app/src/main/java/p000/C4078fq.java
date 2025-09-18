package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fq */
/* loaded from: classes.dex */
public final class C4078fq extends B71 {

    /* renamed from: a */
    public final /* synthetic */ int f27404a;

    /* renamed from: b */
    public final Object f27405b;

    public C4078fq(List list, int i) {
        this.f27404a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f27405b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.f27405b = list.isEmpty() ? new C0302En() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new C0239Dn(list);
                break;
        }
    }

    @Override // p000.B71
    /* renamed from: a */
    public void mo510a(E71 e71) {
        switch (this.f27404a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onActive((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo510a(e71);
                }
                break;
        }
    }

    @Override // p000.B71
    /* renamed from: b */
    public void mo511b(E71 e71) {
        switch (this.f27404a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onCaptureQueueEmpty((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo511b(e71);
                }
                break;
        }
    }

    @Override // p000.B71
    /* renamed from: c */
    public void mo512c(E71 e71) {
        switch (this.f27404a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onClosed((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo512c(e71);
                }
                break;
        }
    }

    @Override // p000.B71
    /* renamed from: d */
    public final void mo513d(E71 e71) {
        switch (this.f27404a) {
            case 0:
                synchronized (((C4141gq) this.f27405b).f28040a) {
                    try {
                        switch (AbstractC7222ym.m26247x(((C4141gq) this.f27405b).f28048i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(AbstractC7222ym.m26221A(((C4141gq) this.f27405b).f28048i)));
                            case 3:
                            case 5:
                            case 6:
                                ((C4141gq) this.f27405b).m18657k();
                                break;
                            case 7:
                                AbstractC7806Jm0.m4412f("CaptureSession");
                                break;
                        }
                        int i = ((C4141gq) this.f27405b).f28048i;
                        AbstractC7806Jm0.m4412f("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onConfigureFailed((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b);
                return;
            default:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo513d(e71);
                }
                return;
        }
    }

    @Override // p000.B71
    /* renamed from: e */
    public final void mo514e(E71 e71) {
        switch (this.f27404a) {
            case 0:
                synchronized (((C4141gq) this.f27405b).f28040a) {
                    try {
                        switch (AbstractC7222ym.m26247x(((C4141gq) this.f27405b).f28048i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(AbstractC7222ym.m26221A(((C4141gq) this.f27405b).f28048i)));
                            case 3:
                                C4141gq c4141gq = (C4141gq) this.f27405b;
                                c4141gq.f28048i = 5;
                                c4141gq.f28044e = e71;
                                AbstractC7806Jm0.m4412f("CaptureSession");
                                C4141gq c4141gq2 = (C4141gq) this.f27405b;
                                c4141gq2.m18660o(c4141gq2.f28045f);
                                C4141gq c4141gq3 = (C4141gq) this.f27405b;
                                c4141gq3.f28054o.m5815b().mo2494d(new RunnableC0383G4(19, c4141gq3), QR1.m6703a());
                                break;
                            case 5:
                                ((C4141gq) this.f27405b).f28044e = e71;
                                break;
                            case 6:
                                e71.m2038k();
                                break;
                        }
                        int i = ((C4141gq) this.f27405b).f28048i;
                        AbstractC7806Jm0.m4412f("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onConfigured((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b);
                return;
            default:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo514e(e71);
                }
                return;
        }
    }

    @Override // p000.B71
    /* renamed from: f */
    public final void mo515f(E71 e71) {
        switch (this.f27404a) {
            case 0:
                synchronized (((C4141gq) this.f27405b).f28040a) {
                    try {
                        if (AbstractC7222ym.m26247x(((C4141gq) this.f27405b).f28048i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(AbstractC7222ym.m26221A(((C4141gq) this.f27405b).f28048i)));
                        }
                        int i = ((C4141gq) this.f27405b).f28048i;
                        AbstractC7806Jm0.m4412f("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onReady((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b);
                return;
            default:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo515f(e71);
                }
                return;
        }
    }

    @Override // p000.B71
    /* renamed from: g */
    public final void mo516g(E71 e71) {
        switch (this.f27404a) {
            case 0:
                synchronized (((C4141gq) this.f27405b).f28040a) {
                    try {
                        if (((C4141gq) this.f27405b).f28048i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(AbstractC7222ym.m26221A(((C4141gq) this.f27405b).f28048i)));
                        }
                        AbstractC7806Jm0.m4412f("CaptureSession");
                        ((C4141gq) this.f27405b).m18657k();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo516g(e71);
                }
                return;
        }
    }

    @Override // p000.B71
    /* renamed from: h */
    public void mo517h(E71 e71, Surface surface) {
        switch (this.f27404a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f27405b).onSurfacePrepared((CameraCaptureSession) ((ES1) e71.m2051y().f11590b).f2708b, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f27405b).iterator();
                while (it.hasNext()) {
                    ((B71) it.next()).mo517h(e71, surface);
                }
                break;
        }
    }

    public C4078fq(C4141gq c4141gq) {
        this.f27404a = 0;
        this.f27405b = c4141gq;
    }

    /* renamed from: i */
    private final void m18300i(E71 e71) {
    }
}
