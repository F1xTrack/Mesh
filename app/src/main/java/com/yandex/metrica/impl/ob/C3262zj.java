package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3262zj {
    private final Ka a;
    private final Aj b;

    public C3262zj() {
        this(new Ka(), new Aj());
    }

    public void a(C3162vj c3162vj, JSONObject jSONObject) {
        Ka ka = this.a;
        C2880kg.v vVar = new C2880kg.v();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (jSONObjectOptJSONObject != null) {
            vVar.b = jSONObjectOptJSONObject.optInt("too_long_text_bound", vVar.b);
            vVar.c = jSONObjectOptJSONObject.optInt("truncated_text_bound", vVar.c);
            vVar.d = jSONObjectOptJSONObject.optInt("max_visited_children_in_level", vVar.d);
            vVar.e = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "after_create_timeout"), TimeUnit.SECONDS, vVar.e);
            vVar.f = jSONObjectOptJSONObject.optBoolean("relative_text_size_calculation", vVar.f);
            vVar.g = jSONObjectOptJSONObject.optBoolean("error_reporting", vVar.g);
            vVar.h = jSONObjectOptJSONObject.optBoolean("parsing_allowed_by_default", vVar.h);
            vVar.i = this.b.a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        c3162vj.a(ka.a(vVar));
    }

    public C3262zj(Ka ka, Aj aj) {
        this.a = ka;
        this.b = aj;
    }
}
