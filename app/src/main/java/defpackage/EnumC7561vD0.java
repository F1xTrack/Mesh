package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7561vD0 {
    public static final EnumC7561vD0 a;
    public static final EnumC7561vD0 b;
    public static final EnumC7561vD0 c;
    public static final EnumC7561vD0 d;
    public static final /* synthetic */ EnumC7561vD0[] e;

    static {
        EnumC7561vD0 enumC7561vD0 = new EnumC7561vD0("IMMEDIATE", 0);
        a = enumC7561vD0;
        EnumC7561vD0 enumC7561vD02 = new EnumC7561vD0("HIGH", 1);
        b = enumC7561vD02;
        EnumC7561vD0 enumC7561vD03 = new EnumC7561vD0("NORMAL", 2);
        c = enumC7561vD03;
        EnumC7561vD0 enumC7561vD04 = new EnumC7561vD0("LOW", 3);
        d = enumC7561vD04;
        e = new EnumC7561vD0[]{enumC7561vD0, enumC7561vD02, enumC7561vD03, enumC7561vD04};
    }

    public static EnumC7561vD0 valueOf(String str) {
        return (EnumC7561vD0) Enum.valueOf(EnumC7561vD0.class, str);
    }

    public static EnumC7561vD0[] values() {
        return (EnumC7561vD0[]) e.clone();
    }
}
