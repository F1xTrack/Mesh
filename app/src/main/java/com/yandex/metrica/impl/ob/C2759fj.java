package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3240ym;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2759fj {
    private final C2775ga a;

    public C2759fj() {
        this(new C2775ga());
    }

    public void a(C3162vj c3162vj, C3240ym.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("diagnostics");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("functionalities")) == null) {
            return;
        }
        Wa wa = null;
        Wa wa2 = null;
        Wa wa3 = null;
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                String string = jSONObject.getString("tag");
                C2775ga c2775ga = this.a;
                C2880kg.e eVar = new C2880kg.e();
                eVar.b = jSONObject.getLong("expiration_timestamp");
                eVar.c = jSONObject.optInt("interval", eVar.c);
                Wa waA = c2775ga.a(eVar);
                if ("activation".equals(string)) {
                    wa = waA;
                } else if ("clids_info".equals(string)) {
                    wa3 = waA;
                } else if ("preload_info".equals(string)) {
                    wa2 = waA;
                }
            } catch (Throwable unused) {
            }
        }
        c3162vj.a(new Xa(wa, wa3, wa2));
    }

    public C2759fj(C2775ga c2775ga) {
        this.a = c2775ga;
    }
}
