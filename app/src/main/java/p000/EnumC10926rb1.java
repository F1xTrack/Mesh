package p000;

/* renamed from: rb1 */
/* loaded from: classes2.dex */
public final class EnumC10926rb1 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C1210TE f41745b;

    /* renamed from: c */
    public static final EnumC10926rb1 f41746c;

    /* renamed from: d */
    public static final EnumC10926rb1 f41747d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC10926rb1[] f41748e;

    /* renamed from: a */
    public final String f41749a;

    static {
        EnumC10926rb1 enumC10926rb1 = new EnumC10926rb1("OFF", 0, "off");
        f41746c = enumC10926rb1;
        EnumC10926rb1 enumC10926rb12 = new EnumC10926rb1("ON", 1, "on");
        f41747d = enumC10926rb12;
        EnumC10926rb1[] enumC10926rb1Arr = {enumC10926rb1, enumC10926rb12};
        f41748e = enumC10926rb1Arr;
        F02.m2482c(enumC10926rb1Arr);
        f41745b = new C1210TE(22);
    }

    public EnumC10926rb1(String str, int i, String str2) {
        super(str, i);
        this.f41749a = str2;
    }

    public static EnumC10926rb1 valueOf(String str) {
        return (EnumC10926rb1) Enum.valueOf(EnumC10926rb1.class, str);
    }

    public static EnumC10926rb1[] values() {
        return (EnumC10926rb1[]) f41748e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f41749a;
    }
}
