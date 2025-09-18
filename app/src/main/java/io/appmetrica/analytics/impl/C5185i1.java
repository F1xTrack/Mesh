package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
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
import io.appmetrica.analytics.internal.p029js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.p029js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.List;
import java.util.Map;
import p000.N61;
import p000.RunnableC8176Qp0;

/* renamed from: io.appmetrica.analytics.impl.i1 */
/* loaded from: classes2.dex */
public final class C5185i1 {

    /* renamed from: a */
    public final C5334o0 f31880a;

    /* renamed from: b */
    public final C4430Cn f31881b;

    /* renamed from: c */
    public final C4522Gh f31882c;

    /* renamed from: d */
    public final C4439D7 f31883d;

    /* renamed from: e */
    public final C5204ik f31884e;

    /* renamed from: f */
    public final C4531H2 f31885f;

    /* renamed from: g */
    public final C5106em f31886g;

    /* renamed from: h */
    public final C4979Zj f31887h;

    public C5185i1(C5334o0 c5334o0, C4531H2 c4531h2, C5204ik c5204ik, C4430Cn c4430Cn, C5106em c5106em, C4522Gh c4522Gh, C4439D7 c4439d7, C4979Zj c4979Zj) {
        this.f31880a = c5334o0;
        this.f31881b = c4430Cn;
        this.f31882c = c4522Gh;
        this.f31883d = c4439d7;
        this.f31885f = c4531h2;
        this.f31886g = c5106em;
        this.f31884e = c5204ik;
        this.f31887h = c4979Zj;
    }

    /* renamed from: c */
    public static IHandlerExecutor m20520c() {
        return C5388q4.m20928h().f32420c.m20407a();
    }

    /* renamed from: a */
    public final void m20526a(Context context, AppMetricaConfig appMetricaConfig) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30214f.mo19211a(context);
        c4531h2.f30210b.mo19211a(appMetricaConfig);
        C5106em c5106em = this.f31886g;
        Context applicationContext = context.getApplicationContext();
        c5106em.f31641e.m19493a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c5106em.f31640d.m20089a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c5106em.f31637a.getClass();
        C5309n0 c5309n0M20763a = C5309n0.m20763a(applicationContext, true);
        c5309n0M20763a.f32239d.mo20472a(appMetricaConfig, c5309n0M20763a);
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC8176Qp0(this, context, appMetricaConfig, 23));
        this.f31880a.getClass();
        synchronized (C5309n0.class) {
            C5309n0.f32235f = true;
        }
    }

    /* renamed from: b */
    public final String m20547b() {
        this.f31880a.getClass();
        C5309n0 c5309n0 = C5309n0.f32234e;
        if (c5309n0 == null) {
            return null;
        }
        return c5309n0.m20789k().mo20999f();
    }

    /* renamed from: d */
    public final C4947Yb m20557d() {
        this.f31880a.getClass();
        return C5309n0.f32234e.m20789k().mo21002j();
    }

    /* renamed from: e */
    public final void m20560e() {
        m20557d().f31104a.mo19406a(this.f31887h.m20089a());
    }

    /* renamed from: f */
    public final void m20562f() {
        this.f31885f.f30209a.mo19211a(null);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4649M0(this));
    }

    /* renamed from: c */
    public final void m20554c(Activity activity) {
        this.f31885f.f30209a.mo19211a(null);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4912X0(this, activity));
    }

    /* renamed from: b */
    public final void m20549b(Context context, AppMetricaConfig appMetricaConfig) {
        C5334o0 c5334o0 = this.f31880a;
        Context applicationContext = context.getApplicationContext();
        c5334o0.getClass();
        C5309n0 c5309n0M20763a = C5309n0.m20763a(applicationContext, false);
        c5309n0M20763a.m20789k().mo20989a(this.f31883d.m19316b(appMetricaConfig));
    }

    /* renamed from: e */
    public final void m20561e(String str) {
        this.f31885f.getClass();
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4577J0(this, str));
    }

    /* renamed from: d */
    public final void m20558d(String str) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30218j.mo19211a(str);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4481F0(this, str));
    }

    public C5185i1() {
        this(C5388q4.m20928h().m20933c(), new C4430Cn());
    }

    /* renamed from: c */
    public final void m20556c(String str, String str2) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30227s.mo19211a(str);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5060d1(this, str, str2));
    }

    public C5185i1(C5334o0 c5334o0, C4430Cn c4430Cn) {
        this(c5334o0, new C4531H2(c5334o0), new C5204ik(c5334o0), c4430Cn, new C5106em(c5334o0, c4430Cn), C4522Gh.m19449a(), C5388q4.m20928h().m20937g(), C5388q4.m20928h().m20941l());
    }

    /* renamed from: b */
    public final void m20550b(String str) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30227s.mo19211a(str);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5035c1(this, str));
    }

    /* renamed from: d */
    public final void m20559d(String str, String str2) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        if (c4531h2.f30223o.mo19211a(str).f32232a) {
            this.f31886g.getClass();
            IHandlerExecutor iHandlerExecutorM20520c = m20520c();
            ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4816T0(this, str, str2));
        }
    }

    /* renamed from: c */
    public final void m20555c(String str) {
        if (this.f31884e.mo19211a((Void) null).f32232a && this.f31885f.f30222n.mo19211a(str).f32232a) {
            this.f31886g.getClass();
            IHandlerExecutor iHandlerExecutorM20520c = m20520c();
            ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4840U0(this, str));
        }
    }

    /* renamed from: b */
    public final void m20548b(Activity activity) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30211c.mo19211a(activity);
        this.f31886g.getClass();
        Intent intentM20351a = C5106em.m20351a(activity);
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4407C0(this, intentM20351a));
    }

    /* renamed from: a */
    public final void m20524a(Activity activity) {
        this.f31885f.f30209a.mo19211a(null);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5010b1(this, activity));
    }

    /* renamed from: b */
    public final void m20552b(boolean z) {
        this.f31885f.getClass();
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4529H0(this, z));
    }

    /* renamed from: b */
    public final void m20551b(String str, String str2) {
        this.f31885f.f30220l.mo19211a(str);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4768R0(this, str, str2));
    }

    /* renamed from: a */
    public final void m20525a(Application application) {
        this.f31885f.f30213e.mo19211a(application);
        this.f31886g.f31639c.m20892a(application);
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new N61(17, this));
    }

    /* renamed from: b */
    public final void m20553b(Object... objArr) {
        this.f31885f.f30209a.mo19211a(null);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new N61(18, objArr));
    }

    /* renamed from: a */
    public final void m20544a(String str, Map<String, Object> map) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30227s.mo19211a(str);
        this.f31886g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5085e1(this, str, listFromMap));
    }

    /* renamed from: a */
    public final void m20543a(String str, Throwable th) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30228t.mo19211a(str);
        this.f31886g.getClass();
        if (th == null) {
            th = new C4698O1();
            th.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5110f1(this, str, th));
    }

    /* renamed from: a */
    public final void m20542a(String str, String str2, Throwable th) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30229u.mo19211a(str);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5135g1(this, str, str2, th));
    }

    /* renamed from: a */
    public final void m20545a(Throwable th) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30230v.mo19211a(th);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC5160h1(this, th));
    }

    /* renamed from: a */
    public final void m20540a(String str) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30217i.mo19211a(str);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4432D0(this, str));
    }

    /* renamed from: a */
    public final void m20529a(Intent intent) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30212d.mo19211a(intent);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4457E0(this, intent));
    }

    /* renamed from: a */
    public final void m20530a(Location location) {
        this.f31885f.getClass();
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4505G0(this, location));
    }

    /* renamed from: a */
    public final void m20546a(boolean z) {
        this.f31885f.getClass();
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4553I0(this, z));
    }

    /* renamed from: a */
    public final void m20539a(UserProfile userProfile) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30231w.mo19211a(userProfile);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4601K0(this, userProfile));
    }

    /* renamed from: a */
    public final void m20537a(Revenue revenue) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30232x.mo19211a(revenue);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4625L0(this, revenue));
    }

    /* renamed from: a */
    public final void m20532a(AdRevenue adRevenue) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30233y.mo19211a(adRevenue);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4673N0(this, adRevenue));
    }

    /* renamed from: a */
    public final void m20538a(ECommerceEvent eCommerceEvent) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30234z.mo19211a(eCommerceEvent);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4697O0(this, eCommerceEvent));
    }

    /* renamed from: a */
    public final void m20535a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30215g.mo19211a(deferredDeeplinkParametersListener);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4721P0(this, deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public final void m20534a(DeferredDeeplinkListener deferredDeeplinkListener) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30215g.mo19211a(deferredDeeplinkListener);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4745Q0(this, deferredDeeplinkListener));
    }

    /* renamed from: a */
    public final InterfaceC4707Oa m20521a(Context context, String str) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30214f.mo19211a(context);
        c4531h2.f30219k.mo19211a(str);
        C5106em c5106em = this.f31886g;
        c5106em.f31641e.m19493a(context.getApplicationContext());
        return this.f31882c.m19450a(context.getApplicationContext(), str);
    }

    /* renamed from: a */
    public final void m20527a(Context context, ReporterConfig reporterConfig) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30214f.mo19211a(context);
        c4531h2.f30216h.mo19211a(reporterConfig);
        C5106em c5106em = this.f31886g;
        c5106em.f31641e.m19493a(context.getApplicationContext());
        C4522Gh c4522Gh = this.f31882c;
        Context applicationContext = context.getApplicationContext();
        if (((C5601yh) c4522Gh.f30184a.get(reporterConfig.apiKey)) == null) {
            synchronized (c4522Gh.f30184a) {
                try {
                    if (((C5601yh) c4522Gh.f30184a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorM20407a = C5388q4.m20928h().f32420c.m20407a();
                        c4522Gh.f30185b.getClass();
                        if (C5309n0.f32234e == null) {
                            ((C5543w9) iHandlerExecutorM20407a).f32761b.post(new RunnableC4474Eh(c4522Gh, applicationContext));
                        }
                        C5601yh c5601yh = new C5601yh(applicationContext.getApplicationContext(), str, new C5334o0());
                        c4522Gh.f30184a.put(str, c5601yh);
                        c5601yh.m21220a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m20531a(WebView webView) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30221m.mo19211a(webView);
        C4430Cn c4430Cn = this.f31886g.f31638b;
        c4430Cn.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), AppMetricaModule.NAME);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                C5632zn c5632zn = new C5632zn();
                synchronized (c4430Cn) {
                    try {
                        PublicLogger publicLogger = c4430Cn.f29980b;
                        if (publicLogger == null) {
                            c4430Cn.f29979a.add(c5632zn);
                        } else {
                            c5632zn.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                c4430Cn.m19303a(new C4380An());
            }
        } catch (Throwable th) {
            c4430Cn.m19303a(new C4405Bn(th));
        }
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4792S0(this));
    }

    /* renamed from: a */
    public final IdentifiersResult m20522a(Context context) {
        this.f31885f.f30224p.mo19211a(context);
        C5106em c5106em = this.f31886g;
        c5106em.f31641e.m19493a(context.getApplicationContext());
        return C5388q4.m20928h().m20929a(context.getApplicationContext()).m20034a();
    }

    /* renamed from: a */
    public final void m20541a(String str, String str2) {
        this.f31885f.getClass();
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4864V0(this, str, str2));
    }

    /* renamed from: a */
    public final void m20523a() {
        this.f31885f.getClass();
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4888W0(this));
    }

    /* renamed from: a */
    public final void m20528a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30214f.mo19211a(context);
        c4531h2.f30224p.mo19211a(startupParamsCallback);
        C5106em c5106em = this.f31886g;
        c5106em.f31641e.m19493a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4936Y0(this, context, startupParamsCallback, list));
    }

    /* renamed from: a */
    public final void m20533a(AnrListener anrListener) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30225q.mo19211a(anrListener);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4960Z0(this, anrListener));
    }

    /* renamed from: a */
    public final void m20536a(ExternalAttribution externalAttribution) {
        C4531H2 c4531h2 = this.f31885f;
        c4531h2.f30209a.mo19211a(null);
        c4531h2.f30226r.mo19211a(externalAttribution);
        this.f31886g.getClass();
        IHandlerExecutor iHandlerExecutorM20520c = m20520c();
        ((C5543w9) iHandlerExecutorM20520c).f32761b.post(new RunnableC4985a1(this, externalAttribution));
    }

    /* renamed from: a */
    public static /* synthetic */ void m20519a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorM20796a = C5388q4.m20928h().m20939j().m20796a();
        if (moduleAdRevenueProcessorM20796a != null) {
            moduleAdRevenueProcessorM20796a.process(objArr);
        }
    }

    /* renamed from: a */
    public static InterfaceC4491Fa m20518a(C5185i1 c5185i1) {
        return c5185i1.m20557d().f31104a;
    }
}
