package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9837j50 {

    /* renamed from: a */
    public static final EnumC9837j50 f34909a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC9837j50[] f34910b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9837j50 EF5;

    static {
        EnumC9837j50 enumC9837j50 = new EnumC9837j50("FULL", 0);
        EnumC9837j50 enumC9837j502 = new EnumC9837j50("LONG", 1);
        EnumC9837j50 enumC9837j503 = new EnumC9837j50("MEDIUM", 2);
        EnumC9837j50 enumC9837j504 = new EnumC9837j50("SHORT", 3);
        EnumC9837j50 enumC9837j505 = new EnumC9837j50("UNDEFINED", 4);
        f34909a = enumC9837j505;
        f34910b = new EnumC9837j50[]{enumC9837j50, enumC9837j502, enumC9837j503, enumC9837j504, enumC9837j505};
    }

    public static EnumC9837j50 valueOf(String str) {
        return (EnumC9837j50) Enum.valueOf(EnumC9837j50.class, str);
    }

    public static EnumC9837j50[] values() {
        return (EnumC9837j50[]) f34910b.clone();
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
