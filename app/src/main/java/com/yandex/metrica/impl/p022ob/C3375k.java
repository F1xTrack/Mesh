package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.C7355Au1;
import p000.C8905br1;
import p000.EnumC7717Ht1;

/* renamed from: com.yandex.metrica.impl.ob.k */
/* loaded from: classes2.dex */
public class C3375k implements InterfaceC3661v {

    /* renamed from: a */
    private final C7355Au1 f23826a;

    public C3375k() {
        this(new C7355Au1());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3661v
    /* renamed from: a */
    public Map<String, C8905br1> mo16206a(C3505p c3505p, Map<String, C8905br1> map, InterfaceC3583s interfaceC3583s) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            C8905br1 c8905br1 = map.get(str);
            this.f23826a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c8905br1.f17190a != EnumC7717Ht1.f4566a || interfaceC3583s.mo16103a()) {
                C8905br1 c8905br1Mo16101a = interfaceC3583s.mo16101a(c8905br1.f17191b);
                if (c8905br1Mo16101a != null && c8905br1Mo16101a.f17192c.equals(c8905br1.f17192c)) {
                    if (c8905br1.f17190a != EnumC7717Ht1.f4567b || jCurrentTimeMillis - c8905br1Mo16101a.f17194e < TimeUnit.SECONDS.toMillis(c3505p.f24397a)) {
                    }
                }
                map2.put(str, c8905br1);
            } else if (jCurrentTimeMillis - c8905br1.f17193d <= TimeUnit.SECONDS.toMillis(c3505p.f24398b)) {
                map2.put(str, c8905br1);
            }
        }
        return map2;
    }

    public C3375k(C7355Au1 c7355Au1) {
        this.f23826a = c7355Au1;
    }
}
