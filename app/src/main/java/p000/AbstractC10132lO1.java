package p000;

import android.os.Build;

/* renamed from: lO1 */
/* loaded from: classes.dex */
public abstract class AbstractC10132lO1 {

    /* renamed from: a */
    public static volatile AbstractC7362Ay0 f37041a;

    /* renamed from: a */
    public static final void m22416a(boolean z, Number number) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* renamed from: b */
    public static long m22417b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static int m22418c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: d */
    public static long m22419d(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24913y(AbstractC7222ym.m26239p("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum "), j2, '.'));
    }

    /* renamed from: e */
    public static boolean m22420e(int i) {
        return (i & 32768) != 0;
    }

    /* renamed from: f */
    public static boolean m22421f(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }

    /* renamed from: g */
    public static C9205e90 m22422g(C9461g90 c9461g90, int i) {
        O90.m5968f(c9461g90, "<this>");
        m22416a(i > 0, Integer.valueOf(i));
        if (c9461g90.f26571c <= 0) {
            i = -i;
        }
        return new C9205e90(c9461g90.f26569a, c9461g90.f26570b, i);
    }

    /* renamed from: h */
    public static C9461g90 m22423h(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C9461g90(i, i2 - 1, 1);
        }
        C9461g90 c9461g90 = C9461g90.f27588d;
        return C9461g90.f27588d;
    }
}
