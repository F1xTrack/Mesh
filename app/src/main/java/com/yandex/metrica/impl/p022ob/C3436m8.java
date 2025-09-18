package com.yandex.metrica.impl.p022ob;

import android.util.Base64;
import com.yandex.metrica.EnumC2458c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m8 */
/* loaded from: classes2.dex */
class C3436m8 {

    /* renamed from: a */
    private static String[] f24251a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    /* renamed from: a */
    public C2521C4 m16425a(String str) {
        try {
            return m16424a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C2521C4 m16424a(JSONObject jSONObject) throws JSONException, NumberFormatException {
        try {
            for (String str : f24251a) {
                if (!jSONObject.has(str)) {
                    return null;
                }
            }
            int i = jSONObject.getInt("arg_pd");
            if (i == 0) {
                i = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C2521C4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i), jSONObject.getString("arg_ps"), EnumC2458c.m13801a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
