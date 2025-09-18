package com.yandex.metrica.impl.p022ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Z2 */
/* loaded from: classes2.dex */
public class C3093Z2 {

    /* renamed from: a */
    public final String f22909a;

    /* renamed from: b */
    public final String f22910b;

    /* renamed from: c */
    public final boolean f22911c;

    /* renamed from: d */
    public final int f22912d;

    /* renamed from: e */
    public final Long f22913e;

    public C3093Z2(String str, String str2, boolean z, int i, Long l) {
        this.f22909a = str;
        this.f22910b = str2;
        this.f22911c = z;
        this.f22912d = i;
        this.f22913e = l;
    }

    /* renamed from: a */
    public static JSONArray m15525a(Collection<C3093Z2> collection) {
        JSONObject jSONObjectPut;
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C3093Z2 c3093z2 : collection) {
                c3093z2.getClass();
                try {
                    jSONObjectPut = new JSONObject().put("mac", c3093z2.f22909a).put("ssid", c3093z2.f22910b).put("signal_strength", c3093z2.f22912d).put("is_connected", c3093z2.f22911c).put("last_visible_offset_seconds", c3093z2.f22913e);
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
