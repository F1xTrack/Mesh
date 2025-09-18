package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7465uj {
    public static final EnumC7465uj a;
    public static final EnumC7465uj b;
    public static final /* synthetic */ EnumC7465uj[] c;

    static {
        EnumC7465uj enumC7465uj = new EnumC7465uj("ACTIVE", 0);
        a = enumC7465uj;
        EnumC7465uj enumC7465uj2 = new EnumC7465uj("INACTIVE", 1);
        b = enumC7465uj2;
        c = new EnumC7465uj[]{enumC7465uj, enumC7465uj2};
    }

    public static EnumC7465uj valueOf(String str) {
        return (EnumC7465uj) Enum.valueOf(EnumC7465uj.class, str);
    }

    public static EnumC7465uj[] values() {
        return (EnumC7465uj[]) c.clone();
    }
}
