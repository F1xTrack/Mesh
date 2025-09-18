package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ua */
/* loaded from: classes2.dex */
public final class C5494ua {

    /* renamed from: a */
    public static final HashSet f32681a;

    static {
        HashSet hashSet = new HashSet();
        f32681a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    /* renamed from: a */
    public static ArrayList m21122a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return AbstractC5020bb.m20172a(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
