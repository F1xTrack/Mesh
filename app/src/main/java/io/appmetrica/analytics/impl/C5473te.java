package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.te */
/* loaded from: classes2.dex */
public final class C5473te {

    /* renamed from: a */
    public final String f32630a;

    /* renamed from: b */
    public final JSONObject f32631b;

    /* renamed from: c */
    public final EnumC4728P7 f32632c;

    public C5473te(String str, JSONObject jSONObject, EnumC4728P7 enumC4728P7) {
        this.f32630a = str;
        this.f32631b = jSONObject;
        this.f32632c = enumC4728P7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f32630a + "', additionalParams=" + this.f32631b + ", source=" + this.f32632c + '}';
    }
}
