package io.appmetrica.analytics.impl;

import android.util.Base64;
import defpackage.AbstractC7680vr;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4992y0 {
    public static String a(C4968x0 c4968x0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c4968x0.a).put("packageName", c4968x0.b).put("reporterType", c4968x0.c.getStringValue()).put("processID", c4968x0.d).put("processSessionID", c4968x0.e).put("errorEnvironment", c4968x0.f).toString().getBytes(AbstractC7680vr.a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static C4968x0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), AbstractC7680vr.a));
            return new C4968x0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
