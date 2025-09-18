package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ZH */
/* loaded from: classes2.dex */
public final class EnumC1591ZH {

    /* renamed from: a */
    public static final EnumC1591ZH f14842a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1591ZH[] f14843b;

    static {
        EnumC1591ZH enumC1591ZH = new EnumC1591ZH("WARNING", 0);
        EnumC1591ZH enumC1591ZH2 = new EnumC1591ZH("ERROR", 1);
        f14842a = enumC1591ZH2;
        EnumC1591ZH[] enumC1591ZHArr = {enumC1591ZH, enumC1591ZH2, new EnumC1591ZH("HIDDEN", 2)};
        f14843b = enumC1591ZHArr;
        F02.m2482c(enumC1591ZHArr);
    }

    public static EnumC1591ZH valueOf(String str) {
        return (EnumC1591ZH) Enum.valueOf(EnumC1591ZH.class, str);
    }

    public static EnumC1591ZH[] values() {
        return (EnumC1591ZH[]) f14843b.clone();
    }
}
