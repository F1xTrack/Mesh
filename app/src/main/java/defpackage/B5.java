package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class B5 {
    public static final B5 b;
    public static final B5 c;
    public static final B5 d;
    public static final B5 e;
    public static final B5 f;
    public static final /* synthetic */ B5[] g;
    public final String a;

    static {
        B5 b5 = new B5("METHOD_RETURN_TYPE", 0, "METHOD");
        b = b5;
        B5 b52 = new B5("VALUE_PARAMETER", 1, "PARAMETER");
        c = b52;
        B5 b53 = new B5("FIELD", 2, "FIELD");
        d = b53;
        B5 b54 = new B5("TYPE_USE", 3, "TYPE_USE");
        e = b54;
        B5 b55 = new B5("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        f = b55;
        B5[] b5Arr = {b5, b52, b53, b54, b55, new B5("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
        g = b5Arr;
        F02.c(b5Arr);
    }

    public B5(String str, int i, String str2) {
        this.a = str2;
    }

    public static B5 valueOf(String str) {
        return (B5) Enum.valueOf(B5.class, str);
    }

    public static B5[] values() {
        return (B5[]) g.clone();
    }
}
