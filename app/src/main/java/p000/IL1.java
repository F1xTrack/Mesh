package p000;

/* loaded from: classes.dex */
public abstract class IL1 {
    /* renamed from: a */
    public static void m3827a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m3828b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m3829c(Object obj) {
        m3830d(obj, "Argument must not be null");
    }

    /* renamed from: d */
    public static void m3830d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
