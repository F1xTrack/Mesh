package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2709dj {
    private final Z9 a;

    public C2709dj() {
        this(new Z9());
    }

    public void a(C3162vj c3162vj, JSONObject jSONObject) {
        Z9 z9 = this.a;
        C2880kg.b bVar = new C2880kg.b();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject != null) {
            bVar.b = jSONObjectOptJSONObject.optInt("send_frequency_seconds", bVar.b);
            bVar.c = jSONObjectOptJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.c);
        }
        c3162vj.a(z9.a(bVar));
    }

    public C2709dj(Z9 z9) {
        this.a = z9;
    }
}
