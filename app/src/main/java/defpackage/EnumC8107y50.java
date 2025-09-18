package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8107y50 {
    public static final EnumC8107y50 a;
    public static final EnumC8107y50 b;
    public static final /* synthetic */ EnumC8107y50[] c;

    static {
        EnumC8107y50 enumC8107y50 = new EnumC8107y50("SYMBOL", 0);
        a = enumC8107y50;
        EnumC8107y50 enumC8107y502 = new EnumC8107y50("NARROWSYMBOL", 1);
        EnumC8107y50 enumC8107y503 = new EnumC8107y50("CODE", 2);
        b = enumC8107y503;
        c = new EnumC8107y50[]{enumC8107y50, enumC8107y502, enumC8107y503, new EnumC8107y50("NAME", 3)};
    }

    public static EnumC8107y50 valueOf(String str) {
        return (EnumC8107y50) Enum.valueOf(EnumC8107y50.class, str);
    }

    public static EnumC8107y50[] values() {
        return (EnumC8107y50[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "symbol";
        }
        if (iOrdinal == 1) {
            return "narrowSymbol";
        }
        if (iOrdinal == 2) {
            return "code";
        }
        if (iOrdinal == 3) {
            return "name";
        }
        throw new IllegalArgumentException();
    }
}
