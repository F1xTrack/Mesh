package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B5 */
/* loaded from: classes2.dex */
public final class EnumC0069B5 {

    /* renamed from: b */
    public static final EnumC0069B5 f553b;

    /* renamed from: c */
    public static final EnumC0069B5 f554c;

    /* renamed from: d */
    public static final EnumC0069B5 f555d;

    /* renamed from: e */
    public static final EnumC0069B5 f556e;

    /* renamed from: f */
    public static final EnumC0069B5 f557f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0069B5[] f558g;

    /* renamed from: a */
    public final String f559a;

    static {
        EnumC0069B5 enumC0069B5 = new EnumC0069B5("METHOD_RETURN_TYPE", 0, "METHOD");
        f553b = enumC0069B5;
        EnumC0069B5 enumC0069B52 = new EnumC0069B5("VALUE_PARAMETER", 1, "PARAMETER");
        f554c = enumC0069B52;
        EnumC0069B5 enumC0069B53 = new EnumC0069B5("FIELD", 2, "FIELD");
        f555d = enumC0069B53;
        EnumC0069B5 enumC0069B54 = new EnumC0069B5("TYPE_USE", 3, "TYPE_USE");
        f556e = enumC0069B54;
        EnumC0069B5 enumC0069B55 = new EnumC0069B5("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        f557f = enumC0069B55;
        EnumC0069B5[] enumC0069B5Arr = {enumC0069B5, enumC0069B52, enumC0069B53, enumC0069B54, enumC0069B55, new EnumC0069B5("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
        f558g = enumC0069B5Arr;
        F02.m2482c(enumC0069B5Arr);
    }

    public EnumC0069B5(String str, int i, String str2) {
        this.f559a = str2;
    }

    public static EnumC0069B5 valueOf(String str) {
        return (EnumC0069B5) Enum.valueOf(EnumC0069B5.class, str);
    }

    public static EnumC0069B5[] values() {
        return (EnumC0069B5[]) f558g.clone();
    }
}
