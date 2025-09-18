package p000;

/* renamed from: vj1 */
/* loaded from: classes2.dex */
public final class EnumC11454vj1 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C6914tt f44505b;

    /* renamed from: c */
    public static final EnumC11454vj1 f44506c;

    /* renamed from: d */
    public static final EnumC11454vj1 f44507d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC11454vj1[] f44508e;

    /* renamed from: a */
    public final String f44509a;

    static {
        EnumC11454vj1 enumC11454vj1 = new EnumC11454vj1("MOV", 0, "mov");
        f44506c = enumC11454vj1;
        EnumC11454vj1 enumC11454vj12 = new EnumC11454vj1("MP4", 1, "mp4");
        f44507d = enumC11454vj12;
        EnumC11454vj1[] enumC11454vj1Arr = {enumC11454vj1, enumC11454vj12};
        f44508e = enumC11454vj1Arr;
        F02.m2482c(enumC11454vj1Arr);
        f44505b = new C6914tt(23);
    }

    public EnumC11454vj1(String str, int i, String str2) {
        super(str, i);
        this.f44509a = str2;
    }

    public static EnumC11454vj1 valueOf(String str) {
        return (EnumC11454vj1) Enum.valueOf(EnumC11454vj1.class, str);
    }

    public static EnumC11454vj1[] values() {
        return (EnumC11454vj1[]) f44508e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f44509a;
    }
}
