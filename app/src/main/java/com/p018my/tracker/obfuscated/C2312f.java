package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.f */
/* loaded from: classes2.dex */
public class C2312f {

    /* renamed from: a */
    private final JSONObject f19918a;

    /* renamed from: b */
    private final String f19919b;

    /* renamed from: c */
    private final String f19920c;

    /* renamed from: d */
    private final String f19921d;

    /* renamed from: e */
    private final int f19922e;

    /* renamed from: f */
    private final boolean f19923f;

    /* renamed from: g */
    private final long f19924g;

    /* renamed from: h */
    private JSONObject f19925h;

    /* renamed from: i */
    private Long f19926i;

    public C2312f(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, long j) {
        this.f19919b = str;
        this.f19918a = jSONObject;
        this.f19920c = str2;
        this.f19921d = str3;
        this.f19922e = i;
        this.f19923f = z;
        this.f19924g = j;
    }

    /* renamed from: a */
    public String m12961a() {
        return this.f19919b;
    }

    /* renamed from: b */
    public Long m12962b() {
        return this.f19926i;
    }

    /* renamed from: c */
    public String m12963c() {
        return this.f19921d;
    }

    /* renamed from: d */
    public JSONObject m12964d() {
        return this.f19925h;
    }

    /* renamed from: e */
    public JSONObject m12965e() {
        return this.f19918a;
    }

    /* renamed from: f */
    public String m12966f() {
        return this.f19920c;
    }

    /* renamed from: g */
    public int m12967g() {
        return this.f19922e;
    }

    /* renamed from: h */
    public long m12968h() {
        return this.f19924g;
    }

    /* renamed from: a */
    public static C2312f m12958a(String str, String str2, String str3, int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("productId");
            if (!TextUtils.isEmpty(strOptString)) {
                return new C2312f(jSONObject, str2, str3, strOptString, i, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j);
            }
            AbstractC2391y2.m13568a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public C2312f m12959a(long j) {
        this.f19926i = Long.valueOf(j);
        return this;
    }

    /* renamed from: a */
    public C2312f m12960a(JSONObject jSONObject) {
        this.f19925h = jSONObject;
        return this;
    }
}
