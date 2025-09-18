package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5246j50 {
    public static final EnumC5246j50 a;
    public static final /* synthetic */ EnumC5246j50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5246j50 EF5;

    static {
        EnumC5246j50 enumC5246j50 = new EnumC5246j50("FULL", 0);
        EnumC5246j50 enumC5246j502 = new EnumC5246j50("LONG", 1);
        EnumC5246j50 enumC5246j503 = new EnumC5246j50("MEDIUM", 2);
        EnumC5246j50 enumC5246j504 = new EnumC5246j50("SHORT", 3);
        EnumC5246j50 enumC5246j505 = new EnumC5246j50("UNDEFINED", 4);
        a = enumC5246j505;
        b = new EnumC5246j50[]{enumC5246j50, enumC5246j502, enumC5246j503, enumC5246j504, enumC5246j505};
    }

    public static EnumC5246j50 valueOf(String str) {
        return (EnumC5246j50) Enum.valueOf(EnumC5246j50.class, str);
    }

    public static EnumC5246j50[] values() {
        return (EnumC5246j50[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "full";
        }
        if (iOrdinal == 1) {
            return "long";
        }
        if (iOrdinal == 2) {
            return "medium";
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
