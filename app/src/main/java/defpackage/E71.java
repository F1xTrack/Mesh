package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class E71 extends B71 {
    public final U41 b;
    public final Handler c;
    public final ExecutorC5715lY0 d;
    public final C20 e;
    public C3846fq f;
    public C1562Tu0 g;
    public C0599Hl h;
    public C0365El i;
    public QZ j;
    public final C20 o;
    public ArrayList q;
    public C8227yj0 r;
    public final C5911ma s;
    public final C0136Bm1 t;
    public final C1055Nh0 u;
    public final FC v;
    public final Object a = new Object();
    public List k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public final Object p = new Object();
    public final AtomicBoolean w = new AtomicBoolean(false);

    public E71(C3513e41 c3513e41, C3513e41 c3513e412, U41 u41, ExecutorC5715lY0 executorC5715lY0, C20 c20, Handler handler) {
        this.b = u41;
        this.c = handler;
        this.d = executorC5715lY0;
        this.e = c20;
        C5911ma c5911ma = new C5911ma();
        c5911ma.a = c3513e412.x0(TextureViewIsClosedQuirk.class);
        c5911ma.b = c3513e41.x0(PreviewOrientationIncorrectQuirk.class);
        c5911ma.c = c3513e41.x0(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.s = c5911ma;
        this.u = new C1055Nh0(c3513e41.x0(CaptureSessionStuckQuirk.class) || c3513e41.x0(IncorrectCaptureStateQuirk.class));
        this.t = new C0136Bm1(c3513e412);
        this.v = new FC(c3513e412, 7);
        this.o = c20;
    }

    public static void m() {
        AbstractC0759Jm0.f("SyncCaptureSessionImpl");
    }

    @Override // defpackage.B71
    public final void a(E71 e71) {
        Objects.requireNonNull(this.f);
        this.f.a(e71);
    }

    @Override // defpackage.B71
    public final void b(E71 e71) {
        Objects.requireNonNull(this.f);
        this.f.b(e71);
    }

    @Override // defpackage.B71
    public final void c(E71 e71) {
        synchronized (this.p) {
            this.s.c(this.q);
        }
        m();
        p(e71);
    }

    @Override // defpackage.B71
    public final void d(E71 e71) {
        E71 e712;
        Objects.requireNonNull(this.f);
        r();
        this.u.c();
        U41 u41 = this.b;
        Iterator it = u41.u().iterator();
        while (it.hasNext() && (e712 = (E71) it.next()) != this) {
            e712.r();
            e712.u.c();
        }
        synchronized (u41.a) {
            ((LinkedHashSet) u41.e).remove(this);
        }
        this.f.d(e71);
    }

    @Override // defpackage.B71
    public final void e(E71 e71) {
        E71 e712;
        E71 e713;
        E71 e714;
        m();
        C0136Bm1 c0136Bm1 = this.t;
        ArrayList arrayListT = this.b.t();
        ArrayList arrayListS = this.b.s();
        if (((CaptureSessionOnClosedNotCalledQuirk) c0136Bm1.b) != null) {
            LinkedHashSet<E71> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayListT.iterator();
            while (it.hasNext() && (e714 = (E71) it.next()) != e71) {
                linkedHashSet.add(e714);
            }
            for (E71 e715 : linkedHashSet) {
                e715.getClass();
                e715.d(e715);
            }
        }
        Objects.requireNonNull(this.f);
        U41 u41 = this.b;
        synchronized (u41.a) {
            ((LinkedHashSet) u41.c).add(this);
            ((LinkedHashSet) u41.e).remove(this);
        }
        Iterator it2 = u41.u().iterator();
        while (it2.hasNext() && (e713 = (E71) it2.next()) != this) {
            e713.r();
            e713.u.c();
        }
        this.f.e(e71);
        if (((CaptureSessionOnClosedNotCalledQuirk) c0136Bm1.b) != null) {
            LinkedHashSet<E71> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayListS.iterator();
            while (it3.hasNext() && (e712 = (E71) it3.next()) != e71) {
                linkedHashSet2.add(e712);
            }
            for (E71 e716 : linkedHashSet2) {
                e716.getClass();
                e716.c(e716);
            }
        }
    }

    @Override // defpackage.B71
    public final void f(E71 e71) {
        Objects.requireNonNull(this.f);
        this.f.f(e71);
    }

    @Override // defpackage.B71
    public final void g(E71 e71) {
        C0599Hl c0599Hl;
        synchronized (this.a) {
            try {
                if (this.n) {
                    c0599Hl = null;
                } else {
                    this.n = true;
                    AbstractC3377dM1.h(this.h, "Need to call openCaptureSession before using this API.");
                    c0599Hl = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0599Hl != null) {
            c0599Hl.b.d(new C71(this, e71, 1), QR1.a());
        }
    }

    @Override // defpackage.B71
    public final void h(E71 e71, Surface surface) {
        Objects.requireNonNull(this.f);
        this.f.h(e71, surface);
    }

    public final void i() throws CameraAccessException {
        AbstractC3377dM1.h(this.g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) ((ES1) this.g.b).b).abortCaptures();
    }

    public final int j(ArrayList arrayList, C5947mm c5947mm) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.u.a(c5947mm);
        AbstractC3377dM1.h(this.g, "Need to call openCaptureSession before using this API.");
        return ((ES1) this.g.b).n(arrayList, this.d, captureCallbackA);
    }

    public final void k() {
        if (!this.w.compareAndSet(false, true)) {
            m();
            return;
        }
        if (this.v.a) {
            try {
                m();
                i();
            } catch (Exception e) {
                e.toString();
                m();
            }
        }
        m();
        this.u.b().d(new D71(this, 1), this.d);
    }

    public final void l(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new C1562Tu0(cameraCaptureSession, this.c);
        }
    }

    public final void n(List list) {
        synchronized (this.a) {
            r();
            AbstractC7818wZ1.c(list);
            this.k = list;
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = this.h != null;
        }
        return z;
    }

    public final void p(E71 e71) {
        C0599Hl c0599Hl;
        synchronized (this.a) {
            try {
                if (this.l) {
                    c0599Hl = null;
                } else {
                    this.l = true;
                    AbstractC3377dM1.h(this.h, "Need to call openCaptureSession before using this API.");
                    c0599Hl = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        r();
        this.u.c();
        if (c0599Hl != null) {
            c0599Hl.b.d(new C71(this, e71, 0), QR1.a());
        }
    }

    public final InterfaceFutureC0750Jj0 q(CameraDevice cameraDevice, DY0 dy0, List list) {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0L;
        synchronized (this.p) {
            try {
                ArrayList arrayListS = this.b.s();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListS.iterator();
                while (it.hasNext()) {
                    E71 e71 = (E71) it.next();
                    arrayList.add(AbstractC8171yQ1.b(new C0086Aw(e71.u.b(), e71.o, 1500L, 3)));
                }
                C8227yj0 c8227yj0Q = AbstractC1500Sz1.q(arrayList);
                this.r = c8227yj0Q;
                QZ qzA = QZ.a(c8227yj0Q);
                C8329zG c8329zG = new C8329zG(this, cameraDevice, dy0, list, 3);
                ExecutorC5715lY0 executorC5715lY0 = this.d;
                qzA.getClass();
                interfaceFutureC0750Jj0L = AbstractC1500Sz1.l(AbstractC1500Sz1.r(qzA, c8329zG, executorC5715lY0));
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceFutureC0750Jj0L;
    }

    public final void r() {
        synchronized (this.a) {
            try {
                List list = this.k;
                if (list != null) {
                    AbstractC7818wZ1.b(list);
                    this.k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int s(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.u.a(captureCallback);
        AbstractC3377dM1.h(this.g, "Need to call openCaptureSession before using this API.");
        return ((ES1) this.g.b).J(captureRequest, this.d, captureCallbackA);
    }

    public final InterfaceFutureC0750Jj0 t(ArrayList arrayList) {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0U;
        synchronized (this.p) {
            this.q = arrayList;
            interfaceFutureC0750Jj0U = u(arrayList);
        }
        return interfaceFutureC0750Jj0U;
    }

    public final InterfaceFutureC0750Jj0 u(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return new F70(1, new CancellationException("Opener is disabled"));
                }
                QZ qzA = QZ.a(AbstractC7818wZ1.d(arrayList, this.d, this.e));
                H30 h30 = new H30(this, 14, arrayList);
                ExecutorC5715lY0 executorC5715lY0 = this.d;
                qzA.getClass();
                RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(qzA, h30, executorC5715lY0);
                this.j = runnableC3467drR;
                return AbstractC1500Sz1.l(runnableC3467drR);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v() {
        boolean zW;
        synchronized (this.p) {
            try {
                if (o()) {
                    this.s.c(this.q);
                } else {
                    C8227yj0 c8227yj0 = this.r;
                    if (c8227yj0 != null) {
                        c8227yj0.cancel(true);
                    }
                }
                zW = w();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zW;
    }

    public final boolean w() {
        boolean z;
        try {
            synchronized (this.a) {
                try {
                    if (!this.m) {
                        QZ qz = this.j;
                        qz = qz != null ? qz : null;
                        this.m = true;
                    }
                    z = !o();
                } finally {
                }
            }
            return z;
        } finally {
            if (qz != null) {
                qz.cancel(true);
            }
        }
    }

    public final void x() throws CameraAccessException {
        AbstractC3377dM1.h(this.g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) ((ES1) this.g.b).b).stopRepeating();
    }

    public final C1562Tu0 y() {
        this.g.getClass();
        return this.g;
    }
}
