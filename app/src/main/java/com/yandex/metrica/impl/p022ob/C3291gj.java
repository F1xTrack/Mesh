package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gj */
/* loaded from: classes2.dex */
public final class C3291gj {

    /* renamed from: a */
    private final C3334ia f23529a;

    public C3291gj(C3334ia c3334ia) {
        this.f23529a = c3334ia;
    }

    /* renamed from: a */
    public final void m16005a(C3681vj c3681vj, JSONObject jSONObject) {
        C3392kg.g gVar = new C3392kg.g();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (jSONObjectOptJSONObject != null) {
            gVar.f23992b = jSONObjectOptJSONObject.optLong("first_delay_seconds", gVar.f23992b);
        }
        c3681vj.m17035a(this.f23529a.mo13846a(gVar));
    }

    public C3291gj() {
        this(new C3334ia());
    }
}
