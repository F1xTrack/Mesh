package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11245u50 {

    /* renamed from: a */
    public static final EnumC11245u50 f43502a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC11245u50[] f43503b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11245u50 EF4;

    static {
        EnumC11245u50 enumC11245u50 = new EnumC11245u50("LONG", 0);
        EnumC11245u50 enumC11245u502 = new EnumC11245u50("SHORT", 1);
        EnumC11245u50 enumC11245u503 = new EnumC11245u50("NARROW", 2);
        EnumC11245u50 enumC11245u504 = new EnumC11245u50("UNDEFINED", 3);
        f43502a = enumC11245u504;
        f43503b = new EnumC11245u50[]{enumC11245u50, enumC11245u502, enumC11245u503, enumC11245u504};
    }

    public static EnumC11245u50 valueOf(String str) {
        return (EnumC11245u50) Enum.valueOf(EnumC11245u50.class, str);
    }

    public static EnumC11245u50[] values() {
        return (EnumC11245u50[]) f43503b.clone();
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
