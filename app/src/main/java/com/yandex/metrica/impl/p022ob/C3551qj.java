package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C2510Bi;
import com.yandex.metrica.impl.p022ob.C3762ym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.qj */
/* loaded from: classes2.dex */
public class C3551qj {

    /* renamed from: a */
    private static final Map<String, C2510Bi.a> f24557a = Collections.unmodifiableMap(new a());

    /* renamed from: com.yandex.metrica.impl.ob.qj$a */
    public class a extends HashMap<String, C2510Bi.a> {
        public a() {
            put("wifi", C2510Bi.a.WIFI);
            put("cell", C2510Bi.a.CELL);
        }
    }

    /* renamed from: a */
    public void m16632a(C3681vj c3681vj, C3762ym.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("requests");
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("list") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                arrayList.add(m16631a(jSONArrayOptJSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c3681vj.m17074g(arrayList);
    }

    /* renamed from: a */
    private C2510Bi m16631a(JSONObject jSONObject) throws JSONException {
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
        String strM17300e = C3762ym.m17300e(jSONObject, NotificationConstants.f19487ID);
        String strM17300e2 = C3762ym.m17300e(jSONObject, "url");
        String strM17300e3 = C3762ym.m17300e(jSONObject, "method");
        Long lValueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i < jSONArray2.length()) {
                arrayList2.add(f24557a.get(jSONArray2.getString(i)));
                i++;
            }
        }
        return new C2510Bi(strM17300e, strM17300e2, strM17300e3, arrayList, lValueOf, arrayList2);
    }
}
