package p000;

/* renamed from: gi1 */
/* loaded from: classes2.dex */
public final class EnumC9532gi1 extends Enum {

    /* renamed from: c */
    public static final EnumC9532gi1 f27947c;

    /* renamed from: d */
    public static final EnumC9532gi1 f27948d;

    /* renamed from: e */
    public static final EnumC9532gi1 f27949e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC9532gi1[] f27950f;

    /* renamed from: a */
    public final String f27951a;

    /* renamed from: b */
    public final boolean f27952b;

    static {
        EnumC9532gi1 enumC9532gi1 = new EnumC9532gi1("INVARIANT", "", 0, true);
        f27947c = enumC9532gi1;
        EnumC9532gi1 enumC9532gi12 = new EnumC9532gi1("IN_VARIANCE", "in", 1, false);
        f27948d = enumC9532gi12;
        EnumC9532gi1 enumC9532gi13 = new EnumC9532gi1("OUT_VARIANCE", "out", 2, true);
        f27949e = enumC9532gi13;
        EnumC9532gi1[] enumC9532gi1Arr = {enumC9532gi1, enumC9532gi12, enumC9532gi13};
        f27950f = enumC9532gi1Arr;
        F02.m2482c(enumC9532gi1Arr);
    }

    public EnumC9532gi1(String str, String str2, int i, boolean z) {
        super(str, i);
        this.f27951a = str2;
        this.f27952b = z;
    }

    public static EnumC9532gi1 valueOf(String str) {
        return (EnumC9532gi1) Enum.valueOf(EnumC9532gi1.class, str);
    }

    public static EnumC9532gi1[] values() {
        return (EnumC9532gi1[]) f27950f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27951a;
    }
}
