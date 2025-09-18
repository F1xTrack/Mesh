package com.p019vk.push.core.network.utils;

import com.p019vk.push.core.network.model.ResponseError;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, m22267d2 = {"hasErrorBody", "", "jsonData", "", "parseErrorResponse", "Lcom/vk/push/core/network/model/ResponseError;", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ResponseErrorKt {
    public static final boolean hasErrorBody(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).has("error");
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final ResponseError parseErrorResponse(String str) throws JSONException {
        O90.m5968f(str, "jsonData");
        JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
        int i = jSONObject.getInt("code");
        String string = jSONObject.getString("message");
        O90.m5967e(string, "jsonError.getString(\"message\")");
        String strOptString = jSONObject.optString("status");
        O90.m5967e(strOptString, "jsonError.optString(\"status\")");
        return new ResponseError(i, string, strOptString);
    }
}
