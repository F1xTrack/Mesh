package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Gk implements InterfaceC2811hl {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2811hl
    public JSONObject a(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cxts", obj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
