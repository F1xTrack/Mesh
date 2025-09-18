package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8297z50 {
    public static final EnumC8297z50 a;
    public static final EnumC8297z50 b;
    public static final /* synthetic */ EnumC8297z50[] c;

    static {
        EnumC8297z50 enumC8297z50 = new EnumC8297z50("STANDARD", 0);
        a = enumC8297z50;
        EnumC8297z50 enumC8297z502 = new EnumC8297z50("ACCOUNTING", 1);
        b = enumC8297z502;
        c = new EnumC8297z50[]{enumC8297z50, enumC8297z502};
    }

    public static EnumC8297z50 valueOf(String str) {
        return (EnumC8297z50) Enum.valueOf(EnumC8297z50.class, str);
    }

    public static EnumC8297z50[] values() {
        return (EnumC8297z50[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "accounting";
        }
        throw new IllegalArgumentException();
    }
}
