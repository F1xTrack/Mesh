package io.appmetrica.analytics.impl;

import defpackage.AbstractC7287tn0;
import defpackage.MN;
import defpackage.NN;
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

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4974x6 {
    public final Uk a = new Uk();
    public Map b;
    public Map c;
    public IdentifiersResult d;

    public C4974x6() {
        NN nn = NN.a;
        this.b = nn;
        this.c = nn;
    }

    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map linkedHashMap;
        RandomAccess randomAccessA;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.d;
            String str2 = identifiersResult2 != null ? identifiersResult2.id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.id) != null && str.length() != 0)) {
                this.d = identifiersResult;
                String str3 = identifiersResult.id;
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
                                ArrayList arrayListA = AbstractC4450bb.a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListA != null) {
                                    map.put(next, arrayListA);
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
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        linkedHashMap.put(key, new IdentifiersResult(String.valueOf(hn.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    linkedHashMap = NN.a;
                }
                this.c = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).id;
                    if (str4 == null) {
                        randomAccessA = null;
                    } else {
                        try {
                            randomAccessA = AbstractC4450bb.a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (randomAccessA == null) {
                        randomAccessA = MN.a;
                    }
                    linkedHashMap2.put(key2, randomAccessA);
                }
                this.b = linkedHashMap2;
            }
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Uk uk = this.a;
            String strA = AbstractC4450bb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", uk.a(new IdentifiersResult(strA, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
