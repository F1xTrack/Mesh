package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9453g50 {

    /* renamed from: a */
    public static final EnumC9453g50 f27554a;

    /* renamed from: b */
    public static final EnumC9453g50 f27555b;

    /* renamed from: c */
    public static final EnumC9453g50 f27556c;

    /* renamed from: d */
    public static final EnumC9453g50 f27557d;

    /* renamed from: e */
    public static final EnumC9453g50 f27558e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC9453g50[] f27559f;

    static {
        EnumC9453g50 enumC9453g50 = new EnumC9453g50("BASE", 0);
        f27554a = enumC9453g50;
        EnumC9453g50 enumC9453g502 = new EnumC9453g50("ACCENT", 1);
        f27555b = enumC9453g502;
        EnumC9453g50 enumC9453g503 = new EnumC9453g50("CASE", 2);
        f27556c = enumC9453g503;
        EnumC9453g50 enumC9453g504 = new EnumC9453g50("VARIANT", 3);
        f27557d = enumC9453g504;
        EnumC9453g50 enumC9453g505 = new EnumC9453g50("LOCALE", 4);
        f27558e = enumC9453g505;
        f27559f = new EnumC9453g50[]{enumC9453g50, enumC9453g502, enumC9453g503, enumC9453g504, enumC9453g505};
    }

    public static EnumC9453g50 valueOf(String str) {
        return (EnumC9453g50) Enum.valueOf(EnumC9453g50.class, str);
    }

    public static EnumC9453g50[] values() {
        return (EnumC9453g50[]) f27559f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "base";
        }
        if (iOrdinal == 1) {
            return "accent";
        }
        if (iOrdinal == 2) {
            return "case";
        }
        if (iOrdinal == 3) {
            return "variant";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
