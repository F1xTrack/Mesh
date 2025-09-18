package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Qg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8159Qg1 {

    /* renamed from: d */
    public static final /* synthetic */ EnumC8159Qg1[] f9726d;

    /* renamed from: a */
    public final C0055As f9727a;

    /* renamed from: b */
    public final C8340Tt0 f9728b;

    /* renamed from: c */
    public final C0055As f9729c;

    static {
        EnumC8159Qg1[] enumC8159Qg1Arr = {new EnumC8159Qg1("UBYTE", 0, C0055As.m357e("kotlin/UByte", false)), new EnumC8159Qg1("USHORT", 1, C0055As.m357e("kotlin/UShort", false)), new EnumC8159Qg1("UINT", 2, C0055As.m357e("kotlin/UInt", false)), new EnumC8159Qg1("ULONG", 3, C0055As.m357e("kotlin/ULong", false))};
        f9726d = enumC8159Qg1Arr;
        F02.m2482c(enumC8159Qg1Arr);
    }

    public EnumC8159Qg1(String str, int i, C0055As c0055As) {
        this.f9727a = c0055As;
        C8340Tt0 c8340Tt0M365i = c0055As.m365i();
        O90.m5967e(c8340Tt0M365i, "getShortClassName(...)");
        this.f9728b = c8340Tt0M365i;
        this.f9729c = new C0055As(c0055As.m363g(), C8340Tt0.m7798e(c8340Tt0M365i.m7801b() + "Array"));
    }

    public static EnumC8159Qg1 valueOf(String str) {
        return (EnumC8159Qg1) Enum.valueOf(EnumC8159Qg1.class, str);
    }

    public static EnumC8159Qg1[] values() {
        return (EnumC8159Qg1[]) f9726d.clone();
    }
}
