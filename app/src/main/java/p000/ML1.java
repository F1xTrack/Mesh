package p000;

/* loaded from: classes.dex */
public abstract class ML1 {
    /* renamed from: a */
    public static void m5334a(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m5335b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static void m5336c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m5339f(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m5337d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* renamed from: e */
    public static void m5338e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static String m5339f(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static final int m5340g(SX0 sx0, int i) {
        int i2;
        O90.m5968f(sx0, "<this>");
        int i3 = i + 1;
        int length = sx0.f10843e.length;
        int[] iArr = sx0.f10844f;
        O90.m5968f(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
