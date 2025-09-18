package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.Bi;
import com.yandex.metrica.impl.ob.C3240ym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3033qj {
    private static final Map<String, Bi.a> a = Collections.unmodifiableMap(new a());

    /* renamed from: com.yandex.metrica.impl.ob.qj$a */
    public class a extends HashMap<String, Bi.a> {
        public a() {
            put("wifi", Bi.a.WIFI);
            put("cell", Bi.a.CELL);
        }
    }

    public void a(C3162vj c3162vj, C3240ym.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("requests");
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("list") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                arrayList.add(a(jSONArrayOptJSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c3162vj.g(arrayList);
    }

    private Bi a(JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> itKeys = jSONObject2.keys();
        while (true) {
            i = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i)));
                i++;
            }
        }
        String strE = C3240ym.e(jSONObject, NotificationConstants.ID);
        String strE2 = C3240ym.e(jSONObject, "url");
        String strE3 = C3240ym.e(jSONObject, "method");
        Long lValueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i < jSONArray2.length()) {
                arrayList2.add(a.get(jSONArray2.getString(i)));
                i++;
            }
        }
        return new Bi(strE, strE2, strE3, arrayList, lValueOf, arrayList2);
    }
}
