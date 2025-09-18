package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6964s50 {
    public static final EnumC6964s50 a;
    public static final /* synthetic */ EnumC6964s50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6964s50 EF5;

    static {
        EnumC6964s50 enumC6964s50 = new EnumC6964s50("FULL", 0);
        EnumC6964s50 enumC6964s502 = new EnumC6964s50("LONG", 1);
        EnumC6964s50 enumC6964s503 = new EnumC6964s50("MEDIUM", 2);
        EnumC6964s50 enumC6964s504 = new EnumC6964s50("SHORT", 3);
        EnumC6964s50 enumC6964s505 = new EnumC6964s50("UNDEFINED", 4);
        a = enumC6964s505;
        b = new EnumC6964s50[]{enumC6964s50, enumC6964s502, enumC6964s503, enumC6964s504, enumC6964s505};
    }

    public static EnumC6964s50 valueOf(String str) {
        return (EnumC6964s50) Enum.valueOf(EnumC6964s50.class, str);
    }

    public static EnumC6964s50[] values() {
        return (EnumC6964s50[]) b.clone();
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
