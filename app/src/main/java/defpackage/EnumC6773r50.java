package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6773r50 {
    public static final EnumC6773r50 a;
    public static final /* synthetic */ EnumC6773r50[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6773r50 EF3;

    static {
        EnumC6773r50 enumC6773r50 = new EnumC6773r50("NUMERIC", 0);
        EnumC6773r50 enumC6773r502 = new EnumC6773r50("DIGIT2", 1);
        EnumC6773r50 enumC6773r503 = new EnumC6773r50("UNDEFINED", 2);
        a = enumC6773r503;
        b = new EnumC6773r50[]{enumC6773r50, enumC6773r502, enumC6773r503};
    }

    public static EnumC6773r50 valueOf(String str) {
        return (EnumC6773r50) Enum.valueOf(EnumC6773r50.class, str);
    }

    public static EnumC6773r50[] values() {
        return (EnumC6773r50[]) b.clone();
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
