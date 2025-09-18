package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.xa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3203xa implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(Object obj) {
        C2880kg.m mVar = (C2880kg.m) obj;
        return new Ai(mVar.b, mVar.c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object b(Object obj) {
        Ai ai = (Ai) obj;
        C2880kg.m mVar = new C2880kg.m();
        mVar.b = ai.a;
        mVar.c = ai.b;
        return mVar;
    }
}
