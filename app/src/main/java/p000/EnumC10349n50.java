package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10349n50 {

    /* renamed from: a */
    public static final EnumC10349n50 f38095a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10349n50[] f38096b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10349n50 EF3;

    static {
        EnumC10349n50 enumC10349n50 = new EnumC10349n50("NUMERIC", 0);
        EnumC10349n50 enumC10349n502 = new EnumC10349n50("DIGIT2", 1);
        EnumC10349n50 enumC10349n503 = new EnumC10349n50("UNDEFINED", 2);
        f38095a = enumC10349n503;
        f38096b = new EnumC10349n50[]{enumC10349n50, enumC10349n502, enumC10349n503};
    }

    public static EnumC10349n50 valueOf(String str) {
        return (EnumC10349n50) Enum.valueOf(EnumC10349n50.class, str);
    }

    public static EnumC10349n50[] values() {
        return (EnumC10349n50[]) f38096b.clone();
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
