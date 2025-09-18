package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import defpackage.O90;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4824r0 implements InterfaceC5026za {
    public final Context a;
    public final InterfaceC5002ya b;
    public final C4719me c;
    public final Pk d;
    public final Af e;
    public final Re f;
    public final Bh g;
    public final Nh h;
    public final D7 i;
    public final Zj j;
    public volatile Yb k;
    public final C4489d0 l;
    public boolean m;

    public C4824r0(Context context, InterfaceC5002ya interfaceC5002ya) {
        this.a = context;
        this.b = interfaceC5002ya;
        C4719me c4719meB = C4805q4.h().b(context);
        this.c = c4719meB;
        Wc.a();
        C4805q4 c4805q4H = C4805q4.h();
        c4805q4H.j().a(new Z3(context));
        Re reA = AbstractC4848s0.a(context, AbstractC4848s0.a(interfaceC5002ya.b(), this));
        this.f = reA;
        D7 d7G = c4805q4H.g();
        this.i = d7G;
        Nh nhA = AbstractC4848s0.a(reA, context, interfaceC5002ya.getDefaultExecutor());
        this.h = nhA;
        d7G.a(nhA);
        Pk pkA = AbstractC4848s0.a(context, nhA, c4719meB, interfaceC5002ya.b());
        this.d = pkA;
        nhA.a(pkA);
        this.e = AbstractC4848s0.a(nhA, c4719meB, interfaceC5002ya.b());
        this.g = AbstractC4848s0.a(context, reA, nhA, interfaceC5002ya.b(), pkA);
        this.j = c4805q4H.l();
        this.l = new C4489d0(context, c4719meB);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final Oa c(ReporterConfig reporterConfig) {
        return this.g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void clearAppEnvironment() {
        k().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final U9 d() {
        return this.d.e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void e() {
        C4489d0 c4489d0 = this.l;
        AppMetricaConfig appMetricaConfigF = c4489d0.b.f();
        if (appMetricaConfigF == null) {
            C4681l0 c4681l0 = c4489d0.c;
            Context context = c4489d0.a;
            c4681l0.getClass();
            AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (c4681l0.a.c()) {
                c4681l0.b.getClass();
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
            appMetricaConfigF = builderNewConfigBuilder.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigF, new C4801q0(this, appMetricaConfigF, mainPublicOrAnonymousLogger))) {
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final String f() {
        return this.d.d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final Map<String, String> h() {
        return this.d.b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final AdvIdentifiersResult i() {
        return this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final Yb j() {
        return this.k;
    }

    public final Fa k() {
        Yb yb = this.k;
        O90.c(yb);
        return yb.a;
    }

    public final Bh l() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void putAppEnvironmentValue(String str, String str2) {
        k().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void setDataSendingEnabled(boolean z) {
        k().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void setUserProfileID(String str) {
        k().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new C4777p0(this, appMetricaConfig, orCreateMainPublicLogger));
        if (zA || this.m) {
            z = false;
        } else {
            a(appMetricaConfig, orCreateMainPublicLogger);
            z = true;
        }
        if (zA || z) {
            this.c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.m = true;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.A6
    public final void a(int i, Bundle bundle) {
        this.d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(ReporterConfig reporterConfig) {
        this.g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.d.a(startupParamsCallback, list, AbstractC4450bb.c(this.f.a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC4598hc interfaceC4598hc) {
        if (this.k == null) {
            a(appMetricaConfig, publicLogger);
            this.e.a();
            Wb wbA = interfaceC4598hc.a();
            C5023z7 c5023z7 = new C5023z7(wbA);
            Yb yb = new Yb(wbA, c5023z7);
            this.b.c().a(c5023z7);
            this.k = yb;
            C4853s5 c4853s5 = this.j.b;
            synchronized (c4853s5) {
                try {
                    c4853s5.a = wbA;
                    Iterator it = c4853s5.b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4933vd) it.next()).consume(wbA);
                    }
                    c4853s5.b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC4598hc.a();
        return false;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
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
            this.b.d().a(this.a, appMetricaConfig, this);
            this.b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.j.a();
        } else {
            Zj zj = this.j;
            synchronized (zj) {
                if (zj.g) {
                    zj.a.b(zj.c, EnumC4704m.RESUMED);
                    zj.a.b(zj.d, EnumC4704m.PAUSED);
                    zj.g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        Pk pk = this.d;
        pk.e = publicLogger;
        pk.b(appMetricaConfig.customHosts);
        Pk pk2 = this.d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        pk2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.d.a(str);
        if (str != null) {
            this.d.b("api");
        }
        Nh nh = this.h;
        Boolean bool3 = appMetricaConfig.locationTracking;
        Boolean bool4 = appMetricaConfig.dataSendingEnabled;
        if (hn.a(bool3)) {
            nh.a.b.setLocationTracking(bool3.booleanValue());
        }
        if (hn.a(bool4)) {
            nh.a.b.setDataSendingEnabled(bool4.booleanValue());
        } else {
            nh.getClass();
        }
        T5 t5A = T5.a();
        T4 t4 = nh.a;
        nh.a(Nh.a(t5A, t4), t4, 1, null);
        this.d.i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(Location location) {
        k().a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(boolean z) {
        k().a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(String str, String str2) {
        k().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.Qa
    public final Pa a() {
        return this.g;
    }
}
