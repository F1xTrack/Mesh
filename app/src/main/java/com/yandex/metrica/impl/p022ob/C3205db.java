package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2506Be;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.db */
/* loaded from: classes2.dex */
public class C3205db implements InterfaceC3076Ya<C2506Be> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3076Ya
    /* renamed from: a */
    public JSONObject mo15176a(C2506Be c2506Be) {
        C2506Be c2506Be2 = c2506Be;
        JSONObject jSONObject = new JSONObject();
        if (c2506Be2 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<C2506Be.a> it = c2506Be2.f20931b.iterator();
                while (it.hasNext()) {
                    C2506Be.a next = it.next();
                    jSONArray.put(next == null ? null : new JSONObject().putOpt("tracking_id", next.f20932a).put("additional_parameters", next.f20933b).put("source", next.f20934c.m14026a()));
                }
                JSONObject jSONObjectPut = jSONObject.put("candidates", jSONArray);
                C2756Le c2756Le = c2506Be2.f20930a;
                jSONObjectPut.put("chosen", new JSONObject().putOpt("tracking_id", c2756Le.f21638a).put("additional_parameters", c2756Le.f21639b).put("source", c2756Le.f21642e.m14026a()).put("auto_tracking_enabled", c2756Le.f21641d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
