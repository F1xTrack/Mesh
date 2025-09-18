package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D50 {
    public static final /* synthetic */ D50[] a = {new D50("SHORT", 0), new D50("NARROW", 1), new D50("LONG", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    D50 EF7;

    public static D50 valueOf(String str) {
        return (D50) Enum.valueOf(D50.class, str);
    }

    public static D50[] values() {
        return (D50[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return "narrow";
        }
        if (iOrdinal == 2) {
            return "long";
        }
        throw new IllegalArgumentException();
    }
}
