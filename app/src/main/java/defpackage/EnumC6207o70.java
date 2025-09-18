package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6207o70 {
    public static final EnumC6207o70 a;
    public static final EnumC6207o70 b;
    public static final EnumC6207o70 c;
    public static final /* synthetic */ EnumC6207o70[] d;

    static {
        EnumC6207o70 enumC6207o70 = new EnumC6207o70("SMALL", 0);
        a = enumC6207o70;
        EnumC6207o70 enumC6207o702 = new EnumC6207o70("DEFAULT", 1);
        b = enumC6207o702;
        EnumC6207o70 enumC6207o703 = new EnumC6207o70("DYNAMIC", 2);
        c = enumC6207o703;
        d = new EnumC6207o70[]{enumC6207o70, enumC6207o702, enumC6207o703};
    }

    public static EnumC6207o70 valueOf(String str) {
        return (EnumC6207o70) Enum.valueOf(EnumC6207o70.class, str);
    }

    public static EnumC6207o70[] values() {
        return (EnumC6207o70[]) d.clone();
    }
}
