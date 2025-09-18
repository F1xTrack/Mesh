package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3240ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2883kj {
    private final C2999pa a;

    public C2883kj() {
        this(new C2999pa());
    }

    public void a(C3162vj c3162vj, C3240ym.a aVar) {
        if (c3162vj.e().f) {
            C2880kg.j jVar = new C2880kg.j();
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (jSONObjectOptJSONObject != null) {
                jVar.b = jSONObjectOptJSONObject.optLong("min_interval_seconds", jVar.b);
            }
            c3162vj.a(this.a.a(jVar));
        }
    }

    public C2883kj(C2999pa c2999pa) {
        this.a = c2999pa;
    }
}
