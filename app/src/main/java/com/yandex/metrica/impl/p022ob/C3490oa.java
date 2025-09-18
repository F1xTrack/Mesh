package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.oa */
/* loaded from: classes2.dex */
public class C3490oa implements InterfaceC3230ea {

    /* renamed from: a */
    private final C3464na f24371a;

    public C3490oa() {
        this(new C3464na());
    }

    public C3490oa(C3464na c3464na) {
        this.f24371a = c3464na;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.k.a.b mo13847b(C2704Jc c2704Jc) {
        C3392kg.k.a.b bVar = new C3392kg.k.a.b();
        C3753yd c3753yd = c2704Jc.f21549a;
        bVar.f24049b = c3753yd.f25306a;
        bVar.f24050c = c3753yd.f25307b;
        C2654Hc c2654Hc = c2704Jc.f21550b;
        if (c2654Hc != null) {
            bVar.f24051d = this.f24371a.mo13847b(c2654Hc);
        }
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2704Jc mo13846a(C3392kg.k.a.b bVar) {
        C3392kg.k.a.b.C7311a c7311a = bVar.f24051d;
        return new C2704Jc(new C3753yd(bVar.f24049b, bVar.f24050c), c7311a != null ? this.f24371a.mo13846a(c7311a) : null);
    }
}
