package com.yandex.metrica.impl.ob;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2922m8 {
    private static String[] a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    public C4 a(String str) {
        try {
            return a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    private C4 a(JSONObject jSONObject) throws JSONException, NumberFormatException {
        try {
            for (String str : a) {
                if (!jSONObject.has(str)) {
                    return null;
                }
            }
            int i = jSONObject.getInt("arg_pd");
            if (i == 0) {
                i = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i), jSONObject.getString("arg_ps"), com.yandex.metrica.c.a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
