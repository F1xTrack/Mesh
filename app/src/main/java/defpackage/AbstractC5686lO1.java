package defpackage;

import android.os.Build;

/* renamed from: lO1 */
/* loaded from: classes.dex */
public abstract class AbstractC5686lO1 {
    public static volatile AbstractC0093Ay0 a;

    public static final void a(boolean z, Number number) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static long b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long d(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.y(AbstractC8235ym.p("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum "), j2, '.'));
    }

    public static boolean e(int i) {
        return (i & 32768) != 0;
    }

    public static boolean f(int i) {
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

    public static C3527e90 g(C3909g90 c3909g90, int i) {
        O90.f(c3909g90, "<this>");
        a(i > 0, Integer.valueOf(i));
        if (c3909g90.c <= 0) {
            i = -i;
        }
        return new C3527e90(c3909g90.a, c3909g90.b, i);
    }

    public static C3909g90 h(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C3909g90(i, i2 - 1, 1);
        }
        C3909g90 c3909g90 = C3909g90.d;
        return C3909g90.d;
    }
}
