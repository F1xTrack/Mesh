package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3762ym;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fj */
/* loaded from: classes2.dex */
public class C3265fj {

    /* renamed from: a */
    private final C3282ga f23445a;

    public C3265fj() {
        this(new C3282ga());
    }

    /* renamed from: a */
    public void m15946a(C3681vj c3681vj, C3762ym.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("diagnostics");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("functionalities")) == null) {
            return;
        }
        C3026Wa c3026Wa = null;
        C3026Wa c3026Wa2 = null;
        C3026Wa c3026Wa3 = null;
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                String string = jSONObject.getString("tag");
                C3282ga c3282ga = this.f23445a;
                C3392kg.e eVar = new C3392kg.e();
                eVar.f23987b = jSONObject.getLong("expiration_timestamp");
                eVar.f23988c = jSONObject.optInt("interval", eVar.f23988c);
                C3026Wa c3026WaMo13846a = c3282ga.mo13846a(eVar);
                if ("activation".equals(string)) {
                    c3026Wa = c3026WaMo13846a;
                } else if ("clids_info".equals(string)) {
                    c3026Wa3 = c3026WaMo13846a;
                } else if ("preload_info".equals(string)) {
                    c3026Wa2 = c3026WaMo13846a;
                }
            } catch (Throwable unused) {
            }
        }
        c3681vj.m17040a(new C3051Xa(c3026Wa, c3026Wa3, c3026Wa2));
    }

    public C3265fj(C3282ga c3282ga) {
        this.f23445a = c3282ga;
    }
}
