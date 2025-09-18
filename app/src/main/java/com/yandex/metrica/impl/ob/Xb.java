package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class Xb implements Tb, Ub {
    private final C3092t4 a;
    private AtomicLong b;

    public Xb(C3096t8 c3096t8, C3092t4 c3092t4) {
        this.a = c3092t4;
        this.b = new AtomicLong(c3096t8.c());
        c3096t8.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.Tb
    public boolean a() {
        return this.b.get() >= ((long) ((C2856jh) this.a.b()).J());
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void b(List<Integer> list) {
        this.b.addAndGet(-list.size());
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void a(List<Integer> list) {
        this.b.addAndGet(list.size());
    }
}
