package com.yandex.metrica.impl.p022ob;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.C7355Au1;
import p000.C8905br1;
import p000.EnumC7717Ht1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.o */
/* loaded from: classes2.dex */
public final class C3479o implements InterfaceC3661v {

    /* renamed from: a */
    private final C7355Au1 f24331a;

    public C3479o(C7355Au1 c7355Au1) {
        O90.m5968f(c7355Au1, "systemTimeProvider");
        this.f24331a = c7355Au1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3661v
    /* renamed from: a */
    public Map<String, C8905br1> mo16206a(C3505p c3505p, Map<String, ? extends C8905br1> map, InterfaceC3583s interfaceC3583s) {
        O90.m5968f(c3505p, "config");
        O90.m5968f(map, "history");
        O90.m5968f(interfaceC3583s, "storage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends C8905br1> entry : map.entrySet()) {
            C8905br1 value = entry.getValue();
            this.f24331a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (value.f17190a != EnumC7717Ht1.f4566a || interfaceC3583s.mo16103a()) {
                C8905br1 c8905br1Mo16101a = interfaceC3583s.mo16101a(value.f17191b);
                if (c8905br1Mo16101a != null && O90.m5963a(c8905br1Mo16101a.f17192c, value.f17192c)) {
                    if (value.f17190a != EnumC7717Ht1.f4567b || jCurrentTimeMillis - c8905br1Mo16101a.f17194e < TimeUnit.SECONDS.toMillis(c3505p.f24397a)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (jCurrentTimeMillis - value.f17193d <= TimeUnit.SECONDS.toMillis(c3505p.f24398b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public C3479o(C7355Au1 c7355Au1, int i) {
        this((i & 1) != 0 ? new C7355Au1() : null);
    }
}
