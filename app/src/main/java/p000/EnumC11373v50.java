package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11373v50 {

    /* renamed from: a */
    public static final EnumC11373v50 f44143a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC11373v50[] f44144b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11373v50 EF3;

    static {
        EnumC11373v50 enumC11373v50 = new EnumC11373v50("NUMERIC", 0);
        EnumC11373v50 enumC11373v502 = new EnumC11373v50("DIGIT2", 1);
        EnumC11373v50 enumC11373v503 = new EnumC11373v50("UNDEFINED", 2);
        f44143a = enumC11373v503;
        f44144b = new EnumC11373v50[]{enumC11373v50, enumC11373v502, enumC11373v503};
    }

    public static EnumC11373v50 valueOf(String str) {
        return (EnumC11373v50) Enum.valueOf(EnumC11373v50.class, str);
    }

    public static EnumC11373v50[] values() {
        return (EnumC11373v50[]) f44144b.clone();
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
