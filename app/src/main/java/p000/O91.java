package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.Surface;
import androidx.camera.lifecycle.RunnableC1707a;
import com.p018my.tracker.obfuscated.C2289a;
import com.p018my.tracker.obfuscated.C2296b1;
import com.p018my.tracker.obfuscated.C2298b3;
import com.p018my.tracker.obfuscated.C2304d;
import com.p018my.tracker.obfuscated.C2313f0;
import io.sentry.C5757D;
import io.sentry.C5759D1;
import io.sentry.C5786M1;
import io.sentry.C6060m;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5796Q;
import io.sentry.SpotlightIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C5847T;
import io.sentry.android.core.PhoneStateBreadcrumbsIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.TempSensorBreadcrumbsIntegration;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC5960t;
import io.sentry.android.replay.viewhierarchy.AbstractC5974e;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.util.AbstractC6172e;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class O91 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8261a;

    /* renamed from: b */
    public final /* synthetic */ Object f8262b;

    /* renamed from: c */
    public final /* synthetic */ Object f8263c;

    public /* synthetic */ O91(Object obj, int i, Object obj2) {
        this.f8261a = i;
        this.f8262b = obj;
        this.f8263c = obj2;
    }

    /* renamed from: a */
    private final void m5978a() {
        PhoneStateBreadcrumbsIntegration phoneStateBreadcrumbsIntegration = (PhoneStateBreadcrumbsIntegration) this.f8262b;
        C5759D1 c5759d1 = (C5759D1) this.f8263c;
        synchronized (phoneStateBreadcrumbsIntegration.f33579f) {
            try {
                if (!phoneStateBreadcrumbsIntegration.f33578e) {
                    phoneStateBreadcrumbsIntegration.m21539a(c5759d1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m5979b() {
        SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f8262b;
        C5759D1 c5759d1 = (C5759D1) this.f8263c;
        synchronized (systemEventsBreadcrumbsIntegration.f33614f) {
            try {
                if (!systemEventsBreadcrumbsIntegration.f33613e) {
                    systemEventsBreadcrumbsIntegration.m21543a((SentryAndroidOptions) c5759d1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private final void m5980c() {
        TempSensorBreadcrumbsIntegration tempSensorBreadcrumbsIntegration = (TempSensorBreadcrumbsIntegration) this.f8262b;
        C5759D1 c5759d1 = (C5759D1) this.f8263c;
        synchronized (tempSensorBreadcrumbsIntegration.f33621f) {
            try {
                if (!tempSensorBreadcrumbsIntegration.f33620e) {
                    tempSensorBreadcrumbsIntegration.m21546a(c5759d1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream;
        switch (this.f8261a) {
            case 0:
                Q91 q91 = (Q91) this.f8262b;
                Z61 z61 = q91.f9507h;
                if (z61 != null && z61 == ((Z61) this.f8263c)) {
                    q91.f9507h = null;
                    q91.f9506g = null;
                }
                C4224i9 c4224i9 = q91.f9511l;
                if (c4224i9 != null) {
                    c4224i9.m18973c();
                    q91.f9511l = null;
                    return;
                }
                return;
            case 1:
                RunnableC1707a runnableC1707a = (RunnableC1707a) this.f8262b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f8263c;
                try {
                    runnableC1707a.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 2:
                C8619Zc1 c8619Zc1 = (C8619Zc1) this.f8262b;
                c8619Zc1.getClass();
                BA0 ba0 = (BA0) this.f8263c;
                c8619Zc1.m9558d(ba0.f612a, ba0.f613b);
                return;
            case 3:
                C10030kb1 c10030kb1 = (C10030kb1) this.f8262b;
                ((C7504Dr0) c10030kb1.f36561a).m1916i((String) c10030kb1.f36563c, (List) this.f8263c);
                return;
            case 4:
                C8215Ri1 c8215Ri1 = (C8215Ri1) this.f8262b;
                if (((Q61) this.f8263c) == c8215Ri1.f10389o) {
                    c8215Ri1.m7094I();
                    return;
                }
                return;
            case 5:
                C8007Ni1 c8007Ni1 = (C8007Ni1) this.f8262b;
                c8007Ni1.getClass();
                C11303uY0 c11303uY0 = (C11303uY0) this.f8263c;
                ((ArrayList) c11303uY0.f43134b.f15118f).remove(c8007Ni1);
                c11303uY0.f43137e.remove(c8007Ni1);
                return;
            case 6:
                ((VN0) ((C10715py0) this.f8262b).f40470j).f12535a.m18484A((Surface) this.f8263c);
                return;
            case 7:
                C8165Qj1 c8165Qj1 = (C8165Qj1) this.f8262b;
                c8165Qj1.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq = ((SurfaceHolderCallbackC1285UQ) c8165Qj1.f9757b).f11780a;
                C8321Tj1 c8321Tj1 = (C8321Tj1) this.f8263c;
                c1474xq.f13739s1 = c8321Tj1;
                c1474xq.f13730m.m8134f(25, new C0267EE(10, c8321Tj1));
                return;
            case 8:
                C8165Qj1 c8165Qj12 = (C8165Qj1) this.f8262b;
                c8165Qj12.getClass();
                int i2 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) c8165Qj12.f9757b).f11780a.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1030, new C4262il(c1514y3M26333P, (Exception) this.f8263c, 25));
                return;
            case 9:
                C8165Qj1 c8165Qj13 = (C8165Qj1) this.f8262b;
                c8165Qj13.getClass();
                int i3 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE2 = ((SurfaceHolderCallbackC1285UQ) c8165Qj13.f9757b).f11780a.f13736r;
                C1514Y3 c1514y3M26333P2 = c7251zE2.m26333P();
                c7251zE2.m26334Q(c1514y3M26333P2, 1019, new C6539oE(c1514y3M26333P2, (String) this.f8263c, 1));
                return;
            case 10:
                RunnableC7395Bo1 runnableC7395Bo1 = (RunnableC7395Bo1) this.f8262b;
                C11687xZ0 c11687xZ0 = (C11687xZ0) this.f8263c;
                if (runnableC7395Bo1.f1036a.f37381a instanceof C1132S) {
                    c11687xZ0.cancel(true);
                    return;
                } else {
                    c11687xZ0.m25923l(runnableC7395Bo1.f1039d.getForegroundInfoAsync());
                    return;
                }
            case 11:
                RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f8262b;
                C11687xZ0 c11687xZ02 = (C11687xZ0) this.f8263c;
                if (runnableC9290ep1.f26907q.f37381a instanceof C1132S) {
                    c11687xZ02.cancel(true);
                    return;
                }
                return;
            case 12:
                ((C2289a) this.f8262b).m12759a((Activity) this.f8263c);
                return;
            case 13:
                ((C2296b1) this.f8262b).m12793a((String) this.f8263c);
                return;
            case 14:
                ((C2304d) this.f8262b).m12821b((Intent) this.f8263c);
                return;
            case 15:
                ((C2313f0) this.f8262b).m13015b((C2313f0.a) this.f8263c);
                return;
            case 16:
                ((C2313f0) this.f8262b).m13014b((C2298b3) this.f8263c);
                return;
            case 17:
                ((C2313f0) this.f8262b).m12996a((String) this.f8263c);
                return;
            case 18:
                ((C2313f0) this.f8262b).m13016b((C2313f0.c) this.f8263c);
                return;
            case 19:
                ((C6060m) this.f8262b).mo21697j((C5786M1) this.f8263c);
                return;
            case 20:
                ((InterfaceC5796Q) this.f8263c).mo13812e(((C5757D) this.f8262b).f33226a.getShutdownTimeoutMillis());
                return;
            case 21:
                C6042c c6042c = (C6042c) this.f8263c;
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.f8262b;
                try {
                    C5759D1 c5759d1 = spotlightIntegration.f33398a;
                    if (c5759d1 == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    HttpURLConnection httpURLConnectionM21470c = SpotlightIntegration.m21470c(c5759d1.getSpotlightConnectionUrl() != null ? spotlightIntegration.f33398a.getSpotlightConnectionUrl() : AbstractC6172e.f34662a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream");
                    try {
                        outputStream = httpURLConnectionM21470c.getOutputStream();
                    } catch (Throwable th) {
                        try {
                            spotlightIntegration.f33399b.mo21406d(EnumC6069n1.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th);
                            spotlightIntegration.f33399b.mo21407k(EnumC6069n1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM21470c.getResponseCode()));
                        } catch (Throwable th2) {
                            spotlightIntegration.f33399b.mo21407k(EnumC6069n1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM21470c.getResponseCode()));
                            SpotlightIntegration.m21469a(httpURLConnectionM21470c);
                            throw th2;
                        }
                    }
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            spotlightIntegration.f33398a.getSerializer().mo21462f(c6042c, gZIPOutputStream);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            spotlightIntegration.f33399b.mo21407k(EnumC6069n1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM21470c.getResponseCode()));
                            SpotlightIntegration.m21469a(httpURLConnectionM21470c);
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    spotlightIntegration.f33399b.mo21406d(EnumC6069n1.ERROR, "An exception occurred while creating the connection to spotlight.", e);
                    return;
                }
            case 22:
                AnrIntegration anrIntegration = (AnrIntegration) this.f8262b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f8263c;
                synchronized (anrIntegration.f33505c) {
                    try {
                        if (!anrIntegration.f33504b) {
                            anrIntegration.m21507a(sentryAndroidOptions);
                        }
                    } finally {
                    }
                }
                return;
            case 23:
                m5978a();
                return;
            case 24:
                m5979b();
                return;
            case 25:
                m5980c();
                return;
            case 26:
                C5893m c5893m = (C5893m) this.f8262b;
                c5893m.getClass();
                try {
                    c5893m.f33788j = Choreographer.getInstance();
                    return;
                } catch (Throwable th3) {
                    ((C5847T) this.f8263c).mo21406d(EnumC6069n1.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th3);
                    return;
                }
            case 27:
                ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t = (ViewTreeObserverOnDrawListenerC5960t) this.f8262b;
                O90.m5968f(viewTreeObserverOnDrawListenerC5960t, "this$0");
                AbstractC5974e abstractC5974e = (AbstractC5974e) this.f8263c;
                Bitmap bitmap = viewTreeObserverOnDrawListenerC5960t.f34025i;
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) viewTreeObserverOnDrawListenerC5960t.f34027k.getValue());
                abstractC5974e.m21690c(new C4027f1(viewTreeObserverOnDrawListenerC5960t, 17, canvas));
                viewTreeObserverOnDrawListenerC5960t.f34021e.m21649g(bitmap);
                viewTreeObserverOnDrawListenerC5960t.f34030n.set(true);
                viewTreeObserverOnDrawListenerC5960t.f34028l.set(false);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                N61 n61 = (N61) this.f8262b;
                C5759D1 c5759d12 = (C5759D1) this.f8263c;
                try {
                    n61.run();
                    return;
                } catch (Throwable th4) {
                    c5759d12.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to execute task ".concat("WindowRecorder.capture"), th4);
                    return;
                }
            default:
                N61 n612 = (N61) this.f8262b;
                C5759D1 c5759d13 = (C5759D1) this.f8263c;
                O90.m5968f(c5759d13, "$options");
                try {
                    n612.run();
                    return;
                } catch (Throwable th5) {
                    c5759d13.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to execute task ".concat("ReplayIntegration.finalize_previous_replay"), th5);
                    return;
                }
        }
    }
}
