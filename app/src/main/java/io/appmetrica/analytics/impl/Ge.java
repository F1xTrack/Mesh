package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes2.dex */
public final class Ge implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(P7 p7) {
        int iOrdinal = p7.ordinal();
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
    public final P7 toModel(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return P7.c;
        }
        if (iIntValue == 2) {
            return P7.e;
        }
        if (iIntValue != 3) {
            return P7.b;
        }
        return P7.d;
    }
}
