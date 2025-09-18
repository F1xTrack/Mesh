package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.jo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ao<T, R> implements fo<T, R> {
    private final Map<T, go<R>> a;

    public ao(Map<T, go<R>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    @Override // com.yandex.metrica.impl.ob.go
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public jo<Map<T, R>> get(Map<T, R> map) {
        jo.a.values();
        int[] iArr = new int[3];
        HashMap map2 = new HashMap();
        for (Map.Entry<T, R> entry : map.entrySet()) {
            go<R> goVar = this.a.get(entry.getKey());
            if (goVar != null) {
                jo<R> joVar = goVar.get(entry.getValue());
                int iOrdinal = joVar.a.ordinal();
                iArr[iOrdinal] = iArr[iOrdinal] + 1;
                map2.put(entry.getKey(), joVar.b);
            }
        }
        jo.a aVar = jo.a.NEW;
        if (iArr[0] > 0) {
            return new jo<>(aVar, map2);
        }
        return iArr[2] > 0 ? new jo<>(jo.a.REFRESH, map2) : new jo<>(jo.a.NOT_CHANGED, map2);
    }
}
