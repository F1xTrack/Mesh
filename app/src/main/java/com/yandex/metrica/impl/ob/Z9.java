package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class Z9 implements InterfaceC2725ea<C2988p, C2880kg.b> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2880kg.b b(C2988p c2988p) {
        C2988p c2988p2 = c2988p;
        C2880kg.b bVar = new C2880kg.b();
        bVar.b = c2988p2.a;
        bVar.c = c2988p2.b;
        return bVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2988p a(C2880kg.b bVar) {
        return new C2988p(bVar.b, bVar.c);
    }
}
