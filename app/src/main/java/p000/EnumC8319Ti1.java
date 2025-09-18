package p000;

/* renamed from: Ti1 */
/* loaded from: classes2.dex */
public final class EnumC8319Ti1 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final OL0 f11475b;

    /* renamed from: c */
    public static final EnumC8319Ti1 f11476c;

    /* renamed from: d */
    public static final EnumC8319Ti1 f11477d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC8319Ti1[] f11478e;

    /* renamed from: a */
    public final String f11479a;

    static {
        EnumC8319Ti1 enumC8319Ti1 = new EnumC8319Ti1("H264", 0, "h264");
        f11476c = enumC8319Ti1;
        EnumC8319Ti1 enumC8319Ti12 = new EnumC8319Ti1("H265", 1, "h265");
        f11477d = enumC8319Ti12;
        EnumC8319Ti1[] enumC8319Ti1Arr = {enumC8319Ti1, enumC8319Ti12};
        f11478e = enumC8319Ti1Arr;
        F02.m2482c(enumC8319Ti1Arr);
        f11475b = new OL0(22);
    }

    public EnumC8319Ti1(String str, int i, String str2) {
        super(str, i);
        this.f11479a = str2;
    }

    public static EnumC8319Ti1 valueOf(String str) {
        return (EnumC8319Ti1) Enum.valueOf(EnumC8319Ti1.class, str);
    }

    public static EnumC8319Ti1[] values() {
        return (EnumC8319Ti1[]) f11478e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f11479a;
    }
}
