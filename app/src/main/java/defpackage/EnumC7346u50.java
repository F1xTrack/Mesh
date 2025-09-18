package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7346u50 {
    public static final EnumC7346u50 a;
    public static final /* synthetic */ EnumC7346u50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7346u50 EF4;

    static {
        EnumC7346u50 enumC7346u50 = new EnumC7346u50("LONG", 0);
        EnumC7346u50 enumC7346u502 = new EnumC7346u50("SHORT", 1);
        EnumC7346u50 enumC7346u503 = new EnumC7346u50("NARROW", 2);
        EnumC7346u50 enumC7346u504 = new EnumC7346u50("UNDEFINED", 3);
        a = enumC7346u504;
        b = new EnumC7346u50[]{enumC7346u50, enumC7346u502, enumC7346u503, enumC7346u504};
    }

    public static EnumC7346u50 valueOf(String str) {
        return (EnumC7346u50) Enum.valueOf(EnumC7346u50.class, str);
    }

    public static EnumC7346u50[] values() {
        return (EnumC7346u50[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "long";
        }
        if (iOrdinal == 1) {
            return "short";
        }
        if (iOrdinal == 2) {
            return "narrow";
        }
        if (iOrdinal == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
