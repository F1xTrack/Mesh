package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10093l50 {

    /* renamed from: a */
    public static final EnumC10093l50 f36885a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10093l50[] f36886b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10093l50 EF4;

    static {
        EnumC10093l50 enumC10093l50 = new EnumC10093l50("LONG", 0);
        EnumC10093l50 enumC10093l502 = new EnumC10093l50("SHORT", 1);
        EnumC10093l50 enumC10093l503 = new EnumC10093l50("NARROW", 2);
        EnumC10093l50 enumC10093l504 = new EnumC10093l50("UNDEFINED", 3);
        f36885a = enumC10093l504;
        f36886b = new EnumC10093l50[]{enumC10093l50, enumC10093l502, enumC10093l503, enumC10093l504};
    }

    public static EnumC10093l50 valueOf(String str) {
        return (EnumC10093l50) Enum.valueOf(EnumC10093l50.class, str);
    }

    public static EnumC10093l50[] values() {
        return (EnumC10093l50[]) f36886b.clone();
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
