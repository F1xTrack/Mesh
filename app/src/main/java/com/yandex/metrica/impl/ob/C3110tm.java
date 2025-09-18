package com.yandex.metrica.impl.ob;

import defpackage.O90;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;

/* renamed from: com.yandex.metrica.impl.ob.tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3110tm {
    private static final BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger b = BigInteger.valueOf(Long.MIN_VALUE);

    public static final Pair a(BigDecimal bigDecimal) {
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        O90.e(bigIntegerUnscaledValue, "value.unscaledValue()");
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(a) <= 0 && bigIntegerUnscaledValue.compareTo(b) >= 0) {
                return new Pair(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i));
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            O90.e(bigIntegerUnscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i++;
        }
    }
}
