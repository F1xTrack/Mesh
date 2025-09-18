package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2049a00 {
    public static final EnumC2049a00 a;
    public static final EnumC2049a00 b;
    public static final EnumC2049a00 c;
    public static final /* synthetic */ EnumC2049a00[] d;

    static {
        EnumC2049a00 enumC2049a00 = new EnumC2049a00(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        a = enumC2049a00;
        EnumC2049a00 enumC2049a002 = new EnumC2049a00("DEFAULT", 1);
        b = enumC2049a002;
        EnumC2049a00 enumC2049a003 = new EnumC2049a00("YUV", 2);
        c = enumC2049a003;
        d = new EnumC2049a00[]{enumC2049a00, enumC2049a002, enumC2049a003};
    }

    public static EnumC2049a00 valueOf(String str) {
        return (EnumC2049a00) Enum.valueOf(EnumC2049a00.class, str);
    }

    public static EnumC2049a00[] values() {
        return (EnumC2049a00[]) d.clone();
    }
}
