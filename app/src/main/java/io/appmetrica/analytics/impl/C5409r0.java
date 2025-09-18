package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.r0 */
/* loaded from: classes2.dex */
public final class C5409r0 implements InterfaceC5619za {

    /* renamed from: a */
    public final Context f32478a;

    /* renamed from: b */
    public final InterfaceC5594ya f32479b;

    /* renamed from: c */
    public final C5298me f32480c;

    /* renamed from: d */
    public final C4741Pk f32481d;

    /* renamed from: e */
    public final C4372Af f32482e;

    /* renamed from: f */
    public final C4782Re f32483f;

    /* renamed from: g */
    public final C4399Bh f32484g;

    /* renamed from: h */
    public final C4690Nh f32485h;

    /* renamed from: i */
    public final C4439D7 f32486i;

    /* renamed from: j */
    public final C4979Zj f32487j;

    /* renamed from: k */
    public volatile C4947Yb f32488k;

    /* renamed from: l */
    public final C5059d0 f32489l;

    /* renamed from: m */
    public boolean f32490m;

    public C5409r0(Context context, InterfaceC5594ya interfaceC5594ya) {
        this.f32478a = context;
        this.f32479b = interfaceC5594ya;
        C5298me c5298meM20932b = C5388q4.m20928h().m20932b(context);
        this.f32480c = c5298meM20932b;
        C4900Wc.m19950a();
        C5388q4 c5388q4M20928h = C5388q4.m20928h();
        c5388q4M20928h.m20939j().m20798a(new C4963Z3(context));
        C4782Re c4782ReM21036a = AbstractC5434s0.m21036a(context, AbstractC5434s0.m21032a(interfaceC5594ya.mo20473b(), this));
        this.f32483f = c4782ReM21036a;
        C4439D7 c4439d7M20937g = c5388q4M20928h.m20937g();
        this.f32486i = c4439d7M20937g;
        C4690Nh c4690NhM21034a = AbstractC5434s0.m21034a(c4782ReM21036a, context, interfaceC5594ya.getDefaultExecutor());
        this.f32485h = c4690NhM21034a;
        c4439d7M20937g.m19313a(c4690NhM21034a);
        C4741Pk c4741PkM21035a = AbstractC5434s0.m21035a(context, c4690NhM21034a, c5298meM20932b, interfaceC5594ya.mo20473b());
        this.f32481d = c4741PkM21035a;
        c4690NhM21034a.m19662a(c4741PkM21035a);
        this.f32482e = AbstractC5434s0.m21031a(c4690NhM21034a, c5298meM20932b, interfaceC5594ya.mo20473b());
        this.f32484g = AbstractC5434s0.m21033a(context, c4782ReM21036a, c4690NhM21034a, interfaceC5594ya.mo20473b(), c4741PkM21035a);
        this.f32487j = c5388q4M20928h.m20941l();
        this.f32489l = new C5059d0(context, c5298meM20932b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: c */
    public final InterfaceC4707Oa mo20996c(ReporterConfig reporterConfig) {
        return this.f32484g.mo19242b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void clearAppEnvironment() {
        m21003k().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: d */
    public final C4849U9 mo20997d() {
        return this.f32481d.m19727e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: e */
    public final void mo20998e() {
        C5059d0 c5059d0 = this.f32489l;
        AppMetricaConfig appMetricaConfigM20730f = c5059d0.f31456b.m20730f();
        if (appMetricaConfigM20730f == null) {
            C5259l0 c5259l0 = c5059d0.f31457c;
            Context context = c5059d0.f31455a;
            c5259l0.getClass();
            AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (c5259l0.f32115a.m19887c()) {
                c5259l0.f32116b.getClass();
                try {
                    File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                    boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                    File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                    boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                    if (zExists || zExists2) {
                        builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
                    }
                } catch (Throwable unused) {
                }
            }
            appMetricaConfigM20730f = builderNewConfigBuilder.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (m20995a(mainPublicOrAnonymousLogger, appMetricaConfigM20730f, new C5384q0(this, appMetricaConfigM20730f, mainPublicOrAnonymousLogger))) {
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: f */
    public final String mo20999f() {
        return this.f32481d.m19726d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: h */
    public final Map<String, String> mo21000h() {
        return this.f32481d.m19720b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: i */
    public final AdvIdentifiersResult mo21001i() {
        return this.f32481d.m19710a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: j */
    public final C4947Yb mo21002j() {
        return this.f32488k;
    }

    /* renamed from: k */
    public final InterfaceC4491Fa m21003k() {
        C4947Yb c4947Yb = this.f32488k;
        O90.m5965c(c4947Yb);
        return c4947Yb.f31104a;
    }

    /* renamed from: l */
    public final C4399Bh m21004l() {
        return this.f32484g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void putAppEnvironmentValue(String str, String str2) {
        m21003k().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void setDataSendingEnabled(boolean z) {
        m21003k().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void setUserProfileID(String str) {
        m21003k().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20989a(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zM20995a = m20995a(orCreateMainPublicLogger, appMetricaConfig, new C5359p0(this, appMetricaConfig, orCreateMainPublicLogger));
        if (zM20995a || this.f32490m) {
            z = false;
        } else {
            m20990a(appMetricaConfig, orCreateMainPublicLogger);
            z = true;
        }
        if (zM20995a || z) {
            this.f32480c.m20716a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zM20995a) {
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f32490m = true;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC4363A6
    /* renamed from: a */
    public final void mo19185a(int i, Bundle bundle) {
        this.f32481d.m19722b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20992a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f32482e.m19202a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20991a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f32482e.m19201a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20993a(ReporterConfig reporterConfig) {
        this.f32484g.mo19239a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20994a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f32481d.m19715a(startupParamsCallback, list, AbstractC5020bb.m20176c(this.f32483f.f30696a.getAsString("PROCESS_CFG_CLIDS")));
    }

    /* renamed from: a */
    public final boolean m20995a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC5171hc interfaceC5171hc) {
        if (this.f32488k == null) {
            m20990a(appMetricaConfig, publicLogger);
            this.f32482e.m19200a();
            C4899Wb c4899WbMo20499a = interfaceC5171hc.mo20499a();
            C5616z7 c5616z7 = new C5616z7(c4899WbMo20499a);
            C4947Yb c4947Yb = new C4947Yb(c4899WbMo20499a, c5616z7);
            this.f32479b.mo20474c().m19826a(c5616z7);
            this.f32488k = c4947Yb;
            C5439s5 c5439s5 = this.f32487j.f31210b;
            synchronized (c5439s5) {
                try {
                    c5439s5.f32533a = c4899WbMo20499a;
                    Iterator it = c5439s5.f32534b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5522vd) it.next()).consume(c4899WbMo20499a);
                    }
                    c5439s5.f32534b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC5171hc.mo20499a();
        return false;
    }

    /* renamed from: a */
    public final void m20990a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f32479b.mo20475d().m20383a(this.f32478a, appMetricaConfig, this);
            this.f32479b.mo20475d().m20384b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f32479b.mo20475d().m20382a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f32487j.m20089a();
        } else {
            C4979Zj c4979Zj = this.f32487j;
            synchronized (c4979Zj) {
                if (c4979Zj.f31215g) {
                    c4979Zj.f31209a.m20896b(c4979Zj.f31211c, EnumC5283m.RESUMED);
                    c4979Zj.f31209a.m20896b(c4979Zj.f31212d, EnumC5283m.PAUSED);
                    c4979Zj.f31215g = false;
                }
            }
        }
        this.f32483f.m19769d(appMetricaConfig);
        C4741Pk c4741Pk = this.f32481d;
        c4741Pk.f30631e = publicLogger;
        c4741Pk.m19724b(appMetricaConfig.customHosts);
        C4741Pk c4741Pk2 = this.f32481d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        c4741Pk2.m19719a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f32481d.m19717a(str);
        if (str != null) {
            this.f32481d.m19723b("api");
        }
        C4690Nh c4690Nh = this.f32485h;
        Boolean bool3 = appMetricaConfig.locationTracking;
        Boolean bool4 = appMetricaConfig.dataSendingEnabled;
        if (AbstractC5182hn.m20511a(bool3)) {
            c4690Nh.f30522a.f31090b.setLocationTracking(bool3.booleanValue());
        }
        if (AbstractC5182hn.m20511a(bool4)) {
            c4690Nh.f30522a.f31090b.setDataSendingEnabled(bool4.booleanValue());
        } else {
            c4690Nh.getClass();
        }
        C4821T5 c4821t5M19833a = C4821T5.m19833a();
        C4820T4 c4820t4 = c4690Nh.f30522a;
        c4690Nh.m19663a(C4690Nh.m19660a(c4821t5M19833a, c4820t4), c4820t4, 1, null);
        this.f32481d.m19731i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19312a(Location location) {
        m21003k().mo19312a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19315a(boolean z) {
        m21003k().mo19315a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19314a(String str, String str2) {
        m21003k().mo19314a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC4755Qa
    /* renamed from: a */
    public final InterfaceC4731Pa mo19238a() {
        return this.f32484g;
    }
}
