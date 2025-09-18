package defpackage;

/* renamed from: fh0 */
/* loaded from: classes.dex */
public final class EnumC3820fh0 extends Enum {
    public static final C0474Fv0 a;
    public static final EnumC3820fh0 b;
    public static final EnumC3820fh0 c;
    public static final EnumC3820fh0 d;
    public static final /* synthetic */ EnumC3820fh0[] e;

    static {
        EnumC3820fh0 enumC3820fh0 = new EnumC3820fh0("CREATE", 0);
        b = enumC3820fh0;
        EnumC3820fh0 enumC3820fh02 = new EnumC3820fh0("UPDATE", 1);
        c = enumC3820fh02;
        EnumC3820fh0 enumC3820fh03 = new EnumC3820fh0("DELETE", 2);
        d = enumC3820fh03;
        EnumC3820fh0[] enumC3820fh0Arr = {enumC3820fh0, enumC3820fh02, enumC3820fh03};
        e = enumC3820fh0Arr;
        F02.c(enumC3820fh0Arr);
        a = new C0474Fv0(16);
    }

    public static final String a(EnumC3820fh0 enumC3820fh0) {
        a.getClass();
        int iOrdinal = enumC3820fh0.ordinal();
        if (iOrdinal == 0) {
            return "create";
        }
        if (iOrdinal == 1) {
            return "update";
        }
        if (iOrdinal == 2) {
            return "delete";
        }
        throw new C7074sg();
    }

    public static EnumC3820fh0 valueOf(String str) {
        return (EnumC3820fh0) Enum.valueOf(EnumC3820fh0.class, str);
    }

    public static EnumC3820fh0[] values() {
        return (EnumC3820fh0[]) e.clone();
    }
}
