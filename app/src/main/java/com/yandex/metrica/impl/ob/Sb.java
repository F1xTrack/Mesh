package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class Sb implements Tb, Ub {
    private final Set<Integer> a;
    private AtomicLong b;

    public Sb(C3096t8 c3096t8) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_FIRST_ACTIVATION.b()));
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_APP_UPDATE.b()));
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_IDENTITY.b()));
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_SEND_REFERRER.b()));
        c3096t8.a(this);
        this.b = new AtomicLong(c3096t8.a(hashSet));
    }

    @Override // com.yandex.metrica.impl.ob.Tb
    public boolean a() {
        return this.b.get() > 0;
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void b(List<Integer> list) {
        int i = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.a.contains(num)) {
                i++;
            }
        }
        this.b.addAndGet(-i);
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void a(List<Integer> list) {
        int i = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.a.contains(num)) {
                i++;
            }
        }
        this.b.addAndGet(i);
    }
}
