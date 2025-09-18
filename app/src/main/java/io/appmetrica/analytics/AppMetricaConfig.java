package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC4915X3;
import io.appmetrica.analytics.impl.AbstractC5020bb;
import io.appmetrica.analytics.impl.AbstractC5182hn;
import io.appmetrica.analytics.impl.C4379Am;
import io.appmetrica.analytics.impl.C4959Z;
import io.appmetrica.analytics.impl.C5464t5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: C */
        private static final C4379Am f29467C = new C4379Am(new C4959Z());

        /* renamed from: A */
        private List f29468A;

        /* renamed from: B */
        private final HashMap f29469B;

        /* renamed from: a */
        private final C5464t5 f29470a;

        /* renamed from: b */
        private final String f29471b;

        /* renamed from: c */
        private String f29472c;

        /* renamed from: d */
        private Integer f29473d;

        /* renamed from: e */
        private Boolean f29474e;

        /* renamed from: f */
        private Boolean f29475f;

        /* renamed from: g */
        private Location f29476g;

        /* renamed from: h */
        private Boolean f29477h;

        /* renamed from: i */
        private Boolean f29478i;

        /* renamed from: j */
        private PreloadInfo f29479j;

        /* renamed from: k */
        private Boolean f29480k;

        /* renamed from: l */
        private Boolean f29481l;

        /* renamed from: m */
        private Integer f29482m;

        /* renamed from: n */
        private final LinkedHashMap f29483n;

        /* renamed from: o */
        private String f29484o;

        /* renamed from: p */
        private Boolean f29485p;

        /* renamed from: q */
        private Boolean f29486q;

        /* renamed from: r */
        private Boolean f29487r;

        /* renamed from: s */
        private String f29488s;

        /* renamed from: t */
        private Integer f29489t;

        /* renamed from: u */
        private Integer f29490u;

        /* renamed from: v */
        private Integer f29491v;

        /* renamed from: w */
        private final LinkedHashMap f29492w;

        /* renamed from: x */
        private ICrashTransformer f29493x;

        /* renamed from: y */
        private Boolean f29494y;

        /* renamed from: z */
        private Integer f29495z;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f29480k = Boolean.valueOf(z);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f29469B.put(str, obj);
            return this;
        }

        public Builder withAnrMonitoring(boolean z) {
            this.f29494y = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i) {
            this.f29495z = Integer.valueOf(i);
            return this;
        }

        public Builder withAppBuildNumber(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f29489t = Integer.valueOf(i);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f29492w.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f29487r = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f29472c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f29474e = Boolean.valueOf(z);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f29493x = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.f29468A = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f29481l = Boolean.valueOf(z);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f29488s = str;
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.f29490u = Integer.valueOf(i);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f29483n.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f29476g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f29477h = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f29478i = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.f29491v = Integer.valueOf(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f29482m = Integer.valueOf(this.f29470a.m21074a(i));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f29475f = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f29479j = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f29485p = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f29473d = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f29486q = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f29484o = str;
            return this;
        }

        private Builder(String str) {
            this.f29483n = new LinkedHashMap();
            this.f29492w = new LinkedHashMap();
            this.f29469B = new HashMap();
            f29467C.mo19211a(str);
            this.f29470a = new C5464t5(str);
            this.f29471b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        AppMetricaConfig appMetricaConfig;
        HashMap mapM20176c;
        HashMap mapM20176c2;
        HashMap mapM20176c3;
        if (TextUtils.isEmpty(str)) {
            appMetricaConfig = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Builder builderNewConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    builderNewConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    builderNewConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                builderNewConfigBuilder.withLocation(AbstractC4915X3.m19960a(jSONObject.optString("location")));
                builderNewConfigBuilder.withPreloadInfo(AbstractC4915X3.m19962b(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    builderNewConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    builderNewConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    builderNewConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    builderNewConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    builderNewConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (mapM20176c3 = AbstractC5020bb.m20176c(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry entry : mapM20176c3.entrySet()) {
                        builderNewConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    builderNewConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("data_sending_enabled")) {
                    builderNewConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
                }
                if (jSONObject.has("user_profile_id")) {
                    appMetricaConfig = null;
                    try {
                        builderNewConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                    } catch (Throwable unused) {
                    }
                } else {
                    appMetricaConfig = null;
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    builderNewConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    builderNewConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (jSONObject.has("app_open_tracking_enabled")) {
                    builderNewConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
                }
                if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                    builderNewConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
                }
                if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                    builderNewConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
                }
                if (jSONObject.has("dispatch_period_seconds")) {
                    builderNewConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
                }
                if (jSONObject.has("max_reports_count")) {
                    builderNewConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
                }
                if (jSONObject.has("app_environment") && (mapM20176c2 = AbstractC5020bb.m20176c(jSONObject.optString("app_environment"))) != null) {
                    for (Map.Entry entry2 : mapM20176c2.entrySet()) {
                        builderNewConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (jSONObject.has("anr_monitoring")) {
                    builderNewConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
                }
                if (jSONObject.has("anr_monitoring_timeout")) {
                    builderNewConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
                }
                if (jSONObject.has("customHosts")) {
                    builderNewConfigBuilder.withCustomHosts(AbstractC5020bb.m20172a(jSONObject.optJSONArray("customHosts")));
                }
                if (jSONObject.has("additional_config") && (mapM20176c = AbstractC5020bb.m20176c(jSONObject.optString("additional_config"))) != null) {
                    for (Map.Entry entry3 : mapM20176c.entrySet()) {
                        builderNewConfigBuilder.withAdditionalConfig((String) entry3.getKey(), entry3.getValue());
                    }
                }
                return builderNewConfigBuilder.build();
            } catch (Throwable unused2) {
            }
        }
        return appMetricaConfig;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", AbstractC4915X3.m19961a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONObject jSONObject2 = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject3.toString();
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                jSONObject.put("customHosts", AbstractC5182hn.m20513a((Collection) list) ? null : new JSONArray((Collection) list));
            }
            Map<String, Object> map3 = this.additionalConfig;
            if (map3 != null) {
                jSONObject2 = new JSONObject(map3);
            }
            jSONObject.put("additional_config", jSONObject2);
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f29471b;
        this.appVersion = builder.f29472c;
        this.sessionTimeout = builder.f29473d;
        this.crashReporting = builder.f29474e;
        this.nativeCrashReporting = builder.f29475f;
        this.location = builder.f29476g;
        this.locationTracking = builder.f29477h;
        this.logs = builder.f29478i;
        this.preloadInfo = builder.f29479j;
        this.firstActivationAsUpdate = builder.f29480k;
        this.dataSendingEnabled = builder.f29481l;
        this.maxReportsInDatabaseCount = builder.f29482m;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f29483n);
        this.userProfileID = builder.f29484o;
        this.revenueAutoTrackingEnabled = builder.f29485p;
        this.sessionsAutoTrackingEnabled = builder.f29486q;
        this.appOpenTrackingEnabled = builder.f29487r;
        this.deviceType = builder.f29488s;
        this.appBuildNumber = builder.f29489t;
        this.dispatchPeriodSeconds = builder.f29490u;
        this.maxReportsCount = builder.f29491v;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f29492w);
        this.crashTransformer = builder.f29493x;
        this.anrMonitoring = builder.f29494y;
        this.anrMonitoringTimeout = builder.f29495z;
        this.customHosts = builder.f29468A;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f29469B);
    }

    public AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
