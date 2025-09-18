package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4886te {
    public final String a;
    public final JSONObject b;
    public final P7 c;

    public C4886te(String str, JSONObject jSONObject, P7 p7) {
        this.a = str;
        this.b = jSONObject;
        this.c = p7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.a + "', additionalParams=" + this.b + ", source=" + this.c + '}';
    }
}
