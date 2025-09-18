package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7537v50 {
    public static final EnumC7537v50 a;
    public static final /* synthetic */ EnumC7537v50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7537v50 EF3;

    static {
        EnumC7537v50 enumC7537v50 = new EnumC7537v50("NUMERIC", 0);
        EnumC7537v50 enumC7537v502 = new EnumC7537v50("DIGIT2", 1);
        EnumC7537v50 enumC7537v503 = new EnumC7537v50("UNDEFINED", 2);
        a = enumC7537v503;
        b = new EnumC7537v50[]{enumC7537v50, enumC7537v502, enumC7537v503};
    }

    public static EnumC7537v50 valueOf(String str) {
        return (EnumC7537v50) Enum.valueOf(EnumC7537v50.class, str);
    }

    public static EnumC7537v50[] values() {
        return (EnumC7537v50[]) b.clone();
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
