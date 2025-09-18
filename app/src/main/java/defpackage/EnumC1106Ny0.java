package defpackage;

/* renamed from: Ny0 */
/* loaded from: classes2.dex */
public final class EnumC1106Ny0 extends Enum implements InterfaceC0723Ja0 {
    public static final C0084Av0 b;
    public static final EnumC1106Ny0 c;
    public static final EnumC1106Ny0 d;
    public static final EnumC1106Ny0 e;
    public static final EnumC1106Ny0 f;
    public static final /* synthetic */ EnumC1106Ny0[] g;
    public final String a;

    static {
        EnumC1106Ny0 enumC1106Ny0 = new EnumC1106Ny0("PORTRAIT", 0, "portrait");
        c = enumC1106Ny0;
        EnumC1106Ny0 enumC1106Ny02 = new EnumC1106Ny0("LANDSCAPE_RIGHT", 1, "landscape-right");
        d = enumC1106Ny02;
        EnumC1106Ny0 enumC1106Ny03 = new EnumC1106Ny0("PORTRAIT_UPSIDE_DOWN", 2, "portrait-upside-down");
        e = enumC1106Ny03;
        EnumC1106Ny0 enumC1106Ny04 = new EnumC1106Ny0("LANDSCAPE_LEFT", 3, "landscape-left");
        f = enumC1106Ny04;
        EnumC1106Ny0[] enumC1106Ny0Arr = {enumC1106Ny0, enumC1106Ny02, enumC1106Ny03, enumC1106Ny04};
        g = enumC1106Ny0Arr;
        F02.c(enumC1106Ny0Arr);
        b = new C0084Av0(18);
    }

    public EnumC1106Ny0(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC1106Ny0 valueOf(String str) {
        return (EnumC1106Ny0) Enum.valueOf(EnumC1106Ny0.class, str);
    }

    public static EnumC1106Ny0[] values() {
        return (EnumC1106Ny0[]) g.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
