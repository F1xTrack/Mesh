package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Df0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7480Df0 {

    /* renamed from: a */
    public static final EnumC7480Df0 f2133a;

    /* renamed from: b */
    public static final EnumC7480Df0 f2134b;

    /* renamed from: c */
    public static final EnumC7480Df0 f2135c;

    /* renamed from: d */
    public static final EnumC7480Df0 f2136d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC7480Df0[] f2137e;

    static {
        EnumC7480Df0 enumC7480Df0 = new EnumC7480Df0("PUBLIC", 0);
        f2133a = enumC7480Df0;
        EnumC7480Df0 enumC7480Df02 = new EnumC7480Df0("PROTECTED", 1);
        f2134b = enumC7480Df02;
        EnumC7480Df0 enumC7480Df03 = new EnumC7480Df0("INTERNAL", 2);
        f2135c = enumC7480Df03;
        EnumC7480Df0 enumC7480Df04 = new EnumC7480Df0("PRIVATE", 3);
        f2136d = enumC7480Df04;
        EnumC7480Df0[] enumC7480Df0Arr = {enumC7480Df0, enumC7480Df02, enumC7480Df03, enumC7480Df04};
        f2137e = enumC7480Df0Arr;
        F02.m2482c(enumC7480Df0Arr);
    }

    public static EnumC7480Df0 valueOf(String str) {
        return (EnumC7480Df0) Enum.valueOf(EnumC7480Df0.class, str);
    }

    public static EnumC7480Df0[] values() {
        return (EnumC7480Df0[]) f2137e.clone();
    }
}
