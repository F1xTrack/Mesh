package p000;

import android.hardware.camera2.CameraDevice;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.react.bridge.Promise;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.p018my.tracker.campaign.CampaignService;
import com.swmansion.worklets.AndroidUIScheduler;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.yandex.varioqub.config.impl.C3858B;
import com.yandex.varioqub.config.impl.C3867g;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;

/* renamed from: G4 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0383G4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3561a;

    /* renamed from: b */
    public final /* synthetic */ Object f3562b;

    public /* synthetic */ RunnableC0383G4(int i, Object obj) {
        this.f3561a = i;
        this.f3562b = obj;
    }

    /* renamed from: a */
    private final void m2917a() {
        C0073B9 c0073b9 = (C0073B9) this.f3562b;
        synchronized (c0073b9.f590a) {
            try {
                if (c0073b9.f602m) {
                    return;
                }
                long j = c0073b9.f601l - 1;
                c0073b9.f601l = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    c0073b9.m530b(new IllegalStateException());
                } else {
                    c0073b9.m529a();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    private final void m2918b() {
        C4141gq c4141gq = (C4141gq) this.f3562b;
        synchronized (c4141gq.f28040a) {
            if (c4141gq.f28041b.isEmpty()) {
                return;
            }
            try {
                c4141gq.m18659n(c4141gq.f28041b);
            } finally {
                c4141gq.f28041b.clear();
            }
        }
    }

    /* renamed from: c */
    private final void m2919c() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f3562b;
        O90.m5968f(constraintTrackingWorker, "this$0");
        if (constraintTrackingWorker.f16598d.f37381a instanceof C1132S) {
            return;
        }
        String strM26328b = constraintTrackingWorker.getInputData().m26328b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        O90.m5967e(C1210TE.m7634G(), "get()");
        if (strM26328b == null || strM26328b.length() == 0) {
            int i = AbstractC3898cy.f25730a;
            C11687xZ0 c11687xZ0 = constraintTrackingWorker.f16598d;
            O90.m5967e(c11687xZ0, "future");
            c11687xZ0.m25921j(new C7852Kj0());
            return;
        }
        AbstractC8060Oj0 abstractC8060Oj0M17421a = constraintTrackingWorker.getWorkerFactory().m17421a(constraintTrackingWorker.getApplicationContext(), strM26328b, constraintTrackingWorker.f16595a);
        constraintTrackingWorker.f16599e = abstractC8060Oj0M17421a;
        if (abstractC8060Oj0M17421a == null) {
            int i2 = AbstractC3898cy.f25730a;
            C11687xZ0 c11687xZ02 = constraintTrackingWorker.f16598d;
            O90.m5967e(c11687xZ02, "future");
            c11687xZ02.m25921j(new C7852Kj0());
            return;
        }
        C7863Ko1 c7863Ko1M4736d = C7863Ko1.m4736d(constraintTrackingWorker.getApplicationContext());
        C8435Vo1 c8435Vo1Mo10328u = c7863Ko1M4736d.f6316c.mo10328u();
        String string = constraintTrackingWorker.getId().toString();
        O90.m5967e(string, "id.toString()");
        C8383Uo1 c8383Uo1M8569l = c8435Vo1Mo10328u.m8569l(string);
        if (c8383Uo1M8569l == null) {
            C11687xZ0 c11687xZ03 = constraintTrackingWorker.f16598d;
            O90.m5967e(c11687xZ03, "future");
            int i3 = AbstractC3898cy.f25730a;
            c11687xZ03.m25921j(new C7852Kj0());
            return;
        }
        T71 t71 = c7863Ko1M4736d.f6323j;
        O90.m5967e(t71, "workManagerImpl.trackers");
        C10189lr0 c10189lr0 = new C10189lr0(t71, constraintTrackingWorker);
        c10189lr0.m22567Z(AbstractC7230yu.m26274e(c8383Uo1M8569l));
        String string2 = constraintTrackingWorker.getId().toString();
        O90.m5967e(string2, "id.toString()");
        if (!c10189lr0.m22545B(string2)) {
            int i4 = AbstractC3898cy.f25730a;
            C11687xZ0 c11687xZ04 = constraintTrackingWorker.f16598d;
            O90.m5967e(c11687xZ04, "future");
            c11687xZ04.m25921j(new C7904Lj0());
            return;
        }
        int i5 = AbstractC3898cy.f25730a;
        try {
            AbstractC8060Oj0 abstractC8060Oj0 = constraintTrackingWorker.f16599e;
            O90.m5965c(abstractC8060Oj0);
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0StartWork = abstractC8060Oj0.startWork();
            O90.m5967e(interfaceFutureC7800Jj0StartWork, "delegate!!.startWork()");
            interfaceFutureC7800Jj0StartWork.mo2494d(new RunnableC6720r4(constraintTrackingWorker, 29, interfaceFutureC7800Jj0StartWork), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable unused) {
            int i6 = AbstractC3898cy.f25730a;
            synchronized (constraintTrackingWorker.f16596b) {
                try {
                    if (constraintTrackingWorker.f16597c) {
                        C11687xZ0 c11687xZ05 = constraintTrackingWorker.f16598d;
                        O90.m5967e(c11687xZ05, "future");
                        c11687xZ05.m25921j(new C7904Lj0());
                    } else {
                        C11687xZ0 c11687xZ06 = constraintTrackingWorker.f16598d;
                        O90.m5967e(c11687xZ06, "future");
                        c11687xZ06.m25921j(new C7852Kj0());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3561a) {
            case 0:
                AndroidUIScheduler androidUIScheduler = (AndroidUIScheduler) this.f3562b;
                synchronized (androidUIScheduler.f20264b) {
                    try {
                        if (androidUIScheduler.f20264b.get()) {
                            androidUIScheduler.triggerUI();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                m2917a();
                return;
            case 2:
                C0541Ia c0541Ia = (C0541Ia) this.f3562b;
                int iM26247x = AbstractC7222ym.m26247x(c0541Ia.f4999g);
                if (iM26247x != 1) {
                    if (iM26247x != 2) {
                        return;
                    }
                    AbstractC7806Jm0.m4412f("AudioSource");
                    return;
                } else {
                    AbstractC7806Jm0.m4412f("AudioSource");
                    c0541Ia.f4999g = 1;
                    c0541Ia.m3942e();
                    return;
                }
            case 3:
                ((C7967Mo1) this.f3562b).getClass();
                return;
            case 4:
                C3858B.m17387a((C3867g) this.f3562b);
                return;
            case 5:
                C3858B.m17383a((C3858B) this.f3562b);
                return;
            case 6:
                ((BackgroundDownloadInitializer) this.f3562b).setListener(null);
                return;
            case 7:
                C1051Qh c1051Qh = (C1051Qh) this.f3562b;
                try {
                    C8170Qm0 c8170Qm0 = new C8170Qm0((AbstractActivityC1730l) c1051Qh.f9732c, (ExecutorService) c1051Qh.f9737h, new C1795bb(1, c1051Qh));
                    C0611Jh c0611Jh = new C0611Jh();
                    c0611Jh.f5669c = c1051Qh.f9730a;
                    boolean z = c1051Qh.f9731b;
                    c0611Jh.f5667a = z ? 32783 : 15;
                    if (!z) {
                        c0611Jh.f5672f = (String) c1051Qh.f9735f;
                    }
                    String str = (String) c1051Qh.f9733d;
                    if (str != null && str.length() != 0) {
                        c0611Jh.f5670d = str;
                    }
                    String str2 = (String) c1051Qh.f9734e;
                    if (str2 != null && str2.length() != 0) {
                        c0611Jh.f5671e = str2;
                    }
                    c8170Qm0.m6778u(c0611Jh.m4386b(), null);
                    return;
                } catch (Throwable th) {
                    ((Promise) ((QQ0) c1051Qh.f9736g).f9619a).reject(th);
                    return;
                }
            case 8:
                C4137gm c4137gm = (C4137gm) this.f3562b;
                C0300El c0300El = (C0300El) c4137gm.f27985g;
                if (c0300El != null) {
                    c0300El.m2375b(null);
                    c4137gm.f27985g = null;
                    return;
                }
                return;
            case 9:
                C0175Cm c0175Cm = (C0175Cm) this.f3562b;
                c0175Cm.f1645x = false;
                c0175Cm.f1644w = false;
                c0175Cm.m1347u("OpenCameraConfigAndClose is done, state: ".concat(AbstractC7222ym.m26249z(c0175Cm.f1621L)));
                int iM26247x2 = AbstractC7222ym.m26247x(c0175Cm.f1621L);
                if (iM26247x2 == 1 || iM26247x2 == 4) {
                    AbstractC9104dM1.m17550i(c0175Cm.f1637p.isEmpty(), null);
                    c0175Cm.m1348v();
                    return;
                } else {
                    if (iM26247x2 != 6) {
                        c0175Cm.m1347u("OpenCameraConfigAndClose finished while in state: ".concat(AbstractC7222ym.m26249z(c0175Cm.f1621L)));
                        return;
                    }
                    int i = c0175Cm.f1632k;
                    if (i == 0) {
                        c0175Cm.m1324K(false);
                        return;
                    } else {
                        c0175Cm.m1347u("OpenCameraConfigAndClose in error: ".concat(C0175Cm.m1311w(i)));
                        c0175Cm.f1629h.m856b();
                        return;
                    }
                }
            case 10:
                ((CameraDevice) this.f3562b).close();
                return;
            case 11:
                RunnableC0049Am runnableC0049Am = (RunnableC0049Am) this.f3562b;
                if (runnableC0049Am.f358b) {
                    return;
                }
                AbstractC9104dM1.m17550i(((C0112Bm) runnableC0049Am.f360d).f1017f.f1621L == 7 || ((C0112Bm) runnableC0049Am.f360d).f1017f.f1621L == 6, null);
                if (((C0112Bm) runnableC0049Am.f360d).m857c()) {
                    ((C0112Bm) runnableC0049Am.f360d).f1017f.m1323J(true);
                    return;
                } else {
                    ((C0112Bm) runnableC0049Am.f360d).f1017f.m1324K(true);
                    return;
                }
            case 12:
                ((C1056Qm) this.f3562b).f9777i.mo4406c();
                return;
            case 13:
                ((InterfaceC11119t60) this.f3562b).clear();
                return;
            case 14:
                ((C7098wo) this.f3562b).f45109b.onCameraAccessPrioritiesChanged();
                return;
            case 15:
                C7096wm c7096wm = (C7096wm) this.f3562b;
                if (c7096wm.f45082c.f1621L == 4) {
                    c7096wm.f45082c.m1324K(false);
                    return;
                }
                return;
            case 16:
                C9432fw1 c9432fw1 = (C9432fw1) this.f3562b;
                if (((C0175Cm) c9432fw1.f27505b).f1621L == 9) {
                    ((C0175Cm) c9432fw1.f27505b).m1316C();
                    return;
                }
                return;
            case 17:
                ((CampaignService) this.f3562b).stopSelf();
                return;
            case 18:
                OD0 od0 = (OD0) ((C0487Hj) ((C1625Zp) this.f3562b).f15140b).f4445b;
                if (od0 != null) {
                    od0.f8311h.m8761b();
                    return;
                }
                return;
            case 19:
                m2918b();
                return;
            case 20:
                for (E71 e71 : (LinkedHashSet) this.f3562b) {
                    e71.getClass();
                    e71.mo512c(e71);
                }
                return;
            case 21:
                ((CarouselLayoutManager) this.f3562b).m26421o0();
                return;
            case 22:
                ((C1502Xs) this.f3562b).m9175t(true);
                return;
            case 23:
                ViewTreeObserverOnDrawListenerC0247Dv viewTreeObserverOnDrawListenerC0247Dv = (ViewTreeObserverOnDrawListenerC0247Dv) this.f3562b;
                O90.m5968f(viewTreeObserverOnDrawListenerC0247Dv, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0247Dv.f2296b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0247Dv.f2296b = null;
                    return;
                }
                return;
            case 24:
                DialogC0625Jv.m4466a((DialogC0625Jv) this.f3562b);
                return;
            case 25:
                C4147gw c4147gw = (C4147gw) this.f3562b;
                int i2 = c4147gw.f28102k - 1;
                c4147gw.f28102k = i2;
                if (i2 > 0) {
                    return;
                }
                if (i2 < 0) {
                    throw new IllegalStateException(String.valueOf(c4147gw.f28102k));
                }
                c4147gw.f28094c.m2370a();
                return;
            case 26:
                m2919c();
                return;
            case 27:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f3562b;
                O90.m5968f(coroutineWorker, "this$0");
                if (coroutineWorker.f16564b.f37381a instanceof C1132S) {
                    coroutineWorker.f16563a.m10810l(null);
                    return;
                }
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((C4103gE) this.f3562b).mo18409i();
                return;
            default:
                C7251zE c7251zE = (C7251zE) this.f3562b;
                C1514Y3 c1514y3M26329J = c7251zE.m26329J();
                c7251zE.m26334Q(c1514y3M26329J, 1028, new C6730rE(c1514y3M26329J, 4));
                c7251zE.f46736f.m8132d();
                return;
        }
    }

    public /* synthetic */ RunnableC0383G4(C7967Mo1 c7967Mo1, boolean z) {
        this.f3561a = 3;
        this.f3562b = c7967Mo1;
    }
}
