package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11627x50 {

    /* renamed from: a */
    public static final EnumC11627x50 f45364a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC11627x50[] f45365b;

    static {
        EnumC11627x50 enumC11627x50 = new EnumC11627x50("SHORT", 0);
        f45364a = enumC11627x50;
        f45365b = new EnumC11627x50[]{enumC11627x50, new EnumC11627x50("LONG", 1)};
    }

    public static EnumC11627x50 valueOf(String str) {
        return (EnumC11627x50) Enum.valueOf(EnumC11627x50.class, str);
    }

    public static EnumC11627x50[] values() {
        return (EnumC11627x50[]) f45365b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return "long";
        }
        throw new IllegalArgumentException();
    }
}
