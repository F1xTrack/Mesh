package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.Z9 */
/* loaded from: classes2.dex */
public class C3100Z9 implements InterfaceC3230ea<C3505p, C3392kg.b> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3392kg.b mo13847b(C3505p c3505p) {
        C3505p c3505p2 = c3505p;
        C3392kg.b bVar = new C3392kg.b();
        bVar.f23978b = c3505p2.f24397a;
        bVar.f23979c = c3505p2.f24398b;
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3505p mo13846a(C3392kg.b bVar) {
        return new C3505p(bVar.f23978b, bVar.f23979c);
    }
}
