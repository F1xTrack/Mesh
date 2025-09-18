package p000;


/* renamed from: Ob */
/* loaded from: classes2.dex */
public final class EnumC0919Ob extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C4049fN f8507b;

    /* renamed from: c */
    public static final EnumC0919Ob f8508c;

    /* renamed from: d */
    public static final EnumC0919Ob f8509d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC0919Ob[] f8510e;

    /* renamed from: a */
    public final String f8511a;

    static {
        EnumC0919Ob enumC0919Ob = new EnumC0919Ob("CONTRAST_DETECTION", 0, "contrast-detection");
        f8508c = enumC0919Ob;
        EnumC0919Ob enumC0919Ob2 = new EnumC0919Ob("NONE", 1, LocalNotification.Importance.NONE);
        f8509d = enumC0919Ob2;
        EnumC0919Ob[] enumC0919ObArr = {enumC0919Ob, enumC0919Ob2};
        f8510e = enumC0919ObArr;
        F02.m2482c(enumC0919ObArr);
        f8507b = new C4049fN(8);
    }

    public EnumC0919Ob(String str, int i, String str2) {
        super(str, i);
        this.f8511a = str2;
    }

    public static EnumC0919Ob valueOf(String str) {
        return (EnumC0919Ob) Enum.valueOf(EnumC0919Ob.class, str);
    }

    public static EnumC0919Ob[] values() {
        return (EnumC0919Ob[]) f8510e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f8511a;
    }
}
