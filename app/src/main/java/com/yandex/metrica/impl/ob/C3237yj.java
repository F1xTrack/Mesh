package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3237yj {
    private Ja a;
    private final Aj b;

    public C3237yj() {
        this(new Ja(), new Aj());
    }

    public Kl a(JSONObject jSONObject, String str, C2880kg.u uVar) {
        Ja ja = this.a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            uVar.b = jSONObjectOptJSONObject.optBoolean("text_size_collecting", uVar.b);
            uVar.c = jSONObjectOptJSONObject.optBoolean("relative_text_size_collecting", uVar.c);
            uVar.d = jSONObjectOptJSONObject.optBoolean("text_visibility_collecting", uVar.d);
            uVar.e = jSONObjectOptJSONObject.optBoolean("text_style_collecting", uVar.e);
            uVar.j = jSONObjectOptJSONObject.optBoolean("info_collecting", uVar.j);
            uVar.k = jSONObjectOptJSONObject.optBoolean("non_content_view_collecting", uVar.k);
            uVar.l = jSONObjectOptJSONObject.optBoolean("text_length_collecting", uVar.l);
            uVar.m = jSONObjectOptJSONObject.optBoolean("view_hierarchical", uVar.m);
            uVar.o = jSONObjectOptJSONObject.optBoolean("ignore_filtered", uVar.o);
            uVar.p = jSONObjectOptJSONObject.optBoolean("web_view_urls_collecting", uVar.p);
            uVar.f = jSONObjectOptJSONObject.optInt("too_long_text_bound", uVar.f);
            uVar.g = jSONObjectOptJSONObject.optInt("truncated_text_bound", uVar.g);
            uVar.h = jSONObjectOptJSONObject.optInt("max_entities_count", uVar.h);
            uVar.i = jSONObjectOptJSONObject.optInt("max_full_content_length", uVar.i);
            uVar.q = jSONObjectOptJSONObject.optInt("web_view_url_limit", uVar.q);
            uVar.n = this.b.a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        return ja.a(uVar);
    }

    public C3237yj(Ja ja, Aj aj) {
        this.a = ja;
        this.b = aj;
    }
}
