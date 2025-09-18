package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Ta implements Ya<YandexMetricaConfig> {
    private final Hm a;
    private final C2726eb b;

    public Ta(Hm hm, C2726eb c2726eb) {
        this.a = hm;
        this.b = c2726eb;
    }

    @Override // com.yandex.metrica.impl.ob.Ya
    public JSONObject a(YandexMetricaConfig yandexMetricaConfig) {
        YandexMetricaConfig yandexMetricaConfig2 = yandexMetricaConfig;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (yandexMetricaConfig2 != null) {
                JSONObject jSONObjectPutOpt = jSONObject2.put("api_key", yandexMetricaConfig2.apiKey).putOpt("app_version", yandexMetricaConfig2.appVersion).putOpt("session_timeout", yandexMetricaConfig2.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig2.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig2.nativeCrashReporting).putOpt("location", a(yandexMetricaConfig2.location)).putOpt("location_tracking", yandexMetricaConfig2.locationTracking).putOpt("logs", yandexMetricaConfig2.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig2.preloadInfo;
                jSONObjectPutOpt.putOpt("preload_info", preloadInfo == null ? null : new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", C3240ym.f(preloadInfo.getAdditionalParams()))).putOpt("first_activation_as_update", yandexMetricaConfig2.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig2.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig2.maxReportsInDatabaseCount).putOpt("error_environment", C3240ym.f(yandexMetricaConfig2.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig2.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig2.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig2.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig2.appOpenTrackingEnabled);
                if (yandexMetricaConfig2 instanceof com.yandex.metrica.y) {
                    com.yandex.metrica.y yVar = (com.yandex.metrica.y) yandexMetricaConfig2;
                    JSONObject jSONObjectPutOpt2 = jSONObject2.putOpt(CommonUrlParts.DEVICE_TYPE, null).putOpt("clids", C3240ym.f(yVar.a)).putOpt("distribution_referrer", null);
                    List list = yVar.b;
                    JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("custom_hosts", list == null ? null : list.isEmpty() ? new JSONArray() : C3240ym.b((List<?>) list)).putOpt(CommonUrlParts.APP_VERSION_CODE, yVar.c).putOpt("dispatch_period_seconds", yVar.d).putOpt("max_reports_count", yVar.e).putOpt("app_environment", C3240ym.f(yVar.f)).putOpt("preload_info_auto_tracking", null).putOpt("permissions_collection", yVar.g).putOpt("anr_monitoring", yVar.h);
                    this.b.getClass();
                    jSONObjectPutOpt3.putOpt("pulse_config", null).putOpt("rtm_config", null).put("crash_transformer_set", false);
                }
            }
            jSONObject.putOpt("config", jSONObject2).putOpt("process_name", ((Dm) this.a).b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject a(Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt("provider", location.getProvider()).put("timestamp", location.getTime()).put("precision", location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put("lat", location.getLatitude()).put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, location.getBearing()).put("speed", location.getSpeed());
    }
}
