package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PLSharedPreferences {
    private static final String MOVE_TO_DE_RECORDS = "grs_move2DE_records";
    private static final String TAG = "PLSharedPreferences";

    /* renamed from: sp */
    private final SharedPreferences f18990sp;

    public PLSharedPreferences(Context context, String str) {
        this.f18990sp = getSharedPreferences(context, str);
    }

    private SharedPreferences getSharedPreferences(Context context, String str) {
        if (context == null) {
            Logger.m11682e(TAG, "context is null, must call init method to set context");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(MOVE_TO_DE_RECORDS, 0);
            if (sharedPreferences.getBoolean(str, false)) {
                context = contextCreateDeviceProtectedStorageContext;
            } else if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(str, true);
                editorEdit.apply();
                context = contextCreateDeviceProtectedStorageContext;
            }
        }
        return context.getSharedPreferences(str, 0);
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        StringBuilder sb = new StringBuilder("sp size ");
        sb.append(all == null ? 0 : all.size());
        Logger.m11685i(TAG, sb.toString());
        return all;
    }

    public Map<String, String> getHashMap(String str) throws JSONException {
        HashMap map = new HashMap();
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return map;
        }
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(str, ""));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray jSONArrayNames = jSONObject.names();
                if (jSONArrayNames != null) {
                    for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                        String string = jSONArrayNames.getString(i2);
                        map.put(string, jSONObject.getString(string));
                    }
                }
            }
        } catch (JSONException e) {
            Logger.m11691w(TAG, "getHashMap parse Json to map error: %s", StringUtils.anonymizeMessage(e.getMessage()));
        }
        return map;
    }

    public long getLong(String str, long j) {
        SharedPreferences sharedPreferences = this.f18990sp;
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public void putHashMap(String str, Map<String, String> map) throws JSONException {
        if (this.f18990sp == null || map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                Logger.m11691w(TAG, "putHashMap one object error: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
        jSONArray.put(jSONObject);
        this.f18990sp.edit().putString(str, jSONArray.toString()).apply();
    }

    public void putLong(String str, long j) {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j).apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public void remove(String str) {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public void removeKeyValue(String str) {
        SharedPreferences sharedPreferences = this.f18990sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f18990sp;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }
}
