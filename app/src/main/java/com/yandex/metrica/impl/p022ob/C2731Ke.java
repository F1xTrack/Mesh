package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Ke */
/* loaded from: classes2.dex */
public class C2731Ke implements InterfaceC3230ea<EnumC2567E0, Integer> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer mo13847b(EnumC2567E0 enumC2567E0) {
        int iOrdinal = enumC2567E0.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public EnumC2567E0 mo13846a(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return EnumC2567E0.APP;
        }
        if (iIntValue == 2) {
            return EnumC2567E0.RETAIL;
        }
        if (iIntValue != 3) {
            return EnumC2567E0.UNDEFINED;
        }
        return EnumC2567E0.SATELLITE;
    }
}
