package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.Surface;
import androidx.camera.lifecycle.a;
import com.my.tracker.obfuscated.C2612a;
import com.my.tracker.obfuscated.b1;
import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.f0;
import io.sentry.C5143m;
import io.sentry.D;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.M1;
import io.sentry.Q;
import io.sentry.SpotlightIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.PhoneStateBreadcrumbsIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.T;
import io.sentry.android.core.TempSensorBreadcrumbsIntegration;
import io.sentry.android.core.internal.util.m;
import io.sentry.android.replay.t;
import io.sentry.internal.debugmeta.c;
import io.sentry.util.e;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class O91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ O91(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        PhoneStateBreadcrumbsIntegration phoneStateBreadcrumbsIntegration = (PhoneStateBreadcrumbsIntegration) this.b;
        D1 d1 = (D1) this.c;
        synchronized (phoneStateBreadcrumbsIntegration.f) {
            try {
                if (!phoneStateBreadcrumbsIntegration.e) {
                    phoneStateBreadcrumbsIntegration.a(d1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.b;
        D1 d1 = (D1) this.c;
        synchronized (systemEventsBreadcrumbsIntegration.f) {
            try {
                if (!systemEventsBreadcrumbsIntegration.e) {
                    systemEventsBreadcrumbsIntegration.a((SentryAndroidOptions) d1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        TempSensorBreadcrumbsIntegration tempSensorBreadcrumbsIntegration = (TempSensorBreadcrumbsIntegration) this.b;
        D1 d1 = (D1) this.c;
        synchronized (tempSensorBreadcrumbsIntegration.f) {
            try {
                if (!tempSensorBreadcrumbsIntegration.e) {
                    tempSensorBreadcrumbsIntegration.a(d1);
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
        switch (this.a) {
            case 0:
                Q91 q91 = (Q91) this.b;
                Z61 z61 = q91.h;
                if (z61 != null && z61 == ((Z61) this.c)) {
                    q91.h = null;
                    q91.g = null;
                }
                C4290i9 c4290i9 = q91.l;
                if (c4290i9 != null) {
                    c4290i9.c();
                    q91.l = null;
                    return;
                }
                return;
            case 1:
                a aVar = (a) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    aVar.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 2:
                C1977Zc1 c1977Zc1 = (C1977Zc1) this.b;
                c1977Zc1.getClass();
                BA0 ba0 = (BA0) this.c;
                c1977Zc1.d(ba0.a, ba0.b);
                return;
            case 3:
                C5534kb1 c5534kb1 = (C5534kb1) this.b;
                ((C0306Dr0) c5534kb1.a).i((String) c5534kb1.c, (List) this.c);
                return;
            case 4:
                C1371Ri1 c1371Ri1 = (C1371Ri1) this.b;
                if (((Q61) this.c) == c1371Ri1.o) {
                    c1371Ri1.I();
                    return;
                }
                return;
            case 5:
                C1059Ni1 c1059Ni1 = (C1059Ni1) this.b;
                c1059Ni1.getClass();
                C7433uY0 c7433uY0 = (C7433uY0) this.c;
                ((ArrayList) c7433uY0.b.f).remove(c1059Ni1);
                c7433uY0.e.remove(c1059Ni1);
                return;
            case 6:
                ((VN0) ((C6557py0) this.b).j).a.A((Surface) this.c);
                return;
            case 7:
                C1296Qj1 c1296Qj1 = (C1296Qj1) this.b;
                c1296Qj1.getClass();
                int i = AbstractC0277Dh1.a;
                XQ xq = ((UQ) c1296Qj1.b).a;
                C1530Tj1 c1530Tj1 = (C1530Tj1) this.c;
                xq.s1 = c1530Tj1;
                xq.m.f(25, new EE(10, c1530Tj1));
                return;
            case 8:
                C1296Qj1 c1296Qj12 = (C1296Qj1) this.b;
                c1296Qj12.getClass();
                int i2 = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) c1296Qj12.b).a.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1030, new C4403il(y3P, (Exception) this.c, 25));
                return;
            case 9:
                C1296Qj1 c1296Qj13 = (C1296Qj1) this.b;
                c1296Qj13.getClass();
                int i3 = AbstractC0277Dh1.a;
                C8323zE c8323zE2 = ((UQ) c1296Qj13.b).a.r;
                Y3 y3P2 = c8323zE2.P();
                c8323zE2.Q(y3P2, 1019, new C6227oE(y3P2, (String) this.c, 1));
                return;
            case 10:
                RunnableC0142Bo1 runnableC0142Bo1 = (RunnableC0142Bo1) this.b;
                C8007xZ0 c8007xZ0 = (C8007xZ0) this.c;
                if (runnableC0142Bo1.a.a instanceof S) {
                    c8007xZ0.cancel(true);
                    return;
                } else {
                    c8007xZ0.l(runnableC0142Bo1.d.getForegroundInfoAsync());
                    return;
                }
            case 11:
                RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.b;
                C8007xZ0 c8007xZ02 = (C8007xZ0) this.c;
                if (runnableC3654ep1.q.a instanceof S) {
                    c8007xZ02.cancel(true);
                    return;
                }
                return;
            case 12:
                ((C2612a) this.b).a((Activity) this.c);
                return;
            case 13:
                ((b1) this.b).a((String) this.c);
                return;
            case 14:
                ((d) this.b).b((Intent) this.c);
                return;
            case 15:
                ((f0) this.b).b((f0.a) this.c);
                return;
            case 16:
                ((f0) this.b).b((b3) this.c);
                return;
            case 17:
                ((f0) this.b).a((String) this.c);
                return;
            case 18:
                ((f0) this.b).b((f0.c) this.c);
                return;
            case 19:
                ((C5143m) this.b).j((M1) this.c);
                return;
            case 20:
                ((Q) this.c).e(((D) this.b).a.getShutdownTimeoutMillis());
                return;
            case 21:
                c cVar = (c) this.c;
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.b;
                try {
                    D1 d1 = spotlightIntegration.a;
                    if (d1 == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    HttpURLConnection httpURLConnectionC = SpotlightIntegration.c(d1.getSpotlightConnectionUrl() != null ? spotlightIntegration.a.getSpotlightConnectionUrl() : e.a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream");
                    try {
                        outputStream = httpURLConnectionC.getOutputStream();
                    } catch (Throwable th) {
                        try {
                            spotlightIntegration.b.d(EnumC5148n1.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th);
                            spotlightIntegration.b.k(EnumC5148n1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionC.getResponseCode()));
                        } catch (Throwable th2) {
                            spotlightIntegration.b.k(EnumC5148n1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionC.getResponseCode()));
                            SpotlightIntegration.a(httpURLConnectionC);
                            throw th2;
                        }
                    }
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            spotlightIntegration.a.getSerializer().f(cVar, gZIPOutputStream);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            spotlightIntegration.b.k(EnumC5148n1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionC.getResponseCode()));
                            SpotlightIntegration.a(httpURLConnectionC);
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    spotlightIntegration.b.d(EnumC5148n1.ERROR, "An exception occurred while creating the connection to spotlight.", e);
                    return;
                }
            case 22:
                AnrIntegration anrIntegration = (AnrIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                synchronized (anrIntegration.c) {
                    try {
                        if (!anrIntegration.b) {
                            anrIntegration.a(sentryAndroidOptions);
                        }
                    } finally {
                    }
                }
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                m mVar = (m) this.b;
                mVar.getClass();
                try {
                    mVar.j = Choreographer.getInstance();
                    return;
                } catch (Throwable th3) {
                    ((T) this.c).d(EnumC5148n1.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th3);
                    return;
                }
            case 27:
                t tVar = (t) this.b;
                O90.f(tVar, "this$0");
                io.sentry.android.replay.viewhierarchy.e eVar = (io.sentry.android.replay.viewhierarchy.e) this.c;
                Bitmap bitmap = tVar.i;
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) tVar.k.getValue());
                eVar.c(new C3690f1(tVar, 17, canvas));
                tVar.e.g(bitmap);
                tVar.n.set(true);
                tVar.l.set(false);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                N61 n61 = (N61) this.b;
                D1 d12 = (D1) this.c;
                try {
                    n61.run();
                    return;
                } catch (Throwable th4) {
                    d12.getLogger().d(EnumC5148n1.ERROR, "Failed to execute task ".concat("WindowRecorder.capture"), th4);
                    return;
                }
            default:
                N61 n612 = (N61) this.b;
                D1 d13 = (D1) this.c;
                O90.f(d13, "$options");
                try {
                    n612.run();
                    return;
                } catch (Throwable th5) {
                    d13.getLogger().d(EnumC5148n1.ERROR, "Failed to execute task ".concat("ReplayIntegration.finalize_previous_replay"), th5);
                    return;
                }
        }
    }
}
