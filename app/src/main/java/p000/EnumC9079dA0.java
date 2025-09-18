package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC9079dA0 {

    /* renamed from: a */
    public static final EnumC9079dA0 f25849a;

    /* renamed from: b */
    public static final EnumC9079dA0 f25850b;

    /* renamed from: c */
    public static final EnumC9079dA0 f25851c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC9079dA0[] f25852d;

    static {
        EnumC9079dA0 enumC9079dA0 = new EnumC9079dA0("ALL", 0);
        f25849a = enumC9079dA0;
        EnumC9079dA0 enumC9079dA02 = new EnumC9079dA0("ONLY_NON_SYNTHESIZED", 1);
        f25850b = enumC9079dA02;
        EnumC9079dA0 enumC9079dA03 = new EnumC9079dA0("NONE", 2);
        f25851c = enumC9079dA03;
        EnumC9079dA0[] enumC9079dA0Arr = {enumC9079dA0, enumC9079dA02, enumC9079dA03};
        f25852d = enumC9079dA0Arr;
        F02.m2482c(enumC9079dA0Arr);
    }

    public static EnumC9079dA0 valueOf(String str) {
        return (EnumC9079dA0) Enum.valueOf(EnumC9079dA0.class, str);
    }

    public static EnumC9079dA0[] values() {
        return (EnumC9079dA0[]) f25852d.clone();
    }
}
