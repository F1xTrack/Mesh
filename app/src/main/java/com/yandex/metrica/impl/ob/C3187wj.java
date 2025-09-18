package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3187wj {
    private final Fa a;

    public C3187wj(Fa fa) {
        this.a = fa;
    }

    public final void a(C3162vj c3162vj, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("startup_update");
        C2880kg.q qVar = new C2880kg.q();
        Integer numC = C3240ym.c(jSONObjectOptJSONObject, "interval_seconds");
        if (numC != null) {
            qVar.b = numC.intValue();
        }
        c3162vj.a(this.a.a(qVar));
    }

    public C3187wj() {
        this(new Fa());
    }
}
