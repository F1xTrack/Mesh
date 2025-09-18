package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2675ca implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.c b(C3007pi c3007pi) {
        C2880kg.c cVar = new C2880kg.c();
        cVar.b = c3007pi.a;
        cVar.c = c3007pi.b;
        cVar.d = c3007pi.c;
        cVar.e = c3007pi.d;
        return cVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C3007pi a(C2880kg.c cVar) {
        return new C3007pi(cVar.b, cVar.c, cVar.d, cVar.e);
    }
}
