package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A {
    public static final A a;
    public static final A b;
    public static final A c;
    public static final /* synthetic */ A[] d;

    static {
        A a2 = new A("PROPERTY", 0);
        a = a2;
        A a3 = new A("BACKING_FIELD", 1);
        b = a3;
        A a4 = new A("DELEGATE_FIELD", 2);
        c = a4;
        A[] aArr = {a2, a3, a4};
        d = aArr;
        F02.c(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) d.clone();
    }
}
