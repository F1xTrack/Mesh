package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import android.view.Surface;
import android.view.View;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.fragment.app.f;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.util.BiConsumer;
import com.my.tracker.campaign.CampaignService;
import com.my.tracker.obfuscated.d;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.impl.B0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tracer.crash.report.CrashDescription;
import ru.ok.tracer.crash.report.CrashLoggerInternal;
import ru.ok.tracer.crash.report.LogEntry;
import ru.ok.tracer.crash.report.LogStorage;

/* renamed from: Ts1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1557Ts1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC1557Ts1(InterfaceC3571eO interfaceC3571eO, int i, String str, Throwable th) {
        this.a = 20;
        this.b = interfaceC3571eO;
        this.c = str;
        this.d = th;
    }

    private final void a() {
        ((d) this.b).a((ProductInfoReq) this.c, (ArrayList) this.d);
    }

    private final void b() {
        ((d) this.b).a((ProductInfoResult) this.c, (List) this.d);
    }

    /* JADX WARN: Type inference failed for: r3v29, types: [PL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        long jM;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                CC0 cc0 = (CC0) this.b;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                XQ xq = ((UQ) cc0.c).a;
                xq.getClass();
                C8323zE c8323zE = xq.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1009, new C7181tE(y3P, (C6666qX) this.c, (C2285bE) this.d, 1));
                return;
            case 3:
                C0644Ia c0644Ia = (C0644Ia) this.b;
                int iX = AbstractC8235ym.x(c0644Ia.g);
                if (iX == 0) {
                    c0644Ia.j = (ExecutorC5715lY0) this.c;
                    c0644Ia.k = (C0999Mo1) this.d;
                    return;
                } else {
                    if (iX == 1 || iX == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 4:
                B.a((B) this.b, (String) this.c, (String) this.d);
                return;
            case 5:
                B0.a((B0) this.b, (PluginErrorDetails) this.c, (String) this.d);
                return;
            case 6:
                C1033Na c1033Na = ((C8036xj) this.b).g;
                C1016Mu0 c1016Mu0 = (C1016Mu0) this.c;
                ExecutorC5715lY0 executorC5715lY0 = (ExecutorC5715lY0) this.d;
                AbstractC3377dM1.i(!c1033Na.d.get(), "AudioStream can not be started when setCallback.");
                c1033Na.a();
                c1033Na.h = c1016Mu0;
                c1033Na.i = executorC5715lY0;
                if (Build.VERSION.SDK_INT >= 29) {
                    C0955Ma c0955Ma = c1033Na.k;
                    if (c0955Ma != null) {
                        U5.d(c1033Na.a, c0955Ma);
                    }
                    if (c1033Na.k == null) {
                        c1033Na.k = new C0955Ma(c1033Na);
                    }
                    U5.c(c1033Na.a, executorC5715lY0, c1033Na.k);
                    return;
                }
                return;
            case 7:
                EncodedImage encodedImage = (EncodedImage) this.d;
                C0593Hj c0593Hj = (C0593Hj) this.b;
                O90.f(c0593Hj, "this$0");
                C3513e41 c3513e41 = (C3513e41) c0593Hj.h;
                O01 o01 = (O01) this.c;
                O90.f(o01, "$key");
                try {
                    c0593Hj.n(o01, encodedImage);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        O90.c(encodedImage);
                        c3513e41.R0(o01, encodedImage);
                        EncodedImage.closeSafely(encodedImage);
                    }
                }
            case 8:
                C5756lm c5756lm = ((C6329om) this.b).x;
                HashSet hashSet = (HashSet) c5756lm.b;
                AbstractC6141nn abstractC6141nn = (AbstractC6141nn) this.d;
                hashSet.add(abstractC6141nn);
                ((ArrayMap) c5756lm.c).put(abstractC6141nn, (Executor) this.c);
                return;
            case 9:
                C1771Wm c1771Wm = (C1771Wm) this.b;
                c1771Wm.getClass();
                AbstractC0759Jm0.f("Camera2CapturePipeline");
                c1771Wm.d.a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (C1693Vm) ((AtomicReference) this.c).get());
                ((C0365El) this.d).b(null);
                return;
            case 10:
                ((C0137Bn) this.b).a.onSurfacePrepared((CameraCaptureSession) this.c, (Surface) this.d);
                return;
            case 11:
                ((CampaignService) this.b).a((String) this.c, (G4) this.d);
                return;
            case 12:
                ((BiConsumer) this.b).accept((String) this.c, (C8265yw) this.d);
                return;
            case 13:
                CrashLoggerInternal.reportCrash$lambda$0((CrashLoggerInternal) this.b, (CrashDescription) this.c, (CountDownLatch) this.d);
                return;
            case 14:
                String str = (String) this.c;
                String str2 = (String) this.d;
                C5833mA c5833mA = ((C6597qA) this.b).h;
                c5833mA.getClass();
                try {
                    ((VG) ((C5534kb1) c5833mA.d).d).m(str, str2);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = (Context) c5833mA.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    return;
                }
            case 15:
                C5833mA c5833mA2 = ((C6597qA) this.b).h;
                Thread threadCurrentThread = Thread.currentThread();
                c5833mA2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                YA ya = (YA) c5833mA2.n;
                if (ya == null || !ya.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = c5833mA2.e();
                    if (strE == null) {
                        return;
                    }
                    MP mp = new MP(strE, (Map) this.d, j);
                    C1252Pv c1252Pv = (C1252Pv) c5833mA2.m;
                    c1252Pv.getClass();
                    c1252Pv.w((Throwable) this.c, threadCurrentThread, "error", mp, false);
                    return;
                }
                return;
            case 16:
                f fVar = (f) this.b;
                O90.f(fVar, "this$0");
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.d;
                O90.f(dVar, "$animationInfo");
                fVar.a.endViewTransition((View) this.c);
                dVar.a();
                return;
            case 17:
                if (((JG) this.b).j) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.d).run();
                    return;
                }
            case 18:
                OL ol = (OL) this.b;
                this.c.c(ol.a, ol.b, (Exception) this.d);
                return;
            case 19:
                if (((C5869mM) this.b).f) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.d).run();
                    return;
                }
            case 20:
                ((InterfaceC3571eO) this.b).q(new UN((String) this.c, (Throwable) this.d));
                return;
            case 21:
                C7020sO c7020sO = (C7020sO) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.c;
                if (c7020sO.D != 8) {
                    if (!arrayList.isEmpty()) {
                        AbstractC0759Jm0.f(c7020sO.a);
                    }
                    if ((c7020sO.f instanceof C6829rO) && !c7020sO.A && AbstractC7387uJ.a.z0(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        c7020sO.e.flush();
                        c7020sO.z = true;
                    } else {
                        c7020sO.e.stop();
                    }
                }
                runnable.run();
                int i2 = c7020sO.D;
                if (i2 == 7) {
                    c7020sO.f();
                    return;
                }
                if (!c7020sO.z) {
                    c7020sO.h();
                }
                c7020sO.i(1);
                if (i2 == 5 || i2 == 6) {
                    c7020sO.k();
                    if (i2 == 6) {
                        c7020sO.e();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                C6257oO c6257oO = (C6257oO) this.b;
                LinkedHashMap linkedHashMap = c6257oO.a;
                InterfaceC3296cx0 interfaceC3296cx0 = (InterfaceC3296cx0) this.c;
                interfaceC3296cx0.getClass();
                Executor executor = (Executor) this.d;
                executor.getClass();
                linkedHashMap.put(interfaceC3296cx0, executor);
                executor.execute(new RunnableC3529eA(interfaceC3296cx0, 23, c6257oO.b));
                return;
            case 23:
                Executor executor2 = (Executor) this.c;
                InterfaceC3571eO interfaceC3571eO = (InterfaceC3571eO) this.d;
                C7020sO c7020sO2 = ((C6639qO) this.b).l;
                if (c7020sO2.D == 8) {
                    return;
                }
                try {
                    Objects.requireNonNull(interfaceC3571eO);
                    executor2.execute(new RunnableC6448pO(interfaceC3571eO, 1));
                    return;
                } catch (RejectedExecutionException unused) {
                    AbstractC0759Jm0.f(c7020sO2.a);
                    return;
                }
            case 24:
                Intent intent = (Intent) this.c;
                S81 s81 = (S81) this.d;
                KO ko = (KO) this.b;
                ko.getClass();
                try {
                    ko.b(intent);
                    return;
                } finally {
                    s81.b(null);
                }
            case 25:
                GW gw = (GW) this.b;
                C0365El c0365El = (C0365El) this.c;
                PT pt = (PT) this.d;
                if (!gw.d) {
                    c0365El.d(new C1774Wn("Camera is not active."));
                    return;
                }
                Rect rectK = ((InterfaceC1470Sp1) gw.a.h.g).k();
                if (gw.e != null) {
                    rational = gw.e;
                } else {
                    Rect rectK2 = ((InterfaceC1470Sp1) gw.a.h.g).k();
                    rational = new Rational(rectK2.width(), rectK2.height());
                }
                List list = (List) pt.c;
                Integer num = (Integer) gw.a.d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List listD = gw.d(list, num == null ? 0 : num.intValue(), rational, rectK, 1);
                List list2 = (List) pt.d;
                Integer num2 = (Integer) gw.a.d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List listD2 = gw.d(list2, num2 == null ? 0 : num2.intValue(), rational, rectK, 2);
                List list3 = (List) pt.e;
                Integer num3 = (Integer) gw.a.d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                List listD3 = gw.d(list3, num3 == null ? 0 : num3.intValue(), rational, rectK, 4);
                if (listD.isEmpty() && listD2.isEmpty() && listD3.isEmpty()) {
                    c0365El.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    return;
                }
                gw.a.j(gw.o);
                C0365El c0365El2 = gw.s;
                if (c0365El2 != null) {
                    c0365El2.d(new C1774Wn("Cancelled by another startFocusAndMetering()"));
                    gw.s = null;
                }
                gw.a.j(null);
                ScheduledFuture scheduledFuture = gw.i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    gw.i = null;
                }
                gw.s = c0365El;
                MeteringRectangle[] meteringRectangleArr = GW.v;
                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listD.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listD2.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listD3.toArray(meteringRectangleArr);
                FW fw = gw.o;
                C6329om c6329om = gw.a;
                c6329om.j(fw);
                ScheduledFuture scheduledFuture2 = gw.i;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    gw.i = null;
                }
                ScheduledFuture scheduledFuture3 = gw.j;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(true);
                    gw.j = null;
                }
                gw.p = meteringRectangleArr2;
                gw.q = meteringRectangleArr3;
                gw.r = meteringRectangleArr4;
                if (meteringRectangleArr2.length > 0) {
                    gw.g = true;
                    gw.l = false;
                    gw.m = false;
                    jM = c6329om.m();
                    gw.g(true);
                } else {
                    gw.g = false;
                    gw.l = true;
                    gw.m = false;
                    jM = c6329om.m();
                }
                gw.h = 0;
                FW fw2 = new InterfaceC6138nm() { // from class: FW
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ long c;

                    public /* synthetic */ FW(boolean z, long jM2) {
                        z = z;
                        j = jM2;
                    }

                    @Override // defpackage.InterfaceC6138nm
                    public final boolean c(TotalCaptureResult totalCaptureResult) {
                        GW gw2 = gw;
                        gw2.getClass();
                        Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (gw2.p.length > 0) {
                            if (!z || num4 == null) {
                                gw2.m = true;
                                gw2.l = true;
                            } else if (gw2.h.intValue() == 3) {
                                if (num4.intValue() == 4) {
                                    gw2.m = true;
                                    gw2.l = true;
                                } else if (num4.intValue() == 5) {
                                    gw2.m = false;
                                    gw2.l = true;
                                }
                            }
                        }
                        if (!gw2.l || !C6329om.i(totalCaptureResult, j)) {
                            if (gw2.h.equals(num4) || num4 == null) {
                                return false;
                            }
                            gw2.h = num4;
                            return false;
                        }
                        boolean z = gw2.m;
                        ScheduledFuture scheduledFuture4 = gw2.j;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            gw2.j = null;
                        }
                        C0365El c0365El3 = gw2.s;
                        if (c0365El3 != null) {
                            c0365El3.b(new HW(z));
                            gw2.s = null;
                        }
                        return true;
                    }
                };
                gw.o = fw2;
                c6329om.a(fw2);
                long j2 = gw.k + 1;
                gw.k = j2;
                DW dw = new DW(gw, j2, 2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C20 c20 = gw.c;
                gw.j = c20.schedule(dw, 5000L, timeUnit);
                long j3 = pt.b;
                if (j3 > 0) {
                    gw.i = c20.schedule(new DW(gw, j2, 3), j3, timeUnit);
                    return;
                }
                return;
            case 26:
                C0390Et0 c0390Et0 = (C0390Et0) ((C0999Mo1) this.b).a;
                C2382bk0 c2382bk0 = (C2382bk0) this.c;
                if (c2382bk0 != null) {
                    c0390Et0.i(c2382bk0);
                }
                c0390Et0.f((C2382bk0) this.d);
                return;
            case 27:
                LogStorage.log$lambda$2((LogStorage) this.b, (String) this.c, (LogEntry) this.d);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C0222Cp0 c0222Cp0 = (C0222Cp0) this.b;
                c0222Cp0.getClass();
                C3769fQ0 c3769fQ0H = ((M70) this.c).h();
                C8323zE c8323zE2 = c0222Cp0.c;
                IB0 ib0 = c8323zE2.g;
                ib0.getClass();
                C1241Pr0 c1241Pr0 = c8323zE2.d;
                c1241Pr0.getClass();
                c1241Pr0.b = P70.u(c3769fQ0H);
                if (!c3769fQ0H.isEmpty()) {
                    c1241Pr0.e = (C0456Fp0) c3769fQ0H.get(0);
                    C0456Fp0 c0456Fp0 = (C0456Fp0) this.d;
                    c0456Fp0.getClass();
                    c1241Pr0.f = c0456Fp0;
                }
                if (((C0456Fp0) c1241Pr0.d) == null) {
                    c1241Pr0.d = C1241Pr0.p(ib0, (P70) c1241Pr0.b, (C0456Fp0) c1241Pr0.e, (C0022Aa1) c1241Pr0.a);
                }
                c1241Pr0.D(((XQ) ib0).G1());
                return;
            default:
                VY vy = (VY) this.b;
                this.c.d(vy.b, (C0456Fp0) vy.c, (C7102sp0) this.d);
                return;
        }
    }

    public /* synthetic */ RunnableC1557Ts1(C7020sO c7020sO, ArrayList arrayList, Runnable runnable) {
        this.a = 21;
        this.b = c7020sO;
        this.d = arrayList;
        this.c = runnable;
    }

    public /* synthetic */ RunnableC1557Ts1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
