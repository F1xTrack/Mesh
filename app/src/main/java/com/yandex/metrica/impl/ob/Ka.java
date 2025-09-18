package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class Ka implements InterfaceC2725ea<C2662bm, C2880kg.v> {
    private final Ia a;

    public Ka() {
        this(new Ia());
    }

    public Ka(Ia ia) {
        this.a = ia;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.v b(C2662bm c2662bm) {
        C2880kg.v vVar = new C2880kg.v();
        vVar.b = c2662bm.a;
        vVar.c = c2662bm.b;
        vVar.d = c2662bm.c;
        vVar.e = c2662bm.d;
        vVar.f = c2662bm.e;
        vVar.g = c2662bm.f;
        vVar.h = c2662bm.g;
        vVar.i = this.a.b(c2662bm.h);
        return vVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2662bm a(C2880kg.v vVar) {
        return new C2662bm(vVar.b, vVar.c, vVar.d, vVar.e, vVar.f, vVar.g, vVar.h, this.a.a(vVar.i));
    }
}
