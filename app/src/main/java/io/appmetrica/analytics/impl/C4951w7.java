package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4951w7 implements ProtobufConverter {
    public final BigDecimal a(C4522e8 c4522e8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4522e8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC4999y7.a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC4999y7.a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC4999y7.b) >= 0) {
                Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
                Integer numValueOf = Integer.valueOf(i);
                C4975x7 c4975x7 = new C4975x7(numValueOf.intValue(), lValueOf.longValue());
                C4522e8 c4522e8 = new C4522e8();
                c4522e8.a = c4975x7.a;
                c4522e8.b = c4975x7.b;
                return c4522e8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
