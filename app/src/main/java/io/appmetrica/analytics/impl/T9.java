package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class T9 {
    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null, Boolean.valueOf(z))).booleanValue();
    }
}
