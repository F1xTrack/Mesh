package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yj */
/* loaded from: classes2.dex */
public class C3759yj {

    /* renamed from: a */
    private C2702Ja f25336a;

    /* renamed from: b */
    private final C2486Aj f25337b;

    public C3759yj() {
        this(new C2702Ja(), new C2486Aj());
    }

    /* renamed from: a */
    public C2738Kl m17263a(JSONObject jSONObject, String str, C3392kg.u uVar) {
        C2702Ja c2702Ja = this.f25336a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            uVar.f24092b = jSONObjectOptJSONObject.optBoolean("text_size_collecting", uVar.f24092b);
            uVar.f24093c = jSONObjectOptJSONObject.optBoolean("relative_text_size_collecting", uVar.f24093c);
            uVar.f24094d = jSONObjectOptJSONObject.optBoolean("text_visibility_collecting", uVar.f24094d);
            uVar.f24095e = jSONObjectOptJSONObject.optBoolean("text_style_collecting", uVar.f24095e);
            uVar.f24100j = jSONObjectOptJSONObject.optBoolean("info_collecting", uVar.f24100j);
            uVar.f24101k = jSONObjectOptJSONObject.optBoolean("non_content_view_collecting", uVar.f24101k);
            uVar.f24102l = jSONObjectOptJSONObject.optBoolean("text_length_collecting", uVar.f24102l);
            uVar.f24103m = jSONObjectOptJSONObject.optBoolean("view_hierarchical", uVar.f24103m);
            uVar.f24105o = jSONObjectOptJSONObject.optBoolean("ignore_filtered", uVar.f24105o);
            uVar.f24106p = jSONObjectOptJSONObject.optBoolean("web_view_urls_collecting", uVar.f24106p);
            uVar.f24096f = jSONObjectOptJSONObject.optInt("too_long_text_bound", uVar.f24096f);
            uVar.f24097g = jSONObjectOptJSONObject.optInt("truncated_text_bound", uVar.f24097g);
            uVar.f24098h = jSONObjectOptJSONObject.optInt("max_entities_count", uVar.f24098h);
            uVar.f24099i = jSONObjectOptJSONObject.optInt("max_full_content_length", uVar.f24099i);
            uVar.f24107q = jSONObjectOptJSONObject.optInt("web_view_url_limit", uVar.f24107q);
            uVar.f24104n = this.f25337b.m13867a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        return c2702Ja.mo13846a(uVar);
    }

    public C3759yj(C2702Ja c2702Ja, C2486Aj c2486Aj) {
        this.f25336a = c2702Ja;
        this.f25337b = c2486Aj;
    }
}
