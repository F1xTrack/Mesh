package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10733q50 {

    /* renamed from: a */
    public static final EnumC10733q50 f40594a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10733q50[] f40595b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10733q50 EF6;

    static {
        EnumC10733q50 enumC10733q50 = new EnumC10733q50("NUMERIC", 0);
        EnumC10733q50 enumC10733q502 = new EnumC10733q50("DIGIT2", 1);
        EnumC10733q50 enumC10733q503 = new EnumC10733q50("LONG", 2);
        EnumC10733q50 enumC10733q504 = new EnumC10733q50("SHORT", 3);
        EnumC10733q50 enumC10733q505 = new EnumC10733q50("NARROW", 4);
        EnumC10733q50 enumC10733q506 = new EnumC10733q50("UNDEFINED", 5);
        f40594a = enumC10733q506;
        f40595b = new EnumC10733q50[]{enumC10733q50, enumC10733q502, enumC10733q503, enumC10733q504, enumC10733q505, enumC10733q506};
    }

    public static EnumC10733q50 valueOf(String str) {
        return (EnumC10733q50) Enum.valueOf(EnumC10733q50.class, str);
    }

    public static EnumC10733q50[] values() {
        return (EnumC10733q50[]) f40595b.clone();
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
