package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2830ig;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class Aa implements InterfaceC2725ea<C3090t2, C2830ig> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C3090t2 a(C2830ig c2830ig) {
        HashMap map;
        C2830ig c2830ig2 = c2830ig;
        C2830ig.a aVar = c2830ig2.b;
        if (aVar == null) {
            map = null;
        } else {
            HashMap map2 = new HashMap();
            for (C2830ig.a.C0013a c0013a : aVar.b) {
                map2.put(c0013a.b, c0013a.c);
            }
            map = map2;
        }
        return new C3090t2(map, c2830ig2.c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2830ig b(C3090t2 c3090t2) {
        C2830ig.a aVar;
        C3090t2 c3090t22 = c3090t2;
        C2830ig c2830ig = new C2830ig();
        Map<String, String> map = c3090t22.a;
        if (map == null) {
            aVar = null;
        } else {
            C2830ig.a aVar2 = new C2830ig.a();
            aVar2.b = new C2830ig.a.C0013a[map.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C2830ig.a.C0013a c0013a = new C2830ig.a.C0013a();
                c0013a.b = entry.getKey();
                c0013a.c = entry.getValue();
                aVar2.b[i] = c0013a;
                i++;
            }
            aVar = aVar2;
        }
        c2830ig.b = aVar;
        c2830ig.c = c3090t22.b;
        return c2830ig;
    }
}
