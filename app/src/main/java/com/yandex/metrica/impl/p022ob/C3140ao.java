package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3374jo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ao */
/* loaded from: classes2.dex */
public class C3140ao<T, R> implements InterfaceC3270fo<T, R> {

    /* renamed from: a */
    private final Map<T, InterfaceC3296go<R>> f23074a;

    public C3140ao(Map<T, InterfaceC3296go<R>> map) {
        this.f23074a = Collections.unmodifiableMap(map);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3296go
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3374jo<Map<T, R>> get(Map<T, R> map) {
        C3374jo.a.values();
        int[] iArr = new int[3];
        HashMap map2 = new HashMap();
        for (Map.Entry<T, R> entry : map.entrySet()) {
            InterfaceC3296go<R> interfaceC3296go = this.f23074a.get(entry.getKey());
            if (interfaceC3296go != null) {
                C3374jo<R> c3374jo = interfaceC3296go.get(entry.getValue());
                int iOrdinal = c3374jo.f23820a.ordinal();
                iArr[iOrdinal] = iArr[iOrdinal] + 1;
                map2.put(entry.getKey(), c3374jo.f23821b);
            }
        }
        C3374jo.a aVar = C3374jo.a.NEW;
        if (iArr[0] > 0) {
            return new C3374jo<>(aVar, map2);
        }
        return iArr[2] > 0 ? new C3374jo<>(C3374jo.a.REFRESH, map2) : new C3374jo<>(C3374jo.a.NOT_CHANGED, map2);
    }
}
