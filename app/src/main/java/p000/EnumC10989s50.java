package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10989s50 {

    /* renamed from: a */
    public static final EnumC10989s50 f42252a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10989s50[] f42253b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10989s50 EF5;

    static {
        EnumC10989s50 enumC10989s50 = new EnumC10989s50("FULL", 0);
        EnumC10989s50 enumC10989s502 = new EnumC10989s50("LONG", 1);
        EnumC10989s50 enumC10989s503 = new EnumC10989s50("MEDIUM", 2);
        EnumC10989s50 enumC10989s504 = new EnumC10989s50("SHORT", 3);
        EnumC10989s50 enumC10989s505 = new EnumC10989s50("UNDEFINED", 4);
        f42252a = enumC10989s505;
        f42253b = new EnumC10989s50[]{enumC10989s50, enumC10989s502, enumC10989s503, enumC10989s504, enumC10989s505};
    }

    public static EnumC10989s50 valueOf(String str) {
        return (EnumC10989s50) Enum.valueOf(EnumC10989s50.class, str);
    }

    public static EnumC10989s50[] values() {
        return (EnumC10989s50[]) f42253b.clone();
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
