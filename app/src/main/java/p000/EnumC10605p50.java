package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10605p50 {

    /* renamed from: a */
    public static final EnumC10605p50 f39829a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10605p50[] f39830b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10605p50 EF3;

    static {
        EnumC10605p50 enumC10605p50 = new EnumC10605p50("NUMERIC", 0);
        EnumC10605p50 enumC10605p502 = new EnumC10605p50("DIGIT2", 1);
        EnumC10605p50 enumC10605p503 = new EnumC10605p50("UNDEFINED", 2);
        f39829a = enumC10605p503;
        f39830b = new EnumC10605p50[]{enumC10605p50, enumC10605p502, enumC10605p503};
    }

    public static EnumC10605p50 valueOf(String str) {
        return (EnumC10605p50) Enum.valueOf(EnumC10605p50.class, str);
    }

    public static EnumC10605p50[] values() {
        return (EnumC10605p50[]) f39830b.clone();
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
            return "";
        }
        throw new IllegalArgumentException();
    }
}
