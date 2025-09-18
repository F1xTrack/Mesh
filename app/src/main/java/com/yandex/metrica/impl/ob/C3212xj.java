package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3240ym;
import com.yandex.metrica.impl.ob.Vi;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3212xj {
    private static final C2880kg.t a = new C2880kg.t();

    public Vi a(C3240ym.a aVar, String str) {
        Vi.a aVar2;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject(str);
        Vi.a aVar3 = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cell");
        if (jSONObjectOptJSONObject2 != null) {
            C2880kg.t tVar = a;
            aVar2 = new Vi.a(jSONObjectOptJSONObject2.optInt("refresh_event_count", tVar.b), jSONObjectOptJSONObject2.optLong("refresh_period_seconds", tVar.c));
        } else {
            aVar2 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("wifi");
        if (jSONObjectOptJSONObject3 != null) {
            C2880kg.t tVar2 = a;
            aVar3 = new Vi.a(jSONObjectOptJSONObject3.optInt("refresh_event_count", tVar2.b), jSONObjectOptJSONObject3.optLong("refresh_period_seconds", tVar2.c));
        }
        return new Vi(aVar2, aVar3);
    }
}
