package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: aL */
/* loaded from: classes.dex */
public abstract class AbstractC1658aL {

    /* renamed from: a */
    public static final /* synthetic */ int f15466a = 0;

    static {
        Math.log(2.0d);
    }

    /* renamed from: a */
    public static boolean m9705a(double d) {
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
