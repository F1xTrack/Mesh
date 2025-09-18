package defpackage;

/* renamed from: Ti1 */
/* loaded from: classes2.dex */
public final class EnumC1527Ti1 extends Enum implements InterfaceC0723Ja0 {
    public static final OL0 b;
    public static final EnumC1527Ti1 c;
    public static final EnumC1527Ti1 d;
    public static final /* synthetic */ EnumC1527Ti1[] e;
    public final String a;

    static {
        EnumC1527Ti1 enumC1527Ti1 = new EnumC1527Ti1("H264", 0, "h264");
        c = enumC1527Ti1;
        EnumC1527Ti1 enumC1527Ti12 = new EnumC1527Ti1("H265", 1, "h265");
        d = enumC1527Ti12;
        EnumC1527Ti1[] enumC1527Ti1Arr = {enumC1527Ti1, enumC1527Ti12};
        e = enumC1527Ti1Arr;
        F02.c(enumC1527Ti1Arr);
        b = new OL0(22);
    }

    public EnumC1527Ti1(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC1527Ti1 valueOf(String str) {
        return (EnumC1527Ti1) Enum.valueOf(EnumC1527Ti1.class, str);
    }

    public static EnumC1527Ti1[] values() {
        return (EnumC1527Ti1[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
