package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9965k50 {

    /* renamed from: a */
    public static final EnumC9965k50 f36289a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC9965k50[] f36290b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9965k50 EF3;

    static {
        EnumC9965k50 enumC9965k50 = new EnumC9965k50("NUMERIC", 0);
        EnumC9965k50 enumC9965k502 = new EnumC9965k50("DIGIT2", 1);
        EnumC9965k50 enumC9965k503 = new EnumC9965k50("UNDEFINED", 2);
        f36289a = enumC9965k503;
        f36290b = new EnumC9965k50[]{enumC9965k50, enumC9965k502, enumC9965k503};
    }

    public static EnumC9965k50 valueOf(String str) {
        return (EnumC9965k50) Enum.valueOf(EnumC9965k50.class, str);
    }

    public static EnumC9965k50[] values() {
        return (EnumC9965k50[]) f36290b.clone();
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
