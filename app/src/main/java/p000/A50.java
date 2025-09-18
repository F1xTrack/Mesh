package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A50 {

    /* renamed from: a */
    public static final A50 f68a;

    /* renamed from: b */
    public static final A50 f69b;

    /* renamed from: c */
    public static final A50 f70c;

    /* renamed from: d */
    public static final /* synthetic */ A50[] f71d;

    /* JADX INFO: Fake field, exist only in values array */
    A50 EF4;

    static {
        A50 a50 = new A50("STANDARD", 0);
        A50 a502 = new A50("SCIENTIFIC", 1);
        f68a = a502;
        A50 a503 = new A50("ENGINEERING", 2);
        f69b = a503;
        A50 a504 = new A50("COMPACT", 3);
        f70c = a504;
        f71d = new A50[]{a50, a502, a503, a504};
    }

    public static A50 valueOf(String str) {
        return (A50) Enum.valueOf(A50.class, str);
    }

    public static A50[] values() {
        return (A50[]) f71d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "scientific";
        }
        if (iOrdinal == 2) {
            return "engineering";
        }
        if (iOrdinal == 3) {
            return "compact";
        }
        throw new IllegalArgumentException();
    }
}
