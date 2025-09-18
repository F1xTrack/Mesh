package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hj */
/* loaded from: classes2.dex */
public final class C3317hj {

    /* renamed from: a */
    private final C3360ja f23609a;

    public C3317hj(C3360ja c3360ja) {
        this.f23609a = c3360ja;
    }

    /* renamed from: a */
    public final void m16056a(C3681vj c3681vj, JSONObject jSONObject) {
        C3392kg.h hVar = new C3392kg.h();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("egress");
        if (jSONObjectOptJSONObject != null) {
            hVar.f23993b = jSONObjectOptJSONObject.optString("url", hVar.f23993b);
            hVar.f23994c = jSONObjectOptJSONObject.optInt("repeated_delay", hVar.f23994c);
            hVar.f23995d = jSONObjectOptJSONObject.optInt("random_delay_window", hVar.f23995d);
            hVar.f23996e = jSONObjectOptJSONObject.optBoolean("background_allowed", hVar.f23996e);
            hVar.f23997f = jSONObjectOptJSONObject.optBoolean("diagnostic_enabled", hVar.f23997f);
        }
        c3681vj.m17046a(this.f23609a.mo13846a(hVar));
    }

    public C3317hj() {
        this(new C3360ja());
    }
}
