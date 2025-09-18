package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3700f31 {
    public static final EnumC3700f31 a;
    public static final EnumC3700f31 b;
    public static final EnumC3700f31 c;
    public static final /* synthetic */ EnumC3700f31[] d;

    static {
        EnumC3700f31 enumC3700f31 = new EnumC3700f31("ONE_COLLECTION_PARAMETER", 0);
        a = enumC3700f31;
        EnumC3700f31 enumC3700f312 = new EnumC3700f31("OBJECT_PARAMETER_NON_GENERIC", 1);
        b = enumC3700f312;
        EnumC3700f31 enumC3700f313 = new EnumC3700f31("OBJECT_PARAMETER_GENERIC", 2);
        c = enumC3700f313;
        EnumC3700f31[] enumC3700f31Arr = {enumC3700f31, enumC3700f312, enumC3700f313};
        d = enumC3700f31Arr;
        F02.c(enumC3700f31Arr);
    }

    public static EnumC3700f31 valueOf(String str) {
        return (EnumC3700f31) Enum.valueOf(EnumC3700f31.class, str);
    }

    public static EnumC3700f31[] values() {
        return (EnumC3700f31[]) d.clone();
    }
}
