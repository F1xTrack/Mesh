package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import defpackage.N61;
import defpackage.RunnableC1313Qp0;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.i1 */
/* loaded from: classes2.dex */
public final class C4611i1 {
    public final C4753o0 a;
    public final Cn b;
    public final Gh c;
    public final D7 d;
    public final C4629ik e;
    public final H2 f;
    public final C4536em g;
    public final Zj h;

    public C4611i1(C4753o0 c4753o0, H2 h2, C4629ik c4629ik, Cn cn, C4536em c4536em, Gh gh, D7 d7, Zj zj) {
        this.a = c4753o0;
        this.b = cn;
        this.c = gh;
        this.d = d7;
        this.f = h2;
        this.g = c4536em;
        this.e = c4629ik;
        this.h = zj;
    }

    public static IHandlerExecutor c() {
        return C4805q4.h().c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        H2 h2 = this.f;
        h2.f.a(context);
        h2.b.a(appMetricaConfig);
        C4536em c4536em = this.g;
        Context applicationContext = context.getApplicationContext();
        c4536em.e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c4536em.d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c4536em.a.getClass();
        C4729n0 c4729n0A = C4729n0.a(applicationContext, true);
        c4729n0A.d.a(appMetricaConfig, c4729n0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC1313Qp0(this, context, appMetricaConfig, 23));
        this.a.getClass();
        synchronized (C4729n0.class) {
            C4729n0.f = true;
        }
    }

    public final String b() {
        this.a.getClass();
        C4729n0 c4729n0 = C4729n0.e;
        if (c4729n0 == null) {
            return null;
        }
        return c4729n0.k().f();
    }

    public final Yb d() {
        this.a.getClass();
        return C4729n0.e.k().j();
    }

    public final void e() {
        d().a.a(this.h.a());
    }

    public final void f() {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new M0(this));
    }

    public final void c(Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new X0(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C4753o0 c4753o0 = this.a;
        Context applicationContext = context.getApplicationContext();
        c4753o0.getClass();
        C4729n0 c4729n0A = C4729n0.a(applicationContext, false);
        c4729n0A.k().a(this.d.b(appMetricaConfig));
    }

    public final void e(String str) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new J0(this, str));
    }

    public final void d(String str) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.j.a(str);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new F0(this, str));
    }

    public C4611i1() {
        this(C4805q4.h().c(), new Cn());
    }

    public final void c(String str, String str2) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.s.a(str);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4490d1(this, str, str2));
    }

    public C4611i1(C4753o0 c4753o0, Cn cn) {
        this(c4753o0, new H2(c4753o0), new C4629ik(c4753o0), cn, new C4536em(c4753o0, cn), Gh.a(), C4805q4.h().g(), C4805q4.h().l());
    }

    public final void b(String str) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.s.a(str);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4465c1(this, str));
    }

    public final void d(String str, String str2) {
        H2 h2 = this.f;
        h2.a.a(null);
        if (h2.o.a(str).a) {
            this.g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((C4953w9) iHandlerExecutorC).b.post(new T0(this, str, str2));
        }
    }

    public final void c(String str) {
        if (this.e.a((Void) null).a && this.f.n.a(str).a) {
            this.g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((C4953w9) iHandlerExecutorC).b.post(new U0(this, str));
        }
    }

    public final void b(Activity activity) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.c.a(activity);
        this.g.getClass();
        Intent intentA = C4536em.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new C0(this, intentA));
    }

    public final void a(Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4440b1(this, activity));
    }

    public final void b(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new H0(this, z));
    }

    public final void b(String str, String str2) {
        this.f.l.a(str);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new R0(this, str, str2));
    }

    public final void a(Application application) {
        this.f.e.a(application);
        this.g.c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new N61(17, this));
    }

    public final void b(Object... objArr) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new N61(18, objArr));
    }

    public final void a(String str, Map<String, Object> map) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.s.a(str);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4515e1(this, str, listFromMap));
    }

    public final void a(String str, Throwable th) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.t.a(str);
        this.g.getClass();
        if (th == null) {
            th = new O1();
            th.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4539f1(this, str, th));
    }

    public final void a(String str, String str2, Throwable th) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.u.a(str);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4563g1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.v.a(th);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4587h1(this, th));
    }

    public final void a(String str) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.i.a(str);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new D0(this, str));
    }

    public final void a(Intent intent) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.d.a(intent);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new E0(this, intent));
    }

    public final void a(Location location) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new G0(this, location));
    }

    public final void a(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new I0(this, z));
    }

    public final void a(UserProfile userProfile) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.w.a(userProfile);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new K0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.x.a(revenue);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new L0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.y.a(adRevenue);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new N0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.z.a(eCommerceEvent);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new O0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.g.a(deferredDeeplinkParametersListener);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new P0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.g.a(deferredDeeplinkListener);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new Q0(this, deferredDeeplinkListener));
    }

    public final Oa a(Context context, String str) {
        H2 h2 = this.f;
        h2.f.a(context);
        h2.k.a(str);
        C4536em c4536em = this.g;
        c4536em.e.a(context.getApplicationContext());
        return this.c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        H2 h2 = this.f;
        h2.f.a(context);
        h2.h.a(reporterConfig);
        C4536em c4536em = this.g;
        c4536em.e.a(context.getApplicationContext());
        Gh gh = this.c;
        Context applicationContext = context.getApplicationContext();
        if (((C5009yh) gh.a.get(reporterConfig.apiKey)) == null) {
            synchronized (gh.a) {
                try {
                    if (((C5009yh) gh.a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorA = C4805q4.h().c.a();
                        gh.b.getClass();
                        if (C4729n0.e == null) {
                            ((C4953w9) iHandlerExecutorA).b.post(new Eh(gh, applicationContext));
                        }
                        C5009yh c5009yh = new C5009yh(applicationContext.getApplicationContext(), str, new C4753o0());
                        gh.a.put(str, c5009yh);
                        c5009yh.a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    public final void a(WebView webView) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.m.a(webView);
        Cn cn = this.g.b;
        cn.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), AppMetricaModule.NAME);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                zn znVar = new zn();
                synchronized (cn) {
                    try {
                        PublicLogger publicLogger = cn.b;
                        if (publicLogger == null) {
                            cn.a.add(znVar);
                        } else {
                            znVar.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                cn.a(new An());
            }
        } catch (Throwable th) {
            cn.a(new Bn(th));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new S0(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f.p.a(context);
        C4536em c4536em = this.g;
        c4536em.e.a(context.getApplicationContext());
        return C4805q4.h().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new V0(this, str, str2));
    }

    public final void a() {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new W0(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        H2 h2 = this.f;
        h2.f.a(context);
        h2.p.a(startupParamsCallback);
        C4536em c4536em = this.g;
        c4536em.e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new Y0(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.q.a(anrListener);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new Z0(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        H2 h2 = this.f;
        h2.a.a(null);
        h2.r.a(externalAttribution);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((C4953w9) iHandlerExecutorC).b.post(new RunnableC4415a1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorA = C4805q4.h().j().a();
        if (moduleAdRevenueProcessorA != null) {
            moduleAdRevenueProcessorA.process(objArr);
        }
    }

    public static Fa a(C4611i1 c4611i1) {
        return c4611i1.d().a;
    }
}
