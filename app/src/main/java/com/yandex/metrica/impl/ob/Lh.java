package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.yandex.metrica.impl.ob.C2642b2;
import com.yandex.metrica.impl.ob.C2905lg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Lh {
    private static final Map<C2905lg.e.b.a, String> a = Collections.unmodifiableMap(new a());
    private static final Map<C2642b2.d, String> b = Collections.unmodifiableMap(new b());

    public class a extends HashMap<C2905lg.e.b.a, String> {
        public a() {
            put(C2905lg.e.b.a.COMPLETE, "complete");
            put(C2905lg.e.b.a.ERROR, "error");
            put(C2905lg.e.b.a.OFFLINE, "offline");
            put(C2905lg.e.b.a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    public class b extends HashMap<C2642b2.d, String> {
        public b() {
            put(C2642b2.d.WIFI, "wifi");
            put(C2642b2.d.CELL, "cell");
            put(C2642b2.d.OFFLINE, "offline");
            put(C2642b2.d.UNDEFINED, StringUtils.UNDEFINED);
        }
    }

    public String a(C2905lg.e.b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NotificationConstants.ID, bVar.d().a);
            jSONObject.putOpt("url", bVar.d().b);
            jSONObject.putOpt("status", a.get(bVar.h()));
            jSONObject.putOpt("code", bVar.f());
            if (!U2.a(bVar.e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.e(), 0));
            } else if (!U2.a(bVar.b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.b(), 0));
            }
            jSONObject.putOpt("headers", a(bVar.g()));
            Throwable thC = bVar.c();
            if (thC != null) {
                str = thC.toString() + "\n" + Log.getStackTraceString(thC);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", b.get(bVar.a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    private JSONObject a(Map<String, List<String>> map) throws JSONException {
        if (U2.b(map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!U2.b(entry.getValue())) {
                List<String> value = entry.getValue();
                if (value.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i = 0; i < 10; i++) {
                        arrayList.add(value.get(i));
                    }
                    value = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : value) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(U2.a(str, 100));
                    }
                }
                jSONObject.putOpt(key, TextUtils.join(StringUtils.COMMA, arrayList2));
            }
        }
        return jSONObject;
    }
}
