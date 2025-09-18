package p000;

import android.util.Rational;
import android.util.Size;

/* renamed from: X8 */
/* loaded from: classes.dex */
public abstract class AbstractC1456X8 {

    /* renamed from: a */
    public static final Rational f13568a = new Rational(4, 3);

    /* renamed from: b */
    public static final Rational f13569b = new Rational(3, 4);

    /* renamed from: c */
    public static final Rational f13570c = new Rational(16, 9);

    /* renamed from: d */
    public static final Rational f13571d = new Rational(9, 16);

    /* renamed from: a */
    public static boolean m8936a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            Size size3 = AbstractC9318f21.f27016a;
            if (size.getHeight() * size.getWidth() < AbstractC9318f21.m18157a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i != 0 || height % 16 != 0) {
                if (i == 0) {
                    return m8937b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return m8937b(width, height, rational2);
                }
                return false;
            }
            if (!m8937b(Math.max(0, height - 16), width, rational) && !m8937b(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m8937b(int i, int i2, Rational rational) {
        AbstractC9104dM1.m17546e(i2 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
