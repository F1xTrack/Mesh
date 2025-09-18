package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6583q50 {
    public static final EnumC6583q50 a;
    public static final /* synthetic */ EnumC6583q50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6583q50 EF6;

    static {
        EnumC6583q50 enumC6583q50 = new EnumC6583q50("NUMERIC", 0);
        EnumC6583q50 enumC6583q502 = new EnumC6583q50("DIGIT2", 1);
        EnumC6583q50 enumC6583q503 = new EnumC6583q50("LONG", 2);
        EnumC6583q50 enumC6583q504 = new EnumC6583q50("SHORT", 3);
        EnumC6583q50 enumC6583q505 = new EnumC6583q50("NARROW", 4);
        EnumC6583q50 enumC6583q506 = new EnumC6583q50("UNDEFINED", 5);
        a = enumC6583q506;
        b = new EnumC6583q50[]{enumC6583q50, enumC6583q502, enumC6583q503, enumC6583q504, enumC6583q505, enumC6583q506};
    }

    public static EnumC6583q50 valueOf(String str) {
        return (EnumC6583q50) Enum.valueOf(EnumC6583q50.class, str);
    }

    public static EnumC6583q50[] values() {
        return (EnumC6583q50[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "numeric";
        }
        if (iOrdinal == 1) {
            return "2-digit";
        }
        if (iOrdinal == 2) {
            return "long";
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "narrow";
        }
        if (iOrdinal == 5) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
