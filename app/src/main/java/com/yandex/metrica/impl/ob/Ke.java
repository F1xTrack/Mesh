package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Ke implements InterfaceC2725ea<E0, Integer> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer b(E0 e0) {
        int iOrdinal = e0.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public E0 a(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return E0.APP;
        }
        if (iIntValue == 2) {
            return E0.RETAIL;
        }
        if (iIntValue != 3) {
            return E0.UNDEFINED;
        }
        return E0.SATELLITE;
    }
}
