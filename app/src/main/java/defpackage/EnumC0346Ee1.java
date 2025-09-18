package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ee1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0346Ee1 {
    public static final EnumC0346Ee1 b;
    public static final EnumC0346Ee1 c;
    public static final EnumC0346Ee1 d;
    public static final /* synthetic */ EnumC0346Ee1[] e;
    public final String a;

    static {
        EnumC0346Ee1 enumC0346Ee1 = new EnumC0346Ee1("IN", 0, "in");
        b = enumC0346Ee1;
        EnumC0346Ee1 enumC0346Ee12 = new EnumC0346Ee1("OUT", 1, "out");
        c = enumC0346Ee12;
        EnumC0346Ee1 enumC0346Ee13 = new EnumC0346Ee1("INV", 2, "");
        d = enumC0346Ee13;
        EnumC0346Ee1[] enumC0346Ee1Arr = {enumC0346Ee1, enumC0346Ee12, enumC0346Ee13};
        e = enumC0346Ee1Arr;
        F02.c(enumC0346Ee1Arr);
    }

    public EnumC0346Ee1(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC0346Ee1 valueOf(String str) {
        return (EnumC0346Ee1) Enum.valueOf(EnumC0346Ee1.class, str);
    }

    public static EnumC0346Ee1[] values() {
        return (EnumC0346Ee1[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
