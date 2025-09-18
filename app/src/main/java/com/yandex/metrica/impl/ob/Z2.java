package com.yandex.metrica.impl.ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Z2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final Long e;

    public Z2(String str, String str2, boolean z, int i, Long l) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = l;
    }

    public static JSONArray a(Collection<Z2> collection) {
        JSONObject jSONObjectPut;
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (Z2 z2 : collection) {
                z2.getClass();
                try {
                    jSONObjectPut = new JSONObject().put("mac", z2.a).put("ssid", z2.b).put("signal_strength", z2.d).put("is_connected", z2.c).put("last_visible_offset_seconds", z2.e);
                } catch (Throwable unused) {
                    jSONObjectPut = null;
                }
                if (jSONObjectPut != null) {
                    jSONArray.put(jSONObjectPut);
                }
            }
        }
        return jSONArray;
    }
}
