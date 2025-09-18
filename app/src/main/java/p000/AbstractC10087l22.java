package p000;

import java.util.ArrayList;

/* renamed from: l22 */
/* loaded from: classes.dex */
public abstract class AbstractC10087l22 {
    /* renamed from: a */
    public static final Object m22339a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: b */
    public static void m22340b(int i, int i2) {
        String strM24835b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM24835b = AbstractC11111t22.m24835b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
                }
                strM24835b = AbstractC11111t22.m24835b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM24835b);
        }
    }

    /* renamed from: c */
    public static void m22341c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m22342d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m22342d(i2, i3, "end index") : AbstractC11111t22.m24835b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: d */
    public static String m22342d(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC11111t22.m24835b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC11111t22.m24835b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
    }
}
