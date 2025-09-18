package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pl */
/* loaded from: classes2.dex */
public class C2863Pl implements InterfaceC3397kl {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3397kl
    /* renamed from: a */
    public void mo14629a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.getJSONArray("ssh").getJSONObject(0).put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
