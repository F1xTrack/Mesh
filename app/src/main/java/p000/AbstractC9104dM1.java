package p000;

import java.util.Locale;

/* renamed from: dM1 */
/* loaded from: classes.dex */
public abstract class AbstractC9104dM1 {
    /* renamed from: d */
    public static void m17545d(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: e */
    public static void m17546e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m17547f(int i, int i2, int i3, String str) {
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

    /* renamed from: g */
    public static void m17548g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    public static void m17549h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* renamed from: i */
    public static void m17550i(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public abstract boolean mo9444a(AbstractC6399m0 abstractC6399m0, C1447X c1447x, C1447X c1447x2);

    /* renamed from: b */
    public abstract boolean mo9445b(AbstractC6399m0 abstractC6399m0, Object obj, Object obj2);

    /* renamed from: c */
    public abstract boolean mo9446c(AbstractC6399m0 abstractC6399m0, C6273k0 c6273k0, C6273k0 c6273k02);

    /* renamed from: j */
    public abstract void mo9447j(C6273k0 c6273k0, C6273k0 c6273k02);

    /* renamed from: k */
    public abstract void mo9448k(C6273k0 c6273k0, Thread thread);
}
