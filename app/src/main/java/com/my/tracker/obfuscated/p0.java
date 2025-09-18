package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p0 {
    private final JSONObject a;
    private final String b;
    private final String c;
    private final boolean d;
    private final long e;
    private JSONObject f;
    private Long g;

    public p0(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.b = str;
        this.a = jSONObject;
        this.c = str2;
        this.d = z;
        this.e = j;
    }

    public String a() {
        return this.b;
    }

    public Long b() {
        return this.g;
    }

    public String c() {
        return this.c;
    }

    public JSONObject d() {
        return this.a;
    }

    public JSONObject e() {
        return this.f;
    }

    public long f() {
        return this.e;
    }

    public boolean g() {
        return this.d;
    }

    public static p0 a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
                return a(jSONObject, str2, j);
            }
            y2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            y2.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public static p0 a(JSONObject jSONObject, String str, long j) {
        return new p0(jSONObject, str, jSONObject.optString("productId"), jSONObject.has("autoRenewing"), j);
    }

    public p0 a(long j) {
        this.g = Long.valueOf(j);
        return this;
    }

    public p0 a(JSONObject jSONObject) {
        this.f = jSONObject;
        return this;
    }
}
