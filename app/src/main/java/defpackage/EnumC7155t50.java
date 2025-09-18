package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7155t50 {
    public static final EnumC7155t50 a;
    public static final /* synthetic */ EnumC7155t50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7155t50 EF7;

    static {
        EnumC7155t50 enumC7155t50 = new EnumC7155t50("LONG", 0);
        EnumC7155t50 enumC7155t502 = new EnumC7155t50("LONGOFFSET", 1);
        EnumC7155t50 enumC7155t503 = new EnumC7155t50("LONGGENERIC", 2);
        EnumC7155t50 enumC7155t504 = new EnumC7155t50("SHORT", 3);
        EnumC7155t50 enumC7155t505 = new EnumC7155t50("SHORTOFFSET", 4);
        EnumC7155t50 enumC7155t506 = new EnumC7155t50("SHORTGENERIC", 5);
        EnumC7155t50 enumC7155t507 = new EnumC7155t50("UNDEFINED", 6);
        a = enumC7155t507;
        b = new EnumC7155t50[]{enumC7155t50, enumC7155t502, enumC7155t503, enumC7155t504, enumC7155t505, enumC7155t506, enumC7155t507};
    }

    public static EnumC7155t50 valueOf(String str) {
        return (EnumC7155t50) Enum.valueOf(EnumC7155t50.class, str);
    }

    public static EnumC7155t50[] values() {
        return (EnumC7155t50[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 0:
                return "long";
            case 1:
                return "longOffset";
            case 2:
                return "longGeneric";
            case 3:
                return "short";
            case 4:
                return "shortOffset";
            case 5:
                return "shortGeneric";
            case 6:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }
}
