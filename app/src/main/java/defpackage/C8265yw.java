package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8265yw {
    public static final Date h = new Date(0);
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;
    public final JSONArray g;

    public C8265yw(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }

    public static C8265yw a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new C8265yw(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static C0213Cm0 c() {
        C0213Cm0 c0213Cm0 = new C0213Cm0();
        c0213Cm0.b = new JSONObject();
        c0213Cm0.c = h;
        c0213Cm0.d = new JSONArray();
        c0213Cm0.e = new JSONObject();
        c0213Cm0.a = 0L;
        c0213Cm0.f = new JSONArray();
        return c0213Cm0;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.g;
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
        if (obj instanceof C8265yw) {
            return this.a.toString().equals(((C8265yw) obj).a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
