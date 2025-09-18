package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 {
    private static g0 c;
    private Context a;
    private final Object b = new Object();

    private g0() {
    }

    public static g0 a() {
        if (c == null) {
            b();
        }
        return c;
    }

    private static synchronized void b() {
        if (c == null) {
            c = new g0();
        }
    }

    private JSONObject a(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                v.b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    public void b(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) throws JSONException {
        e.a().a(str, i, str2, a(linkedHashMap), System.currentTimeMillis());
    }

    public void a(Context context) {
        synchronized (this.b) {
            try {
                if (this.a != null) {
                    return;
                }
                this.a = context;
                e.a().a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, int i) {
        e.a().a(str, i);
    }

    public void a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) throws JSONException {
        e.a().a(str, i, str2, a(linkedHashMap));
    }

    public void a(String str, Context context, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            e.a().a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            v.f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }
}
