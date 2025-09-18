package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xJ */
/* loaded from: classes2.dex */
public final class EnumC7130xJ implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final EnumC7130xJ f45539b;

    /* renamed from: c */
    public static final EnumC7130xJ f45540c;

    /* renamed from: d */
    public static final EnumC7130xJ f45541d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC7130xJ[] f45542e;

    /* renamed from: a */
    public final String f45543a;

    static {
        EnumC7130xJ enumC7130xJ = new EnumC7130xJ("ULTRA_WIDE_ANGLE", 0, "ultra-wide-angle-camera");
        f45539b = enumC7130xJ;
        EnumC7130xJ enumC7130xJ2 = new EnumC7130xJ("WIDE_ANGLE", 1, "wide-angle-camera");
        f45540c = enumC7130xJ2;
        EnumC7130xJ enumC7130xJ3 = new EnumC7130xJ("TELEPHOTO", 2, "telephoto-camera");
        f45541d = enumC7130xJ3;
        EnumC7130xJ[] enumC7130xJArr = {enumC7130xJ, enumC7130xJ2, enumC7130xJ3};
        f45542e = enumC7130xJArr;
        F02.m2482c(enumC7130xJArr);
    }

    public EnumC7130xJ(String str, int i, String str2) {
        this.f45543a = str2;
    }

    public static EnumC7130xJ valueOf(String str) {
        return (EnumC7130xJ) Enum.valueOf(EnumC7130xJ.class, str);
    }

    public static EnumC7130xJ[] values() {
        return (EnumC7130xJ[]) f45542e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f45543a;
    }
}
