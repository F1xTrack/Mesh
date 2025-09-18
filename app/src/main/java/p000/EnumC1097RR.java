package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: RR */
/* loaded from: classes2.dex */
public final class EnumC1097RR {

    /* renamed from: a */
    public static final EnumC1097RR f10175a;

    /* renamed from: b */
    public static final EnumC1097RR f10176b;

    /* renamed from: c */
    public static final EnumC1097RR f10177c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC1097RR[] f10178d;

    static {
        EnumC1097RR enumC1097RR = new EnumC1097RR("OVERRIDABLE", 0);
        f10175a = enumC1097RR;
        EnumC1097RR enumC1097RR2 = new EnumC1097RR("CONFLICT", 1);
        EnumC1097RR enumC1097RR3 = new EnumC1097RR("INCOMPATIBLE", 2);
        f10176b = enumC1097RR3;
        EnumC1097RR enumC1097RR4 = new EnumC1097RR(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        f10177c = enumC1097RR4;
        f10178d = new EnumC1097RR[]{enumC1097RR, enumC1097RR2, enumC1097RR3, enumC1097RR4};
    }

    public static EnumC1097RR valueOf(String str) {
        return (EnumC1097RR) Enum.valueOf(EnumC1097RR.class, str);
    }

    public static EnumC1097RR[] values() {
        return (EnumC1097RR[]) f10178d.clone();
    }
}
