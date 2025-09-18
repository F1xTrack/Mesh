package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2845P3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Va */
/* loaded from: classes2.dex */
public class C3001Va implements InterfaceC3076Ya<C2845P3> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3076Ya
    /* renamed from: a */
    public JSONObject mo15176a(C2845P3 c2845p3) {
        C2845P3 c2845p32 = c2845p3;
        JSONObject jSONObject = new JSONObject();
        if (c2845p32 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<C2845P3.a> it = c2845p32.mo13931a().iterator();
                while (it.hasNext()) {
                    jSONArray.put(m15302a(it.next()));
                }
                jSONObject.putOpt("chosen", m15302a(c2845p32.m14760c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m15302a(C2845P3.a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", C3762ym.m17302e(aVar.m14761b())).putOpt("source", aVar.mo14053a().m14026a());
    }
}
