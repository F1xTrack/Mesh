package com.yandex.metrica.impl.ob;

import defpackage.C0082Au1;
import defpackage.C2404br1;
import defpackage.EnumC0625Ht1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2863k implements InterfaceC3137v {
    private final C0082Au1 a;

    public C2863k() {
        this(new C0082Au1());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3137v
    public Map<String, C2404br1> a(C2988p c2988p, Map<String, C2404br1> map, InterfaceC3062s interfaceC3062s) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            C2404br1 c2404br1 = map.get(str);
            this.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c2404br1.a != EnumC0625Ht1.a || interfaceC3062s.a()) {
                C2404br1 c2404br1A = interfaceC3062s.a(c2404br1.b);
                if (c2404br1A != null && c2404br1A.c.equals(c2404br1.c)) {
                    if (c2404br1.a != EnumC0625Ht1.b || jCurrentTimeMillis - c2404br1A.e < TimeUnit.SECONDS.toMillis(c2988p.a)) {
                    }
                }
                map2.put(str, c2404br1);
            } else if (jCurrentTimeMillis - c2404br1.d <= TimeUnit.SECONDS.toMillis(c2988p.b)) {
                map2.put(str, c2404br1);
            }
        }
        return map2;
    }

    public C2863k(C0082Au1 c0082Au1) {
        this.a = c0082Au1;
    }
}
