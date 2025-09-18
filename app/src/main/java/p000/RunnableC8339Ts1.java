package p000;

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
import androidx.fragment.app.C1722d;
import androidx.fragment.app.C1724f;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.util.BiConsumer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.p018my.tracker.campaign.CampaignService;
import com.p018my.tracker.obfuscated.C2304d;
import com.yandex.varioqub.config.impl.C3858B;
import io.appmetrica.analytics.impl.C4382B0;
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
import ru.p031ok.tracer.crash.report.CrashDescription;
import ru.p031ok.tracer.crash.report.CrashLoggerInternal;
import ru.p031ok.tracer.crash.report.LogEntry;
import ru.p031ok.tracer.crash.report.LogStorage;

/* renamed from: Ts1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8339Ts1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11571a;

    /* renamed from: b */
    public final /* synthetic */ Object f11572b;

    /* renamed from: c */
    public final /* synthetic */ Object f11573c;

    /* renamed from: d */
    public final /* synthetic */ Object f11574d;

    public /* synthetic */ RunnableC8339Ts1(InterfaceC3987eO interfaceC3987eO, int i, String str, Throwable th) {
        this.f11571a = 20;
        this.f11572b = interfaceC3987eO;
        this.f11573c = str;
        this.f11574d = th;
    }

    /* renamed from: a */
    private final void m7794a() {
        ((C2304d) this.f11572b).m12815a((ProductInfoReq) this.f11573c, (ArrayList) this.f11574d);
    }

    /* renamed from: b */
    private final void m7795b() {
        ((C2304d) this.f11572b).m12816a((ProductInfoResult) this.f11573c, (List) this.f11574d);
    }

    /* JADX WARN: Type inference failed for: r3v29, types: [PL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        long jM23552m;
        switch (this.f11571a) {
            case 0:
                m7794a();
                return;
            case 1:
                m7795b();
                return;
            case 2:
                CC0 cc0 = (CC0) this.f11572b;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a;
                c1474xq.getClass();
                C7251zE c7251zE = c1474xq.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1009, new C6873tE(c1514y3M26333P, (C6686qX) this.f11573c, (C1772bE) this.f11574d, 1));
                return;
            case 3:
                C0541Ia c0541Ia = (C0541Ia) this.f11572b;
                int iM26247x = AbstractC7222ym.m26247x(c0541Ia.f4999g);
                if (iM26247x == 0) {
                    c0541Ia.f5002j = (ExecutorC10151lY0) this.f11573c;
                    c0541Ia.f5003k = (C7967Mo1) this.f11574d;
                    return;
                } else {
                    if (iM26247x == 1 || iM26247x == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 4:
                C3858B.m17386a((C3858B) this.f11572b, (String) this.f11573c, (String) this.f11574d);
                return;
            case 5:
                C4382B0.m19215a((C4382B0) this.f11572b, (PluginErrorDetails) this.f11573c, (String) this.f11574d);
                return;
            case 6:
                C0855Na c0855Na = ((C7156xj) this.f11572b).f45752g;
                C7978Mu0 c7978Mu0 = (C7978Mu0) this.f11573c;
                ExecutorC10151lY0 executorC10151lY0 = (ExecutorC10151lY0) this.f11574d;
                AbstractC9104dM1.m17550i(!c0855Na.f7883d.get(), "AudioStream can not be started when setCallback.");
                c0855Na.m5780a();
                c0855Na.f7887h = c7978Mu0;
                c0855Na.f7888i = executorC10151lY0;
                if (Build.VERSION.SDK_INT >= 29) {
                    C0792Ma c0792Ma = c0855Na.f7890k;
                    if (c0792Ma != null) {
                        AbstractC1264U5.m7895d(c0855Na.f7880a, c0792Ma);
                    }
                    if (c0855Na.f7890k == null) {
                        c0855Na.f7890k = new C0792Ma(c0855Na);
                    }
                    AbstractC1264U5.m7894c(c0855Na.f7880a, executorC10151lY0, c0855Na.f7890k);
                    return;
                }
                return;
            case 7:
                EncodedImage encodedImage = (EncodedImage) this.f11574d;
                C0487Hj c0487Hj = (C0487Hj) this.f11572b;
                O90.m5968f(c0487Hj, "this$0");
                C9196e41 c9196e41 = (C9196e41) c0487Hj.f4451h;
                O01 o01 = (O01) this.f11573c;
                O90.m5968f(o01, "$key");
                try {
                    c0487Hj.m3560n(o01, encodedImage);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        O90.m5965c(encodedImage);
                        c9196e41.m17855R0(o01, encodedImage);
                        EncodedImage.closeSafely(encodedImage);
                    }
                }
            case 8:
                C6384lm c6384lm = ((C6573om) this.f11572b).f39252x;
                HashSet hashSet = (HashSet) c6384lm.f37285b;
                AbstractC6511nn abstractC6511nn = (AbstractC6511nn) this.f11574d;
                hashSet.add(abstractC6511nn);
                ((ArrayMap) c6384lm.f37286c).put(abstractC6511nn, (Executor) this.f11573c);
                return;
            case 9:
                C1433Wm c1433Wm = (C1433Wm) this.f11572b;
                c1433Wm.getClass();
                AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
                c1433Wm.f13398d.mo9306a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (C1370Vm) ((AtomicReference) this.f11573c).get());
                ((C0300El) this.f11574d).m2375b(null);
                return;
            case 10:
                ((C0113Bn) this.f11572b).f1023a.onSurfacePrepared((CameraCaptureSession) this.f11573c, (Surface) this.f11574d);
                return;
            case 11:
                ((CampaignService) this.f11572b).m12756a((String) this.f11573c, (RunnableC0383G4) this.f11574d);
                return;
            case 12:
                ((BiConsumer) this.f11572b).accept((String) this.f11573c, (C7232yw) this.f11574d);
                return;
            case 13:
                CrashLoggerInternal.reportCrash$lambda$0((CrashLoggerInternal) this.f11572b, (CrashDescription) this.f11573c, (CountDownLatch) this.f11574d);
                return;
            case 14:
                String str = (String) this.f11573c;
                String str2 = (String) this.f11574d;
                C6409mA c6409mA = ((C6663qA) this.f11572b).f40645h;
                c6409mA.getClass();
                try {
                    ((C1338VG) ((C10030kb1) c6409mA.f37530d).f36564d).m8348m(str, str2);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = (Context) c6409mA.f37527a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    return;
                }
            case 15:
                C6409mA c6409mA2 = ((C6663qA) this.f11572b).f40645h;
                Thread threadCurrentThread = Thread.currentThread();
                c6409mA2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1521YA c1521ya = (C1521YA) c6409mA2.f37540n;
                if (c1521ya == null || !c1521ya.f14185e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strM22696e = c6409mA2.m22696e();
                    if (strM22696e == null) {
                        return;
                    }
                    C0781MP c0781mp = new C0781MP(strM22696e, (Map) this.f11574d, j);
                    C1002Pv c1002Pv = (C1002Pv) c6409mA2.f37539m;
                    c1002Pv.getClass();
                    c1002Pv.m6484w((Throwable) this.f11573c, threadCurrentThread, "error", c0781mp, false);
                    return;
                }
                return;
            case 16:
                C1724f c1724f = (C1724f) this.f11572b;
                O90.m5968f(c1724f, "this$0");
                C1722d c1722d = (C1722d) this.f11574d;
                O90.m5968f(c1722d, "$animationInfo");
                c1724f.f16183a.endViewTransition((View) this.f11573c);
                c1722d.m10020a();
                return;
            case 17:
                if (((C0584JG) this.f11572b).f5439j) {
                    ((Runnable) this.f11573c).run();
                    return;
                } else {
                    ((Runnable) this.f11574d).run();
                    return;
                }
            case 18:
                C0903OL c0903ol = (C0903OL) this.f11572b;
                this.f11573c.mo1059c(c0903ol.f8364a, c0903ol.f8365b, (Exception) this.f11574d);
                return;
            case 19:
                if (((C6421mM) this.f11572b).f37644f) {
                    ((Runnable) this.f11573c).run();
                    return;
                } else {
                    ((Runnable) this.f11574d).run();
                    return;
                }
            case 20:
                ((InterfaceC3987eO) this.f11572b).mo400q(new C1282UN((String) this.f11573c, (Throwable) this.f11574d));
                return;
            case 21:
                C6820sO c6820sO = (C6820sO) this.f11572b;
                ArrayList arrayList = (ArrayList) this.f11574d;
                Runnable runnable = (Runnable) this.f11573c;
                if (c6820sO.f42390D != 8) {
                    if (!arrayList.isEmpty()) {
                        AbstractC7806Jm0.m4412f(c6820sO.f42391a);
                    }
                    if ((c6820sO.f42396f instanceof C6740rO) && !c6820sO.f42387A && AbstractC6941uJ.f43644a.m17864z0(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        c6820sO.f42395e.flush();
                        c6820sO.f42416z = true;
                    } else {
                        c6820sO.f42395e.stop();
                    }
                }
                runnable.run();
                int i2 = c6820sO.f42390D;
                if (i2 == 7) {
                    c6820sO.m24722f();
                    return;
                }
                if (!c6820sO.f42416z) {
                    c6820sO.m24724h();
                }
                c6820sO.m24725i(1);
                if (i2 == 5 || i2 == 6) {
                    c6820sO.m24727k();
                    if (i2 == 6) {
                        c6820sO.m24721e();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                C6549oO c6549oO = (C6549oO) this.f11572b;
                LinkedHashMap linkedHashMap = c6549oO.f38980a;
                InterfaceC9049cx0 interfaceC9049cx0 = (InterfaceC9049cx0) this.f11573c;
                interfaceC9049cx0.getClass();
                Executor executor = (Executor) this.f11574d;
                executor.getClass();
                linkedHashMap.put(interfaceC9049cx0, executor);
                executor.execute(new RunnableC3973eA(interfaceC9049cx0, 23, c6549oO.f38981b));
                return;
            case 23:
                Executor executor2 = (Executor) this.f11573c;
                InterfaceC3987eO interfaceC3987eO = (InterfaceC3987eO) this.f11574d;
                C6820sO c6820sO2 = ((C6677qO) this.f11572b).f40854l;
                if (c6820sO2.f42390D == 8) {
                    return;
                }
                try {
                    Objects.requireNonNull(interfaceC3987eO);
                    executor2.execute(new RunnableC6614pO(interfaceC3987eO, 1));
                    return;
                } catch (RejectedExecutionException unused) {
                    AbstractC7806Jm0.m4412f(c6820sO2.f42391a);
                    return;
                }
            case 24:
                Intent intent = (Intent) this.f11573c;
                S81 s81 = (S81) this.f11574d;
                AbstractServiceC0655KO abstractServiceC0655KO = (AbstractServiceC0655KO) this.f11572b;
                abstractServiceC0655KO.getClass();
                try {
                    abstractServiceC0655KO.mo4623b(intent);
                    return;
                } finally {
                    s81.m7184b(null);
                }
            case 25:
                C0411GW c0411gw = (C0411GW) this.f11572b;
                C0300El c0300El = (C0300El) this.f11573c;
                C0974PT c0974pt = (C0974PT) this.f11574d;
                if (!c0411gw.f3777d) {
                    c0300El.m2377d(new C1434Wn("Camera is not active."));
                    return;
                }
                Rect rectMo483k = ((InterfaceC8281Sp1) c0411gw.f3774a.f39236h.f16687g).mo483k();
                if (c0411gw.f3778e != null) {
                    rational = c0411gw.f3778e;
                } else {
                    Rect rectMo483k2 = ((InterfaceC8281Sp1) c0411gw.f3774a.f39236h.f16687g).mo483k();
                    rational = new Rational(rectMo483k2.width(), rectMo483k2.height());
                }
                List list = (List) c0974pt.f9079c;
                Integer num = (Integer) c0411gw.f3774a.f39232d.m3155a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List listM3078d = c0411gw.m3078d(list, num == null ? 0 : num.intValue(), rational, rectMo483k, 1);
                List list2 = (List) c0974pt.f9080d;
                Integer num2 = (Integer) c0411gw.f3774a.f39232d.m3155a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List listM3078d2 = c0411gw.m3078d(list2, num2 == null ? 0 : num2.intValue(), rational, rectMo483k, 2);
                List list3 = (List) c0974pt.f9081e;
                Integer num3 = (Integer) c0411gw.f3774a.f39232d.m3155a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                List listM3078d3 = c0411gw.m3078d(list3, num3 == null ? 0 : num3.intValue(), rational, rectMo483k, 4);
                if (listM3078d.isEmpty() && listM3078d2.isEmpty() && listM3078d3.isEmpty()) {
                    c0300El.m2377d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    return;
                }
                c0411gw.f3774a.m23549j(c0411gw.f3788o);
                C0300El c0300El2 = c0411gw.f3792s;
                if (c0300El2 != null) {
                    c0300El2.m2377d(new C1434Wn("Cancelled by another startFocusAndMetering()"));
                    c0411gw.f3792s = null;
                }
                c0411gw.f3774a.m23549j(null);
                ScheduledFuture scheduledFuture = c0411gw.f3782i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    c0411gw.f3782i = null;
                }
                c0411gw.f3792s = c0300El;
                MeteringRectangle[] meteringRectangleArr = C0411GW.f3773v;
                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listM3078d.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listM3078d2.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listM3078d3.toArray(meteringRectangleArr);
                C0348FW c0348fw = c0411gw.f3788o;
                C6573om c6573om = c0411gw.f3774a;
                c6573om.m23549j(c0348fw);
                ScheduledFuture scheduledFuture2 = c0411gw.f3782i;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    c0411gw.f3782i = null;
                }
                ScheduledFuture scheduledFuture3 = c0411gw.f3783j;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(true);
                    c0411gw.f3783j = null;
                }
                c0411gw.f3789p = meteringRectangleArr2;
                c0411gw.f3790q = meteringRectangleArr3;
                c0411gw.f3791r = meteringRectangleArr4;
                if (meteringRectangleArr2.length > 0) {
                    c0411gw.f3780g = true;
                    c0411gw.f3785l = false;
                    c0411gw.f3786m = false;
                    jM23552m = c6573om.m23552m();
                    c0411gw.m3081g(true);
                } else {
                    c0411gw.f3780g = false;
                    c0411gw.f3785l = true;
                    c0411gw.f3786m = false;
                    jM23552m = c6573om.m23552m();
                }
                c0411gw.f3781h = 0;
                C0348FW c0348fw2 = new InterfaceC6510nm() { // from class: FW

                    /* renamed from: b */
                    public final /* synthetic */ boolean f3291b;

                    /* renamed from: c */
                    public final /* synthetic */ long f3292c;

                    public /* synthetic */ C0348FW(boolean z, long jM23552m2) {
                        z = z;
                        j = jM23552m2;
                    }

                    @Override // p000.InterfaceC6510nm
                    /* renamed from: c */
                    public final boolean mo2326c(TotalCaptureResult totalCaptureResult) {
                        C0411GW c0411gw2 = c0411gw;
                        c0411gw2.getClass();
                        Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (c0411gw2.f3789p.length > 0) {
                            if (!z || num4 == null) {
                                c0411gw2.f3786m = true;
                                c0411gw2.f3785l = true;
                            } else if (c0411gw2.f3781h.intValue() == 3) {
                                if (num4.intValue() == 4) {
                                    c0411gw2.f3786m = true;
                                    c0411gw2.f3785l = true;
                                } else if (num4.intValue() == 5) {
                                    c0411gw2.f3786m = false;
                                    c0411gw2.f3785l = true;
                                }
                            }
                        }
                        if (!c0411gw2.f3785l || !C6573om.m23542i(totalCaptureResult, j)) {
                            if (c0411gw2.f3781h.equals(num4) || num4 == null) {
                                return false;
                            }
                            c0411gw2.f3781h = num4;
                            return false;
                        }
                        boolean z = c0411gw2.f3786m;
                        ScheduledFuture scheduledFuture4 = c0411gw2.f3783j;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            c0411gw2.f3783j = null;
                        }
                        C0300El c0300El3 = c0411gw2.f3792s;
                        if (c0300El3 != null) {
                            c0300El3.m2375b(new C0474HW(z));
                            c0411gw2.f3792s = null;
                        }
                        return true;
                    }
                };
                c0411gw.f3788o = c0348fw2;
                c6573om.m23543a(c0348fw2);
                long j2 = c0411gw.f3784k + 1;
                c0411gw.f3784k = j2;
                RunnableC0222DW runnableC0222DW = new RunnableC0222DW(c0411gw, j2, 2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C20 c20 = c0411gw.f3776c;
                c0411gw.f3783j = c20.schedule(runnableC0222DW, 5000L, timeUnit);
                long j3 = c0974pt.f9078b;
                if (j3 > 0) {
                    c0411gw.f3782i = c20.schedule(new RunnableC0222DW(c0411gw, j2, 3), j3, timeUnit);
                    return;
                }
                return;
            case 26:
                C7560Et0 c7560Et0 = (C7560Et0) ((C7967Mo1) this.f11572b).f7362a;
                C8890bk0 c8890bk0 = (C8890bk0) this.f11573c;
                if (c8890bk0 != null) {
                    c7560Et0.mo10135i(c8890bk0);
                }
                c7560Et0.m10134f((C8890bk0) this.f11574d);
                return;
            case 27:
                LogStorage.log$lambda$2((LogStorage) this.f11572b, (String) this.f11573c, (LogEntry) this.f11574d);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C7448Cp0 c7448Cp0 = (C7448Cp0) this.f11572b;
                c7448Cp0.getClass();
                C9367fQ0 c9367fQ0M5273h = ((M70) this.f11573c).m5273h();
                C7251zE c7251zE2 = c7448Cp0.f1675c;
                IB0 ib0 = c7251zE2.f46737g;
                ib0.getClass();
                C8128Pr0 c8128Pr0 = c7251zE2.f46734d;
                c8128Pr0.getClass();
                c8128Pr0.f9304b = P70.m6234u(c9367fQ0M5273h);
                if (!c9367fQ0M5273h.isEmpty()) {
                    c8128Pr0.f9307e = (C7604Fp0) c9367fQ0M5273h.get(0);
                    C7604Fp0 c7604Fp0 = (C7604Fp0) this.f11574d;
                    c7604Fp0.getClass();
                    c8128Pr0.f9308f = c7604Fp0;
                }
                if (((C7604Fp0) c8128Pr0.f9306d) == null) {
                    c8128Pr0.f9306d = C8128Pr0.m6442p(ib0, (P70) c8128Pr0.f9304b, (C7604Fp0) c8128Pr0.f9307e, (C7315Aa1) c8128Pr0.f9303a);
                }
                c8128Pr0.m6447D(((C1474XQ) ib0).m9010G1());
                return;
            default:
                C1356VY c1356vy = (C1356VY) this.f11572b;
                this.f11573c.mo1062d(c1356vy.f12611b, (C7604Fp0) c1356vy.f12612c, (C11081sp0) this.f11574d);
                return;
        }
    }

    public /* synthetic */ RunnableC8339Ts1(C6820sO c6820sO, ArrayList arrayList, Runnable runnable) {
        this.f11571a = 21;
        this.f11572b = c6820sO;
        this.f11574d = arrayList;
        this.f11573c = runnable;
    }

    public /* synthetic */ RunnableC8339Ts1(Object obj, Object obj2, Object obj3, int i) {
        this.f11571a = i;
        this.f11572b = obj;
        this.f11573c = obj2;
        this.f11574d = obj3;
    }
}
