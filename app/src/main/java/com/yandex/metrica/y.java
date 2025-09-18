package com.yandex.metrica;

import com.yandex.metrica.impl.ob.U2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y extends YandexMetricaConfig {
    public final Map a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Map f;
    public final Boolean g;
    public final Boolean h;

    public y(x xVar) {
        super(xVar.a);
        this.c = xVar.c;
        List list = xVar.b;
        this.b = list == null ? null : Collections.unmodifiableList(list);
        Map map = xVar.d;
        this.a = map != null ? Collections.unmodifiableMap(map) : null;
        this.e = xVar.f;
        this.d = xVar.e;
        this.f = Collections.unmodifiableMap(xVar.g);
        this.g = xVar.h;
        this.h = xVar.i;
    }

    public static x a(YandexMetricaConfig yandexMetricaConfig) {
        x xVar = new x(yandexMetricaConfig.apiKey);
        if (U2.a((Object) yandexMetricaConfig.appVersion)) {
            xVar.a.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (U2.a(yandexMetricaConfig.sessionTimeout)) {
            xVar.a.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (U2.a(yandexMetricaConfig.crashReporting)) {
            xVar.a.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.nativeCrashReporting)) {
            xVar.a.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.location)) {
            xVar.a.withLocation(yandexMetricaConfig.location);
        }
        if (U2.a(yandexMetricaConfig.locationTracking)) {
            xVar.a.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            xVar.a.withLogs();
        }
        if (U2.a(yandexMetricaConfig.preloadInfo)) {
            xVar.a.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (U2.a(yandexMetricaConfig.firstActivationAsUpdate)) {
            xVar.a.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.statisticsSending)) {
            xVar.a.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            xVar.a.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (U2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                xVar.a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (U2.a((Object) yandexMetricaConfig.userProfileID)) {
            xVar.a.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (U2.a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            xVar.a.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            xVar.a.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            xVar.a.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof y) {
            List list = ((y) yandexMetricaConfig).b;
            if (U2.a((Object) list)) {
                xVar.b = list;
            }
            U2.a((Object) null);
            U2.a((Object) null);
        }
        return xVar;
    }

    public y(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.b = null;
        this.h = null;
    }
}
