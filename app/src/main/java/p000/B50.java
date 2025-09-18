package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B50 {

    /* renamed from: a */
    public static final B50 f560a;

    /* renamed from: b */
    public static final B50 f561b;

    /* renamed from: c */
    public static final /* synthetic */ B50[] f562c;

    static {
        B50 b50 = new B50("AUTO", 0);
        f560a = b50;
        B50 b502 = new B50("ALWAYS", 1);
        B50 b503 = new B50("NEVER", 2);
        f561b = b503;
        f562c = new B50[]{b50, b502, b503, new B50("EXCEPTZERO", 3)};
    }

    public static B50 valueOf(String str) {
        return (B50) Enum.valueOf(B50.class, str);
    }

    public static B50[] values() {
        return (B50[]) f562c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "auto";
        }
        if (iOrdinal == 1) {
            return "always";
        }
        if (iOrdinal == 2) {
            return "never";
        }
        if (iOrdinal == 3) {
            return "exceptZero";
        }
        throw new IllegalArgumentException();
    }
}
