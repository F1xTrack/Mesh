package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.p022ob.C2968U2;
import com.yandex.metrica.impl.p022ob.C3582ro;
import com.yandex.metrica.impl.p022ob.C3663v1;
import com.yandex.metrica.impl.p022ob.C3686vo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class YandexMetricaConfig {
    public final String apiKey;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: r */
        public static final C3582ro f20758r = new C3582ro(new C3686vo());

        /* renamed from: a */
        public final String f20759a;

        /* renamed from: b */
        public String f20760b;

        /* renamed from: c */
        public Integer f20761c;

        /* renamed from: d */
        public Boolean f20762d;

        /* renamed from: e */
        public Boolean f20763e;

        /* renamed from: f */
        public Location f20764f;

        /* renamed from: g */
        public Boolean f20765g;

        /* renamed from: h */
        public Boolean f20766h;

        /* renamed from: i */
        public PreloadInfo f20767i;

        /* renamed from: j */
        public Boolean f20768j;

        /* renamed from: k */
        public Boolean f20769k;

        /* renamed from: l */
        public Integer f20770l;

        /* renamed from: m */
        public final LinkedHashMap f20771m = new LinkedHashMap();

        /* renamed from: n */
        public String f20772n;

        /* renamed from: o */
        public Boolean f20773o;

        /* renamed from: p */
        public Boolean f20774p;

        /* renamed from: q */
        public Boolean f20775q;

        public Builder(String str) {
            f20758r.mo14391a(str);
            this.f20759a = str;
        }

        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f20768j = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f20775q = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f20760b = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f20762d = Boolean.valueOf(z);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f20771m.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f20764f = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f20765g = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f20766h = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f20770l = Integer.valueOf(i);
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f20763e = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f20767i = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f20773o = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f20761c = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f20774p = Boolean.valueOf(z);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f20769k = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f20772n = str;
            return this;
        }
    }

    public YandexMetricaConfig(Builder builder) {
        this.apiKey = builder.f20759a;
        this.appVersion = builder.f20760b;
        this.sessionTimeout = builder.f20761c;
        this.crashReporting = builder.f20762d;
        this.nativeCrashReporting = builder.f20763e;
        this.location = builder.f20764f;
        this.locationTracking = builder.f20765g;
        this.logs = builder.f20766h;
        this.preloadInfo = builder.f20767i;
        this.firstActivationAsUpdate = builder.f20768j;
        this.statisticsSending = builder.f20769k;
        this.maxReportsInDatabaseCount = builder.f20770l;
        this.errorEnvironment = Collections.unmodifiableMap(builder.f20771m);
        this.userProfileID = builder.f20772n;
        this.revenueAutoTrackingEnabled = builder.f20773o;
        this.sessionsAutoTrackingEnabled = builder.f20774p;
        this.appOpenTrackingEnabled = builder.f20775q;
    }

    public static Builder createBuilderFromConfig(YandexMetricaConfig yandexMetricaConfig) {
        Builder builderNewConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (C2968U2.m15244a((Object) yandexMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.location)) {
            builderNewConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (C2968U2.m15244a(yandexMetricaConfig.preloadInfo)) {
            builderNewConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.statisticsSending)) {
            builderNewConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C2968U2.m15244a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (C2968U2.m15244a((Object) yandexMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (C2968U2.m15244a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C2968U2.m15244a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return builderNewConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C3663v1().m16943a(str);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C3663v1().m16944a(this);
    }

    public YandexMetricaConfig(YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }
}
