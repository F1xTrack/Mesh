package p000;

/* renamed from: gW0 */
/* loaded from: classes2.dex */
public final class EnumC9507gW0 extends Enum {

    /* renamed from: a */
    public static final EnumC9507gW0 f27822a;

    /* renamed from: b */
    public static final EnumC9507gW0 f27823b;

    /* renamed from: c */
    public static final EnumC9507gW0 f27824c;

    /* renamed from: d */
    public static final EnumC9507gW0 f27825d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC9507gW0[] f27826e;

    static {
        EnumC9507gW0 enumC9507gW0 = new EnumC9507gW0("DID_APPEAR", 0);
        f27822a = enumC9507gW0;
        EnumC9507gW0 enumC9507gW02 = new EnumC9507gW0("WILL_APPEAR", 1);
        f27823b = enumC9507gW02;
        EnumC9507gW0 enumC9507gW03 = new EnumC9507gW0("DID_DISAPPEAR", 2);
        f27824c = enumC9507gW03;
        EnumC9507gW0 enumC9507gW04 = new EnumC9507gW0("WILL_DISAPPEAR", 3);
        f27825d = enumC9507gW04;
        EnumC9507gW0[] enumC9507gW0Arr = {enumC9507gW0, enumC9507gW02, enumC9507gW03, enumC9507gW04};
        f27826e = enumC9507gW0Arr;
        F02.m2482c(enumC9507gW0Arr);
    }

    public static EnumC9507gW0 valueOf(String str) {
        return (EnumC9507gW0) Enum.valueOf(EnumC9507gW0.class, str);
    }

    public static EnumC9507gW0[] values() {
        return (EnumC9507gW0[]) f27826e.clone();
    }
}
