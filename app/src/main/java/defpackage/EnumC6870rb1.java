package defpackage;

/* renamed from: rb1 */
/* loaded from: classes2.dex */
public final class EnumC6870rb1 extends Enum implements InterfaceC0723Ja0 {
    public static final TE b;
    public static final EnumC6870rb1 c;
    public static final EnumC6870rb1 d;
    public static final /* synthetic */ EnumC6870rb1[] e;
    public final String a;

    static {
        EnumC6870rb1 enumC6870rb1 = new EnumC6870rb1("OFF", 0, "off");
        c = enumC6870rb1;
        EnumC6870rb1 enumC6870rb12 = new EnumC6870rb1("ON", 1, "on");
        d = enumC6870rb12;
        EnumC6870rb1[] enumC6870rb1Arr = {enumC6870rb1, enumC6870rb12};
        e = enumC6870rb1Arr;
        F02.c(enumC6870rb1Arr);
        b = new TE(22);
    }

    public EnumC6870rb1(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC6870rb1 valueOf(String str) {
        return (EnumC6870rb1) Enum.valueOf(EnumC6870rb1.class, str);
    }

    public static EnumC6870rb1[] values() {
        return (EnumC6870rb1[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
