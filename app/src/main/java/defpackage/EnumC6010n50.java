package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6010n50 {
    public static final EnumC6010n50 a;
    public static final /* synthetic */ EnumC6010n50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6010n50 EF3;

    static {
        EnumC6010n50 enumC6010n50 = new EnumC6010n50("NUMERIC", 0);
        EnumC6010n50 enumC6010n502 = new EnumC6010n50("DIGIT2", 1);
        EnumC6010n50 enumC6010n503 = new EnumC6010n50("UNDEFINED", 2);
        a = enumC6010n503;
        b = new EnumC6010n50[]{enumC6010n50, enumC6010n502, enumC6010n503};
    }

    public static EnumC6010n50 valueOf(String str) {
        return (EnumC6010n50) Enum.valueOf(EnumC6010n50.class, str);
    }

    public static EnumC6010n50[] values() {
        return (EnumC6010n50[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "numeric";
        }
        if (iOrdinal == 1) {
            return "2-digit";
        }
        if (iOrdinal == 2) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
