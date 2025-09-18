package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Dw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7514Dw0 {

    /* renamed from: a */
    public static final EnumC7514Dw0 f2322a;

    /* renamed from: b */
    public static final EnumC7514Dw0 f2323b;

    /* renamed from: c */
    public static final EnumC7514Dw0 f2324c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC7514Dw0[] f2325d;

    static {
        EnumC7514Dw0 enumC7514Dw0 = new EnumC7514Dw0("FORCE_FLEXIBILITY", 0);
        f2322a = enumC7514Dw0;
        EnumC7514Dw0 enumC7514Dw02 = new EnumC7514Dw0("NULLABLE", 1);
        f2323b = enumC7514Dw02;
        EnumC7514Dw0 enumC7514Dw03 = new EnumC7514Dw0("NOT_NULL", 2);
        f2324c = enumC7514Dw03;
        EnumC7514Dw0[] enumC7514Dw0Arr = {enumC7514Dw0, enumC7514Dw02, enumC7514Dw03};
        f2325d = enumC7514Dw0Arr;
        F02.m2482c(enumC7514Dw0Arr);
    }

    public static EnumC7514Dw0 valueOf(String str) {
        return (EnumC7514Dw0) Enum.valueOf(EnumC7514Dw0.class, str);
    }

    public static EnumC7514Dw0[] values() {
        return (EnumC7514Dw0[]) f2325d.clone();
    }
}
