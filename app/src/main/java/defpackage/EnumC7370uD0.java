package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7370uD0 {
    public static final EnumC7370uD0 a;
    public static final EnumC7370uD0 b;
    public static final EnumC7370uD0 c;
    public static final /* synthetic */ EnumC7370uD0[] d;

    static {
        EnumC7370uD0 enumC7370uD0 = new EnumC7370uD0("DEFAULT", 0);
        a = enumC7370uD0;
        EnumC7370uD0 enumC7370uD02 = new EnumC7370uD0("VERY_LOW", 1);
        b = enumC7370uD02;
        EnumC7370uD0 enumC7370uD03 = new EnumC7370uD0("HIGHEST", 2);
        c = enumC7370uD03;
        d = new EnumC7370uD0[]{enumC7370uD0, enumC7370uD02, enumC7370uD03};
    }

    public static EnumC7370uD0 valueOf(String str) {
        return (EnumC7370uD0) Enum.valueOf(EnumC7370uD0.class, str);
    }

    public static EnumC7370uD0[] values() {
        return (EnumC7370uD0[]) d.clone();
    }
}
