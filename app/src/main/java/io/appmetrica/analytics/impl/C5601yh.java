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
public final class C5601yh implements InterfaceC4707Oa {

    /* renamed from: a */
    public final C5334o0 f32856a;

    /* renamed from: b */
    public final C4856Ug f32857b;

    /* renamed from: c */
    public final IHandlerExecutor f32858c;

    /* renamed from: d */
    public final Context f32859d;

    /* renamed from: e */
    public final ReporterConfig f32860e;

    /* renamed from: f */
    public final C4546Hh f32861f;

    /* renamed from: g */
    public final C5123fe f32862g;

    public C5601yh(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C5334o0());
    }

    /* renamed from: a */
    public static InterfaceC4707Oa m21219a(C5334o0 c5334o0, Context context, ReporterConfig reporterConfig) {
        c5334o0.getClass();
        return C5309n0.m20763a(context, false).m20789k().mo20996c(reporterConfig);
    }

    /* renamed from: c */
    public final void m21221c(String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5276lh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5501uh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f32862g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5076dh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5476th(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f32857b.f30821h.mo19211a(adRevenue);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5176hh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f32857b.f30822i.mo19211a(eCommerceEvent);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5201ih(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f32857b.f30815b.mo19211a(str);
        this.f32861f.getClass();
        if (th == null) {
            th = new C4698O1();
            th.fillInStackTrace();
        }
        this.f32858c.execute(new RunnableC4976Zg(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f32857b.f30814a.mo19211a(str);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5526vh(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f32857b.f30820g.mo19211a(revenue);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5151gh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f32857b.f30818e.mo19211a(th);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5026bh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f32857b.f30819f.mo19211a(userProfile);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5126fh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5051ch(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5451sh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5251kh(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5351oh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5101eh(this, str));
    }

    public C5601yh(Context context, String str, C5334o0 c5334o0) {
        this(context, new C4856Ug(), c5334o0, new C4546Hh(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19683a(C4671Mm c4671Mm) {
        this.f32857b.f30817d.mo19211a(c4671Mm);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5401qh(this, c4671Mm));
    }

    public C5601yh(Context context, C4856Ug c4856Ug, C5334o0 c5334o0, C4546Hh c4546Hh, ReporterConfig reporterConfig) {
        this(context, c4856Ug, c5334o0, c4546Hh, reporterConfig, new C5123fe(new C5226jh(c5334o0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.f32857b.f30821h.mo19211a(adRevenue);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5376ph(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f32857b.f30814a.mo19211a(str);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5551wh(this, str, str2));
    }

    public C5601yh(Context context, C4856Ug c4856Ug, C5334o0 c5334o0, C4546Hh c4546Hh, ReporterConfig reporterConfig, C5123fe c5123fe) {
        this.f32858c = C5388q4.m20928h().m20935e().m20407a();
        this.f32859d = context;
        this.f32857b = c4856Ug;
        this.f32856a = c5334o0;
        this.f32861f = c4546Hh;
        this.f32860e = reporterConfig;
        this.f32862g = c5123fe;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f32857b.f30816c.mo19211a(str);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5001ah(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19684a(C4815T c4815t) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5426rh(this, c4815t));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f32857b.f30814a.mo19211a(str);
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5576xh(this, str, CollectionUtils.getListFromMap(map)));
    }

    /* renamed from: a */
    public final void m21220a(ReporterConfig reporterConfig) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5301mh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f32857b.getClass();
        this.f32861f.getClass();
        this.f32858c.execute(new RunnableC5326nh(this, moduleEvent));
    }
}
