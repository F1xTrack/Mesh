package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class KT1 {

    /* renamed from: a */
    public static Constructor f6121a;

    /* renamed from: b */
    public static Method f6122b;

    /* renamed from: c */
    public static Method f6123c;

    /* renamed from: a */
    public static void m4649a() throws ClassNotFoundException {
        if (f6121a == null || f6122b == null || f6123c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f6121a = cls.getConstructor(null);
            f6122b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f6123c = cls.getMethod("build", null);
        }
    }

    /* renamed from: b */
    public static final long m4650b(long j, long j2, long j3, String str) {
        String property;
        int i = Z71.f14753a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM980g = C51.m980g(property);
        if (lM980g == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM980g.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: c */
    public static int m4651c(int i, int i2, int i3, int i4, String str) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m4650b(i, i2, i3, str);
    }
}
