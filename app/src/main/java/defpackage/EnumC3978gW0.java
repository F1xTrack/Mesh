package defpackage;

/* renamed from: gW0 */
/* loaded from: classes2.dex */
public final class EnumC3978gW0 extends Enum {
    public static final EnumC3978gW0 a;
    public static final EnumC3978gW0 b;
    public static final EnumC3978gW0 c;
    public static final EnumC3978gW0 d;
    public static final /* synthetic */ EnumC3978gW0[] e;

    static {
        EnumC3978gW0 enumC3978gW0 = new EnumC3978gW0("DID_APPEAR", 0);
        a = enumC3978gW0;
        EnumC3978gW0 enumC3978gW02 = new EnumC3978gW0("WILL_APPEAR", 1);
        b = enumC3978gW02;
        EnumC3978gW0 enumC3978gW03 = new EnumC3978gW0("DID_DISAPPEAR", 2);
        c = enumC3978gW03;
        EnumC3978gW0 enumC3978gW04 = new EnumC3978gW0("WILL_DISAPPEAR", 3);
        d = enumC3978gW04;
        EnumC3978gW0[] enumC3978gW0Arr = {enumC3978gW0, enumC3978gW02, enumC3978gW03, enumC3978gW04};
        e = enumC3978gW0Arr;
        F02.c(enumC3978gW0Arr);
    }

    public static EnumC3978gW0 valueOf(String str) {
        return (EnumC3978gW0) Enum.valueOf(EnumC3978gW0.class, str);
    }

    public static EnumC3978gW0[] values() {
        return (EnumC3978gW0[]) e.clone();
    }
}
