package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;
import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.y0 */
/* loaded from: classes2.dex */
public final class C5584y0 {
    /* renamed from: a */
    public static String m21215a(C5559x0 c5559x0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c5559x0.f32787a).put("packageName", c5559x0.f32788b).put("reporterType", c5559x0.f32789c.getStringValue()).put("processID", c5559x0.f32790d).put("processSessionID", c5559x0.f32791e).put("errorEnvironment", c5559x0.f32792f).toString().getBytes(AbstractC7038vr.f44561a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C5559x0 m21214a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), AbstractC7038vr.f44561a));
            return new C5559x0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
