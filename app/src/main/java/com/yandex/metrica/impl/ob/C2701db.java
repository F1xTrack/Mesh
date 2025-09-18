package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Be;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.db, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2701db implements Ya<Be> {
    @Override // com.yandex.metrica.impl.ob.Ya
    public JSONObject a(Be be) {
        Be be2 = be;
        JSONObject jSONObject = new JSONObject();
        if (be2 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Be.a> it = be2.b.iterator();
                while (it.hasNext()) {
                    Be.a next = it.next();
                    jSONArray.put(next == null ? null : new JSONObject().putOpt("tracking_id", next.a).put("additional_parameters", next.b).put("source", next.c.a()));
                }
                JSONObject jSONObjectPut = jSONObject.put("candidates", jSONArray);
                Le le = be2.a;
                jSONObjectPut.put("chosen", new JSONObject().putOpt("tracking_id", le.a).put("additional_parameters", le.b).put("source", le.e.a()).put("auto_tracking_enabled", le.d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
