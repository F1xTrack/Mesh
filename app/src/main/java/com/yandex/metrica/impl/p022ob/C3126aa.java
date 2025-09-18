package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2641H;
import com.yandex.metrica.impl.p022ob.C3158bg;

/* renamed from: com.yandex.metrica.impl.ob.aa */
/* loaded from: classes2.dex */
public class C3126aa implements InterfaceC3230ea<C2641H, C3158bg.a> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3158bg.a mo13847b(C2641H c2641h) {
        C3158bg.a aVar = new C3158bg.a();
        C2641H.a aVar2 = c2641h.f21326a;
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                aVar.f23140b = 1;
            } else if (iOrdinal == 1) {
                aVar.f23140b = 2;
            } else if (iOrdinal == 2) {
                aVar.f23140b = 3;
            } else if (iOrdinal == 3) {
                aVar.f23140b = 4;
            } else if (iOrdinal == 4) {
                aVar.f23140b = 5;
            }
        }
        Boolean bool = c2641h.f21327b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f23141c = 1;
            } else {
                aVar.f23141c = 0;
            }
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2641H mo13846a(C3158bg.a aVar) {
        C2641H.a aVar2;
        int i = aVar.f23140b;
        Boolean bool = null;
        if (i == 1) {
            aVar2 = C2641H.a.ACTIVE;
        } else if (i == 2) {
            aVar2 = C2641H.a.WORKING_SET;
        } else if (i == 3) {
            aVar2 = C2641H.a.FREQUENT;
        } else if (i != 4) {
            aVar2 = i != 5 ? null : C2641H.a.RESTRICTED;
        } else {
            aVar2 = C2641H.a.RARE;
        }
        int i2 = aVar.f23141c;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C2641H(aVar2, bool);
    }
}
