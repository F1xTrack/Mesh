package defpackage;

/* renamed from: vj1 */
/* loaded from: classes2.dex */
public final class EnumC7658vj1 extends Enum implements InterfaceC0723Ja0 {
    public static final C7304tt b;
    public static final EnumC7658vj1 c;
    public static final EnumC7658vj1 d;
    public static final /* synthetic */ EnumC7658vj1[] e;
    public final String a;

    static {
        EnumC7658vj1 enumC7658vj1 = new EnumC7658vj1("MOV", 0, "mov");
        c = enumC7658vj1;
        EnumC7658vj1 enumC7658vj12 = new EnumC7658vj1("MP4", 1, "mp4");
        d = enumC7658vj12;
        EnumC7658vj1[] enumC7658vj1Arr = {enumC7658vj1, enumC7658vj12};
        e = enumC7658vj1Arr;
        F02.c(enumC7658vj1Arr);
        b = new C7304tt(23);
    }

    public EnumC7658vj1(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC7658vj1 valueOf(String str) {
        return (EnumC7658vj1) Enum.valueOf(EnumC7658vj1.class, str);
    }

    public static EnumC7658vj1[] values() {
        return (EnumC7658vj1[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
