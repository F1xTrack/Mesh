package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.Ge */
/* loaded from: classes2.dex */
public final class C4519Ge implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(EnumC4728P7 enumC4728P7) {
        int iOrdinal = enumC4728P7.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC4728P7 toModel(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return EnumC4728P7.f30605c;
        }
        if (iIntValue == 2) {
            return EnumC4728P7.f30607e;
        }
        if (iIntValue != 3) {
            return EnumC4728P7.f30604b;
        }
        return EnumC4728P7.f30606d;
    }
}
