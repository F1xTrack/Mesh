package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: aW */
/* loaded from: classes2.dex */
public final class EnumC1669aW implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C7460Cv0 f15542b;

    /* renamed from: c */
    public static final EnumC1669aW f15543c;

    /* renamed from: d */
    public static final EnumC1669aW f15544d;

    /* renamed from: e */
    public static final EnumC1669aW f15545e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC1669aW[] f15546f;

    /* renamed from: a */
    public final String f15547a;

    static {
        EnumC1669aW enumC1669aW = new EnumC1669aW("OFF", 0, "off");
        f15543c = enumC1669aW;
        EnumC1669aW enumC1669aW2 = new EnumC1669aW("ON", 1, "on");
        f15544d = enumC1669aW2;
        EnumC1669aW enumC1669aW3 = new EnumC1669aW("AUTO", 2, "auto");
        f15545e = enumC1669aW3;
        EnumC1669aW[] enumC1669aWArr = {enumC1669aW, enumC1669aW2, enumC1669aW3};
        f15546f = enumC1669aWArr;
        F02.m2482c(enumC1669aWArr);
        f15542b = new C7460Cv0(14);
    }

    public EnumC1669aW(String str, int i, String str2) {
        this.f15547a = str2;
    }

    public static EnumC1669aW valueOf(String str) {
        return (EnumC1669aW) Enum.valueOf(EnumC1669aW.class, str);
    }

    public static EnumC1669aW[] values() {
        return (EnumC1669aW[]) f15546f.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f15547a;
    }
}
