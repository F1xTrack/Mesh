package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: A */
/* loaded from: classes2.dex */
public final class EnumC0000A {

    /* renamed from: a */
    public static final EnumC0000A f0a;

    /* renamed from: b */
    public static final EnumC0000A f1b;

    /* renamed from: c */
    public static final EnumC0000A f2c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC0000A[] f3d;

    static {
        EnumC0000A enumC0000A = new EnumC0000A("PROPERTY", 0);
        f0a = enumC0000A;
        EnumC0000A enumC0000A2 = new EnumC0000A("BACKING_FIELD", 1);
        f1b = enumC0000A2;
        EnumC0000A enumC0000A3 = new EnumC0000A("DELEGATE_FIELD", 2);
        f2c = enumC0000A3;
        EnumC0000A[] enumC0000AArr = {enumC0000A, enumC0000A2, enumC0000A3};
        f3d = enumC0000AArr;
        F02.m2482c(enumC0000AArr);
    }

    public static EnumC0000A valueOf(String str) {
        return (EnumC0000A) Enum.valueOf(EnumC0000A.class, str);
    }

    public static EnumC0000A[] values() {
        return (EnumC0000A[]) f3d.clone();
    }
}
