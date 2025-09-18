package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.huawei.hms.hatool.c1 */
/* loaded from: classes.dex */
public class C2136c1 {
    /* renamed from: a */
    public static Map<String, List<C2133b1>> m11947a(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map<String, ?> mapM11956a = C2137d.m11956a(context, str);
        m11953b(mapM11956a);
        return m11949a(mapM11956a);
    }

    /* renamed from: b */
    public static Map<String, List<C2133b1>> m11952b(Context context, String str, String str2) {
        String strM11955a = C2137d.m11955a(context, str, str2, "");
        HashMap map = new HashMap();
        m11951a(str2, strM11955a, map);
        return map;
    }

    /* renamed from: a */
    public static Map<String, List<C2133b1>> m11948a(Context context, String str, String str2) {
        Map<String, List<C2133b1>> mapM11947a;
        Map<String, List<C2133b1>> mapM11947a2;
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            C2186v.m12271c("hmsSdk", "read all event records");
            mapM11947a = m11947a(context, "stat_v2_1");
            mapM11947a2 = m11947a(context, "cached_v2_1");
        } else {
            String strM12139a = AbstractC2169n1.m12139a(str, str2);
            mapM11947a = m11952b(context, "stat_v2_1", strM12139a);
            mapM11947a2 = m11952b(context, "cached_v2_1", strM12139a);
        }
        return m11950a(mapM11947a, mapM11947a2);
    }

    /* renamed from: b */
    private static void m11953b(Map<String, ?> map) {
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        Set<String> setM12141a = AbstractC2169n1.m12141a(AbstractC2177q0.m12183b());
        while (it.hasNext()) {
            if (!setM12141a.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private static Map<String, List<C2133b1>> m11949a(Map<String, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                m11951a(key, (String) entry.getValue(), map2);
            }
        }
        return map2;
    }

    /* renamed from: a */
    private static Map<String, List<C2133b1>> m11950a(Map<String, List<C2133b1>> map, Map<String, List<C2133b1>> map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        map3.putAll(map2);
        return map3;
    }

    /* renamed from: a */
    private static void m11951a(String str, String str2, Map<String, List<C2133b1>> map) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                C2133b1 c2133b1 = new C2133b1();
                try {
                    c2133b1.m11932a(jSONArray.getJSONObject(i));
                    arrayList.add(c2133b1);
                } catch (JSONException unused) {
                    C2186v.m12275e("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList);
        } catch (JSONException unused2) {
            C2186v.m12275e("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }
}
