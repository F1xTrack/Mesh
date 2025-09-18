package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.sa */
/* loaded from: classes2.dex */
public class C3594sa implements InterfaceC3230ea {

    /* renamed from: a */
    private final C3568ra f24663a;

    /* renamed from: b */
    private final C3620ta f24664b;

    public C3594sa() {
        this(new C3568ra(), new C3620ta());
    }

    public C3594sa(C3568ra c3568ra, C3620ta c3620ta) {
        this.f24663a = c3568ra;
        this.f24664b = c3620ta;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.k mo13847b(C3028Wc c3028Wc) {
        C3392kg.k kVar = new C3392kg.k();
        kVar.f24025b = this.f24663a.mo13847b(c3028Wc.f22683a);
        kVar.f24026c = this.f24664b.mo13847b(c3028Wc.f22684b);
        return kVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3028Wc mo13846a(C3392kg.k kVar) {
        C3568ra c3568ra = this.f24663a;
        C3392kg.k.a aVar = kVar.f24025b;
        C3392kg.k.a aVar2 = new C3392kg.k.a();
        if (aVar == null) {
            aVar = aVar2;
        }
        C2978Uc c2978UcMo13846a = c3568ra.mo13846a(aVar);
        C3620ta c3620ta = this.f24664b;
        C3392kg.k.b bVar = kVar.f24026c;
        C3392kg.k.b bVar2 = new C3392kg.k.b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new C3028Wc(c2978UcMo13846a, c3620ta.mo13846a(bVar));
    }
}
