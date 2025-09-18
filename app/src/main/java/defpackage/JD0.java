package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class JD0 implements InterfaceC4228hq {
    public static final ArrayList o = new ArrayList();
    public static int p = 0;
    public final AbstractC3987gZ0 a;
    public final C0368Em b;
    public final ExecutorC5715lY0 c;
    public final C20 d;
    public final C4037gq e;
    public C8194yY0 g;
    public C4219hn h;
    public C8194yY0 i;
    public List f = new ArrayList();
    public volatile List k = null;
    public C1562Tu0 m = new C1562Tu0(6, C0873Ky0.a(C0468Ft0.b()));
    public C1562Tu0 n = new C1562Tu0(6, C0873Ky0.a(C0468Ft0.b()));
    public int j = 1;
    public final C3759fN l = new C3759fN(19);

    public JD0(AbstractC3987gZ0 abstractC3987gZ0, C0368Em c0368Em, C1562Tu0 c1562Tu0, ExecutorC5715lY0 executorC5715lY0, C20 c20) {
        this.e = new C4037gq(c1562Tu0);
        this.a = abstractC3987gZ0;
        this.b = c0368Em;
        this.c = executorC5715lY0;
        this.d = c20;
        p++;
        AbstractC0759Jm0.f("ProcessingCaptureSession");
    }

    public static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1702Vp c1702Vp = (C1702Vp) it.next();
            Iterator it2 = c1702Vp.e.iterator();
            while (it2.hasNext()) {
                ((AbstractC6141nn) it2.next()).a(c1702Vp.a());
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final void a() {
        AbstractC0759Jm0.f("ProcessingCaptureSession");
        if (this.k != null) {
            for (C1702Vp c1702Vp : this.k) {
                Iterator it = c1702Vp.e.iterator();
                while (it.hasNext()) {
                    ((AbstractC6141nn) it.next()).a(c1702Vp.a());
                }
            }
            this.k = null;
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final void b(C8194yY0 c8194yY0) {
        AbstractC0759Jm0.f("ProcessingCaptureSession");
        this.g = c8194yY0;
        if (c8194yY0 == null) {
            return;
        }
        C4219hn c4219hn = this.h;
        if (c4219hn != null) {
            synchronized (c4219hn.a) {
                c4219hn.e = c8194yY0;
            }
        }
        if (this.j == 3) {
            C1562Tu0 c1562Tu0A = C2580cn.b(c8194yY0.g.b).a();
            this.m = c1562Tu0A;
            C1562Tu0 c1562Tu0 = this.n;
            C0468Ft0 c0468Ft0B = C0468Ft0.b();
            EnumC6931rw enumC6931rw = EnumC6931rw.d;
            for (C0572Hc c0572Hc : c1562Tu0A.u()) {
                c0468Ft0B.d(c0572Hc, enumC6931rw, c1562Tu0A.w(c0572Hc));
            }
            for (C0572Hc c0572Hc2 : c1562Tu0.u()) {
                c0468Ft0B.d(c0572Hc2, enumC6931rw, c1562Tu0.w(c0572Hc2));
            }
            this.a.i(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
            for (AbstractC4314iH abstractC4314iH : Collections.unmodifiableList(c8194yY0.g.a)) {
                if (Objects.equals(abstractC4314iH.j, C3349dD0.class) || Objects.equals(abstractC4314iH.j, C5438k51.class)) {
                    this.a.k(c8194yY0.g.g, this.l);
                    return;
                }
            }
            this.a.m();
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final void close() {
        AbstractC0759Jm0.f("ProcessingCaptureSession");
        if (this.j == 3) {
            AbstractC0759Jm0.f("ProcessingCaptureSession");
            this.a.f();
            C4219hn c4219hn = this.h;
            if (c4219hn != null) {
                synchronized (c4219hn.a) {
                    c4219hn.d = true;
                    c4219hn.b = null;
                    c4219hn.e = null;
                    c4219hn.c = null;
                }
            }
            this.j = 4;
        }
        this.e.close();
    }

    @Override // defpackage.InterfaceC4228hq
    public final InterfaceFutureC0750Jj0 d(C8194yY0 c8194yY0, CameraDevice cameraDevice, E71 e71) {
        int i = this.j;
        AbstractC3377dM1.d("Invalid state state:".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "DE_INITIALIZED" : "ON_CAPTURE_SESSION_ENDED" : "ON_CAPTURE_SESSION_STARTED" : "SESSION_INITIALIZED" : "UNINITIALIZED"), i == 1);
        AbstractC3377dM1.d("SessionConfig contains no surfaces", !c8194yY0.b().isEmpty());
        AbstractC0759Jm0.f("ProcessingCaptureSession");
        List listB = c8194yY0.b();
        this.f = listB;
        C20 c20 = this.d;
        ExecutorC5715lY0 executorC5715lY0 = this.c;
        QZ qzA = QZ.a(AbstractC7818wZ1.d(listB, executorC5715lY0, c20));
        C8329zG c8329zG = new C8329zG(this, c8194yY0, cameraDevice, e71, 1);
        qzA.getClass();
        return AbstractC1500Sz1.r(AbstractC1500Sz1.r(qzA, c8329zG, executorC5715lY0), new C0136Bm1(20, new C3921gD0(1, this)), executorC5715lY0);
    }

    @Override // defpackage.InterfaceC4228hq
    public final List e() {
        return this.k != null ? this.k : Collections.emptyList();
    }

    @Override // defpackage.InterfaceC4228hq
    public final void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        AbstractC0759Jm0.f("ProcessingCaptureSession");
        int iX = AbstractC8235ym.x(this.j);
        if (iX == 0 || iX == 1) {
            if (this.k == null) {
                this.k = list;
                return;
            } else {
                i(list);
                AbstractC0759Jm0.f("ProcessingCaptureSession");
                return;
            }
        }
        if (iX != 2) {
            if (iX == 3 || iX == 4) {
                AbstractC0759Jm0.f("ProcessingCaptureSession");
                i(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1702Vp c1702Vp = (C1702Vp) it.next();
            if (c1702Vp.c == 2) {
                C2580cn c2580cnB = C2580cn.b(c1702Vp.b);
                C0572Hc c0572Hc = C1702Vp.i;
                C0873Ky0 c0873Ky0 = c1702Vp.b;
                if (c0873Ky0.a.containsKey(c0572Hc)) {
                    CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
                    c2580cnB.b.e(C3456dn.L0(key), (Integer) c0873Ky0.w(c0572Hc));
                }
                C0572Hc c0572Hc2 = C1702Vp.j;
                if (c0873Ky0.a.containsKey(c0572Hc2)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
                    c2580cnB.b.e(C3456dn.L0(key2), Byte.valueOf(((Integer) c0873Ky0.w(c0572Hc2)).byteValue()));
                }
                C1562Tu0 c1562Tu0A = c2580cnB.a();
                this.n = c1562Tu0A;
                C1562Tu0 c1562Tu0 = this.m;
                C0468Ft0 c0468Ft0B = C0468Ft0.b();
                EnumC6931rw enumC6931rw = EnumC6931rw.d;
                for (C0572Hc c0572Hc3 : c1562Tu0.u()) {
                    c0468Ft0B.d(c0572Hc3, enumC6931rw, c1562Tu0.w(c0572Hc3));
                }
                for (C0572Hc c0572Hc4 : c1562Tu0A.u()) {
                    c0468Ft0B.d(c0572Hc4, enumC6931rw, c1562Tu0A.w(c0572Hc4));
                }
                this.a.i(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
                this.a.j(c1702Vp.d, c1702Vp.g, new VY(c1702Vp.a(), c1702Vp.e));
            } else {
                AbstractC0759Jm0.f("ProcessingCaptureSession");
                C1562Tu0 c1562Tu0A2 = C2580cn.b(c1702Vp.b).a();
                Iterator it2 = c1562Tu0A2.getConfig().u().iterator();
                while (it2.hasNext()) {
                    CaptureRequest.Key key3 = ((C0572Hc) it2.next()).c;
                    if (key3.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key3.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        this.a.l(c1562Tu0A2, c1702Vp.g, new VY(c1702Vp.a(), c1702Vp.e));
                        break;
                    }
                }
                i(Arrays.asList(c1702Vp));
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final C8194yY0 g() {
        return this.g;
    }

    @Override // defpackage.InterfaceC4228hq
    public final boolean h() {
        return this.e.h();
    }

    @Override // defpackage.InterfaceC4228hq
    public final InterfaceFutureC0750Jj0 release() {
        AbstractC0759Jm0.f("ProcessingCaptureSession");
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0Release = this.e.release();
        int iX = AbstractC8235ym.x(this.j);
        if (iX == 1 || iX == 3) {
            interfaceFutureC0750Jj0Release.d(new RunnableC1577Tz0(4, this), QR1.a());
        }
        this.j = 5;
        return interfaceFutureC0750Jj0Release;
    }

    @Override // defpackage.InterfaceC4228hq
    public final void c(HashMap map) {
    }
}
