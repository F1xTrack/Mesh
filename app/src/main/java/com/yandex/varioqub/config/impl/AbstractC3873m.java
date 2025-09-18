package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C1156SN;
import p000.O90;

/* renamed from: com.yandex.varioqub.config.impl.m */
/* loaded from: classes2.dex */
public abstract class AbstractC3873m {
    /* renamed from: a */
    public static SharedPreferences m17400a() {
        Context context = AbstractC3864d.f25611a;
        if (context == null) {
            O90.m5977o("appContext");
            throw null;
        }
        return context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0);
    }

    /* renamed from: b */
    public static void m17409b(HashMap map) throws JSONException {
        SharedPreferences.Editor editorEdit = m17400a().edit();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ConfigValue configValue = (ConfigValue) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        editorEdit.putString("fetched_config_key", jSONObject.toString()).apply();
    }

    /* renamed from: c */
    public static void m17410c(String str) {
        m17400a().edit().putString("identifier", str).apply();
    }

    /* renamed from: a */
    public static void m17401a(long j) {
        m17400a().edit().putLong("last_fetched_time_ms_key", j).apply();
    }

    /* renamed from: a */
    public static void m17403a(HashMap map) throws JSONException {
        SharedPreferences.Editor editorEdit = m17400a().edit();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ConfigValue configValue = (ConfigValue) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        editorEdit.putString("activated_config_key", jSONObject.toString()).apply();
    }

    /* renamed from: b */
    public static void m17408b(String str) {
        m17400a().edit().putString("etag", str).apply();
    }

    /* renamed from: b */
    public static LinkedHashSet m17406b() {
        Set<String> stringSet = m17400a().getStringSet("varioqub_testids", new LinkedHashSet());
        if (stringSet == null) {
            stringSet = C1156SN.f10705a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = stringSet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public static void m17405a(boolean z) {
        m17400a().edit().putBoolean("should_notify_adapter", z).apply();
    }

    /* renamed from: a */
    public static void m17404a(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(String.valueOf(((Number) it.next()).longValue()));
        }
        m17400a().edit().putStringSet("varioqub_testids", linkedHashSet).apply();
    }

    /* renamed from: b */
    public static void m17407b(long j) {
        m17400a().edit().putLong("last_successful_fetched_time_ms_key", j).apply();
    }

    /* renamed from: a */
    public static void m17402a(String str) {
        m17400a().edit().putString("config_version", str).apply();
    }
}
