package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: XC */
/* loaded from: classes.dex */
public final class EnumC1460XC {

    /* renamed from: a */
    public static final EnumC1460XC f13614a;

    /* renamed from: b */
    public static final EnumC1460XC f13615b;

    /* renamed from: c */
    public static final EnumC1460XC f13616c;

    /* renamed from: d */
    public static final EnumC1460XC f13617d;

    /* renamed from: e */
    public static final EnumC1460XC f13618e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC1460XC[] f13619f;

    static {
        EnumC1460XC enumC1460XC = new EnumC1460XC("LOCAL", 0);
        f13614a = enumC1460XC;
        EnumC1460XC enumC1460XC2 = new EnumC1460XC(Core.NotificationType.REMOTE, 1);
        f13615b = enumC1460XC2;
        EnumC1460XC enumC1460XC3 = new EnumC1460XC("DATA_DISK_CACHE", 2);
        f13616c = enumC1460XC3;
        EnumC1460XC enumC1460XC4 = new EnumC1460XC("RESOURCE_DISK_CACHE", 3);
        f13617d = enumC1460XC4;
        EnumC1460XC enumC1460XC5 = new EnumC1460XC("MEMORY_CACHE", 4);
        f13618e = enumC1460XC5;
        f13619f = new EnumC1460XC[]{enumC1460XC, enumC1460XC2, enumC1460XC3, enumC1460XC4, enumC1460XC5};
    }

    public static EnumC1460XC valueOf(String str) {
        return (EnumC1460XC) Enum.valueOf(EnumC1460XC.class, str);
    }

    public static EnumC1460XC[] values() {
        return (EnumC1460XC[]) f13619f.clone();
    }
}
