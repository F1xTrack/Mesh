package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.sa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3073sa implements InterfaceC2725ea {
    private final C3048ra a;
    private final C3098ta b;

    public C3073sa() {
        this(new C3048ra(), new C3098ta());
    }

    public C3073sa(C3048ra c3048ra, C3098ta c3098ta) {
        this.a = c3048ra;
        this.b = c3098ta;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.k b(Wc wc) {
        C2880kg.k kVar = new C2880kg.k();
        kVar.b = this.a.b(wc.a);
        kVar.c = this.b.b(wc.b);
        return kVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Wc a(C2880kg.k kVar) {
        C3048ra c3048ra = this.a;
        C2880kg.k.a aVar = kVar.b;
        C2880kg.k.a aVar2 = new C2880kg.k.a();
        if (aVar == null) {
            aVar = aVar2;
        }
        Uc ucA = c3048ra.a(aVar);
        C3098ta c3098ta = this.b;
        C2880kg.k.b bVar = kVar.c;
        C2880kg.k.b bVar2 = new C2880kg.k.b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new Wc(ucA, c3098ta.a(bVar));
    }
}
