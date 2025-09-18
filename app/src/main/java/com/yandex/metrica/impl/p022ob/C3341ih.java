package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import java.util.Map;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: com.yandex.metrica.impl.ob.ih */
/* loaded from: classes2.dex */
public class C3341ih {

    /* renamed from: a */
    private final Map<String, String> f23655a;

    public C3341ih() {
        HashMap map = new HashMap();
        this.f23655a = map;
        map.put("wakeup", "wu");
        map.put("easy_collecting", "ec");
        map.put("cells_around", "ca");
        map.put("google_aid", "g");
        map.put("huawei_oaid", UcumUtils.UCUM_HOURS);
        map.put("sim_info", "si");
        map.put("throttling", "tht");
        map.put("wifi_around", "wa");
        map.put("wifi_connected", "wc");
        map.put("features_collecting", "fc");
        map.put("cell_additional_info", "cai");
        map.put("cell_additional_info_connected_only", "caico");
        map.put("location_collecting", "lc");
        map.put("lbs_collecting", "lbs");
        map.put("package_info", "pi");
        map.put("permissions_collecting", "pc");
        map.put("sdk_list", "sl");
        map.put("socket", UcumUtils.UCUM_SECONDS);
        map.put("identity_light_collecting", "ilc");
        map.put("gpl_collecting", "gplc");
        map.put("retry_policy", "rp");
        map.put("ui_parsing", "up");
        map.put("ui_collecting_for_bridge", "ucfb");
        map.put("ui_event_sending", "ues");
        map.put("ui_raw_event_sending", "ures");
        map.put("cache_control", "cc");
        map.put("mediascope_api_keys", "mak");
        map.put("diagnostics", UcumUtils.UCUM_DAYS);
        map.put("auto_inapp_collecting", "aic");
        map.put("attribution", "at");
        map.put("egress", "eg");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
    }

    /* renamed from: a */
    public String m16092a(String str) {
        return this.f23655a.containsKey(str) ? this.f23655a.get(str) : str;
    }
}
