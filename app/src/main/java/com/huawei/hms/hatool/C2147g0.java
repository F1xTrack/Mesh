package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.g0 */
/* loaded from: classes.dex */
public final class C2147g0 {

    /* renamed from: c */
    private static C2147g0 f19176c;

    /* renamed from: a */
    private Context f19177a;

    /* renamed from: b */
    private final Object f19178b = new Object();

    private C2147g0() {
    }

    /* renamed from: a */
    public static C2147g0 m11993a() {
        if (f19176c == null) {
            m11995b();
        }
        return f19176c;
    }

    /* renamed from: b */
    private static synchronized void m11995b() {
        if (f19176c == null) {
            f19176c = new C2147g0();
        }
    }

    /* renamed from: a */
    private JSONObject m11994a(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                C2186v.m12268b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void m12000b(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) throws JSONException {
        C2140e.m11963a().m11969a(str, i, str2, m11994a(linkedHashMap), System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m11996a(Context context) {
        synchronized (this.f19178b) {
            try {
                if (this.f19177a != null) {
                    return;
                }
                this.f19177a = context;
                C2140e.m11963a().m11966a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m11997a(String str, int i) {
        C2140e.m11963a().m11967a(str, i);
    }

    /* renamed from: a */
    public void m11998a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) throws JSONException {
        C2140e.m11963a().m11968a(str, i, str2, m11994a(linkedHashMap));
    }

    /* renamed from: a */
    public void m11999a(String str, Context context, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            C2140e.m11963a().m11968a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            C2186v.m12276f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }
}
