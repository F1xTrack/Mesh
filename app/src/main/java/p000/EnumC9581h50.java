package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9581h50 {

    /* renamed from: a */
    public static final EnumC9581h50 f28243a;

    /* renamed from: b */
    public static final EnumC9581h50 f28244b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC9581h50[] f28245c;

    static {
        EnumC9581h50 enumC9581h50 = new EnumC9581h50("SORT", 0);
        f28243a = enumC9581h50;
        EnumC9581h50 enumC9581h502 = new EnumC9581h50("SEARCH", 1);
        f28244b = enumC9581h502;
        f28245c = new EnumC9581h50[]{enumC9581h50, enumC9581h502};
    }

    public static EnumC9581h50 valueOf(String str) {
        return (EnumC9581h50) Enum.valueOf(EnumC9581h50.class, str);
    }

    public static EnumC9581h50[] values() {
        return (EnumC9581h50[]) f28245c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "sort";
        }
        if (iOrdinal == 1) {
            return "search";
        }
        throw new IllegalArgumentException();
    }
}
