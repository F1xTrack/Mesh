package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.ma */
/* loaded from: classes2.dex */
public class C3438ma implements InterfaceC3230ea {

    /* renamed from: a */
    private final C3412la f24252a;

    public C3438ma() {
        this(new C3412la());
    }

    public C3438ma(C3412la c3412la) {
        this.f24252a = c3412la;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.k.a.C7309a mo13847b(C2579Ec c2579Ec) {
        C3392kg.k.a.C7309a c7309a = new C3392kg.k.a.C7309a();
        C3753yd c3753yd = c2579Ec.f21111a;
        c7309a.f24044b = c3753yd.f25306a;
        c7309a.f24045c = c3753yd.f25307b;
        C2554Dc c2554Dc = c2579Ec.f21112b;
        if (c2554Dc != null) {
            this.f24252a.getClass();
            C3392kg.k.a.C7309a.C7310a c7310a = new C3392kg.k.a.C7309a.C7310a();
            c7310a.f24047b = c2554Dc.f21017a;
            c7310a.f24048c = c2554Dc.f21018b;
            c7309a.f24046d = c7310a;
        }
        return c7309a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2579Ec mo13846a(C3392kg.k.a.C7309a c7309a) {
        C2554Dc c2554Dc;
        C3392kg.k.a.C7309a.C7310a c7310a = c7309a.f24046d;
        if (c7310a != null) {
            this.f24252a.getClass();
            c2554Dc = new C2554Dc(c7310a.f24047b, c7310a.f24048c);
        } else {
            c2554Dc = null;
        }
        return new C2579Ec(new C3753yd(c7309a.f24044b, c7309a.f24045c), c2554Dc);
    }
}
