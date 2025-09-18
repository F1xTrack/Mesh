package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2809hj {
    private final C2849ja a;

    public C2809hj(C2849ja c2849ja) {
        this.a = c2849ja;
    }

    public final void a(C3162vj c3162vj, JSONObject jSONObject) {
        C2880kg.h hVar = new C2880kg.h();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("egress");
        if (jSONObjectOptJSONObject != null) {
            hVar.b = jSONObjectOptJSONObject.optString("url", hVar.b);
            hVar.c = jSONObjectOptJSONObject.optInt("repeated_delay", hVar.c);
            hVar.d = jSONObjectOptJSONObject.optInt("random_delay_window", hVar.d);
            hVar.e = jSONObjectOptJSONObject.optBoolean("background_allowed", hVar.e);
            hVar.f = jSONObjectOptJSONObject.optBoolean("diagnostic_enabled", hVar.f);
        }
        c3162vj.a(this.a.a(hVar));
    }

    public C2809hj() {
        this(new C2849ja());
    }
}
