package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC9321f31 {

    /* renamed from: a */
    public static final EnumC9321f31 f27025a;

    /* renamed from: b */
    public static final EnumC9321f31 f27026b;

    /* renamed from: c */
    public static final EnumC9321f31 f27027c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC9321f31[] f27028d;

    static {
        EnumC9321f31 enumC9321f31 = new EnumC9321f31("ONE_COLLECTION_PARAMETER", 0);
        f27025a = enumC9321f31;
        EnumC9321f31 enumC9321f312 = new EnumC9321f31("OBJECT_PARAMETER_NON_GENERIC", 1);
        f27026b = enumC9321f312;
        EnumC9321f31 enumC9321f313 = new EnumC9321f31("OBJECT_PARAMETER_GENERIC", 2);
        f27027c = enumC9321f313;
        EnumC9321f31[] enumC9321f31Arr = {enumC9321f31, enumC9321f312, enumC9321f313};
        f27028d = enumC9321f31Arr;
        F02.m2482c(enumC9321f31Arr);
    }

    public static EnumC9321f31 valueOf(String str) {
        return (EnumC9321f31) Enum.valueOf(EnumC9321f31.class, str);
    }

    public static EnumC9321f31[] values() {
        return (EnumC9321f31[]) f27028d.clone();
    }
}
