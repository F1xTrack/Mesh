package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10481o70 {

    /* renamed from: a */
    public static final EnumC10481o70 f38818a;

    /* renamed from: b */
    public static final EnumC10481o70 f38819b;

    /* renamed from: c */
    public static final EnumC10481o70 f38820c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC10481o70[] f38821d;

    static {
        EnumC10481o70 enumC10481o70 = new EnumC10481o70("SMALL", 0);
        f38818a = enumC10481o70;
        EnumC10481o70 enumC10481o702 = new EnumC10481o70("DEFAULT", 1);
        f38819b = enumC10481o702;
        EnumC10481o70 enumC10481o703 = new EnumC10481o70("DYNAMIC", 2);
        f38820c = enumC10481o703;
        f38821d = new EnumC10481o70[]{enumC10481o70, enumC10481o702, enumC10481o703};
    }

    public static EnumC10481o70 valueOf(String str) {
        return (EnumC10481o70) Enum.valueOf(EnumC10481o70.class, str);
    }

    public static EnumC10481o70[] values() {
        return (EnumC10481o70[]) f38821d.clone();
    }
}
