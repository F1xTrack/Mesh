package defpackage;

/* renamed from: os0 */
/* loaded from: classes2.dex */
public final class EnumC6348os0 extends Enum {
    public static final C0318Dv0 a;
    public static final EnumC6348os0 b;
    public static final EnumC6348os0 c;
    public static final EnumC6348os0 d;
    public static final EnumC6348os0 e;
    public static final /* synthetic */ EnumC6348os0[] f;

    static {
        EnumC6348os0 enumC6348os0 = new EnumC6348os0("FINAL", 0);
        b = enumC6348os0;
        EnumC6348os0 enumC6348os02 = new EnumC6348os0("SEALED", 1);
        c = enumC6348os02;
        EnumC6348os0 enumC6348os03 = new EnumC6348os0("OPEN", 2);
        d = enumC6348os03;
        EnumC6348os0 enumC6348os04 = new EnumC6348os0("ABSTRACT", 3);
        e = enumC6348os04;
        EnumC6348os0[] enumC6348os0Arr = {enumC6348os0, enumC6348os02, enumC6348os03, enumC6348os04};
        f = enumC6348os0Arr;
        F02.c(enumC6348os0Arr);
        a = new C0318Dv0(17);
    }

    public static EnumC6348os0 valueOf(String str) {
        return (EnumC6348os0) Enum.valueOf(EnumC6348os0.class, str);
    }

    public static EnumC6348os0[] values() {
        return (EnumC6348os0[]) f.clone();
    }
}
