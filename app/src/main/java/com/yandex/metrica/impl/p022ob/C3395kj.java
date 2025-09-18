package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3762ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kj */
/* loaded from: classes2.dex */
public class C3395kj {

    /* renamed from: a */
    private final C3516pa f24145a;

    public C3395kj() {
        this(new C3516pa());
    }

    /* renamed from: a */
    public void m16335a(C3681vj c3681vj, C3762ym.a aVar) {
        if (c3681vj.m17066e().f24713f) {
            C3392kg.j jVar = new C3392kg.j();
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (jSONObjectOptJSONObject != null) {
                jVar.f24023b = jSONObjectOptJSONObject.optLong("min_interval_seconds", jVar.f24023b);
            }
            c3681vj.m17048a(this.f24145a.mo13846a(jVar));
        }
    }

    public C3395kj(C3516pa c3516pa) {
        this.f24145a = c3516pa;
    }
}
