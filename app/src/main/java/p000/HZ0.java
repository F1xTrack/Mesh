package p000;

import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HZ0 {

    /* renamed from: a */
    public SharedPreferences f4351a;

    /* renamed from: a */
    public final JSONArray m3499a() {
        SharedPreferences sharedPreferences = this.f4351a;
        String string = sharedPreferences.getString("CODE_PUSH_FAILED_UPDATES", null);
        if (string == null) {
            return new JSONArray();
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            JSONArray jSONArray = new JSONArray();
            sharedPreferences.edit().putString("CODE_PUSH_FAILED_UPDATES", jSONArray.toString()).commit();
            return jSONArray;
        }
    }

    /* renamed from: b */
    public final boolean m3500b(String str) {
        JSONArray jSONArrayM3499a = m3499a();
        if (str != null) {
            for (int i = 0; i < jSONArrayM3499a.length(); i++) {
                try {
                    if (str.equals(jSONArrayM3499a.getJSONObject(i).getString("packageHash"))) {
                        return true;
                    }
                } catch (JSONException e) {
                    throw new C3894cu("Unable to read failedUpdates data stored in SharedPreferences.", e);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m3501c(String str) {
        JSONObject jSONObject = null;
        String string = this.f4351a.getString("CODE_PUSH_PENDING_UPDATE", null);
        if (string != null) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            try {
                if (!jSONObject.getBoolean("isLoading")) {
                    if (str != null) {
                        if (jSONObject.getString("hash").equals(str)) {
                        }
                    }
                    return true;
                }
            } catch (JSONException e) {
                throw new C3894cu("Unable to read pending update metadata in isPendingUpdate.", e);
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m3502d(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            if (m3500b(jSONObject.getString("packageHash"))) {
                return;
            }
            SharedPreferences sharedPreferences = this.f4351a;
            String string = sharedPreferences.getString("CODE_PUSH_FAILED_UPDATES", null);
            if (string == null) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONArray(string);
                } catch (JSONException e) {
                    throw new C1188St(AbstractC7222ym.m26234k("Unable to parse failed updates information ", string, " stored in SharedPreferences"), e);
                }
            }
            jSONArray.put(jSONObject);
            sharedPreferences.edit().putString("CODE_PUSH_FAILED_UPDATES", jSONArray.toString()).commit();
        } catch (JSONException e2) {
            throw new C3894cu("Unable to read package hash from package.", e2);
        }
    }

    /* renamed from: e */
    public final void m3503e(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hash", str);
            jSONObject.put("isLoading", z);
            this.f4351a.edit().putString("CODE_PUSH_PENDING_UPDATE", jSONObject.toString()).commit();
        } catch (JSONException e) {
            throw new C3894cu("Unable to save pending update.", e);
        }
    }

    /* renamed from: f */
    public final void m3504f(String str) {
        JSONObject jSONObject = null;
        String string = this.f4351a.getString("LATEST_ROLLBACK_INFO", null);
        if (string != null) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        int i = 0;
        if (jSONObject != null) {
            try {
                if (jSONObject.getString("packageHash").equals(str)) {
                    i = jSONObject.getInt("count");
                }
            } catch (JSONException unused2) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("packageHash", str);
            jSONObject.put(CrashHianalyticsData.TIME, System.currentTimeMillis());
            jSONObject.put("count", i + 1);
            this.f4351a.edit().putString("LATEST_ROLLBACK_INFO", jSONObject.toString()).commit();
        } catch (JSONException e) {
            throw new C3894cu("Unable to save latest rollback info.", e);
        }
    }
}
