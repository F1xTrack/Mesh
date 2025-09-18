package defpackage;

/* renamed from: wb1 */
/* loaded from: classes.dex */
public final class EnumC7824wb1 extends Enum {
    public static final C3759fN b;
    public static final EnumC7824wb1 c;
    public static final EnumC7824wb1 d;
    public static final EnumC7824wb1 e;
    public static final EnumC7824wb1 f;
    public static final /* synthetic */ EnumC7824wb1[] g;
    public final String a;

    static {
        EnumC7824wb1 enumC7824wb1 = new EnumC7824wb1("START", 0, "topTouchStart");
        c = enumC7824wb1;
        EnumC7824wb1 enumC7824wb12 = new EnumC7824wb1("END", 1, "topTouchEnd");
        d = enumC7824wb12;
        EnumC7824wb1 enumC7824wb13 = new EnumC7824wb1("MOVE", 2, "topTouchMove");
        e = enumC7824wb13;
        EnumC7824wb1 enumC7824wb14 = new EnumC7824wb1("CANCEL", 3, "topTouchCancel");
        f = enumC7824wb14;
        EnumC7824wb1[] enumC7824wb1Arr = {enumC7824wb1, enumC7824wb12, enumC7824wb13, enumC7824wb14};
        g = enumC7824wb1Arr;
        F02.c(enumC7824wb1Arr);
        b = new C3759fN(22);
    }

    public EnumC7824wb1(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC7824wb1 valueOf(String str) {
        return (EnumC7824wb1) Enum.valueOf(EnumC7824wb1.class, str);
    }

    public static EnumC7824wb1[] values() {
        return (EnumC7824wb1[]) g.clone();
    }
}
