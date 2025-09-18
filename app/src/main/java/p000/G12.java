package p000;

/* loaded from: classes.dex */
public abstract class G12 {
    /* renamed from: a */
    public static String m2910a(String str) {
        return "ShortSegments(ids=" + str + ')';
    }

    /* renamed from: b */
    public static void m2911b(int i, int i2) {
        String strM3732b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM3732b = I12.m3732b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
                }
                strM3732b = I12.m3732b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM3732b);
        }
    }

    /* renamed from: c */
    public static void m2912c(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m2914e(i, i2, "index"));
        }
    }

    /* renamed from: d */
    public static void m2913d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m2914e(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m2914e(i2, i3, "end index") : I12.m3732b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: e */
    public static String m2914e(int i, int i2, String str) {
        if (i < 0) {
            return I12.m3732b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return I12.m3732b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
    }
}
