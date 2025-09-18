package p000;

import android.media.ImageReader;

/* renamed from: h22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9575h22 {
    /* renamed from: a */
    public static X11 m18702a(int i, int i2, int i3, int i4) {
        return new X11(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* renamed from: b */
    public static void m18703b(int i, int i2) {
        String strM18935b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM18935b = AbstractC9703i22.m18935b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
                }
                strM18935b = AbstractC9703i22.m18935b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM18935b);
        }
    }

    /* renamed from: c */
    public static void m18704c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m18705d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m18705d(i2, i3, "end index") : AbstractC9703i22.m18935b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: d */
    public static String m18705d(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC9703i22.m18935b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC9703i22.m18935b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
    }
}
