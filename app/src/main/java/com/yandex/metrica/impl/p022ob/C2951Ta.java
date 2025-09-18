package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ta */
/* loaded from: classes2.dex */
public class C2951Ta implements InterfaceC3076Ya<YandexMetricaConfig> {

    /* renamed from: a */
    private final InterfaceC2664Hm f22376a;

    /* renamed from: b */
    private final C3231eb f22377b;

    public C2951Ta(InterfaceC2664Hm interfaceC2664Hm, C3231eb c3231eb) {
        this.f22376a = interfaceC2664Hm;
        this.f22377b = c3231eb;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3076Ya
    /* renamed from: a */
    public JSONObject mo15176a(YandexMetricaConfig yandexMetricaConfig) {
        YandexMetricaConfig yandexMetricaConfig2 = yandexMetricaConfig;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (yandexMetricaConfig2 != null) {
                JSONObject jSONObjectPutOpt = jSONObject2.put("api_key", yandexMetricaConfig2.apiKey).putOpt("app_version", yandexMetricaConfig2.appVersion).putOpt("session_timeout", yandexMetricaConfig2.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig2.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig2.nativeCrashReporting).putOpt("location", m15175a(yandexMetricaConfig2.location)).putOpt("location_tracking", yandexMetricaConfig2.locationTracking).putOpt("logs", yandexMetricaConfig2.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig2.preloadInfo;
                jSONObjectPutOpt.putOpt("preload_info", preloadInfo == null ? null : new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", C3762ym.m17304f(preloadInfo.getAdditionalParams()))).putOpt("first_activation_as_update", yandexMetricaConfig2.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig2.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig2.maxReportsInDatabaseCount).putOpt("error_environment", C3762ym.m17304f(yandexMetricaConfig2.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig2.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig2.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig2.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig2.appOpenTrackingEnabled);
                if (yandexMetricaConfig2 instanceof C3806y) {
                    C3806y c3806y = (C3806y) yandexMetricaConfig2;
                    JSONObject jSONObjectPutOpt2 = jSONObject2.putOpt(CommonUrlParts.DEVICE_TYPE, null).putOpt("clids", C3762ym.m17304f(c3806y.f25541a)).putOpt("distribution_referrer", null);
                    List list = c3806y.f25542b;
                    JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("custom_hosts", list == null ? null : list.isEmpty() ? new JSONArray() : C3762ym.m17290b((List<?>) list)).putOpt(CommonUrlParts.APP_VERSION_CODE, c3806y.f25543c).putOpt("dispatch_period_seconds", c3806y.f25544d).putOpt("max_reports_count", c3806y.f25545e).putOpt("app_environment", C3762ym.m17304f(c3806y.f25546f)).putOpt("preload_info_auto_tracking", null).putOpt("permissions_collection", c3806y.f25547g).putOpt("anr_monitoring", c3806y.f25548h);
                    this.f22377b.getClass();
                    jSONObjectPutOpt3.putOpt("pulse_config", null).putOpt("rtm_config", null).put("crash_transformer_set", false);
                }
            }
            jSONObject.putOpt("config", jSONObject2).putOpt("process_name", ((C2564Dm) this.f22376a).m14015b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m15175a(Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt("provider", location.getProvider()).put("timestamp", location.getTime()).put("precision", location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put("lat", location.getLatitude()).put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, location.getBearing()).put("speed", location.getSpeed());
    }
}
