package io.appmetrica.analytics.impl;

import defpackage.O90;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class He implements Q7 {
    public final String a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final P7 e;

    public He(String str, JSONObject jSONObject, boolean z, boolean z2, P7 p7) {
        this.a = str;
        this.b = jSONObject;
        this.c = z;
        this.d = z2;
        this.e = p7;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final P7 a() {
        return this.e;
    }

    public final JSONObject b() {
        if (!this.c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            if (this.b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            jSONObject.put("additionalParams", this.b);
            jSONObject.put("wasSet", this.c);
            jSONObject.put("autoTracking", this.d);
            jSONObject.put("source", this.e.a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.a + "', additionalParameters=" + this.b + ", wasSet=" + this.c + ", autoTrackingEnabled=" + this.d + ", source=" + this.e + '}';
    }

    public static He a(JSONObject jSONObject) {
        P7 p7;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        P7[] p7ArrValues = P7.values();
        int length = p7ArrValues.length;
        while (true) {
            if (i >= length) {
                p7 = null;
                break;
            }
            p7 = p7ArrValues[i];
            if (O90.a(p7.a, strOptStringOrNull2)) {
                break;
            }
            i++;
        }
        return new He(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, p7 == null ? P7.b : p7);
    }
}
