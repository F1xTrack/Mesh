package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.Ka */
/* loaded from: classes2.dex */
public class C2727Ka implements InterfaceC3230ea<C3164bm, C3392kg.v> {

    /* renamed from: a */
    private final C2677Ia f21580a;

    public C2727Ka() {
        this(new C2677Ia());
    }

    public C2727Ka(C2677Ia c2677Ia) {
        this.f21580a = c2677Ia;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.v mo13847b(C3164bm c3164bm) {
        C3392kg.v vVar = new C3392kg.v();
        vVar.f24108b = c3164bm.f23148a;
        vVar.f24109c = c3164bm.f23149b;
        vVar.f24110d = c3164bm.f23150c;
        vVar.f24111e = c3164bm.f23151d;
        vVar.f24112f = c3164bm.f23152e;
        vVar.f24113g = c3164bm.f23153f;
        vVar.f24114h = c3164bm.f23154g;
        vVar.f24115i = this.f21580a.mo13847b(c3164bm.f23155h);
        return vVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3164bm mo13846a(C3392kg.v vVar) {
        return new C3164bm(vVar.f24108b, vVar.f24109c, vVar.f24110d, vVar.f24111e, vVar.f24112f, vVar.f24113g, vVar.f24114h, this.f21580a.mo13846a(vVar.f24115i));
    }
}
