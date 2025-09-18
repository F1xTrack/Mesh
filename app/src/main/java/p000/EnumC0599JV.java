package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: JV */
/* loaded from: classes.dex */
public final class EnumC0599JV {

    /* renamed from: a */
    public static final EnumC0599JV f5557a;

    /* renamed from: b */
    public static final EnumC0599JV f5558b;

    /* renamed from: c */
    public static final EnumC0599JV f5559c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC0599JV[] f5560d;

    static {
        EnumC0599JV enumC0599JV = new EnumC0599JV("WIDTH", 0);
        f5557a = enumC0599JV;
        EnumC0599JV enumC0599JV2 = new EnumC0599JV("HEIGHT", 1);
        f5558b = enumC0599JV2;
        EnumC0599JV enumC0599JV3 = new EnumC0599JV("BOTH", 2);
        f5559c = enumC0599JV3;
        f5560d = new EnumC0599JV[]{enumC0599JV, enumC0599JV2, enumC0599JV3};
    }

    public static EnumC0599JV valueOf(String str) {
        return (EnumC0599JV) Enum.valueOf(EnumC0599JV.class, str);
    }

    public static EnumC0599JV[] values() {
        return (EnumC0599JV[]) f5560d.clone();
    }
}
