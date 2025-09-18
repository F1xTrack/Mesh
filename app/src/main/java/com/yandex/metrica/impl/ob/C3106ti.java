package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7287tn0;
import defpackage.MN;
import defpackage.NN;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ti, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3106ti {
    private Map<String, ? extends List<String>> a;
    private Map<String, ? extends C2766g1> b;
    private C2766g1 c;

    public C3106ti() {
        NN nn = NN.a;
        this.a = nn;
        this.b = nn;
    }

    public final C2766g1 a() {
        return this.c;
    }

    public final Map<String, C2766g1> b() {
        return this.b;
    }

    public final synchronized void a(C2766g1 c2766g1) {
        HashMap map;
        Map linkedHashMap;
        List<String> listB;
        String str;
        try {
            C2766g1 c2766g12 = this.c;
            String str2 = c2766g12 != null ? c2766g12.a : null;
            if (str2 == null || str2.length() == 0 || ((str = c2766g1.a) != null && str.length() != 0)) {
                this.c = c2766g1;
                String str3 = c2766g1.a;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                List<String> listB2 = C3240ym.b(new JSONArray(jSONObject.optString(next)));
                                if (listB2 != null) {
                                    map.put(next, listB2);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new C2766g1(String.valueOf(C3240ym.b((List<?>) entry.getValue())), c2766g1.b, c2766g1.c));
                    }
                } else {
                    linkedHashMap = NN.a;
                }
                this.b = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    String str4 = ((C2766g1) entry2.getValue()).a;
                    if (str4 == null) {
                        listB = null;
                    } else {
                        try {
                            listB = C3240ym.b(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (listB == null) {
                        listB = MN.a;
                    }
                    linkedHashMap2.put(key, listB);
                }
                this.a = linkedHashMap2;
            }
        } finally {
        }
    }

    public final synchronized void a(List<String> list, Map<String, C2766g1> map) {
        EnumC2716e1 enumC2716e1;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : list) {
                List<String> list2 = this.a.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            String strB = C3240ym.b(linkedHashMap);
            C2766g1 c2766g1 = this.c;
            if (c2766g1 == null || (enumC2716e1 = c2766g1.b) == null) {
                enumC2716e1 = EnumC2716e1.UNKNOWN;
            }
            map.put("yandex_mobile_metrica_custom_sdk_hosts", new C2766g1(strB, enumC2716e1, c2766g1 != null ? c2766g1.c : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
