package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8666a00 {

    /* renamed from: a */
    public static final EnumC8666a00 f15275a;

    /* renamed from: b */
    public static final EnumC8666a00 f15276b;

    /* renamed from: c */
    public static final EnumC8666a00 f15277c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC8666a00[] f15278d;

    static {
        EnumC8666a00 enumC8666a00 = new EnumC8666a00(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f15275a = enumC8666a00;
        EnumC8666a00 enumC8666a002 = new EnumC8666a00("DEFAULT", 1);
        f15276b = enumC8666a002;
        EnumC8666a00 enumC8666a003 = new EnumC8666a00("YUV", 2);
        f15277c = enumC8666a003;
        f15278d = new EnumC8666a00[]{enumC8666a00, enumC8666a002, enumC8666a003};
    }

    public static EnumC8666a00 valueOf(String str) {
        return (EnumC8666a00) Enum.valueOf(EnumC8666a00.class, str);
    }

    public static EnumC8666a00[] values() {
        return (EnumC8666a00[]) f15278d.clone();
    }
}
