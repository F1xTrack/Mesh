package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Qg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1287Qg1 {
    public static final /* synthetic */ EnumC1287Qg1[] d;
    public final C0074As a;
    public final C1559Tt0 b;
    public final C0074As c;

    static {
        EnumC1287Qg1[] enumC1287Qg1Arr = {new EnumC1287Qg1("UBYTE", 0, C0074As.e("kotlin/UByte", false)), new EnumC1287Qg1("USHORT", 1, C0074As.e("kotlin/UShort", false)), new EnumC1287Qg1("UINT", 2, C0074As.e("kotlin/UInt", false)), new EnumC1287Qg1("ULONG", 3, C0074As.e("kotlin/ULong", false))};
        d = enumC1287Qg1Arr;
        F02.c(enumC1287Qg1Arr);
    }

    public EnumC1287Qg1(String str, int i, C0074As c0074As) {
        this.a = c0074As;
        C1559Tt0 c1559Tt0I = c0074As.i();
        O90.e(c1559Tt0I, "getShortClassName(...)");
        this.b = c1559Tt0I;
        this.c = new C0074As(c0074As.g(), C1559Tt0.e(c1559Tt0I.b() + "Array"));
    }

    public static EnumC1287Qg1 valueOf(String str) {
        return (EnumC1287Qg1) Enum.valueOf(EnumC1287Qg1.class, str);
    }

    public static EnumC1287Qg1[] values() {
        return (EnumC1287Qg1[]) d.clone();
    }
}
