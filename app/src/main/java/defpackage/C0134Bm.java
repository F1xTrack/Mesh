package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: Bm */
/* loaded from: classes.dex */
public final class C0134Bm extends CameraDevice.StateCallback {
    public final ExecutorC5715lY0 a;
    public final C20 b;
    public RunnableC0056Am c;
    public ScheduledFuture d;
    public final C8425zm e;
    public final /* synthetic */ C0212Cm f;

    public C0134Bm(C0212Cm c0212Cm, ExecutorC5715lY0 executorC5715lY0, C20 c20, long j) {
        this.f = c0212Cm;
        this.a = executorC5715lY0;
        this.b = c20;
        this.e = new C8425zm(this, j);
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        this.f.u("Cancelling scheduled re-open: " + this.c);
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        AbstractC3377dM1.i(this.c == null, null);
        AbstractC3377dM1.i(this.d == null, null);
        C8425zm c8425zm = this.e;
        c8425zm.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c8425zm.b == -1) {
            c8425zm.b = jUptimeMillis;
        }
        long j = jUptimeMillis - c8425zm.b;
        long jC = c8425zm.c();
        C0212Cm c0212Cm = this.f;
        if (j >= jC) {
            c8425zm.b = -1L;
            c8425zm.c();
            AbstractC0759Jm0.f("Camera2CameraImpl");
            c0212Cm.G(4, null, false);
            return;
        }
        this.c = new RunnableC0056Am(this, this.a);
        c0212Cm.u("Attempting camera re-open in " + c8425zm.b() + "ms: " + this.c + " activeResuming = " + c0212Cm.G);
        this.d = this.b.schedule(this.c, (long) c8425zm.b(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        int i;
        C0212Cm c0212Cm = this.f;
        return c0212Cm.G && ((i = c0212Cm.k) == 1 || i == 2);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f.u("CameraDevice.onClosed()");
        AbstractC3377dM1.i(this.f.j == null, "Unexpected onClose callback on camera device: " + cameraDevice);
        int iX = AbstractC8235ym.x(this.f.L);
        if (iX == 1 || iX == 4) {
            AbstractC3377dM1.i(this.f.p.isEmpty(), null);
            this.f.s();
        } else {
            if (iX != 5 && iX != 6) {
                throw new IllegalStateException("Camera closed while in state: ".concat(AbstractC8235ym.z(this.f.L)));
            }
            C0212Cm c0212Cm = this.f;
            int i = c0212Cm.k;
            if (i == 0) {
                c0212Cm.K(false);
            } else {
                c0212Cm.u("Camera closed due to error: ".concat(C0212Cm.w(i)));
                b();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.u("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        C0212Cm c0212Cm = this.f;
        c0212Cm.j = cameraDevice;
        c0212Cm.k = i;
        C0999Mo1 c0999Mo1 = c0212Cm.K;
        ((C0212Cm) c0999Mo1.b).u("Camera receive onErrorCallback");
        c0999Mo1.q();
        int iX = AbstractC8235ym.x(this.f.L);
        if (iX != 1) {
            switch (iX) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    AbstractC8235ym.w(this.f.L);
                    AbstractC0759Jm0.f("Camera2CameraImpl");
                    AbstractC3377dM1.i(this.f.L == 8 || this.f.L == 9 || this.f.L == 10 || this.f.L == 7 || this.f.L == 6, "Attempt to handle open error from non open state: ".concat(AbstractC8235ym.z(this.f.L)));
                    int i2 = 3;
                    if (i != 1 && i != 2 && i != 4) {
                        cameraDevice.getId();
                        AbstractC0759Jm0.f("Camera2CameraImpl");
                        this.f.G(5, new C0026Ac(i == 3 ? 5 : 6, null), true);
                        this.f.r();
                        return;
                    }
                    cameraDevice.getId();
                    AbstractC0759Jm0.f("Camera2CameraImpl");
                    C0212Cm c0212Cm2 = this.f;
                    AbstractC3377dM1.i(c0212Cm2.k != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
                    if (i == 1) {
                        i2 = 2;
                    } else if (i == 2) {
                        i2 = 1;
                    }
                    c0212Cm2.G(7, new C0026Ac(i2, null), true);
                    c0212Cm2.r();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(AbstractC8235ym.z(this.f.L)));
            }
        }
        cameraDevice.getId();
        AbstractC8235ym.w(this.f.L);
        AbstractC0759Jm0.f("Camera2CameraImpl");
        this.f.r();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f.u("CameraDevice.onOpened()");
        C0212Cm c0212Cm = this.f;
        c0212Cm.j = cameraDevice;
        c0212Cm.k = 0;
        this.e.b = -1L;
        int iX = AbstractC8235ym.x(c0212Cm.L);
        if (iX == 1 || iX == 4) {
            AbstractC3377dM1.i(this.f.p.isEmpty(), null);
            this.f.j.close();
            this.f.j = null;
        } else {
            if (iX != 5 && iX != 6 && iX != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(AbstractC8235ym.z(this.f.L)));
            }
            this.f.F(9);
            C1543To c1543To = this.f.t;
            String id = cameraDevice.getId();
            C0212Cm c0212Cm2 = this.f;
            if (c1543To.e(id, c0212Cm2.s.d(c0212Cm2.j.getId()))) {
                this.f.C();
            }
        }
    }
}
