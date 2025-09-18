package p000;

/* loaded from: classes.dex */
public abstract class GT1 {
    /* renamed from: a */
    public static C10480o61 m3069a() {
        return new C10480o61(null);
    }

    /* renamed from: b */
    public static int m3070b(Comparable comparable, Comparable comparable2) {
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
