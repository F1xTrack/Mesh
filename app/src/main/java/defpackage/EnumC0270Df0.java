package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Df0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0270Df0 {
    public static final EnumC0270Df0 a;
    public static final EnumC0270Df0 b;
    public static final EnumC0270Df0 c;
    public static final EnumC0270Df0 d;
    public static final /* synthetic */ EnumC0270Df0[] e;

    static {
        EnumC0270Df0 enumC0270Df0 = new EnumC0270Df0("PUBLIC", 0);
        a = enumC0270Df0;
        EnumC0270Df0 enumC0270Df02 = new EnumC0270Df0("PROTECTED", 1);
        b = enumC0270Df02;
        EnumC0270Df0 enumC0270Df03 = new EnumC0270Df0("INTERNAL", 2);
        c = enumC0270Df03;
        EnumC0270Df0 enumC0270Df04 = new EnumC0270Df0("PRIVATE", 3);
        d = enumC0270Df04;
        EnumC0270Df0[] enumC0270Df0Arr = {enumC0270Df0, enumC0270Df02, enumC0270Df03, enumC0270Df04};
        e = enumC0270Df0Arr;
        F02.c(enumC0270Df0Arr);
    }

    public static EnumC0270Df0 valueOf(String str) {
        return (EnumC0270Df0) Enum.valueOf(EnumC0270Df0.class, str);
    }

    public static EnumC0270Df0[] values() {
        return (EnumC0270Df0[]) e.clone();
    }
}
