package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Va implements Ya<P3> {
    @Override // com.yandex.metrica.impl.ob.Ya
    public JSONObject a(P3 p3) {
        P3 p32 = p3;
        JSONObject jSONObject = new JSONObject();
        if (p32 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<P3.a> it = p32.a().iterator();
                while (it.hasNext()) {
                    jSONArray.put(a(it.next()));
                }
                jSONObject.putOpt("chosen", a(p32.c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    private JSONObject a(P3.a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", C3240ym.e(aVar.b())).putOpt("source", aVar.a().a());
    }
}
