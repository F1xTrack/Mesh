package com.yandex.metrica.impl.ob;

import defpackage.C0082Au1;
import defpackage.C2404br1;
import defpackage.O90;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2938n {
    public static final C2938n a = new C2938n();

    private C2938n() {
    }

    public static void a(C2938n c2938n, Map map, Map map2, String str, InterfaceC3062s interfaceC3062s, C0082Au1 c0082Au1, int i) {
        C0082Au1 c0082Au12 = (i & 16) != 0 ? new C0082Au1() : null;
        O90.f(map, "history");
        O90.f(map2, "newBillingInfo");
        O90.f(str, "type");
        O90.f(interfaceC3062s, "billingInfoManager");
        O90.f(c0082Au12, "systemTimeProvider");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C2404br1 c2404br1 : map.values()) {
            if (map2.containsKey(c2404br1.b)) {
                c2404br1.e = jCurrentTimeMillis;
            } else {
                C2404br1 c2404br1A = interfaceC3062s.a(c2404br1.b);
                if (c2404br1A != null) {
                    c2404br1.e = c2404br1A.e;
                }
            }
        }
        interfaceC3062s.a((Map<String, C2404br1>) map);
        if (interfaceC3062s.a() || !"inapp".equals(str)) {
            return;
        }
        interfaceC3062s.b();
    }
}
