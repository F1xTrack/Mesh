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

/* renamed from: com.yandex.varioqub.config.impl.c */
/* loaded from: classes2.dex */
public final class C3863c {

    /* renamed from: a */
    public final C3869i f25598a;

    /* renamed from: b */
    public final long f25599b;

    /* renamed from: c */
    public final C3880t f25600c;

    /* renamed from: d */
    public final C3861a f25601d;

    /* renamed from: e */
    public final C3881u f25602e;

    /* renamed from: f */
    public long f25603f;

    /* renamed from: g */
    public long f25604g;

    /* renamed from: h */
    public HashMap f25605h = new HashMap();

    /* renamed from: i */
    public String f25606i = "";

    /* renamed from: j */
    public String f25607j = "";

    /* renamed from: k */
    public String f25608k = "";

    /* renamed from: l */
    public final AtomicBoolean f25609l = new AtomicBoolean(false);

    /* renamed from: m */
    public boolean f25610m;

    public C3863c(C3869i c3869i, long j, C3880t c3880t, C3861a c3861a, C3881u c3881u) {
        this.f25598a = c3869i;
        this.f25599b = j;
        this.f25600c = c3880t;
        this.f25601d = c3861a;
        this.f25602e = c3881u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v7, types: [NN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map] */
    /* renamed from: a */
    public final void m17395a() throws JSONException {
        ?? map;
        ConfigValue configValue;
        if (this.f25609l.compareAndSet(false, true)) {
            this.f25603f = AbstractC3873m.m17400a().getLong("last_fetched_time_ms_key", 0L);
            this.f25604g = AbstractC3873m.m17400a().getLong("last_successful_fetched_time_ms_key", 0L);
            String string = AbstractC3873m.m17400a().getString("experiments", "");
            if (string == null) {
                string = "";
            }
            this.f25607j = string;
            String string2 = AbstractC3873m.m17400a().getString("identifier", "");
            if (string2 == null) {
                string2 = "";
            }
            this.f25606i = string2;
            String string3 = AbstractC3873m.m17400a().getString("fetched_config_key", "");
            if (string3 == null || string3.length() == 0) {
                map = C0842NN.f7735a;
            } else {
                JSONObject jSONObject = new JSONObject(string3);
                map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string4 = jSONObject.getString(next);
                    if (string4 == null || string4.length() == 0) {
                        configValue = null;
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string4);
                        configValue = new ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    map.put(next, configValue);
                }
            }
            this.f25605h = new HashMap((Map) map);
            Context context = AbstractC3864d.f25611a;
            if (context == null) {
                O90.m5977o("appContext");
                throw null;
            }
            this.f25610m = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getBoolean("should_notify_adapter", false);
        }
    }
}
