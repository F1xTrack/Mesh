package com.p019vk.push.common.utils;

import kotlin.Metadata;
import org.json.JSONObject;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m22267d2 = {"optStringOrNull", "", "Lorg/json/JSONObject;", "key", "common_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JSONExtensionKt {
    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        O90.m5968f(jSONObject, "<this>");
        O90.m5968f(str, "key");
        String strOptString = jSONObject.optString(str);
        O90.m5967e(strOptString, "optString(key)");
        return StringExtensionsKt.nullIfBlank(strOptString);
    }
}
