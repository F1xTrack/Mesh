package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2784gj {
    private final C2825ia a;

    public C2784gj(C2825ia c2825ia) {
        this.a = c2825ia;
    }

    public final void a(C3162vj c3162vj, JSONObject jSONObject) {
        C2880kg.g gVar = new C2880kg.g();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (jSONObjectOptJSONObject != null) {
            gVar.b = jSONObjectOptJSONObject.optLong("first_delay_seconds", gVar.b);
        }
        c3162vj.a(this.a.a(gVar));
    }

    public C2784gj() {
        this(new C2825ia());
    }
}
