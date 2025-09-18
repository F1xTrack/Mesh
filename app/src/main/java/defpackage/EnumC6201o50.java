package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6201o50 {
    public static final EnumC6201o50 a;
    public static final EnumC6201o50 b;
    public static final EnumC6201o50 c;
    public static final EnumC6201o50 d;
    public static final EnumC6201o50 e;
    public static final /* synthetic */ EnumC6201o50[] f;

    static {
        EnumC6201o50 enumC6201o50 = new EnumC6201o50("H11", 0);
        a = enumC6201o50;
        EnumC6201o50 enumC6201o502 = new EnumC6201o50("H12", 1);
        b = enumC6201o502;
        EnumC6201o50 enumC6201o503 = new EnumC6201o50("H23", 2);
        c = enumC6201o503;
        EnumC6201o50 enumC6201o504 = new EnumC6201o50("H24", 3);
        d = enumC6201o504;
        EnumC6201o50 enumC6201o505 = new EnumC6201o50("UNDEFINED", 4);
        e = enumC6201o505;
        f = new EnumC6201o50[]{enumC6201o50, enumC6201o502, enumC6201o503, enumC6201o504, enumC6201o505};
    }

    public static EnumC6201o50 valueOf(String str) {
        return (EnumC6201o50) Enum.valueOf(EnumC6201o50.class, str);
    }

    public static EnumC6201o50[] values() {
        return (EnumC6201o50[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "h11";
        }
        if (iOrdinal == 1) {
            return "h12";
        }
        if (iOrdinal == 2) {
            return "h23";
        }
        if (iOrdinal == 3) {
            return "h24";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
