package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rn */
/* loaded from: classes.dex */
public final class EnumC6765rn {

    /* renamed from: a */
    public static final EnumC6765rn f41898a;

    /* renamed from: b */
    public static final EnumC6765rn f41899b;

    /* renamed from: c */
    public static final EnumC6765rn f41900c;

    /* renamed from: d */
    public static final EnumC6765rn f41901d;

    /* renamed from: e */
    public static final EnumC6765rn f41902e;

    /* renamed from: f */
    public static final EnumC6765rn f41903f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC6765rn[] f41904g;

    static {
        EnumC6765rn enumC6765rn = new EnumC6765rn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f41898a = enumC6765rn;
        EnumC6765rn enumC6765rn2 = new EnumC6765rn("INACTIVE", 1);
        f41899b = enumC6765rn2;
        EnumC6765rn enumC6765rn3 = new EnumC6765rn("SEARCHING", 2);
        f41900c = enumC6765rn3;
        EnumC6765rn enumC6765rn4 = new EnumC6765rn("FLASH_REQUIRED", 3);
        f41901d = enumC6765rn4;
        EnumC6765rn enumC6765rn5 = new EnumC6765rn("CONVERGED", 4);
        f41902e = enumC6765rn5;
        EnumC6765rn enumC6765rn6 = new EnumC6765rn("LOCKED", 5);
        f41903f = enumC6765rn6;
        f41904g = new EnumC6765rn[]{enumC6765rn, enumC6765rn2, enumC6765rn3, enumC6765rn4, enumC6765rn5, enumC6765rn6};
    }

    public static EnumC6765rn valueOf(String str) {
        return (EnumC6765rn) Enum.valueOf(EnumC6765rn.class, str);
    }

    public static EnumC6765rn[] values() {
        return (EnumC6765rn[]) f41904g.clone();
    }
}
