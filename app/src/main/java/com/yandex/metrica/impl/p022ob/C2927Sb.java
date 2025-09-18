package com.yandex.metrica.impl.p022ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.Sb */
/* loaded from: classes2.dex */
public class C2927Sb implements InterfaceC2952Tb, InterfaceC2977Ub {

    /* renamed from: a */
    private final Set<Integer> f22298a;

    /* renamed from: b */
    private AtomicLong f22299b;

    public C2927Sb(C3618t8 c3618t8) {
        HashSet hashSet = new HashSet();
        this.f22298a = hashSet;
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_FIRST_ACTIVATION.m16250b()));
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_APP_UPDATE.m16250b()));
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_INIT.m16250b()));
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_IDENTITY.m16250b()));
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_SEND_REFERRER.m16250b()));
        c3618t8.m16835a(this);
        this.f22299b = new AtomicLong(c3618t8.m16829a(hashSet));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2952Tb
    /* renamed from: a */
    public boolean mo15114a() {
        return this.f22299b.get() > 0;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2977Ub
    /* renamed from: b */
    public void mo15115b(List<Integer> list) {
        int i = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.f22298a.contains(num)) {
                i++;
            }
        }
        this.f22299b.addAndGet(-i);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2977Ub
    /* renamed from: a */
    public void mo15113a(List<Integer> list) {
        int i = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.f22298a.contains(num)) {
                i++;
            }
        }
        this.f22299b.addAndGet(i);
    }
}
