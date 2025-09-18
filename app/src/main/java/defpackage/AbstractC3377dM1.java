package defpackage;

import java.util.Locale;

/* renamed from: dM1 */
/* loaded from: classes.dex */
public abstract class AbstractC3377dM1 {
    public static void d(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void i(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public abstract boolean a(AbstractC5799m0 abstractC5799m0, X x, X x2);

    public abstract boolean b(AbstractC5799m0 abstractC5799m0, Object obj, Object obj2);

    public abstract boolean c(AbstractC5799m0 abstractC5799m0, C5417k0 c5417k0, C5417k0 c5417k02);

    public abstract void j(C5417k0 c5417k0, C5417k0 c5417k02);

    public abstract void k(C5417k0 c5417k0, Thread thread);
}
