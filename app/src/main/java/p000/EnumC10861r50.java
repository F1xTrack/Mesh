package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10861r50 {

    /* renamed from: a */
    public static final EnumC10861r50 f41333a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10861r50[] f41334b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10861r50 EF3;

    static {
        EnumC10861r50 enumC10861r50 = new EnumC10861r50("NUMERIC", 0);
        EnumC10861r50 enumC10861r502 = new EnumC10861r50("DIGIT2", 1);
        EnumC10861r50 enumC10861r503 = new EnumC10861r50("UNDEFINED", 2);
        f41333a = enumC10861r503;
        f41334b = new EnumC10861r50[]{enumC10861r50, enumC10861r502, enumC10861r503};
    }

    public static EnumC10861r50 valueOf(String str) {
        return (EnumC10861r50) Enum.valueOf(EnumC10861r50.class, str);
    }

    public static EnumC10861r50[] values() {
        return (EnumC10861r50[]) f41334b.clone();
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
