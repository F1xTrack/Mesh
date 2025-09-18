package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C4445Dd;
import io.appmetrica.analytics.impl.C4970Za;
import io.appmetrica.analytics.impl.C5271lc;
import io.appmetrica.analytics.impl.C5622zd;
import io.appmetrica.analytics.impl.EnumC4514G9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C5622zd(EnumC4514G9.ADJUST) : new C4445Dd(EnumC4514G9.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C5622zd(EnumC4514G9.AIRBRIDGE) : new C5271lc(EnumC4514G9.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C5622zd(EnumC4514G9.APPSFLYER) : new C5271lc(EnumC4514G9.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C5622zd(EnumC4514G9.KOCHAVA) : new C4970Za(EnumC4514G9.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C5622zd(EnumC4514G9.SINGULAR) : new C5271lc(EnumC4514G9.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C5622zd(EnumC4514G9.TENJIN) : new C5271lc(EnumC4514G9.TENJIN, map);
    }
}
