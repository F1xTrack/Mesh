package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4906ua {
    public static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return AbstractC4450bb.a(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
