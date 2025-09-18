package defpackage;

/* renamed from: hz0 */
/* loaded from: classes2.dex */
public final class EnumC4256hz0 extends Enum implements InterfaceC0723Ja0 {
    public static final C0162Bv0 b;
    public static final EnumC4256hz0 c;
    public static final EnumC4256hz0 d;
    public static final /* synthetic */ EnumC4256hz0[] e;
    public final String a;

    static {
        EnumC4256hz0 enumC4256hz0 = new EnumC4256hz0("DEVICE", 0, "device");
        c = enumC4256hz0;
        EnumC4256hz0 enumC4256hz02 = new EnumC4256hz0("PREVIEW", 1, "preview");
        d = enumC4256hz02;
        EnumC4256hz0[] enumC4256hz0Arr = {enumC4256hz0, enumC4256hz02};
        e = enumC4256hz0Arr;
        F02.c(enumC4256hz0Arr);
        b = new C0162Bv0(18);
    }

    public EnumC4256hz0(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC4256hz0 valueOf(String str) {
        return (EnumC4256hz0) Enum.valueOf(EnumC4256hz0.class, str);
    }

    public static EnumC4256hz0[] values() {
        return (EnumC4256hz0[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
