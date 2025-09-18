package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6392p50 {
    public static final EnumC6392p50 a;
    public static final /* synthetic */ EnumC6392p50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6392p50 EF3;

    static {
        EnumC6392p50 enumC6392p50 = new EnumC6392p50("NUMERIC", 0);
        EnumC6392p50 enumC6392p502 = new EnumC6392p50("DIGIT2", 1);
        EnumC6392p50 enumC6392p503 = new EnumC6392p50("UNDEFINED", 2);
        a = enumC6392p503;
        b = new EnumC6392p50[]{enumC6392p50, enumC6392p502, enumC6392p503};
    }

    public static EnumC6392p50 valueOf(String str) {
        return (EnumC6392p50) Enum.valueOf(EnumC6392p50.class, str);
    }

    public static EnumC6392p50[] values() {
        return (EnumC6392p50[]) b.clone();
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
