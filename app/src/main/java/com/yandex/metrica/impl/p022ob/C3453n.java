package com.yandex.metrica.impl.p022ob;

import java.util.Map;
import p000.C7355Au1;
import p000.C8905br1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.n */
/* loaded from: classes2.dex */
public final class C3453n {

    /* renamed from: a */
    public static final C3453n f24271a = new C3453n();

    private C3453n() {
    }

    /* renamed from: a */
    public static void m16437a(C3453n c3453n, Map map, Map map2, String str, InterfaceC3583s interfaceC3583s, C7355Au1 c7355Au1, int i) {
        C7355Au1 c7355Au12 = (i & 16) != 0 ? new C7355Au1() : null;
        O90.m5968f(map, "history");
        O90.m5968f(map2, "newBillingInfo");
        O90.m5968f(str, "type");
        O90.m5968f(interfaceC3583s, "billingInfoManager");
        O90.m5968f(c7355Au12, "systemTimeProvider");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C8905br1 c8905br1 : map.values()) {
            if (map2.containsKey(c8905br1.f17191b)) {
                c8905br1.f17194e = jCurrentTimeMillis;
            } else {
                C8905br1 c8905br1Mo16101a = interfaceC3583s.mo16101a(c8905br1.f17191b);
                if (c8905br1Mo16101a != null) {
                    c8905br1.f17194e = c8905br1Mo16101a.f17194e;
                }
            }
        }
        interfaceC3583s.mo16102a((Map<String, C8905br1>) map);
        if (interfaceC3583s.mo16103a() || !"inapp".equals(str)) {
            return;
        }
        interfaceC3583s.mo16104b();
    }
}
