package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class KT1 {
    public static Constructor a;
    public static Method b;
    public static Method c;

    public static void a() throws ClassNotFoundException {
        if (a == null || b == null || c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            a = cls.getConstructor(null);
            b = cls.getMethod("setRotationDegrees", Float.TYPE);
            c = cls.getMethod("build", null);
        }
    }

    public static final long b(long j, long j2, long j3, String str) {
        String property;
        int i = Z71.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lG = C51.g(property);
        if (lG == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lG.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int c(int i, int i2, int i3, int i4, String str) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) b(i, i2, i3, str);
    }
}
