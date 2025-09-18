package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC11205tn0;
import p000.C0779MN;
import p000.C0842NN;

/* renamed from: com.yandex.metrica.impl.ob.ti */
/* loaded from: classes2.dex */
public final class C3628ti {

    /* renamed from: a */
    private Map<String, ? extends List<String>> f24855a;

    /* renamed from: b */
    private Map<String, ? extends C3273g1> f24856b;

    /* renamed from: c */
    private C3273g1 f24857c;

    public C3628ti() {
        C0842NN c0842nn = C0842NN.f7735a;
        this.f24855a = c0842nn;
        this.f24856b = c0842nn;
    }

    /* renamed from: a */
    public final C3273g1 m16867a() {
        return this.f24857c;
    }

    /* renamed from: b */
    public final Map<String, C3273g1> m16870b() {
        return this.f24856b;
    }

    /* renamed from: a */
    public final synchronized void m16868a(C3273g1 c3273g1) {
        HashMap map;
        Map linkedHashMap;
        List<String> listM17288b;
        String str;
        try {
            C3273g1 c3273g12 = this.f24857c;
            String str2 = c3273g12 != null ? c3273g12.f23462a : null;
            if (str2 == null || str2.length() == 0 || ((str = c3273g1.f23462a) != null && str.length() != 0)) {
                this.f24857c = c3273g1;
                String str3 = c3273g1.f23462a;
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
                                List<String> listM17288b2 = C3762ym.m17288b(new JSONArray(jSONObject.optString(next)));
                                if (listM17288b2 != null) {
                                    map.put(next, listM17288b2);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new C3273g1(String.valueOf(C3762ym.m17290b((List<?>) entry.getValue())), c3273g1.f23463b, c3273g1.f23464c));
                    }
                } else {
                    linkedHashMap = C0842NN.f7735a;
                }
                this.f24856b = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    String str4 = ((C3273g1) entry2.getValue()).f23462a;
                    if (str4 == null) {
                        listM17288b = null;
                    } else {
                        try {
                            listM17288b = C3762ym.m17288b(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (listM17288b == null) {
                        listM17288b = C0779MN.f7117a;
                    }
                    linkedHashMap2.put(key, listM17288b);
                }
                this.f24855a = linkedHashMap2;
            }
        } finally {
        }
    }

    /* renamed from: a */
    public final synchronized void m16869a(List<String> list, Map<String, C3273g1> map) {
        EnumC3221e1 enumC3221e1;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : list) {
                List<String> list2 = this.f24855a.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            String strM17286b = C3762ym.m17286b(linkedHashMap);
            C3273g1 c3273g1 = this.f24857c;
            if (c3273g1 == null || (enumC3221e1 = c3273g1.f23463b) == null) {
                enumC3221e1 = EnumC3221e1.UNKNOWN;
            }
            map.put("yandex_mobile_metrica_custom_sdk_hosts", new C3273g1(strM17286b, enumC3221e1, c3273g1 != null ? c3273g1.f23464c : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
