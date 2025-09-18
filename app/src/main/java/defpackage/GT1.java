package defpackage;

/* loaded from: classes.dex */
public abstract class GT1 {
    public static C6205o61 a() {
        return new C6205o61(null);
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
