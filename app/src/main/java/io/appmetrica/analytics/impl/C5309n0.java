package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
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
import p000.CallableC0361Fj;
import p000.N61;

/* renamed from: io.appmetrica.analytics.impl.n0 */
/* loaded from: classes2.dex */
public final class C5309n0 implements InterfaceC4755Qa {

    /* renamed from: e */
    public static volatile C5309n0 f32234e = null;

    /* renamed from: f */
    public static volatile boolean f32235f = false;

    /* renamed from: a */
    public final Context f32236a;

    /* renamed from: b */
    public final C5184i0 f32237b;

    /* renamed from: c */
    public final FutureTask f32238c;

    /* renamed from: d */
    public final InterfaceC5594ya f32239d;

    public C5309n0(Context context) {
        this.f32236a = context;
        C5184i0 c5184i0M20931b = C5388q4.m20928h().m20931b();
        this.f32237b = c5184i0M20931b;
        this.f32239d = c5184i0M20931b.m20516a(context, C5388q4.m20928h().m20935e());
        this.f32238c = new FutureTask(new CallableC0361Fj(12, this));
    }

    /* renamed from: a */
    public static C5309n0 m20763a(Context context, boolean z) {
        C5309n0 c5309n0 = f32234e;
        if (c5309n0 == null) {
            synchronized (C5309n0.class) {
                try {
                    c5309n0 = f32234e;
                    if (c5309n0 == null) {
                        c5309n0 = new C5309n0(context);
                        c5309n0.m20779b(z);
                        C5388q4.m20928h().f32420c.m20407a().execute(new RunnableC5284m0(c5309n0));
                        f32234e = c5309n0;
                    }
                } finally {
                }
            }
        }
        return c5309n0;
    }

    public static void clearAppEnvironment() {
        m20768g().clearAppEnvironment();
    }

    /* renamed from: g */
    public static InterfaceC5446sc m20768g() {
        return m20770m() ? f32234e.m20789k() : C5388q4.m20928h().f32419b;
    }

    /* renamed from: l */
    public static synchronized boolean m20769l() {
        return f32235f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m20770m() {
        /*
            java.lang.Class<io.appmetrica.analytics.impl.n0> r0 = io.appmetrica.analytics.impl.C5309n0.class
            monitor-enter(r0)
            io.appmetrica.analytics.impl.n0 r1 = io.appmetrica.analytics.impl.C5309n0.f32234e     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.util.concurrent.FutureTask r2 = r1.f32238c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            io.appmetrica.analytics.impl.za r1 = r1.m20789k()     // Catch: java.lang.Throwable -> L1b
            io.appmetrica.analytics.impl.Yb r1 = r1.mo21002j()     // Catch: java.lang.Throwable -> L1b
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5309n0.m20770m():boolean");
    }

    /* renamed from: n */
    public static synchronized void m20771n() {
        f32234e = null;
        f32235f = false;
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        m20768g().putAppEnvironmentValue(str, str2);
    }

    /* renamed from: q */
    public static synchronized void m20772q() {
        f32235f = true;
    }

    /* renamed from: r */
    public static C5309n0 m20773r() {
        return f32234e;
    }

    public static void setDataSendingEnabled(boolean z) {
        m20768g().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        m20768g().setUserProfileID(str);
    }

    /* renamed from: b */
    public final void m20779b(boolean z) {
        Executor executorM20407a = z ? C5388q4.m20928h().f32420c.m20407a() : new BlockingExecutor();
        executorM20407a.execute(new N61(23, this));
        executorM20407a.execute(this.f32238c);
    }

    /* renamed from: c */
    public final void m20782c(AppMetricaConfig appMetricaConfig) {
        this.f32239d.mo20472a(appMetricaConfig, this);
    }

    /* renamed from: d */
    public final void m20784d(AppMetricaConfig appMetricaConfig) {
        m20789k().mo20989a(appMetricaConfig);
    }

    /* renamed from: f */
    public final String m20785f() {
        return m20789k().mo20999f();
    }

    /* renamed from: h */
    public final Map<String, String> m20786h() {
        return m20789k().mo21000h();
    }

    /* renamed from: i */
    public final AdvIdentifiersResult m20787i() {
        return m20789k().mo21001i();
    }

    /* renamed from: j */
    public final C4947Yb m20788j() {
        return m20789k().mo21002j();
    }

    /* renamed from: k */
    public final InterfaceC5619za m20789k() {
        try {
            return (InterfaceC5619za) this.f32238c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void m20790o() {
        new C5238k4(this.f32236a).m21129a(this.f32236a);
        C5388q4.m20928h().m20929a(this.f32236a).m20034a();
    }

    /* renamed from: p */
    public final InterfaceC5619za m20791p() {
        InterfaceC5619za interfaceC5619za;
        C5184i0 c5184i0 = this.f32237b;
        Context context = this.f32236a;
        InterfaceC5594ya interfaceC5594ya = this.f32239d;
        synchronized (c5184i0) {
            try {
                if (c5184i0.f31879d == null) {
                    if (c5184i0.m20517a(context)) {
                        c5184i0.f31879d = new C5459t0();
                    } else {
                        c5184i0.f31879d = new C5409r0(context, interfaceC5594ya);
                    }
                }
                interfaceC5619za = c5184i0.f31879d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5619za;
    }

    /* renamed from: c */
    public final InterfaceC4707Oa m20780c(ReporterConfig reporterConfig) {
        return m20789k().mo20996c(reporterConfig);
    }

    /* renamed from: d */
    public final C4849U9 m20783d() {
        return m20789k().mo20997d();
    }

    /* renamed from: c */
    public final C5438s4 m20781c() {
        return this.f32239d.mo20471a();
    }

    /* renamed from: b */
    public final void m20778b() {
        m20789k().mo20998e();
    }

    /* renamed from: a */
    public static void m20764a(Location location) {
        m20768g().mo19312a(location);
    }

    /* renamed from: a */
    public static void m20767a(boolean z) {
        m20768g().mo19315a(z);
    }

    /* renamed from: a */
    public static void m20766a(String str, String str2) {
        m20768g().mo19314a(str, str2);
    }

    /* renamed from: a */
    public final void m20775a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m20789k().mo20992a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public final void m20774a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m20789k().mo20991a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public final void m20776a(ReporterConfig reporterConfig) {
        m20789k().mo20993a(reporterConfig);
    }

    /* renamed from: a */
    public final void m20777a(StartupParamsCallback startupParamsCallback, List<String> list) {
        m20789k().mo20994a(startupParamsCallback, list);
    }

    /* renamed from: a */
    public static synchronized void m20765a(C5309n0 c5309n0) {
        f32234e = c5309n0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4755Qa
    /* renamed from: a */
    public final InterfaceC4731Pa mo19238a() {
        return m20789k().mo19238a();
    }
}
