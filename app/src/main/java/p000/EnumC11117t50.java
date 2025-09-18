package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11117t50 {

    /* renamed from: a */
    public static final EnumC11117t50 f42828a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC11117t50[] f42829b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11117t50 EF7;

    static {
        EnumC11117t50 enumC11117t50 = new EnumC11117t50("LONG", 0);
        EnumC11117t50 enumC11117t502 = new EnumC11117t50("LONGOFFSET", 1);
        EnumC11117t50 enumC11117t503 = new EnumC11117t50("LONGGENERIC", 2);
        EnumC11117t50 enumC11117t504 = new EnumC11117t50("SHORT", 3);
        EnumC11117t50 enumC11117t505 = new EnumC11117t50("SHORTOFFSET", 4);
        EnumC11117t50 enumC11117t506 = new EnumC11117t50("SHORTGENERIC", 5);
        EnumC11117t50 enumC11117t507 = new EnumC11117t50("UNDEFINED", 6);
        f42828a = enumC11117t507;
        f42829b = new EnumC11117t50[]{enumC11117t50, enumC11117t502, enumC11117t503, enumC11117t504, enumC11117t505, enumC11117t506, enumC11117t507};
    }

    public static EnumC11117t50 valueOf(String str) {
        return (EnumC11117t50) Enum.valueOf(EnumC11117t50.class, str);
    }

    public static EnumC11117t50[] values() {
        return (EnumC11117t50[]) f42829b.clone();
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
