package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5628l50 {
    public static final EnumC5628l50 a;
    public static final /* synthetic */ EnumC5628l50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5628l50 EF4;

    static {
        EnumC5628l50 enumC5628l50 = new EnumC5628l50("LONG", 0);
        EnumC5628l50 enumC5628l502 = new EnumC5628l50("SHORT", 1);
        EnumC5628l50 enumC5628l503 = new EnumC5628l50("NARROW", 2);
        EnumC5628l50 enumC5628l504 = new EnumC5628l50("UNDEFINED", 3);
        a = enumC5628l504;
        b = new EnumC5628l50[]{enumC5628l50, enumC5628l502, enumC5628l503, enumC5628l504};
    }

    public static EnumC5628l50 valueOf(String str) {
        return (EnumC5628l50) Enum.valueOf(EnumC5628l50.class, str);
    }

    public static EnumC5628l50[] values() {
        return (EnumC5628l50[]) b.clone();
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
