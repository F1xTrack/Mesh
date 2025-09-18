package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.He */
/* loaded from: classes2.dex */
public final class C4543He implements InterfaceC4752Q7 {

    /* renamed from: a */
    public final String f30251a;

    /* renamed from: b */
    public final JSONObject f30252b;

    /* renamed from: c */
    public final boolean f30253c;

    /* renamed from: d */
    public final boolean f30254d;

    /* renamed from: e */
    public final EnumC4728P7 f30255e;

    public C4543He(String str, JSONObject jSONObject, boolean z, boolean z2, EnumC4728P7 enumC4728P7) {
        this.f30251a = str;
        this.f30252b = jSONObject;
        this.f30253c = z;
        this.f30254d = z2;
        this.f30255e = enumC4728P7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4752Q7
    /* renamed from: a */
    public final EnumC4728P7 mo19471a() {
        return this.f30255e;
    }

    /* renamed from: b */
    public final JSONObject m19472b() {
        if (!this.f30253c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f30251a);
            if (this.f30252b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f30252b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: c */
    public final JSONObject m19473c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f30251a);
            jSONObject.put("additionalParams", this.f30252b);
            jSONObject.put("wasSet", this.f30253c);
            jSONObject.put("autoTracking", this.f30254d);
            jSONObject.put("source", this.f30255e.f30609a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f30251a + "', additionalParameters=" + this.f30252b + ", wasSet=" + this.f30253c + ", autoTrackingEnabled=" + this.f30254d + ", source=" + this.f30255e + '}';
    }

    /* renamed from: a */
    public static C4543He m19470a(JSONObject jSONObject) {
        EnumC4728P7 enumC4728P7;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC4728P7[] enumC4728P7ArrValues = EnumC4728P7.values();
        int length = enumC4728P7ArrValues.length;
        while (true) {
            if (i >= length) {
                enumC4728P7 = null;
                break;
            }
            enumC4728P7 = enumC4728P7ArrValues[i];
            if (O90.m5963a(enumC4728P7.f30609a, strOptStringOrNull2)) {
                break;
            }
            i++;
        }
        return new C4543He(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, enumC4728P7 == null ? EnumC4728P7.f30604b : enumC4728P7);
    }
}
