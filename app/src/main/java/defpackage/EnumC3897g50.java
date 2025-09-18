package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3897g50 {
    public static final EnumC3897g50 a;
    public static final EnumC3897g50 b;
    public static final EnumC3897g50 c;
    public static final EnumC3897g50 d;
    public static final EnumC3897g50 e;
    public static final /* synthetic */ EnumC3897g50[] f;

    static {
        EnumC3897g50 enumC3897g50 = new EnumC3897g50("BASE", 0);
        a = enumC3897g50;
        EnumC3897g50 enumC3897g502 = new EnumC3897g50("ACCENT", 1);
        b = enumC3897g502;
        EnumC3897g50 enumC3897g503 = new EnumC3897g50("CASE", 2);
        c = enumC3897g503;
        EnumC3897g50 enumC3897g504 = new EnumC3897g50("VARIANT", 3);
        d = enumC3897g504;
        EnumC3897g50 enumC3897g505 = new EnumC3897g50("LOCALE", 4);
        e = enumC3897g505;
        f = new EnumC3897g50[]{enumC3897g50, enumC3897g502, enumC3897g503, enumC3897g504, enumC3897g505};
    }

    public static EnumC3897g50 valueOf(String str) {
        return (EnumC3897g50) Enum.valueOf(EnumC3897g50.class, str);
    }

    public static EnumC3897g50[] values() {
        return (EnumC3897g50[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "base";
        }
        if (iOrdinal == 1) {
            return "accent";
        }
        if (iOrdinal == 2) {
            return "case";
        }
        if (iOrdinal == 3) {
            return "variant";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
