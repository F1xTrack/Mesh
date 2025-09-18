package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7917x50 {
    public static final EnumC7917x50 a;
    public static final /* synthetic */ EnumC7917x50[] b;

    static {
        EnumC7917x50 enumC7917x50 = new EnumC7917x50("SHORT", 0);
        a = enumC7917x50;
        b = new EnumC7917x50[]{enumC7917x50, new EnumC7917x50("LONG", 1)};
    }

    public static EnumC7917x50 valueOf(String str) {
        return (EnumC7917x50) Enum.valueOf(EnumC7917x50.class, str);
    }

    public static EnumC7917x50[] values() {
        return (EnumC7917x50[]) b.clone();
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
