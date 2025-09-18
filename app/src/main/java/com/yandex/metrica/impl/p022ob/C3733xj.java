package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3009Vi;
import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3762ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xj */
/* loaded from: classes2.dex */
public class C3733xj {

    /* renamed from: a */
    private static final C3392kg.t f25256a = new C3392kg.t();

    /* renamed from: a */
    public C3009Vi m17192a(C3762ym.a aVar, String str) {
        C3009Vi.a aVar2;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject(str);
        C3009Vi.a aVar3 = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cell");
        if (jSONObjectOptJSONObject2 != null) {
            C3392kg.t tVar = f25256a;
            aVar2 = new C3009Vi.a(jSONObjectOptJSONObject2.optInt("refresh_event_count", tVar.f24090b), jSONObjectOptJSONObject2.optLong("refresh_period_seconds", tVar.f24091c));
        } else {
            aVar2 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("wifi");
        if (jSONObjectOptJSONObject3 != null) {
            C3392kg.t tVar2 = f25256a;
            aVar3 = new C3009Vi.a(jSONObjectOptJSONObject3.optInt("refresh_event_count", tVar2.f24090b), jSONObjectOptJSONObject3.optLong("refresh_period_seconds", tVar2.f24091c));
        }
        return new C3009Vi(aVar2, aVar3);
    }
}
