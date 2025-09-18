package com.yandex.varioqub.config.impl;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C0842NN;
import p000.O90;

/* renamed from: com.yandex.varioqub.config.impl.t */
/* loaded from: classes2.dex */
public final class C3880t {

    /* renamed from: a */
    public Map f25658a = new HashMap();

    /* renamed from: b */
    public Map f25659b = C0842NN.f7735a;

    /* renamed from: c */
    public final AtomicBoolean f25660c = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [NN] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap] */
    /* renamed from: a */
    public final void m17418a() throws JSONException {
        ?? map;
        ConfigValue configValue;
        if (this.f25660c.compareAndSet(false, true)) {
            Context context = AbstractC3864d.f25611a;
            if (context == null) {
                O90.m5977o("appContext");
                throw null;
            }
            String string = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getString("activated_config_key", "");
            if (string == null || string.length() == 0) {
                map = C0842NN.f7735a;
            } else {
                JSONObject jSONObject = new JSONObject(string);
                map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string2 = jSONObject.getString(next);
                    if (string2 == null || string2.length() == 0) {
                        configValue = null;
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string2);
                        configValue = new ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    map.put(next, configValue);
                }
            }
            this.f25659b = map;
        }
    }
}
