package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.eb */
/* loaded from: classes2.dex */
public final class C5095eb {

    /* renamed from: a */
    public final byte[] f31576a;

    /* renamed from: b */
    public final String f31577b;

    /* renamed from: c */
    public final int f31578c;

    /* renamed from: d */
    public final HashMap f31579d;

    /* renamed from: e */
    public final String f31580e;

    /* renamed from: f */
    public final Integer f31581f;

    /* renamed from: g */
    public final String f31582g;

    /* renamed from: h */
    public final String f31583h;

    /* renamed from: i */
    public final CounterConfigurationReporterType f31584i;

    /* renamed from: j */
    public final String f31585j;

    public C5095eb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f31576a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f31577b = jSONObject2.getString("name");
        this.f31578c = jSONObject2.getInt("bytes_truncated");
        this.f31585j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f31579d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapM20176c = AbstractC5020bb.m20176c(strOptString);
                if (mapM20176c != null) {
                    for (Map.Entry entry : mapM20176c.entrySet()) {
                        this.f31579d.put(EnumC4988a4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f31580e = jSONObject3.getString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME);
        this.f31581f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f31582g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f31583h = jSONObject4.getString("api_key");
        this.f31584i = m20334a(jSONObject4);
    }

    /* renamed from: a */
    public final String m20335a() {
        return this.f31583h;
    }

    /* renamed from: b */
    public final int m20336b() {
        return this.f31578c;
    }

    /* renamed from: c */
    public final byte[] m20337c() {
        return this.f31576a;
    }

    /* renamed from: d */
    public final String m20338d() {
        return this.f31585j;
    }

    /* renamed from: e */
    public final String m20339e() {
        return this.f31577b;
    }

    /* renamed from: f */
    public final String m20340f() {
        return this.f31580e;
    }

    /* renamed from: g */
    public final Integer m20341g() {
        return this.f31581f;
    }

    /* renamed from: h */
    public final String m20342h() {
        return this.f31582g;
    }

    /* renamed from: i */
    public final CounterConfigurationReporterType m20343i() {
        return this.f31584i;
    }

    /* renamed from: j */
    public final HashMap<EnumC4988a4, Integer> m20344j() {
        return this.f31579d;
    }

    /* renamed from: k */
    public final String m20345k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f31579d.entrySet()) {
            map.put(((EnumC4988a4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f31581f).put("psid", this.f31582g).put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, this.f31580e)).put("reporter_configuration", new JSONObject().put("api_key", this.f31583h).put("reporter_type", this.f31584i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f31576a, 0)).put("name", this.f31577b).put("bytes_truncated", this.f31578c).put("trimmed_fields", AbstractC5020bb.m20174b(map)).putOpt("environment", this.f31585j)).toString();
    }

    /* renamed from: a */
    public static CounterConfigurationReporterType m20334a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C5095eb(C4821T5 c4821t5, C4939Y3 c4939y3, HashMap<EnumC4988a4, Integer> map) {
        this.f31576a = c4821t5.getValueBytes();
        this.f31577b = c4821t5.getName();
        this.f31578c = c4821t5.getBytesTruncated();
        if (map != null) {
            this.f31579d = map;
        } else {
            this.f31579d = new HashMap();
        }
        C4782Re c4782ReM20019a = c4939y3.m20019a();
        this.f31580e = c4782ReM20019a.m19771f();
        this.f31581f = c4782ReM20019a.m19772g();
        this.f31582g = c4782ReM20019a.m19773h();
        CounterConfiguration counterConfigurationM20020b = c4939y3.m20020b();
        this.f31583h = counterConfigurationM20020b.getApiKey();
        this.f31584i = counterConfigurationM20020b.getReporterType();
        this.f31585j = c4821t5.m19861f();
    }
}
