package com.p019vk.push.core.feature;

import com.p019vk.push.core.feature.Feature;
import kotlin.Metadata;
import ru.p031ok.tracer.base.ucum.UcumUtils;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\n\"\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\n\"\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004¨\u0006$"}, m22267d2 = {"Lcom/vk/push/core/feature/Feature$IntFeature;", "a", "Lcom/vk/push/core/feature/Feature$IntFeature;", "getUpdateTimeInterval", "()Lcom/vk/push/core/feature/Feature$IntFeature;", "updateTimeInterval", "Lcom/vk/push/core/feature/Feature$StringFeature;", "b", "Lcom/vk/push/core/feature/Feature$StringFeature;", "getAnalyticsEventsBlackList", "()Lcom/vk/push/core/feature/Feature$StringFeature;", "analyticsEventsBlackList", "c", "getPushCountThreshold", "pushCountThreshold", UcumUtils.UCUM_DAYS, "getSendingPushCountAnalyticsIntervalHours", "sendingPushCountAnalyticsIntervalHours", "e", "getNonFatalEventsBlackList", "nonFatalEventsBlackList", "f", "getAnalyticsActiveCheckIntervalMinutes", "analyticsActiveCheckIntervalMinutes", "g", "getWebsocketActiveCheckConfig", "websocketActiveCheckConfig", UcumUtils.UCUM_HOURS, "getServiceActiveCheckConfig", "serviceActiveCheckConfig", "i", "getExternalMasterHostAnalyticsConfig", "externalMasterHostAnalyticsConfig", "j", "getPushTokenTtlWithoutHostMinutes", "pushTokenTtlWithoutHostMinutes", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CommonFeaturesKt {

    /* renamed from: a */
    public static final Feature.IntFeature f20384a = new Feature.IntFeature("vkcm_sdk_omicron_update_time_interval_hours", 1);

    /* renamed from: b */
    public static final Feature.StringFeature f20385b = new Feature.StringFeature("vkcm_sdk_analytics_events_black_list", "");

    /* renamed from: c */
    public static final Feature.IntFeature f20386c = new Feature.IntFeature("vkcm_sdk_omicron_push_count_threshold", 500);

    /* renamed from: d */
    public static final Feature.IntFeature f20387d = new Feature.IntFeature("vkcm_sdk_omicron_sending_push_count_interval_hours", 12);

    /* renamed from: e */
    public static final Feature.StringFeature f20388e = new Feature.StringFeature("vkcm_sdk_non_fatal_events_black_list", "");

    /* renamed from: f */
    public static final Feature.IntFeature f20389f = new Feature.IntFeature("vkcm_sdk_analytics_active_check_interval_minutes", 720);

    /* renamed from: g */
    public static final Feature.StringFeature f20390g = new Feature.StringFeature("vkcm_sdk_websocket_active_check_config", "");

    /* renamed from: h */
    public static final Feature.StringFeature f20391h = new Feature.StringFeature("vkcm_sdk_service_active_check_config", "");

    /* renamed from: i */
    public static final Feature.StringFeature f20392i = new Feature.StringFeature("vkcm_sdk_external_master_host_analytics_config", "");

    /* renamed from: j */
    public static final Feature.IntFeature f20393j = new Feature.IntFeature("vkcm_sdk_push_token_ttl_no_host_minutes", 2880);

    public static final Feature.IntFeature getAnalyticsActiveCheckIntervalMinutes() {
        return f20389f;
    }

    public static final Feature.StringFeature getAnalyticsEventsBlackList() {
        return f20385b;
    }

    public static final Feature.StringFeature getExternalMasterHostAnalyticsConfig() {
        return f20392i;
    }

    public static final Feature.StringFeature getNonFatalEventsBlackList() {
        return f20388e;
    }

    public static final Feature.IntFeature getPushCountThreshold() {
        return f20386c;
    }

    public static final Feature.IntFeature getPushTokenTtlWithoutHostMinutes() {
        return f20393j;
    }

    public static final Feature.IntFeature getSendingPushCountAnalyticsIntervalHours() {
        return f20387d;
    }

    public static final Feature.StringFeature getServiceActiveCheckConfig() {
        return f20391h;
    }

    public static final Feature.IntFeature getUpdateTimeInterval() {
        return f20384a;
    }

    public static final Feature.StringFeature getWebsocketActiveCheckConfig() {
        return f20390g;
    }
}
