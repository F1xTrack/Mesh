package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.p0 */
/* loaded from: classes2.dex */
public final class C2353p0 {

    /* renamed from: a */
    private final JSONObject f20081a;

    /* renamed from: b */
    private final String f20082b;

    /* renamed from: c */
    private final String f20083c;

    /* renamed from: d */
    private final boolean f20084d;

    /* renamed from: e */
    private final long f20085e;

    /* renamed from: f */
    private JSONObject f20086f;

    /* renamed from: g */
    private Long f20087g;

    public C2353p0(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.f20082b = str;
        this.f20081a = jSONObject;
        this.f20083c = str2;
        this.f20084d = z;
        this.f20085e = j;
    }

    /* renamed from: a */
    public String m13375a() {
        return this.f20082b;
    }

    /* renamed from: b */
    public Long m13376b() {
        return this.f20087g;
    }

    /* renamed from: c */
    public String m13377c() {
        return this.f20083c;
    }

    /* renamed from: d */
    public JSONObject m13378d() {
        return this.f20081a;
    }

    /* renamed from: e */
    public JSONObject m13379e() {
        return this.f20086f;
    }

    /* renamed from: f */
    public long m13380f() {
        return this.f20085e;
    }

    /* renamed from: g */
    public boolean m13381g() {
        return this.f20084d;
    }

    /* renamed from: a */
    public static C2353p0 m13371a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
                return m13372a(jSONObject, str2, j);
            }
            AbstractC2391y2.m13568a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C2353p0 m13372a(JSONObject jSONObject, String str, long j) {
        return new C2353p0(jSONObject, str, jSONObject.optString("productId"), jSONObject.has("autoRenewing"), j);
    }

    /* renamed from: a */
    public C2353p0 m13373a(long j) {
        this.f20087g = Long.valueOf(j);
        return this;
    }

    /* renamed from: a */
    public C2353p0 m13374a(JSONObject jSONObject) {
        this.f20086f = jSONObject;
        return this;
    }
}
