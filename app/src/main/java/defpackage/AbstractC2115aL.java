package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: aL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2115aL {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (Math.getExponent(d) > 1023) {
            return false;
        }
        if (d != ConfigValue.DOUBLE_DEFAULT_VALUE) {
            if (!(Math.getExponent(d) <= 1023)) {
                throw new IllegalArgumentException("not a normal value");
            }
            int exponent = Math.getExponent(d);
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) > Math.getExponent(d)) {
                return false;
            }
        }
        return true;
    }
}
