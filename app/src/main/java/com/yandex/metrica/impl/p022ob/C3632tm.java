package com.yandex.metrica.impl.p022ob;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.tm */
/* loaded from: classes2.dex */
public final class C3632tm {

    /* renamed from: a */
    private static final BigInteger f24871a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b */
    private static final BigInteger f24872b = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: a */
    public static final Pair m16881a(BigDecimal bigDecimal) {
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        O90.m5967e(bigIntegerUnscaledValue, "value.unscaledValue()");
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(f24871a) <= 0 && bigIntegerUnscaledValue.compareTo(f24872b) >= 0) {
                return new Pair(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i));
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            O90.m5967e(bigIntegerUnscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i++;
        }
    }
}
