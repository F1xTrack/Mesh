package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zj */
/* loaded from: classes2.dex */
public class C3785zj {

    /* renamed from: a */
    private final C2727Ka f25439a;

    /* renamed from: b */
    private final C2486Aj f25440b;

    public C3785zj() {
        this(new C2727Ka(), new C2486Aj());
    }

    /* renamed from: a */
    public void m17339a(C3681vj c3681vj, JSONObject jSONObject) {
        C2727Ka c2727Ka = this.f25439a;
        C3392kg.v vVar = new C3392kg.v();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (jSONObjectOptJSONObject != null) {
            vVar.f24108b = jSONObjectOptJSONObject.optInt("too_long_text_bound", vVar.f24108b);
            vVar.f24109c = jSONObjectOptJSONObject.optInt("truncated_text_bound", vVar.f24109c);
            vVar.f24110d = jSONObjectOptJSONObject.optInt("max_visited_children_in_level", vVar.f24110d);
            vVar.f24111e = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "after_create_timeout"), TimeUnit.SECONDS, vVar.f24111e);
            vVar.f24112f = jSONObjectOptJSONObject.optBoolean("relative_text_size_calculation", vVar.f24112f);
            vVar.f24113g = jSONObjectOptJSONObject.optBoolean("error_reporting", vVar.f24113g);
            vVar.f24114h = jSONObjectOptJSONObject.optBoolean("parsing_allowed_by_default", vVar.f24114h);
            vVar.f24115i = this.f25440b.m13867a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        c3681vj.m17041a(c2727Ka.mo13846a(vVar));
    }

    public C3785zj(C2727Ka c2727Ka, C2486Aj c2486Aj) {
        this.f25439a = c2727Ka;
        this.f25440b = c2486Aj;
    }
}
