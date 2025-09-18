package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2656bg;
import com.yandex.metrica.impl.ob.H;

/* renamed from: com.yandex.metrica.impl.ob.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2625aa implements InterfaceC2725ea<H, C2656bg.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2656bg.a b(H h) {
        C2656bg.a aVar = new C2656bg.a();
        H.a aVar2 = h.a;
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                aVar.b = 1;
            } else if (iOrdinal == 1) {
                aVar.b = 2;
            } else if (iOrdinal == 2) {
                aVar.b = 3;
            } else if (iOrdinal == 3) {
                aVar.b = 4;
            } else if (iOrdinal == 4) {
                aVar.b = 5;
            }
        }
        Boolean bool = h.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.c = 1;
            } else {
                aVar.c = 0;
            }
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public H a(C2656bg.a aVar) {
        H.a aVar2;
        int i = aVar.b;
        Boolean bool = null;
        if (i == 1) {
            aVar2 = H.a.ACTIVE;
        } else if (i == 2) {
            aVar2 = H.a.WORKING_SET;
        } else if (i == 3) {
            aVar2 = H.a.FREQUENT;
        } else if (i != 4) {
            aVar2 = i != 5 ? null : H.a.RESTRICTED;
        } else {
            aVar2 = H.a.RARE;
        }
        int i2 = aVar.c;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new H(aVar2, bool);
    }
}
