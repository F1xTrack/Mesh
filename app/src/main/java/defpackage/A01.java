package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A01 implements InterfaceC0723Ja0 {
    public static final A01 b;
    public static final A01 c;
    public static final /* synthetic */ A01[] d;
    public final String a;

    static {
        A01 a01 = new A01("PHOTO", 0, "photo");
        b = a01;
        A01 a012 = new A01("SNAPSHOT", 1, "snapshot");
        c = a012;
        A01[] a01Arr = {a01, a012};
        d = a01Arr;
        F02.c(a01Arr);
    }

    public A01(String str, int i, String str2) {
        this.a = str2;
    }

    public static A01 valueOf(String str) {
        return (A01) Enum.valueOf(A01.class, str);
    }

    public static A01[] values() {
        return (A01[]) d.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
