package p000;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yw */
/* loaded from: classes.dex */
public final class C7232yw {

    /* renamed from: h */
    public static final Date f46541h = new Date(0);

    /* renamed from: a */
    public final JSONObject f46542a;

    /* renamed from: b */
    public final JSONObject f46543b;

    /* renamed from: c */
    public final Date f46544c;

    /* renamed from: d */
    public final JSONArray f46545d;

    /* renamed from: e */
    public final JSONObject f46546e;

    /* renamed from: f */
    public final long f46547f;

    /* renamed from: g */
    public final JSONArray f46548g;

    public C7232yw(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f46543b = jSONObject;
        this.f46544c = date;
        this.f46545d = jSONArray;
        this.f46546e = jSONObject2;
        this.f46547f = j;
        this.f46548g = jSONArray2;
        this.f46542a = jSONObject3;
    }

    /* renamed from: a */
    public static C7232yw m26285a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new C7232yw(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    /* renamed from: c */
    public static C7442Cm0 m26286c() {
        C7442Cm0 c7442Cm0 = new C7442Cm0();
        c7442Cm0.f1649b = new JSONObject();
        c7442Cm0.f1650c = f46541h;
        c7442Cm0.f1651d = new JSONArray();
        c7442Cm0.f1652e = new JSONObject();
        c7442Cm0.f1648a = 0L;
        c7442Cm0.f1653f = new JSONArray();
        return c7442Cm0;
    }

    /* renamed from: b */
    public final HashMap m26287b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f46548g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7232yw) {
            return this.f46542a.toString().equals(((C7232yw) obj).f46542a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f46542a.hashCode();
    }

    public final String toString() {
        return this.f46542a.toString();
    }
}
