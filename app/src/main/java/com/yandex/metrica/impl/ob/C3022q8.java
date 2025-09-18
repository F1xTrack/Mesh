package com.yandex.metrica.impl.ob;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3022q8 {
    private String a;
    private String b;

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
