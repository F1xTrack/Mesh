package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.yandex.metrica.impl.ob.P3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3055rh implements InterfaceC2956nh<C2881kh> {
    private final C2831ih a;

    public C3055rh(C2831ih c2831ih) {
        this.a = c2831ih;
    }

    public void a(Uri.Builder builder, C2881kh c2881kh) {
        int i;
        Fg fgA;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_ID), c2881kh.g());
        builder.appendQueryParameter(this.a.a("deviceid2"), c2881kh.h());
        M2 m2V = P0.i().v();
        C2777gc c2777gcA = c2881kh.a();
        if (m2V.c()) {
            builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), "");
            builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), "");
            builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), "");
        } else {
            a(builder, c2777gcA.a(), CommonUrlParts.ADV_ID);
            a(builder, c2777gcA.b(), CommonUrlParts.HUAWEI_OAID);
            a(builder, c2777gcA.c(), CommonUrlParts.YANDEX_ADV_ID);
        }
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID), c2881kh.d());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID_SCOPE), c2881kh.e());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_PLATFORM), ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(this.a.a(CommonUrlParts.PROTOCOL_VERSION), "2");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), "5.0.0");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.MODEL), c2881kh.n());
        builder.appendQueryParameter(this.a.a("manufacturer"), c2881kh.m());
        builder.appendQueryParameter(this.a.a("os_version"), c2881kh.p());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c2881kh.v()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c2881kh.u()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c2881kh.t()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c2881kh.s()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.LOCALE), c2881kh.l());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_TYPE), c2881kh.j());
        builder.appendQueryParameter(this.a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("query_hosts"), String.valueOf(2));
        String strA = this.a.a("features");
        String[] strArr = {this.a.a("easy_collecting"), this.a.a("egress"), this.a.a("package_info"), this.a.a("socket"), this.a.a("permissions_collecting"), this.a.a("features_collecting"), this.a.a("location_collecting"), this.a.a("wakeup"), this.a.a("lbs_collecting"), this.a.a("google_aid"), this.a.a("huawei_oaid"), this.a.a("throttling"), this.a.a("wifi_around"), this.a.a("wifi_connected"), this.a.a("cells_around"), this.a.a("sim_info"), this.a.a("sdk_list"), this.a.a("identity_light_collecting"), this.a.a("gpl_collecting"), this.a.a("ui_parsing"), this.a.a("ui_collecting_for_bridge"), this.a.a("ui_event_sending"), this.a.a("ui_raw_event_sending"), this.a.a("cell_additional_info"), this.a.a("cell_additional_info_connected_only"), this.a.a("ssl_pinning")};
        int i2 = O2.a;
        builder.appendQueryParameter(strA, TextUtils.join(StringUtils.COMMA, strArr));
        builder.appendQueryParameter(this.a.a("socket"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_id"), c2881kh.q());
        builder.appendQueryParameter(this.a.a("location_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_debuggable"), c2881kh.A());
        builder.appendQueryParameter(this.a.a("sdk_list"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("wakeup"), String.valueOf(1));
        if (c2881kh.M()) {
            String strE = c2881kh.E();
            if (!TextUtils.isEmpty(strE)) {
                builder.appendQueryParameter(this.a.a("country_init"), strE);
            }
            i = 1;
        } else {
            i = 1;
            builder.appendQueryParameter(this.a.a("detect_locale"), String.valueOf(1));
        }
        P3.a aVarC = c2881kh.C();
        if (!U2.b(aVarC.b())) {
            builder.appendQueryParameter(this.a.a("distribution_customization"), String.valueOf(i));
            builder.appendQueryParameter(this.a.a("clids_set"), C3240ym.c(aVarC.b()));
            int iOrdinal = aVarC.a().ordinal();
            builder.appendQueryParameter(this.a.a("clids_set_source"), iOrdinal != i ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String strF = c2881kh.F();
            String strG = c2881kh.G();
            if (TextUtils.isEmpty(strF) && (fgA = c2881kh.I().a()) != null) {
                strF = fgA.a;
                strG = fgA.d.a;
            }
            if (!TextUtils.isEmpty(strF)) {
                builder.appendQueryParameter(this.a.a("install_referrer"), strF);
                if (strG == null) {
                    strG = "null";
                }
                builder.appendQueryParameter(this.a.a("install_referrer_source"), strG);
            }
        }
        String strX = c2881kh.x();
        if (!TextUtils.isEmpty(strX)) {
            builder.appendQueryParameter(this.a.a(CommonUrlParts.UUID), strX);
        }
        builder.appendQueryParameter(this.a.a(CrashHianalyticsData.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("requests"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("permissions"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("identity_light_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("ui_parsing"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("ui_collecting_for_bridge"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("ui_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("ui_raw_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("throttling"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("mediascope_api_keys"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("diagnostics"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_system_flag"), c2881kh.B());
        builder.appendQueryParameter(this.a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("easy_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("egress"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("startup_update"), String.valueOf(1));
    }

    private void a(Uri.Builder builder, C2652bc c2652bc, String str) {
        if (!c2652bc.a()) {
            builder.appendQueryParameter(this.a.a(str), "");
        } else {
            builder.appendQueryParameter(this.a.a(str), c2652bc.a.b);
        }
    }
}
