package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import defpackage.CallableC0437Fj;
import defpackage.N61;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.n0 */
/* loaded from: classes2.dex */
public final class C4729n0 implements Qa {
    public static volatile C4729n0 e = null;
    public static volatile boolean f = false;
    public final Context a;
    public final C4610i0 b;
    public final FutureTask c;
    public final InterfaceC5002ya d;

    public C4729n0(Context context) {
        this.a = context;
        C4610i0 c4610i0B = C4805q4.h().b();
        this.b = c4610i0B;
        this.d = c4610i0B.a(context, C4805q4.h().e());
        this.c = new FutureTask(new CallableC0437Fj(12, this));
    }

    public static C4729n0 a(Context context, boolean z) {
        C4729n0 c4729n0 = e;
        if (c4729n0 == null) {
            synchronized (C4729n0.class) {
                try {
                    c4729n0 = e;
                    if (c4729n0 == null) {
                        c4729n0 = new C4729n0(context);
                        c4729n0.b(z);
                        C4805q4.h().c.a().execute(new RunnableC4705m0(c4729n0));
                        e = c4729n0;
                    }
                } finally {
                }
            }
        }
        return c4729n0;
    }

    public static void clearAppEnvironment() {
        g().clearAppEnvironment();
    }

    public static InterfaceC4860sc g() {
        return m() ? e.k() : C4805q4.h().b;
    }

    public static synchronized boolean l() {
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m() {
        /*
            java.lang.Class<io.appmetrica.analytics.impl.n0> r0 = io.appmetrica.analytics.impl.C4729n0.class
            monitor-enter(r0)
            io.appmetrica.analytics.impl.n0 r1 = io.appmetrica.analytics.impl.C4729n0.e     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.util.concurrent.FutureTask r2 = r1.c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            io.appmetrica.analytics.impl.za r1 = r1.k()     // Catch: java.lang.Throwable -> L1b
            io.appmetrica.analytics.impl.Yb r1 = r1.j()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 0
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4729n0.m():boolean");
    }

    public static synchronized void n() {
        e = null;
        f = false;
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        g().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        f = true;
    }

    public static C4729n0 r() {
        return e;
    }

    public static void setDataSendingEnabled(boolean z) {
        g().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        g().setUserProfileID(str);
    }

    public final void b(boolean z) {
        Executor executorA = z ? C4805q4.h().c.a() : new BlockingExecutor();
        executorA.execute(new N61(23, this));
        executorA.execute(this.c);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        k().a(appMetricaConfig);
    }

    public final String f() {
        return k().f();
    }

    public final Map<String, String> h() {
        return k().h();
    }

    public final AdvIdentifiersResult i() {
        return k().i();
    }

    public final Yb j() {
        return k().j();
    }

    public final InterfaceC5026za k() {
        try {
            return (InterfaceC5026za) this.c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final /* synthetic */ void o() {
        new C4661k4(this.a).a(this.a);
        C4805q4.h().a(this.a).a();
    }

    public final InterfaceC5026za p() {
        InterfaceC5026za interfaceC5026za;
        C4610i0 c4610i0 = this.b;
        Context context = this.a;
        InterfaceC5002ya interfaceC5002ya = this.d;
        synchronized (c4610i0) {
            try {
                if (c4610i0.d == null) {
                    if (c4610i0.a(context)) {
                        c4610i0.d = new C4872t0();
                    } else {
                        c4610i0.d = new C4824r0(context, interfaceC5002ya);
                    }
                }
                interfaceC5026za = c4610i0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5026za;
    }

    public final Oa c(ReporterConfig reporterConfig) {
        return k().c(reporterConfig);
    }

    public final U9 d() {
        return k().d();
    }

    public final C4852s4 c() {
        return this.d.a();
    }

    public final void b() {
        k().e();
    }

    public static void a(Location location) {
        g().a(location);
    }

    public static void a(boolean z) {
        g().a(z);
    }

    public static void a(String str, String str2) {
        g().a(str, str2);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        k().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        k().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        k().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        k().a(startupParamsCallback, list);
    }

    public static synchronized void a(C4729n0 c4729n0) {
        e = c4729n0;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final Pa a() {
        return k().a();
    }
}
