package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ee1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7531Ee1 {

    /* renamed from: b */
    public static final EnumC7531Ee1 f2819b;

    /* renamed from: c */
    public static final EnumC7531Ee1 f2820c;

    /* renamed from: d */
    public static final EnumC7531Ee1 f2821d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC7531Ee1[] f2822e;

    /* renamed from: a */
    public final String f2823a;

    static {
        EnumC7531Ee1 enumC7531Ee1 = new EnumC7531Ee1("IN", 0, "in");
        f2819b = enumC7531Ee1;
        EnumC7531Ee1 enumC7531Ee12 = new EnumC7531Ee1("OUT", 1, "out");
        f2820c = enumC7531Ee12;
        EnumC7531Ee1 enumC7531Ee13 = new EnumC7531Ee1("INV", 2, "");
        f2821d = enumC7531Ee13;
        EnumC7531Ee1[] enumC7531Ee1Arr = {enumC7531Ee1, enumC7531Ee12, enumC7531Ee13};
        f2822e = enumC7531Ee1Arr;
        F02.m2482c(enumC7531Ee1Arr);
    }

    public EnumC7531Ee1(String str, int i, String str2) {
        this.f2823a = str2;
    }

    public static EnumC7531Ee1 valueOf(String str) {
        return (EnumC7531Ee1) Enum.valueOf(EnumC7531Ee1.class, str);
    }

    public static EnumC7531Ee1[] values() {
        return (EnumC7531Ee1[]) f2822e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2823a;
    }
}
