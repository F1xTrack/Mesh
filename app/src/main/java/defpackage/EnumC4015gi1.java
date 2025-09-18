package defpackage;

/* renamed from: gi1 */
/* loaded from: classes2.dex */
public final class EnumC4015gi1 extends Enum {
    public static final EnumC4015gi1 c;
    public static final EnumC4015gi1 d;
    public static final EnumC4015gi1 e;
    public static final /* synthetic */ EnumC4015gi1[] f;
    public final String a;
    public final boolean b;

    static {
        EnumC4015gi1 enumC4015gi1 = new EnumC4015gi1("INVARIANT", "", 0, true);
        c = enumC4015gi1;
        EnumC4015gi1 enumC4015gi12 = new EnumC4015gi1("IN_VARIANCE", "in", 1, false);
        d = enumC4015gi12;
        EnumC4015gi1 enumC4015gi13 = new EnumC4015gi1("OUT_VARIANCE", "out", 2, true);
        e = enumC4015gi13;
        EnumC4015gi1[] enumC4015gi1Arr = {enumC4015gi1, enumC4015gi12, enumC4015gi13};
        f = enumC4015gi1Arr;
        F02.c(enumC4015gi1Arr);
    }

    public EnumC4015gi1(String str, String str2, int i, boolean z) {
        super(str, i);
        this.a = str2;
        this.b = z;
    }

    public static EnumC4015gi1 valueOf(String str) {
        return (EnumC4015gi1) Enum.valueOf(EnumC4015gi1.class, str);
    }

    public static EnumC4015gi1[] values() {
        return (EnumC4015gi1[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
