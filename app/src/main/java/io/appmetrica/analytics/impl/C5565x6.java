package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC11205tn0;
import p000.C0779MN;
import p000.C0842NN;

/* renamed from: io.appmetrica.analytics.impl.x6 */
/* loaded from: classes2.dex */
public final class C5565x6 {

    /* renamed from: a */
    public final C4860Uk f32803a = new C4860Uk();

    /* renamed from: b */
    public Map f32804b;

    /* renamed from: c */
    public Map f32805c;

    /* renamed from: d */
    public IdentifiersResult f32806d;

    public C5565x6() {
        C0842NN c0842nn = C0842NN.f7735a;
        this.f32804b = c0842nn;
        this.f32805c = c0842nn;
    }

    /* renamed from: a */
    public final synchronized void m21198a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map linkedHashMap;
        RandomAccess randomAccessM20172a;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.f32806d;
            String str2 = identifiersResult2 != null ? identifiersResult2.f32948id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.f32948id) != null && str.length() != 0)) {
                this.f32806d = identifiersResult;
                String str3 = identifiersResult.f32948id;
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
                                ArrayList arrayListM20172a = AbstractC5020bb.m20172a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListM20172a != null) {
                                    map.put(next, arrayListM20172a);
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
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        linkedHashMap.put(key, new IdentifiersResult(String.valueOf(AbstractC5182hn.m20513a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    linkedHashMap = C0842NN.f7735a;
                }
                this.f32805c = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).f32948id;
                    if (str4 == null) {
                        randomAccessM20172a = null;
                    } else {
                        try {
                            randomAccessM20172a = AbstractC5020bb.m20172a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (randomAccessM20172a == null) {
                        randomAccessM20172a = C0779MN.f7117a;
                    }
                    linkedHashMap2.put(key2, randomAccessM20172a);
                }
                this.f32804b = linkedHashMap2;
            }
        } finally {
        }
    }

    /* renamed from: a */
    public final synchronized void m21199a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f32804b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            C4860Uk c4860Uk = this.f32803a;
            String strM20171a = AbstractC5020bb.m20171a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f32806d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", c4860Uk.m19894a(new IdentifiersResult(strM20171a, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
