package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.D7 */
/* loaded from: classes2.dex */
public final class C4439D7 implements InterfaceC5446sc {

    /* renamed from: a */
    public Location f30000a;

    /* renamed from: b */
    public Boolean f30001b;

    /* renamed from: c */
    public Boolean f30002c;

    /* renamed from: d */
    public final LinkedHashMap f30003d = new LinkedHashMap();

    /* renamed from: e */
    public final LinkedHashMap f30004e = new LinkedHashMap();

    /* renamed from: f */
    public boolean f30005f;

    /* renamed from: g */
    public String f30006g;

    /* renamed from: h */
    public boolean f30007h;

    /* renamed from: i */
    public C4690Nh f30008i;

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19315a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        this.f30001b = boolValueOf;
        C4690Nh c4690Nh = this.f30008i;
        if (c4690Nh != null) {
            Boolean bool = this.f30002c;
            if (AbstractC5182hn.m20511a(boolValueOf)) {
                c4690Nh.f30522a.f31090b.setLocationTracking(z);
            }
            if (AbstractC5182hn.m20511a(bool)) {
                c4690Nh.f30522a.f31090b.setDataSendingEnabled(bool.booleanValue());
            }
            C4821T5 c4821t5M19833a = C4821T5.m19833a();
            C4820T4 c4820t4 = c4690Nh.f30522a;
            c4690Nh.m19663a(C4690Nh.m19660a(c4821t5M19833a, c4820t4), c4820t4, 1, null);
        }
    }

    /* renamed from: b */
    public final AppMetricaConfig m19316b(AppMetricaConfig appMetricaConfig) {
        if (this.f30007h) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC5182hn.m20511a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC5182hn.m20511a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC5182hn.m20511a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f30003d;
        if (!AbstractC5182hn.m20514a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC5182hn.m20514a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f30004e;
        if (!AbstractC5182hn.m20514a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC5182hn.m20514a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC5182hn.m20514a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f30001b;
        if (appMetricaConfig.locationTracking == null && AbstractC5182hn.m20511a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f30000a;
        if (appMetricaConfig.location == null && AbstractC5182hn.m20511a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f30002c;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC5182hn.m20511a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC5182hn.m20511a(appMetricaConfig.userProfileID) && AbstractC5182hn.m20511a(this.f30006g)) {
            builderNewConfigBuilder.withUserProfileID(this.f30006g);
        }
        this.f30007h = true;
        this.f30000a = null;
        this.f30001b = null;
        this.f30002c = null;
        this.f30003d.clear();
        this.f30004e.clear();
        this.f30005f = false;
        this.f30006g = null;
        return builderNewConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void clearAppEnvironment() {
        this.f30005f = true;
        this.f30003d.clear();
    }

    /* renamed from: k */
    public final Location m19317k() {
        return this.f30000a;
    }

    /* renamed from: l */
    public final Boolean m19318l() {
        return this.f30002c;
    }

    /* renamed from: m */
    public final Boolean m19319m() {
        return this.f30001b;
    }

    /* renamed from: n */
    public final boolean m19320n() {
        return this.f30005f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f30003d.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void setDataSendingEnabled(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        this.f30002c = boolValueOf;
        C4690Nh c4690Nh = this.f30008i;
        if (c4690Nh != null) {
            Boolean bool = this.f30001b;
            if (AbstractC5182hn.m20511a(bool)) {
                c4690Nh.f30522a.f31090b.setLocationTracking(bool.booleanValue());
            }
            if (AbstractC5182hn.m20511a(boolValueOf)) {
                c4690Nh.f30522a.f31090b.setDataSendingEnabled(z);
            }
            C4821T5 c4821t5M19833a = C4821T5.m19833a();
            C4820T4 c4820t4 = c4690Nh.f30522a;
            c4690Nh.m19663a(C4690Nh.m19660a(c4821t5M19833a, c4820t4), c4820t4, 1, null);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void setUserProfileID(String str) {
        this.f30006g = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19312a(Location location) {
        this.f30000a = location;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19314a(String str, String str2) {
        this.f30004e.put(str, str2);
    }

    /* renamed from: a */
    public final void m19313a(C4690Nh c4690Nh) {
        this.f30008i = c4690Nh;
    }
}
