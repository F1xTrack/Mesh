package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5437k50 {
    public static final EnumC5437k50 a;
    public static final /* synthetic */ EnumC5437k50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5437k50 EF3;

    static {
        EnumC5437k50 enumC5437k50 = new EnumC5437k50("NUMERIC", 0);
        EnumC5437k50 enumC5437k502 = new EnumC5437k50("DIGIT2", 1);
        EnumC5437k50 enumC5437k503 = new EnumC5437k50("UNDEFINED", 2);
        a = enumC5437k503;
        b = new EnumC5437k50[]{enumC5437k50, enumC5437k502, enumC5437k503};
    }

    public static EnumC5437k50 valueOf(String str) {
        return (EnumC5437k50) Enum.valueOf(EnumC5437k50.class, str);
    }

    public static EnumC5437k50[] values() {
        return (EnumC5437k50[]) b.clone();
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
