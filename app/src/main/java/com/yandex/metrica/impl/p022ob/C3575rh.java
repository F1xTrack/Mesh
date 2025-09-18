package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2845P3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.rh */
/* loaded from: classes2.dex */
public class C3575rh implements InterfaceC3471nh<C3393kh> {

    /* renamed from: a */
    private final C3341ih f24618a;

    public C3575rh(C3341ih c3341ih) {
        this.f24618a = c3341ih;
    }

    /* renamed from: a */
    public void m16695a(Uri.Builder builder, C3393kh c3393kh) {
        int i;
        C2608Fg c2608FgM15277a;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.DEVICE_ID), c3393kh.m15783g());
        builder.appendQueryParameter(this.f24618a.m16092a("deviceid2"), c3393kh.m15784h());
        C2769M2 c2769m2M14751v = C2842P0.m14728i().m14751v();
        C3284gc c3284gcM15767a = c3393kh.m15767a();
        if (c2769m2M14751v.m14596c()) {
            builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.ADV_ID), "");
            builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.HUAWEI_OAID), "");
            builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.YANDEX_ADV_ID), "");
        } else {
            m16694a(builder, c3284gcM15767a.m15990a(), CommonUrlParts.ADV_ID);
            m16694a(builder, c3284gcM15767a.m15991b(), CommonUrlParts.HUAWEI_OAID);
            m16694a(builder, c3284gcM15767a.m15992c(), CommonUrlParts.YANDEX_ADV_ID);
        }
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.APP_SET_ID), c3393kh.m15778d());
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.APP_SET_ID_SCOPE), c3393kh.m15780e());
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.APP_PLATFORM), ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.PROTOCOL_VERSION), "2");
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), "5.0.0");
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.MODEL), c3393kh.m15790n());
        builder.appendQueryParameter(this.f24618a.m16092a("manufacturer"), c3393kh.m15789m());
        builder.appendQueryParameter(this.f24618a.m16092a("os_version"), c3393kh.m15792p());
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c3393kh.m15798v()));
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c3393kh.m15797u()));
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.SCREEN_DPI), String.valueOf(c3393kh.m15796t()));
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c3393kh.m15795s()));
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.LOCALE), c3393kh.m15788l());
        builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.DEVICE_TYPE), c3393kh.m15786j());
        builder.appendQueryParameter(this.f24618a.m16092a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("query_hosts"), String.valueOf(2));
        String strM16092a = this.f24618a.m16092a("features");
        String[] strArr = {this.f24618a.m16092a("easy_collecting"), this.f24618a.m16092a("egress"), this.f24618a.m16092a("package_info"), this.f24618a.m16092a("socket"), this.f24618a.m16092a("permissions_collecting"), this.f24618a.m16092a("features_collecting"), this.f24618a.m16092a("location_collecting"), this.f24618a.m16092a("wakeup"), this.f24618a.m16092a("lbs_collecting"), this.f24618a.m16092a("google_aid"), this.f24618a.m16092a("huawei_oaid"), this.f24618a.m16092a("throttling"), this.f24618a.m16092a("wifi_around"), this.f24618a.m16092a("wifi_connected"), this.f24618a.m16092a("cells_around"), this.f24618a.m16092a("sim_info"), this.f24618a.m16092a("sdk_list"), this.f24618a.m16092a("identity_light_collecting"), this.f24618a.m16092a("gpl_collecting"), this.f24618a.m16092a("ui_parsing"), this.f24618a.m16092a("ui_collecting_for_bridge"), this.f24618a.m16092a("ui_event_sending"), this.f24618a.m16092a("ui_raw_event_sending"), this.f24618a.m16092a("cell_additional_info"), this.f24618a.m16092a("cell_additional_info_connected_only"), this.f24618a.m16092a("ssl_pinning")};
        int i2 = C2819O2.f21836a;
        builder.appendQueryParameter(strM16092a, TextUtils.join(StringUtils.COMMA, strArr));
        builder.appendQueryParameter(this.f24618a.m16092a("socket"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("app_id"), c3393kh.m15793q());
        builder.appendQueryParameter(this.f24618a.m16092a("location_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("app_debuggable"), c3393kh.m16000A());
        builder.appendQueryParameter(this.f24618a.m16092a("sdk_list"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("wakeup"), String.valueOf(1));
        if (c3393kh.m16324M()) {
            String strM16316E = c3393kh.m16316E();
            if (!TextUtils.isEmpty(strM16316E)) {
                builder.appendQueryParameter(this.f24618a.m16092a("country_init"), strM16316E);
            }
            i = 1;
        } else {
            i = 1;
            builder.appendQueryParameter(this.f24618a.m16092a("detect_locale"), String.valueOf(1));
        }
        C2845P3.a aVarM16314C = c3393kh.m16314C();
        if (!C2968U2.m15250b(aVarM16314C.m14761b())) {
            builder.appendQueryParameter(this.f24618a.m16092a("distribution_customization"), String.valueOf(i));
            builder.appendQueryParameter(this.f24618a.m16092a("clids_set"), C3762ym.m17295c(aVarM16314C.m14761b()));
            int iOrdinal = aVarM16314C.mo14053a().ordinal();
            builder.appendQueryParameter(this.f24618a.m16092a("clids_set_source"), iOrdinal != i ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String strM16317F = c3393kh.m16317F();
            String strM16318G = c3393kh.m16318G();
            if (TextUtils.isEmpty(strM16317F) && (c2608FgM15277a = c3393kh.m16320I().m15277a()) != null) {
                strM16317F = c2608FgM15277a.f21216a;
                strM16318G = c2608FgM15277a.f21219d.f21224a;
            }
            if (!TextUtils.isEmpty(strM16317F)) {
                builder.appendQueryParameter(this.f24618a.m16092a("install_referrer"), strM16317F);
                if (strM16318G == null) {
                    strM16318G = "null";
                }
                builder.appendQueryParameter(this.f24618a.m16092a("install_referrer_source"), strM16318G);
            }
        }
        String strM15800x = c3393kh.m15800x();
        if (!TextUtils.isEmpty(strM15800x)) {
            builder.appendQueryParameter(this.f24618a.m16092a(CommonUrlParts.UUID), strM15800x);
        }
        builder.appendQueryParameter(this.f24618a.m16092a(CrashHianalyticsData.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("requests"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("permissions"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("identity_light_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("ui_parsing"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("ui_collecting_for_bridge"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("ui_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("ui_raw_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("throttling"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("mediascope_api_keys"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("diagnostics"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("app_system_flag"), c3393kh.m16001B());
        builder.appendQueryParameter(this.f24618a.m16092a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("easy_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("egress"), String.valueOf(1));
        builder.appendQueryParameter(this.f24618a.m16092a("startup_update"), String.valueOf(1));
    }

    /* renamed from: a */
    private void m16694a(Uri.Builder builder, C3154bc c3154bc, String str) {
        if (!c3154bc.m15682a()) {
            builder.appendQueryParameter(this.f24618a.m16092a(str), "");
        } else {
            builder.appendQueryParameter(this.f24618a.m16092a(str), c3154bc.f23129a.f23041b);
        }
    }
}
