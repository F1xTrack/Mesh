package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11881z50 {

    /* renamed from: a */
    public static final EnumC11881z50 f46630a;

    /* renamed from: b */
    public static final EnumC11881z50 f46631b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC11881z50[] f46632c;

    static {
        EnumC11881z50 enumC11881z50 = new EnumC11881z50("STANDARD", 0);
        f46630a = enumC11881z50;
        EnumC11881z50 enumC11881z502 = new EnumC11881z50("ACCOUNTING", 1);
        f46631b = enumC11881z502;
        f46632c = new EnumC11881z50[]{enumC11881z50, enumC11881z502};
    }

    public static EnumC11881z50 valueOf(String str) {
        return (EnumC11881z50) Enum.valueOf(EnumC11881z50.class, str);
    }

    public static EnumC11881z50[] values() {
        return (EnumC11881z50[]) f46632c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "accounting";
        }
        throw new IllegalArgumentException();
    }
}
