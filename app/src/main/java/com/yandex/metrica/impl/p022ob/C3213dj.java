package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dj */
/* loaded from: classes2.dex */
class C3213dj {

    /* renamed from: a */
    private final C3100Z9 f23277a;

    public C3213dj() {
        this(new C3100Z9());
    }

    /* renamed from: a */
    public void m15802a(C3681vj c3681vj, JSONObject jSONObject) {
        C3100Z9 c3100z9 = this.f23277a;
        C3392kg.b bVar = new C3392kg.b();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject != null) {
            bVar.f23978b = jSONObjectOptJSONObject.optInt("send_frequency_seconds", bVar.f23978b);
            bVar.f23979c = jSONObjectOptJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f23979c);
        }
        c3681vj.m17043a(c3100z9.mo13846a(bVar));
    }

    public C3213dj(C3100Z9 c3100z9) {
        this.f23277a = c3100z9;
    }
}
