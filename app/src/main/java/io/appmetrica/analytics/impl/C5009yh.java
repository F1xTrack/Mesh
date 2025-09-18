package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.yh */
/* loaded from: classes2.dex */
public final class C5009yh implements Oa {
    public final C4753o0 a;
    public final Ug b;
    public final IHandlerExecutor c;
    public final Context d;
    public final ReporterConfig e;
    public final Hh f;
    public final C4552fe g;

    public C5009yh(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C4753o0());
    }

    public static Oa a(C4753o0 c4753o0, Context context, ReporterConfig reporterConfig) {
        c4753o0.getClass();
        return C4729n0.a(context, false).k().c(reporterConfig);
    }

    public final void c(String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4698lh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4913uh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4506dh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4889th(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new RunnableC4603hh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.b.i.a(eCommerceEvent);
        this.f.getClass();
        this.c.execute(new RunnableC4626ih(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.b.b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new O1();
            th.fillInStackTrace();
        }
        this.c.execute(new Zg(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC4937vh(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.b.g.a(revenue);
        this.f.getClass();
        this.c.execute(new RunnableC4579gh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.b.e.a(th);
        this.f.getClass();
        this.c.execute(new RunnableC4456bh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.b.f.a(userProfile);
        this.f.getClass();
        this.c.execute(new RunnableC4555fh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4481ch(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4865sh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4674kh(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4770oh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4531eh(this, str));
    }

    public C5009yh(Context context, String str, C4753o0 c4753o0) {
        this(context, new Ug(), c4753o0, new Hh(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Ra
    public final void a(Mm mm) {
        this.b.d.a(mm);
        this.f.getClass();
        this.c.execute(new RunnableC4818qh(this, mm));
    }

    public C5009yh(Context context, Ug ug, C4753o0 c4753o0, Hh hh, ReporterConfig reporterConfig) {
        this(context, ug, c4753o0, hh, reporterConfig, new C4552fe(new C4650jh(c4753o0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new RunnableC4794ph(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC4961wh(this, str, str2));
    }

    public C5009yh(Context context, Ug ug, C4753o0 c4753o0, Hh hh, ReporterConfig reporterConfig, C4552fe c4552fe) {
        this.c = C4805q4.h().e().a();
        this.d = context;
        this.b = ug;
        this.a = c4753o0;
        this.f = hh;
        this.e = reporterConfig;
        this.g = c4552fe;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.b.c.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC4431ah(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Ra
    public final void a(T t) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4841rh(this, t));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC4985xh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4722mh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC4746nh(this, moduleEvent));
    }
}
