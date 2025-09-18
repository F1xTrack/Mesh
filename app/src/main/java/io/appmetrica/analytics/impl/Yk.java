package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Yk implements IParamsAppender {
    public final Bd a;
    public final Sc b;

    public Yk(Bd bd, Sc sc) {
        this.a = bd;
        this.b = sc;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C4485cl c4485cl) {
        Ef ef;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_ID), c4485cl.getDeviceId());
        a(builder, C4667ka.C.f(), c4485cl);
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID), c4485cl.getAppSetId());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID_SCOPE), c4485cl.getAppSetIdScope());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_PLATFORM), c4485cl.getAppPlatform());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.PROTOCOL_VERSION), c4485cl.getProtocolVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c4485cl.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.MODEL), c4485cl.getModel());
        builder.appendQueryParameter(this.a.a("manufacturer"), c4485cl.getManufacturer());
        builder.appendQueryParameter(this.a.a("os_version"), c4485cl.getOsVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c4485cl.getScreenWidth()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c4485cl.getScreenHeight()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c4485cl.getScreenDpi()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c4485cl.getScaleFactor()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.LOCALE), c4485cl.getLocale());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_TYPE), c4485cl.getDeviceType());
        builder.appendQueryParameter(this.a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("query_hosts"), String.valueOf(2));
        String strA = this.a.a("features");
        List<String> listG = ((Aj) this.b).g();
        String[] strArr = {this.a.a("permissions_collecting"), this.a.a("features_collecting"), this.a.a("google_aid"), this.a.a("huawei_oaid"), this.a.a("sim_info"), this.a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listG);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.a.a("app_id"), c4485cl.getPackageName());
        builder.appendQueryParameter(this.a.a("app_debuggable"), ((R5) c4485cl).a);
        if (c4485cl.l) {
            String str = c4485cl.m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.a.a("detect_locale"), String.valueOf(1));
        }
        I3 i3 = c4485cl.i;
        if (!hn.a(i3.a)) {
            builder.appendQueryParameter(this.a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.a.a("clids_set"), Hl.a(i3.a));
            int iOrdinal = i3.b.ordinal();
            builder.appendQueryParameter(this.a.a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c4485cl.f;
            String str3 = c4485cl.g;
            if (TextUtils.isEmpty(str2) && (ef = c4485cl.o.b) != null) {
                str2 = ef.a;
                str3 = ef.d.a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c4485cl.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.a.a(CrashHianalyticsData.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_system_flag"), ((R5) c4485cl).b);
        builder.appendQueryParameter(this.a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapC = ((Aj) this.b).c();
        for (String str4 : mapC.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapC.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, C4485cl c4485cl) {
        AdvertisingIdsHolder advertisingIdsHolder = c4485cl.getAdvertisingIdsHolder();
        if (advertisingIdsHolder != null && !dataSendingRestrictionController.isRestrictedForReporter()) {
            AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
