package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public final class Fa implements InterfaceC2725ea<Ti, C2880kg.q> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2880kg.q b(Ti ti) {
        C2880kg.q qVar = new C2880kg.q();
        qVar.b = ti.a();
        return qVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Ti a(C2880kg.q qVar) {
        return new Ti(qVar.b);
    }
}
