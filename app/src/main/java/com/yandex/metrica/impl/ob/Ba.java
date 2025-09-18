package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class Ba implements InterfaceC2725ea<Di, C2880kg.o> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.o b(Di di) {
        C2880kg.o oVar = new C2880kg.o();
        oVar.b = di.a;
        oVar.c = di.b;
        oVar.d = di.c;
        oVar.e = di.d;
        return oVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Di a(C2880kg.o oVar) {
        return new Di(oVar.b, oVar.c, oVar.d, oVar.e);
    }
}
