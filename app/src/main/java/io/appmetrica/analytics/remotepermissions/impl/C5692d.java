package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.d */
/* loaded from: classes2.dex */
public final class C5692d implements JsonParser {

    /* renamed from: a */
    public final String f33186a = "permissions";

    /* renamed from: b */
    public final String f33187b = "name";

    /* renamed from: c */
    public final String f33188c = "list";

    /* renamed from: d */
    public final String f33189d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5689a parse(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f33186a);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f33188c)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean(this.f33189d)) {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f33187b);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
            }
        }
        return new C5689a(hashSet);
    }

    /* renamed from: b */
    public final C5689a m21304b(JSONObject jSONObject) {
        return (C5689a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (C5689a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
