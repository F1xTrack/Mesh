package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;

/* renamed from: com.yandex.metrica.impl.ob.gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2776gb implements InterfaceC2725ea<C3229yb, C3099tb<Rf.a, Fn>> {
    private final C2875kb a;
    private final Un b;

    public C2776gb() {
        this(new C2875kb(), new Un(20));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C3229yb a(C3099tb<Rf.a, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C2776gb(C2875kb c2875kb, Un un) {
        this.a = c2875kb;
        this.b = un;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.a, Fn> b(C3229yb c3229yb) {
        Rf.a aVar = new Rf.a();
        aVar.c = this.a.b(c3229yb.a);
        Qn<String, Fn> qnA = this.b.a(c3229yb.b);
        aVar.b = O2.c(qnA.a);
        return new C3099tb<>(aVar, En.a(qnA));
    }
}
