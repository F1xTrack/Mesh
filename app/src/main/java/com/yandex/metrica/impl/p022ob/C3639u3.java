package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3184cg;
import p000.C8905br1;
import p000.EnumC7717Ht1;

/* renamed from: com.yandex.metrica.impl.ob.u3 */
/* loaded from: classes2.dex */
class C3639u3 implements InterfaceC3230ea<C8905br1, C3184cg.a> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3184cg.a mo13847b(C8905br1 c8905br1) {
        int i;
        C3184cg.a aVar = new C3184cg.a();
        int iOrdinal = c8905br1.f17190a.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal == 1) {
                i = 3;
            }
        } else {
            i = 2;
        }
        aVar.f23184b = i;
        aVar.f23185c = c8905br1.f17191b;
        aVar.f23186d = c8905br1.f17192c;
        aVar.f23187e = c8905br1.f17193d;
        aVar.f23188f = c8905br1.f17194e;
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C8905br1 mo13846a(C3184cg.a aVar) {
        EnumC7717Ht1 enumC7717Ht1;
        int i = aVar.f23184b;
        if (i == 2) {
            enumC7717Ht1 = EnumC7717Ht1.f4566a;
        } else if (i != 3) {
            enumC7717Ht1 = EnumC7717Ht1.f4568c;
        } else {
            enumC7717Ht1 = EnumC7717Ht1.f4567b;
        }
        return new C8905br1(enumC7717Ht1, aVar.f23185c, aVar.f23186d, aVar.f23187e, aVar.f23188f);
    }
}
