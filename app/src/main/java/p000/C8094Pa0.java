package p000;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: Pa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8094Pa0 implements Serializable {

    /* renamed from: b */
    public static final /* synthetic */ int f9148b = 0;

    /* renamed from: a */
    public final LinkedHashMap f9149a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        Collections.unmodifiableSet(hashSet);
    }

    public C8094Pa0(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f9149a = linkedHashMap2;
        linkedHashMap2.putAll(linkedHashMap);
    }

    /* renamed from: a */
    public final List m6384a() throws ParseException {
        List list;
        String[] strArr;
        LinkedHashMap linkedHashMap = this.f9149a;
        if (linkedHashMap.get("aud") == null) {
            list = null;
        } else {
            try {
                list = (List) linkedHashMap.get("aud");
            } catch (ClassCastException unused) {
                throw new ParseException("The aud claim is not a list / JSON array", 0);
            }
        }
        if (list == null) {
            strArr = null;
        } else {
            int size = list.size();
            strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused2) {
                    throw new ParseException("The aud claim is not a list / JSON array of strings", 0);
                }
            }
        }
        if (strArr == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8094Pa0) {
            return Objects.equals(this.f9149a, ((C8094Pa0) obj).f9149a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9149a);
    }

    public final String toString() {
        List listEmptyList;
        C1753aw c1753aw = AbstractC11943za0.f46877a;
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = this.f9149a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() instanceof Date) {
                map.put(entry.getKey(), Long.valueOf(((Date) entry.getValue()).getTime() / 1000));
            } else if ("aud".equals(entry.getKey())) {
                Object obj = linkedHashMap.get("aud");
                if (obj instanceof String) {
                    listEmptyList = Collections.singletonList((String) obj);
                } else {
                    try {
                        listEmptyList = m6384a();
                        if (listEmptyList == null) {
                            listEmptyList = Collections.emptyList();
                        }
                    } catch (ParseException unused) {
                        listEmptyList = Collections.emptyList();
                    }
                }
                if (listEmptyList != null && !listEmptyList.isEmpty()) {
                    if (listEmptyList.size() == 1) {
                        map.put("aud", listEmptyList.get(0));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(listEmptyList);
                        map.put("aud", arrayList);
                    }
                }
            } else if (entry.getValue() != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC11943za0.m26474h(map);
    }
}
