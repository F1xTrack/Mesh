package com.yandex.metrica.impl.p022ob;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q8 */
/* loaded from: classes2.dex */
class C3540q8 {

    /* renamed from: a */
    private String f24537a;

    /* renamed from: b */
    private String f24538b;

    /* renamed from: a */
    public void m16604a(String str) {
        this.f24537a = str;
    }

    /* renamed from: b */
    public void m16605b(String str) {
        this.f24538b = str;
    }

    /* renamed from: a */
    public String m16603a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f24537a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f24538b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
