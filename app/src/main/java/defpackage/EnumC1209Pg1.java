package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1209Pg1 {
    public static final EnumC1209Pg1 b;
    public static final EnumC1209Pg1 c;
    public static final EnumC1209Pg1 d;
    public static final EnumC1209Pg1 e;
    public static final /* synthetic */ EnumC1209Pg1[] f;
    public final C1559Tt0 a;

    static {
        EnumC1209Pg1 enumC1209Pg1 = new EnumC1209Pg1("UBYTEARRAY", 0, C0074As.e("kotlin/UByteArray", false));
        b = enumC1209Pg1;
        EnumC1209Pg1 enumC1209Pg12 = new EnumC1209Pg1("USHORTARRAY", 1, C0074As.e("kotlin/UShortArray", false));
        c = enumC1209Pg12;
        EnumC1209Pg1 enumC1209Pg13 = new EnumC1209Pg1("UINTARRAY", 2, C0074As.e("kotlin/UIntArray", false));
        d = enumC1209Pg13;
        EnumC1209Pg1 enumC1209Pg14 = new EnumC1209Pg1("ULONGARRAY", 3, C0074As.e("kotlin/ULongArray", false));
        e = enumC1209Pg14;
        EnumC1209Pg1[] enumC1209Pg1Arr = {enumC1209Pg1, enumC1209Pg12, enumC1209Pg13, enumC1209Pg14};
        f = enumC1209Pg1Arr;
        F02.c(enumC1209Pg1Arr);
    }

    public EnumC1209Pg1(String str, int i, C0074As c0074As) {
        C1559Tt0 c1559Tt0I = c0074As.i();
        O90.e(c1559Tt0I, "getShortClassName(...)");
        this.a = c1559Tt0I;
    }

    public static EnumC1209Pg1 valueOf(String str) {
        return (EnumC1209Pg1) Enum.valueOf(EnumC1209Pg1.class, str);
    }

    public static EnumC1209Pg1[] values() {
        return (EnumC1209Pg1[]) f.clone();
    }
}
