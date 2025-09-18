package io.appmetrica.analytics.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Q8 */
/* loaded from: classes2.dex */
public final class C4753Q8 {

    /* renamed from: a */
    public final C5482tn f30657a;

    public C4753Q8(C5482tn c5482tn) {
        this.f30657a = c5482tn;
    }

    /* renamed from: a */
    public final void m19741a(int i, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        C5482tn c5482tn = this.f30657a;
        synchronized (c5482tn) {
            jSONObjectOptJSONObject = c5482tn.f32656a.m21151a().optJSONObject("numbers_of_type");
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(String.valueOf(i), j);
        this.f30657a.m21098a(jSONObjectOptJSONObject);
    }
}
