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

/* renamed from: io.appmetrica.analytics.impl.Yk */
/* loaded from: classes2.dex */
public final class C4956Yk implements IParamsAppender {

    /* renamed from: a */
    public final C4395Bd f31131a;

    /* renamed from: b */
    public final InterfaceC4804Sc f31132b;

    public C4956Yk(C4395Bd c4395Bd, InterfaceC4804Sc interfaceC4804Sc) {
        this.f31131a = c4395Bd;
        this.f31132b = interfaceC4804Sc;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C5055cl c5055cl) {
        C4472Ef c4472Ef;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.DEVICE_ID), c5055cl.getDeviceId());
        m20046a(builder, C5244ka.f32038C.m20622f(), c5055cl);
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.APP_SET_ID), c5055cl.getAppSetId());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.APP_SET_ID_SCOPE), c5055cl.getAppSetIdScope());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.APP_PLATFORM), c5055cl.getAppPlatform());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.PROTOCOL_VERSION), c5055cl.getProtocolVersion());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c5055cl.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.MODEL), c5055cl.getModel());
        builder.appendQueryParameter(this.f31131a.m19233a("manufacturer"), c5055cl.getManufacturer());
        builder.appendQueryParameter(this.f31131a.m19233a("os_version"), c5055cl.getOsVersion());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c5055cl.getScreenWidth()));
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c5055cl.getScreenHeight()));
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.SCREEN_DPI), String.valueOf(c5055cl.getScreenDpi()));
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c5055cl.getScaleFactor()));
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.LOCALE), c5055cl.getLocale());
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.DEVICE_TYPE), c5055cl.getDeviceType());
        builder.appendQueryParameter(this.f31131a.m19233a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("query_hosts"), String.valueOf(2));
        String strM19233a = this.f31131a.m19233a("features");
        List<String> listMo19196g = ((C4376Aj) this.f31132b).mo19196g();
        String[] strArr = {this.f31131a.m19233a("permissions_collecting"), this.f31131a.m19233a("features_collecting"), this.f31131a.m19233a("google_aid"), this.f31131a.m19233a("huawei_oaid"), this.f31131a.m19233a("sim_info"), this.f31131a.m19233a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listMo19196g);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strM19233a, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f31131a.m19233a("app_id"), c5055cl.getPackageName());
        builder.appendQueryParameter(this.f31131a.m19233a("app_debuggable"), ((C4773R5) c5055cl).f30676a);
        if (c5055cl.f31445l) {
            String str = c5055cl.f31446m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f31131a.m19233a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f31131a.m19233a("detect_locale"), String.valueOf(1));
        }
        C4556I3 c4556i3 = c5055cl.f31442i;
        if (!AbstractC5182hn.m20514a(c4556i3.f30267a)) {
            builder.appendQueryParameter(this.f31131a.m19233a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f31131a.m19233a("clids_set"), AbstractC4550Hl.m19475a(c4556i3.f30267a));
            int iOrdinal = c4556i3.f30268b.ordinal();
            builder.appendQueryParameter(this.f31131a.m19233a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c5055cl.f31439f;
            String str3 = c5055cl.f31440g;
            if (TextUtils.isEmpty(str2) && (c4472Ef = c5055cl.f31448o.f29963b) != null) {
                str2 = c4472Ef.f30076a;
                str3 = c4472Ef.f30079d.f30023a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f31131a.m19233a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f31131a.m19233a("install_referrer_source"), str3);
            }
        }
        String uuid = c5055cl.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f31131a.m19233a(CrashHianalyticsData.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("app_system_flag"), ((C4773R5) c5055cl).f30677b);
        builder.appendQueryParameter(this.f31131a.m19233a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f31131a.m19233a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapMo19192c = ((C4376Aj) this.f31132b).mo19192c();
        for (String str4 : mapMo19192c.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapMo19192c.get(str4)));
        }
    }

    /* renamed from: a */
    public final void m20046a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, C5055cl c5055cl) {
        AdvertisingIdsHolder advertisingIdsHolder = c5055cl.getAdvertisingIdsHolder();
        if (advertisingIdsHolder != null && !dataSendingRestrictionController.isRestrictedForReporter()) {
            AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f31131a.m19233a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
