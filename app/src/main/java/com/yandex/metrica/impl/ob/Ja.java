package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class Ja implements InterfaceC2725ea<Kl, C2880kg.u> {
    private final Ia a;

    public Ja() {
        this(new Ia());
    }

    public Ja(Ia ia) {
        this.a = ia;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.u b(Kl kl) {
        C2880kg.u uVar = new C2880kg.u();
        uVar.b = kl.a;
        uVar.c = kl.b;
        uVar.d = kl.c;
        uVar.e = kl.d;
        uVar.j = kl.e;
        uVar.k = kl.f;
        uVar.l = kl.g;
        uVar.m = kl.h;
        uVar.o = kl.i;
        uVar.p = kl.j;
        uVar.f = kl.k;
        uVar.g = kl.l;
        uVar.h = kl.m;
        uVar.i = kl.n;
        uVar.q = kl.o;
        uVar.n = this.a.b(kl.p);
        return uVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Kl a(C2880kg.u uVar) {
        return new Kl(uVar.b, uVar.c, uVar.d, uVar.e, uVar.j, uVar.k, uVar.l, uVar.m, uVar.o, uVar.p, uVar.f, uVar.g, uVar.h, uVar.i, uVar.q, this.a.a(uVar.n));
    }
}
