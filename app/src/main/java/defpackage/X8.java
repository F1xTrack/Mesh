package defpackage;

import android.util.Rational;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class X8 {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            Size size3 = AbstractC3696f21.a;
            if (size.getHeight() * size.getWidth() < AbstractC3696f21.a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i != 0 || height % 16 != 0) {
                if (i == 0) {
                    return b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
                return false;
            }
            if (!b(Math.max(0, height - 16), width, rational) && !b(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int i, int i2, Rational rational) {
        AbstractC3377dM1.e(i2 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
