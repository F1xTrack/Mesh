package defpackage;

/* renamed from: nC0 */
/* loaded from: classes2.dex */
public final class EnumC6031nC0 extends Enum implements InterfaceC0723Ja0 {
    public static final C7304tt b;
    public static final EnumC6031nC0 c;
    public static final EnumC6031nC0 d;
    public static final EnumC6031nC0 e;
    public static final /* synthetic */ EnumC6031nC0[] f;
    public final String a;

    static {
        EnumC6031nC0 enumC6031nC0 = new EnumC6031nC0("BACK", 0, "back");
        c = enumC6031nC0;
        EnumC6031nC0 enumC6031nC02 = new EnumC6031nC0("FRONT", 1, "front");
        d = enumC6031nC02;
        EnumC6031nC0 enumC6031nC03 = new EnumC6031nC0("EXTERNAL", 2, "external");
        e = enumC6031nC03;
        EnumC6031nC0[] enumC6031nC0Arr = {enumC6031nC0, enumC6031nC02, enumC6031nC03};
        f = enumC6031nC0Arr;
        F02.c(enumC6031nC0Arr);
        b = new C7304tt(19);
    }

    public EnumC6031nC0(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC6031nC0 valueOf(String str) {
        return (EnumC6031nC0) Enum.valueOf(EnumC6031nC0.class, str);
    }

    public static EnumC6031nC0[] values() {
        return (EnumC6031nC0[]) f.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
