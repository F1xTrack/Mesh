package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8107Pg1 {

    /* renamed from: b */
    public static final EnumC8107Pg1 f9220b;

    /* renamed from: c */
    public static final EnumC8107Pg1 f9221c;

    /* renamed from: d */
    public static final EnumC8107Pg1 f9222d;

    /* renamed from: e */
    public static final EnumC8107Pg1 f9223e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC8107Pg1[] f9224f;

    /* renamed from: a */
    public final C8340Tt0 f9225a;

    static {
        EnumC8107Pg1 enumC8107Pg1 = new EnumC8107Pg1("UBYTEARRAY", 0, C0055As.m357e("kotlin/UByteArray", false));
        f9220b = enumC8107Pg1;
        EnumC8107Pg1 enumC8107Pg12 = new EnumC8107Pg1("USHORTARRAY", 1, C0055As.m357e("kotlin/UShortArray", false));
        f9221c = enumC8107Pg12;
        EnumC8107Pg1 enumC8107Pg13 = new EnumC8107Pg1("UINTARRAY", 2, C0055As.m357e("kotlin/UIntArray", false));
        f9222d = enumC8107Pg13;
        EnumC8107Pg1 enumC8107Pg14 = new EnumC8107Pg1("ULONGARRAY", 3, C0055As.m357e("kotlin/ULongArray", false));
        f9223e = enumC8107Pg14;
        EnumC8107Pg1[] enumC8107Pg1Arr = {enumC8107Pg1, enumC8107Pg12, enumC8107Pg13, enumC8107Pg14};
        f9224f = enumC8107Pg1Arr;
        F02.m2482c(enumC8107Pg1Arr);
    }

    public EnumC8107Pg1(String str, int i, C0055As c0055As) {
        C8340Tt0 c8340Tt0M365i = c0055As.m365i();
        O90.m5967e(c8340Tt0M365i, "getShortClassName(...)");
        this.f9225a = c8340Tt0M365i;
    }

    public static EnumC8107Pg1 valueOf(String str) {
        return (EnumC8107Pg1) Enum.valueOf(EnumC8107Pg1.class, str);
    }

    public static EnumC8107Pg1[] values() {
        return (EnumC8107Pg1[]) f9224f.clone();
    }
}
