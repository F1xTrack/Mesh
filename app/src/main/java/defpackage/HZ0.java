package defpackage;

import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HZ0 {
    public SharedPreferences a;

    public final JSONArray a() {
        SharedPreferences sharedPreferences = this.a;
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

    public final boolean b(String str) {
        JSONArray jSONArrayA = a();
        if (str != null) {
            for (int i = 0; i < jSONArrayA.length(); i++) {
                try {
                    if (str.equals(jSONArrayA.getJSONObject(i).getString("packageHash"))) {
                        return true;
                    }
                } catch (JSONException e) {
                    throw new C3286cu("Unable to read failedUpdates data stored in SharedPreferences.", e);
                }
            }
        }
        return false;
    }

    public final boolean c(String str) {
        JSONObject jSONObject = null;
        String string = this.a.getString("CODE_PUSH_PENDING_UPDATE", null);
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
                throw new C3286cu("Unable to read pending update metadata in isPendingUpdate.", e);
            }
        }
        return false;
    }

    public final void d(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            if (b(jSONObject.getString("packageHash"))) {
                return;
            }
            SharedPreferences sharedPreferences = this.a;
            String string = sharedPreferences.getString("CODE_PUSH_FAILED_UPDATES", null);
            if (string == null) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONArray(string);
                } catch (JSONException e) {
                    throw new C1480St(AbstractC8235ym.k("Unable to parse failed updates information ", string, " stored in SharedPreferences"), e);
                }
            }
            jSONArray.put(jSONObject);
            sharedPreferences.edit().putString("CODE_PUSH_FAILED_UPDATES", jSONArray.toString()).commit();
        } catch (JSONException e2) {
            throw new C3286cu("Unable to read package hash from package.", e2);
        }
    }

    public final void e(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hash", str);
            jSONObject.put("isLoading", z);
            this.a.edit().putString("CODE_PUSH_PENDING_UPDATE", jSONObject.toString()).commit();
        } catch (JSONException e) {
            throw new C3286cu("Unable to save pending update.", e);
        }
    }

    public final void f(String str) {
        JSONObject jSONObject = null;
        String string = this.a.getString("LATEST_ROLLBACK_INFO", null);
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
            this.a.edit().putString("LATEST_ROLLBACK_INFO", jSONObject.toString()).commit();
        } catch (JSONException e) {
            throw new C3286cu("Unable to save latest rollback info.", e);
        }
    }
}
