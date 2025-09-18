package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.S;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class H7 {
    private final byte[] a;
    private final String b;
    private final int c;
    private final HashMap<S.a, Integer> d;
    private final String e;
    private final Integer f;
    private final String g;
    private final String h;
    private final com.yandex.metrica.c i;
    private final String j;

    public H7(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.b = jSONObject2.getString("name");
        this.c = jSONObject2.getInt("bytes_truncated");
        this.j = C3240ym.e(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.d = new HashMap<>();
        if (strOptString != null) {
            try {
                HashMap<String, String> mapD = C3240ym.d(strOptString);
                if (mapD != null) {
                    for (Map.Entry<String, String> entry : mapD.entrySet()) {
                        this.d.put(S.a.valueOf(entry.getKey()), Integer.valueOf(Integer.parseInt(entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.e = jSONObject3.getString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME);
        this.f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.h = jSONObject4.getString("api_key");
        this.i = a(jSONObject4);
    }

    public String a() {
        return this.h;
    }

    public int b() {
        return this.c;
    }

    public byte[] c() {
        return this.a;
    }

    public String d() {
        return this.j;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.e;
    }

    public Integer g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public com.yandex.metrica.c i() {
        return this.i;
    }

    public HashMap<S.a, Integer> j() {
        return this.d;
    }

    public String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry<S.a, Integer> entry : this.d.entrySet()) {
            map.put(entry.getKey().name(), entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f).put("psid", this.g).put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, this.e)).put("reporter_configuration", new JSONObject().put("api_key", this.h).put("reporter_type", this.i.a)).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.a, 0)).put("name", this.b).put("bytes_truncated", this.c).put("trimmed_fields", C3240ym.g(map)).putOpt("environment", this.j)).toString();
    }

    @Deprecated
    private com.yandex.metrica.c a(JSONObject jSONObject) throws JSONException {
        return jSONObject.has("reporter_type") ? com.yandex.metrica.c.a(jSONObject.getString("reporter_type")) : jSONObject.getBoolean("is_commutation") ? com.yandex.metrica.c.COMMUTATION : com.yandex.metrica.c.MAIN;
    }

    public H7(C2864k0 c2864k0, T3 t3, HashMap<S.a, Integer> map) {
        this.a = c2864k0.q();
        this.b = c2864k0.g();
        this.c = c2864k0.d();
        if (map != null) {
            this.d = map;
        } else {
            this.d = new HashMap<>();
        }
        U3 u3A = t3.a();
        this.e = u3A.f();
        this.f = u3A.g();
        this.g = u3A.h();
        CounterConfiguration counterConfigurationB = t3.b();
        this.h = counterConfigurationB.a();
        this.i = com.yandex.metrica.c.a(counterConfigurationB.a.getAsString("CFG_REPORTER_TYPE"));
        this.j = c2864k0.h();
    }
}
