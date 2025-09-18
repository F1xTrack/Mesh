package p000;

/* renamed from: nC0 */
/* loaded from: classes2.dex */
public final class EnumC10363nC0 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C6914tt f38172b;

    /* renamed from: c */
    public static final EnumC10363nC0 f38173c;

    /* renamed from: d */
    public static final EnumC10363nC0 f38174d;

    /* renamed from: e */
    public static final EnumC10363nC0 f38175e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10363nC0[] f38176f;

    /* renamed from: a */
    public final String f38177a;

    static {
        EnumC10363nC0 enumC10363nC0 = new EnumC10363nC0("BACK", 0, "back");
        f38173c = enumC10363nC0;
        EnumC10363nC0 enumC10363nC02 = new EnumC10363nC0("FRONT", 1, "front");
        f38174d = enumC10363nC02;
        EnumC10363nC0 enumC10363nC03 = new EnumC10363nC0("EXTERNAL", 2, "external");
        f38175e = enumC10363nC03;
        EnumC10363nC0[] enumC10363nC0Arr = {enumC10363nC0, enumC10363nC02, enumC10363nC03};
        f38176f = enumC10363nC0Arr;
        F02.m2482c(enumC10363nC0Arr);
        f38172b = new C6914tt(19);
    }

    public EnumC10363nC0(String str, int i, String str2) {
        super(str, i);
        this.f38177a = str2;
    }

    public static EnumC10363nC0 valueOf(String str) {
        return (EnumC10363nC0) Enum.valueOf(EnumC10363nC0.class, str);
    }

    public static EnumC10363nC0[] values() {
        return (EnumC10363nC0[]) f38176f.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f38177a;
    }
}
