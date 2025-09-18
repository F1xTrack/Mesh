package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class Ga implements InterfaceC2725ea<Ui, C2880kg.r> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2880kg.r b(Ui ui) {
        C2880kg.r rVar = new C2880kg.r();
        rVar.b = ui.a;
        return rVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Ui a(C2880kg.r rVar) {
        return new Ui(rVar.b);
    }
}
