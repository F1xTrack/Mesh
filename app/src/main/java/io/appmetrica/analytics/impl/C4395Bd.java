package io.appmetrica.analytics.impl;

import java.util.HashMap;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: io.appmetrica.analytics.impl.Bd */
/* loaded from: classes2.dex */
public final class C4395Bd {

    /* renamed from: a */
    public final HashMap f29897a;

    public C4395Bd() {
        HashMap map = new HashMap();
        this.f29897a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", UcumUtils.UCUM_HOURS);
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", "pc");
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put("auto_inapp_collecting", "aic");
        map.put("attribution", "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    /* renamed from: a */
    public final String m19233a(String str) {
        return this.f29897a.containsKey(str) ? (String) this.f29897a.get(str) : str;
    }
}
