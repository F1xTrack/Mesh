package p000;

/* renamed from: Ny0 */
/* loaded from: classes2.dex */
public final class EnumC8038Ny0 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C7356Av0 f8146b;

    /* renamed from: c */
    public static final EnumC8038Ny0 f8147c;

    /* renamed from: d */
    public static final EnumC8038Ny0 f8148d;

    /* renamed from: e */
    public static final EnumC8038Ny0 f8149e;

    /* renamed from: f */
    public static final EnumC8038Ny0 f8150f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC8038Ny0[] f8151g;

    /* renamed from: a */
    public final String f8152a;

    static {
        EnumC8038Ny0 enumC8038Ny0 = new EnumC8038Ny0("PORTRAIT", 0, "portrait");
        f8147c = enumC8038Ny0;
        EnumC8038Ny0 enumC8038Ny02 = new EnumC8038Ny0("LANDSCAPE_RIGHT", 1, "landscape-right");
        f8148d = enumC8038Ny02;
        EnumC8038Ny0 enumC8038Ny03 = new EnumC8038Ny0("PORTRAIT_UPSIDE_DOWN", 2, "portrait-upside-down");
        f8149e = enumC8038Ny03;
        EnumC8038Ny0 enumC8038Ny04 = new EnumC8038Ny0("LANDSCAPE_LEFT", 3, "landscape-left");
        f8150f = enumC8038Ny04;
        EnumC8038Ny0[] enumC8038Ny0Arr = {enumC8038Ny0, enumC8038Ny02, enumC8038Ny03, enumC8038Ny04};
        f8151g = enumC8038Ny0Arr;
        F02.m2482c(enumC8038Ny0Arr);
        f8146b = new C7356Av0(18);
    }

    public EnumC8038Ny0(String str, int i, String str2) {
        super(str, i);
        this.f8152a = str2;
    }

    public static EnumC8038Ny0 valueOf(String str) {
        return (EnumC8038Ny0) Enum.valueOf(EnumC8038Ny0.class, str);
    }

    public static EnumC8038Ny0[] values() {
        return (EnumC8038Ny0[]) f8151g.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f8152a;
    }
}
