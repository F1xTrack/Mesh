package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3374jo;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bo */
/* loaded from: classes2.dex */
public class C3166bo<T, R> implements InterfaceC3270fo<T, R> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3270fo
    /* renamed from: a */
    public C3374jo<Map<T, R>> mo15625a(Map<T, R> map) {
        return new C3374jo<>(C3374jo.a.NEW, map);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3296go
    public C3374jo get(Object obj) {
        return new C3374jo(C3374jo.a.NEW, (Map) obj);
    }
}
