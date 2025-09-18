package com.yandex.metrica.impl.p022ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.Xb */
/* loaded from: classes2.dex */
public class C3052Xb implements InterfaceC2952Tb, InterfaceC2977Ub {

    /* renamed from: a */
    private final C3614t4 f22784a;

    /* renamed from: b */
    private AtomicLong f22785b;

    public C3052Xb(C3618t8 c3618t8, C3614t4 c3614t4) {
        this.f22784a = c3614t4;
        this.f22785b = new AtomicLong(c3618t8.m16841c());
        c3618t8.m16835a(this);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2952Tb
    /* renamed from: a */
    public boolean mo15114a() {
        return this.f22785b.get() >= ((long) ((C3367jh) this.f22784a.m15942b()).m16136J());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2977Ub
    /* renamed from: b */
    public void mo15115b(List<Integer> list) {
        this.f22785b.addAndGet(-list.size());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2977Ub
    /* renamed from: a */
    public void mo15113a(List<Integer> list) {
        this.f22785b.addAndGet(list.size());
    }
}
