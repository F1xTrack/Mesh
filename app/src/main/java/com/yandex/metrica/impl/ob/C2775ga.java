package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.ga, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2775ga implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object b(Object obj) {
        Wa wa = (Wa) obj;
        C2880kg.e eVar = new C2880kg.e();
        eVar.b = wa.a;
        eVar.c = wa.b;
        return eVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Wa a(C2880kg.e eVar) {
        return new Wa(eVar.b, eVar.c);
    }
}
