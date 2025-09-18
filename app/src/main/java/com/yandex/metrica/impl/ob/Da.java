package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class Da implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.p b(Ei ei) {
        C2880kg.p pVar = new C2880kg.p();
        pVar.b = ei.a;
        pVar.c = ei.b;
        pVar.e = C2814i.a(ei.c);
        pVar.d = C2814i.a(ei.d);
        pVar.f = ei.e;
        pVar.g = ei.f;
        pVar.h = ei.g;
        pVar.i = ei.h;
        pVar.j = ei.i;
        pVar.k = ei.j;
        return pVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Ei a(C2880kg.p pVar) {
        return new Ei(pVar.b, pVar.c, C2814i.a(pVar.e), C2814i.a(pVar.d), pVar.f, pVar.g, pVar.h, pVar.i, pVar.j, pVar.k);
    }
}
