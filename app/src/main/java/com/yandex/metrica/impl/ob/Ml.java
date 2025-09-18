package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Ml implements InterfaceC2885kl {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2885kl
    public void a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
