package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Jp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0769Jp1 {
    public static final EnumC0769Jp1 a;
    public static final EnumC0769Jp1 b;
    public static final EnumC0769Jp1 c;
    public static final /* synthetic */ EnumC0769Jp1[] d;

    static {
        EnumC0769Jp1 enumC0769Jp1 = new EnumC0769Jp1("UNDEFINED", 0);
        a = enumC0769Jp1;
        EnumC0769Jp1 enumC0769Jp12 = new EnumC0769Jp1("EXACTLY", 1);
        b = enumC0769Jp12;
        EnumC0769Jp1 enumC0769Jp13 = new EnumC0769Jp1("AT_MOST", 2);
        c = enumC0769Jp13;
        d = new EnumC0769Jp1[]{enumC0769Jp1, enumC0769Jp12, enumC0769Jp13};
    }

    public static EnumC0769Jp1 a(int i) {
        if (i == 0) {
            return a;
        }
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unknown enum value: "));
    }

    public static EnumC0769Jp1 valueOf(String str) {
        return (EnumC0769Jp1) Enum.valueOf(EnumC0769Jp1.class, str);
    }

    public static EnumC0769Jp1[] values() {
        return (EnumC0769Jp1[]) d.clone();
    }
}
