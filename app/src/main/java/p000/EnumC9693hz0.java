package p000;

/* renamed from: hz0 */
/* loaded from: classes2.dex */
public final class EnumC9693hz0 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C7408Bv0 f28705b;

    /* renamed from: c */
    public static final EnumC9693hz0 f28706c;

    /* renamed from: d */
    public static final EnumC9693hz0 f28707d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC9693hz0[] f28708e;

    /* renamed from: a */
    public final String f28709a;

    static {
        EnumC9693hz0 enumC9693hz0 = new EnumC9693hz0("DEVICE", 0, "device");
        f28706c = enumC9693hz0;
        EnumC9693hz0 enumC9693hz02 = new EnumC9693hz0("PREVIEW", 1, "preview");
        f28707d = enumC9693hz02;
        EnumC9693hz0[] enumC9693hz0Arr = {enumC9693hz0, enumC9693hz02};
        f28708e = enumC9693hz0Arr;
        F02.m2482c(enumC9693hz0Arr);
        f28705b = new C7408Bv0(18);
    }

    public EnumC9693hz0(String str, int i, String str2) {
        super(str, i);
        this.f28709a = str2;
    }

    public static EnumC9693hz0 valueOf(String str) {
        return (EnumC9693hz0) Enum.valueOf(EnumC9693hz0.class, str);
    }

    public static EnumC9693hz0[] values() {
        return (EnumC9693hz0[]) f28708e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f28709a;
    }
}
