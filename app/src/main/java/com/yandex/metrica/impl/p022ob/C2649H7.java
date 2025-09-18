package com.yandex.metrica.impl.p022ob;

import android.util.Base64;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.EnumC2458c;
import com.yandex.metrica.impl.p022ob.C2915S;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H7 */
/* loaded from: classes2.dex */
public class C2649H7 {

    /* renamed from: a */
    private final byte[] f21340a;

    /* renamed from: b */
    private final String f21341b;

    /* renamed from: c */
    private final int f21342c;

    /* renamed from: d */
    private final HashMap<C2915S.a, Integer> f21343d;

    /* renamed from: e */
    private final String f21344e;

    /* renamed from: f */
    private final Integer f21345f;

    /* renamed from: g */
    private final String f21346g;

    /* renamed from: h */
    private final String f21347h;

    /* renamed from: i */
    private final EnumC2458c f21348i;

    /* renamed from: j */
    private final String f21349j;

    public C2649H7(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f21340a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f21341b = jSONObject2.getString("name");
        this.f21342c = jSONObject2.getInt("bytes_truncated");
        this.f21349j = C3762ym.m17300e(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f21343d = new HashMap<>();
        if (strOptString != null) {
            try {
                HashMap<String, String> mapM17298d = C3762ym.m17298d(strOptString);
                if (mapM17298d != null) {
                    for (Map.Entry<String, String> entry : mapM17298d.entrySet()) {
                        this.f21343d.put(C2915S.a.valueOf(entry.getKey()), Integer.valueOf(Integer.parseInt(entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f21344e = jSONObject3.getString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME);
        this.f21345f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f21346g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f21347h = jSONObject4.getString("api_key");
        this.f21348i = m14220a(jSONObject4);
    }

    /* renamed from: a */
    public String m14221a() {
        return this.f21347h;
    }

    /* renamed from: b */
    public int m14222b() {
        return this.f21342c;
    }

    /* renamed from: c */
    public byte[] m14223c() {
        return this.f21340a;
    }

    /* renamed from: d */
    public String m14224d() {
        return this.f21349j;
    }

    /* renamed from: e */
    public String m14225e() {
        return this.f21341b;
    }

    /* renamed from: f */
    public String m14226f() {
        return this.f21344e;
    }

    /* renamed from: g */
    public Integer m14227g() {
        return this.f21345f;
    }

    /* renamed from: h */
    public String m14228h() {
        return this.f21346g;
    }

    /* renamed from: i */
    public EnumC2458c m14229i() {
        return this.f21348i;
    }

    /* renamed from: j */
    public HashMap<C2915S.a, Integer> m14230j() {
        return this.f21343d;
    }

    /* renamed from: k */
    public String m14231k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry<C2915S.a, Integer> entry : this.f21343d.entrySet()) {
            map.put(entry.getKey().name(), entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f21345f).put("psid", this.f21346g).put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, this.f21344e)).put("reporter_configuration", new JSONObject().put("api_key", this.f21347h).put("reporter_type", this.f21348i.f20784a)).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f21340a, 0)).put("name", this.f21341b).put("bytes_truncated", this.f21342c).put("trimmed_fields", C3762ym.m17305g(map)).putOpt("environment", this.f21349j)).toString();
    }

    @Deprecated
    /* renamed from: a */
    private EnumC2458c m14220a(JSONObject jSONObject) throws JSONException {
        return jSONObject.has("reporter_type") ? EnumC2458c.m13801a(jSONObject.getString("reporter_type")) : jSONObject.getBoolean("is_commutation") ? EnumC2458c.COMMUTATION : EnumC2458c.MAIN;
    }

    public C2649H7(C3376k0 c3376k0, C2944T3 c2944t3, HashMap<C2915S.a, Integer> map) {
        this.f21340a = c3376k0.m16247q();
        this.f21341b = c3376k0.m16237g();
        this.f21342c = c3376k0.m16234d();
        if (map != null) {
            this.f21343d = map;
        } else {
            this.f21343d = new HashMap<>();
        }
        C2969U3 c2969u3M15167a = c2944t3.m15167a();
        this.f21344e = c2969u3M15167a.m15264f();
        this.f21345f = c2969u3M15167a.m15265g();
        this.f21346g = c2969u3M15167a.m15266h();
        CounterConfiguration counterConfigurationM15168b = c2944t3.m15168b();
        this.f21347h = counterConfigurationM15168b.m13768a();
        this.f21348i = EnumC2458c.m13801a(counterConfigurationM15168b.f20731a.getAsString("CFG_REPORTER_TYPE"));
        this.f21349j = c3376k0.m16238h();
    }
}
