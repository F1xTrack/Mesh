package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3340ig;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Aa */
/* loaded from: classes2.dex */
public class C2477Aa implements InterfaceC3230ea<C3612t2, C3340ig> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3612t2 mo13846a(C3340ig c3340ig) {
        HashMap map;
        C3340ig c3340ig2 = c3340ig;
        C3340ig.a aVar = c3340ig2.f23649b;
        if (aVar == null) {
            map = null;
        } else {
            HashMap map2 = new HashMap();
            for (C3340ig.a.C7307a c7307a : aVar.f23651b) {
                map2.put(c7307a.f23653b, c7307a.f23654c);
            }
            map = map2;
        }
        return new C3612t2(map, c3340ig2.f23650c);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3340ig mo13847b(C3612t2 c3612t2) {
        C3340ig.a aVar;
        C3612t2 c3612t22 = c3612t2;
        C3340ig c3340ig = new C3340ig();
        Map<String, String> map = c3612t22.f24792a;
        if (map == null) {
            aVar = null;
        } else {
            C3340ig.a aVar2 = new C3340ig.a();
            aVar2.f23651b = new C3340ig.a.C7307a[map.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C3340ig.a.C7307a c7307a = new C3340ig.a.C7307a();
                c7307a.f23653b = entry.getKey();
                c7307a.f23654c = entry.getValue();
                aVar2.f23651b[i] = c7307a;
                i++;
            }
            aVar = aVar2;
        }
        c3340ig.f23649b = aVar;
        c3340ig.f23650c = c3612t22.f24793b;
        return c3340ig;
    }
}
