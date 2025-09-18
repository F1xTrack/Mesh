package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {
    private final JSONObject a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final boolean f;
    private final long g;
    private JSONObject h;
    private Long i;

    public f(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, long j) {
        this.b = str;
        this.a = jSONObject;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = j;
    }

    public String a() {
        return this.b;
    }

    public Long b() {
        return this.i;
    }

    public String c() {
        return this.d;
    }

    public JSONObject d() {
        return this.h;
    }

    public JSONObject e() {
        return this.a;
    }

    public String f() {
        return this.c;
    }

    public int g() {
        return this.e;
    }

    public long h() {
        return this.g;
    }

    public static f a(String str, String str2, String str3, int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("productId");
            if (!TextUtils.isEmpty(strOptString)) {
                return new f(jSONObject, str2, str3, strOptString, i, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j);
            }
            y2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            y2.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public f a(long j) {
        this.i = Long.valueOf(j);
        return this;
    }

    public f a(JSONObject jSONObject) {
        this.h = jSONObject;
        return this;
    }
}
