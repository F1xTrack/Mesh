package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: HU */
/* loaded from: classes.dex */
public final class EnumC0472HU {

    /* renamed from: a */
    public static final EnumC0472HU f4317a;

    /* renamed from: b */
    public static final EnumC0472HU f4318b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC0472HU[] f4319c;

    static {
        EnumC0472HU enumC0472HU = new EnumC0472HU("GRANTED", 0);
        f4317a = enumC0472HU;
        EnumC0472HU enumC0472HU2 = new EnumC0472HU("DENIED", 1);
        f4318b = enumC0472HU2;
        f4319c = new EnumC0472HU[]{enumC0472HU, enumC0472HU2};
    }

    public static EnumC0472HU valueOf(String str) {
        return (EnumC0472HU) Enum.valueOf(EnumC0472HU.class, str);
    }

    public static EnumC0472HU[] values() {
        return (EnumC0472HU[]) f4319c.clone();
    }
}
