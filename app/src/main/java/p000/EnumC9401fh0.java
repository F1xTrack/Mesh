package p000;

/* renamed from: fh0 */
/* loaded from: classes.dex */
public final class EnumC9401fh0 extends Enum {

    /* renamed from: a */
    public static final C7616Fv0 f27327a;

    /* renamed from: b */
    public static final EnumC9401fh0 f27328b;

    /* renamed from: c */
    public static final EnumC9401fh0 f27329c;

    /* renamed from: d */
    public static final EnumC9401fh0 f27330d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC9401fh0[] f27331e;

    static {
        EnumC9401fh0 enumC9401fh0 = new EnumC9401fh0("CREATE", 0);
        f27328b = enumC9401fh0;
        EnumC9401fh0 enumC9401fh02 = new EnumC9401fh0("UPDATE", 1);
        f27329c = enumC9401fh02;
        EnumC9401fh0 enumC9401fh03 = new EnumC9401fh0("DELETE", 2);
        f27330d = enumC9401fh03;
        EnumC9401fh0[] enumC9401fh0Arr = {enumC9401fh0, enumC9401fh02, enumC9401fh03};
        f27331e = enumC9401fh0Arr;
        F02.m2482c(enumC9401fh0Arr);
        f27327a = new C7616Fv0(16);
    }

    /* renamed from: a */
    public static final String m18266a(EnumC9401fh0 enumC9401fh0) {
        f27327a.getClass();
        int iOrdinal = enumC9401fh0.ordinal();
        if (iOrdinal == 0) {
            return "create";
        }
        if (iOrdinal == 1) {
            return "update";
        }
        if (iOrdinal == 2) {
            return "delete";
        }
        throw new C6838sg();
    }

    public static EnumC9401fh0 valueOf(String str) {
        return (EnumC9401fh0) Enum.valueOf(EnumC9401fh0.class, str);
    }

    public static EnumC9401fh0[] values() {
        return (EnumC9401fh0[]) f27331e.clone();
    }
}
