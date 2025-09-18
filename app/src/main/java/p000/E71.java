package p000;

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

    /* renamed from: b */
    public final U41 f2480b;

    /* renamed from: c */
    public final Handler f2481c;

    /* renamed from: d */
    public final ExecutorC10151lY0 f2482d;

    /* renamed from: e */
    public final C20 f2483e;

    /* renamed from: f */
    public C4078fq f2484f;

    /* renamed from: g */
    public C8342Tu0 f2485g;

    /* renamed from: h */
    public C0489Hl f2486h;

    /* renamed from: i */
    public C0300El f2487i;

    /* renamed from: j */
    public C1043QZ f2488j;

    /* renamed from: o */
    public final C20 f2493o;

    /* renamed from: q */
    public ArrayList f2495q;

    /* renamed from: r */
    public C11834yj0 f2496r;

    /* renamed from: s */
    public final C6435ma f2497s;

    /* renamed from: t */
    public final C7391Bm1 f2498t;

    /* renamed from: u */
    public final C8004Nh0 f2499u;

    /* renamed from: v */
    public final C0328FC f2500v;

    /* renamed from: a */
    public final Object f2479a = new Object();

    /* renamed from: k */
    public List f2489k = null;

    /* renamed from: l */
    public boolean f2490l = false;

    /* renamed from: m */
    public boolean f2491m = false;

    /* renamed from: n */
    public boolean f2492n = false;

    /* renamed from: p */
    public final Object f2494p = new Object();

    /* renamed from: w */
    public final AtomicBoolean f2501w = new AtomicBoolean(false);

    public E71(C9196e41 c9196e41, C9196e41 c9196e412, U41 u41, ExecutorC10151lY0 executorC10151lY0, C20 c20, Handler handler) {
        this.f2480b = u41;
        this.f2481c = handler;
        this.f2482d = executorC10151lY0;
        this.f2483e = c20;
        C6435ma c6435ma = new C6435ma();
        c6435ma.f37776a = c9196e412.m17862x0(TextureViewIsClosedQuirk.class);
        c6435ma.f37777b = c9196e41.m17862x0(PreviewOrientationIncorrectQuirk.class);
        c6435ma.f37778c = c9196e41.m17862x0(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f2497s = c6435ma;
        this.f2499u = new C8004Nh0(c9196e41.m17862x0(CaptureSessionStuckQuirk.class) || c9196e41.m17862x0(IncorrectCaptureStateQuirk.class));
        this.f2498t = new C7391Bm1(c9196e412);
        this.f2500v = new C0328FC(c9196e412, 7);
        this.f2493o = c20;
    }

    /* renamed from: m */
    public static void m2035m() {
        AbstractC7806Jm0.m4412f("SyncCaptureSessionImpl");
    }

    @Override // p000.B71
    /* renamed from: a */
    public final void mo510a(E71 e71) {
        Objects.requireNonNull(this.f2484f);
        this.f2484f.mo510a(e71);
    }

    @Override // p000.B71
    /* renamed from: b */
    public final void mo511b(E71 e71) {
        Objects.requireNonNull(this.f2484f);
        this.f2484f.mo511b(e71);
    }

    @Override // p000.B71
    /* renamed from: c */
    public final void mo512c(E71 e71) {
        synchronized (this.f2494p) {
            this.f2497s.m22902c(this.f2495q);
        }
        m2035m();
        m2042p(e71);
    }

    @Override // p000.B71
    /* renamed from: d */
    public final void mo513d(E71 e71) {
        E71 e712;
        Objects.requireNonNull(this.f2484f);
        m2044r();
        this.f2499u.m5816c();
        U41 u41 = this.f2480b;
        Iterator it = u41.m7886u().iterator();
        while (it.hasNext() && (e712 = (E71) it.next()) != this) {
            e712.m2044r();
            e712.f2499u.m5816c();
        }
        synchronized (u41.f11644a) {
            ((LinkedHashSet) u41.f11648e).remove(this);
        }
        this.f2484f.mo513d(e71);
    }

    @Override // p000.B71
    /* renamed from: e */
    public final void mo514e(E71 e71) {
        E71 e712;
        E71 e713;
        E71 e714;
        m2035m();
        C7391Bm1 c7391Bm1 = this.f2498t;
        ArrayList arrayListM7885t = this.f2480b.m7885t();
        ArrayList arrayListM7884s = this.f2480b.m7884s();
        if (((CaptureSessionOnClosedNotCalledQuirk) c7391Bm1.f1022b) != null) {
            LinkedHashSet<E71> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayListM7885t.iterator();
            while (it.hasNext() && (e714 = (E71) it.next()) != e71) {
                linkedHashSet.add(e714);
            }
            for (E71 e715 : linkedHashSet) {
                e715.getClass();
                e715.mo513d(e715);
            }
        }
        Objects.requireNonNull(this.f2484f);
        U41 u41 = this.f2480b;
        synchronized (u41.f11644a) {
            ((LinkedHashSet) u41.f11646c).add(this);
            ((LinkedHashSet) u41.f11648e).remove(this);
        }
        Iterator it2 = u41.m7886u().iterator();
        while (it2.hasNext() && (e713 = (E71) it2.next()) != this) {
            e713.m2044r();
            e713.f2499u.m5816c();
        }
        this.f2484f.mo514e(e71);
        if (((CaptureSessionOnClosedNotCalledQuirk) c7391Bm1.f1022b) != null) {
            LinkedHashSet<E71> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayListM7884s.iterator();
            while (it3.hasNext() && (e712 = (E71) it3.next()) != e71) {
                linkedHashSet2.add(e712);
            }
            for (E71 e716 : linkedHashSet2) {
                e716.getClass();
                e716.mo512c(e716);
            }
        }
    }

    @Override // p000.B71
    /* renamed from: f */
    public final void mo515f(E71 e71) {
        Objects.requireNonNull(this.f2484f);
        this.f2484f.mo515f(e71);
    }

    @Override // p000.B71
    /* renamed from: g */
    public final void mo516g(E71 e71) {
        C0489Hl c0489Hl;
        synchronized (this.f2479a) {
            try {
                if (this.f2492n) {
                    c0489Hl = null;
                } else {
                    this.f2492n = true;
                    AbstractC9104dM1.m17549h(this.f2486h, "Need to call openCaptureSession before using this API.");
                    c0489Hl = this.f2486h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0489Hl != null) {
            c0489Hl.f4484b.mo2494d(new C71(this, e71, 1), QR1.m6703a());
        }
    }

    @Override // p000.B71
    /* renamed from: h */
    public final void mo517h(E71 e71, Surface surface) {
        Objects.requireNonNull(this.f2484f);
        this.f2484f.mo517h(e71, surface);
    }

    /* renamed from: i */
    public final void m2036i() throws CameraAccessException {
        AbstractC9104dM1.m17549h(this.f2485g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) ((ES1) this.f2485g.f11590b).f2708b).abortCaptures();
    }

    /* renamed from: j */
    public final int m2037j(ArrayList arrayList, C6447mm c6447mm) {
        CameraCaptureSession.CaptureCallback captureCallbackM5814a = this.f2499u.m5814a(c6447mm);
        AbstractC9104dM1.m17549h(this.f2485g, "Need to call openCaptureSession before using this API.");
        return ((ES1) this.f2485g.f11590b).mo1365n(arrayList, this.f2482d, captureCallbackM5814a);
    }

    /* renamed from: k */
    public final void m2038k() {
        if (!this.f2501w.compareAndSet(false, true)) {
            m2035m();
            return;
        }
        if (this.f2500v.f3086a) {
            try {
                m2035m();
                m2036i();
            } catch (Exception e) {
                e.toString();
                m2035m();
            }
        }
        m2035m();
        this.f2499u.m5815b().mo2494d(new D71(this, 1), this.f2482d);
    }

    /* renamed from: l */
    public final void m2039l(CameraCaptureSession cameraCaptureSession) {
        if (this.f2485g == null) {
            this.f2485g = new C8342Tu0(cameraCaptureSession, this.f2481c);
        }
    }

    /* renamed from: n */
    public final void m2040n(List list) {
        synchronized (this.f2479a) {
            m2044r();
            AbstractC11561wZ1.m25650c(list);
            this.f2489k = list;
        }
    }

    /* renamed from: o */
    public final boolean m2041o() {
        boolean z;
        synchronized (this.f2479a) {
            z = this.f2486h != null;
        }
        return z;
    }

    /* renamed from: p */
    public final void m2042p(E71 e71) {
        C0489Hl c0489Hl;
        synchronized (this.f2479a) {
            try {
                if (this.f2490l) {
                    c0489Hl = null;
                } else {
                    this.f2490l = true;
                    AbstractC9104dM1.m17549h(this.f2486h, "Need to call openCaptureSession before using this API.");
                    c0489Hl = this.f2486h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m2044r();
        this.f2499u.m5816c();
        if (c0489Hl != null) {
            c0489Hl.f4484b.mo2494d(new C71(this, e71, 0), QR1.m6703a());
        }
    }

    /* renamed from: q */
    public final InterfaceFutureC7800Jj0 m2043q(CameraDevice cameraDevice, DY0 dy0, List list) {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M7489l;
        synchronized (this.f2494p) {
            try {
                ArrayList arrayListM7884s = this.f2480b.m7884s();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListM7884s.iterator();
                while (it.hasNext()) {
                    E71 e71 = (E71) it.next();
                    arrayList.add(AbstractC11797yQ1.m26149b(new C0059Aw(e71.f2499u.m5815b(), e71.f2493o, 1500L, 3)));
                }
                C11834yj0 c11834yj0M7494q = AbstractC8301Sz1.m7494q(arrayList);
                this.f2496r = c11834yj0M7494q;
                C1043QZ c1043qzM6727a = C1043QZ.m6727a(c11834yj0M7494q);
                C7253zG c7253zG = new C7253zG(this, cameraDevice, dy0, list, 3);
                ExecutorC10151lY0 executorC10151lY0 = this.f2482d;
                c1043qzM6727a.getClass();
                interfaceFutureC7800Jj0M7489l = AbstractC8301Sz1.m7489l(AbstractC8301Sz1.m7495r(c1043qzM6727a, c7253zG, executorC10151lY0));
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceFutureC7800Jj0M7489l;
    }

    /* renamed from: r */
    public final void m2044r() {
        synchronized (this.f2479a) {
            try {
                List list = this.f2489k;
                if (list != null) {
                    AbstractC11561wZ1.m25649b(list);
                    this.f2489k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public final int m2045s(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackM5814a = this.f2499u.m5814a(captureCallback);
        AbstractC9104dM1.m17549h(this.f2485g, "Need to call openCaptureSession before using this API.");
        return ((ES1) this.f2485g.f11590b).mo1364J(captureRequest, this.f2482d, captureCallbackM5814a);
    }

    /* renamed from: t */
    public final InterfaceFutureC7800Jj0 m2046t(ArrayList arrayList) {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M2047u;
        synchronized (this.f2494p) {
            this.f2495q = arrayList;
            interfaceFutureC7800Jj0M2047u = m2047u(arrayList);
        }
        return interfaceFutureC7800Jj0M2047u;
    }

    /* renamed from: u */
    public final InterfaceFutureC7800Jj0 m2047u(ArrayList arrayList) {
        synchronized (this.f2479a) {
            try {
                if (this.f2491m) {
                    return new F70(1, new CancellationException("Opener is disabled"));
                }
                C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11561wZ1.m25651d(arrayList, this.f2482d, this.f2483e));
                H30 h30 = new H30(this, 14, arrayList);
                ExecutorC10151lY0 executorC10151lY0 = this.f2482d;
                c1043qzM6727a.getClass();
                RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c1043qzM6727a, h30, executorC10151lY0);
                this.f2488j = runnableC3953drM7495r;
                return AbstractC8301Sz1.m7489l(runnableC3953drM7495r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: v */
    public final boolean m2048v() {
        boolean zM2049w;
        synchronized (this.f2494p) {
            try {
                if (m2041o()) {
                    this.f2497s.m22902c(this.f2495q);
                } else {
                    C11834yj0 c11834yj0 = this.f2496r;
                    if (c11834yj0 != null) {
                        c11834yj0.cancel(true);
                    }
                }
                zM2049w = m2049w();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM2049w;
    }

    /* renamed from: w */
    public final boolean m2049w() {
        boolean z;
        try {
            synchronized (this.f2479a) {
                try {
                    if (!this.f2491m) {
                        C1043QZ c1043qz = this.f2488j;
                        c1043qz = c1043qz != null ? c1043qz : null;
                        this.f2491m = true;
                    }
                    z = !m2041o();
                } finally {
                }
            }
            return z;
        } finally {
            if (c1043qz != null) {
                c1043qz.cancel(true);
            }
        }
    }

    /* renamed from: x */
    public final void m2050x() throws CameraAccessException {
        AbstractC9104dM1.m17549h(this.f2485g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) ((ES1) this.f2485g.f11590b).f2708b).stopRepeating();
    }

    /* renamed from: y */
    public final C8342Tu0 m2051y() {
        this.f2485g.getClass();
        return this.f2485g;
    }
}
