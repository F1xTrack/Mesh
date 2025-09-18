package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Ql implements InterfaceC2910ll {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2910ll
    public JSONObject a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put("cid", j)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
