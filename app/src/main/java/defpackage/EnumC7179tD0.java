package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7179tD0 {
    public static final EnumC7179tD0 a;
    public static final EnumC7179tD0 b;
    public static final EnumC7179tD0 c;
    public static final /* synthetic */ EnumC7179tD0[] d;

    static {
        EnumC7179tD0 enumC7179tD0 = new EnumC7179tD0("LOW", 0);
        a = enumC7179tD0;
        EnumC7179tD0 enumC7179tD02 = new EnumC7179tD0("MEDIUM", 1);
        b = enumC7179tD02;
        EnumC7179tD0 enumC7179tD03 = new EnumC7179tD0("HIGH", 2);
        c = enumC7179tD03;
        d = new EnumC7179tD0[]{enumC7179tD0, enumC7179tD02, enumC7179tD03};
    }

    public static EnumC7179tD0 valueOf(String str) {
        return (EnumC7179tD0) Enum.valueOf(EnumC7179tD0.class, str);
    }

    public static EnumC7179tD0[] values() {
        return (EnumC7179tD0[]) d.clone();
    }
}
