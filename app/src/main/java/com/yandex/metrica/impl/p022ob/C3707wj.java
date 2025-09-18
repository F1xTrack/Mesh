package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.wj */
/* loaded from: classes2.dex */
public final class C3707wj {

    /* renamed from: a */
    private final C2602Fa f25205a;

    public C3707wj(C2602Fa c2602Fa) {
        this.f25205a = c2602Fa;
    }

    /* renamed from: a */
    public final void m17148a(C3681vj c3681vj, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("startup_update");
        C3392kg.q qVar = new C3392kg.q();
        Integer numM17293c = C3762ym.m17293c(jSONObjectOptJSONObject, "interval_seconds");
        if (numM17293c != null) {
            qVar.f24086b = numM17293c.intValue();
        }
        c3681vj.m17037a(this.f25205a.mo13846a(qVar));
    }

    public C3707wj() {
        this(new C2602Fa());
    }
}
