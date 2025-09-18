package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC7038vr;
import p000.O90;

@Metadata(m22266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¨\u0006\u0016"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/parsing/RemoteConfigJsonUtils;", "", "Lorg/json/JSONObject;", "input", "", "name", "", "fallback", "extractFeature", "key", "extractQuery", "type", "", "", "extractHosts", "(Lorg/json/JSONObject;Ljava/lang/String;)[[B", "", "defaultMillis", "extractMillisFromSecondsOrDefault", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "extractMillisOrDefault", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class RemoteConfigJsonUtils {
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    public static final boolean extractFeature(JSONObject input, String name, boolean fallback) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            JSONObject jSONObjectOptJSONObject3 = input.optJSONObject("features");
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(name)) != null) {
                return jSONObjectOptJSONObject2.optBoolean("enabled", fallback);
            }
        } catch (Throwable unused) {
        }
        return fallback;
    }

    public static final byte[][] extractHosts(JSONObject input, String type) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3 = input.optJSONObject("query_hosts");
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(type)) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("urls")) == null) {
            return new byte[0][];
        }
        int length = jSONArrayOptJSONArray.length();
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            bArr[i] = jSONArrayOptJSONArray.optString(i).getBytes(AbstractC7038vr.f44561a);
        }
        return bArr;
    }

    public static final long extractMillisFromSecondsOrDefault(JSONObject input, String key, long defaultMillis) {
        return extractMillisOrDefault(input, key, TimeUnit.SECONDS, defaultMillis);
    }

    public static final long extractMillisOrDefault(JSONObject input, String key, TimeUnit timeUnit, long defaultMillis) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(input, key), timeUnit, defaultMillis);
    }

    public static final String extractQuery(JSONObject input, String key) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            JSONObject jSONObjectOptJSONObject3 = input.optJSONObject("queries");
            if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(key)) == null) {
                return null;
            }
            RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
            String strOptString = jSONObjectOptJSONObject2.optString("url", "");
            remoteConfigJsonUtils.getClass();
            if (O90.m5963a(strOptString, "")) {
                return null;
            }
            return strOptString;
        } catch (Throwable unused) {
            return null;
        }
    }
}
