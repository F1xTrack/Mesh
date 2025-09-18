package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2681cg;
import defpackage.C2404br1;
import defpackage.EnumC0625Ht1;

/* renamed from: com.yandex.metrica.impl.ob.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3116u3 implements InterfaceC2725ea<C2404br1, C2681cg.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2681cg.a b(C2404br1 c2404br1) {
        int i;
        C2681cg.a aVar = new C2681cg.a();
        int iOrdinal = c2404br1.a.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal == 1) {
                i = 3;
            }
        } else {
            i = 2;
        }
        aVar.b = i;
        aVar.c = c2404br1.b;
        aVar.d = c2404br1.c;
        aVar.e = c2404br1.d;
        aVar.f = c2404br1.e;
        return aVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2404br1 a(C2681cg.a aVar) {
        EnumC0625Ht1 enumC0625Ht1;
        int i = aVar.b;
        if (i == 2) {
            enumC0625Ht1 = EnumC0625Ht1.a;
        } else if (i != 3) {
            enumC0625Ht1 = EnumC0625Ht1.c;
        } else {
            enumC0625Ht1 = EnumC0625Ht1.b;
        }
        return new C2404br1(enumC0625Ht1, aVar.c, aVar.d, aVar.e, aVar.f);
    }
}
