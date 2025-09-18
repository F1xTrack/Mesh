package p000;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: Bm */
/* loaded from: classes.dex */
public final class C0112Bm extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final ExecutorC10151lY0 f1012a;

    /* renamed from: b */
    public final C20 f1013b;

    /* renamed from: c */
    public RunnableC0049Am f1014c;

    /* renamed from: d */
    public ScheduledFuture f1015d;

    /* renamed from: e */
    public final C7285zm f1016e;

    /* renamed from: f */
    public final /* synthetic */ C0175Cm f1017f;

    public C0112Bm(C0175Cm c0175Cm, ExecutorC10151lY0 executorC10151lY0, C20 c20, long j) {
        this.f1017f = c0175Cm;
        this.f1012a = executorC10151lY0;
        this.f1013b = c20;
        this.f1016e = new C7285zm(this, j);
    }

    /* renamed from: a */
    public final boolean m855a() {
        if (this.f1015d == null) {
            return false;
        }
        this.f1017f.m1347u("Cancelling scheduled re-open: " + this.f1014c);
        this.f1014c.f358b = true;
        this.f1014c = null;
        this.f1015d.cancel(false);
        this.f1015d = null;
        return true;
    }

    /* renamed from: b */
    public final void m856b() {
        AbstractC9104dM1.m17550i(this.f1014c == null, null);
        AbstractC9104dM1.m17550i(this.f1015d == null, null);
        C7285zm c7285zm = this.f1016e;
        c7285zm.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c7285zm.f46986b == -1) {
            c7285zm.f46986b = jUptimeMillis;
        }
        long j = jUptimeMillis - c7285zm.f46986b;
        long jM26536c = c7285zm.m26536c();
        C0175Cm c0175Cm = this.f1017f;
        if (j >= jM26536c) {
            c7285zm.f46986b = -1L;
            c7285zm.m26536c();
            AbstractC7806Jm0.m4412f("Camera2CameraImpl");
            c0175Cm.m1320G(4, null, false);
            return;
        }
        this.f1014c = new RunnableC0049Am(this, this.f1012a);
        c0175Cm.m1347u("Attempting camera re-open in " + c7285zm.m26535b() + "ms: " + this.f1014c + " activeResuming = " + c0175Cm.f1616G);
        this.f1015d = this.f1013b.schedule(this.f1014c, (long) c7285zm.m26535b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final boolean m857c() {
        int i;
        C0175Cm c0175Cm = this.f1017f;
        return c0175Cm.f1616G && ((i = c0175Cm.f1632k) == 1 || i == 2);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f1017f.m1347u("CameraDevice.onClosed()");
        AbstractC9104dM1.m17550i(this.f1017f.f1631j == null, "Unexpected onClose callback on camera device: " + cameraDevice);
        int iM26247x = AbstractC7222ym.m26247x(this.f1017f.f1621L);
        if (iM26247x == 1 || iM26247x == 4) {
            AbstractC9104dM1.m17550i(this.f1017f.f1637p.isEmpty(), null);
            this.f1017f.m1345s();
        } else {
            if (iM26247x != 5 && iM26247x != 6) {
                throw new IllegalStateException("Camera closed while in state: ".concat(AbstractC7222ym.m26249z(this.f1017f.f1621L)));
            }
            C0175Cm c0175Cm = this.f1017f;
            int i = c0175Cm.f1632k;
            if (i == 0) {
                c0175Cm.m1324K(false);
            } else {
                c0175Cm.m1347u("Camera closed due to error: ".concat(C0175Cm.m1311w(i)));
                m856b();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f1017f.m1347u("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        C0175Cm c0175Cm = this.f1017f;
        c0175Cm.f1631j = cameraDevice;
        c0175Cm.f1632k = i;
        C7967Mo1 c7967Mo1 = c0175Cm.f1620K;
        ((C0175Cm) c7967Mo1.f7363b).m1347u("Camera receive onErrorCallback");
        c7967Mo1.m5449q();
        int iM26247x = AbstractC7222ym.m26247x(this.f1017f.f1621L);
        if (iM26247x != 1) {
            switch (iM26247x) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    AbstractC7222ym.m26246w(this.f1017f.f1621L);
                    AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                    AbstractC9104dM1.m17550i(this.f1017f.f1621L == 8 || this.f1017f.f1621L == 9 || this.f1017f.f1621L == 10 || this.f1017f.f1621L == 7 || this.f1017f.f1621L == 6, "Attempt to handle open error from non open state: ".concat(AbstractC7222ym.m26249z(this.f1017f.f1621L)));
                    int i2 = 3;
                    if (i != 1 && i != 2 && i != 4) {
                        cameraDevice.getId();
                        AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                        this.f1017f.m1320G(5, new C0039Ac(i == 3 ? 5 : 6, null), true);
                        this.f1017f.m1344r();
                        return;
                    }
                    cameraDevice.getId();
                    AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                    C0175Cm c0175Cm2 = this.f1017f;
                    AbstractC9104dM1.m17550i(c0175Cm2.f1632k != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
                    if (i == 1) {
                        i2 = 2;
                    } else if (i == 2) {
                        i2 = 1;
                    }
                    c0175Cm2.m1320G(7, new C0039Ac(i2, null), true);
                    c0175Cm2.m1344r();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(AbstractC7222ym.m26249z(this.f1017f.f1621L)));
            }
        }
        cameraDevice.getId();
        AbstractC7222ym.m26246w(this.f1017f.f1621L);
        AbstractC7806Jm0.m4412f("Camera2CameraImpl");
        this.f1017f.m1344r();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f1017f.m1347u("CameraDevice.onOpened()");
        C0175Cm c0175Cm = this.f1017f;
        c0175Cm.f1631j = cameraDevice;
        c0175Cm.f1632k = 0;
        this.f1016e.f46986b = -1L;
        int iM26247x = AbstractC7222ym.m26247x(c0175Cm.f1621L);
        if (iM26247x == 1 || iM26247x == 4) {
            AbstractC9104dM1.m17550i(this.f1017f.f1637p.isEmpty(), null);
            this.f1017f.f1631j.close();
            this.f1017f.f1631j = null;
        } else {
            if (iM26247x != 5 && iM26247x != 6 && iM26247x != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(AbstractC7222ym.m26249z(this.f1017f.f1621L)));
            }
            this.f1017f.m1319F(9);
            C1246To c1246To = this.f1017f.f1641t;
            String id = cameraDevice.getId();
            C0175Cm c0175Cm2 = this.f1017f;
            if (c1246To.m7776e(id, c0175Cm2.f1640s.m10465d(c0175Cm2.f1631j.getId()))) {
                this.f1017f.m1316C();
            }
        }
    }
}
