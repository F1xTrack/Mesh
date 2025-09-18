package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class E5 {
    public static final E5 b;
    public static final E5 c;
    public static final E5 d;
    public static final E5 e;
    public static final E5 f;
    public static final E5 g;
    public static final E5 h;
    public static final E5 i;
    public static final E5 j;
    public static final /* synthetic */ E5[] k;
    public final String a;

    static {
        E5 e5 = new E5("FIELD", 0, null);
        b = e5;
        E5 e52 = new E5("FILE", 1, null);
        c = e52;
        E5 e53 = new E5("PROPERTY", 2, null);
        d = e53;
        E5 e54 = new E5("PROPERTY_GETTER", 3, "get");
        e = e54;
        E5 e55 = new E5("PROPERTY_SETTER", 4, "set");
        f = e55;
        E5 e56 = new E5("RECEIVER", 5, null);
        g = e56;
        E5 e57 = new E5("CONSTRUCTOR_PARAMETER", 6, RemoteMessageConst.MessageBody.PARAM);
        h = e57;
        E5 e58 = new E5("SETTER_PARAMETER", 7, "setparam");
        i = e58;
        E5 e59 = new E5("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        j = e59;
        E5[] e5Arr = {e5, e52, e53, e54, e55, e56, e57, e58, e59};
        k = e5Arr;
        F02.c(e5Arr);
    }

    public E5(String str, int i2, String str2) {
        this.a = str2 == null ? AbstractC3585eS1.e(name()) : str2;
    }

    public static E5 valueOf(String str) {
        return (E5) Enum.valueOf(E5.class, str);
    }

    public static E5[] values() {
        return (E5[]) k.clone();
    }
}
