package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: io.appmetrica.analytics.impl.w7 */
/* loaded from: classes2.dex */
public final class C5541w7 implements ProtobufConverter {
    /* renamed from: a */
    public final BigDecimal m21176a(C5092e8 c5092e8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5092e8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC5591y7.f32848a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC5591y7.f32848a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC5591y7.f32849b) >= 0) {
                Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
                Integer numValueOf = Integer.valueOf(i);
                C5566x7 c5566x7 = new C5566x7(numValueOf.intValue(), lValueOf.longValue());
                C5092e8 c5092e8 = new C5092e8();
                c5092e8.f31556a = c5566x7.f32807a;
                c5092e8.f31557b = c5566x7.f32808b;
                return c5092e8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
