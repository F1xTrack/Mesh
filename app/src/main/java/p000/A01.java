package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A01 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final A01 f5b;

    /* renamed from: c */
    public static final A01 f6c;

    /* renamed from: d */
    public static final /* synthetic */ A01[] f7d;

    /* renamed from: a */
    public final String f8a;

    static {
        A01 a01 = new A01("PHOTO", 0, "photo");
        f5b = a01;
        A01 a012 = new A01("SNAPSHOT", 1, "snapshot");
        f6c = a012;
        A01[] a01Arr = {a01, a012};
        f7d = a01Arr;
        F02.m2482c(a01Arr);
    }

    public A01(String str, int i, String str2) {
        this.f8a = str2;
    }

    public static A01 valueOf(String str) {
        return (A01) Enum.valueOf(A01.class, str);
    }

    public static A01[] values() {
        return (A01[]) f7d.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f8a;
    }
}
