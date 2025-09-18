package com.yandex.metrica;

import com.yandex.metrica.impl.p022ob.C2968U2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.y */
/* loaded from: classes2.dex */
public final class C3806y extends YandexMetricaConfig {

    /* renamed from: a */
    public final Map f25541a;

    /* renamed from: b */
    public final List f25542b;

    /* renamed from: c */
    public final Integer f25543c;

    /* renamed from: d */
    public final Integer f25544d;

    /* renamed from: e */
    public final Integer f25545e;

    /* renamed from: f */
    public final Map f25546f;

    /* renamed from: g */
    public final Boolean f25547g;

    /* renamed from: h */
    public final Boolean f25548h;

    public C3806y(C3805x c3805x) {
        super(c3805x.f25532a);
        this.f25543c = c3805x.f25534c;
        List list = c3805x.f25533b;
        this.f25542b = list == null ? null : Collections.unmodifiableList(list);
        Map map = c3805x.f25535d;
        this.f25541a = map != null ? Collections.unmodifiableMap(map) : null;
        this.f25545e = c3805x.f25537f;
        this.f25544d = c3805x.f25536e;
        this.f25546f = Collections.unmodifiableMap(c3805x.f25538g);
        this.f25547g = c3805x.f25539h;
        this.f25548h = c3805x.f25540i;
    }

    /* renamed from: a */
    public static C3805x m17378a(YandexMetricaConfig yandexMetricaConfig) {
        C3805x c3805x = new C3805x(yandexMetricaConfig.apiKey);
        if (C2968U2.m15244a((Object) yandexMetricaConfig.appVersion)) {
            c3805x.f25532a.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.sessionTimeout)) {
            c3805x.f25532a.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.crashReporting)) {
            c3805x.f25532a.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.nativeCrashReporting)) {
            c3805x.f25532a.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.location)) {
            c3805x.f25532a.withLocation(yandexMetricaConfig.location);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.locationTracking)) {
            c3805x.f25532a.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            c3805x.f25532a.withLogs();
        }
        if (C2968U2.m15244a(yandexMetricaConfig.preloadInfo)) {
            c3805x.f25532a.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.firstActivationAsUpdate)) {
            c3805x.f25532a.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.statisticsSending)) {
            c3805x.f25532a.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            c3805x.f25532a.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C2968U2.m15244a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                c3805x.f25532a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (C2968U2.m15244a((Object) yandexMetricaConfig.userProfileID)) {
            c3805x.f25532a.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            c3805x.f25532a.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            c3805x.f25532a.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            c3805x.f25532a.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof C3806y) {
            List list = ((C3806y) yandexMetricaConfig).f25542b;
            if (C2968U2.m15244a((Object) list)) {
                c3805x.f25533b = list;
            }
            C2968U2.m15244a((Object) null);
            C2968U2.m15244a((Object) null);
        }
        return c3805x;
    }

    public C3806y(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f25541a = null;
        this.f25543c = null;
        this.f25544d = null;
        this.f25545e = null;
        this.f25546f = null;
        this.f25547g = null;
        this.f25542b = null;
        this.f25548h = null;
    }
}
