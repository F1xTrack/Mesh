package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11754y50 {

    /* renamed from: a */
    public static final EnumC11754y50 f46084a;

    /* renamed from: b */
    public static final EnumC11754y50 f46085b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC11754y50[] f46086c;

    static {
        EnumC11754y50 enumC11754y50 = new EnumC11754y50("SYMBOL", 0);
        f46084a = enumC11754y50;
        EnumC11754y50 enumC11754y502 = new EnumC11754y50("NARROWSYMBOL", 1);
        EnumC11754y50 enumC11754y503 = new EnumC11754y50("CODE", 2);
        f46085b = enumC11754y503;
        f46086c = new EnumC11754y50[]{enumC11754y50, enumC11754y502, enumC11754y503, new EnumC11754y50("NAME", 3)};
    }

    public static EnumC11754y50 valueOf(String str) {
        return (EnumC11754y50) Enum.valueOf(EnumC11754y50.class, str);
    }

    public static EnumC11754y50[] values() {
        return (EnumC11754y50[]) f46086c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "symbol";
        }
        if (iOrdinal == 1) {
            return "narrowSymbol";
        }
        if (iOrdinal == 2) {
            return "code";
        }
        if (iOrdinal == 3) {
            return "name";
        }
        throw new IllegalArgumentException();
    }
}
