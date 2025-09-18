package defpackage;

/* loaded from: classes.dex */
public abstract class G12 {
    public static String a(String str) {
        return "ShortSegments(ids=" + str + ')';
    }

    public static void b(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = I12.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "negative size: "));
                }
                strB = I12.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(e(i, i2, "index"));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? e(i, i3, "start index") : (i2 < 0 || i2 > i3) ? e(i2, i3, "end index") : I12.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return I12.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return I12.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "negative size: "));
    }
}
