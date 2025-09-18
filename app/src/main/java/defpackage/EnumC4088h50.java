package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4088h50 {
    public static final EnumC4088h50 a;
    public static final EnumC4088h50 b;
    public static final /* synthetic */ EnumC4088h50[] c;

    static {
        EnumC4088h50 enumC4088h50 = new EnumC4088h50("SORT", 0);
        a = enumC4088h50;
        EnumC4088h50 enumC4088h502 = new EnumC4088h50("SEARCH", 1);
        b = enumC4088h502;
        c = new EnumC4088h50[]{enumC4088h50, enumC4088h502};
    }

    public static EnumC4088h50 valueOf(String str) {
        return (EnumC4088h50) Enum.valueOf(EnumC4088h50.class, str);
    }

    public static EnumC4088h50[] values() {
        return (EnumC4088h50[]) c.clone();
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
