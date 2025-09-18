package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: IU */
/* loaded from: classes.dex */
public final class EnumC0535IU {

    /* renamed from: a */
    public static final EnumC0535IU f4949a;

    /* renamed from: b */
    public static final EnumC0535IU f4950b;

    /* renamed from: c */
    public static final EnumC0535IU f4951c;

    /* renamed from: d */
    public static final EnumC0535IU f4952d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC0535IU[] f4953e;

    static {
        EnumC0535IU enumC0535IU = new EnumC0535IU("AD_STORAGE", 0);
        f4949a = enumC0535IU;
        EnumC0535IU enumC0535IU2 = new EnumC0535IU("ANALYTICS_STORAGE", 1);
        f4950b = enumC0535IU2;
        EnumC0535IU enumC0535IU3 = new EnumC0535IU("AD_USER_DATA", 2);
        f4951c = enumC0535IU3;
        EnumC0535IU enumC0535IU4 = new EnumC0535IU("AD_PERSONALIZATION", 3);
        f4952d = enumC0535IU4;
        f4953e = new EnumC0535IU[]{enumC0535IU, enumC0535IU2, enumC0535IU3, enumC0535IU4};
    }

    public static EnumC0535IU valueOf(String str) {
        return (EnumC0535IU) Enum.valueOf(EnumC0535IU.class, str);
    }

    public static EnumC0535IU[] values() {
        return (EnumC0535IU[]) f4953e.clone();
    }
}
