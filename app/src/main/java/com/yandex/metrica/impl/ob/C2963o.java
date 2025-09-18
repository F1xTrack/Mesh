package com.yandex.metrica.impl.ob;

import defpackage.C0082Au1;
import defpackage.C2404br1;
import defpackage.EnumC0625Ht1;
import defpackage.O90;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2963o implements InterfaceC3137v {
    private final C0082Au1 a;

    public C2963o(C0082Au1 c0082Au1) {
        O90.f(c0082Au1, "systemTimeProvider");
        this.a = c0082Au1;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3137v
    public Map<String, C2404br1> a(C2988p c2988p, Map<String, ? extends C2404br1> map, InterfaceC3062s interfaceC3062s) {
        O90.f(c2988p, "config");
        O90.f(map, "history");
        O90.f(interfaceC3062s, "storage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends C2404br1> entry : map.entrySet()) {
            C2404br1 value = entry.getValue();
            this.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (value.a != EnumC0625Ht1.a || interfaceC3062s.a()) {
                C2404br1 c2404br1A = interfaceC3062s.a(value.b);
                if (c2404br1A != null && O90.a(c2404br1A.c, value.c)) {
                    if (value.a != EnumC0625Ht1.b || jCurrentTimeMillis - c2404br1A.e < TimeUnit.SECONDS.toMillis(c2988p.a)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (jCurrentTimeMillis - value.d <= TimeUnit.SECONDS.toMillis(c2988p.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public C2963o(C0082Au1 c0082Au1, int i) {
        this((i & 1) != 0 ? new C0082Au1() : null);
    }
}
