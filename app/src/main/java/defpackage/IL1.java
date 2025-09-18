package defpackage;

/* loaded from: classes.dex */
public abstract class IL1 {
    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Object obj) {
        d(obj, "Argument must not be null");
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
