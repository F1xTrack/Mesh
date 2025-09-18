package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.fragment.app.l;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.react.bridge.Promise;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.my.tracker.campaign.CampaignService;
import com.swmansion.worklets.AndroidUIScheduler;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.yandex.varioqub.config.impl.B;
import com.yandex.varioqub.config.impl.g;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class G4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        B9 b9 = (B9) this.b;
        synchronized (b9.a) {
            try {
                if (b9.m) {
                    return;
                }
                long j = b9.l - 1;
                b9.l = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    b9.b(new IllegalStateException());
                } else {
                    b9.a();
                }
            } finally {
            }
        }
    }

    private final void b() {
        C4037gq c4037gq = (C4037gq) this.b;
        synchronized (c4037gq.a) {
            if (c4037gq.b.isEmpty()) {
                return;
            }
            try {
                c4037gq.n(c4037gq.b);
            } finally {
                c4037gq.b.clear();
            }
        }
    }

    private final void c() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
        O90.f(constraintTrackingWorker, "this$0");
        if (constraintTrackingWorker.d.a instanceof S) {
            return;
        }
        String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        O90.e(TE.G(), "get()");
        if (strB == null || strB.length() == 0) {
            int i = AbstractC3298cy.a;
            C8007xZ0 c8007xZ0 = constraintTrackingWorker.d;
            O90.e(c8007xZ0, "future");
            c8007xZ0.j(new C0828Kj0());
            return;
        }
        AbstractC1139Oj0 abstractC1139Oj0A = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.a);
        constraintTrackingWorker.e = abstractC1139Oj0A;
        if (abstractC1139Oj0A == null) {
            int i2 = AbstractC3298cy.a;
            C8007xZ0 c8007xZ02 = constraintTrackingWorker.d;
            O90.e(c8007xZ02, "future");
            c8007xZ02.j(new C0828Kj0());
            return;
        }
        C0844Ko1 c0844Ko1D = C0844Ko1.d(constraintTrackingWorker.getApplicationContext());
        C1701Vo1 c1701Vo1U = c0844Ko1D.c.u();
        String string = constraintTrackingWorker.getId().toString();
        O90.e(string, "id.toString()");
        C1623Uo1 c1623Uo1L = c1701Vo1U.l(string);
        if (c1623Uo1L == null) {
            C8007xZ0 c8007xZ03 = constraintTrackingWorker.d;
            O90.e(c8007xZ03, "future");
            int i3 = AbstractC3298cy.a;
            c8007xZ03.j(new C0828Kj0());
            return;
        }
        T71 t71 = c0844Ko1D.j;
        O90.e(t71, "workManagerImpl.trackers");
        C5772lr0 c5772lr0 = new C5772lr0(t71, constraintTrackingWorker);
        c5772lr0.Z(AbstractC8259yu.e(c1623Uo1L));
        String string2 = constraintTrackingWorker.getId().toString();
        O90.e(string2, "id.toString()");
        if (!c5772lr0.B(string2)) {
            int i4 = AbstractC3298cy.a;
            C8007xZ0 c8007xZ04 = constraintTrackingWorker.d;
            O90.e(c8007xZ04, "future");
            c8007xZ04.j(new C0906Lj0());
            return;
        }
        int i5 = AbstractC3298cy.a;
        try {
            AbstractC1139Oj0 abstractC1139Oj0 = constraintTrackingWorker.e;
            O90.c(abstractC1139Oj0);
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0StartWork = abstractC1139Oj0.startWork();
            O90.e(interfaceFutureC0750Jj0StartWork, "delegate!!.startWork()");
            interfaceFutureC0750Jj0StartWork.d(new RunnableC6769r4(constraintTrackingWorker, 29, interfaceFutureC0750Jj0StartWork), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable unused) {
            int i6 = AbstractC3298cy.a;
            synchronized (constraintTrackingWorker.b) {
                try {
                    if (constraintTrackingWorker.c) {
                        C8007xZ0 c8007xZ05 = constraintTrackingWorker.d;
                        O90.e(c8007xZ05, "future");
                        c8007xZ05.j(new C0906Lj0());
                    } else {
                        C8007xZ0 c8007xZ06 = constraintTrackingWorker.d;
                        O90.e(c8007xZ06, "future");
                        c8007xZ06.j(new C0828Kj0());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUIScheduler androidUIScheduler = (AndroidUIScheduler) this.b;
                synchronized (androidUIScheduler.b) {
                    try {
                        if (androidUIScheduler.b.get()) {
                            androidUIScheduler.triggerUI();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                C0644Ia c0644Ia = (C0644Ia) this.b;
                int iX = AbstractC8235ym.x(c0644Ia.g);
                if (iX != 1) {
                    if (iX != 2) {
                        return;
                    }
                    AbstractC0759Jm0.f("AudioSource");
                    return;
                } else {
                    AbstractC0759Jm0.f("AudioSource");
                    c0644Ia.g = 1;
                    c0644Ia.e();
                    return;
                }
            case 3:
                ((C0999Mo1) this.b).getClass();
                return;
            case 4:
                B.a((g) this.b);
                return;
            case 5:
                B.a((B) this.b);
                return;
            case 6:
                ((BackgroundDownloadInitializer) this.b).setListener(null);
                return;
            case 7:
                C1288Qh c1288Qh = (C1288Qh) this.b;
                try {
                    C1304Qm0 c1304Qm0 = new C1304Qm0((l) c1288Qh.c, (ExecutorService) c1288Qh.h, new C2354bb(1, c1288Qh));
                    C0743Jh c0743Jh = new C0743Jh();
                    c0743Jh.c = c1288Qh.a;
                    boolean z = c1288Qh.b;
                    c0743Jh.a = z ? 32783 : 15;
                    if (!z) {
                        c0743Jh.f = (String) c1288Qh.f;
                    }
                    String str = (String) c1288Qh.d;
                    if (str != null && str.length() != 0) {
                        c0743Jh.d = str;
                    }
                    String str2 = (String) c1288Qh.e;
                    if (str2 != null && str2.length() != 0) {
                        c0743Jh.e = str2;
                    }
                    c1304Qm0.u(c0743Jh.b(), null);
                    return;
                } catch (Throwable th) {
                    ((Promise) ((QQ0) c1288Qh.g).a).reject(th);
                    return;
                }
            case 8:
                C4025gm c4025gm = (C4025gm) this.b;
                C0365El c0365El = (C0365El) c4025gm.g;
                if (c0365El != null) {
                    c0365El.b(null);
                    c4025gm.g = null;
                    return;
                }
                return;
            case 9:
                C0212Cm c0212Cm = (C0212Cm) this.b;
                c0212Cm.x = false;
                c0212Cm.w = false;
                c0212Cm.u("OpenCameraConfigAndClose is done, state: ".concat(AbstractC8235ym.z(c0212Cm.L)));
                int iX2 = AbstractC8235ym.x(c0212Cm.L);
                if (iX2 == 1 || iX2 == 4) {
                    AbstractC3377dM1.i(c0212Cm.p.isEmpty(), null);
                    c0212Cm.v();
                    return;
                } else {
                    if (iX2 != 6) {
                        c0212Cm.u("OpenCameraConfigAndClose finished while in state: ".concat(AbstractC8235ym.z(c0212Cm.L)));
                        return;
                    }
                    int i = c0212Cm.k;
                    if (i == 0) {
                        c0212Cm.K(false);
                        return;
                    } else {
                        c0212Cm.u("OpenCameraConfigAndClose in error: ".concat(C0212Cm.w(i)));
                        c0212Cm.h.b();
                        return;
                    }
                }
            case 10:
                ((CameraDevice) this.b).close();
                return;
            case 11:
                RunnableC0056Am runnableC0056Am = (RunnableC0056Am) this.b;
                if (runnableC0056Am.b) {
                    return;
                }
                AbstractC3377dM1.i(((C0134Bm) runnableC0056Am.d).f.L == 7 || ((C0134Bm) runnableC0056Am.d).f.L == 6, null);
                if (((C0134Bm) runnableC0056Am.d).c()) {
                    ((C0134Bm) runnableC0056Am.d).f.J(true);
                    return;
                } else {
                    ((C0134Bm) runnableC0056Am.d).f.K(true);
                    return;
                }
            case 12:
                ((C1303Qm) this.b).i.c();
                return;
            case 13:
                ((InterfaceC7158t60) this.b).clear();
                return;
            case 14:
                ((C7861wo) this.b).b.onCameraAccessPrioritiesChanged();
                return;
            case 15:
                C7855wm c7855wm = (C7855wm) this.b;
                if (c7855wm.c.L == 4) {
                    c7855wm.c.K(false);
                    return;
                }
                return;
            case 16:
                C3866fw1 c3866fw1 = (C3866fw1) this.b;
                if (((C0212Cm) c3866fw1.b).L == 9) {
                    ((C0212Cm) c3866fw1.b).C();
                    return;
                }
                return;
            case 17:
                ((CampaignService) this.b).stopSelf();
                return;
            case 18:
                OD0 od0 = (OD0) ((C0593Hj) ((C2014Zp) this.b).b).b;
                if (od0 != null) {
                    od0.h.b();
                    return;
                }
                return;
            case 19:
                b();
                return;
            case 20:
                for (E71 e71 : (LinkedHashSet) this.b) {
                    e71.getClass();
                    e71.c(e71);
                }
                return;
            case 21:
                ((CarouselLayoutManager) this.b).o0();
                return;
            case 22:
                ((C1867Xs) this.b).t(true);
                return;
            case 23:
                ViewTreeObserverOnDrawListenerC0317Dv viewTreeObserverOnDrawListenerC0317Dv = (ViewTreeObserverOnDrawListenerC0317Dv) this.b;
                O90.f(viewTreeObserverOnDrawListenerC0317Dv, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0317Dv.b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0317Dv.b = null;
                    return;
                }
                return;
            case 24:
                DialogC0785Jv.a((DialogC0785Jv) this.b);
                return;
            case 25:
                C4055gw c4055gw = (C4055gw) this.b;
                int i2 = c4055gw.k - 1;
                c4055gw.k = i2;
                if (i2 > 0) {
                    return;
                }
                if (i2 < 0) {
                    throw new IllegalStateException(String.valueOf(c4055gw.k));
                }
                c4055gw.c.a();
                return;
            case 26:
                c();
                return;
            case 27:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.b;
                O90.f(coroutineWorker, "this$0");
                if (coroutineWorker.b.a instanceof S) {
                    coroutineWorker.a.l(null);
                    return;
                }
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((C3923gE) this.b).i();
                return;
            default:
                C8323zE c8323zE = (C8323zE) this.b;
                Y3 y3J = c8323zE.J();
                c8323zE.Q(y3J, 1028, new C6799rE(y3J, 4));
                c8323zE.f.d();
                return;
        }
    }

    public /* synthetic */ G4(C0999Mo1 c0999Mo1, boolean z) {
        this.a = 3;
        this.b = c0999Mo1;
    }
}
