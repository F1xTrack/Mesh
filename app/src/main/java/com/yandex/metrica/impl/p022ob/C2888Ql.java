package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ql */
/* loaded from: classes2.dex */
public class C2888Ql implements InterfaceC3423ll {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3423ll
    /* renamed from: a */
    public JSONObject mo14673a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put("cid", j)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
